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
import com.vrmlstudio.document.domain.XinhuOfficial;
import com.vrmlstudio.document.service.IXinhuOfficialService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 公文Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-document/official")
public class XinhuOfficialController extends BaseController
{
    @Autowired
    private IXinhuOfficialService xinhuOfficialService;

    /**
     * 查询公文列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:official:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuOfficial xinhuOfficial)
    {
        startPage();
        List<XinhuOfficial> list = xinhuOfficialService.selectXinhuOfficialList(xinhuOfficial);
        return getDataTable(list);
    }

    /**
     * 导出公文列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:official:export')")
    @Log(title = "公文", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuOfficial xinhuOfficial)
    {
        List<XinhuOfficial> list = xinhuOfficialService.selectXinhuOfficialList(xinhuOfficial);
        ExcelUtil<XinhuOfficial> util = new ExcelUtil<XinhuOfficial>(XinhuOfficial.class);
        util.exportExcel(response, list, "公文数据");
    }

    /**
     * 获取公文详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:official:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuOfficialService.selectXinhuOfficialById(id));
    }

    /**
     * 新增公文
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:official:add')")
    @Log(title = "公文", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuOfficial xinhuOfficial)
    {
        return toAjax(xinhuOfficialService.insertXinhuOfficial(xinhuOfficial));
    }

    /**
     * 修改公文
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:official:edit')")
    @Log(title = "公文", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuOfficial xinhuOfficial)
    {
        return toAjax(xinhuOfficialService.updateXinhuOfficial(xinhuOfficial));
    }

    /**
     * 删除公文
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:official:remove')")
    @Log(title = "公文", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuOfficialService.deleteXinhuOfficialByIds(ids));
    }
}
