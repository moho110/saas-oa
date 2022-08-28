package com.vrmlstudio.resources.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.resources.mapper.XinhuSubscribeinfoMapper;
import com.vrmlstudio.resources.domain.XinhuSubscribeinfo;
import com.vrmlstudio.resources.service.IXinhuSubscribeinfoService;

/**
 * 订阅内容信息Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuSubscribeinfoServiceImpl implements IXinhuSubscribeinfoService 
{
    @Autowired
    private XinhuSubscribeinfoMapper xinhuSubscribeinfoMapper;

    /**
     * 查询订阅内容信息
     * 
     * @param id 订阅内容信息主键
     * @return 订阅内容信息
     */
    @Override
    public XinhuSubscribeinfo selectXinhuSubscribeinfoById(Long id)
    {
        return xinhuSubscribeinfoMapper.selectXinhuSubscribeinfoById(id);
    }

    /**
     * 查询订阅内容信息列表
     * 
     * @param xinhuSubscribeinfo 订阅内容信息
     * @return 订阅内容信息
     */
    @Override
    public List<XinhuSubscribeinfo> selectXinhuSubscribeinfoList(XinhuSubscribeinfo xinhuSubscribeinfo)
    {
        return xinhuSubscribeinfoMapper.selectXinhuSubscribeinfoList(xinhuSubscribeinfo);
    }

    /**
     * 新增订阅内容信息
     * 
     * @param xinhuSubscribeinfo 订阅内容信息
     * @return 结果
     */
    @Override
    public int insertXinhuSubscribeinfo(XinhuSubscribeinfo xinhuSubscribeinfo)
    {
        return xinhuSubscribeinfoMapper.insertXinhuSubscribeinfo(xinhuSubscribeinfo);
    }

    /**
     * 修改订阅内容信息
     * 
     * @param xinhuSubscribeinfo 订阅内容信息
     * @return 结果
     */
    @Override
    public int updateXinhuSubscribeinfo(XinhuSubscribeinfo xinhuSubscribeinfo)
    {
        return xinhuSubscribeinfoMapper.updateXinhuSubscribeinfo(xinhuSubscribeinfo);
    }

    /**
     * 批量删除订阅内容信息
     * 
     * @param ids 需要删除的订阅内容信息主键
     * @return 结果
     */
    @Override
    public int deleteXinhuSubscribeinfoByIds(Long[] ids)
    {
        return xinhuSubscribeinfoMapper.deleteXinhuSubscribeinfoByIds(ids);
    }

    /**
     * 删除订阅内容信息信息
     * 
     * @param id 订阅内容信息主键
     * @return 结果
     */
    @Override
    public int deleteXinhuSubscribeinfoById(Long id)
    {
        return xinhuSubscribeinfoMapper.deleteXinhuSubscribeinfoById(id);
    }
}
