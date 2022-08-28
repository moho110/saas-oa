package com.vrmlstudio.person.service;

import java.util.List;
import com.vrmlstudio.person.domain.XinhuUserract;

/**
 * 用户合同Service接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface IXinhuUserractService 
{
    /**
     * 查询用户合同
     * 
     * @param id 用户合同主键
     * @return 用户合同
     */
    public XinhuUserract selectXinhuUserractById(Long id);

    /**
     * 查询用户合同列表
     * 
     * @param xinhuUserract 用户合同
     * @return 用户合同集合
     */
    public List<XinhuUserract> selectXinhuUserractList(XinhuUserract xinhuUserract);

    /**
     * 新增用户合同
     * 
     * @param xinhuUserract 用户合同
     * @return 结果
     */
    public int insertXinhuUserract(XinhuUserract xinhuUserract);

    /**
     * 修改用户合同
     * 
     * @param xinhuUserract 用户合同
     * @return 结果
     */
    public int updateXinhuUserract(XinhuUserract xinhuUserract);

    /**
     * 批量删除用户合同
     * 
     * @param ids 需要删除的用户合同主键集合
     * @return 结果
     */
    public int deleteXinhuUserractByIds(Long[] ids);

    /**
     * 删除用户合同信息
     * 
     * @param id 用户合同主键
     * @return 结果
     */
    public int deleteXinhuUserractById(Long id);
}
