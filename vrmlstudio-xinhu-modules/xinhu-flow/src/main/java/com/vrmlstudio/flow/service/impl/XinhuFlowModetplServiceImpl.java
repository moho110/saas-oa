package com.vrmlstudio.flow.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.flow.mapper.XinhuFlowModetplMapper;
import com.vrmlstudio.flow.domain.XinhuFlowModetpl;
import com.vrmlstudio.flow.service.IXinhuFlowModetplService;

/**
 * 模块多模版设置Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuFlowModetplServiceImpl implements IXinhuFlowModetplService 
{
    @Autowired
    private XinhuFlowModetplMapper xinhuFlowModetplMapper;

    /**
     * 查询模块多模版设置
     * 
     * @param id 模块多模版设置主键
     * @return 模块多模版设置
     */
    @Override
    public XinhuFlowModetpl selectXinhuFlowModetplById(Long id)
    {
        return xinhuFlowModetplMapper.selectXinhuFlowModetplById(id);
    }

    /**
     * 查询模块多模版设置列表
     * 
     * @param xinhuFlowModetpl 模块多模版设置
     * @return 模块多模版设置
     */
    @Override
    public List<XinhuFlowModetpl> selectXinhuFlowModetplList(XinhuFlowModetpl xinhuFlowModetpl)
    {
        return xinhuFlowModetplMapper.selectXinhuFlowModetplList(xinhuFlowModetpl);
    }

    /**
     * 新增模块多模版设置
     * 
     * @param xinhuFlowModetpl 模块多模版设置
     * @return 结果
     */
    @Override
    public int insertXinhuFlowModetpl(XinhuFlowModetpl xinhuFlowModetpl)
    {
        return xinhuFlowModetplMapper.insertXinhuFlowModetpl(xinhuFlowModetpl);
    }

    /**
     * 修改模块多模版设置
     * 
     * @param xinhuFlowModetpl 模块多模版设置
     * @return 结果
     */
    @Override
    public int updateXinhuFlowModetpl(XinhuFlowModetpl xinhuFlowModetpl)
    {
        return xinhuFlowModetplMapper.updateXinhuFlowModetpl(xinhuFlowModetpl);
    }

    /**
     * 批量删除模块多模版设置
     * 
     * @param ids 需要删除的模块多模版设置主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowModetplByIds(Long[] ids)
    {
        return xinhuFlowModetplMapper.deleteXinhuFlowModetplByIds(ids);
    }

    /**
     * 删除模块多模版设置信息
     * 
     * @param id 模块多模版设置主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowModetplById(Long id)
    {
        return xinhuFlowModetplMapper.deleteXinhuFlowModetplById(id);
    }
}
