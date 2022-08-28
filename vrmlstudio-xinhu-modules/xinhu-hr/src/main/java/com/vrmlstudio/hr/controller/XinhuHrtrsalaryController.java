package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuHrtrsalary;
import com.vrmlstudio.hr.service.IXinhuHrtrsalaryService;
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
 * 调薪申请Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/hrtrsalary")
public class XinhuHrtrsalaryController extends BaseController
{
    @Autowired
    private IXinhuHrtrsalaryService xinhuHrtrsalaryService;

    /**
     * 查询调薪申请列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrtrsalary:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuHrtrsalary xinhuHrtrsalary)
    {
        startPage();
        List<XinhuHrtrsalary> list = xinhuHrtrsalaryService.selectXinhuHrtrsalaryList(xinhuHrtrsalary);
        return getDataTable(list);
    }

    /**
     * 导出调薪申请列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrtrsalary:export')")
    @Log(title = "调薪申请", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuHrtrsalary xinhuHrtrsalary)
    {
        List<XinhuHrtrsalary> list = xinhuHrtrsalaryService.selectXinhuHrtrsalaryList(xinhuHrtrsalary);
        ExcelUtil<XinhuHrtrsalary> util = new ExcelUtil<XinhuHrtrsalary>(XinhuHrtrsalary.class);
        util.exportExcel(response, list, "调薪申请数据");
    }

    /**
     * 获取调薪申请详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrtrsalary:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuHrtrsalaryService.selectXinhuHrtrsalaryById(id));
    }

    /**
     * 新增调薪申请
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrtrsalary:add')")
    @Log(title = "调薪申请", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuHrtrsalary xinhuHrtrsalary)
    {
        return toAjax(xinhuHrtrsalaryService.insertXinhuHrtrsalary(xinhuHrtrsalary));
    }

    /**
     * 修改调薪申请
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrtrsalary:edit')")
    @Log(title = "调薪申请", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuHrtrsalary xinhuHrtrsalary)
    {
        return toAjax(xinhuHrtrsalaryService.updateXinhuHrtrsalary(xinhuHrtrsalary));
    }

    /**
     * 删除调薪申请
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrtrsalary:remove')")
    @Log(title = "调薪申请", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuHrtrsalaryService.deleteXinhuHrtrsalaryByIds(ids));
    }
}
