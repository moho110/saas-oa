package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuKqsjgz;
import com.vrmlstudio.hr.service.IXinhuKqsjgzService;
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
 * 考勤时间规则Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/kqsjgz")
public class XinhuKqsjgzController extends BaseController
{
    @Autowired
    private IXinhuKqsjgzService xinhuKqsjgzService;

    /**
     * 查询考勤时间规则列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqsjgz:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuKqsjgz xinhuKqsjgz)
    {
        startPage();
        List<XinhuKqsjgz> list = xinhuKqsjgzService.selectXinhuKqsjgzList(xinhuKqsjgz);
        return getDataTable(list);
    }

    /**
     * 导出考勤时间规则列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqsjgz:export')")
    @Log(title = "考勤时间规则", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuKqsjgz xinhuKqsjgz)
    {
        List<XinhuKqsjgz> list = xinhuKqsjgzService.selectXinhuKqsjgzList(xinhuKqsjgz);
        ExcelUtil<XinhuKqsjgz> util = new ExcelUtil<XinhuKqsjgz>(XinhuKqsjgz.class);
        util.exportExcel(response, list, "考勤时间规则数据");
    }

    /**
     * 获取考勤时间规则详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqsjgz:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(xinhuKqsjgzService.selectXinhuKqsjgzById(id));
    }

    /**
     * 新增考勤时间规则
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqsjgz:add')")
    @Log(title = "考勤时间规则", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuKqsjgz xinhuKqsjgz)
    {
        return toAjax(xinhuKqsjgzService.insertXinhuKqsjgz(xinhuKqsjgz));
    }

    /**
     * 修改考勤时间规则
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqsjgz:edit')")
    @Log(title = "考勤时间规则", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuKqsjgz xinhuKqsjgz)
    {
        return toAjax(xinhuKqsjgzService.updateXinhuKqsjgz(xinhuKqsjgz));
    }

    /**
     * 删除考勤时间规则
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqsjgz:remove')")
    @Log(title = "考勤时间规则", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(xinhuKqsjgzService.deleteXinhuKqsjgzByIds(ids));
    }
}
