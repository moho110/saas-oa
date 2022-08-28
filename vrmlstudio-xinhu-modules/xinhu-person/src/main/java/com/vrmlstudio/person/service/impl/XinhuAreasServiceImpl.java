package com.vrmlstudio.person.service.impl;

import java.util.List;
import com.vrmlstudio.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.person.mapper.XinhuAreasMapper;
import com.vrmlstudio.person.domain.XinhuAreas;
import com.vrmlstudio.person.service.IXinhuAreasService;

/**
 * 区域表Service业务层处理
 * 
 * @author VRer
 * @date 2022-03-09
 */
@Service
public class XinhuAreasServiceImpl implements IXinhuAreasService 
{
    @Autowired(required = false)
    private XinhuAreasMapper xinhuAreasMapper;

    /**
     * 查询区域表
     * 
     * @param id 区域表主键
     * @return 区域表
     */
    @Override
    public XinhuAreas selectXinhuAreasById(Integer id)
    {
        return xinhuAreasMapper.selectXinhuAreasById(id);
    }

    /**
     * 查询区域表列表
     * 
     * @param xinhuAreas 区域表
     * @return 区域表
     */
    @Override
    public List<XinhuAreas> selectXinhuAreasList(XinhuAreas xinhuAreas)
    {
        return xinhuAreasMapper.selectXinhuAreasList(xinhuAreas);
    }

    /**
     * 新增区域表
     * 
     * @param xinhuAreas 区域表
     * @return 结果
     */
    @Override
    public int insertXinhuAreas(XinhuAreas xinhuAreas)
    {
        xinhuAreas.setCreateTime(DateUtils.getNowDate());
        return xinhuAreasMapper.insertXinhuAreas(xinhuAreas);
    }

    /**
     * 修改区域表
     * 
     * @param xinhuAreas 区域表
     * @return 结果
     */
    @Override
    public int updateXinhuAreas(XinhuAreas xinhuAreas)
    {
        return xinhuAreasMapper.updateXinhuAreas(xinhuAreas);
    }

    /**
     * 批量删除区域表
     * 
     * @param ids 需要删除的区域表主键
     * @return 结果
     */
    @Override
    public int deleteXinhuAreasByIds(Integer[] ids)
    {
        return xinhuAreasMapper.deleteXinhuAreasByIds(ids);
    }

    /**
     * 删除区域表信息
     * 
     * @param id 区域表主键
     * @return 结果
     */
    @Override
    public int deleteXinhuAreasById(Integer id)
    {
        return xinhuAreasMapper.deleteXinhuAreasById(id);
    }
}
