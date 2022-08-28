package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuHrchecks;

/**
 * 考评内容Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuHrchecksMapper 
{
    /**
     * 查询考评内容
     * 
     * @param id 考评内容主键
     * @return 考评内容
     */
    public XinhuHrchecks selectXinhuHrchecksById(Long id);

    /**
     * 查询考评内容列表
     * 
     * @param xinhuHrchecks 考评内容
     * @return 考评内容集合
     */
    public List<XinhuHrchecks> selectXinhuHrchecksList(XinhuHrchecks xinhuHrchecks);

    /**
     * 新增考评内容
     * 
     * @param xinhuHrchecks 考评内容
     * @return 结果
     */
    public int insertXinhuHrchecks(XinhuHrchecks xinhuHrchecks);

    /**
     * 修改考评内容
     * 
     * @param xinhuHrchecks 考评内容
     * @return 结果
     */
    public int updateXinhuHrchecks(XinhuHrchecks xinhuHrchecks);

    /**
     * 删除考评内容
     * 
     * @param id 考评内容主键
     * @return 结果
     */
    public int deleteXinhuHrchecksById(Long id);

    /**
     * 批量删除考评内容
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuHrchecksByIds(Long[] ids);
}
