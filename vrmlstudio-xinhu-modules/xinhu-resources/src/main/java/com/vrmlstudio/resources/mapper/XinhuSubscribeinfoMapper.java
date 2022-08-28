package com.vrmlstudio.resources.mapper;

import java.util.List;
import com.vrmlstudio.resources.domain.XinhuSubscribeinfo;

/**
 * 订阅内容信息Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuSubscribeinfoMapper 
{
    /**
     * 查询订阅内容信息
     * 
     * @param id 订阅内容信息主键
     * @return 订阅内容信息
     */
    public XinhuSubscribeinfo selectXinhuSubscribeinfoById(Long id);

    /**
     * 查询订阅内容信息列表
     * 
     * @param xinhuSubscribeinfo 订阅内容信息
     * @return 订阅内容信息集合
     */
    public List<XinhuSubscribeinfo> selectXinhuSubscribeinfoList(XinhuSubscribeinfo xinhuSubscribeinfo);

    /**
     * 新增订阅内容信息
     * 
     * @param xinhuSubscribeinfo 订阅内容信息
     * @return 结果
     */
    public int insertXinhuSubscribeinfo(XinhuSubscribeinfo xinhuSubscribeinfo);

    /**
     * 修改订阅内容信息
     * 
     * @param xinhuSubscribeinfo 订阅内容信息
     * @return 结果
     */
    public int updateXinhuSubscribeinfo(XinhuSubscribeinfo xinhuSubscribeinfo);

    /**
     * 删除订阅内容信息
     * 
     * @param id 订阅内容信息主键
     * @return 结果
     */
    public int deleteXinhuSubscribeinfoById(Long id);

    /**
     * 批量删除订阅内容信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuSubscribeinfoByIds(Long[] ids);
}
