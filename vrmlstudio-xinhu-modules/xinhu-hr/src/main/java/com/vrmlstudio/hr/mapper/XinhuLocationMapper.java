package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuLocation;

/**
 * 外勤定位Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuLocationMapper 
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
     * 删除外勤定位
     * 
     * @param id 外勤定位主键
     * @return 结果
     */
    public int deleteXinhuLocationById(Long id);

    /**
     * 批量删除外勤定位
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuLocationByIds(Long[] ids);
}
