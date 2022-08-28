package com.vrmlstudio.police.service;

import java.util.List;
import com.vrmlstudio.police.domain.XinhuRepair;

/**
 * 维修报修Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuRepairService 
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
     * 批量删除维修报修
     * 
     * @param ids 需要删除的维修报修主键集合
     * @return 结果
     */
    public int deleteXinhuRepairByIds(Long[] ids);

    /**
     * 删除维修报修信息
     * 
     * @param id 维修报修主键
     * @return 结果
     */
    public int deleteXinhuRepairById(Long id);
}
