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
import com.vrmlstudio.xsystem.domain.XinhuGroup;
import com.vrmlstudio.xsystem.service.IXinhuGroupService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 系统组Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-system/group")
public class XinhuGroupController extends BaseController
{
    @Autowired
    private IXinhuGroupService xinhuGroupService;

    /**
     * 查询系统组列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:group:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuGroup xinhuGroup)
    {
        startPage();
        List<XinhuGroup> list = xinhuGroupService.selectXinhuGroupList(xinhuGroup);
        return getDataTable(list);
    }

    /**
     * 导出系统组列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:group:export')")
    @Log(title = "系统组", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuGroup xinhuGroup)
    {
        List<XinhuGroup> list = xinhuGroupService.selectXinhuGroupList(xinhuGroup);
        ExcelUtil<XinhuGroup> util = new ExcelUtil<XinhuGroup>(XinhuGroup.class);
        util.exportExcel(response, list, "系统组数据");
    }

    /**
     * 获取系统组详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:group:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuGroupService.selectXinhuGroupById(id));
    }

    /**
     * 新增系统组
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:group:add')")
    @Log(title = "系统组", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuGroup xinhuGroup)
    {
        return toAjax(xinhuGroupService.insertXinhuGroup(xinhuGroup));
    }

    /**
     * 修改系统组
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:group:edit')")
    @Log(title = "系统组", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuGroup xinhuGroup)
    {
        return toAjax(xinhuGroupService.updateXinhuGroup(xinhuGroup));
    }

    /**
     * 删除系统组
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:group:remove')")
    @Log(title = "系统组", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuGroupService.deleteXinhuGroupByIds(ids));
    }
}
