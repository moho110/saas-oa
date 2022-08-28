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
import com.vrmlstudio.resources.domain.XinhuSubscribe;
import com.vrmlstudio.resources.service.IXinhuSubscribeService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 订阅管理Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-resources/subscribe")
public class XinhuSubscribeController extends BaseController
{
    @Autowired
    private IXinhuSubscribeService xinhuSubscribeService;

    /**
     * 查询订阅管理列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:subscribe:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuSubscribe xinhuSubscribe)
    {
        startPage();
        List<XinhuSubscribe> list = xinhuSubscribeService.selectXinhuSubscribeList(xinhuSubscribe);
        return getDataTable(list);
    }

    /**
     * 导出订阅管理列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:subscribe:export')")
    @Log(title = "订阅管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuSubscribe xinhuSubscribe)
    {
        List<XinhuSubscribe> list = xinhuSubscribeService.selectXinhuSubscribeList(xinhuSubscribe);
        ExcelUtil<XinhuSubscribe> util = new ExcelUtil<XinhuSubscribe>(XinhuSubscribe.class);
        util.exportExcel(response, list, "订阅管理数据");
    }

    /**
     * 获取订阅管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:subscribe:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuSubscribeService.selectXinhuSubscribeById(id));
    }

    /**
     * 新增订阅管理
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:subscribe:add')")
    @Log(title = "订阅管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuSubscribe xinhuSubscribe)
    {
        return toAjax(xinhuSubscribeService.insertXinhuSubscribe(xinhuSubscribe));
    }

    /**
     * 修改订阅管理
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:subscribe:edit')")
    @Log(title = "订阅管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuSubscribe xinhuSubscribe)
    {
        return toAjax(xinhuSubscribeService.updateXinhuSubscribe(xinhuSubscribe));
    }

    /**
     * 删除订阅管理
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:subscribe:remove')")
    @Log(title = "订阅管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuSubscribeService.deleteXinhuSubscribeByIds(ids));
    }
}
