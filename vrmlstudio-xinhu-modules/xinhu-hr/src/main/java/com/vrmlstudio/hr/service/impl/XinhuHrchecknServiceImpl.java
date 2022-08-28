package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuHrcheckn;
import com.vrmlstudio.hr.mapper.XinhuHrchecknMapper;
import com.vrmlstudio.hr.service.IXinhuHrchecknService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 考核评分记录Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuHrchecknServiceImpl implements IXinhuHrchecknService
{
    @Autowired
    private XinhuHrchecknMapper xinhuHrchecknMapper;

    /**
     * 查询考核评分记录
     * 
     * @param id 考核评分记录主键
     * @return 考核评分记录
     */
    @Override
    public XinhuHrcheckn selectXinhuHrchecknById(Long id)
    {
        return xinhuHrchecknMapper.selectXinhuHrchecknById(id);
    }

    /**
     * 查询考核评分记录列表
     * 
     * @param xinhuHrcheckn 考核评分记录
     * @return 考核评分记录
     */
    @Override
    public List<XinhuHrcheckn> selectXinhuHrchecknList(XinhuHrcheckn xinhuHrcheckn)
    {
        return xinhuHrchecknMapper.selectXinhuHrchecknList(xinhuHrcheckn);
    }

    /**
     * 新增考核评分记录
     * 
     * @param xinhuHrcheckn 考核评分记录
     * @return 结果
     */
    @Override
    public int insertXinhuHrcheckn(XinhuHrcheckn xinhuHrcheckn)
    {
        return xinhuHrchecknMapper.insertXinhuHrcheckn(xinhuHrcheckn);
    }

    /**
     * 修改考核评分记录
     * 
     * @param xinhuHrcheckn 考核评分记录
     * @return 结果
     */
    @Override
    public int updateXinhuHrcheckn(XinhuHrcheckn xinhuHrcheckn)
    {
        return xinhuHrchecknMapper.updateXinhuHrcheckn(xinhuHrcheckn);
    }

    /**
     * 批量删除考核评分记录
     * 
     * @param ids 需要删除的考核评分记录主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrchecknByIds(Long[] ids)
    {
        return xinhuHrchecknMapper.deleteXinhuHrchecknByIds(ids);
    }

    /**
     * 删除考核评分记录信息
     * 
     * @param id 考核评分记录主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrchecknById(Long id)
    {
        return xinhuHrchecknMapper.deleteXinhuHrchecknById(id);
    }
}
