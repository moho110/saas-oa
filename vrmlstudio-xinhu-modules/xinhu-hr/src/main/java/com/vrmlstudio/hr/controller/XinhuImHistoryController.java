package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuImHistory;
import com.vrmlstudio.hr.service.IXinhuImHistoryService;
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
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * IM会话记录历史Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/history")
public class XinhuImHistoryController extends BaseController
{
    @Autowired
    private IXinhuImHistoryService xinhuImHistoryService;

    /**
     * 查询IM会话记录历史列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:history:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuImHistory xinhuImHistory)
    {
        startPage();
        List<XinhuImHistory> list = xinhuImHistoryService.selectXinhuImHistoryList(xinhuImHistory);
        return getDataTable(list);
    }

    /**
     * 导出IM会话记录历史列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:history:export')")
    @Log(title = "IM会话记录历史", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuImHistory xinhuImHistory)
    {
        List<XinhuImHistory> list = xinhuImHistoryService.selectXinhuImHistoryList(xinhuImHistory);
        ExcelUtil<XinhuImHistory> util = new ExcelUtil<XinhuImHistory>(XinhuImHistory.class);
        util.exportExcel(response, list, "IM会话记录历史数据");
    }

    /**
     * 获取IM会话记录历史详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:history:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuImHistoryService.selectXinhuImHistoryById(id));
    }

    /**
     * 新增IM会话记录历史
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:history:add')")
    @Log(title = "IM会话记录历史", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuImHistory xinhuImHistory)
    {
        return toAjax(xinhuImHistoryService.insertXinhuImHistory(xinhuImHistory));
    }

    /**
     * 修改IM会话记录历史
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:history:edit')")
    @Log(title = "IM会话记录历史", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuImHistory xinhuImHistory)
    {
        return toAjax(xinhuImHistoryService.updateXinhuImHistory(xinhuImHistory));
    }

    /**
     * 删除IM会话记录历史
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:history:remove')")
    @Log(title = "IM会话记录历史", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuImHistoryService.deleteXinhuImHistoryByIds(ids));
    }
}
