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
import com.vrmlstudio.finance.domain.XinhuCustfina;
import com.vrmlstudio.finance.service.IXinhuCustfinaService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 客户收付款Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-finance/custfina")
public class XinhuCustfinaController extends BaseController
{
    @Autowired
    private IXinhuCustfinaService xinhuCustfinaService;

    /**
     * 查询客户收付款列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custfina:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuCustfina xinhuCustfina)
    {
        startPage();
        List<XinhuCustfina> list = xinhuCustfinaService.selectXinhuCustfinaList(xinhuCustfina);
        return getDataTable(list);
    }

    /**
     * 导出客户收付款列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custfina:export')")
    @Log(title = "客户收付款", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuCustfina xinhuCustfina)
    {
        List<XinhuCustfina> list = xinhuCustfinaService.selectXinhuCustfinaList(xinhuCustfina);
        ExcelUtil<XinhuCustfina> util = new ExcelUtil<XinhuCustfina>(XinhuCustfina.class);
        util.exportExcel(response, list, "客户收付款数据");
    }

    /**
     * 获取客户收付款详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custfina:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuCustfinaService.selectXinhuCustfinaById(id));
    }

    /**
     * 新增客户收付款
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custfina:add')")
    @Log(title = "客户收付款", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuCustfina xinhuCustfina)
    {
        return toAjax(xinhuCustfinaService.insertXinhuCustfina(xinhuCustfina));
    }

    /**
     * 修改客户收付款
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custfina:edit')")
    @Log(title = "客户收付款", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuCustfina xinhuCustfina)
    {
        return toAjax(xinhuCustfinaService.updateXinhuCustfina(xinhuCustfina));
    }

    /**
     * 删除客户收付款
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custfina:remove')")
    @Log(title = "客户收付款", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuCustfinaService.deleteXinhuCustfinaByIds(ids));
    }
}
