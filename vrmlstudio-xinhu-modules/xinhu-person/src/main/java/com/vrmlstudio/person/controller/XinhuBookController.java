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
import com.vrmlstudio.person.domain.XinhuBook;
import com.vrmlstudio.person.service.IXinhuBookService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 图书Controller
 * 
 * @author VR爱好者
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-person/book")
public class XinhuBookController extends BaseController
{
    @Autowired
    private IXinhuBookService xinhuBookService;

    /**
     * 查询图书列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:book:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuBook xinhuBook)
    {
        startPage();
        List<XinhuBook> list = xinhuBookService.selectXinhuBookList(xinhuBook);
        return getDataTable(list);
    }

    /**
     * 导出图书列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:book:export')")
    @Log(title = "图书", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuBook xinhuBook)
    {
        List<XinhuBook> list = xinhuBookService.selectXinhuBookList(xinhuBook);
        ExcelUtil<XinhuBook> util = new ExcelUtil<XinhuBook>(XinhuBook.class);
        util.exportExcel(response, list, "图书数据");
    }

    /**
     * 获取图书详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:book:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuBookService.selectXinhuBookById(id));
    }

    /**
     * 新增图书
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:book:add')")
    @Log(title = "图书", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuBook xinhuBook)
    {
        return toAjax(xinhuBookService.insertXinhuBook(xinhuBook));
    }

    /**
     * 修改图书
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:book:edit')")
    @Log(title = "图书", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuBook xinhuBook)
    {
        return toAjax(xinhuBookService.updateXinhuBook(xinhuBook));
    }

    /**
     * 删除图书
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:book:remove')")
    @Log(title = "图书", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuBookService.deleteXinhuBookByIds(ids));
    }
}
