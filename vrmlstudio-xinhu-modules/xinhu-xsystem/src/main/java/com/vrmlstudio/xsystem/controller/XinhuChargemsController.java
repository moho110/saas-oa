package com.vrmlstudio.xsystem.controller;

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
import com.vrmlstudio.xsystem.domain.XinhuChargems;
import com.vrmlstudio.xsystem.service.IXinhuChargemsService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 系统升级Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-system/chargems")
public class XinhuChargemsController extends BaseController
{
    @Autowired
    private IXinhuChargemsService xinhuChargemsService;

    /**
     * 查询系统升级列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:chargems:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuChargems xinhuChargems)
    {
        startPage();
        List<XinhuChargems> list = xinhuChargemsService.selectXinhuChargemsList(xinhuChargems);
        return getDataTable(list);
    }

    /**
     * 导出系统升级列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:chargems:export')")
    @Log(title = "系统升级", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuChargems xinhuChargems)
    {
        List<XinhuChargems> list = xinhuChargemsService.selectXinhuChargemsList(xinhuChargems);
        ExcelUtil<XinhuChargems> util = new ExcelUtil<XinhuChargems>(XinhuChargems.class);
        util.exportExcel(response, list, "系统升级数据");
    }

    /**
     * 获取系统升级详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:chargems:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuChargemsService.selectXinhuChargemsById(id));
    }

    /**
     * 新增系统升级
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:chargems:add')")
    @Log(title = "系统升级", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuChargems xinhuChargems)
    {
        return toAjax(xinhuChargemsService.insertXinhuChargems(xinhuChargems));
    }

    /**
     * 修改系统升级
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:chargems:edit')")
    @Log(title = "系统升级", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuChargems xinhuChargems)
    {
        return toAjax(xinhuChargemsService.updateXinhuChargems(xinhuChargems));
    }

    /**
     * 删除系统升级
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:chargems:remove')")
    @Log(title = "系统升级", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuChargemsService.deleteXinhuChargemsByIds(ids));
    }
}
