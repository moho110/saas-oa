package com.vrmlstudio.finance.mapper;

import java.util.List;
import com.vrmlstudio.finance.domain.XinhuCustappy;

/**
 * 客户申请使用Mapper接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface XinhuCustappyMapper 
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
     * 删除客户申请使用
     * 
     * @param id 客户申请使用主键
     * @return 结果
     */
    public int deleteXinhuCustappyById(Long id);

    /**
     * 批量删除客户申请使用
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuCustappyByIds(Long[] ids);
}
