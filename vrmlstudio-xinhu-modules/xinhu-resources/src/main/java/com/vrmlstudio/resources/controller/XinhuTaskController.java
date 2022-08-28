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
import com.vrmlstudio.resources.domain.XinhuTask;
import com.vrmlstudio.resources.service.IXinhuTaskService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 计划任务Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-resources/task")
public class XinhuTaskController extends BaseController
{
    @Autowired
    private IXinhuTaskService xinhuTaskService;

    /**
     * 查询计划任务列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:task:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuTask xinhuTask)
    {
        startPage();
        List<XinhuTask> list = xinhuTaskService.selectXinhuTaskList(xinhuTask);
        return getDataTable(list);
    }

    /**
     * 导出计划任务列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:task:export')")
    @Log(title = "计划任务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuTask xinhuTask)
    {
        List<XinhuTask> list = xinhuTaskService.selectXinhuTaskList(xinhuTask);
        ExcelUtil<XinhuTask> util = new ExcelUtil<XinhuTask>(XinhuTask.class);
        util.exportExcel(response, list, "计划任务数据");
    }

    /**
     * 获取计划任务详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:task:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(xinhuTaskService.selectXinhuTaskById(id));
    }

    /**
     * 新增计划任务
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:task:add')")
    @Log(title = "计划任务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuTask xinhuTask)
    {
        return toAjax(xinhuTaskService.insertXinhuTask(xinhuTask));
    }

    /**
     * 修改计划任务
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:task:edit')")
    @Log(title = "计划任务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuTask xinhuTask)
    {
        return toAjax(xinhuTaskService.updateXinhuTask(xinhuTask));
    }

    /**
     * 删除计划任务
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:task:remove')")
    @Log(title = "计划任务", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(xinhuTaskService.deleteXinhuTaskByIds(ids));
    }
}
