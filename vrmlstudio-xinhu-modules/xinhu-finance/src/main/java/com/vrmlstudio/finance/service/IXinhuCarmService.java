package com.vrmlstudio.finance.service;

import java.util.List;
import com.vrmlstudio.finance.domain.XinhuCarm;

/**
 * 车辆Service接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface IXinhuCarmService 
{
    /**
     * 查询车辆
     * 
     * @param id 车辆主键
     * @return 车辆
     */
    public XinhuCarm selectXinhuCarmById(Long id);

    /**
     * 查询车辆列表
     * 
     * @param xinhuCarm 车辆
     * @return 车辆集合
     */
    public List<XinhuCarm> selectXinhuCarmList(XinhuCarm xinhuCarm);

    /**
     * 新增车辆
     * 
     * @param xinhuCarm 车辆
     * @return 结果
     */
    public int insertXinhuCarm(XinhuCarm xinhuCarm);

    /**
     * 修改车辆
     * 
     * @param xinhuCarm 车辆
     * @return 结果
     */
    public int updateXinhuCarm(XinhuCarm xinhuCarm);

    /**
     * 批量删除车辆
     * 
     * @param ids 需要删除的车辆主键集合
     * @return 结果
     */
    public int deleteXinhuCarmByIds(Long[] ids);

    /**
     * 删除车辆信息
     * 
     * @param id 车辆主键
     * @return 结果
     */
    public int deleteXinhuCarmById(Long id);
}
