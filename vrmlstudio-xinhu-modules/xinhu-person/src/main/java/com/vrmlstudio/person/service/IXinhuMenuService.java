package com.vrmlstudio.person.service;

import java.util.List;
import com.vrmlstudio.person.domain.XinhuMenu;

/**
 * 系统菜单Service接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface IXinhuMenuService 
{
    /**
     * 查询系统菜单
     * 
     * @param id 系统菜单主键
     * @return 系统菜单
     */
    public XinhuMenu selectXinhuMenuById(Integer id);

    /**
     * 查询系统菜单列表
     * 
     * @param xinhuMenu 系统菜单
     * @return 系统菜单集合
     */
    public List<XinhuMenu> selectXinhuMenuList(XinhuMenu xinhuMenu);

    /**
     * 新增系统菜单
     * 
     * @param xinhuMenu 系统菜单
     * @return 结果
     */
    public int insertXinhuMenu(XinhuMenu xinhuMenu);

    /**
     * 修改系统菜单
     * 
     * @param xinhuMenu 系统菜单
     * @return 结果
     */
    public int updateXinhuMenu(XinhuMenu xinhuMenu);

    /**
     * 批量删除系统菜单
     * 
     * @param ids 需要删除的系统菜单主键集合
     * @return 结果
     */
    public int deleteXinhuMenuByIds(Integer[] ids);

    /**
     * 删除系统菜单信息
     * 
     * @param id 系统菜单主键
     * @return 结果
     */
    public int deleteXinhuMenuById(Integer id);
}
