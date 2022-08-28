package com.vrmlstudio.police.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.police.mapper.XinhuFlowBillMapper;
import com.vrmlstudio.police.domain.XinhuFlowBill;
import com.vrmlstudio.police.service.IXinhuFlowBillService;

/**
 * 流程单据Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuFlowBillServiceImpl implements IXinhuFlowBillService 
{
    @Autowired
    private XinhuFlowBillMapper xinhuFlowBillMapper;

    /**
     * 查询流程单据
     * 
     * @param id 流程单据主键
     * @return 流程单据
     */
    @Override
    public XinhuFlowBill selectXinhuFlowBillById(Long id)
    {
        return xinhuFlowBillMapper.selectXinhuFlowBillById(id);
    }

    /**
     * 查询流程单据列表
     * 
     * @param xinhuFlowBill 流程单据
     * @return 流程单据
     */
    @Override
    public List<XinhuFlowBill> selectXinhuFlowBillList(XinhuFlowBill xinhuFlowBill)
    {
        return xinhuFlowBillMapper.selectXinhuFlowBillList(xinhuFlowBill);
    }

    /**
     * 新增流程单据
     * 
     * @param xinhuFlowBill 流程单据
     * @return 结果
     */
    @Override
    public int insertXinhuFlowBill(XinhuFlowBill xinhuFlowBill)
    {
        return xinhuFlowBillMapper.insertXinhuFlowBill(xinhuFlowBill);
    }

    /**
     * 修改流程单据
     * 
     * @param xinhuFlowBill 流程单据
     * @return 结果
     */
    @Override
    public int updateXinhuFlowBill(XinhuFlowBill xinhuFlowBill)
    {
        return xinhuFlowBillMapper.updateXinhuFlowBill(xinhuFlowBill);
    }

    /**
     * 批量删除流程单据
     * 
     * @param ids 需要删除的流程单据主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowBillByIds(Long[] ids)
    {
        return xinhuFlowBillMapper.deleteXinhuFlowBillByIds(ids);
    }

    /**
     * 删除流程单据信息
     * 
     * @param id 流程单据主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowBillById(Long id)
    {
        return xinhuFlowBillMapper.deleteXinhuFlowBillById(id);
    }
}
