package com.vrmlstudio.flow.service;

import java.util.List;
import com.vrmlstudio.flow.domain.XinhuFlowChecks;

/**
 * 单据的审核人Service接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface IXinhuFlowChecksService 
{
    /**
     * 查询单据的审核人
     * 
     * @param id 单据的审核人主键
     * @return 单据的审核人
     */
    public XinhuFlowChecks selectXinhuFlowChecksById(Long id);

    /**
     * 查询单据的审核人列表
     * 
     * @param xinhuFlowChecks 单据的审核人
     * @return 单据的审核人集合
     */
    public List<XinhuFlowChecks> selectXinhuFlowChecksList(XinhuFlowChecks xinhuFlowChecks);

    /**
     * 新增单据的审核人
     * 
     * @param xinhuFlowChecks 单据的审核人
     * @return 结果
     */
    public int insertXinhuFlowChecks(XinhuFlowChecks xinhuFlowChecks);

    /**
     * 修改单据的审核人
     * 
     * @param xinhuFlowChecks 单据的审核人
     * @return 结果
     */
    public int updateXinhuFlowChecks(XinhuFlowChecks xinhuFlowChecks);

    /**
     * 批量删除单据的审核人
     * 
     * @param ids 需要删除的单据的审核人主键集合
     * @return 结果
     */
    public int deleteXinhuFlowChecksByIds(Long[] ids);

    /**
     * 删除单据的审核人信息
     * 
     * @param id 单据的审核人主键
     * @return 结果
     */
    public int deleteXinhuFlowChecksById(Long id);
}
