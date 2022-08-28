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
import com.vrmlstudio.flow.domain.XinhuFlowWhere;
import com.vrmlstudio.flow.service.IXinhuFlowWhereService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 单据条件Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-flow/where")
public class XinhuFlowWhereController extends BaseController
{
    @Autowired
    private IXinhuFlowWhereService xinhuFlowWhereService;

    /**
     * 查询单据条件列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:where:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuFlowWhere xinhuFlowWhere)
    {
        startPage();
        List<XinhuFlowWhere> list = xinhuFlowWhereService.selectXinhuFlowWhereList(xinhuFlowWhere);
        return getDataTable(list);
    }

    /**
     * 导出单据条件列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:where:export')")
    @Log(title = "单据条件", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuFlowWhere xinhuFlowWhere)
    {
        List<XinhuFlowWhere> list = xinhuFlowWhereService.selectXinhuFlowWhereList(xinhuFlowWhere);
        ExcelUtil<XinhuFlowWhere> util = new ExcelUtil<XinhuFlowWhere>(XinhuFlowWhere.class);
        util.exportExcel(response, list, "单据条件数据");
    }

    /**
     * 获取单据条件详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:where:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(xinhuFlowWhereService.selectXinhuFlowWhereById(id));
    }

    /**
     * 新增单据条件
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:where:add')")
    @Log(title = "单据条件", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuFlowWhere xinhuFlowWhere)
    {
        return toAjax(xinhuFlowWhereService.insertXinhuFlowWhere(xinhuFlowWhere));
    }

    /**
     * 修改单据条件
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:where:edit')")
    @Log(title = "单据条件", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuFlowWhere xinhuFlowWhere)
    {
        return toAjax(xinhuFlowWhereService.updateXinhuFlowWhere(xinhuFlowWhere));
    }

    /**
     * 删除单据条件
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:where:remove')")
    @Log(title = "单据条件", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(xinhuFlowWhereService.deleteXinhuFlowWhereByIds(ids));
    }
}
