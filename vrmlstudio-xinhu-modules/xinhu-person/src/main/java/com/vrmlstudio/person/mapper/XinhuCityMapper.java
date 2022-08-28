package com.vrmlstudio.person.mapper;

import java.util.List;
import com.vrmlstudio.person.domain.XinhuCity;

/**
 * 城市Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuCityMapper 
{
    /**
     * 查询城市
     * 
     * @param id 城市主键
     * @return 城市
     */
    public XinhuCity selectXinhuCityById(Long id);

    /**
     * 查询城市列表
     * 
     * @param xinhuCity 城市
     * @return 城市集合
     */
    public List<XinhuCity> selectXinhuCityList(XinhuCity xinhuCity);

    /**
     * 新增城市
     * 
     * @param xinhuCity 城市
     * @return 结果
     */
    public int insertXinhuCity(XinhuCity xinhuCity);

    /**
     * 修改城市
     * 
     * @param xinhuCity 城市
     * @return 结果
     */
    public int updateXinhuCity(XinhuCity xinhuCity);

    /**
     * 删除城市
     * 
     * @param id 城市主键
     * @return 结果
     */
    public int deleteXinhuCityById(Long id);

    /**
     * 批量删除城市
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuCityByIds(Long[] ids);
}
