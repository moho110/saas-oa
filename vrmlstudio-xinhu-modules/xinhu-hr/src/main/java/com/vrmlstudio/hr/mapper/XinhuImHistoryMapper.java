package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuImHistory;

/**
 * IM会话记录历史Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuImHistoryMapper 
{
    /**
     * 查询IM会话记录历史
     * 
     * @param id IM会话记录历史主键
     * @return IM会话记录历史
     */
    public XinhuImHistory selectXinhuImHistoryById(Long id);

    /**
     * 查询IM会话记录历史列表
     * 
     * @param xinhuImHistory IM会话记录历史
     * @return IM会话记录历史集合
     */
    public List<XinhuImHistory> selectXinhuImHistoryList(XinhuImHistory xinhuImHistory);

    /**
     * 新增IM会话记录历史
     * 
     * @param xinhuImHistory IM会话记录历史
     * @return 结果
     */
    public int insertXinhuImHistory(XinhuImHistory xinhuImHistory);

    /**
     * 修改IM会话记录历史
     * 
     * @param xinhuImHistory IM会话记录历史
     * @return 结果
     */
    public int updateXinhuImHistory(XinhuImHistory xinhuImHistory);

    /**
     * 删除IM会话记录历史
     * 
     * @param id IM会话记录历史主键
     * @return 结果
     */
    public int deleteXinhuImHistoryById(Long id);

    /**
     * 批量删除IM会话记录历史
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuImHistoryByIds(Long[] ids);
}
