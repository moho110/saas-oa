package com.vrmlstudio.police.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.police.mapper.XinhuGoodssMapper;
import com.vrmlstudio.police.domain.XinhuGoodss;
import com.vrmlstudio.police.service.IXinhuGoodssService;

/**
 * 物品库存详细Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuGoodssServiceImpl implements IXinhuGoodssService 
{
    @Autowired
    private XinhuGoodssMapper xinhuGoodssMapper;

    /**
     * 查询物品库存详细
     * 
     * @param id 物品库存详细主键
     * @return 物品库存详细
     */
    @Override
    public XinhuGoodss selectXinhuGoodssById(Long id)
    {
        return xinhuGoodssMapper.selectXinhuGoodssById(id);
    }

    /**
     * 查询物品库存详细列表
     * 
     * @param xinhuGoodss 物品库存详细
     * @return 物品库存详细
     */
    @Override
    public List<XinhuGoodss> selectXinhuGoodssList(XinhuGoodss xinhuGoodss)
    {
        return xinhuGoodssMapper.selectXinhuGoodssList(xinhuGoodss);
    }

    /**
     * 新增物品库存详细
     * 
     * @param xinhuGoodss 物品库存详细
     * @return 结果
     */
    @Override
    public int insertXinhuGoodss(XinhuGoodss xinhuGoodss)
    {
        return xinhuGoodssMapper.insertXinhuGoodss(xinhuGoodss);
    }

    /**
     * 修改物品库存详细
     * 
     * @param xinhuGoodss 物品库存详细
     * @return 结果
     */
    @Override
    public int updateXinhuGoodss(XinhuGoodss xinhuGoodss)
    {
        return xinhuGoodssMapper.updateXinhuGoodss(xinhuGoodss);
    }

    /**
     * 批量删除物品库存详细
     * 
     * @param ids 需要删除的物品库存详细主键
     * @return 结果
     */
    @Override
    public int deleteXinhuGoodssByIds(Long[] ids)
    {
        return xinhuGoodssMapper.deleteXinhuGoodssByIds(ids);
    }

    /**
     * 删除物品库存详细信息
     * 
     * @param id 物品库存详细主键
     * @return 结果
     */
    @Override
    public int deleteXinhuGoodssById(Long id)
    {
        return xinhuGoodssMapper.deleteXinhuGoodssById(id);
    }
}
