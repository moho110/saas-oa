package com.vrmlstudio.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.XinhuSjoinMapper;
import com.vrmlstudio.xsystem.domain.XinhuSjoin;
import com.vrmlstudio.xsystem.service.IXinhuSjoinService;

/**
 * 后台菜单权限Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuSjoinServiceImpl implements IXinhuSjoinService 
{
    @Autowired
    private XinhuSjoinMapper xinhuSjoinMapper;

    /**
     * 查询后台菜单权限
     * 
     * @param id 后台菜单权限主键
     * @return 后台菜单权限
     */
    @Override
    public XinhuSjoin selectXinhuSjoinById(Long id)
    {
        return xinhuSjoinMapper.selectXinhuSjoinById(id);
    }

    /**
     * 查询后台菜单权限列表
     * 
     * @param xinhuSjoin 后台菜单权限
     * @return 后台菜单权限
     */
    @Override
    public List<XinhuSjoin> selectXinhuSjoinList(XinhuSjoin xinhuSjoin)
    {
        return xinhuSjoinMapper.selectXinhuSjoinList(xinhuSjoin);
    }

    /**
     * 新增后台菜单权限
     * 
     * @param xinhuSjoin 后台菜单权限
     * @return 结果
     */
    @Override
    public int insertXinhuSjoin(XinhuSjoin xinhuSjoin)
    {
        return xinhuSjoinMapper.insertXinhuSjoin(xinhuSjoin);
    }

    /**
     * 修改后台菜单权限
     * 
     * @param xinhuSjoin 后台菜单权限
     * @return 结果
     */
    @Override
    public int updateXinhuSjoin(XinhuSjoin xinhuSjoin)
    {
        return xinhuSjoinMapper.updateXinhuSjoin(xinhuSjoin);
    }

    /**
     * 批量删除后台菜单权限
     * 
     * @param ids 需要删除的后台菜单权限主键
     * @return 结果
     */
    @Override
    public int deleteXinhuSjoinByIds(Long[] ids)
    {
        return xinhuSjoinMapper.deleteXinhuSjoinByIds(ids);
    }

    /**
     * 删除后台菜单权限信息
     * 
     * @param id 后台菜单权限主键
     * @return 结果
     */
    @Override
    public int deleteXinhuSjoinById(Long id)
    {
        return xinhuSjoinMapper.deleteXinhuSjoinById(id);
    }
}
