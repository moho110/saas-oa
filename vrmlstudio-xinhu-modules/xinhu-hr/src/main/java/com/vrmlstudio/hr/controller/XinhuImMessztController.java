package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuImMesszt;
import com.vrmlstudio.hr.service.IXinhuImMessztService;
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
 * IM聊天消息状态Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/messzt")
public class XinhuImMessztController extends BaseController
{
    @Autowired
    private IXinhuImMessztService xinhuImMessztService;

    /**
     * 查询IM聊天消息状态列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:messzt:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuImMesszt xinhuImMesszt)
    {
        startPage();
        List<XinhuImMesszt> list = xinhuImMessztService.selectXinhuImMessztList(xinhuImMesszt);
        return getDataTable(list);
    }

    /**
     * 导出IM聊天消息状态列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:messzt:export')")
    @Log(title = "IM聊天消息状态", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuImMesszt xinhuImMesszt)
    {
        List<XinhuImMesszt> list = xinhuImMessztService.selectXinhuImMessztList(xinhuImMesszt);
        ExcelUtil<XinhuImMesszt> util = new ExcelUtil<XinhuImMesszt>(XinhuImMesszt.class);
        util.exportExcel(response, list, "IM聊天消息状态数据");
    }

    /**
     * 获取IM聊天消息状态详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:messzt:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuImMessztService.selectXinhuImMessztById(id));
    }

    /**
     * 新增IM聊天消息状态
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:messzt:add')")
    @Log(title = "IM聊天消息状态", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuImMesszt xinhuImMesszt)
    {
        return toAjax(xinhuImMessztService.insertXinhuImMesszt(xinhuImMesszt));
    }

    /**
     * 修改IM聊天消息状态
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:messzt:edit')")
    @Log(title = "IM聊天消息状态", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuImMesszt xinhuImMesszt)
    {
        return toAjax(xinhuImMessztService.updateXinhuImMesszt(xinhuImMesszt));
    }

    /**
     * 删除IM聊天消息状态
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:messzt:remove')")
    @Log(title = "IM聊天消息状态", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuImMessztService.deleteXinhuImMessztByIds(ids));
    }
}
