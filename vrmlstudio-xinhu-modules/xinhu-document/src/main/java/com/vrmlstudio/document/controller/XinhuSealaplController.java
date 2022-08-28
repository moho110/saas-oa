package com.vrmlstudio.document.controller;

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
import com.vrmlstudio.document.domain.XinhuSealapl;
import com.vrmlstudio.document.service.IXinhuSealaplService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 印章申请使用Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-document/sealapl")
public class XinhuSealaplController extends BaseController
{
    @Autowired
    private IXinhuSealaplService xinhuSealaplService;

    /**
     * 查询印章申请使用列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:sealapl:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuSealapl xinhuSealapl)
    {
        startPage();
        List<XinhuSealapl> list = xinhuSealaplService.selectXinhuSealaplList(xinhuSealapl);
        return getDataTable(list);
    }

    /**
     * 导出印章申请使用列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:sealapl:export')")
    @Log(title = "印章申请使用", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuSealapl xinhuSealapl)
    {
        List<XinhuSealapl> list = xinhuSealaplService.selectXinhuSealaplList(xinhuSealapl);
        ExcelUtil<XinhuSealapl> util = new ExcelUtil<XinhuSealapl>(XinhuSealapl.class);
        util.exportExcel(response, list, "印章申请使用数据");
    }

    /**
     * 获取印章申请使用详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:sealapl:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuSealaplService.selectXinhuSealaplById(id));
    }

    /**
     * 新增印章申请使用
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:sealapl:add')")
    @Log(title = "印章申请使用", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuSealapl xinhuSealapl)
    {
        return toAjax(xinhuSealaplService.insertXinhuSealapl(xinhuSealapl));
    }

    /**
     * 修改印章申请使用
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:sealapl:edit')")
    @Log(title = "印章申请使用", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuSealapl xinhuSealapl)
    {
        return toAjax(xinhuSealaplService.updateXinhuSealapl(xinhuSealapl));
    }

    /**
     * 删除印章申请使用
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:sealapl:remove')")
    @Log(title = "印章申请使用", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuSealaplService.deleteXinhuSealaplByIds(ids));
    }
}
