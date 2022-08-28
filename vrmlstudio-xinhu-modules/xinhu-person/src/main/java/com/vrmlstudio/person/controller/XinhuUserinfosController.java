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
import com.vrmlstudio.person.domain.XinhuUserinfos;
import com.vrmlstudio.person.service.IXinhuUserinfosService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 人员档案子Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-person/userinfos")
public class XinhuUserinfosController extends BaseController
{
    @Autowired
    private IXinhuUserinfosService xinhuUserinfosService;

    /**
     * 查询人员档案子列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:userinfos:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuUserinfos xinhuUserinfos)
    {
        startPage();
        List<XinhuUserinfos> list = xinhuUserinfosService.selectXinhuUserinfosList(xinhuUserinfos);
        return getDataTable(list);
    }

    /**
     * 导出人员档案子列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:userinfos:export')")
    @Log(title = "人员档案子", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuUserinfos xinhuUserinfos)
    {
        List<XinhuUserinfos> list = xinhuUserinfosService.selectXinhuUserinfosList(xinhuUserinfos);
        ExcelUtil<XinhuUserinfos> util = new ExcelUtil<XinhuUserinfos>(XinhuUserinfos.class);
        util.exportExcel(response, list, "人员档案子数据");
    }

    /**
     * 获取人员档案子详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:userinfos:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuUserinfosService.selectXinhuUserinfosById(id));
    }

    /**
     * 新增人员档案子
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:userinfos:add')")
    @Log(title = "人员档案子", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuUserinfos xinhuUserinfos)
    {
        return toAjax(xinhuUserinfosService.insertXinhuUserinfos(xinhuUserinfos));
    }

    /**
     * 修改人员档案子
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:userinfos:edit')")
    @Log(title = "人员档案子", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuUserinfos xinhuUserinfos)
    {
        return toAjax(xinhuUserinfosService.updateXinhuUserinfos(xinhuUserinfos));
    }

    /**
     * 删除人员档案子
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:userinfos:remove')")
    @Log(title = "人员档案子", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuUserinfosService.deleteXinhuUserinfosByIds(ids));
    }
}
