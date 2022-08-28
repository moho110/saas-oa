package com.vrmlstudio.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.finance.mapper.XinhuDeptMapper;
import com.vrmlstudio.finance.domain.XinhuDept;
import com.vrmlstudio.finance.service.IXinhuDeptService;

/**
 * 组织结构部门Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuDeptServiceImpl implements IXinhuDeptService 
{
    @Autowired
    private XinhuDeptMapper xinhuDeptMapper;

    /**
     * 查询组织结构部门
     * 
     * @param id 组织结构部门主键
     * @return 组织结构部门
     */
    @Override
    public XinhuDept selectXinhuDeptById(Long id)
    {
        return xinhuDeptMapper.selectXinhuDeptById(id);
    }

    /**
     * 查询组织结构部门列表
     * 
     * @param xinhuDept 组织结构部门
     * @return 组织结构部门
     */
    @Override
    public List<XinhuDept> selectXinhuDeptList(XinhuDept xinhuDept)
    {
        return xinhuDeptMapper.selectXinhuDeptList(xinhuDept);
    }

    /**
     * 新增组织结构部门
     * 
     * @param xinhuDept 组织结构部门
     * @return 结果
     */
    @Override
    public int insertXinhuDept(XinhuDept xinhuDept)
    {
        return xinhuDeptMapper.insertXinhuDept(xinhuDept);
    }

    /**
     * 修改组织结构部门
     * 
     * @param xinhuDept 组织结构部门
     * @return 结果
     */
    @Override
    public int updateXinhuDept(XinhuDept xinhuDept)
    {
        return xinhuDeptMapper.updateXinhuDept(xinhuDept);
    }

    /**
     * 批量删除组织结构部门
     * 
     * @param ids 需要删除的组织结构部门主键
     * @return 结果
     */
    @Override
    public int deleteXinhuDeptByIds(Long[] ids)
    {
        return xinhuDeptMapper.deleteXinhuDeptByIds(ids);
    }

    /**
     * 删除组织结构部门信息
     * 
     * @param id 组织结构部门主键
     * @return 结果
     */
    @Override
    public int deleteXinhuDeptById(Long id)
    {
        return xinhuDeptMapper.deleteXinhuDeptById(id);
    }

    @Override
    public List<XinhuDept> selectDeptAll() {
        return xinhuDeptMapper.selectDeptAll();
    }

    @Override
    public List<Long> selectDeptListByUserId(Long userId) {
        return xinhuDeptMapper.selectDeptListByUserId(userId);
    }
}
