package com.vrmlstudio.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.XinhuWouserMapper;
import com.vrmlstudio.xsystem.domain.XinhuWouser;
import com.vrmlstudio.xsystem.service.IXinhuWouserService;

/**
 * 微信用户信息Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuWouserServiceImpl implements IXinhuWouserService 
{
    @Autowired
    private XinhuWouserMapper xinhuWouserMapper;

    /**
     * 查询微信用户信息
     * 
     * @param id 微信用户信息主键
     * @return 微信用户信息
     */
    @Override
    public XinhuWouser selectXinhuWouserById(Long id)
    {
        return xinhuWouserMapper.selectXinhuWouserById(id);
    }

    /**
     * 查询微信用户信息列表
     * 
     * @param xinhuWouser 微信用户信息
     * @return 微信用户信息
     */
    @Override
    public List<XinhuWouser> selectXinhuWouserList(XinhuWouser xinhuWouser)
    {
        return xinhuWouserMapper.selectXinhuWouserList(xinhuWouser);
    }

    /**
     * 新增微信用户信息
     * 
     * @param xinhuWouser 微信用户信息
     * @return 结果
     */
    @Override
    public int insertXinhuWouser(XinhuWouser xinhuWouser)
    {
        return xinhuWouserMapper.insertXinhuWouser(xinhuWouser);
    }

    /**
     * 修改微信用户信息
     * 
     * @param xinhuWouser 微信用户信息
     * @return 结果
     */
    @Override
    public int updateXinhuWouser(XinhuWouser xinhuWouser)
    {
        return xinhuWouserMapper.updateXinhuWouser(xinhuWouser);
    }

    /**
     * 批量删除微信用户信息
     * 
     * @param ids 需要删除的微信用户信息主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWouserByIds(Long[] ids)
    {
        return xinhuWouserMapper.deleteXinhuWouserByIds(ids);
    }

    /**
     * 删除微信用户信息信息
     * 
     * @param id 微信用户信息主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWouserById(Long id)
    {
        return xinhuWouserMapper.deleteXinhuWouserById(id);
    }
}
