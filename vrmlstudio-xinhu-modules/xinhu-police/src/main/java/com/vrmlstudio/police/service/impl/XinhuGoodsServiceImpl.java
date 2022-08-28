package com.vrmlstudio.police.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.police.mapper.XinhuGoodsMapper;
import com.vrmlstudio.police.domain.XinhuGoods;
import com.vrmlstudio.police.service.IXinhuGoodsService;

/**
 * 物品Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuGoodsServiceImpl implements IXinhuGoodsService 
{
    @Autowired
    private XinhuGoodsMapper xinhuGoodsMapper;

    /**
     * 查询物品
     * 
     * @param id 物品主键
     * @return 物品
     */
    @Override
    public XinhuGoods selectXinhuGoodsById(Long id)
    {
        return xinhuGoodsMapper.selectXinhuGoodsById(id);
    }

    /**
     * 查询物品列表
     * 
     * @param xinhuGoods 物品
     * @return 物品
     */
    @Override
    public List<XinhuGoods> selectXinhuGoodsList(XinhuGoods xinhuGoods)
    {
        return xinhuGoodsMapper.selectXinhuGoodsList(xinhuGoods);
    }

    /**
     * 新增物品
     * 
     * @param xinhuGoods 物品
     * @return 结果
     */
    @Override
    public int insertXinhuGoods(XinhuGoods xinhuGoods)
    {
        return xinhuGoodsMapper.insertXinhuGoods(xinhuGoods);
    }

    /**
     * 修改物品
     * 
     * @param xinhuGoods 物品
     * @return 结果
     */
    @Override
    public int updateXinhuGoods(XinhuGoods xinhuGoods)
    {
        return xinhuGoodsMapper.updateXinhuGoods(xinhuGoods);
    }

    /**
     * 批量删除物品
     * 
     * @param ids 需要删除的物品主键
     * @return 结果
     */
    @Override
    public int deleteXinhuGoodsByIds(Long[] ids)
    {
        return xinhuGoodsMapper.deleteXinhuGoodsByIds(ids);
    }

    /**
     * 删除物品信息
     * 
     * @param id 物品主键
     * @return 结果
     */
    @Override
    public int deleteXinhuGoodsById(Long id)
    {
        return xinhuGoodsMapper.deleteXinhuGoodsById(id);
    }
}
