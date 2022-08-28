package com.vrmlstudio.hr.service;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuHrkaohen;

/**
 * 考核项目人员Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuHrkaohenService 
{
    /**
     * 查询考核项目人员
     * 
     * @param id 考核项目人员主键
     * @return 考核项目人员
     */
    public XinhuHrkaohen selectXinhuHrkaohenById(Long id);

    /**
     * 查询考核项目人员列表
     * 
     * @param xinhuHrkaohen 考核项目人员
     * @return 考核项目人员集合
     */
    public List<XinhuHrkaohen> selectXinhuHrkaohenList(XinhuHrkaohen xinhuHrkaohen);

    /**
     * 新增考核项目人员
     * 
     * @param xinhuHrkaohen 考核项目人员
     * @return 结果
     */
    public int insertXinhuHrkaohen(XinhuHrkaohen xinhuHrkaohen);

    /**
     * 修改考核项目人员
     * 
     * @param xinhuHrkaohen 考核项目人员
     * @return 结果
     */
    public int updateXinhuHrkaohen(XinhuHrkaohen xinhuHrkaohen);

    /**
     * 批量删除考核项目人员
     * 
     * @param ids 需要删除的考核项目人员主键集合
     * @return 结果
     */
    public int deleteXinhuHrkaohenByIds(Long[] ids);

    /**
     * 删除考核项目人员信息
     * 
     * @param id 考核项目人员主键
     * @return 结果
     */
    public int deleteXinhuHrkaohenById(Long id);
}
