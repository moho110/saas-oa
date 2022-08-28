package com.vrmlstudio.police.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.police.mapper.XinhuEmailmMapper;
import com.vrmlstudio.police.domain.XinhuEmailm;
import com.vrmlstudio.police.service.IXinhuEmailmService;

/**
 * 邮件主Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuEmailmServiceImpl implements IXinhuEmailmService 
{
    @Autowired
    private XinhuEmailmMapper xinhuEmailmMapper;

    /**
     * 查询邮件主
     * 
     * @param id 邮件主主键
     * @return 邮件主
     */
    @Override
    public XinhuEmailm selectXinhuEmailmById(Long id)
    {
        return xinhuEmailmMapper.selectXinhuEmailmById(id);
    }

    /**
     * 查询邮件主列表
     * 
     * @param xinhuEmailm 邮件主
     * @return 邮件主
     */
    @Override
    public List<XinhuEmailm> selectXinhuEmailmList(XinhuEmailm xinhuEmailm)
    {
        return xinhuEmailmMapper.selectXinhuEmailmList(xinhuEmailm);
    }

    /**
     * 新增邮件主
     * 
     * @param xinhuEmailm 邮件主
     * @return 结果
     */
    @Override
    public int insertXinhuEmailm(XinhuEmailm xinhuEmailm)
    {
        return xinhuEmailmMapper.insertXinhuEmailm(xinhuEmailm);
    }

    /**
     * 修改邮件主
     * 
     * @param xinhuEmailm 邮件主
     * @return 结果
     */
    @Override
    public int updateXinhuEmailm(XinhuEmailm xinhuEmailm)
    {
        return xinhuEmailmMapper.updateXinhuEmailm(xinhuEmailm);
    }

    /**
     * 批量删除邮件主
     * 
     * @param ids 需要删除的邮件主主键
     * @return 结果
     */
    @Override
    public int deleteXinhuEmailmByIds(Long[] ids)
    {
        return xinhuEmailmMapper.deleteXinhuEmailmByIds(ids);
    }

    /**
     * 删除邮件主信息
     * 
     * @param id 邮件主主键
     * @return 结果
     */
    @Override
    public int deleteXinhuEmailmById(Long id)
    {
        return xinhuEmailmMapper.deleteXinhuEmailmById(id);
    }
}
