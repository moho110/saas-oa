package com.vrmlstudio.finance.controller;

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
import com.vrmlstudio.finance.domain.XinhuReceipt;
import com.vrmlstudio.finance.service.IXinhuReceiptService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 回执确认Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-finance/receipt")
public class XinhuReceiptController extends BaseController
{
    @Autowired
    private IXinhuReceiptService xinhuReceiptService;

    /**
     * 查询回执确认列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:receipt:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuReceipt xinhuReceipt)
    {
        startPage();
        List<XinhuReceipt> list = xinhuReceiptService.selectXinhuReceiptList(xinhuReceipt);
        return getDataTable(list);
    }

    /**
     * 导出回执确认列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:receipt:export')")
    @Log(title = "回执确认", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuReceipt xinhuReceipt)
    {
        List<XinhuReceipt> list = xinhuReceiptService.selectXinhuReceiptList(xinhuReceipt);
        ExcelUtil<XinhuReceipt> util = new ExcelUtil<XinhuReceipt>(XinhuReceipt.class);
        util.exportExcel(response, list, "回执确认数据");
    }

    /**
     * 获取回执确认详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:receipt:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuReceiptService.selectXinhuReceiptById(id));
    }

    /**
     * 新增回执确认
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:receipt:add')")
    @Log(title = "回执确认", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuReceipt xinhuReceipt)
    {
        return toAjax(xinhuReceiptService.insertXinhuReceipt(xinhuReceipt));
    }

    /**
     * 修改回执确认
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:receipt:edit')")
    @Log(title = "回执确认", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuReceipt xinhuReceipt)
    {
        return toAjax(xinhuReceiptService.updateXinhuReceipt(xinhuReceipt));
    }

    /**
     * 删除回执确认
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:receipt:remove')")
    @Log(title = "回执确认", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuReceiptService.deleteXinhuReceiptByIds(ids));
    }
}
