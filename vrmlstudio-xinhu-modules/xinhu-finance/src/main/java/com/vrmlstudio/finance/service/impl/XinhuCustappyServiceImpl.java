package com.vrmlstudio.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.finance.mapper.XinhuCustappyMapper;
import com.vrmlstudio.finance.domain.XinhuCustappy;
import com.vrmlstudio.finance.service.IXinhuCustappyService;

/**
 * 客户申请使用Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuCustappyServiceImpl implements IXinhuCustappyService 
{
    @Autowired
    private XinhuCustappyMapper xinhuCustappyMapper;

    /**
     * 查询客户申请使用
     * 
     * @param id 客户申请使用主键
     * @return 客户申请使用
     */
    @Override
    public XinhuCustappy selectXinhuCustappyById(Long id)
    {
        return xinhuCustappyMapper.selectXinhuCustappyById(id);
    }

    /**
     * 查询客户申请使用列表
     * 
     * @param xinhuCustappy 客户申请使用
     * @return 客户申请使用
     */
    @Override
    public List<XinhuCustappy> selectXinhuCustappyList(XinhuCustappy xinhuCustappy)
    {
        return xinhuCustappyMapper.selectXinhuCustappyList(xinhuCustappy);
    }

    /**
     * 新增客户申请使用
     * 
     * @param xinhuCustappy 客户申请使用
     * @return 结果
     */
    @Override
    public int insertXinhuCustappy(XinhuCustappy xinhuCustappy)
    {
        return xinhuCustappyMapper.insertXinhuCustappy(xinhuCustappy);
    }

    /**
     * 修改客户申请使用
     * 
     * @param xinhuCustappy 客户申请使用
     * @return 结果
     */
    @Override
    public int updateXinhuCustappy(XinhuCustappy xinhuCustappy)
    {
        return xinhuCustappyMapper.updateXinhuCustappy(xinhuCustappy);
    }

    /**
     * 批量删除客户申请使用
     * 
     * @param ids 需要删除的客户申请使用主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCustappyByIds(Long[] ids)
    {
        return xinhuCustappyMapper.deleteXinhuCustappyByIds(ids);
    }

    /**
     * 删除客户申请使用信息
     * 
     * @param id 客户申请使用主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCustappyById(Long id)
    {
        return xinhuCustappyMapper.deleteXinhuCustappyById(id);
    }
}
