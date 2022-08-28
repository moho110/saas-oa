package com.vrmlstudio.police.controller;

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
import com.vrmlstudio.police.domain.XinhuEmailm;
import com.vrmlstudio.police.service.IXinhuEmailmService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 邮件主Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-police/emailm")
public class XinhuEmailmController extends BaseController
{
    @Autowired
    private IXinhuEmailmService xinhuEmailmService;

    /**
     * 查询邮件主列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:emailm:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuEmailm xinhuEmailm)
    {
        startPage();
        List<XinhuEmailm> list = xinhuEmailmService.selectXinhuEmailmList(xinhuEmailm);
        return getDataTable(list);
    }

    /**
     * 导出邮件主列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:emailm:export')")
    @Log(title = "邮件主", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuEmailm xinhuEmailm)
    {
        List<XinhuEmailm> list = xinhuEmailmService.selectXinhuEmailmList(xinhuEmailm);
        ExcelUtil<XinhuEmailm> util = new ExcelUtil<XinhuEmailm>(XinhuEmailm.class);
        util.exportExcel(response, list, "邮件主数据");
    }

    /**
     * 获取邮件主详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:emailm:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuEmailmService.selectXinhuEmailmById(id));
    }

    /**
     * 新增邮件主
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:emailm:add')")
    @Log(title = "邮件主", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuEmailm xinhuEmailm)
    {
        return toAjax(xinhuEmailmService.insertXinhuEmailm(xinhuEmailm));
    }

    /**
     * 修改邮件主
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:emailm:edit')")
    @Log(title = "邮件主", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuEmailm xinhuEmailm)
    {
        return toAjax(xinhuEmailmService.updateXinhuEmailm(xinhuEmailm));
    }

    /**
     * 删除邮件主
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:emailm:remove')")
    @Log(title = "邮件主", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuEmailmService.deleteXinhuEmailmByIds(ids));
    }
}
