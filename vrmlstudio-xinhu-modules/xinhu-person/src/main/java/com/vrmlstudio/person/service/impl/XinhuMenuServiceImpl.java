package com.vrmlstudio.person.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.person.mapper.XinhuMenuMapper;
import com.vrmlstudio.person.domain.XinhuMenu;
import com.vrmlstudio.person.service.IXinhuMenuService;

/**
 * 系统菜单Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuMenuServiceImpl implements IXinhuMenuService 
{
    @Autowired
    private XinhuMenuMapper xinhuMenuMapper;

    /**
     * 查询系统菜单
     * 
     * @param id 系统菜单主键
     * @return 系统菜单
     */
    @Override
    public XinhuMenu selectXinhuMenuById(Integer id)
    {
        return xinhuMenuMapper.selectXinhuMenuById(id);
    }

    /**
     * 查询系统菜单列表
     * 
     * @param xinhuMenu 系统菜单
     * @return 系统菜单
     */
    @Override
    public List<XinhuMenu> selectXinhuMenuList(XinhuMenu xinhuMenu)
    {
        return xinhuMenuMapper.selectXinhuMenuList(xinhuMenu);
    }

    /**
     * 新增系统菜单
     * 
     * @param xinhuMenu 系统菜单
     * @return 结果
     */
    @Override
    public int insertXinhuMenu(XinhuMenu xinhuMenu)
    {
        return xinhuMenuMapper.insertXinhuMenu(xinhuMenu);
    }

    /**
     * 修改系统菜单
     * 
     * @param xinhuMenu 系统菜单
     * @return 结果
     */
    @Override
    public int updateXinhuMenu(XinhuMenu xinhuMenu)
    {
        return xinhuMenuMapper.updateXinhuMenu(xinhuMenu);
    }

    /**
     * 批量删除系统菜单
     * 
     * @param ids 需要删除的系统菜单主键
     * @return 结果
     */
    @Override
    public int deleteXinhuMenuByIds(Integer[] ids)
    {
        return xinhuMenuMapper.deleteXinhuMenuByIds(ids);
    }

    /**
     * 删除系统菜单信息
     * 
     * @param id 系统菜单主键
     * @return 结果
     */
    @Override
    public int deleteXinhuMenuById(Integer id)
    {
        return xinhuMenuMapper.deleteXinhuMenuById(id);
    }
}
