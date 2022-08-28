package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuHrsalarm;
import com.vrmlstudio.hr.mapper.XinhuHrsalarmMapper;
import com.vrmlstudio.hr.service.IXinhuHrsalarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 薪资模版Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuHrsalarmServiceImpl implements IXinhuHrsalarmService
{
    @Autowired
    private XinhuHrsalarmMapper xinhuHrsalarmMapper;

    /**
     * 查询薪资模版
     * 
     * @param id 薪资模版主键
     * @return 薪资模版
     */
    @Override
    public XinhuHrsalarm selectXinhuHrsalarmById(Long id)
    {
        return xinhuHrsalarmMapper.selectXinhuHrsalarmById(id);
    }

    /**
     * 查询薪资模版列表
     * 
     * @param xinhuHrsalarm 薪资模版
     * @return 薪资模版
     */
    @Override
    public List<XinhuHrsalarm> selectXinhuHrsalarmList(XinhuHrsalarm xinhuHrsalarm)
    {
        return xinhuHrsalarmMapper.selectXinhuHrsalarmList(xinhuHrsalarm);
    }

    /**
     * 新增薪资模版
     * 
     * @param xinhuHrsalarm 薪资模版
     * @return 结果
     */
    @Override
    public int insertXinhuHrsalarm(XinhuHrsalarm xinhuHrsalarm)
    {
        return xinhuHrsalarmMapper.insertXinhuHrsalarm(xinhuHrsalarm);
    }

    /**
     * 修改薪资模版
     * 
     * @param xinhuHrsalarm 薪资模版
     * @return 结果
     */
    @Override
    public int updateXinhuHrsalarm(XinhuHrsalarm xinhuHrsalarm)
    {
        return xinhuHrsalarmMapper.updateXinhuHrsalarm(xinhuHrsalarm);
    }

    /**
     * 批量删除薪资模版
     * 
     * @param ids 需要删除的薪资模版主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrsalarmByIds(Long[] ids)
    {
        return xinhuHrsalarmMapper.deleteXinhuHrsalarmByIds(ids);
    }

    /**
     * 删除薪资模版信息
     * 
     * @param id 薪资模版主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrsalarmById(Long id)
    {
        return xinhuHrsalarmMapper.deleteXinhuHrsalarmById(id);
    }
}
