package com.vrmlstudio.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.XinhuWotplMapper;
import com.vrmlstudio.xsystem.domain.XinhuWotpl;
import com.vrmlstudio.xsystem.service.IXinhuWotplService;

/**
 * 微信公众号消息模版Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuWotplServiceImpl implements IXinhuWotplService 
{
    @Autowired
    private XinhuWotplMapper xinhuWotplMapper;

    /**
     * 查询微信公众号消息模版
     * 
     * @param id 微信公众号消息模版主键
     * @return 微信公众号消息模版
     */
    @Override
    public XinhuWotpl selectXinhuWotplById(Long id)
    {
        return xinhuWotplMapper.selectXinhuWotplById(id);
    }

    /**
     * 查询微信公众号消息模版列表
     * 
     * @param xinhuWotpl 微信公众号消息模版
     * @return 微信公众号消息模版
     */
    @Override
    public List<XinhuWotpl> selectXinhuWotplList(XinhuWotpl xinhuWotpl)
    {
        return xinhuWotplMapper.selectXinhuWotplList(xinhuWotpl);
    }

    /**
     * 新增微信公众号消息模版
     * 
     * @param xinhuWotpl 微信公众号消息模版
     * @return 结果
     */
    @Override
    public int insertXinhuWotpl(XinhuWotpl xinhuWotpl)
    {
        return xinhuWotplMapper.insertXinhuWotpl(xinhuWotpl);
    }

    /**
     * 修改微信公众号消息模版
     * 
     * @param xinhuWotpl 微信公众号消息模版
     * @return 结果
     */
    @Override
    public int updateXinhuWotpl(XinhuWotpl xinhuWotpl)
    {
        return xinhuWotplMapper.updateXinhuWotpl(xinhuWotpl);
    }

    /**
     * 批量删除微信公众号消息模版
     * 
     * @param ids 需要删除的微信公众号消息模版主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWotplByIds(Long[] ids)
    {
        return xinhuWotplMapper.deleteXinhuWotplByIds(ids);
    }

    /**
     * 删除微信公众号消息模版信息
     * 
     * @param id 微信公众号消息模版主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWotplById(Long id)
    {
        return xinhuWotplMapper.deleteXinhuWotplById(id);
    }
}
