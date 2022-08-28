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
import com.vrmlstudio.flow.domain.XinhuFlowTodo;
import com.vrmlstudio.flow.service.IXinhuFlowTodoService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 单据通知设置Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-flow/todo")
public class XinhuFlowTodoController extends BaseController
{
    @Autowired
    private IXinhuFlowTodoService xinhuFlowTodoService;

    /**
     * 查询单据通知设置列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:todo:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuFlowTodo xinhuFlowTodo)
    {
        startPage();
        List<XinhuFlowTodo> list = xinhuFlowTodoService.selectXinhuFlowTodoList(xinhuFlowTodo);
        return getDataTable(list);
    }

    /**
     * 导出单据通知设置列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:todo:export')")
    @Log(title = "单据通知设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuFlowTodo xinhuFlowTodo)
    {
        List<XinhuFlowTodo> list = xinhuFlowTodoService.selectXinhuFlowTodoList(xinhuFlowTodo);
        ExcelUtil<XinhuFlowTodo> util = new ExcelUtil<XinhuFlowTodo>(XinhuFlowTodo.class);
        util.exportExcel(response, list, "单据通知设置数据");
    }

    /**
     * 获取单据通知设置详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:todo:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuFlowTodoService.selectXinhuFlowTodoById(id));
    }

    /**
     * 新增单据通知设置
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:todo:add')")
    @Log(title = "单据通知设置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuFlowTodo xinhuFlowTodo)
    {
        return toAjax(xinhuFlowTodoService.insertXinhuFlowTodo(xinhuFlowTodo));
    }

    /**
     * 修改单据通知设置
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:todo:edit')")
    @Log(title = "单据通知设置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuFlowTodo xinhuFlowTodo)
    {
        return toAjax(xinhuFlowTodoService.updateXinhuFlowTodo(xinhuFlowTodo));
    }

    /**
     * 删除单据通知设置
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:todo:remove')")
    @Log(title = "单据通知设置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuFlowTodoService.deleteXinhuFlowTodoByIds(ids));
    }
}
