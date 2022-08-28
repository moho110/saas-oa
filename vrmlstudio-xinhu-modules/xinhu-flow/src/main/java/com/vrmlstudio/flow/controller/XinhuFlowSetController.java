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
import com.vrmlstudio.flow.domain.XinhuFlowSet;
import com.vrmlstudio.flow.service.IXinhuFlowSetService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 流程模块Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-flow/set")
public class XinhuFlowSetController extends BaseController
{
    @Autowired
    private IXinhuFlowSetService xinhuFlowSetService;

    /**
     * 查询流程模块列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:set:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuFlowSet xinhuFlowSet)
    {
        startPage();
        List<XinhuFlowSet> list = xinhuFlowSetService.selectXinhuFlowSetList(xinhuFlowSet);
        return getDataTable(list);
    }

    /**
     * 导出流程模块列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:set:export')")
    @Log(title = "流程模块", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuFlowSet xinhuFlowSet)
    {
        List<XinhuFlowSet> list = xinhuFlowSetService.selectXinhuFlowSetList(xinhuFlowSet);
        ExcelUtil<XinhuFlowSet> util = new ExcelUtil<XinhuFlowSet>(XinhuFlowSet.class);
        util.exportExcel(response, list, "流程模块数据");
    }

    /**
     * 获取流程模块详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:set:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuFlowSetService.selectXinhuFlowSetById(id));
    }

    /**
     * 新增流程模块
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:set:add')")
    @Log(title = "流程模块", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuFlowSet xinhuFlowSet)
    {
        return toAjax(xinhuFlowSetService.insertXinhuFlowSet(xinhuFlowSet));
    }

    /**
     * 修改流程模块
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:set:edit')")
    @Log(title = "流程模块", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuFlowSet xinhuFlowSet)
    {
        return toAjax(xinhuFlowSetService.updateXinhuFlowSet(xinhuFlowSet));
    }

    /**
     * 删除流程模块
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:set:remove')")
    @Log(title = "流程模块", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuFlowSetService.deleteXinhuFlowSetByIds(ids));
    }
}
