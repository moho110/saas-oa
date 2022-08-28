package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuHrdemint;
import com.vrmlstudio.hr.service.IXinhuHrdemintService;
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
 * 面试和人员需求Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/hrdemint")
public class XinhuHrdemintController extends BaseController
{
    @Autowired
    private IXinhuHrdemintService xinhuHrdemintService;

    /**
     * 查询面试和人员需求列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrdemint:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuHrdemint xinhuHrdemint)
    {
        startPage();
        List<XinhuHrdemint> list = xinhuHrdemintService.selectXinhuHrdemintList(xinhuHrdemint);
        return getDataTable(list);
    }

    /**
     * 导出面试和人员需求列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrdemint:export')")
    @Log(title = "面试和人员需求", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuHrdemint xinhuHrdemint)
    {
        List<XinhuHrdemint> list = xinhuHrdemintService.selectXinhuHrdemintList(xinhuHrdemint);
        ExcelUtil<XinhuHrdemint> util = new ExcelUtil<XinhuHrdemint>(XinhuHrdemint.class);
        util.exportExcel(response, list, "面试和人员需求数据");
    }

    /**
     * 获取面试和人员需求详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrdemint:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuHrdemintService.selectXinhuHrdemintById(id));
    }

    /**
     * 新增面试和人员需求
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrdemint:add')")
    @Log(title = "面试和人员需求", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuHrdemint xinhuHrdemint)
    {
        return toAjax(xinhuHrdemintService.insertXinhuHrdemint(xinhuHrdemint));
    }

    /**
     * 修改面试和人员需求
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrdemint:edit')")
    @Log(title = "面试和人员需求", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuHrdemint xinhuHrdemint)
    {
        return toAjax(xinhuHrdemintService.updateXinhuHrdemint(xinhuHrdemint));
    }

    /**
     * 删除面试和人员需求
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrdemint:remove')")
    @Log(title = "面试和人员需求", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuHrdemintService.deleteXinhuHrdemintByIds(ids));
    }
}
