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
import com.vrmlstudio.finance.domain.XinhuTovoid;
import com.vrmlstudio.finance.service.IXinhuTovoidService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 单据申请作废Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-finance/tovoid")
public class XinhuTovoidController extends BaseController
{
    @Autowired
    private IXinhuTovoidService xinhuTovoidService;

    /**
     * 查询单据申请作废列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:tovoid:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuTovoid xinhuTovoid)
    {
        startPage();
        List<XinhuTovoid> list = xinhuTovoidService.selectXinhuTovoidList(xinhuTovoid);
        return getDataTable(list);
    }

    /**
     * 导出单据申请作废列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:tovoid:export')")
    @Log(title = "单据申请作废", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuTovoid xinhuTovoid)
    {
        List<XinhuTovoid> list = xinhuTovoidService.selectXinhuTovoidList(xinhuTovoid);
        ExcelUtil<XinhuTovoid> util = new ExcelUtil<XinhuTovoid>(XinhuTovoid.class);
        util.exportExcel(response, list, "单据申请作废数据");
    }

    /**
     * 获取单据申请作废详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:tovoid:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuTovoidService.selectXinhuTovoidById(id));
    }

    /**
     * 新增单据申请作废
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:tovoid:add')")
    @Log(title = "单据申请作废", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuTovoid xinhuTovoid)
    {
        return toAjax(xinhuTovoidService.insertXinhuTovoid(xinhuTovoid));
    }

    /**
     * 修改单据申请作废
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:tovoid:edit')")
    @Log(title = "单据申请作废", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuTovoid xinhuTovoid)
    {
        return toAjax(xinhuTovoidService.updateXinhuTovoid(xinhuTovoid));
    }

    /**
     * 删除单据申请作废
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:tovoid:remove')")
    @Log(title = "单据申请作废", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuTovoidService.deleteXinhuTovoidByIds(ids));
    }
}
