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
import com.vrmlstudio.finance.domain.XinhuDaily;
import com.vrmlstudio.finance.service.IXinhuDailyService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 日报Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-finance/daily")
public class XinhuDailyController extends BaseController
{
    @Autowired
    private IXinhuDailyService xinhuDailyService;

    /**
     * 查询日报列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:daily:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuDaily xinhuDaily)
    {
        startPage();
        List<XinhuDaily> list = xinhuDailyService.selectXinhuDailyList(xinhuDaily);
        return getDataTable(list);
    }

    /**
     * 导出日报列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:daily:export')")
    @Log(title = "日报", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuDaily xinhuDaily)
    {
        List<XinhuDaily> list = xinhuDailyService.selectXinhuDailyList(xinhuDaily);
        ExcelUtil<XinhuDaily> util = new ExcelUtil<XinhuDaily>(XinhuDaily.class);
        util.exportExcel(response, list, "日报数据");
    }

    /**
     * 获取日报详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:daily:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuDailyService.selectXinhuDailyById(id));
    }

    /**
     * 新增日报
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:daily:add')")
    @Log(title = "日报", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuDaily xinhuDaily)
    {
        return toAjax(xinhuDailyService.insertXinhuDaily(xinhuDaily));
    }

    /**
     * 修改日报
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:daily:edit')")
    @Log(title = "日报", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuDaily xinhuDaily)
    {
        return toAjax(xinhuDailyService.updateXinhuDaily(xinhuDaily));
    }

    /**
     * 删除日报
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:daily:remove')")
    @Log(title = "日报", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuDailyService.deleteXinhuDailyByIds(ids));
    }
}
