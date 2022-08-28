package com.vrmlstudio.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.finance.mapper.XinhuReadsMapper;
import com.vrmlstudio.finance.domain.XinhuReads;
import com.vrmlstudio.finance.service.IXinhuReadsService;

/**
 * 单据浏览记录Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuReadsServiceImpl implements IXinhuReadsService 
{
    @Autowired
    private XinhuReadsMapper xinhuReadsMapper;

    /**
     * 查询单据浏览记录
     * 
     * @param id 单据浏览记录主键
     * @return 单据浏览记录
     */
    @Override
    public XinhuReads selectXinhuReadsById(Long id)
    {
        return xinhuReadsMapper.selectXinhuReadsById(id);
    }

    /**
     * 查询单据浏览记录列表
     * 
     * @param xinhuReads 单据浏览记录
     * @return 单据浏览记录
     */
    @Override
    public List<XinhuReads> selectXinhuReadsList(XinhuReads xinhuReads)
    {
        return xinhuReadsMapper.selectXinhuReadsList(xinhuReads);
    }

    /**
     * 新增单据浏览记录
     * 
     * @param xinhuReads 单据浏览记录
     * @return 结果
     */
    @Override
    public int insertXinhuReads(XinhuReads xinhuReads)
    {
        return xinhuReadsMapper.insertXinhuReads(xinhuReads);
    }

    /**
     * 修改单据浏览记录
     * 
     * @param xinhuReads 单据浏览记录
     * @return 结果
     */
    @Override
    public int updateXinhuReads(XinhuReads xinhuReads)
    {
        return xinhuReadsMapper.updateXinhuReads(xinhuReads);
    }

    /**
     * 批量删除单据浏览记录
     * 
     * @param ids 需要删除的单据浏览记录主键
     * @return 结果
     */
    @Override
    public int deleteXinhuReadsByIds(Long[] ids)
    {
        return xinhuReadsMapper.deleteXinhuReadsByIds(ids);
    }

    /**
     * 删除单据浏览记录信息
     * 
     * @param id 单据浏览记录主键
     * @return 结果
     */
    @Override
    public int deleteXinhuReadsById(Long id)
    {
        return xinhuReadsMapper.deleteXinhuReadsById(id);
    }
}
