package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuKqanay;
import com.vrmlstudio.hr.mapper.XinhuKqanayMapper;
import com.vrmlstudio.hr.service.IXinhuKqanayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 考勤分析Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuKqanayServiceImpl implements IXinhuKqanayService
{
    @Autowired
    private XinhuKqanayMapper xinhuKqanayMapper;

    /**
     * 查询考勤分析
     * 
     * @param id 考勤分析主键
     * @return 考勤分析
     */
    @Override
    public XinhuKqanay selectXinhuKqanayById(Long id)
    {
        return xinhuKqanayMapper.selectXinhuKqanayById(id);
    }

    /**
     * 查询考勤分析列表
     * 
     * @param xinhuKqanay 考勤分析
     * @return 考勤分析
     */
    @Override
    public List<XinhuKqanay> selectXinhuKqanayList(XinhuKqanay xinhuKqanay)
    {
        return xinhuKqanayMapper.selectXinhuKqanayList(xinhuKqanay);
    }

    /**
     * 新增考勤分析
     * 
     * @param xinhuKqanay 考勤分析
     * @return 结果
     */
    @Override
    public int insertXinhuKqanay(XinhuKqanay xinhuKqanay)
    {
        return xinhuKqanayMapper.insertXinhuKqanay(xinhuKqanay);
    }

    /**
     * 修改考勤分析
     * 
     * @param xinhuKqanay 考勤分析
     * @return 结果
     */
    @Override
    public int updateXinhuKqanay(XinhuKqanay xinhuKqanay)
    {
        return xinhuKqanayMapper.updateXinhuKqanay(xinhuKqanay);
    }

    /**
     * 批量删除考勤分析
     * 
     * @param ids 需要删除的考勤分析主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqanayByIds(Long[] ids)
    {
        return xinhuKqanayMapper.deleteXinhuKqanayByIds(ids);
    }

    /**
     * 删除考勤分析信息
     * 
     * @param id 考勤分析主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqanayById(Long id)
    {
        return xinhuKqanayMapper.deleteXinhuKqanayById(id);
    }
}
