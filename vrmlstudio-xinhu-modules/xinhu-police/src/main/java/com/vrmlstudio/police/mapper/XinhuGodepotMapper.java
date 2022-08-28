package com.vrmlstudio.police.mapper;

import java.util.List;
import com.vrmlstudio.police.domain.XinhuGodepot;

/**
 * 物品仓库Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuGodepotMapper 
{
    /**
     * 查询物品仓库
     * 
     * @param id 物品仓库主键
     * @return 物品仓库
     */
    public XinhuGodepot selectXinhuGodepotById(Long id);

    /**
     * 查询物品仓库列表
     * 
     * @param xinhuGodepot 物品仓库
     * @return 物品仓库集合
     */
    public List<XinhuGodepot> selectXinhuGodepotList(XinhuGodepot xinhuGodepot);

    /**
     * 新增物品仓库
     * 
     * @param xinhuGodepot 物品仓库
     * @return 结果
     */
    public int insertXinhuGodepot(XinhuGodepot xinhuGodepot);

    /**
     * 修改物品仓库
     * 
     * @param xinhuGodepot 物品仓库
     * @return 结果
     */
    public int updateXinhuGodepot(XinhuGodepot xinhuGodepot);

    /**
     * 删除物品仓库
     * 
     * @param id 物品仓库主键
     * @return 结果
     */
    public int deleteXinhuGodepotById(Long id);

    /**
     * 批量删除物品仓库
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuGodepotByIds(Long[] ids);
}
