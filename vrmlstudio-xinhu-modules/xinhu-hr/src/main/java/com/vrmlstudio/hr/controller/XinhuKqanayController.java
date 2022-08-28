package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuKqanay;
import com.vrmlstudio.hr.service.IXinhuKqanayService;
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
 * 考勤分析Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/kqanay")
public class XinhuKqanayController extends BaseController
{
    @Autowired
    private IXinhuKqanayService xinhuKqanayService;

    /**
     * 查询考勤分析列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqanay:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuKqanay xinhuKqanay)
    {
        startPage();
        List<XinhuKqanay> list = xinhuKqanayService.selectXinhuKqanayList(xinhuKqanay);
        return getDataTable(list);
    }

    /**
     * 导出考勤分析列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqanay:export')")
    @Log(title = "考勤分析", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuKqanay xinhuKqanay)
    {
        List<XinhuKqanay> list = xinhuKqanayService.selectXinhuKqanayList(xinhuKqanay);
        ExcelUtil<XinhuKqanay> util = new ExcelUtil<XinhuKqanay>(XinhuKqanay.class);
        util.exportExcel(response, list, "考勤分析数据");
    }

    /**
     * 获取考勤分析详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqanay:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuKqanayService.selectXinhuKqanayById(id));
    }

    /**
     * 新增考勤分析
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqanay:add')")
    @Log(title = "考勤分析", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuKqanay xinhuKqanay)
    {
        return toAjax(xinhuKqanayService.insertXinhuKqanay(xinhuKqanay));
    }

    /**
     * 修改考勤分析
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqanay:edit')")
    @Log(title = "考勤分析", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuKqanay xinhuKqanay)
    {
        return toAjax(xinhuKqanayService.updateXinhuKqanay(xinhuKqanay));
    }

    /**
     * 删除考勤分析
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqanay:remove')")
    @Log(title = "考勤分析", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuKqanayService.deleteXinhuKqanayByIds(ids));
    }
}
