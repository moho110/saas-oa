package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuKqxxsj;
import com.vrmlstudio.hr.mapper.XinhuKqxxsjMapper;
import com.vrmlstudio.hr.service.IXinhuKqxxsjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 休息时间规则Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuKqxxsjServiceImpl implements IXinhuKqxxsjService
{
    @Autowired
    private XinhuKqxxsjMapper xinhuKqxxsjMapper;

    /**
     * 查询休息时间规则
     * 
     * @param id 休息时间规则主键
     * @return 休息时间规则
     */
    @Override
    public XinhuKqxxsj selectXinhuKqxxsjById(Long id)
    {
        return xinhuKqxxsjMapper.selectXinhuKqxxsjById(id);
    }

    /**
     * 查询休息时间规则列表
     * 
     * @param xinhuKqxxsj 休息时间规则
     * @return 休息时间规则
     */
    @Override
    public List<XinhuKqxxsj> selectXinhuKqxxsjList(XinhuKqxxsj xinhuKqxxsj)
    {
        return xinhuKqxxsjMapper.selectXinhuKqxxsjList(xinhuKqxxsj);
    }

    /**
     * 新增休息时间规则
     * 
     * @param xinhuKqxxsj 休息时间规则
     * @return 结果
     */
    @Override
    public int insertXinhuKqxxsj(XinhuKqxxsj xinhuKqxxsj)
    {
        return xinhuKqxxsjMapper.insertXinhuKqxxsj(xinhuKqxxsj);
    }

    /**
     * 修改休息时间规则
     * 
     * @param xinhuKqxxsj 休息时间规则
     * @return 结果
     */
    @Override
    public int updateXinhuKqxxsj(XinhuKqxxsj xinhuKqxxsj)
    {
        return xinhuKqxxsjMapper.updateXinhuKqxxsj(xinhuKqxxsj);
    }

    /**
     * 批量删除休息时间规则
     * 
     * @param ids 需要删除的休息时间规则主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqxxsjByIds(Long[] ids)
    {
        return xinhuKqxxsjMapper.deleteXinhuKqxxsjByIds(ids);
    }

    /**
     * 删除休息时间规则信息
     * 
     * @param id 休息时间规则主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqxxsjById(Long id)
    {
        return xinhuKqxxsjMapper.deleteXinhuKqxxsjById(id);
    }
}
