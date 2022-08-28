package com.vrmlstudio.police.service;

import java.util.List;
import com.vrmlstudio.police.domain.XinhuEmailm;

/**
 * 邮件主Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuEmailmService 
{
    /**
     * 查询邮件主
     * 
     * @param id 邮件主主键
     * @return 邮件主
     */
    public XinhuEmailm selectXinhuEmailmById(Long id);

    /**
     * 查询邮件主列表
     * 
     * @param xinhuEmailm 邮件主
     * @return 邮件主集合
     */
    public List<XinhuEmailm> selectXinhuEmailmList(XinhuEmailm xinhuEmailm);

    /**
     * 新增邮件主
     * 
     * @param xinhuEmailm 邮件主
     * @return 结果
     */
    public int insertXinhuEmailm(XinhuEmailm xinhuEmailm);

    /**
     * 修改邮件主
     * 
     * @param xinhuEmailm 邮件主
     * @return 结果
     */
    public int updateXinhuEmailm(XinhuEmailm xinhuEmailm);

    /**
     * 批量删除邮件主
     * 
     * @param ids 需要删除的邮件主主键集合
     * @return 结果
     */
    public int deleteXinhuEmailmByIds(Long[] ids);

    /**
     * 删除邮件主信息
     * 
     * @param id 邮件主主键
     * @return 结果
     */
    public int deleteXinhuEmailmById(Long id);
}
