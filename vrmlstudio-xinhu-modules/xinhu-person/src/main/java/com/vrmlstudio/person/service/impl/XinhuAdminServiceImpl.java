package com.vrmlstudio.person.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.person.mapper.XinhuAdminMapper;
import com.vrmlstudio.person.domain.XinhuAdmin;
import com.vrmlstudio.person.service.IXinhuAdminService;

/**
 * 用户Service业务层处理
 * 
 * @author VR爱好者
 * @date 2022-02-18
 */
@Service
public class XinhuAdminServiceImpl implements IXinhuAdminService 
{
    @Autowired
    private XinhuAdminMapper xinhuAdminMapper;

    /**
     * 查询用户
     * 
     * @param id 用户主键
     * @return 用户
     */
    @Override
    public XinhuAdmin selectXinhuAdminById(Long id)
    {
        return xinhuAdminMapper.selectXinhuAdminById(id);
    }

    /**
     * 查询用户列表
     * 
     * @param xinhuAdmin 用户
     * @return 用户
     */
    @Override
    public List<XinhuAdmin> selectXinhuAdminList(XinhuAdmin xinhuAdmin)
    {
        return xinhuAdminMapper.selectXinhuAdminList(xinhuAdmin);
    }

    /**
     * 新增用户
     * 
     * @param xinhuAdmin 用户
     * @return 结果
     */
    @Override
    public int insertXinhuAdmin(XinhuAdmin xinhuAdmin)
    {
        return xinhuAdminMapper.insertXinhuAdmin(xinhuAdmin);
    }

    /**
     * 修改用户
     * 
     * @param xinhuAdmin 用户
     * @return 结果
     */
    @Override
    public int updateXinhuAdmin(XinhuAdmin xinhuAdmin)
    {
        return xinhuAdminMapper.updateXinhuAdmin(xinhuAdmin);
    }

    /**
     * 批量删除用户
     * 
     * @param ids 需要删除的用户主键
     * @return 结果
     */
    @Override
    public int deleteXinhuAdminByIds(Long[] ids)
    {
        return xinhuAdminMapper.deleteXinhuAdminByIds(ids);
    }

    /**
     * 删除用户信息
     * 
     * @param id 用户主键
     * @return 结果
     */
    @Override
    public int deleteXinhuAdminById(Long id)
    {
        return xinhuAdminMapper.deleteXinhuAdminById(id);
    }
}
