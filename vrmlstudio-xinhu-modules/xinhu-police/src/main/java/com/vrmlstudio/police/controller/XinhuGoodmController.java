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
import com.vrmlstudio.police.domain.XinhuGoodm;
import com.vrmlstudio.police.service.IXinhuGoodmService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 物品领用采购申请主Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-police/goodm")
public class XinhuGoodmController extends BaseController
{
    @Autowired
    private IXinhuGoodmService xinhuGoodmService;

    /**
     * 查询物品领用采购申请主列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:goodm:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuGoodm xinhuGoodm)
    {
        startPage();
        List<XinhuGoodm> list = xinhuGoodmService.selectXinhuGoodmList(xinhuGoodm);
        return getDataTable(list);
    }

    /**
     * 导出物品领用采购申请主列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:goodm:export')")
    @Log(title = "物品领用采购申请主", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuGoodm xinhuGoodm)
    {
        List<XinhuGoodm> list = xinhuGoodmService.selectXinhuGoodmList(xinhuGoodm);
        ExcelUtil<XinhuGoodm> util = new ExcelUtil<XinhuGoodm>(XinhuGoodm.class);
        util.exportExcel(response, list, "物品领用采购申请主数据");
    }

    /**
     * 获取物品领用采购申请主详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:goodm:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuGoodmService.selectXinhuGoodmById(id));
    }

    /**
     * 新增物品领用采购申请主
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:goodm:add')")
    @Log(title = "物品领用采购申请主", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuGoodm xinhuGoodm)
    {
        return toAjax(xinhuGoodmService.insertXinhuGoodm(xinhuGoodm));
    }

    /**
     * 修改物品领用采购申请主
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:goodm:edit')")
    @Log(title = "物品领用采购申请主", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuGoodm xinhuGoodm)
    {
        return toAjax(xinhuGoodmService.updateXinhuGoodm(xinhuGoodm));
    }

    /**
     * 删除物品领用采购申请主
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:goodm:remove')")
    @Log(title = "物品领用采购申请主", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuGoodmService.deleteXinhuGoodmByIds(ids));
    }
}
