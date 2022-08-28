package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuKqdkjl;
import com.vrmlstudio.hr.service.IXinhuKqdkjlService;
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
 * 打卡记录Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/kqdkjl")
public class XinhuKqdkjlController extends BaseController
{
    @Autowired
    private IXinhuKqdkjlService xinhuKqdkjlService;

    /**
     * 查询打卡记录列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqdkjl:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuKqdkjl xinhuKqdkjl)
    {
        startPage();
        List<XinhuKqdkjl> list = xinhuKqdkjlService.selectXinhuKqdkjlList(xinhuKqdkjl);
        return getDataTable(list);
    }

    /**
     * 导出打卡记录列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqdkjl:export')")
    @Log(title = "打卡记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuKqdkjl xinhuKqdkjl)
    {
        List<XinhuKqdkjl> list = xinhuKqdkjlService.selectXinhuKqdkjlList(xinhuKqdkjl);
        ExcelUtil<XinhuKqdkjl> util = new ExcelUtil<XinhuKqdkjl>(XinhuKqdkjl.class);
        util.exportExcel(response, list, "打卡记录数据");
    }

    /**
     * 获取打卡记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqdkjl:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuKqdkjlService.selectXinhuKqdkjlById(id));
    }

    /**
     * 新增打卡记录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqdkjl:add')")
    @Log(title = "打卡记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuKqdkjl xinhuKqdkjl)
    {
        return toAjax(xinhuKqdkjlService.insertXinhuKqdkjl(xinhuKqdkjl));
    }

    /**
     * 修改打卡记录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqdkjl:edit')")
    @Log(title = "打卡记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuKqdkjl xinhuKqdkjl)
    {
        return toAjax(xinhuKqdkjlService.updateXinhuKqdkjl(xinhuKqdkjl));
    }

    /**
     * 删除打卡记录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqdkjl:remove')")
    @Log(title = "打卡记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuKqdkjlService.deleteXinhuKqdkjlByIds(ids));
    }
}
