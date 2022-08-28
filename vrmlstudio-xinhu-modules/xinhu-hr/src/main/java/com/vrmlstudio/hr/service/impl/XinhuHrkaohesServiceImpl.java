package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuHrkaohes;
import com.vrmlstudio.hr.mapper.XinhuHrkaohesMapper;
import com.vrmlstudio.hr.service.IXinhuHrkaohesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 考核项目的内容Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuHrkaohesServiceImpl implements IXinhuHrkaohesService
{
    @Autowired
    private XinhuHrkaohesMapper xinhuHrkaohesMapper;

    /**
     * 查询考核项目的内容
     * 
     * @param id 考核项目的内容主键
     * @return 考核项目的内容
     */
    @Override
    public XinhuHrkaohes selectXinhuHrkaohesById(Long id)
    {
        return xinhuHrkaohesMapper.selectXinhuHrkaohesById(id);
    }

    /**
     * 查询考核项目的内容列表
     * 
     * @param xinhuHrkaohes 考核项目的内容
     * @return 考核项目的内容
     */
    @Override
    public List<XinhuHrkaohes> selectXinhuHrkaohesList(XinhuHrkaohes xinhuHrkaohes)
    {
        return xinhuHrkaohesMapper.selectXinhuHrkaohesList(xinhuHrkaohes);
    }

    /**
     * 新增考核项目的内容
     * 
     * @param xinhuHrkaohes 考核项目的内容
     * @return 结果
     */
    @Override
    public int insertXinhuHrkaohes(XinhuHrkaohes xinhuHrkaohes)
    {
        return xinhuHrkaohesMapper.insertXinhuHrkaohes(xinhuHrkaohes);
    }

    /**
     * 修改考核项目的内容
     * 
     * @param xinhuHrkaohes 考核项目的内容
     * @return 结果
     */
    @Override
    public int updateXinhuHrkaohes(XinhuHrkaohes xinhuHrkaohes)
    {
        return xinhuHrkaohesMapper.updateXinhuHrkaohes(xinhuHrkaohes);
    }

    /**
     * 批量删除考核项目的内容
     * 
     * @param ids 需要删除的考核项目的内容主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrkaohesByIds(Long[] ids)
    {
        return xinhuHrkaohesMapper.deleteXinhuHrkaohesByIds(ids);
    }

    /**
     * 删除考核项目的内容信息
     * 
     * @param id 考核项目的内容主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrkaohesById(Long id)
    {
        return xinhuHrkaohesMapper.deleteXinhuHrkaohesById(id);
    }
}
