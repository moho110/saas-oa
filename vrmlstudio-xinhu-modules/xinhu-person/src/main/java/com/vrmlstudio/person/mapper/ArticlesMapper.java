package com.vrmlstudio.person.mapper;

import java.util.List;
import com.vrmlstudio.person.domain.Articles;

/**
 * 文章列Mapper接口
 * 
 * @author VR爱好者
 * @date 2022-03-28
 */
public interface ArticlesMapper 
{
    /**
     * 查询文章列
     * 
     * @param id 文章列主键
     * @return 文章列
     */
    public Articles selectArticlesById(Long id);

    /**
     * 查询文章列列表
     * 
     * @param articles 文章列
     * @return 文章列集合
     */
    public List<Articles> selectArticlesList(Articles articles);

    /**
     * 新增文章列
     * 
     * @param articles 文章列
     * @return 结果
     */
    public int insertArticles(Articles articles);

    /**
     * 修改文章列
     * 
     * @param articles 文章列
     * @return 结果
     */
    public int updateArticles(Articles articles);

    /**
     * 删除文章列
     * 
     * @param id 文章列主键
     * @return 结果
     */
    public int deleteArticlesById(Long id);

    /**
     * 批量删除文章列
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteArticlesByIds(Long[] ids);
}
