package com.vrmlstudio.resources.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vrmlstudio.common.annotation.Log;
import com.vrmlstudio.common.core.controller.BaseController;
import com.vrmlstudio.common.core.domain.AjaxResult;
import com.vrmlstudio.common.enums.BusinessType;
import com.vrmlstudio.resources.domain.XinhuProject;
import com.vrmlstudio.resources.service.IXinhuProjectService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 项目Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-resources/project")
public class XinhuProjectController extends BaseController
{
    @Autowired
    private IXinhuProjectService xinhuProjectService;

    /**
     * 查询项目列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:project:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuProject xinhuProject)
    {
        startPage();
        List<XinhuProject> list = xinhuProjectService.selectXinhuProjectList(xinhuProject);
        return getDataTable(list);
    }

    /**
     * 导出项目列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:project:export')")
    @Log(title = "项目", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuProject xinhuProject)
    {
        List<XinhuProject> list = xinhuProjectService.selectXinhuProjectList(xinhuProject);
        ExcelUtil<XinhuProject> util = new ExcelUtil<XinhuProject>(XinhuProject.class);
        util.exportExcel(response, list, "项目数据");
    }

    /**
     * 获取项目详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:project:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuProjectService.selectXinhuProjectById(id));
    }

    /**
     * 新增项目
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:project:add')")
    @Log(title = "项目", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuProject xinhuProject)
    {
        return toAjax(xinhuProjectService.insertXinhuProject(xinhuProject));
    }

    /**
     * 修改项目
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:project:edit')")
    @Log(title = "项目", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuProject xinhuProject)
    {
        return toAjax(xinhuProjectService.updateXinhuProject(xinhuProject));
    }

    /**
     * 删除项目
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:project:remove')")
    @Log(title = "项目", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuProjectService.deleteXinhuProjectByIds(ids));
    }
}
