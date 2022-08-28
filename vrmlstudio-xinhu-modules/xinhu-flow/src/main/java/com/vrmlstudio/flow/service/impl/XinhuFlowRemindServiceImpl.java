package com.vrmlstudio.flow.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.flow.mapper.XinhuFlowRemindMapper;
import com.vrmlstudio.flow.domain.XinhuFlowRemind;
import com.vrmlstudio.flow.service.IXinhuFlowRemindService;

/**
 * 单据提醒设置Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuFlowRemindServiceImpl implements IXinhuFlowRemindService 
{
    @Autowired
    private XinhuFlowRemindMapper xinhuFlowRemindMapper;

    /**
     * 查询单据提醒设置
     * 
     * @param id 单据提醒设置主键
     * @return 单据提醒设置
     */
    @Override
    public XinhuFlowRemind selectXinhuFlowRemindById(Long id)
    {
        return xinhuFlowRemindMapper.selectXinhuFlowRemindById(id);
    }

    /**
     * 查询单据提醒设置列表
     * 
     * @param xinhuFlowRemind 单据提醒设置
     * @return 单据提醒设置
     */
    @Override
    public List<XinhuFlowRemind> selectXinhuFlowRemindList(XinhuFlowRemind xinhuFlowRemind)
    {
        return xinhuFlowRemindMapper.selectXinhuFlowRemindList(xinhuFlowRemind);
    }

    /**
     * 新增单据提醒设置
     * 
     * @param xinhuFlowRemind 单据提醒设置
     * @return 结果
     */
    @Override
    public int insertXinhuFlowRemind(XinhuFlowRemind xinhuFlowRemind)
    {
        return xinhuFlowRemindMapper.insertXinhuFlowRemind(xinhuFlowRemind);
    }

    /**
     * 修改单据提醒设置
     * 
     * @param xinhuFlowRemind 单据提醒设置
     * @return 结果
     */
    @Override
    public int updateXinhuFlowRemind(XinhuFlowRemind xinhuFlowRemind)
    {
        return xinhuFlowRemindMapper.updateXinhuFlowRemind(xinhuFlowRemind);
    }

    /**
     * 批量删除单据提醒设置
     * 
     * @param ids 需要删除的单据提醒设置主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowRemindByIds(Long[] ids)
    {
        return xinhuFlowRemindMapper.deleteXinhuFlowRemindByIds(ids);
    }

    /**
     * 删除单据提醒设置信息
     * 
     * @param id 单据提醒设置主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowRemindById(Long id)
    {
        return xinhuFlowRemindMapper.deleteXinhuFlowRemindById(id);
    }
}
