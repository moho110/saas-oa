package com.vrmlstudio.police.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.police.mapper.XinhuRepairMapper;
import com.vrmlstudio.police.domain.XinhuRepair;
import com.vrmlstudio.police.service.IXinhuRepairService;

/**
 * 维修报修Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuRepairServiceImpl implements IXinhuRepairService 
{
    @Autowired
    private XinhuRepairMapper xinhuRepairMapper;

    /**
     * 查询维修报修
     * 
     * @param id 维修报修主键
     * @return 维修报修
     */
    @Override
    public XinhuRepair selectXinhuRepairById(Long id)
    {
        return xinhuRepairMapper.selectXinhuRepairById(id);
    }

    /**
     * 查询维修报修列表
     * 
     * @param xinhuRepair 维修报修
     * @return 维修报修
     */
    @Override
    public List<XinhuRepair> selectXinhuRepairList(XinhuRepair xinhuRepair)
    {
        return xinhuRepairMapper.selectXinhuRepairList(xinhuRepair);
    }

    /**
     * 新增维修报修
     * 
     * @param xinhuRepair 维修报修
     * @return 结果
     */
    @Override
    public int insertXinhuRepair(XinhuRepair xinhuRepair)
    {
        return xinhuRepairMapper.insertXinhuRepair(xinhuRepair);
    }

    /**
     * 修改维修报修
     * 
     * @param xinhuRepair 维修报修
     * @return 结果
     */
    @Override
    public int updateXinhuRepair(XinhuRepair xinhuRepair)
    {
        return xinhuRepairMapper.updateXinhuRepair(xinhuRepair);
    }

    /**
     * 批量删除维修报修
     * 
     * @param ids 需要删除的维修报修主键
     * @return 结果
     */
    @Override
    public int deleteXinhuRepairByIds(Long[] ids)
    {
        return xinhuRepairMapper.deleteXinhuRepairByIds(ids);
    }

    /**
     * 删除维修报修信息
     * 
     * @param id 维修报修主键
     * @return 结果
     */
    @Override
    public int deleteXinhuRepairById(Long id)
    {
        return xinhuRepairMapper.deleteXinhuRepairById(id);
    }
}
