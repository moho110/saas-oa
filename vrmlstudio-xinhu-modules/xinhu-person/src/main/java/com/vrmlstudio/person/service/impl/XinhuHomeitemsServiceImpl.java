package com.vrmlstudio.person.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.person.mapper.XinhuHomeitemsMapper;
import com.vrmlstudio.person.domain.XinhuHomeitems;
import com.vrmlstudio.person.service.IXinhuHomeitemsService;

/**
 * 桌面项目Service业务层处理
 * 
 * @author VR爱好者
 * @date 2022-02-18
 */
@Service
public class XinhuHomeitemsServiceImpl implements IXinhuHomeitemsService 
{
    @Autowired
    private XinhuHomeitemsMapper xinhuHomeitemsMapper;

    /**
     * 查询桌面项目
     * 
     * @param id 桌面项目主键
     * @return 桌面项目
     */
    @Override
    public XinhuHomeitems selectXinhuHomeitemsById(Long id)
    {
        return xinhuHomeitemsMapper.selectXinhuHomeitemsById(id);
    }

    /**
     * 查询桌面项目列表
     * 
     * @param xinhuHomeitems 桌面项目
     * @return 桌面项目
     */
    @Override
    public List<XinhuHomeitems> selectXinhuHomeitemsList(XinhuHomeitems xinhuHomeitems)
    {
        return xinhuHomeitemsMapper.selectXinhuHomeitemsList(xinhuHomeitems);
    }

    /**
     * 新增桌面项目
     * 
     * @param xinhuHomeitems 桌面项目
     * @return 结果
     */
    @Override
    public int insertXinhuHomeitems(XinhuHomeitems xinhuHomeitems)
    {
        return xinhuHomeitemsMapper.insertXinhuHomeitems(xinhuHomeitems);
    }

    /**
     * 修改桌面项目
     * 
     * @param xinhuHomeitems 桌面项目
     * @return 结果
     */
    @Override
    public int updateXinhuHomeitems(XinhuHomeitems xinhuHomeitems)
    {
        return xinhuHomeitemsMapper.updateXinhuHomeitems(xinhuHomeitems);
    }

    /**
     * 批量删除桌面项目
     * 
     * @param ids 需要删除的桌面项目主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHomeitemsByIds(Long[] ids)
    {
        return xinhuHomeitemsMapper.deleteXinhuHomeitemsByIds(ids);
    }

    /**
     * 删除桌面项目信息
     * 
     * @param id 桌面项目主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHomeitemsById(Long id)
    {
        return xinhuHomeitemsMapper.deleteXinhuHomeitemsById(id);
    }
}
