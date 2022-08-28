package com.vrmlstudio.document.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.document.mapper.XinhuWenjuauMapper;
import com.vrmlstudio.document.domain.XinhuWenjuau;
import com.vrmlstudio.document.service.IXinhuWenjuauService;

/**
 * 问卷子Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuWenjuauServiceImpl implements IXinhuWenjuauService 
{
    @Autowired
    private XinhuWenjuauMapper xinhuWenjuauMapper;

    /**
     * 查询问卷子
     * 
     * @param id 问卷子主键
     * @return 问卷子
     */
    @Override
    public XinhuWenjuau selectXinhuWenjuauById(Long id)
    {
        return xinhuWenjuauMapper.selectXinhuWenjuauById(id);
    }

    /**
     * 查询问卷子列表
     * 
     * @param xinhuWenjuau 问卷子
     * @return 问卷子
     */
    @Override
    public List<XinhuWenjuau> selectXinhuWenjuauList(XinhuWenjuau xinhuWenjuau)
    {
        return xinhuWenjuauMapper.selectXinhuWenjuauList(xinhuWenjuau);
    }

    /**
     * 新增问卷子
     * 
     * @param xinhuWenjuau 问卷子
     * @return 结果
     */
    @Override
    public int insertXinhuWenjuau(XinhuWenjuau xinhuWenjuau)
    {
        return xinhuWenjuauMapper.insertXinhuWenjuau(xinhuWenjuau);
    }

    /**
     * 修改问卷子
     * 
     * @param xinhuWenjuau 问卷子
     * @return 结果
     */
    @Override
    public int updateXinhuWenjuau(XinhuWenjuau xinhuWenjuau)
    {
        return xinhuWenjuauMapper.updateXinhuWenjuau(xinhuWenjuau);
    }

    /**
     * 批量删除问卷子
     * 
     * @param ids 需要删除的问卷子主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWenjuauByIds(Long[] ids)
    {
        return xinhuWenjuauMapper.deleteXinhuWenjuauByIds(ids);
    }

    /**
     * 删除问卷子信息
     * 
     * @param id 问卷子主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWenjuauById(Long id)
    {
        return xinhuWenjuauMapper.deleteXinhuWenjuauById(id);
    }
}
