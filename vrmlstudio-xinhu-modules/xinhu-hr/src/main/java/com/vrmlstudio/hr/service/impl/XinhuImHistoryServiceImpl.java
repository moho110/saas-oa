package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuImHistory;
import com.vrmlstudio.hr.mapper.XinhuImHistoryMapper;
import com.vrmlstudio.hr.service.IXinhuImHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * IM会话记录历史Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuImHistoryServiceImpl implements IXinhuImHistoryService
{
    @Autowired
    private XinhuImHistoryMapper xinhuImHistoryMapper;

    /**
     * 查询IM会话记录历史
     * 
     * @param id IM会话记录历史主键
     * @return IM会话记录历史
     */
    @Override
    public XinhuImHistory selectXinhuImHistoryById(Long id)
    {
        return xinhuImHistoryMapper.selectXinhuImHistoryById(id);
    }

    /**
     * 查询IM会话记录历史列表
     * 
     * @param xinhuImHistory IM会话记录历史
     * @return IM会话记录历史
     */
    @Override
    public List<XinhuImHistory> selectXinhuImHistoryList(XinhuImHistory xinhuImHistory)
    {
        return xinhuImHistoryMapper.selectXinhuImHistoryList(xinhuImHistory);
    }

    /**
     * 新增IM会话记录历史
     * 
     * @param xinhuImHistory IM会话记录历史
     * @return 结果
     */
    @Override
    public int insertXinhuImHistory(XinhuImHistory xinhuImHistory)
    {
        return xinhuImHistoryMapper.insertXinhuImHistory(xinhuImHistory);
    }

    /**
     * 修改IM会话记录历史
     * 
     * @param xinhuImHistory IM会话记录历史
     * @return 结果
     */
    @Override
    public int updateXinhuImHistory(XinhuImHistory xinhuImHistory)
    {
        return xinhuImHistoryMapper.updateXinhuImHistory(xinhuImHistory);
    }

    /**
     * 批量删除IM会话记录历史
     * 
     * @param ids 需要删除的IM会话记录历史主键
     * @return 结果
     */
    @Override
    public int deleteXinhuImHistoryByIds(Long[] ids)
    {
        return xinhuImHistoryMapper.deleteXinhuImHistoryByIds(ids);
    }

    /**
     * 删除IM会话记录历史信息
     * 
     * @param id IM会话记录历史主键
     * @return 结果
     */
    @Override
    public int deleteXinhuImHistoryById(Long id)
    {
        return xinhuImHistoryMapper.deleteXinhuImHistoryById(id);
    }
}
