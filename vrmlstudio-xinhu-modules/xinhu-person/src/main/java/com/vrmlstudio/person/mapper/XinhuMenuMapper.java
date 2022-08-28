package com.vrmlstudio.person.mapper;

import java.util.List;
import com.vrmlstudio.person.domain.XinhuMenu;

/**
 * 系统菜单Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuMenuMapper 
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
     * 删除系统菜单
     * 
     * @param id 系统菜单主键
     * @return 结果
     */
    public int deleteXinhuMenuById(Integer id);

    /**
     * 批量删除系统菜单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuMenuByIds(Integer[] ids);
}
