package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuImMesszt;

/**
 * IM聊天消息状态Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuImMessztMapper 
{
    /**
     * 查询IM聊天消息状态
     * 
     * @param id IM聊天消息状态主键
     * @return IM聊天消息状态
     */
    public XinhuImMesszt selectXinhuImMessztById(Long id);

    /**
     * 查询IM聊天消息状态列表
     * 
     * @param xinhuImMesszt IM聊天消息状态
     * @return IM聊天消息状态集合
     */
    public List<XinhuImMesszt> selectXinhuImMessztList(XinhuImMesszt xinhuImMesszt);

    /**
     * 新增IM聊天消息状态
     * 
     * @param xinhuImMesszt IM聊天消息状态
     * @return 结果
     */
    public int insertXinhuImMesszt(XinhuImMesszt xinhuImMesszt);

    /**
     * 修改IM聊天消息状态
     * 
     * @param xinhuImMesszt IM聊天消息状态
     * @return 结果
     */
    public int updateXinhuImMesszt(XinhuImMesszt xinhuImMesszt);

    /**
     * 删除IM聊天消息状态
     * 
     * @param id IM聊天消息状态主键
     * @return 结果
     */
    public int deleteXinhuImMessztById(Long id);

    /**
     * 批量删除IM聊天消息状态
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuImMessztByIds(Long[] ids);
}
