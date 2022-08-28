package com.vrmlstudio.finance.controller;

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
import com.vrmlstudio.finance.domain.XinhuCarm;
import com.vrmlstudio.finance.service.IXinhuCarmService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 车辆Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-finance/carm")
public class XinhuCarmController extends BaseController
{
    @Autowired
    private IXinhuCarmService xinhuCarmService;

    /**
     * 查询车辆列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:carm:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuCarm xinhuCarm)
    {
        startPage();
        List<XinhuCarm> list = xinhuCarmService.selectXinhuCarmList(xinhuCarm);
        return getDataTable(list);
    }

    /**
     * 导出车辆列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:carm:export')")
    @Log(title = "车辆", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuCarm xinhuCarm)
    {
        List<XinhuCarm> list = xinhuCarmService.selectXinhuCarmList(xinhuCarm);
        ExcelUtil<XinhuCarm> util = new ExcelUtil<XinhuCarm>(XinhuCarm.class);
        util.exportExcel(response, list, "车辆数据");
    }

    /**
     * 获取车辆详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:carm:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuCarmService.selectXinhuCarmById(id));
    }

    /**
     * 新增车辆
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:carm:add')")
    @Log(title = "车辆", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuCarm xinhuCarm)
    {
        return toAjax(xinhuCarmService.insertXinhuCarm(xinhuCarm));
    }

    /**
     * 修改车辆
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:carm:edit')")
    @Log(title = "车辆", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuCarm xinhuCarm)
    {
        return toAjax(xinhuCarmService.updateXinhuCarm(xinhuCarm));
    }

    /**
     * 删除车辆
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:carm:remove')")
    @Log(title = "车辆", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuCarmService.deleteXinhuCarmByIds(ids));
    }
}
