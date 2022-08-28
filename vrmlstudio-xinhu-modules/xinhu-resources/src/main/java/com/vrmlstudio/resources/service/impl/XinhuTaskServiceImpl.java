package com.vrmlstudio.resources.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.resources.mapper.XinhuTaskMapper;
import com.vrmlstudio.resources.domain.XinhuTask;
import com.vrmlstudio.resources.service.IXinhuTaskService;

/**
 * 计划任务Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuTaskServiceImpl implements IXinhuTaskService 
{
    @Autowired
    private XinhuTaskMapper xinhuTaskMapper;

    /**
     * 查询计划任务
     * 
     * @param id 计划任务主键
     * @return 计划任务
     */
    @Override
    public XinhuTask selectXinhuTaskById(Integer id)
    {
        return xinhuTaskMapper.selectXinhuTaskById(id);
    }

    /**
     * 查询计划任务列表
     * 
     * @param xinhuTask 计划任务
     * @return 计划任务
     */
    @Override
    public List<XinhuTask> selectXinhuTaskList(XinhuTask xinhuTask)
    {
        return xinhuTaskMapper.selectXinhuTaskList(xinhuTask);
    }

    /**
     * 新增计划任务
     * 
     * @param xinhuTask 计划任务
     * @return 结果
     */
    @Override
    public int insertXinhuTask(XinhuTask xinhuTask)
    {
        return xinhuTaskMapper.insertXinhuTask(xinhuTask);
    }

    /**
     * 修改计划任务
     * 
     * @param xinhuTask 计划任务
     * @return 结果
     */
    @Override
    public int updateXinhuTask(XinhuTask xinhuTask)
    {
        return xinhuTaskMapper.updateXinhuTask(xinhuTask);
    }

    /**
     * 批量删除计划任务
     * 
     * @param ids 需要删除的计划任务主键
     * @return 结果
     */
    @Override
    public int deleteXinhuTaskByIds(Integer[] ids)
    {
        return xinhuTaskMapper.deleteXinhuTaskByIds(ids);
    }

    /**
     * 删除计划任务信息
     * 
     * @param id 计划任务主键
     * @return 结果
     */
    @Override
    public int deleteXinhuTaskById(Integer id)
    {
        return xinhuTaskMapper.deleteXinhuTaskById(id);
    }
}
