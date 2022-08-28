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
import com.vrmlstudio.police.domain.XinhuFinpiao;
import com.vrmlstudio.police.service.IXinhuFinpiaoService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 发票管理Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-police/finpiao")
public class XinhuFinpiaoController extends BaseController
{
    @Autowired
    private IXinhuFinpiaoService xinhuFinpiaoService;

    /**
     * 查询发票管理列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:finpiao:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuFinpiao xinhuFinpiao)
    {
        startPage();
        List<XinhuFinpiao> list = xinhuFinpiaoService.selectXinhuFinpiaoList(xinhuFinpiao);
        return getDataTable(list);
    }

    /**
     * 导出发票管理列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:finpiao:export')")
    @Log(title = "发票管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuFinpiao xinhuFinpiao)
    {
        List<XinhuFinpiao> list = xinhuFinpiaoService.selectXinhuFinpiaoList(xinhuFinpiao);
        ExcelUtil<XinhuFinpiao> util = new ExcelUtil<XinhuFinpiao>(XinhuFinpiao.class);
        util.exportExcel(response, list, "发票管理数据");
    }

    /**
     * 获取发票管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:finpiao:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuFinpiaoService.selectXinhuFinpiaoById(id));
    }

    /**
     * 新增发票管理
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:finpiao:add')")
    @Log(title = "发票管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuFinpiao xinhuFinpiao)
    {
        return toAjax(xinhuFinpiaoService.insertXinhuFinpiao(xinhuFinpiao));
    }

    /**
     * 修改发票管理
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:finpiao:edit')")
    @Log(title = "发票管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuFinpiao xinhuFinpiao)
    {
        return toAjax(xinhuFinpiaoService.updateXinhuFinpiao(xinhuFinpiao));
    }

    /**
     * 删除发票管理
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:finpiao:remove')")
    @Log(title = "发票管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuFinpiaoService.deleteXinhuFinpiaoByIds(ids));
    }
}
