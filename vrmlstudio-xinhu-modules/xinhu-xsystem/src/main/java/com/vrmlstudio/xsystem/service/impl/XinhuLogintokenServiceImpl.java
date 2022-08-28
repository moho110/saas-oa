package com.vrmlstudio.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.XinhuLogintokenMapper;
import com.vrmlstudio.xsystem.domain.XinhuLogintoken;
import com.vrmlstudio.xsystem.service.IXinhuLogintokenService;

/**
 * 系统登录tokenService业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuLogintokenServiceImpl implements IXinhuLogintokenService 
{
    @Autowired
    private XinhuLogintokenMapper xinhuLogintokenMapper;

    /**
     * 查询系统登录token
     * 
     * @param id 系统登录token主键
     * @return 系统登录token
     */
    @Override
    public XinhuLogintoken selectXinhuLogintokenById(Long id)
    {
        return xinhuLogintokenMapper.selectXinhuLogintokenById(id);
    }

    /**
     * 查询系统登录token列表
     * 
     * @param xinhuLogintoken 系统登录token
     * @return 系统登录token
     */
    @Override
    public List<XinhuLogintoken> selectXinhuLogintokenList(XinhuLogintoken xinhuLogintoken)
    {
        return xinhuLogintokenMapper.selectXinhuLogintokenList(xinhuLogintoken);
    }

    /**
     * 新增系统登录token
     * 
     * @param xinhuLogintoken 系统登录token
     * @return 结果
     */
    @Override
    public int insertXinhuLogintoken(XinhuLogintoken xinhuLogintoken)
    {
        return xinhuLogintokenMapper.insertXinhuLogintoken(xinhuLogintoken);
    }

    /**
     * 修改系统登录token
     * 
     * @param xinhuLogintoken 系统登录token
     * @return 结果
     */
    @Override
    public int updateXinhuLogintoken(XinhuLogintoken xinhuLogintoken)
    {
        return xinhuLogintokenMapper.updateXinhuLogintoken(xinhuLogintoken);
    }

    /**
     * 批量删除系统登录token
     * 
     * @param ids 需要删除的系统登录token主键
     * @return 结果
     */
    @Override
    public int deleteXinhuLogintokenByIds(Long[] ids)
    {
        return xinhuLogintokenMapper.deleteXinhuLogintokenByIds(ids);
    }

    /**
     * 删除系统登录token信息
     * 
     * @param id 系统登录token主键
     * @return 结果
     */
    @Override
    public int deleteXinhuLogintokenById(Long id)
    {
        return xinhuLogintokenMapper.deleteXinhuLogintokenById(id);
    }
}
