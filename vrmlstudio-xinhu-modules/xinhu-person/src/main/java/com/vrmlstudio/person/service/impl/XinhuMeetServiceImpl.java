package com.vrmlstudio.person.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.person.mapper.XinhuMeetMapper;
import com.vrmlstudio.person.domain.XinhuMeet;
import com.vrmlstudio.person.service.IXinhuMeetService;

/**
 * 会议Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuMeetServiceImpl implements IXinhuMeetService 
{
    @Autowired(required = false)
    private XinhuMeetMapper xinhuMeetMapper;

    /**
     * 查询会议
     * 
     * @param id 会议主键
     * @return 会议
     */
    @Override
    public XinhuMeet selectXinhuMeetById(Long id)
    {
        return xinhuMeetMapper.selectXinhuMeetById(id);
    }

    /**
     * 查询会议列表
     * 
     * @param xinhuMeet 会议
     * @return 会议
     */
    @Override
    public List<XinhuMeet> selectXinhuMeetList(XinhuMeet xinhuMeet)
    {
        return xinhuMeetMapper.selectXinhuMeetList(xinhuMeet);
    }

    /**
     * 新增会议
     * 
     * @param xinhuMeet 会议
     * @return 结果
     */
    @Override
    public int insertXinhuMeet(XinhuMeet xinhuMeet)
    {
        return xinhuMeetMapper.insertXinhuMeet(xinhuMeet);
    }

    /**
     * 修改会议
     * 
     * @param xinhuMeet 会议
     * @return 结果
     */
    @Override
    public int updateXinhuMeet(XinhuMeet xinhuMeet)
    {
        return xinhuMeetMapper.updateXinhuMeet(xinhuMeet);
    }

    /**
     * 批量删除会议
     * 
     * @param ids 需要删除的会议主键
     * @return 结果
     */
    @Override
    public int deleteXinhuMeetByIds(Long[] ids)
    {
        return xinhuMeetMapper.deleteXinhuMeetByIds(ids);
    }

    /**
     * 删除会议信息
     * 
     * @param id 会议主键
     * @return 结果
     */
    @Override
    public int deleteXinhuMeetById(Long id)
    {
        return xinhuMeetMapper.deleteXinhuMeetById(id);
    }
}
