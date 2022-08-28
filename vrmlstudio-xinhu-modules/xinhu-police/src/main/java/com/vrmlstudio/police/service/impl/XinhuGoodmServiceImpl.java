package com.vrmlstudio.police.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.police.mapper.XinhuGoodmMapper;
import com.vrmlstudio.police.domain.XinhuGoodm;
import com.vrmlstudio.police.service.IXinhuGoodmService;

/**
 * 物品领用采购申请主Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuGoodmServiceImpl implements IXinhuGoodmService 
{
    @Autowired
    private XinhuGoodmMapper xinhuGoodmMapper;

    /**
     * 查询物品领用采购申请主
     * 
     * @param id 物品领用采购申请主主键
     * @return 物品领用采购申请主
     */
    @Override
    public XinhuGoodm selectXinhuGoodmById(Long id)
    {
        return xinhuGoodmMapper.selectXinhuGoodmById(id);
    }

    /**
     * 查询物品领用采购申请主列表
     * 
     * @param xinhuGoodm 物品领用采购申请主
     * @return 物品领用采购申请主
     */
    @Override
    public List<XinhuGoodm> selectXinhuGoodmList(XinhuGoodm xinhuGoodm)
    {
        return xinhuGoodmMapper.selectXinhuGoodmList(xinhuGoodm);
    }

    /**
     * 新增物品领用采购申请主
     * 
     * @param xinhuGoodm 物品领用采购申请主
     * @return 结果
     */
    @Override
    public int insertXinhuGoodm(XinhuGoodm xinhuGoodm)
    {
        return xinhuGoodmMapper.insertXinhuGoodm(xinhuGoodm);
    }

    /**
     * 修改物品领用采购申请主
     * 
     * @param xinhuGoodm 物品领用采购申请主
     * @return 结果
     */
    @Override
    public int updateXinhuGoodm(XinhuGoodm xinhuGoodm)
    {
        return xinhuGoodmMapper.updateXinhuGoodm(xinhuGoodm);
    }

    /**
     * 批量删除物品领用采购申请主
     * 
     * @param ids 需要删除的物品领用采购申请主主键
     * @return 结果
     */
    @Override
    public int deleteXinhuGoodmByIds(Long[] ids)
    {
        return xinhuGoodmMapper.deleteXinhuGoodmByIds(ids);
    }

    /**
     * 删除物品领用采购申请主信息
     * 
     * @param id 物品领用采购申请主主键
     * @return 结果
     */
    @Override
    public int deleteXinhuGoodmById(Long id)
    {
        return xinhuGoodmMapper.deleteXinhuGoodmById(id);
    }
}
