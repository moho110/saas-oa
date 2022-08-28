package com.vrmlstudio.xsystem.controller;

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
import com.vrmlstudio.xsystem.domain.XinhuLog;
import com.vrmlstudio.xsystem.service.IXinhuLogService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 系统日志Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-system/log")
public class XinhuLogController extends BaseController
{
    @Autowired
    private IXinhuLogService xinhuLogService;

    /**
     * 查询系统日志列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:log:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuLog xinhuLog)
    {
        startPage();
        List<XinhuLog> list = xinhuLogService.selectXinhuLogList(xinhuLog);
        return getDataTable(list);
    }

    /**
     * 导出系统日志列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:log:export')")
    @Log(title = "系统日志", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuLog xinhuLog)
    {
        List<XinhuLog> list = xinhuLogService.selectXinhuLogList(xinhuLog);
        ExcelUtil<XinhuLog> util = new ExcelUtil<XinhuLog>(XinhuLog.class);
        util.exportExcel(response, list, "系统日志数据");
    }

    /**
     * 获取系统日志详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:log:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuLogService.selectXinhuLogById(id));
    }

    /**
     * 新增系统日志
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:log:add')")
    @Log(title = "系统日志", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuLog xinhuLog)
    {
        return toAjax(xinhuLogService.insertXinhuLog(xinhuLog));
    }

    /**
     * 修改系统日志
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:log:edit')")
    @Log(title = "系统日志", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuLog xinhuLog)
    {
        return toAjax(xinhuLogService.updateXinhuLog(xinhuLog));
    }

    /**
     * 删除系统日志
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:log:remove')")
    @Log(title = "系统日志", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuLogService.deleteXinhuLogByIds(ids));
    }
}
