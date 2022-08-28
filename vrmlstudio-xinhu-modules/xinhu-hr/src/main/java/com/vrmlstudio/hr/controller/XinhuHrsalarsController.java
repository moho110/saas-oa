package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuHrsalars;
import com.vrmlstudio.hr.service.IXinhuHrsalarsService;
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
 * 薪资模版子Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/hrsalars")
public class XinhuHrsalarsController extends BaseController
{
    @Autowired
    private IXinhuHrsalarsService xinhuHrsalarsService;

    /**
     * 查询薪资模版子列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrsalars:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuHrsalars xinhuHrsalars)
    {
        startPage();
        List<XinhuHrsalars> list = xinhuHrsalarsService.selectXinhuHrsalarsList(xinhuHrsalars);
        return getDataTable(list);
    }

    /**
     * 导出薪资模版子列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrsalars:export')")
    @Log(title = "薪资模版子", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuHrsalars xinhuHrsalars)
    {
        List<XinhuHrsalars> list = xinhuHrsalarsService.selectXinhuHrsalarsList(xinhuHrsalars);
        ExcelUtil<XinhuHrsalars> util = new ExcelUtil<XinhuHrsalars>(XinhuHrsalars.class);
        util.exportExcel(response, list, "薪资模版子数据");
    }

    /**
     * 获取薪资模版子详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrsalars:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuHrsalarsService.selectXinhuHrsalarsById(id));
    }

    /**
     * 新增薪资模版子
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrsalars:add')")
    @Log(title = "薪资模版子", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuHrsalars xinhuHrsalars)
    {
        return toAjax(xinhuHrsalarsService.insertXinhuHrsalars(xinhuHrsalars));
    }

    /**
     * 修改薪资模版子
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrsalars:edit')")
    @Log(title = "薪资模版子", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuHrsalars xinhuHrsalars)
    {
        return toAjax(xinhuHrsalarsService.updateXinhuHrsalars(xinhuHrsalars));
    }

    /**
     * 删除薪资模版子
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrsalars:remove')")
    @Log(title = "薪资模版子", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuHrsalarsService.deleteXinhuHrsalarsByIds(ids));
    }
}
