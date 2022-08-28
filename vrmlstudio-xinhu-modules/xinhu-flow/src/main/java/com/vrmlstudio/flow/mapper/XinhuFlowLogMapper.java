package com.vrmlstudio.flow.mapper;

import java.util.List;
import com.vrmlstudio.flow.domain.XinhuFlowLog;

/**
 * 单据操作记录Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuFlowLogMapper 
{
    /**
     * 查询单据操作记录
     * 
     * @param id 单据操作记录主键
     * @return 单据操作记录
     */
    public XinhuFlowLog selectXinhuFlowLogById(Long id);

    /**
     * 查询单据操作记录列表
     * 
     * @param xinhuFlowLog 单据操作记录
     * @return 单据操作记录集合
     */
    public List<XinhuFlowLog> selectXinhuFlowLogList(XinhuFlowLog xinhuFlowLog);

    /**
     * 新增单据操作记录
     * 
     * @param xinhuFlowLog 单据操作记录
     * @return 结果
     */
    public int insertXinhuFlowLog(XinhuFlowLog xinhuFlowLog);

    /**
     * 修改单据操作记录
     * 
     * @param xinhuFlowLog 单据操作记录
     * @return 结果
     */
    public int updateXinhuFlowLog(XinhuFlowLog xinhuFlowLog);

    /**
     * 删除单据操作记录
     * 
     * @param id 单据操作记录主键
     * @return 结果
     */
    public int deleteXinhuFlowLogById(Long id);

    /**
     * 批量删除单据操作记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuFlowLogByIds(Long[] ids);
}
