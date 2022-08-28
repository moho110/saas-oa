package com.vrmlstudio.flow.controller;

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
import com.vrmlstudio.flow.domain.XinhuFlowCname;
import com.vrmlstudio.flow.service.IXinhuFlowCnameService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 自定义审核人组Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-flow/cname")
public class XinhuFlowCnameController extends BaseController
{
    @Autowired
    private IXinhuFlowCnameService xinhuFlowCnameService;

    /**
     * 查询自定义审核人组列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:cname:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuFlowCname xinhuFlowCname)
    {
        startPage();
        List<XinhuFlowCname> list = xinhuFlowCnameService.selectXinhuFlowCnameList(xinhuFlowCname);
        return getDataTable(list);
    }

    /**
     * 导出自定义审核人组列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:cname:export')")
    @Log(title = "自定义审核人组", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuFlowCname xinhuFlowCname)
    {
        List<XinhuFlowCname> list = xinhuFlowCnameService.selectXinhuFlowCnameList(xinhuFlowCname);
        ExcelUtil<XinhuFlowCname> util = new ExcelUtil<XinhuFlowCname>(XinhuFlowCname.class);
        util.exportExcel(response, list, "自定义审核人组数据");
    }

    /**
     * 获取自定义审核人组详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:cname:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuFlowCnameService.selectXinhuFlowCnameById(id));
    }

    /**
     * 新增自定义审核人组
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:cname:add')")
    @Log(title = "自定义审核人组", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuFlowCname xinhuFlowCname)
    {
        return toAjax(xinhuFlowCnameService.insertXinhuFlowCname(xinhuFlowCname));
    }

    /**
     * 修改自定义审核人组
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:cname:edit')")
    @Log(title = "自定义审核人组", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuFlowCname xinhuFlowCname)
    {
        return toAjax(xinhuFlowCnameService.updateXinhuFlowCname(xinhuFlowCname));
    }

    /**
     * 删除自定义审核人组
     */
    @PreAuthorize("@ss.hasPermi('xinhu-flow:cname:remove')")
    @Log(title = "自定义审核人组", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuFlowCnameService.deleteXinhuFlowCnameByIds(ids));
    }
}
