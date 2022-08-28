package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuHrcheckn;
import com.vrmlstudio.hr.service.IXinhuHrchecknService;
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
 * 考核评分记录Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/hrcheckn")
public class XinhuHrchecknController extends BaseController
{
    @Autowired
    private IXinhuHrchecknService xinhuHrchecknService;

    /**
     * 查询考核评分记录列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrcheckn:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuHrcheckn xinhuHrcheckn)
    {
        startPage();
        List<XinhuHrcheckn> list = xinhuHrchecknService.selectXinhuHrchecknList(xinhuHrcheckn);
        return getDataTable(list);
    }

    /**
     * 导出考核评分记录列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrcheckn:export')")
    @Log(title = "考核评分记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuHrcheckn xinhuHrcheckn)
    {
        List<XinhuHrcheckn> list = xinhuHrchecknService.selectXinhuHrchecknList(xinhuHrcheckn);
        ExcelUtil<XinhuHrcheckn> util = new ExcelUtil<XinhuHrcheckn>(XinhuHrcheckn.class);
        util.exportExcel(response, list, "考核评分记录数据");
    }

    /**
     * 获取考核评分记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrcheckn:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuHrchecknService.selectXinhuHrchecknById(id));
    }

    /**
     * 新增考核评分记录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrcheckn:add')")
    @Log(title = "考核评分记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuHrcheckn xinhuHrcheckn)
    {
        return toAjax(xinhuHrchecknService.insertXinhuHrcheckn(xinhuHrcheckn));
    }

    /**
     * 修改考核评分记录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrcheckn:edit')")
    @Log(title = "考核评分记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuHrcheckn xinhuHrcheckn)
    {
        return toAjax(xinhuHrchecknService.updateXinhuHrcheckn(xinhuHrcheckn));
    }

    /**
     * 删除考核评分记录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrcheckn:remove')")
    @Log(title = "考核评分记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuHrchecknService.deleteXinhuHrchecknByIds(ids));
    }
}
