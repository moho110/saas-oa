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
import com.vrmlstudio.document.domain.XinhuWordxie;
import com.vrmlstudio.document.service.IXinhuWordxieService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 文档协作Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-document/wordxie")
public class XinhuWordxieController extends BaseController
{
    @Autowired
    private IXinhuWordxieService xinhuWordxieService;

    /**
     * 查询文档协作列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wordxie:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuWordxie xinhuWordxie)
    {
        startPage();
        List<XinhuWordxie> list = xinhuWordxieService.selectXinhuWordxieList(xinhuWordxie);
        return getDataTable(list);
    }

    /**
     * 导出文档协作列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wordxie:export')")
    @Log(title = "文档协作", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuWordxie xinhuWordxie)
    {
        List<XinhuWordxie> list = xinhuWordxieService.selectXinhuWordxieList(xinhuWordxie);
        ExcelUtil<XinhuWordxie> util = new ExcelUtil<XinhuWordxie>(XinhuWordxie.class);
        util.exportExcel(response, list, "文档协作数据");
    }

    /**
     * 获取文档协作详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wordxie:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuWordxieService.selectXinhuWordxieById(id));
    }

    /**
     * 新增文档协作
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wordxie:add')")
    @Log(title = "文档协作", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuWordxie xinhuWordxie)
    {
        return toAjax(xinhuWordxieService.insertXinhuWordxie(xinhuWordxie));
    }

    /**
     * 修改文档协作
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wordxie:edit')")
    @Log(title = "文档协作", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuWordxie xinhuWordxie)
    {
        return toAjax(xinhuWordxieService.updateXinhuWordxie(xinhuWordxie));
    }

    /**
     * 删除文档协作
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wordxie:remove')")
    @Log(title = "文档协作", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuWordxieService.deleteXinhuWordxieByIds(ids));
    }
}
