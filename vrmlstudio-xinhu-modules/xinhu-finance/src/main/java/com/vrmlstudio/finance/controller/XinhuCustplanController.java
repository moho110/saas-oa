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
import com.vrmlstudio.finance.domain.XinhuCustplan;
import com.vrmlstudio.finance.service.IXinhuCustplanService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 跟进计划Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-finance/custplan")
public class XinhuCustplanController extends BaseController
{
    @Autowired
    private IXinhuCustplanService xinhuCustplanService;

    /**
     * 查询跟进计划列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custplan:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuCustplan xinhuCustplan)
    {
        startPage();
        List<XinhuCustplan> list = xinhuCustplanService.selectXinhuCustplanList(xinhuCustplan);
        return getDataTable(list);
    }

    /**
     * 导出跟进计划列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custplan:export')")
    @Log(title = "跟进计划", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuCustplan xinhuCustplan)
    {
        List<XinhuCustplan> list = xinhuCustplanService.selectXinhuCustplanList(xinhuCustplan);
        ExcelUtil<XinhuCustplan> util = new ExcelUtil<XinhuCustplan>(XinhuCustplan.class);
        util.exportExcel(response, list, "跟进计划数据");
    }

    /**
     * 获取跟进计划详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custplan:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuCustplanService.selectXinhuCustplanById(id));
    }

    /**
     * 新增跟进计划
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custplan:add')")
    @Log(title = "跟进计划", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuCustplan xinhuCustplan)
    {
        return toAjax(xinhuCustplanService.insertXinhuCustplan(xinhuCustplan));
    }

    /**
     * 修改跟进计划
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custplan:edit')")
    @Log(title = "跟进计划", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuCustplan xinhuCustplan)
    {
        return toAjax(xinhuCustplanService.updateXinhuCustplan(xinhuCustplan));
    }

    /**
     * 删除跟进计划
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custplan:remove')")
    @Log(title = "跟进计划", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuCustplanService.deleteXinhuCustplanByIds(ids));
    }
}
