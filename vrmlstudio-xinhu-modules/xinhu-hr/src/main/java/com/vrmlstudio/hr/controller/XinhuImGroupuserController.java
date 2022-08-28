package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuImGroupuser;
import com.vrmlstudio.hr.service.IXinhuImGroupuserService;
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
 * IM会话人员Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/groupuser")
public class XinhuImGroupuserController extends BaseController
{
    @Autowired
    private IXinhuImGroupuserService xinhuImGroupuserService;

    /**
     * 查询IM会话人员列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:groupuser:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuImGroupuser xinhuImGroupuser)
    {
        startPage();
        List<XinhuImGroupuser> list = xinhuImGroupuserService.selectXinhuImGroupuserList(xinhuImGroupuser);
        return getDataTable(list);
    }

    /**
     * 导出IM会话人员列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:groupuser:export')")
    @Log(title = "IM会话人员", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuImGroupuser xinhuImGroupuser)
    {
        List<XinhuImGroupuser> list = xinhuImGroupuserService.selectXinhuImGroupuserList(xinhuImGroupuser);
        ExcelUtil<XinhuImGroupuser> util = new ExcelUtil<XinhuImGroupuser>(XinhuImGroupuser.class);
        util.exportExcel(response, list, "IM会话人员数据");
    }

    /**
     * 获取IM会话人员详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:groupuser:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuImGroupuserService.selectXinhuImGroupuserById(id));
    }

    /**
     * 新增IM会话人员
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:groupuser:add')")
    @Log(title = "IM会话人员", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuImGroupuser xinhuImGroupuser)
    {
        return toAjax(xinhuImGroupuserService.insertXinhuImGroupuser(xinhuImGroupuser));
    }

    /**
     * 修改IM会话人员
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:groupuser:edit')")
    @Log(title = "IM会话人员", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuImGroupuser xinhuImGroupuser)
    {
        return toAjax(xinhuImGroupuserService.updateXinhuImGroupuser(xinhuImGroupuser));
    }

    /**
     * 删除IM会话人员
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:groupuser:remove')")
    @Log(title = "IM会话人员", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuImGroupuserService.deleteXinhuImGroupuserByIds(ids));
    }
}
