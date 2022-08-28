package com.vrmlstudio.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.finance.mapper.XinhuCustomerMapper;
import com.vrmlstudio.finance.domain.XinhuCustomer;
import com.vrmlstudio.finance.service.IXinhuCustomerService;

/**
 * 客户Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuCustomerServiceImpl implements IXinhuCustomerService 
{
    @Autowired
    private XinhuCustomerMapper xinhuCustomerMapper;

    /**
     * 查询客户
     * 
     * @param id 客户主键
     * @return 客户
     */
    @Override
    public XinhuCustomer selectXinhuCustomerById(Long id)
    {
        return xinhuCustomerMapper.selectXinhuCustomerById(id);
    }

    /**
     * 查询客户列表
     * 
     * @param xinhuCustomer 客户
     * @return 客户
     */
    @Override
    public List<XinhuCustomer> selectXinhuCustomerList(XinhuCustomer xinhuCustomer)
    {
        return xinhuCustomerMapper.selectXinhuCustomerList(xinhuCustomer);
    }

    /**
     * 新增客户
     * 
     * @param xinhuCustomer 客户
     * @return 结果
     */
    @Override
    public int insertXinhuCustomer(XinhuCustomer xinhuCustomer)
    {
        return xinhuCustomerMapper.insertXinhuCustomer(xinhuCustomer);
    }

    /**
     * 修改客户
     * 
     * @param xinhuCustomer 客户
     * @return 结果
     */
    @Override
    public int updateXinhuCustomer(XinhuCustomer xinhuCustomer)
    {
        return xinhuCustomerMapper.updateXinhuCustomer(xinhuCustomer);
    }

    /**
     * 批量删除客户
     * 
     * @param ids 需要删除的客户主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCustomerByIds(Long[] ids)
    {
        return xinhuCustomerMapper.deleteXinhuCustomerByIds(ids);
    }

    /**
     * 删除客户信息
     * 
     * @param id 客户主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCustomerById(Long id)
    {
        return xinhuCustomerMapper.deleteXinhuCustomerById(id);
    }
}
