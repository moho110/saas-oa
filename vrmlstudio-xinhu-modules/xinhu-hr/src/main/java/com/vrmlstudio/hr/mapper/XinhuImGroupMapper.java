package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuImGroup;

/**
 * IM会话Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuImGroupMapper 
{
    /**
     * 查询IM会话
     * 
     * @param id IM会话主键
     * @return IM会话
     */
    public XinhuImGroup selectXinhuImGroupById(Long id);

    /**
     * 查询IM会话列表
     * 
     * @param xinhuImGroup IM会话
     * @return IM会话集合
     */
    public List<XinhuImGroup> selectXinhuImGroupList(XinhuImGroup xinhuImGroup);

    /**
     * 新增IM会话
     * 
     * @param xinhuImGroup IM会话
     * @return 结果
     */
    public int insertXinhuImGroup(XinhuImGroup xinhuImGroup);

    /**
     * 修改IM会话
     * 
     * @param xinhuImGroup IM会话
     * @return 结果
     */
    public int updateXinhuImGroup(XinhuImGroup xinhuImGroup);

    /**
     * 删除IM会话
     * 
     * @param id IM会话主键
     * @return 结果
     */
    public int deleteXinhuImGroupById(Long id);

    /**
     * 批量删除IM会话
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuImGroupByIds(Long[] ids);
}
