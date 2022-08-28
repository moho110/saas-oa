package com.vrmlstudio.xsystem.service;

import java.util.List;
import com.vrmlstudio.xsystem.domain.XinhuGroup;

/**
 * 系统组Service接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface IXinhuGroupService 
{
    /**
     * 查询系统组
     * 
     * @param id 系统组主键
     * @return 系统组
     */
    public XinhuGroup selectXinhuGroupById(Long id);

    /**
     * 查询系统组列表
     * 
     * @param xinhuGroup 系统组
     * @return 系统组集合
     */
    public List<XinhuGroup> selectXinhuGroupList(XinhuGroup xinhuGroup);

    /**
     * 新增系统组
     * 
     * @param xinhuGroup 系统组
     * @return 结果
     */
    public int insertXinhuGroup(XinhuGroup xinhuGroup);

    /**
     * 修改系统组
     * 
     * @param xinhuGroup 系统组
     * @return 结果
     */
    public int updateXinhuGroup(XinhuGroup xinhuGroup);

    /**
     * 批量删除系统组
     * 
     * @param ids 需要删除的系统组主键集合
     * @return 结果
     */
    public int deleteXinhuGroupByIds(Long[] ids);

    /**
     * 删除系统组信息
     * 
     * @param id 系统组主键
     * @return 结果
     */
    public int deleteXinhuGroupById(Long id);
}
