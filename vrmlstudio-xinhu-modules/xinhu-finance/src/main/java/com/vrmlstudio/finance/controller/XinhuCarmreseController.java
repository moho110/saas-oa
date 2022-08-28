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
import com.vrmlstudio.finance.domain.XinhuCarmrese;
import com.vrmlstudio.finance.service.IXinhuCarmreseService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 车辆预定Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-finance/carmrese")
public class XinhuCarmreseController extends BaseController
{
    @Autowired
    private IXinhuCarmreseService xinhuCarmreseService;

    /**
     * 查询车辆预定列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:carmrese:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuCarmrese xinhuCarmrese)
    {
        startPage();
        List<XinhuCarmrese> list = xinhuCarmreseService.selectXinhuCarmreseList(xinhuCarmrese);
        return getDataTable(list);
    }

    /**
     * 导出车辆预定列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:carmrese:export')")
    @Log(title = "车辆预定", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuCarmrese xinhuCarmrese)
    {
        List<XinhuCarmrese> list = xinhuCarmreseService.selectXinhuCarmreseList(xinhuCarmrese);
        ExcelUtil<XinhuCarmrese> util = new ExcelUtil<XinhuCarmrese>(XinhuCarmrese.class);
        util.exportExcel(response, list, "车辆预定数据");
    }

    /**
     * 获取车辆预定详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:carmrese:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuCarmreseService.selectXinhuCarmreseById(id));
    }

    /**
     * 新增车辆预定
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:carmrese:add')")
    @Log(title = "车辆预定", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuCarmrese xinhuCarmrese)
    {
        return toAjax(xinhuCarmreseService.insertXinhuCarmrese(xinhuCarmrese));
    }

    /**
     * 修改车辆预定
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:carmrese:edit')")
    @Log(title = "车辆预定", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuCarmrese xinhuCarmrese)
    {
        return toAjax(xinhuCarmreseService.updateXinhuCarmrese(xinhuCarmrese));
    }

    /**
     * 删除车辆预定
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:carmrese:remove')")
    @Log(title = "车辆预定", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuCarmreseService.deleteXinhuCarmreseByIds(ids));
    }
}
