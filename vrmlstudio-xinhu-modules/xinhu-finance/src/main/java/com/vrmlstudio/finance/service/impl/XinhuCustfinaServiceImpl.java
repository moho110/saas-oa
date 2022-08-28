package com.vrmlstudio.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.finance.mapper.XinhuCustfinaMapper;
import com.vrmlstudio.finance.domain.XinhuCustfina;
import com.vrmlstudio.finance.service.IXinhuCustfinaService;

/**
 * 客户收付款Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuCustfinaServiceImpl implements IXinhuCustfinaService 
{
    @Autowired
    private XinhuCustfinaMapper xinhuCustfinaMapper;

    /**
     * 查询客户收付款
     * 
     * @param id 客户收付款主键
     * @return 客户收付款
     */
    @Override
    public XinhuCustfina selectXinhuCustfinaById(Long id)
    {
        return xinhuCustfinaMapper.selectXinhuCustfinaById(id);
    }

    /**
     * 查询客户收付款列表
     * 
     * @param xinhuCustfina 客户收付款
     * @return 客户收付款
     */
    @Override
    public List<XinhuCustfina> selectXinhuCustfinaList(XinhuCustfina xinhuCustfina)
    {
        return xinhuCustfinaMapper.selectXinhuCustfinaList(xinhuCustfina);
    }

    /**
     * 新增客户收付款
     * 
     * @param xinhuCustfina 客户收付款
     * @return 结果
     */
    @Override
    public int insertXinhuCustfina(XinhuCustfina xinhuCustfina)
    {
        return xinhuCustfinaMapper.insertXinhuCustfina(xinhuCustfina);
    }

    /**
     * 修改客户收付款
     * 
     * @param xinhuCustfina 客户收付款
     * @return 结果
     */
    @Override
    public int updateXinhuCustfina(XinhuCustfina xinhuCustfina)
    {
        return xinhuCustfinaMapper.updateXinhuCustfina(xinhuCustfina);
    }

    /**
     * 批量删除客户收付款
     * 
     * @param ids 需要删除的客户收付款主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCustfinaByIds(Long[] ids)
    {
        return xinhuCustfinaMapper.deleteXinhuCustfinaByIds(ids);
    }

    /**
     * 删除客户收付款信息
     * 
     * @param id 客户收付款主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCustfinaById(Long id)
    {
        return xinhuCustfinaMapper.deleteXinhuCustfinaById(id);
    }
}
