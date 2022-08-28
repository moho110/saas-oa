package com.vrmlstudio.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.finance.mapper.XinhuCarmangMapper;
import com.vrmlstudio.finance.domain.XinhuCarmang;
import com.vrmlstudio.finance.service.IXinhuCarmangService;

/**
 * 车辆维修保养记录Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuCarmangServiceImpl implements IXinhuCarmangService 
{
    @Autowired
    private XinhuCarmangMapper xinhuCarmangMapper;

    /**
     * 查询车辆维修保养记录
     * 
     * @param id 车辆维修保养记录主键
     * @return 车辆维修保养记录
     */
    @Override
    public XinhuCarmang selectXinhuCarmangById(Long id)
    {
        return xinhuCarmangMapper.selectXinhuCarmangById(id);
    }

    /**
     * 查询车辆维修保养记录列表
     * 
     * @param xinhuCarmang 车辆维修保养记录
     * @return 车辆维修保养记录
     */
    @Override
    public List<XinhuCarmang> selectXinhuCarmangList(XinhuCarmang xinhuCarmang)
    {
        return xinhuCarmangMapper.selectXinhuCarmangList(xinhuCarmang);
    }

    /**
     * 新增车辆维修保养记录
     * 
     * @param xinhuCarmang 车辆维修保养记录
     * @return 结果
     */
    @Override
    public int insertXinhuCarmang(XinhuCarmang xinhuCarmang)
    {
        return xinhuCarmangMapper.insertXinhuCarmang(xinhuCarmang);
    }

    /**
     * 修改车辆维修保养记录
     * 
     * @param xinhuCarmang 车辆维修保养记录
     * @return 结果
     */
    @Override
    public int updateXinhuCarmang(XinhuCarmang xinhuCarmang)
    {
        return xinhuCarmangMapper.updateXinhuCarmang(xinhuCarmang);
    }

    /**
     * 批量删除车辆维修保养记录
     * 
     * @param ids 需要删除的车辆维修保养记录主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCarmangByIds(Long[] ids)
    {
        return xinhuCarmangMapper.deleteXinhuCarmangByIds(ids);
    }

    /**
     * 删除车辆维修保养记录信息
     * 
     * @param id 车辆维修保养记录主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCarmangById(Long id)
    {
        return xinhuCarmangMapper.deleteXinhuCarmangById(id);
    }
}
