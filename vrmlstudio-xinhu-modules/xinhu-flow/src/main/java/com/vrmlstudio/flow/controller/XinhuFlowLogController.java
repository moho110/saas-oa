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
import com.vrmlstudio.flow.domain.XinhuFlowLog;
import com.vrmlstudio.flow.service.IXinhuFlowLogService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 单据操作记录Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-flow/log")
public class XinhuFlowLogController extends BaseController
{
    @Autowired
    private IXinhuFlowLogService xinhuFlowLogService;

    /**
     * 查询单据操作记录列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:log:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuFlowLog xinhuFlowLog)
    {
        startPage();
        List<XinhuFlowLog> list = xinhuFlowLogService.selectXinhuFlowLogList(xinhuFlowLog);
        return getDataTable(list);
    }

    /**
     * 导出单据操作记录列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:log:export')")
    @Log(title = "单据操作记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuFlowLog xinhuFlowLog)
    {
        List<XinhuFlowLog> list = xinhuFlowLogService.selectXinhuFlowLogList(xinhuFlowLog);
        ExcelUtil<XinhuFlowLog> util = new ExcelUtil<XinhuFlowLog>(XinhuFlowLog.class);
        util.exportExcel(response, list, "单据操作记录数据");
    }

    /**
     * 获取单据操作记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:log:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuFlowLogService.selectXinhuFlowLogById(id));
    }

    /**
     * 新增单据操作记录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:log:add')")
    @Log(title = "单据操作记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuFlowLog xinhuFlowLog)
    {
        return toAjax(xinhuFlowLogService.insertXinhuFlowLog(xinhuFlowLog));
    }

    /**
     * 修改单据操作记录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:log:edit')")
    @Log(title = "单据操作记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuFlowLog xinhuFlowLog)
    {
        return toAjax(xinhuFlowLogService.updateXinhuFlowLog(xinhuFlowLog));
    }

    /**
     * 删除单据操作记录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:log:remove')")
    @Log(title = "单据操作记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuFlowLogService.deleteXinhuFlowLogByIds(ids));
    }
}
