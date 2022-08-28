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
import com.vrmlstudio.xsystem.domain.XinhuSjoin;
import com.vrmlstudio.xsystem.service.IXinhuSjoinService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 后台菜单权限Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-system/sjoin")
public class XinhuSjoinController extends BaseController
{
    @Autowired
    private IXinhuSjoinService xinhuSjoinService;

    /**
     * 查询后台菜单权限列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:sjoin:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuSjoin xinhuSjoin)
    {
        startPage();
        List<XinhuSjoin> list = xinhuSjoinService.selectXinhuSjoinList(xinhuSjoin);
        return getDataTable(list);
    }

    /**
     * 导出后台菜单权限列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:sjoin:export')")
    @Log(title = "后台菜单权限", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuSjoin xinhuSjoin)
    {
        List<XinhuSjoin> list = xinhuSjoinService.selectXinhuSjoinList(xinhuSjoin);
        ExcelUtil<XinhuSjoin> util = new ExcelUtil<XinhuSjoin>(XinhuSjoin.class);
        util.exportExcel(response, list, "后台菜单权限数据");
    }

    /**
     * 获取后台菜单权限详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:sjoin:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuSjoinService.selectXinhuSjoinById(id));
    }

    /**
     * 新增后台菜单权限
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:sjoin:add')")
    @Log(title = "后台菜单权限", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuSjoin xinhuSjoin)
    {
        return toAjax(xinhuSjoinService.insertXinhuSjoin(xinhuSjoin));
    }

    /**
     * 修改后台菜单权限
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:sjoin:edit')")
    @Log(title = "后台菜单权限", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuSjoin xinhuSjoin)
    {
        return toAjax(xinhuSjoinService.updateXinhuSjoin(xinhuSjoin));
    }

    /**
     * 删除后台菜单权限
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:sjoin:remove')")
    @Log(title = "后台菜单权限", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuSjoinService.deleteXinhuSjoinByIds(ids));
    }
}
