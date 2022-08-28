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
import com.vrmlstudio.police.domain.XinhuEditrecord;
import com.vrmlstudio.police.service.IXinhuEditrecordService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 修改记录Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-police/editrecord")
public class XinhuEditrecordController extends BaseController
{
    @Autowired
    private IXinhuEditrecordService xinhuEditrecordService;

    /**
     * 查询修改记录列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:editrecord:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuEditrecord xinhuEditrecord)
    {
        startPage();
        List<XinhuEditrecord> list = xinhuEditrecordService.selectXinhuEditrecordList(xinhuEditrecord);
        return getDataTable(list);
    }

    /**
     * 导出修改记录列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:editrecord:export')")
    @Log(title = "修改记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuEditrecord xinhuEditrecord)
    {
        List<XinhuEditrecord> list = xinhuEditrecordService.selectXinhuEditrecordList(xinhuEditrecord);
        ExcelUtil<XinhuEditrecord> util = new ExcelUtil<XinhuEditrecord>(XinhuEditrecord.class);
        util.exportExcel(response, list, "修改记录数据");
    }

    /**
     * 获取修改记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:editrecord:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuEditrecordService.selectXinhuEditrecordById(id));
    }

    /**
     * 新增修改记录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:editrecord:add')")
    @Log(title = "修改记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuEditrecord xinhuEditrecord)
    {
        return toAjax(xinhuEditrecordService.insertXinhuEditrecord(xinhuEditrecord));
    }

    /**
     * 修改修改记录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:editrecord:edit')")
    @Log(title = "修改记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuEditrecord xinhuEditrecord)
    {
        return toAjax(xinhuEditrecordService.updateXinhuEditrecord(xinhuEditrecord));
    }

    /**
     * 删除修改记录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:editrecord:remove')")
    @Log(title = "修改记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuEditrecordService.deleteXinhuEditrecordByIds(ids));
    }
}
