package com.vrmlstudio.xsystem.mapper;

import java.util.List;
import com.vrmlstudio.xsystem.domain.XinhuChargems;

/**
 * 系统升级Mapper接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface XinhuChargemsMapper 
{
    /**
     * 查询系统升级
     * 
     * @param id 系统升级主键
     * @return 系统升级
     */
    public XinhuChargems selectXinhuChargemsById(Long id);

    /**
     * 查询系统升级列表
     * 
     * @param xinhuChargems 系统升级
     * @return 系统升级集合
     */
    public List<XinhuChargems> selectXinhuChargemsList(XinhuChargems xinhuChargems);

    /**
     * 新增系统升级
     * 
     * @param xinhuChargems 系统升级
     * @return 结果
     */
    public int insertXinhuChargems(XinhuChargems xinhuChargems);

    /**
     * 修改系统升级
     * 
     * @param xinhuChargems 系统升级
     * @return 结果
     */
    public int updateXinhuChargems(XinhuChargems xinhuChargems);

    /**
     * 删除系统升级
     * 
     * @param id 系统升级主键
     * @return 结果
     */
    public int deleteXinhuChargemsById(Long id);

    /**
     * 批量删除系统升级
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuChargemsByIds(Long[] ids);
}
