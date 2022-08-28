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
import com.vrmlstudio.police.domain.XinhuFlowBill;
import com.vrmlstudio.police.service.IXinhuFlowBillService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 流程单据Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-police/bill")
public class XinhuFlowBillController extends BaseController
{
    @Autowired
    private IXinhuFlowBillService xinhuFlowBillService;

    /**
     * 查询流程单据列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:bill:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuFlowBill xinhuFlowBill)
    {
        startPage();
        List<XinhuFlowBill> list = xinhuFlowBillService.selectXinhuFlowBillList(xinhuFlowBill);
        return getDataTable(list);
    }

    /**
     * 导出流程单据列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:bill:export')")
    @Log(title = "流程单据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuFlowBill xinhuFlowBill)
    {
        List<XinhuFlowBill> list = xinhuFlowBillService.selectXinhuFlowBillList(xinhuFlowBill);
        ExcelUtil<XinhuFlowBill> util = new ExcelUtil<XinhuFlowBill>(XinhuFlowBill.class);
        util.exportExcel(response, list, "流程单据数据");
    }

    /**
     * 获取流程单据详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:bill:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuFlowBillService.selectXinhuFlowBillById(id));
    }

    /**
     * 新增流程单据
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:bill:add')")
    @Log(title = "流程单据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuFlowBill xinhuFlowBill)
    {
        return toAjax(xinhuFlowBillService.insertXinhuFlowBill(xinhuFlowBill));
    }

    /**
     * 修改流程单据
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:bill:edit')")
    @Log(title = "流程单据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuFlowBill xinhuFlowBill)
    {
        return toAjax(xinhuFlowBillService.updateXinhuFlowBill(xinhuFlowBill));
    }

    /**
     * 删除流程单据
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:bill:remove')")
    @Log(title = "流程单据", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuFlowBillService.deleteXinhuFlowBillByIds(ids));
    }
}
