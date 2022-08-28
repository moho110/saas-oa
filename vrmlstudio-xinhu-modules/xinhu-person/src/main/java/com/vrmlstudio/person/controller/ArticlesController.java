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
import com.vrmlstudio.person.domain.Articles;
import com.vrmlstudio.person.service.IArticlesService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 文章列Controller
 * 
 * @author VR爱好者
 * @date 2022-03-28
 */
@RestController
@RequestMapping("/person/articles")
public class ArticlesController extends BaseController
{
    @Autowired
    private IArticlesService articlesService;

    /**
     * 查询文章列列表
     */
    @PreAuthorize("@ss.hasPermi('person:articles:list')")
    @GetMapping("/list")
    public TableDataInfo list(Articles articles)
    {
        startPage();
        List<Articles> list = articlesService.selectArticlesList(articles);
        return getDataTable(list);
    }

    /**
     * 导出文章列列表
     */
    @PreAuthorize("@ss.hasPermi('person:articles:export')")
    @Log(title = "文章列", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Articles articles)
    {
        List<Articles> list = articlesService.selectArticlesList(articles);
        ExcelUtil<Articles> util = new ExcelUtil<Articles>(Articles.class);
        util.exportExcel(response, list, "文章列数据");
    }

    /**
     * 获取文章列详细信息
     */
    @PreAuthorize("@ss.hasPermi('person:articles:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(articlesService.selectArticlesById(id));
    }

    /**
     * 新增文章列
     */
    @PreAuthorize("@ss.hasPermi('person:articles:add')")
    @Log(title = "文章列", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Articles articles)
    {
        return toAjax(articlesService.insertArticles(articles));
    }

    /**
     * 修改文章列
     */
    @PreAuthorize("@ss.hasPermi('person:articles:edit')")
    @Log(title = "文章列", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Articles articles)
    {
        return toAjax(articlesService.updateArticles(articles));
    }

    /**
     * 删除文章列
     */
    @PreAuthorize("@ss.hasPermi('person:articles:remove')")
    @Log(title = "文章列", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(articlesService.deleteArticlesByIds(ids));
    }
}
