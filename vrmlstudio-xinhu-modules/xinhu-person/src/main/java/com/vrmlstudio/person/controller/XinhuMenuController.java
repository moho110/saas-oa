package com.vrmlstudio.person.controller;

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
import com.vrmlstudio.person.domain.XinhuMenu;
import com.vrmlstudio.person.service.IXinhuMenuService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 系统菜单Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-person/menu")
public class XinhuMenuController extends BaseController
{
    @Autowired
    private IXinhuMenuService xinhuMenuService;

    /**
     * 查询系统菜单列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:menu:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuMenu xinhuMenu)
    {
        startPage();
        List<XinhuMenu> list = xinhuMenuService.selectXinhuMenuList(xinhuMenu);
        return getDataTable(list);
    }

    /**
     * 导出系统菜单列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:menu:export')")
    @Log(title = "系统菜单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuMenu xinhuMenu)
    {
        List<XinhuMenu> list = xinhuMenuService.selectXinhuMenuList(xinhuMenu);
        ExcelUtil<XinhuMenu> util = new ExcelUtil<XinhuMenu>(XinhuMenu.class);
        util.exportExcel(response, list, "系统菜单数据");
    }

    /**
     * 获取系统菜单详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:menu:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(xinhuMenuService.selectXinhuMenuById(id));
    }

    /**
     * 新增系统菜单
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:menu:add')")
    @Log(title = "系统菜单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuMenu xinhuMenu)
    {
        return toAjax(xinhuMenuService.insertXinhuMenu(xinhuMenu));
    }

    /**
     * 修改系统菜单
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:menu:edit')")
    @Log(title = "系统菜单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuMenu xinhuMenu)
    {
        return toAjax(xinhuMenuService.updateXinhuMenu(xinhuMenu));
    }

    /**
     * 删除系统菜单
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:menu:remove')")
    @Log(title = "系统菜单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(xinhuMenuService.deleteXinhuMenuByIds(ids));
    }
}
