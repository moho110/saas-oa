package com.vrmlstudio.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.XinhuWxtxRenlianMapper;
import com.vrmlstudio.xsystem.domain.XinhuWxtxRenlian;
import com.vrmlstudio.xsystem.service.IXinhuWxtxRenlianService;

/**
 * 人脸识别Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuWxtxRenlianServiceImpl implements IXinhuWxtxRenlianService 
{
    @Autowired
    private XinhuWxtxRenlianMapper xinhuWxtxRenlianMapper;

    /**
     * 查询人脸识别
     * 
     * @param id 人脸识别主键
     * @return 人脸识别
     */
    @Override
    public XinhuWxtxRenlian selectXinhuWxtxRenlianById(Long id)
    {
        return xinhuWxtxRenlianMapper.selectXinhuWxtxRenlianById(id);
    }

    /**
     * 查询人脸识别列表
     * 
     * @param xinhuWxtxRenlian 人脸识别
     * @return 人脸识别
     */
    @Override
    public List<XinhuWxtxRenlian> selectXinhuWxtxRenlianList(XinhuWxtxRenlian xinhuWxtxRenlian)
    {
        return xinhuWxtxRenlianMapper.selectXinhuWxtxRenlianList(xinhuWxtxRenlian);
    }

    /**
     * 新增人脸识别
     * 
     * @param xinhuWxtxRenlian 人脸识别
     * @return 结果
     */
    @Override
    public int insertXinhuWxtxRenlian(XinhuWxtxRenlian xinhuWxtxRenlian)
    {
        return xinhuWxtxRenlianMapper.insertXinhuWxtxRenlian(xinhuWxtxRenlian);
    }

    /**
     * 修改人脸识别
     * 
     * @param xinhuWxtxRenlian 人脸识别
     * @return 结果
     */
    @Override
    public int updateXinhuWxtxRenlian(XinhuWxtxRenlian xinhuWxtxRenlian)
    {
        return xinhuWxtxRenlianMapper.updateXinhuWxtxRenlian(xinhuWxtxRenlian);
    }

    /**
     * 批量删除人脸识别
     * 
     * @param ids 需要删除的人脸识别主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWxtxRenlianByIds(Long[] ids)
    {
        return xinhuWxtxRenlianMapper.deleteXinhuWxtxRenlianByIds(ids);
    }

    /**
     * 删除人脸识别信息
     * 
     * @param id 人脸识别主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWxtxRenlianById(Long id)
    {
        return xinhuWxtxRenlianMapper.deleteXinhuWxtxRenlianById(id);
    }
}
