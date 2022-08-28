package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuInfors;
import com.vrmlstudio.hr.service.IXinhuInforsService;
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
 * 信息子投票项Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/infors")
public class XinhuInforsController extends BaseController
{
    @Autowired
    private IXinhuInforsService xinhuInforsService;

    /**
     * 查询信息子投票项列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:infors:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuInfors xinhuInfors)
    {
        startPage();
        List<XinhuInfors> list = xinhuInforsService.selectXinhuInforsList(xinhuInfors);
        return getDataTable(list);
    }

    /**
     * 导出信息子投票项列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:infors:export')")
    @Log(title = "信息子投票项", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuInfors xinhuInfors)
    {
        List<XinhuInfors> list = xinhuInforsService.selectXinhuInforsList(xinhuInfors);
        ExcelUtil<XinhuInfors> util = new ExcelUtil<XinhuInfors>(XinhuInfors.class);
        util.exportExcel(response, list, "信息子投票项数据");
    }

    /**
     * 获取信息子投票项详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:infors:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuInforsService.selectXinhuInforsById(id));
    }

    /**
     * 新增信息子投票项
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:infors:add')")
    @Log(title = "信息子投票项", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuInfors xinhuInfors)
    {
        return toAjax(xinhuInforsService.insertXinhuInfors(xinhuInfors));
    }

    /**
     * 修改信息子投票项
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:infors:edit')")
    @Log(title = "信息子投票项", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuInfors xinhuInfors)
    {
        return toAjax(xinhuInforsService.updateXinhuInfors(xinhuInfors));
    }

    /**
     * 删除信息子投票项
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:infors:remove')")
    @Log(title = "信息子投票项", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuInforsService.deleteXinhuInforsByIds(ids));
    }
}
