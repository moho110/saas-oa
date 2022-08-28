package com.vrmlstudio.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.finance.mapper.XinhuCustplanMapper;
import com.vrmlstudio.finance.domain.XinhuCustplan;
import com.vrmlstudio.finance.service.IXinhuCustplanService;

/**
 * 跟进计划Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuCustplanServiceImpl implements IXinhuCustplanService 
{
    @Autowired
    private XinhuCustplanMapper xinhuCustplanMapper;

    /**
     * 查询跟进计划
     * 
     * @param id 跟进计划主键
     * @return 跟进计划
     */
    @Override
    public XinhuCustplan selectXinhuCustplanById(Long id)
    {
        return xinhuCustplanMapper.selectXinhuCustplanById(id);
    }

    /**
     * 查询跟进计划列表
     * 
     * @param xinhuCustplan 跟进计划
     * @return 跟进计划
     */
    @Override
    public List<XinhuCustplan> selectXinhuCustplanList(XinhuCustplan xinhuCustplan)
    {
        return xinhuCustplanMapper.selectXinhuCustplanList(xinhuCustplan);
    }

    /**
     * 新增跟进计划
     * 
     * @param xinhuCustplan 跟进计划
     * @return 结果
     */
    @Override
    public int insertXinhuCustplan(XinhuCustplan xinhuCustplan)
    {
        return xinhuCustplanMapper.insertXinhuCustplan(xinhuCustplan);
    }

    /**
     * 修改跟进计划
     * 
     * @param xinhuCustplan 跟进计划
     * @return 结果
     */
    @Override
    public int updateXinhuCustplan(XinhuCustplan xinhuCustplan)
    {
        return xinhuCustplanMapper.updateXinhuCustplan(xinhuCustplan);
    }

    /**
     * 批量删除跟进计划
     * 
     * @param ids 需要删除的跟进计划主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCustplanByIds(Long[] ids)
    {
        return xinhuCustplanMapper.deleteXinhuCustplanByIds(ids);
    }

    /**
     * 删除跟进计划信息
     * 
     * @param id 跟进计划主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCustplanById(Long id)
    {
        return xinhuCustplanMapper.deleteXinhuCustplanById(id);
    }
}
