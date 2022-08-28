package com.vrmlstudio.police.mapper;

import java.util.List;
import com.vrmlstudio.police.domain.XinhuRepair;

/**
 * 维修报修Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuRepairMapper 
{
    /**
     * 查询维修报修
     * 
     * @param id 维修报修主键
     * @return 维修报修
     */
    public XinhuRepair selectXinhuRepairById(Long id);

    /**
     * 查询维修报修列表
     * 
     * @param xinhuRepair 维修报修
     * @return 维修报修集合
     */
    public List<XinhuRepair> selectXinhuRepairList(XinhuRepair xinhuRepair);

    /**
     * 新增维修报修
     * 
     * @param xinhuRepair 维修报修
     * @return 结果
     */
    public int insertXinhuRepair(XinhuRepair xinhuRepair);

    /**
     * 修改维修报修
     * 
     * @param xinhuRepair 维修报修
     * @return 结果
     */
    public int updateXinhuRepair(XinhuRepair xinhuRepair);

    /**
     * 删除维修报修
     * 
     * @param id 维修报修主键
     * @return 结果
     */
    public int deleteXinhuRepairById(Long id);

    /**
     * 批量删除维修报修
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuRepairByIds(Long[] ids);
}
