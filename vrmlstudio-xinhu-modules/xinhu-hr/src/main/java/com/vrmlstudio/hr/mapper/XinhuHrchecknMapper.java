package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuHrcheckn;

/**
 * 考核评分记录Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuHrchecknMapper 
{
    /**
     * 查询考核评分记录
     * 
     * @param id 考核评分记录主键
     * @return 考核评分记录
     */
    public XinhuHrcheckn selectXinhuHrchecknById(Long id);

    /**
     * 查询考核评分记录列表
     * 
     * @param xinhuHrcheckn 考核评分记录
     * @return 考核评分记录集合
     */
    public List<XinhuHrcheckn> selectXinhuHrchecknList(XinhuHrcheckn xinhuHrcheckn);

    /**
     * 新增考核评分记录
     * 
     * @param xinhuHrcheckn 考核评分记录
     * @return 结果
     */
    public int insertXinhuHrcheckn(XinhuHrcheckn xinhuHrcheckn);

    /**
     * 修改考核评分记录
     * 
     * @param xinhuHrcheckn 考核评分记录
     * @return 结果
     */
    public int updateXinhuHrcheckn(XinhuHrcheckn xinhuHrcheckn);

    /**
     * 删除考核评分记录
     * 
     * @param id 考核评分记录主键
     * @return 结果
     */
    public int deleteXinhuHrchecknById(Long id);

    /**
     * 批量删除考核评分记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuHrchecknByIds(Long[] ids);
}
