package com.vrmlstudio.flow.mapper;

import java.util.List;
import com.vrmlstudio.flow.domain.XinhuFlowWhere;

/**
 * 单据条件Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuFlowWhereMapper 
{
    /**
     * 查询单据条件
     * 
     * @param id 单据条件主键
     * @return 单据条件
     */
    public XinhuFlowWhere selectXinhuFlowWhereById(Integer id);

    /**
     * 查询单据条件列表
     * 
     * @param xinhuFlowWhere 单据条件
     * @return 单据条件集合
     */
    public List<XinhuFlowWhere> selectXinhuFlowWhereList(XinhuFlowWhere xinhuFlowWhere);

    /**
     * 新增单据条件
     * 
     * @param xinhuFlowWhere 单据条件
     * @return 结果
     */
    public int insertXinhuFlowWhere(XinhuFlowWhere xinhuFlowWhere);

    /**
     * 修改单据条件
     * 
     * @param xinhuFlowWhere 单据条件
     * @return 结果
     */
    public int updateXinhuFlowWhere(XinhuFlowWhere xinhuFlowWhere);

    /**
     * 删除单据条件
     * 
     * @param id 单据条件主键
     * @return 结果
     */
    public int deleteXinhuFlowWhereById(Integer id);

    /**
     * 批量删除单据条件
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuFlowWhereByIds(Integer[] ids);
}
