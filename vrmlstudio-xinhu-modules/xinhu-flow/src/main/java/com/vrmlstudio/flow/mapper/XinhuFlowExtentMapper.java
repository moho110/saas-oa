package com.vrmlstudio.flow.mapper;

import java.util.List;
import com.vrmlstudio.flow.domain.XinhuFlowExtent;

/**
 * 模块权限Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuFlowExtentMapper 
{
    /**
     * 查询模块权限
     * 
     * @param id 模块权限主键
     * @return 模块权限
     */
    public XinhuFlowExtent selectXinhuFlowExtentById(Long id);

    /**
     * 查询模块权限列表
     * 
     * @param xinhuFlowExtent 模块权限
     * @return 模块权限集合
     */
    public List<XinhuFlowExtent> selectXinhuFlowExtentList(XinhuFlowExtent xinhuFlowExtent);

    /**
     * 新增模块权限
     * 
     * @param xinhuFlowExtent 模块权限
     * @return 结果
     */
    public int insertXinhuFlowExtent(XinhuFlowExtent xinhuFlowExtent);

    /**
     * 修改模块权限
     * 
     * @param xinhuFlowExtent 模块权限
     * @return 结果
     */
    public int updateXinhuFlowExtent(XinhuFlowExtent xinhuFlowExtent);

    /**
     * 删除模块权限
     * 
     * @param id 模块权限主键
     * @return 结果
     */
    public int deleteXinhuFlowExtentById(Long id);

    /**
     * 批量删除模块权限
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuFlowExtentByIds(Long[] ids);
}
