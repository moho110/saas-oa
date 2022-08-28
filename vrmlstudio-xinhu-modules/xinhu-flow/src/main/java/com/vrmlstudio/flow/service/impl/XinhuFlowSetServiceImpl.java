package com.vrmlstudio.flow.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.flow.mapper.XinhuFlowSetMapper;
import com.vrmlstudio.flow.domain.XinhuFlowSet;
import com.vrmlstudio.flow.service.IXinhuFlowSetService;

/**
 * 流程模块Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuFlowSetServiceImpl implements IXinhuFlowSetService 
{
    @Autowired
    private XinhuFlowSetMapper xinhuFlowSetMapper;

    /**
     * 查询流程模块
     * 
     * @param id 流程模块主键
     * @return 流程模块
     */
    @Override
    public XinhuFlowSet selectXinhuFlowSetById(Long id)
    {
        return xinhuFlowSetMapper.selectXinhuFlowSetById(id);
    }

    /**
     * 查询流程模块列表
     * 
     * @param xinhuFlowSet 流程模块
     * @return 流程模块
     */
    @Override
    public List<XinhuFlowSet> selectXinhuFlowSetList(XinhuFlowSet xinhuFlowSet)
    {
        return xinhuFlowSetMapper.selectXinhuFlowSetList(xinhuFlowSet);
    }

    /**
     * 新增流程模块
     * 
     * @param xinhuFlowSet 流程模块
     * @return 结果
     */
    @Override
    public int insertXinhuFlowSet(XinhuFlowSet xinhuFlowSet)
    {
        return xinhuFlowSetMapper.insertXinhuFlowSet(xinhuFlowSet);
    }

    /**
     * 修改流程模块
     * 
     * @param xinhuFlowSet 流程模块
     * @return 结果
     */
    @Override
    public int updateXinhuFlowSet(XinhuFlowSet xinhuFlowSet)
    {
        return xinhuFlowSetMapper.updateXinhuFlowSet(xinhuFlowSet);
    }

    /**
     * 批量删除流程模块
     * 
     * @param ids 需要删除的流程模块主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowSetByIds(Long[] ids)
    {
        return xinhuFlowSetMapper.deleteXinhuFlowSetByIds(ids);
    }

    /**
     * 删除流程模块信息
     * 
     * @param id 流程模块主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowSetById(Long id)
    {
        return xinhuFlowSetMapper.deleteXinhuFlowSetById(id);
    }
}
