package com.vrmlstudio.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.XinhuChargemsMapper;
import com.vrmlstudio.xsystem.domain.XinhuChargems;
import com.vrmlstudio.xsystem.service.IXinhuChargemsService;

/**
 * 系统升级Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuChargemsServiceImpl implements IXinhuChargemsService 
{
    @Autowired
    private XinhuChargemsMapper xinhuChargemsMapper;

    /**
     * 查询系统升级
     * 
     * @param id 系统升级主键
     * @return 系统升级
     */
    @Override
    public XinhuChargems selectXinhuChargemsById(Long id)
    {
        return xinhuChargemsMapper.selectXinhuChargemsById(id);
    }

    /**
     * 查询系统升级列表
     * 
     * @param xinhuChargems 系统升级
     * @return 系统升级
     */
    @Override
    public List<XinhuChargems> selectXinhuChargemsList(XinhuChargems xinhuChargems)
    {
        return xinhuChargemsMapper.selectXinhuChargemsList(xinhuChargems);
    }

    /**
     * 新增系统升级
     * 
     * @param xinhuChargems 系统升级
     * @return 结果
     */
    @Override
    public int insertXinhuChargems(XinhuChargems xinhuChargems)
    {
        return xinhuChargemsMapper.insertXinhuChargems(xinhuChargems);
    }

    /**
     * 修改系统升级
     * 
     * @param xinhuChargems 系统升级
     * @return 结果
     */
    @Override
    public int updateXinhuChargems(XinhuChargems xinhuChargems)
    {
        return xinhuChargemsMapper.updateXinhuChargems(xinhuChargems);
    }

    /**
     * 批量删除系统升级
     * 
     * @param ids 需要删除的系统升级主键
     * @return 结果
     */
    @Override
    public int deleteXinhuChargemsByIds(Long[] ids)
    {
        return xinhuChargemsMapper.deleteXinhuChargemsByIds(ids);
    }

    /**
     * 删除系统升级信息
     * 
     * @param id 系统升级主键
     * @return 结果
     */
    @Override
    public int deleteXinhuChargemsById(Long id)
    {
        return xinhuChargemsMapper.deleteXinhuChargemsById(id);
    }
}
