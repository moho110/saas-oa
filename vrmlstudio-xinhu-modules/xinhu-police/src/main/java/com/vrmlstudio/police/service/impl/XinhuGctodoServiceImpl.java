package com.vrmlstudio.police.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.police.mapper.XinhuGctodoMapper;
import com.vrmlstudio.police.domain.XinhuGctodo;
import com.vrmlstudio.police.service.IXinhuGctodoService;

/**
 * 工程通知Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuGctodoServiceImpl implements IXinhuGctodoService 
{
    @Autowired
    private XinhuGctodoMapper xinhuGctodoMapper;

    /**
     * 查询工程通知
     * 
     * @param id 工程通知主键
     * @return 工程通知
     */
    @Override
    public XinhuGctodo selectXinhuGctodoById(Long id)
    {
        return xinhuGctodoMapper.selectXinhuGctodoById(id);
    }

    /**
     * 查询工程通知列表
     * 
     * @param xinhuGctodo 工程通知
     * @return 工程通知
     */
    @Override
    public List<XinhuGctodo> selectXinhuGctodoList(XinhuGctodo xinhuGctodo)
    {
        return xinhuGctodoMapper.selectXinhuGctodoList(xinhuGctodo);
    }

    /**
     * 新增工程通知
     * 
     * @param xinhuGctodo 工程通知
     * @return 结果
     */
    @Override
    public int insertXinhuGctodo(XinhuGctodo xinhuGctodo)
    {
        return xinhuGctodoMapper.insertXinhuGctodo(xinhuGctodo);
    }

    /**
     * 修改工程通知
     * 
     * @param xinhuGctodo 工程通知
     * @return 结果
     */
    @Override
    public int updateXinhuGctodo(XinhuGctodo xinhuGctodo)
    {
        return xinhuGctodoMapper.updateXinhuGctodo(xinhuGctodo);
    }

    /**
     * 批量删除工程通知
     * 
     * @param ids 需要删除的工程通知主键
     * @return 结果
     */
    @Override
    public int deleteXinhuGctodoByIds(Long[] ids)
    {
        return xinhuGctodoMapper.deleteXinhuGctodoByIds(ids);
    }

    /**
     * 删除工程通知信息
     * 
     * @param id 工程通知主键
     * @return 结果
     */
    @Override
    public int deleteXinhuGctodoById(Long id)
    {
        return xinhuGctodoMapper.deleteXinhuGctodoById(id);
    }
}
