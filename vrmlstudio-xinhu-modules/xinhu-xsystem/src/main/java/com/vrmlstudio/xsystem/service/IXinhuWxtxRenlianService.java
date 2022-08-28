package com.vrmlstudio.xsystem.service;

import java.util.List;
import com.vrmlstudio.xsystem.domain.XinhuWxtxRenlian;

/**
 * 人脸识别Service接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface IXinhuWxtxRenlianService 
{
    /**
     * 查询人脸识别
     * 
     * @param id 人脸识别主键
     * @return 人脸识别
     */
    public XinhuWxtxRenlian selectXinhuWxtxRenlianById(Long id);

    /**
     * 查询人脸识别列表
     * 
     * @param xinhuWxtxRenlian 人脸识别
     * @return 人脸识别集合
     */
    public List<XinhuWxtxRenlian> selectXinhuWxtxRenlianList(XinhuWxtxRenlian xinhuWxtxRenlian);

    /**
     * 新增人脸识别
     * 
     * @param xinhuWxtxRenlian 人脸识别
     * @return 结果
     */
    public int insertXinhuWxtxRenlian(XinhuWxtxRenlian xinhuWxtxRenlian);

    /**
     * 修改人脸识别
     * 
     * @param xinhuWxtxRenlian 人脸识别
     * @return 结果
     */
    public int updateXinhuWxtxRenlian(XinhuWxtxRenlian xinhuWxtxRenlian);

    /**
     * 批量删除人脸识别
     * 
     * @param ids 需要删除的人脸识别主键集合
     * @return 结果
     */
    public int deleteXinhuWxtxRenlianByIds(Long[] ids);

    /**
     * 删除人脸识别信息
     * 
     * @param id 人脸识别主键
     * @return 结果
     */
    public int deleteXinhuWxtxRenlianById(Long id);
}
