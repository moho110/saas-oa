package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuHrkaohen;
import com.vrmlstudio.hr.mapper.XinhuHrkaohenMapper;
import com.vrmlstudio.hr.service.IXinhuHrkaohenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 考核项目人员Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuHrkaohenServiceImpl implements IXinhuHrkaohenService
{
    @Autowired
    private XinhuHrkaohenMapper xinhuHrkaohenMapper;

    /**
     * 查询考核项目人员
     * 
     * @param id 考核项目人员主键
     * @return 考核项目人员
     */
    @Override
    public XinhuHrkaohen selectXinhuHrkaohenById(Long id)
    {
        return xinhuHrkaohenMapper.selectXinhuHrkaohenById(id);
    }

    /**
     * 查询考核项目人员列表
     * 
     * @param xinhuHrkaohen 考核项目人员
     * @return 考核项目人员
     */
    @Override
    public List<XinhuHrkaohen> selectXinhuHrkaohenList(XinhuHrkaohen xinhuHrkaohen)
    {
        return xinhuHrkaohenMapper.selectXinhuHrkaohenList(xinhuHrkaohen);
    }

    /**
     * 新增考核项目人员
     * 
     * @param xinhuHrkaohen 考核项目人员
     * @return 结果
     */
    @Override
    public int insertXinhuHrkaohen(XinhuHrkaohen xinhuHrkaohen)
    {
        return xinhuHrkaohenMapper.insertXinhuHrkaohen(xinhuHrkaohen);
    }

    /**
     * 修改考核项目人员
     * 
     * @param xinhuHrkaohen 考核项目人员
     * @return 结果
     */
    @Override
    public int updateXinhuHrkaohen(XinhuHrkaohen xinhuHrkaohen)
    {
        return xinhuHrkaohenMapper.updateXinhuHrkaohen(xinhuHrkaohen);
    }

    /**
     * 批量删除考核项目人员
     * 
     * @param ids 需要删除的考核项目人员主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrkaohenByIds(Long[] ids)
    {
        return xinhuHrkaohenMapper.deleteXinhuHrkaohenByIds(ids);
    }

    /**
     * 删除考核项目人员信息
     * 
     * @param id 考核项目人员主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrkaohenById(Long id)
    {
        return xinhuHrkaohenMapper.deleteXinhuHrkaohenById(id);
    }
}
