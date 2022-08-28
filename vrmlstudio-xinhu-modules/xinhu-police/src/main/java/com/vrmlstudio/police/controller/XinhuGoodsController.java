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
import com.vrmlstudio.police.domain.XinhuGoods;
import com.vrmlstudio.police.service.IXinhuGoodsService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 物品Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-police/goods")
public class XinhuGoodsController extends BaseController
{
    @Autowired
    private IXinhuGoodsService xinhuGoodsService;

    /**
     * 查询物品列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:goods:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuGoods xinhuGoods)
    {
        startPage();
        List<XinhuGoods> list = xinhuGoodsService.selectXinhuGoodsList(xinhuGoods);
        return getDataTable(list);
    }

    /**
     * 导出物品列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:goods:export')")
    @Log(title = "物品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuGoods xinhuGoods)
    {
        List<XinhuGoods> list = xinhuGoodsService.selectXinhuGoodsList(xinhuGoods);
        ExcelUtil<XinhuGoods> util = new ExcelUtil<XinhuGoods>(XinhuGoods.class);
        util.exportExcel(response, list, "物品数据");
    }

    /**
     * 获取物品详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:goods:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuGoodsService.selectXinhuGoodsById(id));
    }

    /**
     * 新增物品
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:goods:add')")
    @Log(title = "物品", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuGoods xinhuGoods)
    {
        return toAjax(xinhuGoodsService.insertXinhuGoods(xinhuGoods));
    }

    /**
     * 修改物品
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:goods:edit')")
    @Log(title = "物品", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuGoods xinhuGoods)
    {
        return toAjax(xinhuGoodsService.updateXinhuGoods(xinhuGoods));
    }

    /**
     * 删除物品
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:goods:remove')")
    @Log(title = "物品", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuGoodsService.deleteXinhuGoodsByIds(ids));
    }
}
