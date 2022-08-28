package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuKqxxsj;
import com.vrmlstudio.hr.service.IXinhuKqxxsjService;
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
 * 休息时间规则Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/kqxxsj")
public class XinhuKqxxsjController extends BaseController
{
    @Autowired
    private IXinhuKqxxsjService xinhuKqxxsjService;

    /**
     * 查询休息时间规则列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqxxsj:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuKqxxsj xinhuKqxxsj)
    {
        startPage();
        List<XinhuKqxxsj> list = xinhuKqxxsjService.selectXinhuKqxxsjList(xinhuKqxxsj);
        return getDataTable(list);
    }

    /**
     * 导出休息时间规则列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqxxsj:export')")
    @Log(title = "休息时间规则", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuKqxxsj xinhuKqxxsj)
    {
        List<XinhuKqxxsj> list = xinhuKqxxsjService.selectXinhuKqxxsjList(xinhuKqxxsj);
        ExcelUtil<XinhuKqxxsj> util = new ExcelUtil<XinhuKqxxsj>(XinhuKqxxsj.class);
        util.exportExcel(response, list, "休息时间规则数据");
    }

    /**
     * 获取休息时间规则详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqxxsj:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuKqxxsjService.selectXinhuKqxxsjById(id));
    }

    /**
     * 新增休息时间规则
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqxxsj:add')")
    @Log(title = "休息时间规则", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuKqxxsj xinhuKqxxsj)
    {
        return toAjax(xinhuKqxxsjService.insertXinhuKqxxsj(xinhuKqxxsj));
    }

    /**
     * 修改休息时间规则
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqxxsj:edit')")
    @Log(title = "休息时间规则", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuKqxxsj xinhuKqxxsj)
    {
        return toAjax(xinhuKqxxsjService.updateXinhuKqxxsj(xinhuKqxxsj));
    }

    /**
     * 删除休息时间规则
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqxxsj:remove')")
    @Log(title = "休息时间规则", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuKqxxsjService.deleteXinhuKqxxsjByIds(ids));
    }
}
