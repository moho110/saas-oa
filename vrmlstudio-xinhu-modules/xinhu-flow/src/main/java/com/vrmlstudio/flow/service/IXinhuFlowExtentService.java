package com.vrmlstudio.flow.service;

import java.util.List;
import com.vrmlstudio.flow.domain.XinhuFlowExtent;

/**
 * 模块权限Service接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface IXinhuFlowExtentService 
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
     * 批量删除模块权限
     * 
     * @param ids 需要删除的模块权限主键集合
     * @return 结果
     */
    public int deleteXinhuFlowExtentByIds(Long[] ids);

    /**
     * 删除模块权限信息
     * 
     * @param id 模块权限主键
     * @return 结果
     */
    public int deleteXinhuFlowExtentById(Long id);
}
