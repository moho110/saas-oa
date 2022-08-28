package com.vrmlstudio.resources.service;

import java.util.List;
import com.vrmlstudio.resources.domain.XinhuSchedule;

/**
 * 日程Service接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface IXinhuScheduleService 
{
    /**
     * 查询日程
     * 
     * @param id 日程主键
     * @return 日程
     */
    public XinhuSchedule selectXinhuScheduleById(Long id);

    /**
     * 查询日程列表
     * 
     * @param xinhuSchedule 日程
     * @return 日程集合
     */
    public List<XinhuSchedule> selectXinhuScheduleList(XinhuSchedule xinhuSchedule);

    /**
     * 新增日程
     * 
     * @param xinhuSchedule 日程
     * @return 结果
     */
    public int insertXinhuSchedule(XinhuSchedule xinhuSchedule);

    /**
     * 修改日程
     * 
     * @param xinhuSchedule 日程
     * @return 结果
     */
    public int updateXinhuSchedule(XinhuSchedule xinhuSchedule);

    /**
     * 批量删除日程
     * 
     * @param ids 需要删除的日程主键集合
     * @return 结果
     */
    public int deleteXinhuScheduleByIds(Long[] ids);

    /**
     * 删除日程信息
     * 
     * @param id 日程主键
     * @return 结果
     */
    public int deleteXinhuScheduleById(Long id);
}
