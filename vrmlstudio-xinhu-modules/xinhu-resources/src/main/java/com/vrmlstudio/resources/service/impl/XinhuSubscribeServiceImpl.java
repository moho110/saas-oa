package com.vrmlstudio.resources.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.resources.mapper.XinhuSubscribeMapper;
import com.vrmlstudio.resources.domain.XinhuSubscribe;
import com.vrmlstudio.resources.service.IXinhuSubscribeService;

/**
 * 订阅管理Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuSubscribeServiceImpl implements IXinhuSubscribeService 
{
    @Autowired
    private XinhuSubscribeMapper xinhuSubscribeMapper;

    /**
     * 查询订阅管理
     * 
     * @param id 订阅管理主键
     * @return 订阅管理
     */
    @Override
    public XinhuSubscribe selectXinhuSubscribeById(Long id)
    {
        return xinhuSubscribeMapper.selectXinhuSubscribeById(id);
    }

    /**
     * 查询订阅管理列表
     * 
     * @param xinhuSubscribe 订阅管理
     * @return 订阅管理
     */
    @Override
    public List<XinhuSubscribe> selectXinhuSubscribeList(XinhuSubscribe xinhuSubscribe)
    {
        return xinhuSubscribeMapper.selectXinhuSubscribeList(xinhuSubscribe);
    }

    /**
     * 新增订阅管理
     * 
     * @param xinhuSubscribe 订阅管理
     * @return 结果
     */
    @Override
    public int insertXinhuSubscribe(XinhuSubscribe xinhuSubscribe)
    {
        return xinhuSubscribeMapper.insertXinhuSubscribe(xinhuSubscribe);
    }

    /**
     * 修改订阅管理
     * 
     * @param xinhuSubscribe 订阅管理
     * @return 结果
     */
    @Override
    public int updateXinhuSubscribe(XinhuSubscribe xinhuSubscribe)
    {
        return xinhuSubscribeMapper.updateXinhuSubscribe(xinhuSubscribe);
    }

    /**
     * 批量删除订阅管理
     * 
     * @param ids 需要删除的订阅管理主键
     * @return 结果
     */
    @Override
    public int deleteXinhuSubscribeByIds(Long[] ids)
    {
        return xinhuSubscribeMapper.deleteXinhuSubscribeByIds(ids);
    }

    /**
     * 删除订阅管理信息
     * 
     * @param id 订阅管理主键
     * @return 结果
     */
    @Override
    public int deleteXinhuSubscribeById(Long id)
    {
        return xinhuSubscribeMapper.deleteXinhuSubscribeById(id);
    }
}
