package com.vrmlstudio.finance.mapper;

import java.util.List;
import com.vrmlstudio.finance.domain.XinhuCustplan;

/**
 * 跟进计划Mapper接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface XinhuCustplanMapper 
{
    /**
     * 查询跟进计划
     * 
     * @param id 跟进计划主键
     * @return 跟进计划
     */
    public XinhuCustplan selectXinhuCustplanById(Long id);

    /**
     * 查询跟进计划列表
     * 
     * @param xinhuCustplan 跟进计划
     * @return 跟进计划集合
     */
    public List<XinhuCustplan> selectXinhuCustplanList(XinhuCustplan xinhuCustplan);

    /**
     * 新增跟进计划
     * 
     * @param xinhuCustplan 跟进计划
     * @return 结果
     */
    public int insertXinhuCustplan(XinhuCustplan xinhuCustplan);

    /**
     * 修改跟进计划
     * 
     * @param xinhuCustplan 跟进计划
     * @return 结果
     */
    public int updateXinhuCustplan(XinhuCustplan xinhuCustplan);

    /**
     * 删除跟进计划
     * 
     * @param id 跟进计划主键
     * @return 结果
     */
    public int deleteXinhuCustplanById(Long id);

    /**
     * 批量删除跟进计划
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuCustplanByIds(Long[] ids);
}
