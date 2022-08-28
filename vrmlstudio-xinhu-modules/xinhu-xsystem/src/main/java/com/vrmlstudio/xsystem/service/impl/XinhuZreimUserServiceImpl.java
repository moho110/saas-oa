package com.vrmlstudio.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.XinhuZreimUserMapper;
import com.vrmlstudio.xsystem.domain.XinhuZreimUser;
import com.vrmlstudio.xsystem.service.IXinhuZreimUserService;

/**
 * REIM即时通讯平台用户Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuZreimUserServiceImpl implements IXinhuZreimUserService 
{
    @Autowired
    private XinhuZreimUserMapper xinhuZreimUserMapper;

    /**
     * 查询REIM即时通讯平台用户
     * 
     * @param id REIM即时通讯平台用户主键
     * @return REIM即时通讯平台用户
     */
    @Override
    public XinhuZreimUser selectXinhuZreimUserById(Long id)
    {
        return xinhuZreimUserMapper.selectXinhuZreimUserById(id);
    }

    /**
     * 查询REIM即时通讯平台用户列表
     * 
     * @param xinhuZreimUser REIM即时通讯平台用户
     * @return REIM即时通讯平台用户
     */
    @Override
    public List<XinhuZreimUser> selectXinhuZreimUserList(XinhuZreimUser xinhuZreimUser)
    {
        return xinhuZreimUserMapper.selectXinhuZreimUserList(xinhuZreimUser);
    }

    /**
     * 新增REIM即时通讯平台用户
     * 
     * @param xinhuZreimUser REIM即时通讯平台用户
     * @return 结果
     */
    @Override
    public int insertXinhuZreimUser(XinhuZreimUser xinhuZreimUser)
    {
        return xinhuZreimUserMapper.insertXinhuZreimUser(xinhuZreimUser);
    }

    /**
     * 修改REIM即时通讯平台用户
     * 
     * @param xinhuZreimUser REIM即时通讯平台用户
     * @return 结果
     */
    @Override
    public int updateXinhuZreimUser(XinhuZreimUser xinhuZreimUser)
    {
        return xinhuZreimUserMapper.updateXinhuZreimUser(xinhuZreimUser);
    }

    /**
     * 批量删除REIM即时通讯平台用户
     * 
     * @param ids 需要删除的REIM即时通讯平台用户主键
     * @return 结果
     */
    @Override
    public int deleteXinhuZreimUserByIds(Long[] ids)
    {
        return xinhuZreimUserMapper.deleteXinhuZreimUserByIds(ids);
    }

    /**
     * 删除REIM即时通讯平台用户信息
     * 
     * @param id REIM即时通讯平台用户主键
     * @return 结果
     */
    @Override
    public int deleteXinhuZreimUserById(Long id)
    {
        return xinhuZreimUserMapper.deleteXinhuZreimUserById(id);
    }
}
