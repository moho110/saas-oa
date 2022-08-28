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
import com.vrmlstudio.finance.domain.XinhuReads;
import com.vrmlstudio.finance.service.IXinhuReadsService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 单据浏览记录Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-finance/reads")
public class XinhuReadsController extends BaseController
{
    @Autowired
    private IXinhuReadsService xinhuReadsService;

    /**
     * 查询单据浏览记录列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:reads:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuReads xinhuReads)
    {
        startPage();
        List<XinhuReads> list = xinhuReadsService.selectXinhuReadsList(xinhuReads);
        return getDataTable(list);
    }

    /**
     * 导出单据浏览记录列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:reads:export')")
    @Log(title = "单据浏览记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuReads xinhuReads)
    {
        List<XinhuReads> list = xinhuReadsService.selectXinhuReadsList(xinhuReads);
        ExcelUtil<XinhuReads> util = new ExcelUtil<XinhuReads>(XinhuReads.class);
        util.exportExcel(response, list, "单据浏览记录数据");
    }

    /**
     * 获取单据浏览记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:reads:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuReadsService.selectXinhuReadsById(id));
    }

    /**
     * 新增单据浏览记录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:reads:add')")
    @Log(title = "单据浏览记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuReads xinhuReads)
    {
        return toAjax(xinhuReadsService.insertXinhuReads(xinhuReads));
    }

    /**
     * 修改单据浏览记录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:reads:edit')")
    @Log(title = "单据浏览记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuReads xinhuReads)
    {
        return toAjax(xinhuReadsService.updateXinhuReads(xinhuReads));
    }

    /**
     * 删除单据浏览记录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:reads:remove')")
    @Log(title = "单据浏览记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuReadsService.deleteXinhuReadsByIds(ids));
    }
}
