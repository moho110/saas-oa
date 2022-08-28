package com.vrmlstudio.police.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.police.mapper.XinhuEmailContMapper;
import com.vrmlstudio.police.domain.XinhuEmailCont;
import com.vrmlstudio.police.service.IXinhuEmailContService;

/**
 * 系统发送邮件内容Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuEmailContServiceImpl implements IXinhuEmailContService 
{
    @Autowired
    private XinhuEmailContMapper xinhuEmailContMapper;

    /**
     * 查询系统发送邮件内容
     * 
     * @param id 系统发送邮件内容主键
     * @return 系统发送邮件内容
     */
    @Override
    public XinhuEmailCont selectXinhuEmailContById(Long id)
    {
        return xinhuEmailContMapper.selectXinhuEmailContById(id);
    }

    /**
     * 查询系统发送邮件内容列表
     * 
     * @param xinhuEmailCont 系统发送邮件内容
     * @return 系统发送邮件内容
     */
    @Override
    public List<XinhuEmailCont> selectXinhuEmailContList(XinhuEmailCont xinhuEmailCont)
    {
        return xinhuEmailContMapper.selectXinhuEmailContList(xinhuEmailCont);
    }

    /**
     * 新增系统发送邮件内容
     * 
     * @param xinhuEmailCont 系统发送邮件内容
     * @return 结果
     */
    @Override
    public int insertXinhuEmailCont(XinhuEmailCont xinhuEmailCont)
    {
        return xinhuEmailContMapper.insertXinhuEmailCont(xinhuEmailCont);
    }

    /**
     * 修改系统发送邮件内容
     * 
     * @param xinhuEmailCont 系统发送邮件内容
     * @return 结果
     */
    @Override
    public int updateXinhuEmailCont(XinhuEmailCont xinhuEmailCont)
    {
        return xinhuEmailContMapper.updateXinhuEmailCont(xinhuEmailCont);
    }

    /**
     * 批量删除系统发送邮件内容
     * 
     * @param ids 需要删除的系统发送邮件内容主键
     * @return 结果
     */
    @Override
    public int deleteXinhuEmailContByIds(Long[] ids)
    {
        return xinhuEmailContMapper.deleteXinhuEmailContByIds(ids);
    }

    /**
     * 删除系统发送邮件内容信息
     * 
     * @param id 系统发送邮件内容主键
     * @return 结果
     */
    @Override
    public int deleteXinhuEmailContById(Long id)
    {
        return xinhuEmailContMapper.deleteXinhuEmailContById(id);
    }
}
