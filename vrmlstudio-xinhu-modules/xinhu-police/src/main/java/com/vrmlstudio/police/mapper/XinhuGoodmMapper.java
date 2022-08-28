package com.vrmlstudio.police.mapper;

import java.util.List;
import com.vrmlstudio.police.domain.XinhuGoodm;

/**
 * 物品领用采购申请主Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuGoodmMapper 
{
    /**
     * 查询物品领用采购申请主
     * 
     * @param id 物品领用采购申请主主键
     * @return 物品领用采购申请主
     */
    public XinhuGoodm selectXinhuGoodmById(Long id);

    /**
     * 查询物品领用采购申请主列表
     * 
     * @param xinhuGoodm 物品领用采购申请主
     * @return 物品领用采购申请主集合
     */
    public List<XinhuGoodm> selectXinhuGoodmList(XinhuGoodm xinhuGoodm);

    /**
     * 新增物品领用采购申请主
     * 
     * @param xinhuGoodm 物品领用采购申请主
     * @return 结果
     */
    public int insertXinhuGoodm(XinhuGoodm xinhuGoodm);

    /**
     * 修改物品领用采购申请主
     * 
     * @param xinhuGoodm 物品领用采购申请主
     * @return 结果
     */
    public int updateXinhuGoodm(XinhuGoodm xinhuGoodm);

    /**
     * 删除物品领用采购申请主
     * 
     * @param id 物品领用采购申请主主键
     * @return 结果
     */
    public int deleteXinhuGoodmById(Long id);

    /**
     * 批量删除物品领用采购申请主
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuGoodmByIds(Long[] ids);
}
