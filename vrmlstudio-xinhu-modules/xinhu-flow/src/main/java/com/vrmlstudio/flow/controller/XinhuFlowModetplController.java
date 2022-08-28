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
import com.vrmlstudio.flow.domain.XinhuFlowModetpl;
import com.vrmlstudio.flow.service.IXinhuFlowModetplService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 模块多模版设置Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-flow/modetpl")
public class XinhuFlowModetplController extends BaseController
{
    @Autowired
    private IXinhuFlowModetplService xinhuFlowModetplService;

    /**
     * 查询模块多模版设置列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:modetpl:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuFlowModetpl xinhuFlowModetpl)
    {
        startPage();
        List<XinhuFlowModetpl> list = xinhuFlowModetplService.selectXinhuFlowModetplList(xinhuFlowModetpl);
        return getDataTable(list);
    }

    /**
     * 导出模块多模版设置列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:modetpl:export')")
    @Log(title = "模块多模版设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuFlowModetpl xinhuFlowModetpl)
    {
        List<XinhuFlowModetpl> list = xinhuFlowModetplService.selectXinhuFlowModetplList(xinhuFlowModetpl);
        ExcelUtil<XinhuFlowModetpl> util = new ExcelUtil<XinhuFlowModetpl>(XinhuFlowModetpl.class);
        util.exportExcel(response, list, "模块多模版设置数据");
    }

    /**
     * 获取模块多模版设置详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:modetpl:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuFlowModetplService.selectXinhuFlowModetplById(id));
    }

    /**
     * 新增模块多模版设置
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:modetpl:add')")
    @Log(title = "模块多模版设置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuFlowModetpl xinhuFlowModetpl)
    {
        return toAjax(xinhuFlowModetplService.insertXinhuFlowModetpl(xinhuFlowModetpl));
    }

    /**
     * 修改模块多模版设置
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:modetpl:edit')")
    @Log(title = "模块多模版设置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuFlowModetpl xinhuFlowModetpl)
    {
        return toAjax(xinhuFlowModetplService.updateXinhuFlowModetpl(xinhuFlowModetpl));
    }

    /**
     * 删除模块多模版设置
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:modetpl:remove')")
    @Log(title = "模块多模版设置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuFlowModetplService.deleteXinhuFlowModetplByIds(ids));
    }
}
