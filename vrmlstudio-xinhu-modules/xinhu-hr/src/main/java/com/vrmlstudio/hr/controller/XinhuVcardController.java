package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuVcard;
import com.vrmlstudio.hr.service.IXinhuVcardService;
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
 * 个人通讯录Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/vcard")
public class XinhuVcardController extends BaseController
{
    @Autowired
    private IXinhuVcardService xinhuVcardService;

    /**
     * 查询个人通讯录列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:vcard:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuVcard xinhuVcard)
    {
        startPage();
        List<XinhuVcard> list = xinhuVcardService.selectXinhuVcardList(xinhuVcard);
        return getDataTable(list);
    }

    /**
     * 导出个人通讯录列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:vcard:export')")
    @Log(title = "个人通讯录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuVcard xinhuVcard)
    {
        List<XinhuVcard> list = xinhuVcardService.selectXinhuVcardList(xinhuVcard);
        ExcelUtil<XinhuVcard> util = new ExcelUtil<XinhuVcard>(XinhuVcard.class);
        util.exportExcel(response, list, "个人通讯录数据");
    }

    /**
     * 获取个人通讯录详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:vcard:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuVcardService.selectXinhuVcardById(id));
    }

    /**
     * 新增个人通讯录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:vcard:add')")
    @Log(title = "个人通讯录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuVcard xinhuVcard)
    {
        return toAjax(xinhuVcardService.insertXinhuVcard(xinhuVcard));
    }

    /**
     * 修改个人通讯录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:vcard:edit')")
    @Log(title = "个人通讯录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuVcard xinhuVcard)
    {
        return toAjax(xinhuVcardService.updateXinhuVcard(xinhuVcard));
    }

    /**
     * 删除个人通讯录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:vcard:remove')")
    @Log(title = "个人通讯录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuVcardService.deleteXinhuVcardByIds(ids));
    }
}
