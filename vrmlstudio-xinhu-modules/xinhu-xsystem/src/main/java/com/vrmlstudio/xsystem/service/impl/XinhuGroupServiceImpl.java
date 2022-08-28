package com.vrmlstudio.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.XinhuGroupMapper;
import com.vrmlstudio.xsystem.domain.XinhuGroup;
import com.vrmlstudio.xsystem.service.IXinhuGroupService;

/**
 * 系统组Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuGroupServiceImpl implements IXinhuGroupService 
{
    @Autowired
    private XinhuGroupMapper xinhuGroupMapper;

    /**
     * 查询系统组
     * 
     * @param id 系统组主键
     * @return 系统组
     */
    @Override
    public XinhuGroup selectXinhuGroupById(Long id)
    {
        return xinhuGroupMapper.selectXinhuGroupById(id);
    }

    /**
     * 查询系统组列表
     * 
     * @param xinhuGroup 系统组
     * @return 系统组
     */
    @Override
    public List<XinhuGroup> selectXinhuGroupList(XinhuGroup xinhuGroup)
    {
        return xinhuGroupMapper.selectXinhuGroupList(xinhuGroup);
    }

    /**
     * 新增系统组
     * 
     * @param xinhuGroup 系统组
     * @return 结果
     */
    @Override
    public int insertXinhuGroup(XinhuGroup xinhuGroup)
    {
        return xinhuGroupMapper.insertXinhuGroup(xinhuGroup);
    }

    /**
     * 修改系统组
     * 
     * @param xinhuGroup 系统组
     * @return 结果
     */
    @Override
    public int updateXinhuGroup(XinhuGroup xinhuGroup)
    {
        return xinhuGroupMapper.updateXinhuGroup(xinhuGroup);
    }

    /**
     * 批量删除系统组
     * 
     * @param ids 需要删除的系统组主键
     * @return 结果
     */
    @Override
    public int deleteXinhuGroupByIds(Long[] ids)
    {
        return xinhuGroupMapper.deleteXinhuGroupByIds(ids);
    }

    /**
     * 删除系统组信息
     * 
     * @param id 系统组主键
     * @return 结果
     */
    @Override
    public int deleteXinhuGroupById(Long id)
    {
        return xinhuGroupMapper.deleteXinhuGroupById(id);
    }
}
