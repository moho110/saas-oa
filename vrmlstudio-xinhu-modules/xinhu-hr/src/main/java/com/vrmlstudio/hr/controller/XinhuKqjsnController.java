package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuKqjsn;
import com.vrmlstudio.hr.service.IXinhuKqjsnService;
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
 * 考勤机设备Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/kqjsn")
public class XinhuKqjsnController extends BaseController
{
    @Autowired
    private IXinhuKqjsnService xinhuKqjsnService;

    /**
     * 查询考勤机设备列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqjsn:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuKqjsn xinhuKqjsn)
    {
        startPage();
        List<XinhuKqjsn> list = xinhuKqjsnService.selectXinhuKqjsnList(xinhuKqjsn);
        return getDataTable(list);
    }

    /**
     * 导出考勤机设备列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqjsn:export')")
    @Log(title = "考勤机设备", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuKqjsn xinhuKqjsn)
    {
        List<XinhuKqjsn> list = xinhuKqjsnService.selectXinhuKqjsnList(xinhuKqjsn);
        ExcelUtil<XinhuKqjsn> util = new ExcelUtil<XinhuKqjsn>(XinhuKqjsn.class);
        util.exportExcel(response, list, "考勤机设备数据");
    }

    /**
     * 获取考勤机设备详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqjsn:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuKqjsnService.selectXinhuKqjsnById(id));
    }

    /**
     * 新增考勤机设备
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqjsn:add')")
    @Log(title = "考勤机设备", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuKqjsn xinhuKqjsn)
    {
        return toAjax(xinhuKqjsnService.insertXinhuKqjsn(xinhuKqjsn));
    }

    /**
     * 修改考勤机设备
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqjsn:edit')")
    @Log(title = "考勤机设备", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuKqjsn xinhuKqjsn)
    {
        return toAjax(xinhuKqjsnService.updateXinhuKqjsn(xinhuKqjsn));
    }

    /**
     * 删除考勤机设备
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqjsn:remove')")
    @Log(title = "考勤机设备", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuKqjsnService.deleteXinhuKqjsnByIds(ids));
    }
}
