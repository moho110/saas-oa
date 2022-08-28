package com.vrmlstudio.flow.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.flow.mapper.XinhuFlowTodosMapper;
import com.vrmlstudio.flow.domain.XinhuFlowTodos;
import com.vrmlstudio.flow.service.IXinhuFlowTodosService;

/**
 * 单据通知给对应人员Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuFlowTodosServiceImpl implements IXinhuFlowTodosService 
{
    @Autowired
    private XinhuFlowTodosMapper xinhuFlowTodosMapper;

    /**
     * 查询单据通知给对应人员
     * 
     * @param id 单据通知给对应人员主键
     * @return 单据通知给对应人员
     */
    @Override
    public XinhuFlowTodos selectXinhuFlowTodosById(Long id)
    {
        return xinhuFlowTodosMapper.selectXinhuFlowTodosById(id);
    }

    /**
     * 查询单据通知给对应人员列表
     * 
     * @param xinhuFlowTodos 单据通知给对应人员
     * @return 单据通知给对应人员
     */
    @Override
    public List<XinhuFlowTodos> selectXinhuFlowTodosList(XinhuFlowTodos xinhuFlowTodos)
    {
        return xinhuFlowTodosMapper.selectXinhuFlowTodosList(xinhuFlowTodos);
    }

    /**
     * 新增单据通知给对应人员
     * 
     * @param xinhuFlowTodos 单据通知给对应人员
     * @return 结果
     */
    @Override
    public int insertXinhuFlowTodos(XinhuFlowTodos xinhuFlowTodos)
    {
        return xinhuFlowTodosMapper.insertXinhuFlowTodos(xinhuFlowTodos);
    }

    /**
     * 修改单据通知给对应人员
     * 
     * @param xinhuFlowTodos 单据通知给对应人员
     * @return 结果
     */
    @Override
    public int updateXinhuFlowTodos(XinhuFlowTodos xinhuFlowTodos)
    {
        return xinhuFlowTodosMapper.updateXinhuFlowTodos(xinhuFlowTodos);
    }

    /**
     * 批量删除单据通知给对应人员
     * 
     * @param ids 需要删除的单据通知给对应人员主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowTodosByIds(Long[] ids)
    {
        return xinhuFlowTodosMapper.deleteXinhuFlowTodosByIds(ids);
    }

    /**
     * 删除单据通知给对应人员信息
     * 
     * @param id 单据通知给对应人员主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowTodosById(Long id)
    {
        return xinhuFlowTodosMapper.deleteXinhuFlowTodosById(id);
    }
}
