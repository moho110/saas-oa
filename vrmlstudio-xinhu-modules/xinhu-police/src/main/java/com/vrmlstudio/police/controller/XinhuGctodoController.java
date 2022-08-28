package com.vrmlstudio.police.controller;

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
import com.vrmlstudio.police.domain.XinhuGctodo;
import com.vrmlstudio.police.service.IXinhuGctodoService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 工程通知Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-police/gctodo")
public class XinhuGctodoController extends BaseController
{
    @Autowired
    private IXinhuGctodoService xinhuGctodoService;

    /**
     * 查询工程通知列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:gctodo:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuGctodo xinhuGctodo)
    {
        startPage();
        List<XinhuGctodo> list = xinhuGctodoService.selectXinhuGctodoList(xinhuGctodo);
        return getDataTable(list);
    }

    /**
     * 导出工程通知列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:gctodo:export')")
    @Log(title = "工程通知", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuGctodo xinhuGctodo)
    {
        List<XinhuGctodo> list = xinhuGctodoService.selectXinhuGctodoList(xinhuGctodo);
        ExcelUtil<XinhuGctodo> util = new ExcelUtil<XinhuGctodo>(XinhuGctodo.class);
        util.exportExcel(response, list, "工程通知数据");
    }

    /**
     * 获取工程通知详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:gctodo:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuGctodoService.selectXinhuGctodoById(id));
    }

    /**
     * 新增工程通知
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:gctodo:add')")
    @Log(title = "工程通知", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuGctodo xinhuGctodo)
    {
        return toAjax(xinhuGctodoService.insertXinhuGctodo(xinhuGctodo));
    }

    /**
     * 修改工程通知
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:gctodo:edit')")
    @Log(title = "工程通知", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuGctodo xinhuGctodo)
    {
        return toAjax(xinhuGctodoService.updateXinhuGctodo(xinhuGctodo));
    }

    /**
     * 删除工程通知
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:gctodo:remove')")
    @Log(title = "工程通知", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuGctodoService.deleteXinhuGctodoByIds(ids));
    }
}
