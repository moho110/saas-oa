package com.vrmlstudio.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.finance.mapper.XinhuCarmMapper;
import com.vrmlstudio.finance.domain.XinhuCarm;
import com.vrmlstudio.finance.service.IXinhuCarmService;

/**
 * 车辆Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuCarmServiceImpl implements IXinhuCarmService 
{
    @Autowired
    private XinhuCarmMapper xinhuCarmMapper;

    /**
     * 查询车辆
     * 
     * @param id 车辆主键
     * @return 车辆
     */
    @Override
    public XinhuCarm selectXinhuCarmById(Long id)
    {
        return xinhuCarmMapper.selectXinhuCarmById(id);
    }

    /**
     * 查询车辆列表
     * 
     * @param xinhuCarm 车辆
     * @return 车辆
     */
    @Override
    public List<XinhuCarm> selectXinhuCarmList(XinhuCarm xinhuCarm)
    {
        return xinhuCarmMapper.selectXinhuCarmList(xinhuCarm);
    }

    /**
     * 新增车辆
     * 
     * @param xinhuCarm 车辆
     * @return 结果
     */
    @Override
    public int insertXinhuCarm(XinhuCarm xinhuCarm)
    {
        return xinhuCarmMapper.insertXinhuCarm(xinhuCarm);
    }

    /**
     * 修改车辆
     * 
     * @param xinhuCarm 车辆
     * @return 结果
     */
    @Override
    public int updateXinhuCarm(XinhuCarm xinhuCarm)
    {
        return xinhuCarmMapper.updateXinhuCarm(xinhuCarm);
    }

    /**
     * 批量删除车辆
     * 
     * @param ids 需要删除的车辆主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCarmByIds(Long[] ids)
    {
        return xinhuCarmMapper.deleteXinhuCarmByIds(ids);
    }

    /**
     * 删除车辆信息
     * 
     * @param id 车辆主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCarmById(Long id)
    {
        return xinhuCarmMapper.deleteXinhuCarmById(id);
    }
}
