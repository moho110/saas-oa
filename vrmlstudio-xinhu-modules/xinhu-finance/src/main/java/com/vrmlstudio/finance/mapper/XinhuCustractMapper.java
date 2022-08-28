package com.vrmlstudio.finance.mapper;

import java.util.List;
import com.vrmlstudio.finance.domain.XinhuCustract;

/**
 * 客户合同Mapper接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface XinhuCustractMapper 
{
    /**
     * 查询客户合同
     * 
     * @param id 客户合同主键
     * @return 客户合同
     */
    public XinhuCustract selectXinhuCustractById(Long id);

    /**
     * 查询客户合同列表
     * 
     * @param xinhuCustract 客户合同
     * @return 客户合同集合
     */
    public List<XinhuCustract> selectXinhuCustractList(XinhuCustract xinhuCustract);

    /**
     * 新增客户合同
     * 
     * @param xinhuCustract 客户合同
     * @return 结果
     */
    public int insertXinhuCustract(XinhuCustract xinhuCustract);

    /**
     * 修改客户合同
     * 
     * @param xinhuCustract 客户合同
     * @return 结果
     */
    public int updateXinhuCustract(XinhuCustract xinhuCustract);

    /**
     * 删除客户合同
     * 
     * @param id 客户合同主键
     * @return 结果
     */
    public int deleteXinhuCustractById(Long id);

    /**
     * 批量删除客户合同
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuCustractByIds(Long[] ids);
}
