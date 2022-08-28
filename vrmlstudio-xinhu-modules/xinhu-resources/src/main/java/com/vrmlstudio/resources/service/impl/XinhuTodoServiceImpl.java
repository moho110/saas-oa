package com.vrmlstudio.resources.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.resources.mapper.XinhuTodoMapper;
import com.vrmlstudio.resources.domain.XinhuTodo;
import com.vrmlstudio.resources.service.IXinhuTodoService;

/**
 * 提醒消息Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuTodoServiceImpl implements IXinhuTodoService 
{
    @Autowired
    private XinhuTodoMapper xinhuTodoMapper;

    /**
     * 查询提醒消息
     * 
     * @param id 提醒消息主键
     * @return 提醒消息
     */
    @Override
    public XinhuTodo selectXinhuTodoById(Long id)
    {
        return xinhuTodoMapper.selectXinhuTodoById(id);
    }

    /**
     * 查询提醒消息列表
     * 
     * @param xinhuTodo 提醒消息
     * @return 提醒消息
     */
    @Override
    public List<XinhuTodo> selectXinhuTodoList(XinhuTodo xinhuTodo)
    {
        return xinhuTodoMapper.selectXinhuTodoList(xinhuTodo);
    }

    /**
     * 新增提醒消息
     * 
     * @param xinhuTodo 提醒消息
     * @return 结果
     */
    @Override
    public int insertXinhuTodo(XinhuTodo xinhuTodo)
    {
        return xinhuTodoMapper.insertXinhuTodo(xinhuTodo);
    }

    /**
     * 修改提醒消息
     * 
     * @param xinhuTodo 提醒消息
     * @return 结果
     */
    @Override
    public int updateXinhuTodo(XinhuTodo xinhuTodo)
    {
        return xinhuTodoMapper.updateXinhuTodo(xinhuTodo);
    }

    /**
     * 批量删除提醒消息
     * 
     * @param ids 需要删除的提醒消息主键
     * @return 结果
     */
    @Override
    public int deleteXinhuTodoByIds(Long[] ids)
    {
        return xinhuTodoMapper.deleteXinhuTodoByIds(ids);
    }

    /**
     * 删除提醒消息信息
     * 
     * @param id 提醒消息主键
     * @return 结果
     */
    @Override
    public int deleteXinhuTodoById(Long id)
    {
        return xinhuTodoMapper.deleteXinhuTodoById(id);
    }
}
