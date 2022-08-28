package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuHrchecks;
import com.vrmlstudio.hr.service.IXinhuHrchecksService;
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
 * 考评内容Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/hrchecks")
public class XinhuHrchecksController extends BaseController
{
    @Autowired
    private IXinhuHrchecksService xinhuHrchecksService;

    /**
     * 查询考评内容列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrchecks:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuHrchecks xinhuHrchecks)
    {
        startPage();
        List<XinhuHrchecks> list = xinhuHrchecksService.selectXinhuHrchecksList(xinhuHrchecks);
        return getDataTable(list);
    }

    /**
     * 导出考评内容列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrchecks:export')")
    @Log(title = "考评内容", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuHrchecks xinhuHrchecks)
    {
        List<XinhuHrchecks> list = xinhuHrchecksService.selectXinhuHrchecksList(xinhuHrchecks);
        ExcelUtil<XinhuHrchecks> util = new ExcelUtil<XinhuHrchecks>(XinhuHrchecks.class);
        util.exportExcel(response, list, "考评内容数据");
    }

    /**
     * 获取考评内容详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrchecks:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuHrchecksService.selectXinhuHrchecksById(id));
    }

    /**
     * 新增考评内容
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrchecks:add')")
    @Log(title = "考评内容", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuHrchecks xinhuHrchecks)
    {
        return toAjax(xinhuHrchecksService.insertXinhuHrchecks(xinhuHrchecks));
    }

    /**
     * 修改考评内容
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrchecks:edit')")
    @Log(title = "考评内容", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuHrchecks xinhuHrchecks)
    {
        return toAjax(xinhuHrchecksService.updateXinhuHrchecks(xinhuHrchecks));
    }

    /**
     * 删除考评内容
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrchecks:remove')")
    @Log(title = "考评内容", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuHrchecksService.deleteXinhuHrchecksByIds(ids));
    }
}
