package com.vrmlstudio.police.mapper;

import java.util.List;
import com.vrmlstudio.police.domain.XinhuGoods;

/**
 * 物品Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuGoodsMapper 
{
    /**
     * 查询物品
     * 
     * @param id 物品主键
     * @return 物品
     */
    public XinhuGoods selectXinhuGoodsById(Long id);

    /**
     * 查询物品列表
     * 
     * @param xinhuGoods 物品
     * @return 物品集合
     */
    public List<XinhuGoods> selectXinhuGoodsList(XinhuGoods xinhuGoods);

    /**
     * 新增物品
     * 
     * @param xinhuGoods 物品
     * @return 结果
     */
    public int insertXinhuGoods(XinhuGoods xinhuGoods);

    /**
     * 修改物品
     * 
     * @param xinhuGoods 物品
     * @return 结果
     */
    public int updateXinhuGoods(XinhuGoods xinhuGoods);

    /**
     * 删除物品
     * 
     * @param id 物品主键
     * @return 结果
     */
    public int deleteXinhuGoodsById(Long id);

    /**
     * 批量删除物品
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuGoodsByIds(Long[] ids);
}
