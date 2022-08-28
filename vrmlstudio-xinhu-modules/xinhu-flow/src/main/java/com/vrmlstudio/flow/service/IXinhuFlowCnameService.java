package com.vrmlstudio.flow.service;

import java.util.List;
import com.vrmlstudio.flow.domain.XinhuFlowCname;

/**
 * 自定义审核人组Service接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface IXinhuFlowCnameService 
{
    /**
     * 查询自定义审核人组
     * 
     * @param id 自定义审核人组主键
     * @return 自定义审核人组
     */
    public XinhuFlowCname selectXinhuFlowCnameById(Long id);

    /**
     * 查询自定义审核人组列表
     * 
     * @param xinhuFlowCname 自定义审核人组
     * @return 自定义审核人组集合
     */
    public List<XinhuFlowCname> selectXinhuFlowCnameList(XinhuFlowCname xinhuFlowCname);

    /**
     * 新增自定义审核人组
     * 
     * @param xinhuFlowCname 自定义审核人组
     * @return 结果
     */
    public int insertXinhuFlowCname(XinhuFlowCname xinhuFlowCname);

    /**
     * 修改自定义审核人组
     * 
     * @param xinhuFlowCname 自定义审核人组
     * @return 结果
     */
    public int updateXinhuFlowCname(XinhuFlowCname xinhuFlowCname);

    /**
     * 批量删除自定义审核人组
     * 
     * @param ids 需要删除的自定义审核人组主键集合
     * @return 结果
     */
    public int deleteXinhuFlowCnameByIds(Long[] ids);

    /**
     * 删除自定义审核人组信息
     * 
     * @param id 自定义审核人组主键
     * @return 结果
     */
    public int deleteXinhuFlowCnameById(Long id);
}
