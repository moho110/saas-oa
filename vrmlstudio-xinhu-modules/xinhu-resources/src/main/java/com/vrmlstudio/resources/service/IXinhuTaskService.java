package com.vrmlstudio.resources.service;

import java.util.List;
import com.vrmlstudio.resources.domain.XinhuTask;

/**
 * 计划任务Service接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface IXinhuTaskService 
{
    /**
     * 查询计划任务
     * 
     * @param id 计划任务主键
     * @return 计划任务
     */
    public XinhuTask selectXinhuTaskById(Integer id);

    /**
     * 查询计划任务列表
     * 
     * @param xinhuTask 计划任务
     * @return 计划任务集合
     */
    public List<XinhuTask> selectXinhuTaskList(XinhuTask xinhuTask);

    /**
     * 新增计划任务
     * 
     * @param xinhuTask 计划任务
     * @return 结果
     */
    public int insertXinhuTask(XinhuTask xinhuTask);

    /**
     * 修改计划任务
     * 
     * @param xinhuTask 计划任务
     * @return 结果
     */
    public int updateXinhuTask(XinhuTask xinhuTask);

    /**
     * 批量删除计划任务
     * 
     * @param ids 需要删除的计划任务主键集合
     * @return 结果
     */
    public int deleteXinhuTaskByIds(Integer[] ids);

    /**
     * 删除计划任务信息
     * 
     * @param id 计划任务主键
     * @return 结果
     */
    public int deleteXinhuTaskById(Integer id);
}
