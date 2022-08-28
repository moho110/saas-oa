package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuHrkaohem;
import com.vrmlstudio.hr.service.IXinhuHrkaohemService;
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
 * 考核项目Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/hrkaohem")
public class XinhuHrkaohemController extends BaseController
{
    @Autowired
    private IXinhuHrkaohemService xinhuHrkaohemService;

    /**
     * 查询考核项目列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrkaohem:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuHrkaohem xinhuHrkaohem)
    {
        startPage();
        List<XinhuHrkaohem> list = xinhuHrkaohemService.selectXinhuHrkaohemList(xinhuHrkaohem);
        return getDataTable(list);
    }

    /**
     * 导出考核项目列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrkaohem:export')")
    @Log(title = "考核项目", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuHrkaohem xinhuHrkaohem)
    {
        List<XinhuHrkaohem> list = xinhuHrkaohemService.selectXinhuHrkaohemList(xinhuHrkaohem);
        ExcelUtil<XinhuHrkaohem> util = new ExcelUtil<XinhuHrkaohem>(XinhuHrkaohem.class);
        util.exportExcel(response, list, "考核项目数据");
    }

    /**
     * 获取考核项目详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrkaohem:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuHrkaohemService.selectXinhuHrkaohemById(id));
    }

    /**
     * 新增考核项目
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrkaohem:add')")
    @Log(title = "考核项目", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuHrkaohem xinhuHrkaohem)
    {
        return toAjax(xinhuHrkaohemService.insertXinhuHrkaohem(xinhuHrkaohem));
    }

    /**
     * 修改考核项目
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrkaohem:edit')")
    @Log(title = "考核项目", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuHrkaohem xinhuHrkaohem)
    {
        return toAjax(xinhuHrkaohemService.updateXinhuHrkaohem(xinhuHrkaohem));
    }

    /**
     * 删除考核项目
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrkaohem:remove')")
    @Log(title = "考核项目", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuHrkaohemService.deleteXinhuHrkaohemByIds(ids));
    }
}
