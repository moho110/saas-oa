package com.vrmlstudio.flow.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.flow.mapper.XinhuFlowCnameMapper;
import com.vrmlstudio.flow.domain.XinhuFlowCname;
import com.vrmlstudio.flow.service.IXinhuFlowCnameService;

/**
 * 自定义审核人组Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuFlowCnameServiceImpl implements IXinhuFlowCnameService 
{
    @Autowired
    private XinhuFlowCnameMapper xinhuFlowCnameMapper;

    /**
     * 查询自定义审核人组
     * 
     * @param id 自定义审核人组主键
     * @return 自定义审核人组
     */
    @Override
    public XinhuFlowCname selectXinhuFlowCnameById(Long id)
    {
        return xinhuFlowCnameMapper.selectXinhuFlowCnameById(id);
    }

    /**
     * 查询自定义审核人组列表
     * 
     * @param xinhuFlowCname 自定义审核人组
     * @return 自定义审核人组
     */
    @Override
    public List<XinhuFlowCname> selectXinhuFlowCnameList(XinhuFlowCname xinhuFlowCname)
    {
        return xinhuFlowCnameMapper.selectXinhuFlowCnameList(xinhuFlowCname);
    }

    /**
     * 新增自定义审核人组
     * 
     * @param xinhuFlowCname 自定义审核人组
     * @return 结果
     */
    @Override
    public int insertXinhuFlowCname(XinhuFlowCname xinhuFlowCname)
    {
        return xinhuFlowCnameMapper.insertXinhuFlowCname(xinhuFlowCname);
    }

    /**
     * 修改自定义审核人组
     * 
     * @param xinhuFlowCname 自定义审核人组
     * @return 结果
     */
    @Override
    public int updateXinhuFlowCname(XinhuFlowCname xinhuFlowCname)
    {
        return xinhuFlowCnameMapper.updateXinhuFlowCname(xinhuFlowCname);
    }

    /**
     * 批量删除自定义审核人组
     * 
     * @param ids 需要删除的自定义审核人组主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowCnameByIds(Long[] ids)
    {
        return xinhuFlowCnameMapper.deleteXinhuFlowCnameByIds(ids);
    }

    /**
     * 删除自定义审核人组信息
     * 
     * @param id 自定义审核人组主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowCnameById(Long id)
    {
        return xinhuFlowCnameMapper.deleteXinhuFlowCnameById(id);
    }
}
