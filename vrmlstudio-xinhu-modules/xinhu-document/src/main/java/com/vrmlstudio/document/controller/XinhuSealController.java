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
import com.vrmlstudio.document.domain.XinhuSeal;
import com.vrmlstudio.document.service.IXinhuSealService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 印章Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-document/seal")
public class XinhuSealController extends BaseController
{
    @Autowired
    private IXinhuSealService xinhuSealService;

    /**
     * 查询印章列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:seal:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuSeal xinhuSeal)
    {
        startPage();
        List<XinhuSeal> list = xinhuSealService.selectXinhuSealList(xinhuSeal);
        return getDataTable(list);
    }

    /**
     * 导出印章列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:seal:export')")
    @Log(title = "印章", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuSeal xinhuSeal)
    {
        List<XinhuSeal> list = xinhuSealService.selectXinhuSealList(xinhuSeal);
        ExcelUtil<XinhuSeal> util = new ExcelUtil<XinhuSeal>(XinhuSeal.class);
        util.exportExcel(response, list, "印章数据");
    }

    /**
     * 获取印章详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:seal:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuSealService.selectXinhuSealById(id));
    }

    /**
     * 新增印章
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:seal:add')")
    @Log(title = "印章", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuSeal xinhuSeal)
    {
        return toAjax(xinhuSealService.insertXinhuSeal(xinhuSeal));
    }

    /**
     * 修改印章
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:seal:edit')")
    @Log(title = "印章", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuSeal xinhuSeal)
    {
        return toAjax(xinhuSealService.updateXinhuSeal(xinhuSeal));
    }

    /**
     * 删除印章
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:seal:remove')")
    @Log(title = "印章", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuSealService.deleteXinhuSealByIds(ids));
    }
}
