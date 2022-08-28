package com.vrmlstudio.police.service;

import java.util.List;
import com.vrmlstudio.police.domain.XinhuEmailCont;

/**
 * 系统发送邮件内容Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuEmailContService 
{
    /**
     * 查询系统发送邮件内容
     * 
     * @param id 系统发送邮件内容主键
     * @return 系统发送邮件内容
     */
    public XinhuEmailCont selectXinhuEmailContById(Long id);

    /**
     * 查询系统发送邮件内容列表
     * 
     * @param xinhuEmailCont 系统发送邮件内容
     * @return 系统发送邮件内容集合
     */
    public List<XinhuEmailCont> selectXinhuEmailContList(XinhuEmailCont xinhuEmailCont);

    /**
     * 新增系统发送邮件内容
     * 
     * @param xinhuEmailCont 系统发送邮件内容
     * @return 结果
     */
    public int insertXinhuEmailCont(XinhuEmailCont xinhuEmailCont);

    /**
     * 修改系统发送邮件内容
     * 
     * @param xinhuEmailCont 系统发送邮件内容
     * @return 结果
     */
    public int updateXinhuEmailCont(XinhuEmailCont xinhuEmailCont);

    /**
     * 批量删除系统发送邮件内容
     * 
     * @param ids 需要删除的系统发送邮件内容主键集合
     * @return 结果
     */
    public int deleteXinhuEmailContByIds(Long[] ids);

    /**
     * 删除系统发送邮件内容信息
     * 
     * @param id 系统发送邮件内容主键
     * @return 结果
     */
    public int deleteXinhuEmailContById(Long id);
}
