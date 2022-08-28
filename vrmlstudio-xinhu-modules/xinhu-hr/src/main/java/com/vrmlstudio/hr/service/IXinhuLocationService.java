package com.vrmlstudio.hr.service;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuLocation;

/**
 * 外勤定位Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuLocationService 
{
    /**
     * 查询外勤定位
     * 
     * @param id 外勤定位主键
     * @return 外勤定位
     */
    public XinhuLocation selectXinhuLocationById(Long id);

    /**
     * 查询外勤定位列表
     * 
     * @param xinhuLocation 外勤定位
     * @return 外勤定位集合
     */
    public List<XinhuLocation> selectXinhuLocationList(XinhuLocation xinhuLocation);

    /**
     * 新增外勤定位
     * 
     * @param xinhuLocation 外勤定位
     * @return 结果
     */
    public int insertXinhuLocation(XinhuLocation xinhuLocation);

    /**
     * 修改外勤定位
     * 
     * @param xinhuLocation 外勤定位
     * @return 结果
     */
    public int updateXinhuLocation(XinhuLocation xinhuLocation);

    /**
     * 批量删除外勤定位
     * 
     * @param ids 需要删除的外勤定位主键集合
     * @return 结果
     */
    public int deleteXinhuLocationByIds(Long[] ids);

    /**
     * 删除外勤定位信息
     * 
     * @param id 外勤定位主键
     * @return 结果
     */
    public int deleteXinhuLocationById(Long id);
}
