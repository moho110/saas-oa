package com.vrmlstudio.finance.service;

import java.util.List;
import com.vrmlstudio.finance.domain.XinhuCustomer;

/**
 * 客户Service接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface IXinhuCustomerService 
{
    /**
     * 查询客户
     * 
     * @param id 客户主键
     * @return 客户
     */
    public XinhuCustomer selectXinhuCustomerById(Long id);

    /**
     * 查询客户列表
     * 
     * @param xinhuCustomer 客户
     * @return 客户集合
     */
    public List<XinhuCustomer> selectXinhuCustomerList(XinhuCustomer xinhuCustomer);

    /**
     * 新增客户
     * 
     * @param xinhuCustomer 客户
     * @return 结果
     */
    public int insertXinhuCustomer(XinhuCustomer xinhuCustomer);

    /**
     * 修改客户
     * 
     * @param xinhuCustomer 客户
     * @return 结果
     */
    public int updateXinhuCustomer(XinhuCustomer xinhuCustomer);

    /**
     * 批量删除客户
     * 
     * @param ids 需要删除的客户主键集合
     * @return 结果
     */
    public int deleteXinhuCustomerByIds(Long[] ids);

    /**
     * 删除客户信息
     * 
     * @param id 客户主键
     * @return 结果
     */
    public int deleteXinhuCustomerById(Long id);
}
