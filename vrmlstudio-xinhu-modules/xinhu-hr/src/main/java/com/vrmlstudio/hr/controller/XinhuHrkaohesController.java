package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuHrkaohes;
import com.vrmlstudio.hr.service.IXinhuHrkaohesService;
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
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 考核项目的内容Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/hrkaohes")
public class XinhuHrkaohesController extends BaseController
{
    @Autowired
    private IXinhuHrkaohesService xinhuHrkaohesService;

    /**
     * 查询考核项目的内容列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrkaohes:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuHrkaohes xinhuHrkaohes)
    {
        startPage();
        List<XinhuHrkaohes> list = xinhuHrkaohesService.selectXinhuHrkaohesList(xinhuHrkaohes);
        return getDataTable(list);
    }

    /**
     * 导出考核项目的内容列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrkaohes:export')")
    @Log(title = "考核项目的内容", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuHrkaohes xinhuHrkaohes)
    {
        List<XinhuHrkaohes> list = xinhuHrkaohesService.selectXinhuHrkaohesList(xinhuHrkaohes);
        ExcelUtil<XinhuHrkaohes> util = new ExcelUtil<XinhuHrkaohes>(XinhuHrkaohes.class);
        util.exportExcel(response, list, "考核项目的内容数据");
    }

    /**
     * 获取考核项目的内容详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrkaohes:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuHrkaohesService.selectXinhuHrkaohesById(id));
    }

    /**
     * 新增考核项目的内容
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrkaohes:add')")
    @Log(title = "考核项目的内容", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuHrkaohes xinhuHrkaohes)
    {
        return toAjax(xinhuHrkaohesService.insertXinhuHrkaohes(xinhuHrkaohes));
    }

    /**
     * 修改考核项目的内容
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrkaohes:edit')")
    @Log(title = "考核项目的内容", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuHrkaohes xinhuHrkaohes)
    {
        return toAjax(xinhuHrkaohesService.updateXinhuHrkaohes(xinhuHrkaohes));
    }

    /**
     * 删除考核项目的内容
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrkaohes:remove')")
    @Log(title = "考核项目的内容", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuHrkaohesService.deleteXinhuHrkaohesByIds(ids));
    }
}
