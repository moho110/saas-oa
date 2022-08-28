package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuLocation;
import com.vrmlstudio.hr.service.IXinhuLocationService;
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
 * 外勤定位Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/location")
public class XinhuLocationController extends BaseController
{
    @Autowired
    private IXinhuLocationService xinhuLocationService;

    /**
     * 查询外勤定位列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:location:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuLocation xinhuLocation)
    {
        startPage();
        List<XinhuLocation> list = xinhuLocationService.selectXinhuLocationList(xinhuLocation);
        return getDataTable(list);
    }

    /**
     * 导出外勤定位列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:location:export')")
    @Log(title = "外勤定位", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuLocation xinhuLocation)
    {
        List<XinhuLocation> list = xinhuLocationService.selectXinhuLocationList(xinhuLocation);
        ExcelUtil<XinhuLocation> util = new ExcelUtil<XinhuLocation>(XinhuLocation.class);
        util.exportExcel(response, list, "外勤定位数据");
    }

    /**
     * 获取外勤定位详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:location:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuLocationService.selectXinhuLocationById(id));
    }

    /**
     * 新增外勤定位
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:location:add')")
    @Log(title = "外勤定位", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuLocation xinhuLocation)
    {
        return toAjax(xinhuLocationService.insertXinhuLocation(xinhuLocation));
    }

    /**
     * 修改外勤定位
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:location:edit')")
    @Log(title = "外勤定位", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuLocation xinhuLocation)
    {
        return toAjax(xinhuLocationService.updateXinhuLocation(xinhuLocation));
    }

    /**
     * 删除外勤定位
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:location:remove')")
    @Log(title = "外勤定位", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuLocationService.deleteXinhuLocationByIds(ids));
    }
}
