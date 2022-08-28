package com.vrmlstudio.person.service;

import java.util.List;
import com.vrmlstudio.person.domain.XinhuMeet;

/**
 * 会议Service接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface IXinhuMeetService 
{
    /**
     * 查询会议
     * 
     * @param id 会议主键
     * @return 会议
     */
    public XinhuMeet selectXinhuMeetById(Long id);

    /**
     * 查询会议列表
     * 
     * @param xinhuMeet 会议
     * @return 会议集合
     */
    public List<XinhuMeet> selectXinhuMeetList(XinhuMeet xinhuMeet);

    /**
     * 新增会议
     * 
     * @param xinhuMeet 会议
     * @return 结果
     */
    public int insertXinhuMeet(XinhuMeet xinhuMeet);

    /**
     * 修改会议
     * 
     * @param xinhuMeet 会议
     * @return 结果
     */
    public int updateXinhuMeet(XinhuMeet xinhuMeet);

    /**
     * 批量删除会议
     * 
     * @param ids 需要删除的会议主键集合
     * @return 结果
     */
    public int deleteXinhuMeetByIds(Long[] ids);

    /**
     * 删除会议信息
     * 
     * @param id 会议主键
     * @return 结果
     */
    public int deleteXinhuMeetById(Long id);
}
