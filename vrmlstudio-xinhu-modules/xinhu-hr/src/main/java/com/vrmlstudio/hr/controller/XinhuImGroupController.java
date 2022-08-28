package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuImGroup;
import com.vrmlstudio.hr.service.IXinhuImGroupService;
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
 * IM会话Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/group")
public class XinhuImGroupController extends BaseController
{
    @Autowired
    private IXinhuImGroupService xinhuImGroupService;

    /**
     * 查询IM会话列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:group:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuImGroup xinhuImGroup)
    {
        startPage();
        List<XinhuImGroup> list = xinhuImGroupService.selectXinhuImGroupList(xinhuImGroup);
        return getDataTable(list);
    }

    /**
     * 导出IM会话列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:group:export')")
    @Log(title = "IM会话", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuImGroup xinhuImGroup)
    {
        List<XinhuImGroup> list = xinhuImGroupService.selectXinhuImGroupList(xinhuImGroup);
        ExcelUtil<XinhuImGroup> util = new ExcelUtil<XinhuImGroup>(XinhuImGroup.class);
        util.exportExcel(response, list, "IM会话数据");
    }

    /**
     * 获取IM会话详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:group:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuImGroupService.selectXinhuImGroupById(id));
    }

    /**
     * 新增IM会话
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:group:add')")
    @Log(title = "IM会话", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuImGroup xinhuImGroup)
    {
        return toAjax(xinhuImGroupService.insertXinhuImGroup(xinhuImGroup));
    }

    /**
     * 修改IM会话
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:group:edit')")
    @Log(title = "IM会话", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuImGroup xinhuImGroup)
    {
        return toAjax(xinhuImGroupService.updateXinhuImGroup(xinhuImGroup));
    }

    /**
     * 删除IM会话
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:group:remove')")
    @Log(title = "IM会话", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuImGroupService.deleteXinhuImGroupByIds(ids));
    }
}
