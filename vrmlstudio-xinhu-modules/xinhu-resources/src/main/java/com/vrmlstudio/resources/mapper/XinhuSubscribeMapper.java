package com.vrmlstudio.resources.mapper;

import java.util.List;
import com.vrmlstudio.resources.domain.XinhuSubscribe;

/**
 * 订阅管理Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuSubscribeMapper 
{
    /**
     * 查询订阅管理
     * 
     * @param id 订阅管理主键
     * @return 订阅管理
     */
    public XinhuSubscribe selectXinhuSubscribeById(Long id);

    /**
     * 查询订阅管理列表
     * 
     * @param xinhuSubscribe 订阅管理
     * @return 订阅管理集合
     */
    public List<XinhuSubscribe> selectXinhuSubscribeList(XinhuSubscribe xinhuSubscribe);

    /**
     * 新增订阅管理
     * 
     * @param xinhuSubscribe 订阅管理
     * @return 结果
     */
    public int insertXinhuSubscribe(XinhuSubscribe xinhuSubscribe);

    /**
     * 修改订阅管理
     * 
     * @param xinhuSubscribe 订阅管理
     * @return 结果
     */
    public int updateXinhuSubscribe(XinhuSubscribe xinhuSubscribe);

    /**
     * 删除订阅管理
     * 
     * @param id 订阅管理主键
     * @return 结果
     */
    public int deleteXinhuSubscribeById(Long id);

    /**
     * 批量删除订阅管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuSubscribeByIds(Long[] ids);
}
