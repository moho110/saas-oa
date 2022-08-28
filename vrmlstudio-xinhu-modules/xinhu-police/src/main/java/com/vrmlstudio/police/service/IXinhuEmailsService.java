package com.vrmlstudio.police.service;

import java.util.List;
import com.vrmlstudio.police.domain.XinhuEmails;

/**
 * 邮件子Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuEmailsService 
{
    /**
     * 查询邮件子
     * 
     * @param id 邮件子主键
     * @return 邮件子
     */
    public XinhuEmails selectXinhuEmailsById(Long id);

    /**
     * 查询邮件子列表
     * 
     * @param xinhuEmails 邮件子
     * @return 邮件子集合
     */
    public List<XinhuEmails> selectXinhuEmailsList(XinhuEmails xinhuEmails);

    /**
     * 新增邮件子
     * 
     * @param xinhuEmails 邮件子
     * @return 结果
     */
    public int insertXinhuEmails(XinhuEmails xinhuEmails);

    /**
     * 修改邮件子
     * 
     * @param xinhuEmails 邮件子
     * @return 结果
     */
    public int updateXinhuEmails(XinhuEmails xinhuEmails);

    /**
     * 批量删除邮件子
     * 
     * @param ids 需要删除的邮件子主键集合
     * @return 结果
     */
    public int deleteXinhuEmailsByIds(Long[] ids);

    /**
     * 删除邮件子信息
     * 
     * @param id 邮件子主键
     * @return 结果
     */
    public int deleteXinhuEmailsById(Long id);
}
