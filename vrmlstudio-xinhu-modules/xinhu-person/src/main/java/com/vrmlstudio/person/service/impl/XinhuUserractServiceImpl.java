package com.vrmlstudio.person.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.person.mapper.XinhuUserractMapper;
import com.vrmlstudio.person.domain.XinhuUserract;
import com.vrmlstudio.person.service.IXinhuUserractService;

/**
 * 用户合同Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuUserractServiceImpl implements IXinhuUserractService 
{
    @Autowired
    private XinhuUserractMapper xinhuUserractMapper;

    /**
     * 查询用户合同
     * 
     * @param id 用户合同主键
     * @return 用户合同
     */
    @Override
    public XinhuUserract selectXinhuUserractById(Long id)
    {
        return xinhuUserractMapper.selectXinhuUserractById(id);
    }

    /**
     * 查询用户合同列表
     * 
     * @param xinhuUserract 用户合同
     * @return 用户合同
     */
    @Override
    public List<XinhuUserract> selectXinhuUserractList(XinhuUserract xinhuUserract)
    {
        return xinhuUserractMapper.selectXinhuUserractList(xinhuUserract);
    }

    /**
     * 新增用户合同
     * 
     * @param xinhuUserract 用户合同
     * @return 结果
     */
    @Override
    public int insertXinhuUserract(XinhuUserract xinhuUserract)
    {
        return xinhuUserractMapper.insertXinhuUserract(xinhuUserract);
    }

    /**
     * 修改用户合同
     * 
     * @param xinhuUserract 用户合同
     * @return 结果
     */
    @Override
    public int updateXinhuUserract(XinhuUserract xinhuUserract)
    {
        return xinhuUserractMapper.updateXinhuUserract(xinhuUserract);
    }

    /**
     * 批量删除用户合同
     * 
     * @param ids 需要删除的用户合同主键
     * @return 结果
     */
    @Override
    public int deleteXinhuUserractByIds(Long[] ids)
    {
        return xinhuUserractMapper.deleteXinhuUserractByIds(ids);
    }

    /**
     * 删除用户合同信息
     * 
     * @param id 用户合同主键
     * @return 结果
     */
    @Override
    public int deleteXinhuUserractById(Long id)
    {
        return xinhuUserractMapper.deleteXinhuUserractById(id);
    }
}
