package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuHrchecks;
import com.vrmlstudio.hr.mapper.XinhuHrchecksMapper;
import com.vrmlstudio.hr.service.IXinhuHrchecksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 考评内容Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuHrchecksServiceImpl implements IXinhuHrchecksService
{
    @Autowired
    private XinhuHrchecksMapper xinhuHrchecksMapper;

    /**
     * 查询考评内容
     * 
     * @param id 考评内容主键
     * @return 考评内容
     */
    @Override
    public XinhuHrchecks selectXinhuHrchecksById(Long id)
    {
        return xinhuHrchecksMapper.selectXinhuHrchecksById(id);
    }

    /**
     * 查询考评内容列表
     * 
     * @param xinhuHrchecks 考评内容
     * @return 考评内容
     */
    @Override
    public List<XinhuHrchecks> selectXinhuHrchecksList(XinhuHrchecks xinhuHrchecks)
    {
        return xinhuHrchecksMapper.selectXinhuHrchecksList(xinhuHrchecks);
    }

    /**
     * 新增考评内容
     * 
     * @param xinhuHrchecks 考评内容
     * @return 结果
     */
    @Override
    public int insertXinhuHrchecks(XinhuHrchecks xinhuHrchecks)
    {
        return xinhuHrchecksMapper.insertXinhuHrchecks(xinhuHrchecks);
    }

    /**
     * 修改考评内容
     * 
     * @param xinhuHrchecks 考评内容
     * @return 结果
     */
    @Override
    public int updateXinhuHrchecks(XinhuHrchecks xinhuHrchecks)
    {
        return xinhuHrchecksMapper.updateXinhuHrchecks(xinhuHrchecks);
    }

    /**
     * 批量删除考评内容
     * 
     * @param ids 需要删除的考评内容主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrchecksByIds(Long[] ids)
    {
        return xinhuHrchecksMapper.deleteXinhuHrchecksByIds(ids);
    }

    /**
     * 删除考评内容信息
     * 
     * @param id 考评内容主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrchecksById(Long id)
    {
        return xinhuHrchecksMapper.deleteXinhuHrchecksById(id);
    }
}
