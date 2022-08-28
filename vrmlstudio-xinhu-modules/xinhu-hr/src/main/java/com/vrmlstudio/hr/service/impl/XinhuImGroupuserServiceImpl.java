package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuImGroupuser;
import com.vrmlstudio.hr.mapper.XinhuImGroupuserMapper;
import com.vrmlstudio.hr.service.IXinhuImGroupuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * IM会话人员Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuImGroupuserServiceImpl implements IXinhuImGroupuserService
{
    @Autowired
    private XinhuImGroupuserMapper xinhuImGroupuserMapper;

    /**
     * 查询IM会话人员
     * 
     * @param id IM会话人员主键
     * @return IM会话人员
     */
    @Override
    public XinhuImGroupuser selectXinhuImGroupuserById(Long id)
    {
        return xinhuImGroupuserMapper.selectXinhuImGroupuserById(id);
    }

    /**
     * 查询IM会话人员列表
     * 
     * @param xinhuImGroupuser IM会话人员
     * @return IM会话人员
     */
    @Override
    public List<XinhuImGroupuser> selectXinhuImGroupuserList(XinhuImGroupuser xinhuImGroupuser)
    {
        return xinhuImGroupuserMapper.selectXinhuImGroupuserList(xinhuImGroupuser);
    }

    /**
     * 新增IM会话人员
     * 
     * @param xinhuImGroupuser IM会话人员
     * @return 结果
     */
    @Override
    public int insertXinhuImGroupuser(XinhuImGroupuser xinhuImGroupuser)
    {
        return xinhuImGroupuserMapper.insertXinhuImGroupuser(xinhuImGroupuser);
    }

    /**
     * 修改IM会话人员
     * 
     * @param xinhuImGroupuser IM会话人员
     * @return 结果
     */
    @Override
    public int updateXinhuImGroupuser(XinhuImGroupuser xinhuImGroupuser)
    {
        return xinhuImGroupuserMapper.updateXinhuImGroupuser(xinhuImGroupuser);
    }

    /**
     * 批量删除IM会话人员
     * 
     * @param ids 需要删除的IM会话人员主键
     * @return 结果
     */
    @Override
    public int deleteXinhuImGroupuserByIds(Long[] ids)
    {
        return xinhuImGroupuserMapper.deleteXinhuImGroupuserByIds(ids);
    }

    /**
     * 删除IM会话人员信息
     * 
     * @param id IM会话人员主键
     * @return 结果
     */
    @Override
    public int deleteXinhuImGroupuserById(Long id)
    {
        return xinhuImGroupuserMapper.deleteXinhuImGroupuserById(id);
    }
}
