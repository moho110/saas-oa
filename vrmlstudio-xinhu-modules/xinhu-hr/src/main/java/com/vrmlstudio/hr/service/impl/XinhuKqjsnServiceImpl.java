package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuKqjsn;
import com.vrmlstudio.hr.mapper.XinhuKqjsnMapper;
import com.vrmlstudio.hr.service.IXinhuKqjsnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 考勤机设备Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuKqjsnServiceImpl implements IXinhuKqjsnService
{
    @Autowired
    private XinhuKqjsnMapper xinhuKqjsnMapper;

    /**
     * 查询考勤机设备
     * 
     * @param id 考勤机设备主键
     * @return 考勤机设备
     */
    @Override
    public XinhuKqjsn selectXinhuKqjsnById(Long id)
    {
        return xinhuKqjsnMapper.selectXinhuKqjsnById(id);
    }

    /**
     * 查询考勤机设备列表
     * 
     * @param xinhuKqjsn 考勤机设备
     * @return 考勤机设备
     */
    @Override
    public List<XinhuKqjsn> selectXinhuKqjsnList(XinhuKqjsn xinhuKqjsn)
    {
        return xinhuKqjsnMapper.selectXinhuKqjsnList(xinhuKqjsn);
    }

    /**
     * 新增考勤机设备
     * 
     * @param xinhuKqjsn 考勤机设备
     * @return 结果
     */
    @Override
    public int insertXinhuKqjsn(XinhuKqjsn xinhuKqjsn)
    {
        return xinhuKqjsnMapper.insertXinhuKqjsn(xinhuKqjsn);
    }

    /**
     * 修改考勤机设备
     * 
     * @param xinhuKqjsn 考勤机设备
     * @return 结果
     */
    @Override
    public int updateXinhuKqjsn(XinhuKqjsn xinhuKqjsn)
    {
        return xinhuKqjsnMapper.updateXinhuKqjsn(xinhuKqjsn);
    }

    /**
     * 批量删除考勤机设备
     * 
     * @param ids 需要删除的考勤机设备主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqjsnByIds(Long[] ids)
    {
        return xinhuKqjsnMapper.deleteXinhuKqjsnByIds(ids);
    }

    /**
     * 删除考勤机设备信息
     * 
     * @param id 考勤机设备主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqjsnById(Long id)
    {
        return xinhuKqjsnMapper.deleteXinhuKqjsnById(id);
    }
}
