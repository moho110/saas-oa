package com.vrmlstudio.finance.service;

import java.util.List;
import com.vrmlstudio.finance.domain.XinhuCustappy;

/**
 * 客户申请使用Service接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface IXinhuCustappyService 
{
    /**
     * 查询客户申请使用
     * 
     * @param id 客户申请使用主键
     * @return 客户申请使用
     */
    public XinhuCustappy selectXinhuCustappyById(Long id);

    /**
     * 查询客户申请使用列表
     * 
     * @param xinhuCustappy 客户申请使用
     * @return 客户申请使用集合
     */
    public List<XinhuCustappy> selectXinhuCustappyList(XinhuCustappy xinhuCustappy);

    /**
     * 新增客户申请使用
     * 
     * @param xinhuCustappy 客户申请使用
     * @return 结果
     */
    public int insertXinhuCustappy(XinhuCustappy xinhuCustappy);

    /**
     * 修改客户申请使用
     * 
     * @param xinhuCustappy 客户申请使用
     * @return 结果
     */
    public int updateXinhuCustappy(XinhuCustappy xinhuCustappy);

    /**
     * 批量删除客户申请使用
     * 
     * @param ids 需要删除的客户申请使用主键集合
     * @return 结果
     */
    public int deleteXinhuCustappyByIds(Long[] ids);

    /**
     * 删除客户申请使用信息
     * 
     * @param id 客户申请使用主键
     * @return 结果
     */
    public int deleteXinhuCustappyById(Long id);
}
