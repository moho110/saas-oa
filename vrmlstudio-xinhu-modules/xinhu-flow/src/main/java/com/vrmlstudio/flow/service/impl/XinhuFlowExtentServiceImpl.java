package com.vrmlstudio.flow.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.flow.mapper.XinhuFlowExtentMapper;
import com.vrmlstudio.flow.domain.XinhuFlowExtent;
import com.vrmlstudio.flow.service.IXinhuFlowExtentService;

/**
 * 模块权限Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuFlowExtentServiceImpl implements IXinhuFlowExtentService 
{
    @Autowired
    private XinhuFlowExtentMapper xinhuFlowExtentMapper;

    /**
     * 查询模块权限
     * 
     * @param id 模块权限主键
     * @return 模块权限
     */
    @Override
    public XinhuFlowExtent selectXinhuFlowExtentById(Long id)
    {
        return xinhuFlowExtentMapper.selectXinhuFlowExtentById(id);
    }

    /**
     * 查询模块权限列表
     * 
     * @param xinhuFlowExtent 模块权限
     * @return 模块权限
     */
    @Override
    public List<XinhuFlowExtent> selectXinhuFlowExtentList(XinhuFlowExtent xinhuFlowExtent)
    {
        return xinhuFlowExtentMapper.selectXinhuFlowExtentList(xinhuFlowExtent);
    }

    /**
     * 新增模块权限
     * 
     * @param xinhuFlowExtent 模块权限
     * @return 结果
     */
    @Override
    public int insertXinhuFlowExtent(XinhuFlowExtent xinhuFlowExtent)
    {
        return xinhuFlowExtentMapper.insertXinhuFlowExtent(xinhuFlowExtent);
    }

    /**
     * 修改模块权限
     * 
     * @param xinhuFlowExtent 模块权限
     * @return 结果
     */
    @Override
    public int updateXinhuFlowExtent(XinhuFlowExtent xinhuFlowExtent)
    {
        return xinhuFlowExtentMapper.updateXinhuFlowExtent(xinhuFlowExtent);
    }

    /**
     * 批量删除模块权限
     * 
     * @param ids 需要删除的模块权限主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowExtentByIds(Long[] ids)
    {
        return xinhuFlowExtentMapper.deleteXinhuFlowExtentByIds(ids);
    }

    /**
     * 删除模块权限信息
     * 
     * @param id 模块权限主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowExtentById(Long id)
    {
        return xinhuFlowExtentMapper.deleteXinhuFlowExtentById(id);
    }
}
