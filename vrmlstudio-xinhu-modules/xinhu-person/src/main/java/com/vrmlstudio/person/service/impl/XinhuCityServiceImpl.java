package com.vrmlstudio.person.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.person.mapper.XinhuCityMapper;
import com.vrmlstudio.person.domain.XinhuCity;
import com.vrmlstudio.person.service.IXinhuCityService;

/**
 * 城市Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuCityServiceImpl implements IXinhuCityService 
{
    @Autowired
    private XinhuCityMapper xinhuCityMapper;

    /**
     * 查询城市
     * 
     * @param id 城市主键
     * @return 城市
     */
    @Override
    public XinhuCity selectXinhuCityById(Long id)
    {
        return xinhuCityMapper.selectXinhuCityById(id);
    }

    /**
     * 查询城市列表
     * 
     * @param xinhuCity 城市
     * @return 城市
     */
    @Override
    public List<XinhuCity> selectXinhuCityList(XinhuCity xinhuCity)
    {
        return xinhuCityMapper.selectXinhuCityList(xinhuCity);
    }

    /**
     * 新增城市
     * 
     * @param xinhuCity 城市
     * @return 结果
     */
    @Override
    public int insertXinhuCity(XinhuCity xinhuCity)
    {
        return xinhuCityMapper.insertXinhuCity(xinhuCity);
    }

    /**
     * 修改城市
     * 
     * @param xinhuCity 城市
     * @return 结果
     */
    @Override
    public int updateXinhuCity(XinhuCity xinhuCity)
    {
        return xinhuCityMapper.updateXinhuCity(xinhuCity);
    }

    /**
     * 批量删除城市
     * 
     * @param ids 需要删除的城市主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCityByIds(Long[] ids)
    {
        return xinhuCityMapper.deleteXinhuCityByIds(ids);
    }

    /**
     * 删除城市信息
     * 
     * @param id 城市主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCityById(Long id)
    {
        return xinhuCityMapper.deleteXinhuCityById(id);
    }
}
