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
import com.vrmlstudio.finance.domain.XinhuCustract;
import com.vrmlstudio.finance.service.IXinhuCustractService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 客户合同Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-finance/custract")
public class XinhuCustractController extends BaseController
{
    @Autowired
    private IXinhuCustractService xinhuCustractService;

    /**
     * 查询客户合同列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custract:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuCustract xinhuCustract)
    {
        startPage();
        List<XinhuCustract> list = xinhuCustractService.selectXinhuCustractList(xinhuCustract);
        return getDataTable(list);
    }

    /**
     * 导出客户合同列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custract:export')")
    @Log(title = "客户合同", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuCustract xinhuCustract)
    {
        List<XinhuCustract> list = xinhuCustractService.selectXinhuCustractList(xinhuCustract);
        ExcelUtil<XinhuCustract> util = new ExcelUtil<XinhuCustract>(XinhuCustract.class);
        util.exportExcel(response, list, "客户合同数据");
    }

    /**
     * 获取客户合同详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custract:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuCustractService.selectXinhuCustractById(id));
    }

    /**
     * 新增客户合同
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custract:add')")
    @Log(title = "客户合同", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuCustract xinhuCustract)
    {
        return toAjax(xinhuCustractService.insertXinhuCustract(xinhuCustract));
    }

    /**
     * 修改客户合同
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custract:edit')")
    @Log(title = "客户合同", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuCustract xinhuCustract)
    {
        return toAjax(xinhuCustractService.updateXinhuCustract(xinhuCustract));
    }

    /**
     * 删除客户合同
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custract:remove')")
    @Log(title = "客户合同", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuCustractService.deleteXinhuCustractByIds(ids));
    }
}
