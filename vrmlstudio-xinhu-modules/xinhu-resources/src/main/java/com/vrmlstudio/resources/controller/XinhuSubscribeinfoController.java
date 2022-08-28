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
import com.vrmlstudio.resources.domain.XinhuSubscribeinfo;
import com.vrmlstudio.resources.service.IXinhuSubscribeinfoService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 订阅内容信息Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-resources/subscribeinfo")
public class XinhuSubscribeinfoController extends BaseController
{
    @Autowired
    private IXinhuSubscribeinfoService xinhuSubscribeinfoService;

    /**
     * 查询订阅内容信息列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:subscribeinfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuSubscribeinfo xinhuSubscribeinfo)
    {
        startPage();
        List<XinhuSubscribeinfo> list = xinhuSubscribeinfoService.selectXinhuSubscribeinfoList(xinhuSubscribeinfo);
        return getDataTable(list);
    }

    /**
     * 导出订阅内容信息列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:subscribeinfo:export')")
    @Log(title = "订阅内容信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuSubscribeinfo xinhuSubscribeinfo)
    {
        List<XinhuSubscribeinfo> list = xinhuSubscribeinfoService.selectXinhuSubscribeinfoList(xinhuSubscribeinfo);
        ExcelUtil<XinhuSubscribeinfo> util = new ExcelUtil<XinhuSubscribeinfo>(XinhuSubscribeinfo.class);
        util.exportExcel(response, list, "订阅内容信息数据");
    }

    /**
     * 获取订阅内容信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:subscribeinfo:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuSubscribeinfoService.selectXinhuSubscribeinfoById(id));
    }

    /**
     * 新增订阅内容信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:subscribeinfo:add')")
    @Log(title = "订阅内容信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuSubscribeinfo xinhuSubscribeinfo)
    {
        return toAjax(xinhuSubscribeinfoService.insertXinhuSubscribeinfo(xinhuSubscribeinfo));
    }

    /**
     * 修改订阅内容信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:subscribeinfo:edit')")
    @Log(title = "订阅内容信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuSubscribeinfo xinhuSubscribeinfo)
    {
        return toAjax(xinhuSubscribeinfoService.updateXinhuSubscribeinfo(xinhuSubscribeinfo));
    }

    /**
     * 删除订阅内容信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-resources:subscribeinfo:remove')")
    @Log(title = "订阅内容信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuSubscribeinfoService.deleteXinhuSubscribeinfoByIds(ids));
    }
}
