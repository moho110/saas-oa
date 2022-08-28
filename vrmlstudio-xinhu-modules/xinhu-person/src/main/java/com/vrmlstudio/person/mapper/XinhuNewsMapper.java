package com.vrmlstudio.person.mapper;

import java.util.List;
import com.vrmlstudio.person.domain.XinhuNews;

/**
 * 新闻资讯Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuNewsMapper 
{
    /**
     * 查询新闻资讯
     * 
     * @param id 新闻资讯主键
     * @return 新闻资讯
     */
    public XinhuNews selectXinhuNewsById(Long id);

    /**
     * 查询新闻资讯列表
     * 
     * @param xinhuNews 新闻资讯
     * @return 新闻资讯集合
     */
    public List<XinhuNews> selectXinhuNewsList(XinhuNews xinhuNews);

    /**
     * 新增新闻资讯
     * 
     * @param xinhuNews 新闻资讯
     * @return 结果
     */
    public int insertXinhuNews(XinhuNews xinhuNews);

    /**
     * 修改新闻资讯
     * 
     * @param xinhuNews 新闻资讯
     * @return 结果
     */
    public int updateXinhuNews(XinhuNews xinhuNews);

    /**
     * 删除新闻资讯
     * 
     * @param id 新闻资讯主键
     * @return 结果
     */
    public int deleteXinhuNewsById(Long id);

    /**
     * 批量删除新闻资讯
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuNewsByIds(Long[] ids);
}
