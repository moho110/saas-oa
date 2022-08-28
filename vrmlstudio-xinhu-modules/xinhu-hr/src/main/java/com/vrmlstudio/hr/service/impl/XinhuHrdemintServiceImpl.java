package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuHrdemint;
import com.vrmlstudio.hr.mapper.XinhuHrdemintMapper;
import com.vrmlstudio.hr.service.IXinhuHrdemintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 面试和人员需求Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuHrdemintServiceImpl implements IXinhuHrdemintService
{
    @Autowired
    private XinhuHrdemintMapper xinhuHrdemintMapper;

    /**
     * 查询面试和人员需求
     * 
     * @param id 面试和人员需求主键
     * @return 面试和人员需求
     */
    @Override
    public XinhuHrdemint selectXinhuHrdemintById(Long id)
    {
        return xinhuHrdemintMapper.selectXinhuHrdemintById(id);
    }

    /**
     * 查询面试和人员需求列表
     * 
     * @param xinhuHrdemint 面试和人员需求
     * @return 面试和人员需求
     */
    @Override
    public List<XinhuHrdemint> selectXinhuHrdemintList(XinhuHrdemint xinhuHrdemint)
    {
        return xinhuHrdemintMapper.selectXinhuHrdemintList(xinhuHrdemint);
    }

    /**
     * 新增面试和人员需求
     * 
     * @param xinhuHrdemint 面试和人员需求
     * @return 结果
     */
    @Override
    public int insertXinhuHrdemint(XinhuHrdemint xinhuHrdemint)
    {
        return xinhuHrdemintMapper.insertXinhuHrdemint(xinhuHrdemint);
    }

    /**
     * 修改面试和人员需求
     * 
     * @param xinhuHrdemint 面试和人员需求
     * @return 结果
     */
    @Override
    public int updateXinhuHrdemint(XinhuHrdemint xinhuHrdemint)
    {
        return xinhuHrdemintMapper.updateXinhuHrdemint(xinhuHrdemint);
    }

    /**
     * 批量删除面试和人员需求
     * 
     * @param ids 需要删除的面试和人员需求主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrdemintByIds(Long[] ids)
    {
        return xinhuHrdemintMapper.deleteXinhuHrdemintByIds(ids);
    }

    /**
     * 删除面试和人员需求信息
     * 
     * @param id 面试和人员需求主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrdemintById(Long id)
    {
        return xinhuHrdemintMapper.deleteXinhuHrdemintById(id);
    }
}
