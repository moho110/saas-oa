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
import com.vrmlstudio.document.domain.XinhuWenjuan;
import com.vrmlstudio.document.service.IXinhuWenjuanService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 问卷Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-document/wenjuan")
public class XinhuWenjuanController extends BaseController
{
    @Autowired
    private IXinhuWenjuanService xinhuWenjuanService;

    /**
     * 查询问卷列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wenjuan:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuWenjuan xinhuWenjuan)
    {
        startPage();
        List<XinhuWenjuan> list = xinhuWenjuanService.selectXinhuWenjuanList(xinhuWenjuan);
        return getDataTable(list);
    }

    /**
     * 导出问卷列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wenjuan:export')")
    @Log(title = "问卷", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuWenjuan xinhuWenjuan)
    {
        List<XinhuWenjuan> list = xinhuWenjuanService.selectXinhuWenjuanList(xinhuWenjuan);
        ExcelUtil<XinhuWenjuan> util = new ExcelUtil<XinhuWenjuan>(XinhuWenjuan.class);
        util.exportExcel(response, list, "问卷数据");
    }

    /**
     * 获取问卷详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wenjuan:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuWenjuanService.selectXinhuWenjuanById(id));
    }

    /**
     * 新增问卷
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wenjuan:add')")
    @Log(title = "问卷", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuWenjuan xinhuWenjuan)
    {
        return toAjax(xinhuWenjuanService.insertXinhuWenjuan(xinhuWenjuan));
    }

    /**
     * 修改问卷
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wenjuan:edit')")
    @Log(title = "问卷", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuWenjuan xinhuWenjuan)
    {
        return toAjax(xinhuWenjuanService.updateXinhuWenjuan(xinhuWenjuan));
    }

    /**
     * 删除问卷
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wenjuan:remove')")
    @Log(title = "问卷", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuWenjuanService.deleteXinhuWenjuanByIds(ids));
    }
}
