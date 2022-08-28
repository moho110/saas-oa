package com.vrmlstudio.finance.mapper;

import java.util.List;
import com.vrmlstudio.finance.domain.XinhuDept;

/**
 * 组织结构部门Mapper接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface XinhuDeptMapper 
{
    /**
     * 查询组织结构部门
     * 
     * @param id 组织结构部门主键
     * @return 组织结构部门
     */
    public XinhuDept selectXinhuDeptById(Long id);

    /**
     * 查询组织结构部门列表
     * 
     * @param xinhuDept 组织结构部门
     * @return 组织结构部门集合
     */
    public List<XinhuDept> selectXinhuDeptList(XinhuDept xinhuDept);

    /**
     * 新增组织结构部门
     * 
     * @param xinhuDept 组织结构部门
     * @return 结果
     */
    public int insertXinhuDept(XinhuDept xinhuDept);

    /**
     * 修改组织结构部门
     * 
     * @param xinhuDept 组织结构部门
     * @return 结果
     */
    public int updateXinhuDept(XinhuDept xinhuDept);

    /**
     * 删除组织结构部门
     * 
     * @param id 组织结构部门主键
     * @return 结果
     */
    public int deleteXinhuDeptById(Long id);

    /**
     * 批量删除组织结构部门
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuDeptByIds(Long[] ids);

    /**
     * 查询所有部门
     * @return
     */
    public List<XinhuDept> selectDeptAll();

    /**
     * 获取下拉列表
     * @param userId
     * @return
     */
    public List<Long> selectDeptListByUserId(Long userId);
}
