package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuImMenu;

/**
 * IM下应用菜单Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuImMenuMapper 
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
     * 删除IM下应用菜单
     * 
     * @param id IM下应用菜单主键
     * @return 结果
     */
    public int deleteXinhuImMenuById(Long id);

    /**
     * 批量删除IM下应用菜单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuImMenuByIds(Long[] ids);
}
