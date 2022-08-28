package com.vrmlstudio.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.XinhuLogMapper;
import com.vrmlstudio.xsystem.domain.XinhuLog;
import com.vrmlstudio.xsystem.service.IXinhuLogService;

/**
 * 系统日志Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuLogServiceImpl implements IXinhuLogService 
{
    @Autowired
    private XinhuLogMapper xinhuLogMapper;

    /**
     * 查询系统日志
     * 
     * @param id 系统日志主键
     * @return 系统日志
     */
    @Override
    public XinhuLog selectXinhuLogById(Long id)
    {
        return xinhuLogMapper.selectXinhuLogById(id);
    }

    /**
     * 查询系统日志列表
     * 
     * @param xinhuLog 系统日志
     * @return 系统日志
     */
    @Override
    public List<XinhuLog> selectXinhuLogList(XinhuLog xinhuLog)
    {
        return xinhuLogMapper.selectXinhuLogList(xinhuLog);
    }

    /**
     * 新增系统日志
     * 
     * @param xinhuLog 系统日志
     * @return 结果
     */
    @Override
    public int insertXinhuLog(XinhuLog xinhuLog)
    {
        return xinhuLogMapper.insertXinhuLog(xinhuLog);
    }

    /**
     * 修改系统日志
     * 
     * @param xinhuLog 系统日志
     * @return 结果
     */
    @Override
    public int updateXinhuLog(XinhuLog xinhuLog)
    {
        return xinhuLogMapper.updateXinhuLog(xinhuLog);
    }

    /**
     * 批量删除系统日志
     * 
     * @param ids 需要删除的系统日志主键
     * @return 结果
     */
    @Override
    public int deleteXinhuLogByIds(Long[] ids)
    {
        return xinhuLogMapper.deleteXinhuLogByIds(ids);
    }

    /**
     * 删除系统日志信息
     * 
     * @param id 系统日志主键
     * @return 结果
     */
    @Override
    public int deleteXinhuLogById(Long id)
    {
        return xinhuLogMapper.deleteXinhuLogById(id);
    }
}
