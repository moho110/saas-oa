package com.vrmlstudio.person.controller;

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
import com.vrmlstudio.person.domain.XinhuCity;
import com.vrmlstudio.person.service.IXinhuCityService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;

/**
 * 城市Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-person/city")
public class XinhuCityController extends BaseController
{
    @Autowired
    private IXinhuCityService xinhuCityService;

    /**
     * 查询城市列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:city:list')")
    @GetMapping("/list")
    public AjaxResult list(XinhuCity xinhuCity)
    {
        List<XinhuCity> list = xinhuCityService.selectXinhuCityList(xinhuCity);
        return AjaxResult.success(list);
    }

    /**
     * 导出城市列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:city:export')")
    @Log(title = "城市", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuCity xinhuCity)
    {
        List<XinhuCity> list = xinhuCityService.selectXinhuCityList(xinhuCity);
        ExcelUtil<XinhuCity> util = new ExcelUtil<XinhuCity>(XinhuCity.class);
        util.exportExcel(response, list, "城市数据");
    }

    /**
     * 获取城市详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:city:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuCityService.selectXinhuCityById(id));
    }

    /**
     * 新增城市
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:city:add')")
    @Log(title = "城市", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuCity xinhuCity)
    {
        return toAjax(xinhuCityService.insertXinhuCity(xinhuCity));
    }

    /**
     * 修改城市
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:city:edit')")
    @Log(title = "城市", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuCity xinhuCity)
    {
        return toAjax(xinhuCityService.updateXinhuCity(xinhuCity));
    }

    /**
     * 删除城市
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:city:remove')")
    @Log(title = "城市", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuCityService.deleteXinhuCityByIds(ids));
    }
}
