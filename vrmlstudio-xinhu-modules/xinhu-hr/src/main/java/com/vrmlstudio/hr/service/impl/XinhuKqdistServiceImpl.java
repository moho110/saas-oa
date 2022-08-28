package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuKqdist;
import com.vrmlstudio.hr.mapper.XinhuKqdistMapper;
import com.vrmlstudio.hr.service.IXinhuKqdistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 考勤分配Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuKqdistServiceImpl implements IXinhuKqdistService
{
    @Autowired
    private XinhuKqdistMapper xinhuKqdistMapper;

    /**
     * 查询考勤分配
     * 
     * @param id 考勤分配主键
     * @return 考勤分配
     */
    @Override
    public XinhuKqdist selectXinhuKqdistById(Long id)
    {
        return xinhuKqdistMapper.selectXinhuKqdistById(id);
    }

    /**
     * 查询考勤分配列表
     * 
     * @param xinhuKqdist 考勤分配
     * @return 考勤分配
     */
    @Override
    public List<XinhuKqdist> selectXinhuKqdistList(XinhuKqdist xinhuKqdist)
    {
        return xinhuKqdistMapper.selectXinhuKqdistList(xinhuKqdist);
    }

    /**
     * 新增考勤分配
     * 
     * @param xinhuKqdist 考勤分配
     * @return 结果
     */
    @Override
    public int insertXinhuKqdist(XinhuKqdist xinhuKqdist)
    {
        return xinhuKqdistMapper.insertXinhuKqdist(xinhuKqdist);
    }

    /**
     * 修改考勤分配
     * 
     * @param xinhuKqdist 考勤分配
     * @return 结果
     */
    @Override
    public int updateXinhuKqdist(XinhuKqdist xinhuKqdist)
    {
        return xinhuKqdistMapper.updateXinhuKqdist(xinhuKqdist);
    }

    /**
     * 批量删除考勤分配
     * 
     * @param ids 需要删除的考勤分配主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqdistByIds(Long[] ids)
    {
        return xinhuKqdistMapper.deleteXinhuKqdistByIds(ids);
    }

    /**
     * 删除考勤分配信息
     * 
     * @param id 考勤分配主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqdistById(Long id)
    {
        return xinhuKqdistMapper.deleteXinhuKqdistById(id);
    }
}
