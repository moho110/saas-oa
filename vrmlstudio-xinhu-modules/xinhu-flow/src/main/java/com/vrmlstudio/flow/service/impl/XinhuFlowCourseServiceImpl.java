package com.vrmlstudio.flow.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.flow.mapper.XinhuFlowCourseMapper;
import com.vrmlstudio.flow.domain.XinhuFlowCourse;
import com.vrmlstudio.flow.service.IXinhuFlowCourseService;

/**
 * 流程步骤Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuFlowCourseServiceImpl implements IXinhuFlowCourseService 
{
    @Autowired
    private XinhuFlowCourseMapper xinhuFlowCourseMapper;

    /**
     * 查询流程步骤
     * 
     * @param id 流程步骤主键
     * @return 流程步骤
     */
    @Override
    public XinhuFlowCourse selectXinhuFlowCourseById(Long id)
    {
        return xinhuFlowCourseMapper.selectXinhuFlowCourseById(id);
    }

    /**
     * 查询流程步骤列表
     * 
     * @param xinhuFlowCourse 流程步骤
     * @return 流程步骤
     */
    @Override
    public List<XinhuFlowCourse> selectXinhuFlowCourseList(XinhuFlowCourse xinhuFlowCourse)
    {
        return xinhuFlowCourseMapper.selectXinhuFlowCourseList(xinhuFlowCourse);
    }

    /**
     * 新增流程步骤
     * 
     * @param xinhuFlowCourse 流程步骤
     * @return 结果
     */
    @Override
    public int insertXinhuFlowCourse(XinhuFlowCourse xinhuFlowCourse)
    {
        return xinhuFlowCourseMapper.insertXinhuFlowCourse(xinhuFlowCourse);
    }

    /**
     * 修改流程步骤
     * 
     * @param xinhuFlowCourse 流程步骤
     * @return 结果
     */
    @Override
    public int updateXinhuFlowCourse(XinhuFlowCourse xinhuFlowCourse)
    {
        return xinhuFlowCourseMapper.updateXinhuFlowCourse(xinhuFlowCourse);
    }

    /**
     * 批量删除流程步骤
     * 
     * @param ids 需要删除的流程步骤主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowCourseByIds(Long[] ids)
    {
        return xinhuFlowCourseMapper.deleteXinhuFlowCourseByIds(ids);
    }

    /**
     * 删除流程步骤信息
     * 
     * @param id 流程步骤主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowCourseById(Long id)
    {
        return xinhuFlowCourseMapper.deleteXinhuFlowCourseById(id);
    }
}
