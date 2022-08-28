package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuHrcheck;
import com.vrmlstudio.hr.mapper.XinhuHrcheckMapper;
import com.vrmlstudio.hr.service.IXinhuHrcheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 考核评分Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuHrcheckServiceImpl implements IXinhuHrcheckService
{
    @Autowired
    private XinhuHrcheckMapper xinhuHrcheckMapper;

    /**
     * 查询考核评分
     * 
     * @param id 考核评分主键
     * @return 考核评分
     */
    @Override
    public XinhuHrcheck selectXinhuHrcheckById(Long id)
    {
        return xinhuHrcheckMapper.selectXinhuHrcheckById(id);
    }

    /**
     * 查询考核评分列表
     * 
     * @param xinhuHrcheck 考核评分
     * @return 考核评分
     */
    @Override
    public List<XinhuHrcheck> selectXinhuHrcheckList(XinhuHrcheck xinhuHrcheck)
    {
        return xinhuHrcheckMapper.selectXinhuHrcheckList(xinhuHrcheck);
    }

    /**
     * 新增考核评分
     * 
     * @param xinhuHrcheck 考核评分
     * @return 结果
     */
    @Override
    public int insertXinhuHrcheck(XinhuHrcheck xinhuHrcheck)
    {
        return xinhuHrcheckMapper.insertXinhuHrcheck(xinhuHrcheck);
    }

    /**
     * 修改考核评分
     * 
     * @param xinhuHrcheck 考核评分
     * @return 结果
     */
    @Override
    public int updateXinhuHrcheck(XinhuHrcheck xinhuHrcheck)
    {
        return xinhuHrcheckMapper.updateXinhuHrcheck(xinhuHrcheck);
    }

    /**
     * 批量删除考核评分
     * 
     * @param ids 需要删除的考核评分主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrcheckByIds(Long[] ids)
    {
        return xinhuHrcheckMapper.deleteXinhuHrcheckByIds(ids);
    }

    /**
     * 删除考核评分信息
     * 
     * @param id 考核评分主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrcheckById(Long id)
    {
        return xinhuHrcheckMapper.deleteXinhuHrcheckById(id);
    }
}
