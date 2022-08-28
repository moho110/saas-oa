package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuKqdw;
import com.vrmlstudio.hr.service.IXinhuKqdwService;
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
 * 考勤定位规则Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/kqdw")
public class XinhuKqdwController extends BaseController
{
    @Autowired
    private IXinhuKqdwService xinhuKqdwService;

    /**
     * 查询考勤定位规则列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqdw:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuKqdw xinhuKqdw)
    {
        startPage();
        List<XinhuKqdw> list = xinhuKqdwService.selectXinhuKqdwList(xinhuKqdw);
        return getDataTable(list);
    }

    /**
     * 导出考勤定位规则列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqdw:export')")
    @Log(title = "考勤定位规则", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuKqdw xinhuKqdw)
    {
        List<XinhuKqdw> list = xinhuKqdwService.selectXinhuKqdwList(xinhuKqdw);
        ExcelUtil<XinhuKqdw> util = new ExcelUtil<XinhuKqdw>(XinhuKqdw.class);
        util.exportExcel(response, list, "考勤定位规则数据");
    }

    /**
     * 获取考勤定位规则详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqdw:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(xinhuKqdwService.selectXinhuKqdwById(id));
    }

    /**
     * 新增考勤定位规则
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqdw:add')")
    @Log(title = "考勤定位规则", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuKqdw xinhuKqdw)
    {
        return toAjax(xinhuKqdwService.insertXinhuKqdw(xinhuKqdw));
    }

    /**
     * 修改考勤定位规则
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqdw:edit')")
    @Log(title = "考勤定位规则", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuKqdw xinhuKqdw)
    {
        return toAjax(xinhuKqdwService.updateXinhuKqdw(xinhuKqdw));
    }

    /**
     * 删除考勤定位规则
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqdw:remove')")
    @Log(title = "考勤定位规则", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(xinhuKqdwService.deleteXinhuKqdwByIds(ids));
    }
}
