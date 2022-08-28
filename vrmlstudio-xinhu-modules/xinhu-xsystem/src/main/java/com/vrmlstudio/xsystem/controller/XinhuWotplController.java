package com.vrmlstudio.xsystem.controller;

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
import com.vrmlstudio.xsystem.domain.XinhuWotpl;
import com.vrmlstudio.xsystem.service.IXinhuWotplService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 微信公众号消息模版Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-system/wotpl")
public class XinhuWotplController extends BaseController
{
    @Autowired
    private IXinhuWotplService xinhuWotplService;

    /**
     * 查询微信公众号消息模版列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:wotpl:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuWotpl xinhuWotpl)
    {
        startPage();
        List<XinhuWotpl> list = xinhuWotplService.selectXinhuWotplList(xinhuWotpl);
        return getDataTable(list);
    }

    /**
     * 导出微信公众号消息模版列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:wotpl:export')")
    @Log(title = "微信公众号消息模版", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuWotpl xinhuWotpl)
    {
        List<XinhuWotpl> list = xinhuWotplService.selectXinhuWotplList(xinhuWotpl);
        ExcelUtil<XinhuWotpl> util = new ExcelUtil<XinhuWotpl>(XinhuWotpl.class);
        util.exportExcel(response, list, "微信公众号消息模版数据");
    }

    /**
     * 获取微信公众号消息模版详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:wotpl:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuWotplService.selectXinhuWotplById(id));
    }

    /**
     * 新增微信公众号消息模版
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:wotpl:add')")
    @Log(title = "微信公众号消息模版", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuWotpl xinhuWotpl)
    {
        return toAjax(xinhuWotplService.insertXinhuWotpl(xinhuWotpl));
    }

    /**
     * 修改微信公众号消息模版
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:wotpl:edit')")
    @Log(title = "微信公众号消息模版", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuWotpl xinhuWotpl)
    {
        return toAjax(xinhuWotplService.updateXinhuWotpl(xinhuWotpl));
    }

    /**
     * 删除微信公众号消息模版
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:wotpl:remove')")
    @Log(title = "微信公众号消息模版", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuWotplService.deleteXinhuWotplByIds(ids));
    }
}
