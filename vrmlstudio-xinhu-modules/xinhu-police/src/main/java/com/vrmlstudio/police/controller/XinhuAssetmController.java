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
import com.vrmlstudio.police.domain.XinhuAssetm;
import com.vrmlstudio.police.service.IXinhuAssetmService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 固定资产Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-police/assetm")
public class XinhuAssetmController extends BaseController
{
    @Autowired
    private IXinhuAssetmService xinhuAssetmService;

    /**
     * 查询固定资产列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:assetm:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuAssetm xinhuAssetm)
    {
        startPage();
        List<XinhuAssetm> list = xinhuAssetmService.selectXinhuAssetmList(xinhuAssetm);
        return getDataTable(list);
    }

    /**
     * 导出固定资产列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:assetm:export')")
    @Log(title = "固定资产", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuAssetm xinhuAssetm)
    {
        List<XinhuAssetm> list = xinhuAssetmService.selectXinhuAssetmList(xinhuAssetm);
        ExcelUtil<XinhuAssetm> util = new ExcelUtil<XinhuAssetm>(XinhuAssetm.class);
        util.exportExcel(response, list, "固定资产数据");
    }

    /**
     * 获取固定资产详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:assetm:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuAssetmService.selectXinhuAssetmById(id));
    }

    /**
     * 新增固定资产
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:assetm:add')")
    @Log(title = "固定资产", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuAssetm xinhuAssetm)
    {
        return toAjax(xinhuAssetmService.insertXinhuAssetm(xinhuAssetm));
    }

    /**
     * 修改固定资产
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:assetm:edit')")
    @Log(title = "固定资产", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuAssetm xinhuAssetm)
    {
        return toAjax(xinhuAssetmService.updateXinhuAssetm(xinhuAssetm));
    }

    /**
     * 删除固定资产
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:assetm:remove')")
    @Log(title = "固定资产", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuAssetmService.deleteXinhuAssetmByIds(ids));
    }
}
