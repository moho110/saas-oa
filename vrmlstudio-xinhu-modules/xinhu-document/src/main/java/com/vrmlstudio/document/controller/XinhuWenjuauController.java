package com.vrmlstudio.document.controller;

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
import com.vrmlstudio.document.domain.XinhuWenjuau;
import com.vrmlstudio.document.service.IXinhuWenjuauService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 问卷子Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-document/wenjuau")
public class XinhuWenjuauController extends BaseController
{
    @Autowired
    private IXinhuWenjuauService xinhuWenjuauService;

    /**
     * 查询问卷子列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wenjuau:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuWenjuau xinhuWenjuau)
    {
        startPage();
        List<XinhuWenjuau> list = xinhuWenjuauService.selectXinhuWenjuauList(xinhuWenjuau);
        return getDataTable(list);
    }

    /**
     * 导出问卷子列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wenjuau:export')")
    @Log(title = "问卷子", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuWenjuau xinhuWenjuau)
    {
        List<XinhuWenjuau> list = xinhuWenjuauService.selectXinhuWenjuauList(xinhuWenjuau);
        ExcelUtil<XinhuWenjuau> util = new ExcelUtil<XinhuWenjuau>(XinhuWenjuau.class);
        util.exportExcel(response, list, "问卷子数据");
    }

    /**
     * 获取问卷子详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wenjuau:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuWenjuauService.selectXinhuWenjuauById(id));
    }

    /**
     * 新增问卷子
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wenjuau:add')")
    @Log(title = "问卷子", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuWenjuau xinhuWenjuau)
    {
        return toAjax(xinhuWenjuauService.insertXinhuWenjuau(xinhuWenjuau));
    }

    /**
     * 修改问卷子
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wenjuau:edit')")
    @Log(title = "问卷子", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuWenjuau xinhuWenjuau)
    {
        return toAjax(xinhuWenjuauService.updateXinhuWenjuau(xinhuWenjuau));
    }

    /**
     * 删除问卷子
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wenjuau:remove')")
    @Log(title = "问卷子", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuWenjuauService.deleteXinhuWenjuauByIds(ids));
    }
}
