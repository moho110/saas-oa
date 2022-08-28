package com.vrmlstudio.person.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.person.mapper.XinhuNewsMapper;
import com.vrmlstudio.person.domain.XinhuNews;
import com.vrmlstudio.person.service.IXinhuNewsService;

/**
 * 新闻资讯Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuNewsServiceImpl implements IXinhuNewsService 
{
    @Autowired
    private XinhuNewsMapper xinhuNewsMapper;

    /**
     * 查询新闻资讯
     * 
     * @param id 新闻资讯主键
     * @return 新闻资讯
     */
    @Override
    public XinhuNews selectXinhuNewsById(Long id)
    {
        return xinhuNewsMapper.selectXinhuNewsById(id);
    }

    /**
     * 查询新闻资讯列表
     * 
     * @param xinhuNews 新闻资讯
     * @return 新闻资讯
     */
    @Override
    public List<XinhuNews> selectXinhuNewsList(XinhuNews xinhuNews)
    {
        return xinhuNewsMapper.selectXinhuNewsList(xinhuNews);
    }

    /**
     * 新增新闻资讯
     * 
     * @param xinhuNews 新闻资讯
     * @return 结果
     */
    @Override
    public int insertXinhuNews(XinhuNews xinhuNews)
    {
        return xinhuNewsMapper.insertXinhuNews(xinhuNews);
    }

    /**
     * 修改新闻资讯
     * 
     * @param xinhuNews 新闻资讯
     * @return 结果
     */
    @Override
    public int updateXinhuNews(XinhuNews xinhuNews)
    {
        return xinhuNewsMapper.updateXinhuNews(xinhuNews);
    }

    /**
     * 批量删除新闻资讯
     * 
     * @param ids 需要删除的新闻资讯主键
     * @return 结果
     */
    @Override
    public int deleteXinhuNewsByIds(Long[] ids)
    {
        return xinhuNewsMapper.deleteXinhuNewsByIds(ids);
    }

    /**
     * 删除新闻资讯信息
     * 
     * @param id 新闻资讯主键
     * @return 结果
     */
    @Override
    public int deleteXinhuNewsById(Long id)
    {
        return xinhuNewsMapper.deleteXinhuNewsById(id);
    }
}
