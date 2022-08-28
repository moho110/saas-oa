package com.vrmlstudio.person.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.person.mapper.ArticlesMapper;
import com.vrmlstudio.person.domain.Articles;
import com.vrmlstudio.person.service.IArticlesService;

/**
 * 文章列Service业务层处理
 * 
 * @author VR爱好者
 * @date 2022-03-28
 */
@Service
public class ArticlesServiceImpl implements IArticlesService 
{
    @Autowired(required = false)
    private ArticlesMapper articlesMapper;

    /**
     * 查询文章列
     * 
     * @param id 文章列主键
     * @return 文章列
     */
    @Override
    public Articles selectArticlesById(Long id)
    {
        return articlesMapper.selectArticlesById(id);
    }

    /**
     * 查询文章列列表
     * 
     * @param articles 文章列
     * @return 文章列
     */
    @Override
    public List<Articles> selectArticlesList(Articles articles)
    {
        return articlesMapper.selectArticlesList(articles);
    }

    /**
     * 新增文章列
     * 
     * @param articles 文章列
     * @return 结果
     */
    @Override
    public int insertArticles(Articles articles)
    {
        return articlesMapper.insertArticles(articles);
    }

    /**
     * 修改文章列
     * 
     * @param articles 文章列
     * @return 结果
     */
    @Override
    public int updateArticles(Articles articles)
    {
        return articlesMapper.updateArticles(articles);
    }

    /**
     * 批量删除文章列
     * 
     * @param ids 需要删除的文章列主键
     * @return 结果
     */
    @Override
    public int deleteArticlesByIds(Long[] ids)
    {
        return articlesMapper.deleteArticlesByIds(ids);
    }

    /**
     * 删除文章列信息
     * 
     * @param id 文章列主键
     * @return 结果
     */
    @Override
    public int deleteArticlesById(Long id)
    {
        return articlesMapper.deleteArticlesById(id);
    }
}
