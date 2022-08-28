package com.vrmlstudio.flow.mapper;

import java.util.List;
import com.vrmlstudio.flow.domain.XinhuFlowTodo;

/**
 * 单据通知设置Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuFlowTodoMapper 
{
    /**
     * 查询单据通知设置
     * 
     * @param id 单据通知设置主键
     * @return 单据通知设置
     */
    public XinhuFlowTodo selectXinhuFlowTodoById(Long id);

    /**
     * 查询单据通知设置列表
     * 
     * @param xinhuFlowTodo 单据通知设置
     * @return 单据通知设置集合
     */
    public List<XinhuFlowTodo> selectXinhuFlowTodoList(XinhuFlowTodo xinhuFlowTodo);

    /**
     * 新增单据通知设置
     * 
     * @param xinhuFlowTodo 单据通知设置
     * @return 结果
     */
    public int insertXinhuFlowTodo(XinhuFlowTodo xinhuFlowTodo);

    /**
     * 修改单据通知设置
     * 
     * @param xinhuFlowTodo 单据通知设置
     * @return 结果
     */
    public int updateXinhuFlowTodo(XinhuFlowTodo xinhuFlowTodo);

    /**
     * 删除单据通知设置
     * 
     * @param id 单据通知设置主键
     * @return 结果
     */
    public int deleteXinhuFlowTodoById(Long id);

    /**
     * 批量删除单据通知设置
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuFlowTodoByIds(Long[] ids);
}
