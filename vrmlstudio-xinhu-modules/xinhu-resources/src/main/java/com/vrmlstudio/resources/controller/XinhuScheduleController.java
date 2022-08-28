package com.vrmlstudio.resources.controller;

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
import com.vrmlstudio.resources.domain.XinhuSchedule;
import com.vrmlstudio.resources.service.IXinhuScheduleService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 日程Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-resources/schedule")
public class XinhuScheduleController extends BaseController
{
    @Autowired
    private IXinhuScheduleService xinhuScheduleService;

    /**
     * 查询日程列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:schedule:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuSchedule xinhuSchedule)
    {
        startPage();
        List<XinhuSchedule> list = xinhuScheduleService.selectXinhuScheduleList(xinhuSchedule);
        return getDataTable(list);
    }

    /**
     * 导出日程列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:schedule:export')")
    @Log(title = "日程", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuSchedule xinhuSchedule)
    {
        List<XinhuSchedule> list = xinhuScheduleService.selectXinhuScheduleList(xinhuSchedule);
        ExcelUtil<XinhuSchedule> util = new ExcelUtil<XinhuSchedule>(XinhuSchedule.class);
        util.exportExcel(response, list, "日程数据");
    }

    /**
     * 获取日程详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:schedule:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuScheduleService.selectXinhuScheduleById(id));
    }

    /**
     * 新增日程
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:schedule:add')")
    @Log(title = "日程", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuSchedule xinhuSchedule)
    {
        return toAjax(xinhuScheduleService.insertXinhuSchedule(xinhuSchedule));
    }

    /**
     * 修改日程
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:schedule:edit')")
    @Log(title = "日程", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuSchedule xinhuSchedule)
    {
        return toAjax(xinhuScheduleService.updateXinhuSchedule(xinhuSchedule));
    }

    /**
     * 删除日程
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:schedule:remove')")
    @Log(title = "日程", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuScheduleService.deleteXinhuScheduleByIds(ids));
    }
}
