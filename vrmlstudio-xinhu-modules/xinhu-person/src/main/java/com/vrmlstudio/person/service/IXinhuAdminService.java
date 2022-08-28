package com.vrmlstudio.person.service;

import java.util.List;
import com.vrmlstudio.person.domain.XinhuAdmin;

/**
 * 用户Service接口
 * 
 * @author VR爱好者
 * @date 2022-02-18
 */
public interface IXinhuAdminService 
{
    /**
     * 查询用户
     * 
     * @param id 用户主键
     * @return 用户
     */
    public XinhuAdmin selectXinhuAdminById(Long id);

    /**
     * 查询用户列表
     * 
     * @param xinhuAdmin 用户
     * @return 用户集合
     */
    public List<XinhuAdmin> selectXinhuAdminList(XinhuAdmin xinhuAdmin);

    /**
     * 新增用户
     * 
     * @param xinhuAdmin 用户
     * @return 结果
     */
    public int insertXinhuAdmin(XinhuAdmin xinhuAdmin);

    /**
     * 修改用户
     * 
     * @param xinhuAdmin 用户
     * @return 结果
     */
    public int updateXinhuAdmin(XinhuAdmin xinhuAdmin);

    /**
     * 批量删除用户
     * 
     * @param ids 需要删除的用户主键集合
     * @return 结果
     */
    public int deleteXinhuAdminByIds(Long[] ids);

    /**
     * 删除用户信息
     * 
     * @param id 用户主键
     * @return 结果
     */
    public int deleteXinhuAdminById(Long id);
}
