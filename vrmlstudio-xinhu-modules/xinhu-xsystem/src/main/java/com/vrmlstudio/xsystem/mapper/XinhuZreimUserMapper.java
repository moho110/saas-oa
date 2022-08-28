package com.vrmlstudio.xsystem.mapper;

import java.util.List;
import com.vrmlstudio.xsystem.domain.XinhuZreimUser;

/**
 * REIM即时通讯平台用户Mapper接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface XinhuZreimUserMapper 
{
    /**
     * 查询REIM即时通讯平台用户
     * 
     * @param id REIM即时通讯平台用户主键
     * @return REIM即时通讯平台用户
     */
    public XinhuZreimUser selectXinhuZreimUserById(Long id);

    /**
     * 查询REIM即时通讯平台用户列表
     * 
     * @param xinhuZreimUser REIM即时通讯平台用户
     * @return REIM即时通讯平台用户集合
     */
    public List<XinhuZreimUser> selectXinhuZreimUserList(XinhuZreimUser xinhuZreimUser);

    /**
     * 新增REIM即时通讯平台用户
     * 
     * @param xinhuZreimUser REIM即时通讯平台用户
     * @return 结果
     */
    public int insertXinhuZreimUser(XinhuZreimUser xinhuZreimUser);

    /**
     * 修改REIM即时通讯平台用户
     * 
     * @param xinhuZreimUser REIM即时通讯平台用户
     * @return 结果
     */
    public int updateXinhuZreimUser(XinhuZreimUser xinhuZreimUser);

    /**
     * 删除REIM即时通讯平台用户
     * 
     * @param id REIM即时通讯平台用户主键
     * @return 结果
     */
    public int deleteXinhuZreimUserById(Long id);

    /**
     * 批量删除REIM即时通讯平台用户
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuZreimUserByIds(Long[] ids);
}
