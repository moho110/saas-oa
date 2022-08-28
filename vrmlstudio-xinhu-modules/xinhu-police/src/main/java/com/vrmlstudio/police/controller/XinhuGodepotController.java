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
import com.vrmlstudio.police.domain.XinhuGodepot;
import com.vrmlstudio.police.service.IXinhuGodepotService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 物品仓库Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-police/godepot")
public class XinhuGodepotController extends BaseController
{
    @Autowired
    private IXinhuGodepotService xinhuGodepotService;

    /**
     * 查询物品仓库列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:godepot:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuGodepot xinhuGodepot)
    {
        startPage();
        List<XinhuGodepot> list = xinhuGodepotService.selectXinhuGodepotList(xinhuGodepot);
        return getDataTable(list);
    }

    /**
     * 导出物品仓库列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:godepot:export')")
    @Log(title = "物品仓库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuGodepot xinhuGodepot)
    {
        List<XinhuGodepot> list = xinhuGodepotService.selectXinhuGodepotList(xinhuGodepot);
        ExcelUtil<XinhuGodepot> util = new ExcelUtil<XinhuGodepot>(XinhuGodepot.class);
        util.exportExcel(response, list, "物品仓库数据");
    }

    /**
     * 获取物品仓库详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:godepot:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuGodepotService.selectXinhuGodepotById(id));
    }

    /**
     * 新增物品仓库
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:godepot:add')")
    @Log(title = "物品仓库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuGodepot xinhuGodepot)
    {
        return toAjax(xinhuGodepotService.insertXinhuGodepot(xinhuGodepot));
    }

    /**
     * 修改物品仓库
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:godepot:edit')")
    @Log(title = "物品仓库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuGodepot xinhuGodepot)
    {
        return toAjax(xinhuGodepotService.updateXinhuGodepot(xinhuGodepot));
    }

    /**
     * 删除物品仓库
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:godepot:remove')")
    @Log(title = "物品仓库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuGodepotService.deleteXinhuGodepotByIds(ids));
    }
}
