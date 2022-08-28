package com.vrmlstudio.person.service;

import java.util.List;
import com.vrmlstudio.person.domain.XinhuAreas;

/**
 * 区域表Service接口
 * 
 * @author VRer
 * @date 2022-03-09
 */
public interface IXinhuAreasService 
{
    /**
     * 查询区域表
     * 
     * @param id 区域表主键
     * @return 区域表
     */
    public XinhuAreas selectXinhuAreasById(Integer id);

    /**
     * 查询区域表列表
     * 
     * @param xinhuAreas 区域表
     * @return 区域表集合
     */
    public List<XinhuAreas> selectXinhuAreasList(XinhuAreas xinhuAreas);

    /**
     * 新增区域表
     * 
     * @param xinhuAreas 区域表
     * @return 结果
     */
    public int insertXinhuAreas(XinhuAreas xinhuAreas);

    /**
     * 修改区域表
     * 
     * @param xinhuAreas 区域表
     * @return 结果
     */
    public int updateXinhuAreas(XinhuAreas xinhuAreas);

    /**
     * 批量删除区域表
     * 
     * @param ids 需要删除的区域表主键集合
     * @return 结果
     */
    public int deleteXinhuAreasByIds(Integer[] ids);

    /**
     * 删除区域表信息
     * 
     * @param id 区域表主键
     * @return 结果
     */
    public int deleteXinhuAreasById(Integer id);
}
