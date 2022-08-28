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
import com.vrmlstudio.person.domain.XinhuUserinfo;
import com.vrmlstudio.person.service.IXinhuUserinfoService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 用户档案Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-person/userinfo")
public class XinhuUserinfoController extends BaseController
{
    @Autowired
    private IXinhuUserinfoService xinhuUserinfoService;

    /**
     * 查询用户档案列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:userinfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuUserinfo xinhuUserinfo)
    {
        startPage();
        List<XinhuUserinfo> list = xinhuUserinfoService.selectXinhuUserinfoList(xinhuUserinfo);
        return getDataTable(list);
    }

    /**
     * 导出用户档案列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:userinfo:export')")
    @Log(title = "用户档案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuUserinfo xinhuUserinfo)
    {
        List<XinhuUserinfo> list = xinhuUserinfoService.selectXinhuUserinfoList(xinhuUserinfo);
        ExcelUtil<XinhuUserinfo> util = new ExcelUtil<XinhuUserinfo>(XinhuUserinfo.class);
        util.exportExcel(response, list, "用户档案数据");
    }

    /**
     * 获取用户档案详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:userinfo:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(xinhuUserinfoService.selectXinhuUserinfoById(id));
    }

    /**
     * 新增用户档案
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:userinfo:add')")
    @Log(title = "用户档案", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuUserinfo xinhuUserinfo)
    {
        return toAjax(xinhuUserinfoService.insertXinhuUserinfo(xinhuUserinfo));
    }

    /**
     * 修改用户档案
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:userinfo:edit')")
    @Log(title = "用户档案", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuUserinfo xinhuUserinfo)
    {
        return toAjax(xinhuUserinfoService.updateXinhuUserinfo(xinhuUserinfo));
    }

    /**
     * 删除用户档案
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:userinfo:remove')")
    @Log(title = "用户档案", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuUserinfoService.deleteXinhuUserinfoByIds(ids));
    }
}
