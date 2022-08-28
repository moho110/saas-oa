package com.vrmlstudio.document.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.document.mapper.XinhuWenjuatMapper;
import com.vrmlstudio.document.domain.XinhuWenjuat;
import com.vrmlstudio.document.service.IXinhuWenjuatService;

/**
 * 问卷子Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuWenjuatServiceImpl implements IXinhuWenjuatService 
{
    @Autowired
    private XinhuWenjuatMapper xinhuWenjuatMapper;

    /**
     * 查询问卷子
     * 
     * @param id 问卷子主键
     * @return 问卷子
     */
    @Override
    public XinhuWenjuat selectXinhuWenjuatById(Long id)
    {
        return xinhuWenjuatMapper.selectXinhuWenjuatById(id);
    }

    /**
     * 查询问卷子列表
     * 
     * @param xinhuWenjuat 问卷子
     * @return 问卷子
     */
    @Override
    public List<XinhuWenjuat> selectXinhuWenjuatList(XinhuWenjuat xinhuWenjuat)
    {
        return xinhuWenjuatMapper.selectXinhuWenjuatList(xinhuWenjuat);
    }

    /**
     * 新增问卷子
     * 
     * @param xinhuWenjuat 问卷子
     * @return 结果
     */
    @Override
    public int insertXinhuWenjuat(XinhuWenjuat xinhuWenjuat)
    {
        return xinhuWenjuatMapper.insertXinhuWenjuat(xinhuWenjuat);
    }

    /**
     * 修改问卷子
     * 
     * @param xinhuWenjuat 问卷子
     * @return 结果
     */
    @Override
    public int updateXinhuWenjuat(XinhuWenjuat xinhuWenjuat)
    {
        return xinhuWenjuatMapper.updateXinhuWenjuat(xinhuWenjuat);
    }

    /**
     * 批量删除问卷子
     * 
     * @param ids 需要删除的问卷子主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWenjuatByIds(Long[] ids)
    {
        return xinhuWenjuatMapper.deleteXinhuWenjuatByIds(ids);
    }

    /**
     * 删除问卷子信息
     * 
     * @param id 问卷子主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWenjuatById(Long id)
    {
        return xinhuWenjuatMapper.deleteXinhuWenjuatById(id);
    }
}
