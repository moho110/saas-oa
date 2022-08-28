package com.vrmlstudio.flow.service;

import java.util.List;
import com.vrmlstudio.flow.domain.XinhuFlowSet;

/**
 * 流程模块Service接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface IXinhuFlowSetService 
{
    /**
     * 查询流程模块
     * 
     * @param id 流程模块主键
     * @return 流程模块
     */
    public XinhuFlowSet selectXinhuFlowSetById(Long id);

    /**
     * 查询流程模块列表
     * 
     * @param xinhuFlowSet 流程模块
     * @return 流程模块集合
     */
    public List<XinhuFlowSet> selectXinhuFlowSetList(XinhuFlowSet xinhuFlowSet);

    /**
     * 新增流程模块
     * 
     * @param xinhuFlowSet 流程模块
     * @return 结果
     */
    public int insertXinhuFlowSet(XinhuFlowSet xinhuFlowSet);

    /**
     * 修改流程模块
     * 
     * @param xinhuFlowSet 流程模块
     * @return 结果
     */
    public int updateXinhuFlowSet(XinhuFlowSet xinhuFlowSet);

    /**
     * 批量删除流程模块
     * 
     * @param ids 需要删除的流程模块主键集合
     * @return 结果
     */
    public int deleteXinhuFlowSetByIds(Long[] ids);

    /**
     * 删除流程模块信息
     * 
     * @param id 流程模块主键
     * @return 结果
     */
    public int deleteXinhuFlowSetById(Long id);
}
