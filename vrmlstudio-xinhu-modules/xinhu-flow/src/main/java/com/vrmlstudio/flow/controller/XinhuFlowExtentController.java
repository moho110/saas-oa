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
import com.vrmlstudio.flow.domain.XinhuFlowExtent;
import com.vrmlstudio.flow.service.IXinhuFlowExtentService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 模块权限Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-flow/extent")
public class XinhuFlowExtentController extends BaseController
{
    @Autowired
    private IXinhuFlowExtentService xinhuFlowExtentService;

    /**
     * 查询模块权限列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:extent:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuFlowExtent xinhuFlowExtent)
    {
        startPage();
        List<XinhuFlowExtent> list = xinhuFlowExtentService.selectXinhuFlowExtentList(xinhuFlowExtent);
        return getDataTable(list);
    }

    /**
     * 导出模块权限列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:extent:export')")
    @Log(title = "模块权限", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuFlowExtent xinhuFlowExtent)
    {
        List<XinhuFlowExtent> list = xinhuFlowExtentService.selectXinhuFlowExtentList(xinhuFlowExtent);
        ExcelUtil<XinhuFlowExtent> util = new ExcelUtil<XinhuFlowExtent>(XinhuFlowExtent.class);
        util.exportExcel(response, list, "模块权限数据");
    }

    /**
     * 获取模块权限详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:extent:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuFlowExtentService.selectXinhuFlowExtentById(id));
    }

    /**
     * 新增模块权限
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:extent:add')")
    @Log(title = "模块权限", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuFlowExtent xinhuFlowExtent)
    {
        return toAjax(xinhuFlowExtentService.insertXinhuFlowExtent(xinhuFlowExtent));
    }

    /**
     * 修改模块权限
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:extent:edit')")
    @Log(title = "模块权限", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuFlowExtent xinhuFlowExtent)
    {
        return toAjax(xinhuFlowExtentService.updateXinhuFlowExtent(xinhuFlowExtent));
    }

    /**
     * 删除模块权限
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:extent:remove')")
    @Log(title = "模块权限", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuFlowExtentService.deleteXinhuFlowExtentByIds(ids));
    }
}
