package com.vrmlstudio.finance.service;

import java.util.List;
import com.vrmlstudio.finance.domain.XinhuCustfina;

/**
 * 客户收付款Service接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface IXinhuCustfinaService 
{
    /**
     * 查询客户收付款
     * 
     * @param id 客户收付款主键
     * @return 客户收付款
     */
    public XinhuCustfina selectXinhuCustfinaById(Long id);

    /**
     * 查询客户收付款列表
     * 
     * @param xinhuCustfina 客户收付款
     * @return 客户收付款集合
     */
    public List<XinhuCustfina> selectXinhuCustfinaList(XinhuCustfina xinhuCustfina);

    /**
     * 新增客户收付款
     * 
     * @param xinhuCustfina 客户收付款
     * @return 结果
     */
    public int insertXinhuCustfina(XinhuCustfina xinhuCustfina);

    /**
     * 修改客户收付款
     * 
     * @param xinhuCustfina 客户收付款
     * @return 结果
     */
    public int updateXinhuCustfina(XinhuCustfina xinhuCustfina);

    /**
     * 批量删除客户收付款
     * 
     * @param ids 需要删除的客户收付款主键集合
     * @return 结果
     */
    public int deleteXinhuCustfinaByIds(Long[] ids);

    /**
     * 删除客户收付款信息
     * 
     * @param id 客户收付款主键
     * @return 结果
     */
    public int deleteXinhuCustfinaById(Long id);
}
