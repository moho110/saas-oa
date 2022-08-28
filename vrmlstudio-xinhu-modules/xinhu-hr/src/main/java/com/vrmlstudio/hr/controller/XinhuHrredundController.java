package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuHrredund;
import com.vrmlstudio.hr.service.IXinhuHrredundService;
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
 * 离职申请Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/hrredund")
public class XinhuHrredundController extends BaseController
{
    @Autowired
    private IXinhuHrredundService xinhuHrredundService;

    /**
     * 查询离职申请列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrredund:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuHrredund xinhuHrredund)
    {
        startPage();
        List<XinhuHrredund> list = xinhuHrredundService.selectXinhuHrredundList(xinhuHrredund);
        return getDataTable(list);
    }

    /**
     * 导出离职申请列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrredund:export')")
    @Log(title = "离职申请", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuHrredund xinhuHrredund)
    {
        List<XinhuHrredund> list = xinhuHrredundService.selectXinhuHrredundList(xinhuHrredund);
        ExcelUtil<XinhuHrredund> util = new ExcelUtil<XinhuHrredund>(XinhuHrredund.class);
        util.exportExcel(response, list, "离职申请数据");
    }

    /**
     * 获取离职申请详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrredund:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuHrredundService.selectXinhuHrredundById(id));
    }

    /**
     * 新增离职申请
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrredund:add')")
    @Log(title = "离职申请", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuHrredund xinhuHrredund)
    {
        return toAjax(xinhuHrredundService.insertXinhuHrredund(xinhuHrredund));
    }

    /**
     * 修改离职申请
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrredund:edit')")
    @Log(title = "离职申请", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuHrredund xinhuHrredund)
    {
        return toAjax(xinhuHrredundService.updateXinhuHrredund(xinhuHrredund));
    }

    /**
     * 删除离职申请
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrredund:remove')")
    @Log(title = "离职申请", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuHrredundService.deleteXinhuHrredundByIds(ids));
    }
}
