package com.vrmlstudio.xsystem.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
import com.vrmlstudio.xsystem.domain.XinhuOption;
import com.vrmlstudio.xsystem.service.IXinhuOptionService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 系统选项Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-system/option")
public class XinhuOptionController extends BaseController
{
    @Autowired
    private IXinhuOptionService xinhuOptionService;

    /**
     * 查询系统选项列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:option:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuOption xinhuOption)
    {
        startPage();
        List<XinhuOption> list = xinhuOptionService.selectXinhuOptionList(xinhuOption);
        return getDataTable(list);
    }

    /**
     * 导出系统选项列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:option:export')")
    @Log(title = "系统选项", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuOption xinhuOption)
    {
        List<XinhuOption> list = xinhuOptionService.selectXinhuOptionList(xinhuOption);
        ExcelUtil<XinhuOption> util = new ExcelUtil<XinhuOption>(XinhuOption.class);
        util.exportExcel(response, list, "系统选项数据");
    }

    /**
     * 获取系统选项详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:option:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuOptionService.selectXinhuOptionById(id));
    }

    /**
     * 新增系统选项
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:option:add')")
    @Log(title = "系统选项", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuOption xinhuOption)
    {
        return toAjax(xinhuOptionService.insertXinhuOption(xinhuOption));
    }

    /**
     * 修改系统选项
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:option:edit')")
    @Log(title = "系统选项", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuOption xinhuOption)
    {
        return toAjax(xinhuOptionService.updateXinhuOption(xinhuOption));
    }

    /**
     * 删除系统选项
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:option:remove')")
    @Log(title = "系统选项", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuOptionService.deleteXinhuOptionByIds(ids));
    }
}
