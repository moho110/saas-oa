package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuHrkaohem;
import com.vrmlstudio.hr.mapper.XinhuHrkaohemMapper;
import com.vrmlstudio.hr.service.IXinhuHrkaohemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 考核项目Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuHrkaohemServiceImpl implements IXinhuHrkaohemService
{
    @Autowired
    private XinhuHrkaohemMapper xinhuHrkaohemMapper;

    /**
     * 查询考核项目
     * 
     * @param id 考核项目主键
     * @return 考核项目
     */
    @Override
    public XinhuHrkaohem selectXinhuHrkaohemById(Long id)
    {
        return xinhuHrkaohemMapper.selectXinhuHrkaohemById(id);
    }

    /**
     * 查询考核项目列表
     * 
     * @param xinhuHrkaohem 考核项目
     * @return 考核项目
     */
    @Override
    public List<XinhuHrkaohem> selectXinhuHrkaohemList(XinhuHrkaohem xinhuHrkaohem)
    {
        return xinhuHrkaohemMapper.selectXinhuHrkaohemList(xinhuHrkaohem);
    }

    /**
     * 新增考核项目
     * 
     * @param xinhuHrkaohem 考核项目
     * @return 结果
     */
    @Override
    public int insertXinhuHrkaohem(XinhuHrkaohem xinhuHrkaohem)
    {
        return xinhuHrkaohemMapper.insertXinhuHrkaohem(xinhuHrkaohem);
    }

    /**
     * 修改考核项目
     * 
     * @param xinhuHrkaohem 考核项目
     * @return 结果
     */
    @Override
    public int updateXinhuHrkaohem(XinhuHrkaohem xinhuHrkaohem)
    {
        return xinhuHrkaohemMapper.updateXinhuHrkaohem(xinhuHrkaohem);
    }

    /**
     * 批量删除考核项目
     * 
     * @param ids 需要删除的考核项目主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrkaohemByIds(Long[] ids)
    {
        return xinhuHrkaohemMapper.deleteXinhuHrkaohemByIds(ids);
    }

    /**
     * 删除考核项目信息
     * 
     * @param id 考核项目主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrkaohemById(Long id)
    {
        return xinhuHrkaohemMapper.deleteXinhuHrkaohemById(id);
    }
}
