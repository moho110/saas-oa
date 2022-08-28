package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuKqdisv;
import com.vrmlstudio.hr.mapper.XinhuKqdisvMapper;
import com.vrmlstudio.hr.service.IXinhuKqdisvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 考勤排班Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuKqdisvServiceImpl implements IXinhuKqdisvService
{
    @Autowired
    private XinhuKqdisvMapper xinhuKqdisvMapper;

    /**
     * 查询考勤排班
     * 
     * @param id 考勤排班主键
     * @return 考勤排班
     */
    @Override
    public XinhuKqdisv selectXinhuKqdisvById(Long id)
    {
        return xinhuKqdisvMapper.selectXinhuKqdisvById(id);
    }

    /**
     * 查询考勤排班列表
     * 
     * @param xinhuKqdisv 考勤排班
     * @return 考勤排班
     */
    @Override
    public List<XinhuKqdisv> selectXinhuKqdisvList(XinhuKqdisv xinhuKqdisv)
    {
        return xinhuKqdisvMapper.selectXinhuKqdisvList(xinhuKqdisv);
    }

    /**
     * 新增考勤排班
     * 
     * @param xinhuKqdisv 考勤排班
     * @return 结果
     */
    @Override
    public int insertXinhuKqdisv(XinhuKqdisv xinhuKqdisv)
    {
        return xinhuKqdisvMapper.insertXinhuKqdisv(xinhuKqdisv);
    }

    /**
     * 修改考勤排班
     * 
     * @param xinhuKqdisv 考勤排班
     * @return 结果
     */
    @Override
    public int updateXinhuKqdisv(XinhuKqdisv xinhuKqdisv)
    {
        return xinhuKqdisvMapper.updateXinhuKqdisv(xinhuKqdisv);
    }

    /**
     * 批量删除考勤排班
     * 
     * @param ids 需要删除的考勤排班主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqdisvByIds(Long[] ids)
    {
        return xinhuKqdisvMapper.deleteXinhuKqdisvByIds(ids);
    }

    /**
     * 删除考勤排班信息
     * 
     * @param id 考勤排班主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqdisvById(Long id)
    {
        return xinhuKqdisvMapper.deleteXinhuKqdisvById(id);
    }
}
