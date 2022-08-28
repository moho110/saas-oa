package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuImMenu;
import com.vrmlstudio.hr.service.IXinhuImMenuService;
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
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * IM下应用菜单Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/menu")
public class XinhuImMenuController extends BaseController
{
    @Autowired
    private IXinhuImMenuService xinhuImMenuService;

    /**
     * 查询IM下应用菜单列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:menu:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuImMenu xinhuImMenu)
    {
        startPage();
        List<XinhuImMenu> list = xinhuImMenuService.selectXinhuImMenuList(xinhuImMenu);
        return getDataTable(list);
    }

    /**
     * 导出IM下应用菜单列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:menu:export')")
    @Log(title = "IM下应用菜单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuImMenu xinhuImMenu)
    {
        List<XinhuImMenu> list = xinhuImMenuService.selectXinhuImMenuList(xinhuImMenu);
        ExcelUtil<XinhuImMenu> util = new ExcelUtil<XinhuImMenu>(XinhuImMenu.class);
        util.exportExcel(response, list, "IM下应用菜单数据");
    }

    /**
     * 获取IM下应用菜单详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:menu:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuImMenuService.selectXinhuImMenuById(id));
    }

    /**
     * 新增IM下应用菜单
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:menu:add')")
    @Log(title = "IM下应用菜单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuImMenu xinhuImMenu)
    {
        return toAjax(xinhuImMenuService.insertXinhuImMenu(xinhuImMenu));
    }

    /**
     * 修改IM下应用菜单
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:menu:edit')")
    @Log(title = "IM下应用菜单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuImMenu xinhuImMenu)
    {
        return toAjax(xinhuImMenuService.updateXinhuImMenu(xinhuImMenu));
    }

    /**
     * 删除IM下应用菜单
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:menu:remove')")
    @Log(title = "IM下应用菜单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuImMenuService.deleteXinhuImMenuByIds(ids));
    }
}
