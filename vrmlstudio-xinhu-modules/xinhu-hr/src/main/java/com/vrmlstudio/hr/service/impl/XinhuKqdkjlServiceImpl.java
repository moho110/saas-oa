package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuKqdkjl;
import com.vrmlstudio.hr.mapper.XinhuKqdkjlMapper;
import com.vrmlstudio.hr.service.IXinhuKqdkjlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 打卡记录Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuKqdkjlServiceImpl implements IXinhuKqdkjlService
{
    @Autowired
    private XinhuKqdkjlMapper xinhuKqdkjlMapper;

    /**
     * 查询打卡记录
     * 
     * @param id 打卡记录主键
     * @return 打卡记录
     */
    @Override
    public XinhuKqdkjl selectXinhuKqdkjlById(Long id)
    {
        return xinhuKqdkjlMapper.selectXinhuKqdkjlById(id);
    }

    /**
     * 查询打卡记录列表
     * 
     * @param xinhuKqdkjl 打卡记录
     * @return 打卡记录
     */
    @Override
    public List<XinhuKqdkjl> selectXinhuKqdkjlList(XinhuKqdkjl xinhuKqdkjl)
    {
        return xinhuKqdkjlMapper.selectXinhuKqdkjlList(xinhuKqdkjl);
    }

    /**
     * 新增打卡记录
     * 
     * @param xinhuKqdkjl 打卡记录
     * @return 结果
     */
    @Override
    public int insertXinhuKqdkjl(XinhuKqdkjl xinhuKqdkjl)
    {
        return xinhuKqdkjlMapper.insertXinhuKqdkjl(xinhuKqdkjl);
    }

    /**
     * 修改打卡记录
     * 
     * @param xinhuKqdkjl 打卡记录
     * @return 结果
     */
    @Override
    public int updateXinhuKqdkjl(XinhuKqdkjl xinhuKqdkjl)
    {
        return xinhuKqdkjlMapper.updateXinhuKqdkjl(xinhuKqdkjl);
    }

    /**
     * 批量删除打卡记录
     * 
     * @param ids 需要删除的打卡记录主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqdkjlByIds(Long[] ids)
    {
        return xinhuKqdkjlMapper.deleteXinhuKqdkjlByIds(ids);
    }

    /**
     * 删除打卡记录信息
     * 
     * @param id 打卡记录主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqdkjlById(Long id)
    {
        return xinhuKqdkjlMapper.deleteXinhuKqdkjlById(id);
    }
}
