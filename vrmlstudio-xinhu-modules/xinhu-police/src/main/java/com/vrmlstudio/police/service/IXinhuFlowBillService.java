package com.vrmlstudio.police.service;

import java.util.List;
import com.vrmlstudio.police.domain.XinhuFlowBill;

/**
 * 流程单据Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuFlowBillService 
{
    /**
     * 查询流程单据
     * 
     * @param id 流程单据主键
     * @return 流程单据
     */
    public XinhuFlowBill selectXinhuFlowBillById(Long id);

    /**
     * 查询流程单据列表
     * 
     * @param xinhuFlowBill 流程单据
     * @return 流程单据集合
     */
    public List<XinhuFlowBill> selectXinhuFlowBillList(XinhuFlowBill xinhuFlowBill);

    /**
     * 新增流程单据
     * 
     * @param xinhuFlowBill 流程单据
     * @return 结果
     */
    public int insertXinhuFlowBill(XinhuFlowBill xinhuFlowBill);

    /**
     * 修改流程单据
     * 
     * @param xinhuFlowBill 流程单据
     * @return 结果
     */
    public int updateXinhuFlowBill(XinhuFlowBill xinhuFlowBill);

    /**
     * 批量删除流程单据
     * 
     * @param ids 需要删除的流程单据主键集合
     * @return 结果
     */
    public int deleteXinhuFlowBillByIds(Long[] ids);

    /**
     * 删除流程单据信息
     * 
     * @param id 流程单据主键
     * @return 结果
     */
    public int deleteXinhuFlowBillById(Long id);
}
