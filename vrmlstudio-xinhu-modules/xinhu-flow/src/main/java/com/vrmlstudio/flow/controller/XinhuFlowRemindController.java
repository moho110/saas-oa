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
import com.vrmlstudio.flow.domain.XinhuFlowRemind;
import com.vrmlstudio.flow.service.IXinhuFlowRemindService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 单据提醒设置Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-flow/remind")
public class XinhuFlowRemindController extends BaseController
{
    @Autowired
    private IXinhuFlowRemindService xinhuFlowRemindService;

    /**
     * 查询单据提醒设置列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:remind:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuFlowRemind xinhuFlowRemind)
    {
        startPage();
        List<XinhuFlowRemind> list = xinhuFlowRemindService.selectXinhuFlowRemindList(xinhuFlowRemind);
        return getDataTable(list);
    }

    /**
     * 导出单据提醒设置列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:remind:export')")
    @Log(title = "单据提醒设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuFlowRemind xinhuFlowRemind)
    {
        List<XinhuFlowRemind> list = xinhuFlowRemindService.selectXinhuFlowRemindList(xinhuFlowRemind);
        ExcelUtil<XinhuFlowRemind> util = new ExcelUtil<XinhuFlowRemind>(XinhuFlowRemind.class);
        util.exportExcel(response, list, "单据提醒设置数据");
    }

    /**
     * 获取单据提醒设置详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:remind:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuFlowRemindService.selectXinhuFlowRemindById(id));
    }

    /**
     * 新增单据提醒设置
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:remind:add')")
    @Log(title = "单据提醒设置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuFlowRemind xinhuFlowRemind)
    {
        return toAjax(xinhuFlowRemindService.insertXinhuFlowRemind(xinhuFlowRemind));
    }

    /**
     * 修改单据提醒设置
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:remind:edit')")
    @Log(title = "单据提醒设置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuFlowRemind xinhuFlowRemind)
    {
        return toAjax(xinhuFlowRemindService.updateXinhuFlowRemind(xinhuFlowRemind));
    }

    /**
     * 删除单据提醒设置
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:remind:remove')")
    @Log(title = "单据提醒设置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuFlowRemindService.deleteXinhuFlowRemindByIds(ids));
    }
}
