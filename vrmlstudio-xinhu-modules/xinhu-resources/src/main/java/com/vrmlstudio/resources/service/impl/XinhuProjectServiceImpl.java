package com.vrmlstudio.resources.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.resources.mapper.XinhuProjectMapper;
import com.vrmlstudio.resources.domain.XinhuProject;
import com.vrmlstudio.resources.service.IXinhuProjectService;

/**
 * 项目Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuProjectServiceImpl implements IXinhuProjectService 
{
    @Autowired
    private XinhuProjectMapper xinhuProjectMapper;

    /**
     * 查询项目
     * 
     * @param id 项目主键
     * @return 项目
     */
    @Override
    public XinhuProject selectXinhuProjectById(Long id)
    {
        return xinhuProjectMapper.selectXinhuProjectById(id);
    }

    /**
     * 查询项目列表
     * 
     * @param xinhuProject 项目
     * @return 项目
     */
    @Override
    public List<XinhuProject> selectXinhuProjectList(XinhuProject xinhuProject)
    {
        return xinhuProjectMapper.selectXinhuProjectList(xinhuProject);
    }

    /**
     * 新增项目
     * 
     * @param xinhuProject 项目
     * @return 结果
     */
    @Override
    public int insertXinhuProject(XinhuProject xinhuProject)
    {
        return xinhuProjectMapper.insertXinhuProject(xinhuProject);
    }

    /**
     * 修改项目
     * 
     * @param xinhuProject 项目
     * @return 结果
     */
    @Override
    public int updateXinhuProject(XinhuProject xinhuProject)
    {
        return xinhuProjectMapper.updateXinhuProject(xinhuProject);
    }

    /**
     * 批量删除项目
     * 
     * @param ids 需要删除的项目主键
     * @return 结果
     */
    @Override
    public int deleteXinhuProjectByIds(Long[] ids)
    {
        return xinhuProjectMapper.deleteXinhuProjectByIds(ids);
    }

    /**
     * 删除项目信息
     * 
     * @param id 项目主键
     * @return 结果
     */
    @Override
    public int deleteXinhuProjectById(Long id)
    {
        return xinhuProjectMapper.deleteXinhuProjectById(id);
    }
}
