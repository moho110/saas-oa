package com.vrmlstudio.police.service;

import java.util.List;
import com.vrmlstudio.police.domain.XinhuGoodss;

/**
 * 物品库存详细Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuGoodssService 
{
    /**
     * 查询物品库存详细
     * 
     * @param id 物品库存详细主键
     * @return 物品库存详细
     */
    public XinhuGoodss selectXinhuGoodssById(Long id);

    /**
     * 查询物品库存详细列表
     * 
     * @param xinhuGoodss 物品库存详细
     * @return 物品库存详细集合
     */
    public List<XinhuGoodss> selectXinhuGoodssList(XinhuGoodss xinhuGoodss);

    /**
     * 新增物品库存详细
     * 
     * @param xinhuGoodss 物品库存详细
     * @return 结果
     */
    public int insertXinhuGoodss(XinhuGoodss xinhuGoodss);

    /**
     * 修改物品库存详细
     * 
     * @param xinhuGoodss 物品库存详细
     * @return 结果
     */
    public int updateXinhuGoodss(XinhuGoodss xinhuGoodss);

    /**
     * 批量删除物品库存详细
     * 
     * @param ids 需要删除的物品库存详细主键集合
     * @return 结果
     */
    public int deleteXinhuGoodssByIds(Long[] ids);

    /**
     * 删除物品库存详细信息
     * 
     * @param id 物品库存详细主键
     * @return 结果
     */
    public int deleteXinhuGoodssById(Long id);
}
