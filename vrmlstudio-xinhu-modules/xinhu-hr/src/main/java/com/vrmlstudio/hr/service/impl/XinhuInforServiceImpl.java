package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuInfor;
import com.vrmlstudio.hr.mapper.XinhuInforMapper;
import com.vrmlstudio.hr.service.IXinhuInforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 通知公告Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuInforServiceImpl implements IXinhuInforService
{
    @Autowired
    private XinhuInforMapper xinhuInforMapper;

    /**
     * 查询通知公告
     * 
     * @param id 通知公告主键
     * @return 通知公告
     */
    @Override
    public XinhuInfor selectXinhuInforById(Long id)
    {
        return xinhuInforMapper.selectXinhuInforById(id);
    }

    /**
     * 查询通知公告列表
     * 
     * @param xinhuInfor 通知公告
     * @return 通知公告
     */
    @Override
    public List<XinhuInfor> selectXinhuInforList(XinhuInfor xinhuInfor)
    {
        return xinhuInforMapper.selectXinhuInforList(xinhuInfor);
    }

    /**
     * 新增通知公告
     * 
     * @param xinhuInfor 通知公告
     * @return 结果
     */
    @Override
    public int insertXinhuInfor(XinhuInfor xinhuInfor)
    {
        return xinhuInforMapper.insertXinhuInfor(xinhuInfor);
    }

    /**
     * 修改通知公告
     * 
     * @param xinhuInfor 通知公告
     * @return 结果
     */
    @Override
    public int updateXinhuInfor(XinhuInfor xinhuInfor)
    {
        return xinhuInforMapper.updateXinhuInfor(xinhuInfor);
    }

    /**
     * 批量删除通知公告
     * 
     * @param ids 需要删除的通知公告主键
     * @return 结果
     */
    @Override
    public int deleteXinhuInforByIds(Long[] ids)
    {
        return xinhuInforMapper.deleteXinhuInforByIds(ids);
    }

    /**
     * 删除通知公告信息
     * 
     * @param id 通知公告主键
     * @return 结果
     */
    @Override
    public int deleteXinhuInforById(Long id)
    {
        return xinhuInforMapper.deleteXinhuInforById(id);
    }
}
