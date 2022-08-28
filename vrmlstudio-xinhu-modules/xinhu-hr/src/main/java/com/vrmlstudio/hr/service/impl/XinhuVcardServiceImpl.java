package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuVcard;
import com.vrmlstudio.hr.mapper.XinhuVcardMapper;
import com.vrmlstudio.hr.service.IXinhuVcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 个人通讯录Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuVcardServiceImpl implements IXinhuVcardService
{
    @Autowired
    private XinhuVcardMapper xinhuVcardMapper;

    /**
     * 查询个人通讯录
     * 
     * @param id 个人通讯录主键
     * @return 个人通讯录
     */
    @Override
    public XinhuVcard selectXinhuVcardById(Long id)
    {
        return xinhuVcardMapper.selectXinhuVcardById(id);
    }

    /**
     * 查询个人通讯录列表
     * 
     * @param xinhuVcard 个人通讯录
     * @return 个人通讯录
     */
    @Override
    public List<XinhuVcard> selectXinhuVcardList(XinhuVcard xinhuVcard)
    {
        return xinhuVcardMapper.selectXinhuVcardList(xinhuVcard);
    }

    /**
     * 新增个人通讯录
     * 
     * @param xinhuVcard 个人通讯录
     * @return 结果
     */
    @Override
    public int insertXinhuVcard(XinhuVcard xinhuVcard)
    {
        return xinhuVcardMapper.insertXinhuVcard(xinhuVcard);
    }

    /**
     * 修改个人通讯录
     * 
     * @param xinhuVcard 个人通讯录
     * @return 结果
     */
    @Override
    public int updateXinhuVcard(XinhuVcard xinhuVcard)
    {
        return xinhuVcardMapper.updateXinhuVcard(xinhuVcard);
    }

    /**
     * 批量删除个人通讯录
     * 
     * @param ids 需要删除的个人通讯录主键
     * @return 结果
     */
    @Override
    public int deleteXinhuVcardByIds(Long[] ids)
    {
        return xinhuVcardMapper.deleteXinhuVcardByIds(ids);
    }

    /**
     * 删除个人通讯录信息
     * 
     * @param id 个人通讯录主键
     * @return 结果
     */
    @Override
    public int deleteXinhuVcardById(Long id)
    {
        return xinhuVcardMapper.deleteXinhuVcardById(id);
    }
}
