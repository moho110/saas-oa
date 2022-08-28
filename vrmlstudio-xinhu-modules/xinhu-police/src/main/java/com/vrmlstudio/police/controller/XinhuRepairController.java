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
import com.vrmlstudio.police.domain.XinhuRepair;
import com.vrmlstudio.police.service.IXinhuRepairService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 维修报修Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-police/repair")
public class XinhuRepairController extends BaseController
{
    @Autowired
    private IXinhuRepairService xinhuRepairService;

    /**
     * 查询维修报修列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:repair:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuRepair xinhuRepair)
    {
        startPage();
        List<XinhuRepair> list = xinhuRepairService.selectXinhuRepairList(xinhuRepair);
        return getDataTable(list);
    }

    /**
     * 导出维修报修列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:repair:export')")
    @Log(title = "维修报修", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuRepair xinhuRepair)
    {
        List<XinhuRepair> list = xinhuRepairService.selectXinhuRepairList(xinhuRepair);
        ExcelUtil<XinhuRepair> util = new ExcelUtil<XinhuRepair>(XinhuRepair.class);
        util.exportExcel(response, list, "维修报修数据");
    }

    /**
     * 获取维修报修详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:repair:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuRepairService.selectXinhuRepairById(id));
    }

    /**
     * 新增维修报修
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:repair:add')")
    @Log(title = "维修报修", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuRepair xinhuRepair)
    {
        return toAjax(xinhuRepairService.insertXinhuRepair(xinhuRepair));
    }

    /**
     * 修改维修报修
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:repair:edit')")
    @Log(title = "维修报修", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuRepair xinhuRepair)
    {
        return toAjax(xinhuRepairService.updateXinhuRepair(xinhuRepair));
    }

    /**
     * 删除维修报修
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:repair:remove')")
    @Log(title = "维修报修", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuRepairService.deleteXinhuRepairByIds(ids));
    }
}
