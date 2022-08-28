package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuInfors;
import com.vrmlstudio.hr.mapper.XinhuInforsMapper;
import com.vrmlstudio.hr.service.IXinhuInforsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 信息子投票项Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuInforsServiceImpl implements IXinhuInforsService
{
    @Autowired
    private XinhuInforsMapper xinhuInforsMapper;

    /**
     * 查询信息子投票项
     * 
     * @param id 信息子投票项主键
     * @return 信息子投票项
     */
    @Override
    public XinhuInfors selectXinhuInforsById(Long id)
    {
        return xinhuInforsMapper.selectXinhuInforsById(id);
    }

    /**
     * 查询信息子投票项列表
     * 
     * @param xinhuInfors 信息子投票项
     * @return 信息子投票项
     */
    @Override
    public List<XinhuInfors> selectXinhuInforsList(XinhuInfors xinhuInfors)
    {
        return xinhuInforsMapper.selectXinhuInforsList(xinhuInfors);
    }

    /**
     * 新增信息子投票项
     * 
     * @param xinhuInfors 信息子投票项
     * @return 结果
     */
    @Override
    public int insertXinhuInfors(XinhuInfors xinhuInfors)
    {
        return xinhuInforsMapper.insertXinhuInfors(xinhuInfors);
    }

    /**
     * 修改信息子投票项
     * 
     * @param xinhuInfors 信息子投票项
     * @return 结果
     */
    @Override
    public int updateXinhuInfors(XinhuInfors xinhuInfors)
    {
        return xinhuInforsMapper.updateXinhuInfors(xinhuInfors);
    }

    /**
     * 批量删除信息子投票项
     * 
     * @param ids 需要删除的信息子投票项主键
     * @return 结果
     */
    @Override
    public int deleteXinhuInforsByIds(Long[] ids)
    {
        return xinhuInforsMapper.deleteXinhuInforsByIds(ids);
    }

    /**
     * 删除信息子投票项信息
     * 
     * @param id 信息子投票项主键
     * @return 结果
     */
    @Override
    public int deleteXinhuInforsById(Long id)
    {
        return xinhuInforsMapper.deleteXinhuInforsById(id);
    }
}
