package com.vrmlstudio.police.mapper;

import java.util.List;
import com.vrmlstudio.police.domain.XinhuGoodn;

/**
 * 物品库存详细Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuGoodnMapper 
{
    /**
     * 查询物品库存详细
     * 
     * @param id 物品库存详细主键
     * @return 物品库存详细
     */
    public XinhuGoodn selectXinhuGoodnById(Long id);

    /**
     * 查询物品库存详细列表
     * 
     * @param xinhuGoodn 物品库存详细
     * @return 物品库存详细集合
     */
    public List<XinhuGoodn> selectXinhuGoodnList(XinhuGoodn xinhuGoodn);

    /**
     * 新增物品库存详细
     * 
     * @param xinhuGoodn 物品库存详细
     * @return 结果
     */
    public int insertXinhuGoodn(XinhuGoodn xinhuGoodn);

    /**
     * 修改物品库存详细
     * 
     * @param xinhuGoodn 物品库存详细
     * @return 结果
     */
    public int updateXinhuGoodn(XinhuGoodn xinhuGoodn);

    /**
     * 删除物品库存详细
     * 
     * @param id 物品库存详细主键
     * @return 结果
     */
    public int deleteXinhuGoodnById(Long id);

    /**
     * 批量删除物品库存详细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuGoodnByIds(Long[] ids);
}
