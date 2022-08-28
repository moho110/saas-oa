package com.vrmlstudio.xsystem.controller;

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
import com.vrmlstudio.xsystem.domain.XinhuWxtxRenlian;
import com.vrmlstudio.xsystem.service.IXinhuWxtxRenlianService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 人脸识别Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-system/renlian")
public class XinhuWxtxRenlianController extends BaseController
{
    @Autowired
    private IXinhuWxtxRenlianService xinhuWxtxRenlianService;

    /**
     * 查询人脸识别列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:renlian:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuWxtxRenlian xinhuWxtxRenlian)
    {
        startPage();
        List<XinhuWxtxRenlian> list = xinhuWxtxRenlianService.selectXinhuWxtxRenlianList(xinhuWxtxRenlian);
        return getDataTable(list);
    }

    /**
     * 导出人脸识别列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:renlian:export')")
    @Log(title = "人脸识别", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuWxtxRenlian xinhuWxtxRenlian)
    {
        List<XinhuWxtxRenlian> list = xinhuWxtxRenlianService.selectXinhuWxtxRenlianList(xinhuWxtxRenlian);
        ExcelUtil<XinhuWxtxRenlian> util = new ExcelUtil<XinhuWxtxRenlian>(XinhuWxtxRenlian.class);
        util.exportExcel(response, list, "人脸识别数据");
    }

    /**
     * 获取人脸识别详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:renlian:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuWxtxRenlianService.selectXinhuWxtxRenlianById(id));
    }

    /**
     * 新增人脸识别
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:renlian:add')")
    @Log(title = "人脸识别", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuWxtxRenlian xinhuWxtxRenlian)
    {
        return toAjax(xinhuWxtxRenlianService.insertXinhuWxtxRenlian(xinhuWxtxRenlian));
    }

    /**
     * 修改人脸识别
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:renlian:edit')")
    @Log(title = "人脸识别", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuWxtxRenlian xinhuWxtxRenlian)
    {
        return toAjax(xinhuWxtxRenlianService.updateXinhuWxtxRenlian(xinhuWxtxRenlian));
    }

    /**
     * 删除人脸识别
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:renlian:remove')")
    @Log(title = "人脸识别", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuWxtxRenlianService.deleteXinhuWxtxRenlianByIds(ids));
    }
}
