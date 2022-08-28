package com.vrmlstudio.person.mapper;

import java.util.List;
import com.vrmlstudio.person.domain.XinhuUserinfo;
import com.vrmlstudio.person.domain.XinhuUserinfos;

/**
 * 用户档案Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuUserinfoMapper 
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
     * 删除用户档案
     * 
     * @param id 用户档案主键
     * @return 结果
     */
    public int deleteXinhuUserinfoById(Long id);

    /**
     * 批量删除用户档案
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuUserinfoByIds(Long[] ids);

    /**
     * 批量删除人员档案子
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuUserinfosByMids(Long[] ids);
    
    /**
     * 批量新增人员档案子
     * 
     * @param xinhuUserinfosList 人员档案子列表
     * @return 结果
     */
    public int batchXinhuUserinfos(List<XinhuUserinfos> xinhuUserinfosList);
    

    /**
     * 通过用户档案主键删除人员档案子信息
     * 
     * @param id 用户档案ID
     * @return 结果
     */
    public int deleteXinhuUserinfosByMid(Long id);
}
