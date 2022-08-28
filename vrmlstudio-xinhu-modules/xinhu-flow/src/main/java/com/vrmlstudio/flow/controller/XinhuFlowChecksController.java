package com.vrmlstudio.flow.controller;

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
import com.vrmlstudio.flow.domain.XinhuFlowChecks;
import com.vrmlstudio.flow.service.IXinhuFlowChecksService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 单据的审核人Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-flow/checks")
public class XinhuFlowChecksController extends BaseController
{
    @Autowired
    private IXinhuFlowChecksService xinhuFlowChecksService;

    /**
     * 查询单据的审核人列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:checks:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuFlowChecks xinhuFlowChecks)
    {
        startPage();
        List<XinhuFlowChecks> list = xinhuFlowChecksService.selectXinhuFlowChecksList(xinhuFlowChecks);
        return getDataTable(list);
    }

    /**
     * 导出单据的审核人列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:checks:export')")
    @Log(title = "单据的审核人", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuFlowChecks xinhuFlowChecks)
    {
        List<XinhuFlowChecks> list = xinhuFlowChecksService.selectXinhuFlowChecksList(xinhuFlowChecks);
        ExcelUtil<XinhuFlowChecks> util = new ExcelUtil<XinhuFlowChecks>(XinhuFlowChecks.class);
        util.exportExcel(response, list, "单据的审核人数据");
    }

    /**
     * 获取单据的审核人详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:checks:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuFlowChecksService.selectXinhuFlowChecksById(id));
    }

    /**
     * 新增单据的审核人
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:checks:add')")
    @Log(title = "单据的审核人", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuFlowChecks xinhuFlowChecks)
    {
        return toAjax(xinhuFlowChecksService.insertXinhuFlowChecks(xinhuFlowChecks));
    }

    /**
     * 修改单据的审核人
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:checks:edit')")
    @Log(title = "单据的审核人", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuFlowChecks xinhuFlowChecks)
    {
        return toAjax(xinhuFlowChecksService.updateXinhuFlowChecks(xinhuFlowChecks));
    }

    /**
     * 删除单据的审核人
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:checks:remove')")
    @Log(title = "单据的审核人", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuFlowChecksService.deleteXinhuFlowChecksByIds(ids));
    }
}
