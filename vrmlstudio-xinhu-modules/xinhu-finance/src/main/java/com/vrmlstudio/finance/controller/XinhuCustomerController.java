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
import com.vrmlstudio.finance.domain.XinhuCustomer;
import com.vrmlstudio.finance.service.IXinhuCustomerService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 客户Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-finance/customer")
public class XinhuCustomerController extends BaseController
{
    @Autowired
    private IXinhuCustomerService xinhuCustomerService;

    /**
     * 查询客户列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:customer:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuCustomer xinhuCustomer)
    {
        startPage();
        List<XinhuCustomer> list = xinhuCustomerService.selectXinhuCustomerList(xinhuCustomer);
        return getDataTable(list);
    }

    /**
     * 导出客户列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:customer:export')")
    @Log(title = "客户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuCustomer xinhuCustomer)
    {
        List<XinhuCustomer> list = xinhuCustomerService.selectXinhuCustomerList(xinhuCustomer);
        ExcelUtil<XinhuCustomer> util = new ExcelUtil<XinhuCustomer>(XinhuCustomer.class);
        util.exportExcel(response, list, "客户数据");
    }

    /**
     * 获取客户详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:customer:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuCustomerService.selectXinhuCustomerById(id));
    }

    /**
     * 新增客户
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:customer:add')")
    @Log(title = "客户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuCustomer xinhuCustomer)
    {
        return toAjax(xinhuCustomerService.insertXinhuCustomer(xinhuCustomer));
    }

    /**
     * 修改客户
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:customer:edit')")
    @Log(title = "客户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuCustomer xinhuCustomer)
    {
        return toAjax(xinhuCustomerService.updateXinhuCustomer(xinhuCustomer));
    }

    /**
     * 删除客户
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:customer:remove')")
    @Log(title = "客户", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuCustomerService.deleteXinhuCustomerByIds(ids));
    }
}
