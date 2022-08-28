package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuImGroup;
import com.vrmlstudio.hr.mapper.XinhuImGroupMapper;
import com.vrmlstudio.hr.service.IXinhuImGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * IM会话Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuImGroupServiceImpl implements IXinhuImGroupService
{
    @Autowired
    private XinhuImGroupMapper xinhuImGroupMapper;

    /**
     * 查询IM会话
     * 
     * @param id IM会话主键
     * @return IM会话
     */
    @Override
    public XinhuImGroup selectXinhuImGroupById(Long id)
    {
        return xinhuImGroupMapper.selectXinhuImGroupById(id);
    }

    /**
     * 查询IM会话列表
     * 
     * @param xinhuImGroup IM会话
     * @return IM会话
     */
    @Override
    public List<XinhuImGroup> selectXinhuImGroupList(XinhuImGroup xinhuImGroup)
    {
        return xinhuImGroupMapper.selectXinhuImGroupList(xinhuImGroup);
    }

    /**
     * 新增IM会话
     * 
     * @param xinhuImGroup IM会话
     * @return 结果
     */
    @Override
    public int insertXinhuImGroup(XinhuImGroup xinhuImGroup)
    {
        return xinhuImGroupMapper.insertXinhuImGroup(xinhuImGroup);
    }

    /**
     * 修改IM会话
     * 
     * @param xinhuImGroup IM会话
     * @return 结果
     */
    @Override
    public int updateXinhuImGroup(XinhuImGroup xinhuImGroup)
    {
        return xinhuImGroupMapper.updateXinhuImGroup(xinhuImGroup);
    }

    /**
     * 批量删除IM会话
     * 
     * @param ids 需要删除的IM会话主键
     * @return 结果
     */
    @Override
    public int deleteXinhuImGroupByIds(Long[] ids)
    {
        return xinhuImGroupMapper.deleteXinhuImGroupByIds(ids);
    }

    /**
     * 删除IM会话信息
     * 
     * @param id IM会话主键
     * @return 结果
     */
    @Override
    public int deleteXinhuImGroupById(Long id)
    {
        return xinhuImGroupMapper.deleteXinhuImGroupById(id);
    }
}
