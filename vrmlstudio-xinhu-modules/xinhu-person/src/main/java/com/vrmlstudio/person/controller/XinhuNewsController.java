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
import com.vrmlstudio.person.domain.XinhuNews;
import com.vrmlstudio.person.service.IXinhuNewsService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 新闻资讯Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-person/news")
public class XinhuNewsController extends BaseController
{
    @Autowired
    private IXinhuNewsService xinhuNewsService;

    /**
     * 查询新闻资讯列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:news:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuNews xinhuNews)
    {
        startPage();
        List<XinhuNews> list = xinhuNewsService.selectXinhuNewsList(xinhuNews);
        return getDataTable(list);
    }

    /**
     * 导出新闻资讯列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:news:export')")
    @Log(title = "新闻资讯", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuNews xinhuNews)
    {
        List<XinhuNews> list = xinhuNewsService.selectXinhuNewsList(xinhuNews);
        ExcelUtil<XinhuNews> util = new ExcelUtil<XinhuNews>(XinhuNews.class);
        util.exportExcel(response, list, "新闻资讯数据");
    }

    /**
     * 获取新闻资讯详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:news:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuNewsService.selectXinhuNewsById(id));
    }

    /**
     * 新增新闻资讯
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:news:add')")
    @Log(title = "新闻资讯", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuNews xinhuNews)
    {
        return toAjax(xinhuNewsService.insertXinhuNews(xinhuNews));
    }

    /**
     * 修改新闻资讯
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:news:edit')")
    @Log(title = "新闻资讯", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuNews xinhuNews)
    {
        return toAjax(xinhuNewsService.updateXinhuNews(xinhuNews));
    }

    /**
     * 删除新闻资讯
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:news:remove')")
    @Log(title = "新闻资讯", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuNewsService.deleteXinhuNewsByIds(ids));
    }
}
