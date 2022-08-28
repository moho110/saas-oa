package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuLocation;
import com.vrmlstudio.hr.mapper.XinhuLocationMapper;
import com.vrmlstudio.hr.service.IXinhuLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 外勤定位Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuLocationServiceImpl implements IXinhuLocationService
{
    @Autowired
    private XinhuLocationMapper xinhuLocationMapper;

    /**
     * 查询外勤定位
     * 
     * @param id 外勤定位主键
     * @return 外勤定位
     */
    @Override
    public XinhuLocation selectXinhuLocationById(Long id)
    {
        return xinhuLocationMapper.selectXinhuLocationById(id);
    }

    /**
     * 查询外勤定位列表
     * 
     * @param xinhuLocation 外勤定位
     * @return 外勤定位
     */
    @Override
    public List<XinhuLocation> selectXinhuLocationList(XinhuLocation xinhuLocation)
    {
        return xinhuLocationMapper.selectXinhuLocationList(xinhuLocation);
    }

    /**
     * 新增外勤定位
     * 
     * @param xinhuLocation 外勤定位
     * @return 结果
     */
    @Override
    public int insertXinhuLocation(XinhuLocation xinhuLocation)
    {
        return xinhuLocationMapper.insertXinhuLocation(xinhuLocation);
    }

    /**
     * 修改外勤定位
     * 
     * @param xinhuLocation 外勤定位
     * @return 结果
     */
    @Override
    public int updateXinhuLocation(XinhuLocation xinhuLocation)
    {
        return xinhuLocationMapper.updateXinhuLocation(xinhuLocation);
    }

    /**
     * 批量删除外勤定位
     * 
     * @param ids 需要删除的外勤定位主键
     * @return 结果
     */
    @Override
    public int deleteXinhuLocationByIds(Long[] ids)
    {
        return xinhuLocationMapper.deleteXinhuLocationByIds(ids);
    }

    /**
     * 删除外勤定位信息
     * 
     * @param id 外勤定位主键
     * @return 结果
     */
    @Override
    public int deleteXinhuLocationById(Long id)
    {
        return xinhuLocationMapper.deleteXinhuLocationById(id);
    }
}
