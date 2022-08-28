package com.vrmlstudio.resources.mapper;

import java.util.List;
import com.vrmlstudio.resources.domain.XinhuTask;

/**
 * 计划任务Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuTaskMapper 
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
     * 删除计划任务
     * 
     * @param id 计划任务主键
     * @return 结果
     */
    public int deleteXinhuTaskById(Integer id);

    /**
     * 批量删除计划任务
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuTaskByIds(Integer[] ids);
}
