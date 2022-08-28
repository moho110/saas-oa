package com.vrmlstudio.xsystem.service;

import java.util.List;
import com.vrmlstudio.xsystem.domain.XinhuSjoin;

/**
 * 后台菜单权限Service接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface IXinhuSjoinService 
{
    /**
     * 查询后台菜单权限
     * 
     * @param id 后台菜单权限主键
     * @return 后台菜单权限
     */
    public XinhuSjoin selectXinhuSjoinById(Long id);

    /**
     * 查询后台菜单权限列表
     * 
     * @param xinhuSjoin 后台菜单权限
     * @return 后台菜单权限集合
     */
    public List<XinhuSjoin> selectXinhuSjoinList(XinhuSjoin xinhuSjoin);

    /**
     * 新增后台菜单权限
     * 
     * @param xinhuSjoin 后台菜单权限
     * @return 结果
     */
    public int insertXinhuSjoin(XinhuSjoin xinhuSjoin);

    /**
     * 修改后台菜单权限
     * 
     * @param xinhuSjoin 后台菜单权限
     * @return 结果
     */
    public int updateXinhuSjoin(XinhuSjoin xinhuSjoin);

    /**
     * 批量删除后台菜单权限
     * 
     * @param ids 需要删除的后台菜单权限主键集合
     * @return 结果
     */
    public int deleteXinhuSjoinByIds(Long[] ids);

    /**
     * 删除后台菜单权限信息
     * 
     * @param id 后台菜单权限主键
     * @return 结果
     */
    public int deleteXinhuSjoinById(Long id);
}
