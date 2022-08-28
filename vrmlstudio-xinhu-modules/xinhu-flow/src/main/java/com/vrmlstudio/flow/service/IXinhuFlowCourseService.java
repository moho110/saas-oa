package com.vrmlstudio.flow.service;

import java.util.List;
import com.vrmlstudio.flow.domain.XinhuFlowCourse;

/**
 * 流程步骤Service接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface IXinhuFlowCourseService 
{
    /**
     * 查询流程步骤
     * 
     * @param id 流程步骤主键
     * @return 流程步骤
     */
    public XinhuFlowCourse selectXinhuFlowCourseById(Long id);

    /**
     * 查询流程步骤列表
     * 
     * @param xinhuFlowCourse 流程步骤
     * @return 流程步骤集合
     */
    public List<XinhuFlowCourse> selectXinhuFlowCourseList(XinhuFlowCourse xinhuFlowCourse);

    /**
     * 新增流程步骤
     * 
     * @param xinhuFlowCourse 流程步骤
     * @return 结果
     */
    public int insertXinhuFlowCourse(XinhuFlowCourse xinhuFlowCourse);

    /**
     * 修改流程步骤
     * 
     * @param xinhuFlowCourse 流程步骤
     * @return 结果
     */
    public int updateXinhuFlowCourse(XinhuFlowCourse xinhuFlowCourse);

    /**
     * 批量删除流程步骤
     * 
     * @param ids 需要删除的流程步骤主键集合
     * @return 结果
     */
    public int deleteXinhuFlowCourseByIds(Long[] ids);

    /**
     * 删除流程步骤信息
     * 
     * @param id 流程步骤主键
     * @return 结果
     */
    public int deleteXinhuFlowCourseById(Long id);
}
