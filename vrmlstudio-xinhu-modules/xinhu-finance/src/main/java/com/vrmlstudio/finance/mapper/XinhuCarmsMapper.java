package com.vrmlstudio.finance.mapper;

import java.util.List;
import com.vrmlstudio.finance.domain.XinhuCarms;

/**
 * 车辆信息登记Mapper接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface XinhuCarmsMapper 
{
    /**
     * 查询车辆信息登记
     * 
     * @param id 车辆信息登记主键
     * @return 车辆信息登记
     */
    public XinhuCarms selectXinhuCarmsById(Long id);

    /**
     * 查询车辆信息登记列表
     * 
     * @param xinhuCarms 车辆信息登记
     * @return 车辆信息登记集合
     */
    public List<XinhuCarms> selectXinhuCarmsList(XinhuCarms xinhuCarms);

    /**
     * 新增车辆信息登记
     * 
     * @param xinhuCarms 车辆信息登记
     * @return 结果
     */
    public int insertXinhuCarms(XinhuCarms xinhuCarms);

    /**
     * 修改车辆信息登记
     * 
     * @param xinhuCarms 车辆信息登记
     * @return 结果
     */
    public int updateXinhuCarms(XinhuCarms xinhuCarms);

    /**
     * 删除车辆信息登记
     * 
     * @param id 车辆信息登记主键
     * @return 结果
     */
    public int deleteXinhuCarmsById(Long id);

    /**
     * 批量删除车辆信息登记
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuCarmsByIds(Long[] ids);
}
