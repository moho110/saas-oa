package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuKnowtraim;
import com.vrmlstudio.hr.service.IXinhuKnowtraimService;
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
 * 培训出题考试Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/knowtraim")
public class XinhuKnowtraimController extends BaseController
{
    @Autowired
    private IXinhuKnowtraimService xinhuKnowtraimService;

    /**
     * 查询培训出题考试列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowtraim:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuKnowtraim xinhuKnowtraim)
    {
        startPage();
        List<XinhuKnowtraim> list = xinhuKnowtraimService.selectXinhuKnowtraimList(xinhuKnowtraim);
        return getDataTable(list);
    }

    /**
     * 导出培训出题考试列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowtraim:export')")
    @Log(title = "培训出题考试", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuKnowtraim xinhuKnowtraim)
    {
        List<XinhuKnowtraim> list = xinhuKnowtraimService.selectXinhuKnowtraimList(xinhuKnowtraim);
        ExcelUtil<XinhuKnowtraim> util = new ExcelUtil<XinhuKnowtraim>(XinhuKnowtraim.class);
        util.exportExcel(response, list, "培训出题考试数据");
    }

    /**
     * 获取培训出题考试详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowtraim:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuKnowtraimService.selectXinhuKnowtraimById(id));
    }

    /**
     * 新增培训出题考试
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowtraim:add')")
    @Log(title = "培训出题考试", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuKnowtraim xinhuKnowtraim)
    {
        return toAjax(xinhuKnowtraimService.insertXinhuKnowtraim(xinhuKnowtraim));
    }

    /**
     * 修改培训出题考试
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowtraim:edit')")
    @Log(title = "培训出题考试", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuKnowtraim xinhuKnowtraim)
    {
        return toAjax(xinhuKnowtraimService.updateXinhuKnowtraim(xinhuKnowtraim));
    }

    /**
     * 删除培训出题考试
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowtraim:remove')")
    @Log(title = "培训出题考试", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuKnowtraimService.deleteXinhuKnowtraimByIds(ids));
    }
}
