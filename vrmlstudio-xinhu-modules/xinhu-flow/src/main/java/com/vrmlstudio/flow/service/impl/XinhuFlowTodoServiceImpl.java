package com.vrmlstudio.flow.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.flow.mapper.XinhuFlowTodoMapper;
import com.vrmlstudio.flow.domain.XinhuFlowTodo;
import com.vrmlstudio.flow.service.IXinhuFlowTodoService;

/**
 * 单据通知设置Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuFlowTodoServiceImpl implements IXinhuFlowTodoService 
{
    @Autowired
    private XinhuFlowTodoMapper xinhuFlowTodoMapper;

    /**
     * 查询单据通知设置
     * 
     * @param id 单据通知设置主键
     * @return 单据通知设置
     */
    @Override
    public XinhuFlowTodo selectXinhuFlowTodoById(Long id)
    {
        return xinhuFlowTodoMapper.selectXinhuFlowTodoById(id);
    }

    /**
     * 查询单据通知设置列表
     * 
     * @param xinhuFlowTodo 单据通知设置
     * @return 单据通知设置
     */
    @Override
    public List<XinhuFlowTodo> selectXinhuFlowTodoList(XinhuFlowTodo xinhuFlowTodo)
    {
        return xinhuFlowTodoMapper.selectXinhuFlowTodoList(xinhuFlowTodo);
    }

    /**
     * 新增单据通知设置
     * 
     * @param xinhuFlowTodo 单据通知设置
     * @return 结果
     */
    @Override
    public int insertXinhuFlowTodo(XinhuFlowTodo xinhuFlowTodo)
    {
        return xinhuFlowTodoMapper.insertXinhuFlowTodo(xinhuFlowTodo);
    }

    /**
     * 修改单据通知设置
     * 
     * @param xinhuFlowTodo 单据通知设置
     * @return 结果
     */
    @Override
    public int updateXinhuFlowTodo(XinhuFlowTodo xinhuFlowTodo)
    {
        return xinhuFlowTodoMapper.updateXinhuFlowTodo(xinhuFlowTodo);
    }

    /**
     * 批量删除单据通知设置
     * 
     * @param ids 需要删除的单据通知设置主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowTodoByIds(Long[] ids)
    {
        return xinhuFlowTodoMapper.deleteXinhuFlowTodoByIds(ids);
    }

    /**
     * 删除单据通知设置信息
     * 
     * @param id 单据通知设置主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowTodoById(Long id)
    {
        return xinhuFlowTodoMapper.deleteXinhuFlowTodoById(id);
    }
}
