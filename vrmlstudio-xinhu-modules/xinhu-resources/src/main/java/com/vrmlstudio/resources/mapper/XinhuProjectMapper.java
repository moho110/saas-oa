package com.vrmlstudio.resources.mapper;

import java.util.List;
import com.vrmlstudio.resources.domain.XinhuProject;

/**
 * 项目Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuProjectMapper 
{
    /**
     * 查询项目
     * 
     * @param id 项目主键
     * @return 项目
     */
    public XinhuProject selectXinhuProjectById(Long id);

    /**
     * 查询项目列表
     * 
     * @param xinhuProject 项目
     * @return 项目集合
     */
    public List<XinhuProject> selectXinhuProjectList(XinhuProject xinhuProject);

    /**
     * 新增项目
     * 
     * @param xinhuProject 项目
     * @return 结果
     */
    public int insertXinhuProject(XinhuProject xinhuProject);

    /**
     * 修改项目
     * 
     * @param xinhuProject 项目
     * @return 结果
     */
    public int updateXinhuProject(XinhuProject xinhuProject);

    /**
     * 删除项目
     * 
     * @param id 项目主键
     * @return 结果
     */
    public int deleteXinhuProjectById(Long id);

    /**
     * 批量删除项目
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuProjectByIds(Long[] ids);
}
