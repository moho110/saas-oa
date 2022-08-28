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
import com.vrmlstudio.finance.domain.XinhuDailyfx;
import com.vrmlstudio.finance.service.IXinhuDailyfxService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 日报分析统计Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-finance/dailyfx")
public class XinhuDailyfxController extends BaseController
{
    @Autowired
    private IXinhuDailyfxService xinhuDailyfxService;

    /**
     * 查询日报分析统计列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:dailyfx:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuDailyfx xinhuDailyfx)
    {
        startPage();
        List<XinhuDailyfx> list = xinhuDailyfxService.selectXinhuDailyfxList(xinhuDailyfx);
        return getDataTable(list);
    }

    /**
     * 导出日报分析统计列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:dailyfx:export')")
    @Log(title = "日报分析统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuDailyfx xinhuDailyfx)
    {
        List<XinhuDailyfx> list = xinhuDailyfxService.selectXinhuDailyfxList(xinhuDailyfx);
        ExcelUtil<XinhuDailyfx> util = new ExcelUtil<XinhuDailyfx>(XinhuDailyfx.class);
        util.exportExcel(response, list, "日报分析统计数据");
    }

    /**
     * 获取日报分析统计详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:dailyfx:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuDailyfxService.selectXinhuDailyfxById(id));
    }

    /**
     * 新增日报分析统计
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:dailyfx:add')")
    @Log(title = "日报分析统计", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuDailyfx xinhuDailyfx)
    {
        return toAjax(xinhuDailyfxService.insertXinhuDailyfx(xinhuDailyfx));
    }

    /**
     * 修改日报分析统计
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:dailyfx:edit')")
    @Log(title = "日报分析统计", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuDailyfx xinhuDailyfx)
    {
        return toAjax(xinhuDailyfxService.updateXinhuDailyfx(xinhuDailyfx));
    }

    /**
     * 删除日报分析统计
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:dailyfx:remove')")
    @Log(title = "日报分析统计", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuDailyfxService.deleteXinhuDailyfxByIds(ids));
    }
}
