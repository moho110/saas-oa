package com.vrmlstudio.flow.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.flow.mapper.XinhuFlowWhereMapper;
import com.vrmlstudio.flow.domain.XinhuFlowWhere;
import com.vrmlstudio.flow.service.IXinhuFlowWhereService;

/**
 * 单据条件Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuFlowWhereServiceImpl implements IXinhuFlowWhereService 
{
    @Autowired
    private XinhuFlowWhereMapper xinhuFlowWhereMapper;

    /**
     * 查询单据条件
     * 
     * @param id 单据条件主键
     * @return 单据条件
     */
    @Override
    public XinhuFlowWhere selectXinhuFlowWhereById(Integer id)
    {
        return xinhuFlowWhereMapper.selectXinhuFlowWhereById(id);
    }

    /**
     * 查询单据条件列表
     * 
     * @param xinhuFlowWhere 单据条件
     * @return 单据条件
     */
    @Override
    public List<XinhuFlowWhere> selectXinhuFlowWhereList(XinhuFlowWhere xinhuFlowWhere)
    {
        return xinhuFlowWhereMapper.selectXinhuFlowWhereList(xinhuFlowWhere);
    }

    /**
     * 新增单据条件
     * 
     * @param xinhuFlowWhere 单据条件
     * @return 结果
     */
    @Override
    public int insertXinhuFlowWhere(XinhuFlowWhere xinhuFlowWhere)
    {
        return xinhuFlowWhereMapper.insertXinhuFlowWhere(xinhuFlowWhere);
    }

    /**
     * 修改单据条件
     * 
     * @param xinhuFlowWhere 单据条件
     * @return 结果
     */
    @Override
    public int updateXinhuFlowWhere(XinhuFlowWhere xinhuFlowWhere)
    {
        return xinhuFlowWhereMapper.updateXinhuFlowWhere(xinhuFlowWhere);
    }

    /**
     * 批量删除单据条件
     * 
     * @param ids 需要删除的单据条件主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowWhereByIds(Integer[] ids)
    {
        return xinhuFlowWhereMapper.deleteXinhuFlowWhereByIds(ids);
    }

    /**
     * 删除单据条件信息
     * 
     * @param id 单据条件主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowWhereById(Integer id)
    {
        return xinhuFlowWhereMapper.deleteXinhuFlowWhereById(id);
    }
}
