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
import com.vrmlstudio.document.domain.XinhuWenjuat;
import com.vrmlstudio.document.service.IXinhuWenjuatService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 问卷子Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-document/wenjuat")
public class XinhuWenjuatController extends BaseController
{
    @Autowired
    private IXinhuWenjuatService xinhuWenjuatService;

    /**
     * 查询问卷子列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wenjuat:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuWenjuat xinhuWenjuat)
    {
        startPage();
        List<XinhuWenjuat> list = xinhuWenjuatService.selectXinhuWenjuatList(xinhuWenjuat);
        return getDataTable(list);
    }

    /**
     * 导出问卷子列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wenjuat:export')")
    @Log(title = "问卷子", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuWenjuat xinhuWenjuat)
    {
        List<XinhuWenjuat> list = xinhuWenjuatService.selectXinhuWenjuatList(xinhuWenjuat);
        ExcelUtil<XinhuWenjuat> util = new ExcelUtil<XinhuWenjuat>(XinhuWenjuat.class);
        util.exportExcel(response, list, "问卷子数据");
    }

    /**
     * 获取问卷子详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wenjuat:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuWenjuatService.selectXinhuWenjuatById(id));
    }

    /**
     * 新增问卷子
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wenjuat:add')")
    @Log(title = "问卷子", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuWenjuat xinhuWenjuat)
    {
        return toAjax(xinhuWenjuatService.insertXinhuWenjuat(xinhuWenjuat));
    }

    /**
     * 修改问卷子
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wenjuat:edit')")
    @Log(title = "问卷子", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuWenjuat xinhuWenjuat)
    {
        return toAjax(xinhuWenjuatService.updateXinhuWenjuat(xinhuWenjuat));
    }

    /**
     * 删除问卷子
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wenjuat:remove')")
    @Log(title = "问卷子", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuWenjuatService.deleteXinhuWenjuatByIds(ids));
    }
}
