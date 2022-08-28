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
import com.vrmlstudio.xsystem.domain.XinhuLogintoken;
import com.vrmlstudio.xsystem.service.IXinhuLogintokenService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 系统登录tokenController
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-system/logintoken")
public class XinhuLogintokenController extends BaseController
{
    @Autowired
    private IXinhuLogintokenService xinhuLogintokenService;

    /**
     * 查询系统登录token列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:logintoken:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuLogintoken xinhuLogintoken)
    {
        startPage();
        List<XinhuLogintoken> list = xinhuLogintokenService.selectXinhuLogintokenList(xinhuLogintoken);
        return getDataTable(list);
    }

    /**
     * 导出系统登录token列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:logintoken:export')")
    @Log(title = "系统登录token", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuLogintoken xinhuLogintoken)
    {
        List<XinhuLogintoken> list = xinhuLogintokenService.selectXinhuLogintokenList(xinhuLogintoken);
        ExcelUtil<XinhuLogintoken> util = new ExcelUtil<XinhuLogintoken>(XinhuLogintoken.class);
        util.exportExcel(response, list, "系统登录token数据");
    }

    /**
     * 获取系统登录token详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:logintoken:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuLogintokenService.selectXinhuLogintokenById(id));
    }

    /**
     * 新增系统登录token
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:logintoken:add')")
    @Log(title = "系统登录token", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuLogintoken xinhuLogintoken)
    {
        return toAjax(xinhuLogintokenService.insertXinhuLogintoken(xinhuLogintoken));
    }

    /**
     * 修改系统登录token
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:logintoken:edit')")
    @Log(title = "系统登录token", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuLogintoken xinhuLogintoken)
    {
        return toAjax(xinhuLogintokenService.updateXinhuLogintoken(xinhuLogintoken));
    }

    /**
     * 删除系统登录token
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:logintoken:remove')")
    @Log(title = "系统登录token", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuLogintokenService.deleteXinhuLogintokenByIds(ids));
    }
}
