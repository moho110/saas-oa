package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuImMesszt;
import com.vrmlstudio.hr.mapper.XinhuImMessztMapper;
import com.vrmlstudio.hr.service.IXinhuImMessztService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * IM聊天消息状态Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuImMessztServiceImpl implements IXinhuImMessztService
{
    @Autowired
    private XinhuImMessztMapper xinhuImMessztMapper;

    /**
     * 查询IM聊天消息状态
     * 
     * @param id IM聊天消息状态主键
     * @return IM聊天消息状态
     */
    @Override
    public XinhuImMesszt selectXinhuImMessztById(Long id)
    {
        return xinhuImMessztMapper.selectXinhuImMessztById(id);
    }

    /**
     * 查询IM聊天消息状态列表
     * 
     * @param xinhuImMesszt IM聊天消息状态
     * @return IM聊天消息状态
     */
    @Override
    public List<XinhuImMesszt> selectXinhuImMessztList(XinhuImMesszt xinhuImMesszt)
    {
        return xinhuImMessztMapper.selectXinhuImMessztList(xinhuImMesszt);
    }

    /**
     * 新增IM聊天消息状态
     * 
     * @param xinhuImMesszt IM聊天消息状态
     * @return 结果
     */
    @Override
    public int insertXinhuImMesszt(XinhuImMesszt xinhuImMesszt)
    {
        return xinhuImMessztMapper.insertXinhuImMesszt(xinhuImMesszt);
    }

    /**
     * 修改IM聊天消息状态
     * 
     * @param xinhuImMesszt IM聊天消息状态
     * @return 结果
     */
    @Override
    public int updateXinhuImMesszt(XinhuImMesszt xinhuImMesszt)
    {
        return xinhuImMessztMapper.updateXinhuImMesszt(xinhuImMesszt);
    }

    /**
     * 批量删除IM聊天消息状态
     * 
     * @param ids 需要删除的IM聊天消息状态主键
     * @return 结果
     */
    @Override
    public int deleteXinhuImMessztByIds(Long[] ids)
    {
        return xinhuImMessztMapper.deleteXinhuImMessztByIds(ids);
    }

    /**
     * 删除IM聊天消息状态信息
     * 
     * @param id IM聊天消息状态主键
     * @return 结果
     */
    @Override
    public int deleteXinhuImMessztById(Long id)
    {
        return xinhuImMessztMapper.deleteXinhuImMessztById(id);
    }
}
