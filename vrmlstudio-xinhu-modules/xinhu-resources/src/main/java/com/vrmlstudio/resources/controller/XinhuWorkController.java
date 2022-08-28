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
import com.vrmlstudio.resources.domain.XinhuWork;
import com.vrmlstudio.resources.service.IXinhuWorkService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 任务Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-resources/work")
public class XinhuWorkController extends BaseController
{
    @Autowired
    private IXinhuWorkService xinhuWorkService;

    /**
     * 查询任务列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:work:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuWork xinhuWork)
    {
        startPage();
        List<XinhuWork> list = xinhuWorkService.selectXinhuWorkList(xinhuWork);
        return getDataTable(list);
    }

    /**
     * 导出任务列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:work:export')")
    @Log(title = "任务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuWork xinhuWork)
    {
        List<XinhuWork> list = xinhuWorkService.selectXinhuWorkList(xinhuWork);
        ExcelUtil<XinhuWork> util = new ExcelUtil<XinhuWork>(XinhuWork.class);
        util.exportExcel(response, list, "任务数据");
    }

    /**
     * 获取任务详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:work:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuWorkService.selectXinhuWorkById(id));
    }

    /**
     * 新增任务
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:work:add')")
    @Log(title = "任务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuWork xinhuWork)
    {
        return toAjax(xinhuWorkService.insertXinhuWork(xinhuWork));
    }

    /**
     * 修改任务
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:work:edit')")
    @Log(title = "任务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuWork xinhuWork)
    {
        return toAjax(xinhuWorkService.updateXinhuWork(xinhuWork));
    }

    /**
     * 删除任务
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:work:remove')")
    @Log(title = "任务", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuWorkService.deleteXinhuWorkByIds(ids));
    }
}
