package com.vrmlstudio.resources.mapper;

import java.util.List;
import com.vrmlstudio.resources.domain.XinhuTodo;

/**
 * 提醒消息Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuTodoMapper 
{
    /**
     * 查询提醒消息
     * 
     * @param id 提醒消息主键
     * @return 提醒消息
     */
    public XinhuTodo selectXinhuTodoById(Long id);

    /**
     * 查询提醒消息列表
     * 
     * @param xinhuTodo 提醒消息
     * @return 提醒消息集合
     */
    public List<XinhuTodo> selectXinhuTodoList(XinhuTodo xinhuTodo);

    /**
     * 新增提醒消息
     * 
     * @param xinhuTodo 提醒消息
     * @return 结果
     */
    public int insertXinhuTodo(XinhuTodo xinhuTodo);

    /**
     * 修改提醒消息
     * 
     * @param xinhuTodo 提醒消息
     * @return 结果
     */
    public int updateXinhuTodo(XinhuTodo xinhuTodo);

    /**
     * 删除提醒消息
     * 
     * @param id 提醒消息主键
     * @return 结果
     */
    public int deleteXinhuTodoById(Long id);

    /**
     * 批量删除提醒消息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuTodoByIds(Long[] ids);
}
