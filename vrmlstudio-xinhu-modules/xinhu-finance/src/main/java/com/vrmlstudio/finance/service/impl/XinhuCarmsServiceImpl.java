package com.vrmlstudio.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.finance.mapper.XinhuCarmsMapper;
import com.vrmlstudio.finance.domain.XinhuCarms;
import com.vrmlstudio.finance.service.IXinhuCarmsService;

/**
 * 车辆信息登记Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuCarmsServiceImpl implements IXinhuCarmsService 
{
    @Autowired
    private XinhuCarmsMapper xinhuCarmsMapper;

    /**
     * 查询车辆信息登记
     * 
     * @param id 车辆信息登记主键
     * @return 车辆信息登记
     */
    @Override
    public XinhuCarms selectXinhuCarmsById(Long id)
    {
        return xinhuCarmsMapper.selectXinhuCarmsById(id);
    }

    /**
     * 查询车辆信息登记列表
     * 
     * @param xinhuCarms 车辆信息登记
     * @return 车辆信息登记
     */
    @Override
    public List<XinhuCarms> selectXinhuCarmsList(XinhuCarms xinhuCarms)
    {
        return xinhuCarmsMapper.selectXinhuCarmsList(xinhuCarms);
    }

    /**
     * 新增车辆信息登记
     * 
     * @param xinhuCarms 车辆信息登记
     * @return 结果
     */
    @Override
    public int insertXinhuCarms(XinhuCarms xinhuCarms)
    {
        return xinhuCarmsMapper.insertXinhuCarms(xinhuCarms);
    }

    /**
     * 修改车辆信息登记
     * 
     * @param xinhuCarms 车辆信息登记
     * @return 结果
     */
    @Override
    public int updateXinhuCarms(XinhuCarms xinhuCarms)
    {
        return xinhuCarmsMapper.updateXinhuCarms(xinhuCarms);
    }

    /**
     * 批量删除车辆信息登记
     * 
     * @param ids 需要删除的车辆信息登记主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCarmsByIds(Long[] ids)
    {
        return xinhuCarmsMapper.deleteXinhuCarmsByIds(ids);
    }

    /**
     * 删除车辆信息登记信息
     * 
     * @param id 车辆信息登记主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCarmsById(Long id)
    {
        return xinhuCarmsMapper.deleteXinhuCarmsById(id);
    }
}
