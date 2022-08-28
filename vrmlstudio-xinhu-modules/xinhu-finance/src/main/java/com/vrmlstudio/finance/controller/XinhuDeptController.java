package com.vrmlstudio.finance.controller;

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
import com.vrmlstudio.finance.domain.XinhuDept;
import com.vrmlstudio.finance.service.IXinhuDeptService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;

/**
 * 组织结构部门Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-finance/dept")
public class XinhuDeptController extends BaseController
{
    @Autowired
    private IXinhuDeptService xinhuDeptService;

    /**
     * 查询组织结构部门列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:dept:list')")
    @GetMapping("/list")
    public AjaxResult list(XinhuDept xinhuDept)
    {
        List<XinhuDept> list = xinhuDeptService.selectXinhuDeptList(xinhuDept);
        return AjaxResult.success(list);
    }

    /**
     * 导出组织结构部门列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:dept:export')")
    @Log(title = "组织结构部门", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuDept xinhuDept)
    {
        List<XinhuDept> list = xinhuDeptService.selectXinhuDeptList(xinhuDept);
        ExcelUtil<XinhuDept> util = new ExcelUtil<XinhuDept>(XinhuDept.class);
        util.exportExcel(response, list, "组织结构部门数据");
    }

    /**
     * 获取组织结构部门详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:dept:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuDeptService.selectXinhuDeptById(id));
    }

    /**
     * 新增组织结构部门
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:dept:add')")
    @Log(title = "组织结构部门", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuDept xinhuDept)
    {
        return toAjax(xinhuDeptService.insertXinhuDept(xinhuDept));
    }

    /**
     * 修改组织结构部门
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:dept:edit')")
    @Log(title = "组织结构部门", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuDept xinhuDept)
    {
        return toAjax(xinhuDeptService.updateXinhuDept(xinhuDept));
    }

    /**
     * 删除组织结构部门
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:dept:remove')")
    @Log(title = "组织结构部门", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuDeptService.deleteXinhuDeptByIds(ids));
    }
}
