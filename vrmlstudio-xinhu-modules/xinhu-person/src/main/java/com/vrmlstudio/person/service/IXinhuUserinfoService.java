package com.vrmlstudio.person.service;

import java.util.List;
import com.vrmlstudio.person.domain.XinhuUserinfo;

/**
 * 用户档案Service接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface IXinhuUserinfoService 
{
    /**
     * 查询用户档案
     * 
     * @param id 用户档案主键
     * @return 用户档案
     */
    public XinhuUserinfo selectXinhuUserinfoById(Integer id);

    /**
     * 查询用户档案列表
     * 
     * @param xinhuUserinfo 用户档案
     * @return 用户档案集合
     */
    public List<XinhuUserinfo> selectXinhuUserinfoList(XinhuUserinfo xinhuUserinfo);

    /**
     * 新增用户档案
     * 
     * @param xinhuUserinfo 用户档案
     * @return 结果
     */
    public int insertXinhuUserinfo(XinhuUserinfo xinhuUserinfo);

    /**
     * 修改用户档案
     * 
     * @param xinhuUserinfo 用户档案
     * @return 结果
     */
    public int updateXinhuUserinfo(XinhuUserinfo xinhuUserinfo);

    /**
     * 批量删除用户档案
     * 
     * @param ids 需要删除的用户档案主键集合
     * @return 结果
     */
    public int deleteXinhuUserinfoByIds(Long[] ids);

    /**
     * 删除用户档案信息
     * 
     * @param id 用户档案主键
     * @return 结果
     */
    public int deleteXinhuUserinfoById(Long id);
}
