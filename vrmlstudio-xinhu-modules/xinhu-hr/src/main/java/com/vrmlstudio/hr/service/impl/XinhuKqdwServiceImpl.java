package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuKqdw;
import com.vrmlstudio.hr.mapper.XinhuKqdwMapper;
import com.vrmlstudio.hr.service.IXinhuKqdwService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 考勤定位规则Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuKqdwServiceImpl implements IXinhuKqdwService
{
    @Autowired
    private XinhuKqdwMapper xinhuKqdwMapper;

    /**
     * 查询考勤定位规则
     * 
     * @param id 考勤定位规则主键
     * @return 考勤定位规则
     */
    @Override
    public XinhuKqdw selectXinhuKqdwById(Integer id)
    {
        return xinhuKqdwMapper.selectXinhuKqdwById(id);
    }

    /**
     * 查询考勤定位规则列表
     * 
     * @param xinhuKqdw 考勤定位规则
     * @return 考勤定位规则
     */
    @Override
    public List<XinhuKqdw> selectXinhuKqdwList(XinhuKqdw xinhuKqdw)
    {
        return xinhuKqdwMapper.selectXinhuKqdwList(xinhuKqdw);
    }

    /**
     * 新增考勤定位规则
     * 
     * @param xinhuKqdw 考勤定位规则
     * @return 结果
     */
    @Override
    public int insertXinhuKqdw(XinhuKqdw xinhuKqdw)
    {
        return xinhuKqdwMapper.insertXinhuKqdw(xinhuKqdw);
    }

    /**
     * 修改考勤定位规则
     * 
     * @param xinhuKqdw 考勤定位规则
     * @return 结果
     */
    @Override
    public int updateXinhuKqdw(XinhuKqdw xinhuKqdw)
    {
        return xinhuKqdwMapper.updateXinhuKqdw(xinhuKqdw);
    }

    /**
     * 批量删除考勤定位规则
     * 
     * @param ids 需要删除的考勤定位规则主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqdwByIds(Integer[] ids)
    {
        return xinhuKqdwMapper.deleteXinhuKqdwByIds(ids);
    }

    /**
     * 删除考勤定位规则信息
     * 
     * @param id 考勤定位规则主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqdwById(Integer id)
    {
        return xinhuKqdwMapper.deleteXinhuKqdwById(id);
    }
}
