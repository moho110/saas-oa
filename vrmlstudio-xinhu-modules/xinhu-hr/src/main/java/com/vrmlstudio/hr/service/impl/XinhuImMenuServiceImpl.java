package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuImMenu;
import com.vrmlstudio.hr.mapper.XinhuImMenuMapper;
import com.vrmlstudio.hr.service.IXinhuImMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * IM下应用菜单Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuImMenuServiceImpl implements IXinhuImMenuService
{
    @Autowired
    private XinhuImMenuMapper xinhuImMenuMapper;

    /**
     * 查询IM下应用菜单
     * 
     * @param id IM下应用菜单主键
     * @return IM下应用菜单
     */
    @Override
    public XinhuImMenu selectXinhuImMenuById(Long id)
    {
        return xinhuImMenuMapper.selectXinhuImMenuById(id);
    }

    /**
     * 查询IM下应用菜单列表
     * 
     * @param xinhuImMenu IM下应用菜单
     * @return IM下应用菜单
     */
    @Override
    public List<XinhuImMenu> selectXinhuImMenuList(XinhuImMenu xinhuImMenu)
    {
        return xinhuImMenuMapper.selectXinhuImMenuList(xinhuImMenu);
    }

    /**
     * 新增IM下应用菜单
     * 
     * @param xinhuImMenu IM下应用菜单
     * @return 结果
     */
    @Override
    public int insertXinhuImMenu(XinhuImMenu xinhuImMenu)
    {
        return xinhuImMenuMapper.insertXinhuImMenu(xinhuImMenu);
    }

    /**
     * 修改IM下应用菜单
     * 
     * @param xinhuImMenu IM下应用菜单
     * @return 结果
     */
    @Override
    public int updateXinhuImMenu(XinhuImMenu xinhuImMenu)
    {
        return xinhuImMenuMapper.updateXinhuImMenu(xinhuImMenu);
    }

    /**
     * 批量删除IM下应用菜单
     * 
     * @param ids 需要删除的IM下应用菜单主键
     * @return 结果
     */
    @Override
    public int deleteXinhuImMenuByIds(Long[] ids)
    {
        return xinhuImMenuMapper.deleteXinhuImMenuByIds(ids);
    }

    /**
     * 删除IM下应用菜单信息
     * 
     * @param id IM下应用菜单主键
     * @return 结果
     */
    @Override
    public int deleteXinhuImMenuById(Long id)
    {
        return xinhuImMenuMapper.deleteXinhuImMenuById(id);
    }
}
