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
import com.vrmlstudio.finance.domain.XinhuCustappy;
import com.vrmlstudio.finance.service.IXinhuCustappyService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 客户申请使用Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-finance/custappy")
public class XinhuCustappyController extends BaseController
{
    @Autowired
    private IXinhuCustappyService xinhuCustappyService;

    /**
     * 查询客户申请使用列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custappy:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuCustappy xinhuCustappy)
    {
        startPage();
        List<XinhuCustappy> list = xinhuCustappyService.selectXinhuCustappyList(xinhuCustappy);
        return getDataTable(list);
    }

    /**
     * 导出客户申请使用列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custappy:export')")
    @Log(title = "客户申请使用", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuCustappy xinhuCustappy)
    {
        List<XinhuCustappy> list = xinhuCustappyService.selectXinhuCustappyList(xinhuCustappy);
        ExcelUtil<XinhuCustappy> util = new ExcelUtil<XinhuCustappy>(XinhuCustappy.class);
        util.exportExcel(response, list, "客户申请使用数据");
    }

    /**
     * 获取客户申请使用详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custappy:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuCustappyService.selectXinhuCustappyById(id));
    }

    /**
     * 新增客户申请使用
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custappy:add')")
    @Log(title = "客户申请使用", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuCustappy xinhuCustappy)
    {
        return toAjax(xinhuCustappyService.insertXinhuCustappy(xinhuCustappy));
    }

    /**
     * 修改客户申请使用
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custappy:edit')")
    @Log(title = "客户申请使用", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuCustappy xinhuCustappy)
    {
        return toAjax(xinhuCustappyService.updateXinhuCustappy(xinhuCustappy));
    }

    /**
     * 删除客户申请使用
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:custappy:remove')")
    @Log(title = "客户申请使用", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuCustappyService.deleteXinhuCustappyByIds(ids));
    }
}
