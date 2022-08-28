package com.vrmlstudio.police.controller;

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
import com.vrmlstudio.police.domain.XinhuEmailCont;
import com.vrmlstudio.police.service.IXinhuEmailContService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 系统发送邮件内容Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-police/cont")
public class XinhuEmailContController extends BaseController
{
    @Autowired
    private IXinhuEmailContService xinhuEmailContService;

    /**
     * 查询系统发送邮件内容列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:cont:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuEmailCont xinhuEmailCont)
    {
        startPage();
        List<XinhuEmailCont> list = xinhuEmailContService.selectXinhuEmailContList(xinhuEmailCont);
        return getDataTable(list);
    }

    /**
     * 导出系统发送邮件内容列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:cont:export')")
    @Log(title = "系统发送邮件内容", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuEmailCont xinhuEmailCont)
    {
        List<XinhuEmailCont> list = xinhuEmailContService.selectXinhuEmailContList(xinhuEmailCont);
        ExcelUtil<XinhuEmailCont> util = new ExcelUtil<XinhuEmailCont>(XinhuEmailCont.class);
        util.exportExcel(response, list, "系统发送邮件内容数据");
    }

    /**
     * 获取系统发送邮件内容详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:cont:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuEmailContService.selectXinhuEmailContById(id));
    }

    /**
     * 新增系统发送邮件内容
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:cont:add')")
    @Log(title = "系统发送邮件内容", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuEmailCont xinhuEmailCont)
    {
        return toAjax(xinhuEmailContService.insertXinhuEmailCont(xinhuEmailCont));
    }

    /**
     * 修改系统发送邮件内容
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:cont:edit')")
    @Log(title = "系统发送邮件内容", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuEmailCont xinhuEmailCont)
    {
        return toAjax(xinhuEmailContService.updateXinhuEmailCont(xinhuEmailCont));
    }

    /**
     * 删除系统发送邮件内容
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:cont:remove')")
    @Log(title = "系统发送邮件内容", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuEmailContService.deleteXinhuEmailContByIds(ids));
    }
}
