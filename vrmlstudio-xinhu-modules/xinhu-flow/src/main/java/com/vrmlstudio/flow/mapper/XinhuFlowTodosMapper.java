package com.vrmlstudio.flow.mapper;

import java.util.List;
import com.vrmlstudio.flow.domain.XinhuFlowTodos;

/**
 * 单据通知给对应人员Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuFlowTodosMapper 
{
    /**
     * 查询单据通知给对应人员
     * 
     * @param id 单据通知给对应人员主键
     * @return 单据通知给对应人员
     */
    public XinhuFlowTodos selectXinhuFlowTodosById(Long id);

    /**
     * 查询单据通知给对应人员列表
     * 
     * @param xinhuFlowTodos 单据通知给对应人员
     * @return 单据通知给对应人员集合
     */
    public List<XinhuFlowTodos> selectXinhuFlowTodosList(XinhuFlowTodos xinhuFlowTodos);

    /**
     * 新增单据通知给对应人员
     * 
     * @param xinhuFlowTodos 单据通知给对应人员
     * @return 结果
     */
    public int insertXinhuFlowTodos(XinhuFlowTodos xinhuFlowTodos);

    /**
     * 修改单据通知给对应人员
     * 
     * @param xinhuFlowTodos 单据通知给对应人员
     * @return 结果
     */
    public int updateXinhuFlowTodos(XinhuFlowTodos xinhuFlowTodos);

    /**
     * 删除单据通知给对应人员
     * 
     * @param id 单据通知给对应人员主键
     * @return 结果
     */
    public int deleteXinhuFlowTodosById(Long id);

    /**
     * 批量删除单据通知给对应人员
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuFlowTodosByIds(Long[] ids);
}
