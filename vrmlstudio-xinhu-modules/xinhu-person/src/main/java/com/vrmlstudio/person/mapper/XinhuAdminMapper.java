package com.vrmlstudio.person.mapper;

import java.util.List;
import com.vrmlstudio.person.domain.XinhuAdmin;

/**
 * 用户Mapper接口
 * 
 * @author VR爱好者
 * @date 2022-02-18
 */
public interface XinhuAdminMapper 
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
     * 删除用户
     * 
     * @param id 用户主键
     * @return 结果
     */
    public int deleteXinhuAdminById(Long id);

    /**
     * 批量删除用户
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuAdminByIds(Long[] ids);
}
