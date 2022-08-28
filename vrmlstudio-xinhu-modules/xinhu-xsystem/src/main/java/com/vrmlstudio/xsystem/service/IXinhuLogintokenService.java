package com.vrmlstudio.xsystem.service;

import java.util.List;
import com.vrmlstudio.xsystem.domain.XinhuLogintoken;

/**
 * 系统登录tokenService接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface IXinhuLogintokenService 
{
    /**
     * 查询系统登录token
     * 
     * @param id 系统登录token主键
     * @return 系统登录token
     */
    public XinhuLogintoken selectXinhuLogintokenById(Long id);

    /**
     * 查询系统登录token列表
     * 
     * @param xinhuLogintoken 系统登录token
     * @return 系统登录token集合
     */
    public List<XinhuLogintoken> selectXinhuLogintokenList(XinhuLogintoken xinhuLogintoken);

    /**
     * 新增系统登录token
     * 
     * @param xinhuLogintoken 系统登录token
     * @return 结果
     */
    public int insertXinhuLogintoken(XinhuLogintoken xinhuLogintoken);

    /**
     * 修改系统登录token
     * 
     * @param xinhuLogintoken 系统登录token
     * @return 结果
     */
    public int updateXinhuLogintoken(XinhuLogintoken xinhuLogintoken);

    /**
     * 批量删除系统登录token
     * 
     * @param ids 需要删除的系统登录token主键集合
     * @return 结果
     */
    public int deleteXinhuLogintokenByIds(Long[] ids);

    /**
     * 删除系统登录token信息
     * 
     * @param id 系统登录token主键
     * @return 结果
     */
    public int deleteXinhuLogintokenById(Long id);
}
