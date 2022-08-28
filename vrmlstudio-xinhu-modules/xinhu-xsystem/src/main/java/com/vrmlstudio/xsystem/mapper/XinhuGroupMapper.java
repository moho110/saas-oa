package com.vrmlstudio.xsystem.mapper;

import java.util.List;
import com.vrmlstudio.xsystem.domain.XinhuGroup;

/**
 * 系统组Mapper接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface XinhuGroupMapper 
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
     * 删除系统组
     * 
     * @param id 系统组主键
     * @return 结果
     */
    public int deleteXinhuGroupById(Long id);

    /**
     * 批量删除系统组
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuGroupByIds(Long[] ids);
}
