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
import com.vrmlstudio.police.domain.XinhuGoodn;
import com.vrmlstudio.police.service.IXinhuGoodnService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 物品库存详细Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-police/goodn")
public class XinhuGoodnController extends BaseController
{
    @Autowired
    private IXinhuGoodnService xinhuGoodnService;

    /**
     * 查询物品库存详细列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:goodn:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuGoodn xinhuGoodn)
    {
        startPage();
        List<XinhuGoodn> list = xinhuGoodnService.selectXinhuGoodnList(xinhuGoodn);
        return getDataTable(list);
    }

    /**
     * 导出物品库存详细列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:goodn:export')")
    @Log(title = "物品库存详细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuGoodn xinhuGoodn)
    {
        List<XinhuGoodn> list = xinhuGoodnService.selectXinhuGoodnList(xinhuGoodn);
        ExcelUtil<XinhuGoodn> util = new ExcelUtil<XinhuGoodn>(XinhuGoodn.class);
        util.exportExcel(response, list, "物品库存详细数据");
    }

    /**
     * 获取物品库存详细详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:goodn:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuGoodnService.selectXinhuGoodnById(id));
    }

    /**
     * 新增物品库存详细
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:goodn:add')")
    @Log(title = "物品库存详细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuGoodn xinhuGoodn)
    {
        return toAjax(xinhuGoodnService.insertXinhuGoodn(xinhuGoodn));
    }

    /**
     * 修改物品库存详细
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:goodn:edit')")
    @Log(title = "物品库存详细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuGoodn xinhuGoodn)
    {
        return toAjax(xinhuGoodnService.updateXinhuGoodn(xinhuGoodn));
    }

    /**
     * 删除物品库存详细
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:goodn:remove')")
    @Log(title = "物品库存详细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuGoodnService.deleteXinhuGoodnByIds(ids));
    }
}
