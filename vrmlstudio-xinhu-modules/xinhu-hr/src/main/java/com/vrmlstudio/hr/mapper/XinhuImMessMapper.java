package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuImMess;

/**
 * IM聊天记录Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuImMessMapper 
{
    /**
     * 查询IM聊天记录
     * 
     * @param id IM聊天记录主键
     * @return IM聊天记录
     */
    public XinhuImMess selectXinhuImMessById(Long id);

    /**
     * 查询IM聊天记录列表
     * 
     * @param xinhuImMess IM聊天记录
     * @return IM聊天记录集合
     */
    public List<XinhuImMess> selectXinhuImMessList(XinhuImMess xinhuImMess);

    /**
     * 新增IM聊天记录
     * 
     * @param xinhuImMess IM聊天记录
     * @return 结果
     */
    public int insertXinhuImMess(XinhuImMess xinhuImMess);

    /**
     * 修改IM聊天记录
     * 
     * @param xinhuImMess IM聊天记录
     * @return 结果
     */
    public int updateXinhuImMess(XinhuImMess xinhuImMess);

    /**
     * 删除IM聊天记录
     * 
     * @param id IM聊天记录主键
     * @return 结果
     */
    public int deleteXinhuImMessById(Long id);

    /**
     * 批量删除IM聊天记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuImMessByIds(Long[] ids);
}
