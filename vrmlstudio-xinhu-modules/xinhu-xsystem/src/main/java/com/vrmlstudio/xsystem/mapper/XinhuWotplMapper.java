package com.vrmlstudio.xsystem.mapper;

import java.util.List;
import com.vrmlstudio.xsystem.domain.XinhuWotpl;

/**
 * 微信公众号消息模版Mapper接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface XinhuWotplMapper 
{
    /**
     * 查询微信公众号消息模版
     * 
     * @param id 微信公众号消息模版主键
     * @return 微信公众号消息模版
     */
    public XinhuWotpl selectXinhuWotplById(Long id);

    /**
     * 查询微信公众号消息模版列表
     * 
     * @param xinhuWotpl 微信公众号消息模版
     * @return 微信公众号消息模版集合
     */
    public List<XinhuWotpl> selectXinhuWotplList(XinhuWotpl xinhuWotpl);

    /**
     * 新增微信公众号消息模版
     * 
     * @param xinhuWotpl 微信公众号消息模版
     * @return 结果
     */
    public int insertXinhuWotpl(XinhuWotpl xinhuWotpl);

    /**
     * 修改微信公众号消息模版
     * 
     * @param xinhuWotpl 微信公众号消息模版
     * @return 结果
     */
    public int updateXinhuWotpl(XinhuWotpl xinhuWotpl);

    /**
     * 删除微信公众号消息模版
     * 
     * @param id 微信公众号消息模版主键
     * @return 结果
     */
    public int deleteXinhuWotplById(Long id);

    /**
     * 批量删除微信公众号消息模版
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuWotplByIds(Long[] ids);
}
