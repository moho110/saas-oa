package com.vrmlstudio.xsystem.service;

import java.util.List;
import com.vrmlstudio.xsystem.domain.XinhuWouser;

/**
 * 微信用户信息Service接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface IXinhuWouserService 
{
    /**
     * 查询微信用户信息
     * 
     * @param id 微信用户信息主键
     * @return 微信用户信息
     */
    public XinhuWouser selectXinhuWouserById(Long id);

    /**
     * 查询微信用户信息列表
     * 
     * @param xinhuWouser 微信用户信息
     * @return 微信用户信息集合
     */
    public List<XinhuWouser> selectXinhuWouserList(XinhuWouser xinhuWouser);

    /**
     * 新增微信用户信息
     * 
     * @param xinhuWouser 微信用户信息
     * @return 结果
     */
    public int insertXinhuWouser(XinhuWouser xinhuWouser);

    /**
     * 修改微信用户信息
     * 
     * @param xinhuWouser 微信用户信息
     * @return 结果
     */
    public int updateXinhuWouser(XinhuWouser xinhuWouser);

    /**
     * 批量删除微信用户信息
     * 
     * @param ids 需要删除的微信用户信息主键集合
     * @return 结果
     */
    public int deleteXinhuWouserByIds(Long[] ids);

    /**
     * 删除微信用户信息信息
     * 
     * @param id 微信用户信息主键
     * @return 结果
     */
    public int deleteXinhuWouserById(Long id);
}
