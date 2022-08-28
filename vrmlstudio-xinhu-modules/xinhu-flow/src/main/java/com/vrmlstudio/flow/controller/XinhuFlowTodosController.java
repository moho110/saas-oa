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
import com.vrmlstudio.flow.domain.XinhuFlowTodos;
import com.vrmlstudio.flow.service.IXinhuFlowTodosService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 单据通知给对应人员Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-flow/todos")
public class XinhuFlowTodosController extends BaseController
{
    @Autowired
    private IXinhuFlowTodosService xinhuFlowTodosService;

    /**
     * 查询单据通知给对应人员列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:todos:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuFlowTodos xinhuFlowTodos)
    {
        startPage();
        List<XinhuFlowTodos> list = xinhuFlowTodosService.selectXinhuFlowTodosList(xinhuFlowTodos);
        return getDataTable(list);
    }

    /**
     * 导出单据通知给对应人员列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:todos:export')")
    @Log(title = "单据通知给对应人员", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuFlowTodos xinhuFlowTodos)
    {
        List<XinhuFlowTodos> list = xinhuFlowTodosService.selectXinhuFlowTodosList(xinhuFlowTodos);
        ExcelUtil<XinhuFlowTodos> util = new ExcelUtil<XinhuFlowTodos>(XinhuFlowTodos.class);
        util.exportExcel(response, list, "单据通知给对应人员数据");
    }

    /**
     * 获取单据通知给对应人员详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:todos:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuFlowTodosService.selectXinhuFlowTodosById(id));
    }

    /**
     * 新增单据通知给对应人员
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:todos:add')")
    @Log(title = "单据通知给对应人员", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuFlowTodos xinhuFlowTodos)
    {
        return toAjax(xinhuFlowTodosService.insertXinhuFlowTodos(xinhuFlowTodos));
    }

    /**
     * 修改单据通知给对应人员
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:todos:edit')")
    @Log(title = "单据通知给对应人员", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuFlowTodos xinhuFlowTodos)
    {
        return toAjax(xinhuFlowTodosService.updateXinhuFlowTodos(xinhuFlowTodos));
    }

    /**
     * 删除单据通知给对应人员
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:todos:remove')")
    @Log(title = "单据通知给对应人员", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuFlowTodosService.deleteXinhuFlowTodosByIds(ids));
    }
}
