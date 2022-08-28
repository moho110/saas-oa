package com.vrmlstudio.hr.service;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuImMenu;

/**
 * IM下应用菜单Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuImMenuService 
{
    /**
     * 查询IM下应用菜单
     * 
     * @param id IM下应用菜单主键
     * @return IM下应用菜单
     */
    public XinhuImMenu selectXinhuImMenuById(Long id);

    /**
     * 查询IM下应用菜单列表
     * 
     * @param xinhuImMenu IM下应用菜单
     * @return IM下应用菜单集合
     */
    public List<XinhuImMenu> selectXinhuImMenuList(XinhuImMenu xinhuImMenu);

    /**
     * 新增IM下应用菜单
     * 
     * @param xinhuImMenu IM下应用菜单
     * @return 结果
     */
    public int insertXinhuImMenu(XinhuImMenu xinhuImMenu);

    /**
     * 修改IM下应用菜单
     * 
     * @param xinhuImMenu IM下应用菜单
     * @return 结果
     */
    public int updateXinhuImMenu(XinhuImMenu xinhuImMenu);

    /**
     * 批量删除IM下应用菜单
     * 
     * @param ids 需要删除的IM下应用菜单主键集合
     * @return 结果
     */
    public int deleteXinhuImMenuByIds(Long[] ids);

    /**
     * 删除IM下应用菜单信息
     * 
     * @param id IM下应用菜单主键
     * @return 结果
     */
    public int deleteXinhuImMenuById(Long id);
}
