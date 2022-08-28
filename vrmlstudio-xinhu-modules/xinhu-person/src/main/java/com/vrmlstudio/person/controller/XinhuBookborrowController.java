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
import com.vrmlstudio.person.domain.XinhuBookborrow;
import com.vrmlstudio.person.service.IXinhuBookborrowService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 图书借阅Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-person/bookborrow")
public class XinhuBookborrowController extends BaseController
{
    @Autowired
    private IXinhuBookborrowService xinhuBookborrowService;

    /**
     * 查询图书借阅列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:bookborrow:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuBookborrow xinhuBookborrow)
    {
        startPage();
        List<XinhuBookborrow> list = xinhuBookborrowService.selectXinhuBookborrowList(xinhuBookborrow);
        return getDataTable(list);
    }

    /**
     * 导出图书借阅列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:bookborrow:export')")
    @Log(title = "图书借阅", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuBookborrow xinhuBookborrow)
    {
        List<XinhuBookborrow> list = xinhuBookborrowService.selectXinhuBookborrowList(xinhuBookborrow);
        ExcelUtil<XinhuBookborrow> util = new ExcelUtil<XinhuBookborrow>(XinhuBookborrow.class);
        util.exportExcel(response, list, "图书借阅数据");
    }

    /**
     * 获取图书借阅详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:bookborrow:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuBookborrowService.selectXinhuBookborrowById(id));
    }

    /**
     * 新增图书借阅
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:bookborrow:add')")
    @Log(title = "图书借阅", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuBookborrow xinhuBookborrow)
    {
        return toAjax(xinhuBookborrowService.insertXinhuBookborrow(xinhuBookborrow));
    }

    /**
     * 修改图书借阅
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:bookborrow:edit')")
    @Log(title = "图书借阅", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuBookborrow xinhuBookborrow)
    {
        return toAjax(xinhuBookborrowService.updateXinhuBookborrow(xinhuBookborrow));
    }

    /**
     * 删除图书借阅
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:bookborrow:remove')")
    @Log(title = "图书借阅", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuBookborrowService.deleteXinhuBookborrowByIds(ids));
    }
}
