package com.vrmlstudio.resources.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.resources.mapper.XinhuScheduleMapper;
import com.vrmlstudio.resources.domain.XinhuSchedule;
import com.vrmlstudio.resources.service.IXinhuScheduleService;

/**
 * 日程Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuScheduleServiceImpl implements IXinhuScheduleService 
{
    @Autowired
    private XinhuScheduleMapper xinhuScheduleMapper;

    /**
     * 查询日程
     * 
     * @param id 日程主键
     * @return 日程
     */
    @Override
    public XinhuSchedule selectXinhuScheduleById(Long id)
    {
        return xinhuScheduleMapper.selectXinhuScheduleById(id);
    }

    /**
     * 查询日程列表
     * 
     * @param xinhuSchedule 日程
     * @return 日程
     */
    @Override
    public List<XinhuSchedule> selectXinhuScheduleList(XinhuSchedule xinhuSchedule)
    {
        return xinhuScheduleMapper.selectXinhuScheduleList(xinhuSchedule);
    }

    /**
     * 新增日程
     * 
     * @param xinhuSchedule 日程
     * @return 结果
     */
    @Override
    public int insertXinhuSchedule(XinhuSchedule xinhuSchedule)
    {
        return xinhuScheduleMapper.insertXinhuSchedule(xinhuSchedule);
    }

    /**
     * 修改日程
     * 
     * @param xinhuSchedule 日程
     * @return 结果
     */
    @Override
    public int updateXinhuSchedule(XinhuSchedule xinhuSchedule)
    {
        return xinhuScheduleMapper.updateXinhuSchedule(xinhuSchedule);
    }

    /**
     * 批量删除日程
     * 
     * @param ids 需要删除的日程主键
     * @return 结果
     */
    @Override
    public int deleteXinhuScheduleByIds(Long[] ids)
    {
        return xinhuScheduleMapper.deleteXinhuScheduleByIds(ids);
    }

    /**
     * 删除日程信息
     * 
     * @param id 日程主键
     * @return 结果
     */
    @Override
    public int deleteXinhuScheduleById(Long id)
    {
        return xinhuScheduleMapper.deleteXinhuScheduleById(id);
    }
}
