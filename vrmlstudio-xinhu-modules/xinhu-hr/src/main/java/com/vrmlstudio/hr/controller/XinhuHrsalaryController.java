package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuHrsalary;
import com.vrmlstudio.hr.service.IXinhuHrsalaryService;
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
 * 工资Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/hrsalary")
public class XinhuHrsalaryController extends BaseController
{
    @Autowired
    private IXinhuHrsalaryService xinhuHrsalaryService;

    /**
     * 查询工资列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrsalary:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuHrsalary xinhuHrsalary)
    {
        startPage();
        List<XinhuHrsalary> list = xinhuHrsalaryService.selectXinhuHrsalaryList(xinhuHrsalary);
        return getDataTable(list);
    }

    /**
     * 导出工资列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrsalary:export')")
    @Log(title = "工资", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuHrsalary xinhuHrsalary)
    {
        List<XinhuHrsalary> list = xinhuHrsalaryService.selectXinhuHrsalaryList(xinhuHrsalary);
        ExcelUtil<XinhuHrsalary> util = new ExcelUtil<XinhuHrsalary>(XinhuHrsalary.class);
        util.exportExcel(response, list, "工资数据");
    }

    /**
     * 获取工资详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrsalary:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuHrsalaryService.selectXinhuHrsalaryById(id));
    }

    /**
     * 新增工资
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrsalary:add')")
    @Log(title = "工资", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuHrsalary xinhuHrsalary)
    {
        return toAjax(xinhuHrsalaryService.insertXinhuHrsalary(xinhuHrsalary));
    }

    /**
     * 修改工资
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrsalary:edit')")
    @Log(title = "工资", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuHrsalary xinhuHrsalary)
    {
        return toAjax(xinhuHrsalaryService.updateXinhuHrsalary(xinhuHrsalary));
    }

    /**
     * 删除工资
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrsalary:remove')")
    @Log(title = "工资", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuHrsalaryService.deleteXinhuHrsalaryByIds(ids));
    }
}
