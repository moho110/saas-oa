package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuHrsalarm;
import com.vrmlstudio.hr.service.IXinhuHrsalarmService;
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
 * 薪资模版Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/hrsalarm")
public class XinhuHrsalarmController extends BaseController
{
    @Autowired
    private IXinhuHrsalarmService xinhuHrsalarmService;

    /**
     * 查询薪资模版列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrsalarm:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuHrsalarm xinhuHrsalarm)
    {
        startPage();
        List<XinhuHrsalarm> list = xinhuHrsalarmService.selectXinhuHrsalarmList(xinhuHrsalarm);
        return getDataTable(list);
    }

    /**
     * 导出薪资模版列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrsalarm:export')")
    @Log(title = "薪资模版", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuHrsalarm xinhuHrsalarm)
    {
        List<XinhuHrsalarm> list = xinhuHrsalarmService.selectXinhuHrsalarmList(xinhuHrsalarm);
        ExcelUtil<XinhuHrsalarm> util = new ExcelUtil<XinhuHrsalarm>(XinhuHrsalarm.class);
        util.exportExcel(response, list, "薪资模版数据");
    }

    /**
     * 获取薪资模版详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrsalarm:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuHrsalarmService.selectXinhuHrsalarmById(id));
    }

    /**
     * 新增薪资模版
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrsalarm:add')")
    @Log(title = "薪资模版", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuHrsalarm xinhuHrsalarm)
    {
        return toAjax(xinhuHrsalarmService.insertXinhuHrsalarm(xinhuHrsalarm));
    }

    /**
     * 修改薪资模版
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrsalarm:edit')")
    @Log(title = "薪资模版", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuHrsalarm xinhuHrsalarm)
    {
        return toAjax(xinhuHrsalarmService.updateXinhuHrsalarm(xinhuHrsalarm));
    }

    /**
     * 删除薪资模版
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrsalarm:remove')")
    @Log(title = "薪资模版", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuHrsalarmService.deleteXinhuHrsalarmByIds(ids));
    }
}
