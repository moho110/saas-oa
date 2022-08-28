package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuHrcheck;
import com.vrmlstudio.hr.service.IXinhuHrcheckService;
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
 * 考核评分Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/hrcheck")
public class XinhuHrcheckController extends BaseController
{
    @Autowired
    private IXinhuHrcheckService xinhuHrcheckService;

    /**
     * 查询考核评分列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrcheck:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuHrcheck xinhuHrcheck)
    {
        startPage();
        List<XinhuHrcheck> list = xinhuHrcheckService.selectXinhuHrcheckList(xinhuHrcheck);
        return getDataTable(list);
    }

    /**
     * 导出考核评分列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrcheck:export')")
    @Log(title = "考核评分", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuHrcheck xinhuHrcheck)
    {
        List<XinhuHrcheck> list = xinhuHrcheckService.selectXinhuHrcheckList(xinhuHrcheck);
        ExcelUtil<XinhuHrcheck> util = new ExcelUtil<XinhuHrcheck>(XinhuHrcheck.class);
        util.exportExcel(response, list, "考核评分数据");
    }

    /**
     * 获取考核评分详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrcheck:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuHrcheckService.selectXinhuHrcheckById(id));
    }

    /**
     * 新增考核评分
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrcheck:add')")
    @Log(title = "考核评分", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuHrcheck xinhuHrcheck)
    {
        return toAjax(xinhuHrcheckService.insertXinhuHrcheck(xinhuHrcheck));
    }

    /**
     * 修改考核评分
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrcheck:edit')")
    @Log(title = "考核评分", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuHrcheck xinhuHrcheck)
    {
        return toAjax(xinhuHrcheckService.updateXinhuHrcheck(xinhuHrcheck));
    }

    /**
     * 删除考核评分
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrcheck:remove')")
    @Log(title = "考核评分", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuHrcheckService.deleteXinhuHrcheckByIds(ids));
    }
}
