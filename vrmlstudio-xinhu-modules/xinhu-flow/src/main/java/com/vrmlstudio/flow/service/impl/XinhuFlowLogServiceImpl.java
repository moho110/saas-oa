package com.vrmlstudio.flow.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.flow.mapper.XinhuFlowLogMapper;
import com.vrmlstudio.flow.domain.XinhuFlowLog;
import com.vrmlstudio.flow.service.IXinhuFlowLogService;

/**
 * 单据操作记录Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuFlowLogServiceImpl implements IXinhuFlowLogService 
{
    @Autowired
    private XinhuFlowLogMapper xinhuFlowLogMapper;

    /**
     * 查询单据操作记录
     * 
     * @param id 单据操作记录主键
     * @return 单据操作记录
     */
    @Override
    public XinhuFlowLog selectXinhuFlowLogById(Long id)
    {
        return xinhuFlowLogMapper.selectXinhuFlowLogById(id);
    }

    /**
     * 查询单据操作记录列表
     * 
     * @param xinhuFlowLog 单据操作记录
     * @return 单据操作记录
     */
    @Override
    public List<XinhuFlowLog> selectXinhuFlowLogList(XinhuFlowLog xinhuFlowLog)
    {
        return xinhuFlowLogMapper.selectXinhuFlowLogList(xinhuFlowLog);
    }

    /**
     * 新增单据操作记录
     * 
     * @param xinhuFlowLog 单据操作记录
     * @return 结果
     */
    @Override
    public int insertXinhuFlowLog(XinhuFlowLog xinhuFlowLog)
    {
        return xinhuFlowLogMapper.insertXinhuFlowLog(xinhuFlowLog);
    }

    /**
     * 修改单据操作记录
     * 
     * @param xinhuFlowLog 单据操作记录
     * @return 结果
     */
    @Override
    public int updateXinhuFlowLog(XinhuFlowLog xinhuFlowLog)
    {
        return xinhuFlowLogMapper.updateXinhuFlowLog(xinhuFlowLog);
    }

    /**
     * 批量删除单据操作记录
     * 
     * @param ids 需要删除的单据操作记录主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowLogByIds(Long[] ids)
    {
        return xinhuFlowLogMapper.deleteXinhuFlowLogByIds(ids);
    }

    /**
     * 删除单据操作记录信息
     * 
     * @param id 单据操作记录主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowLogById(Long id)
    {
        return xinhuFlowLogMapper.deleteXinhuFlowLogById(id);
    }
}
