package com.vrmlstudio.police.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.police.mapper.XinhuEmailsMapper;
import com.vrmlstudio.police.domain.XinhuEmails;
import com.vrmlstudio.police.service.IXinhuEmailsService;

/**
 * 邮件子Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuEmailsServiceImpl implements IXinhuEmailsService 
{
    @Autowired
    private XinhuEmailsMapper xinhuEmailsMapper;

    /**
     * 查询邮件子
     * 
     * @param id 邮件子主键
     * @return 邮件子
     */
    @Override
    public XinhuEmails selectXinhuEmailsById(Long id)
    {
        return xinhuEmailsMapper.selectXinhuEmailsById(id);
    }

    /**
     * 查询邮件子列表
     * 
     * @param xinhuEmails 邮件子
     * @return 邮件子
     */
    @Override
    public List<XinhuEmails> selectXinhuEmailsList(XinhuEmails xinhuEmails)
    {
        return xinhuEmailsMapper.selectXinhuEmailsList(xinhuEmails);
    }

    /**
     * 新增邮件子
     * 
     * @param xinhuEmails 邮件子
     * @return 结果
     */
    @Override
    public int insertXinhuEmails(XinhuEmails xinhuEmails)
    {
        return xinhuEmailsMapper.insertXinhuEmails(xinhuEmails);
    }

    /**
     * 修改邮件子
     * 
     * @param xinhuEmails 邮件子
     * @return 结果
     */
    @Override
    public int updateXinhuEmails(XinhuEmails xinhuEmails)
    {
        return xinhuEmailsMapper.updateXinhuEmails(xinhuEmails);
    }

    /**
     * 批量删除邮件子
     * 
     * @param ids 需要删除的邮件子主键
     * @return 结果
     */
    @Override
    public int deleteXinhuEmailsByIds(Long[] ids)
    {
        return xinhuEmailsMapper.deleteXinhuEmailsByIds(ids);
    }

    /**
     * 删除邮件子信息
     * 
     * @param id 邮件子主键
     * @return 结果
     */
    @Override
    public int deleteXinhuEmailsById(Long id)
    {
        return xinhuEmailsMapper.deleteXinhuEmailsById(id);
    }
}
