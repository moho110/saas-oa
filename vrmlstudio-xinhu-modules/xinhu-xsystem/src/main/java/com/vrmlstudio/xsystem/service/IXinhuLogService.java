package com.vrmlstudio.xsystem.service;

import java.util.List;
import com.vrmlstudio.xsystem.domain.XinhuLog;

/**
 * 系统日志Service接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface IXinhuLogService 
{
    /**
     * 查询系统日志
     * 
     * @param id 系统日志主键
     * @return 系统日志
     */
    public XinhuLog selectXinhuLogById(Long id);

    /**
     * 查询系统日志列表
     * 
     * @param xinhuLog 系统日志
     * @return 系统日志集合
     */
    public List<XinhuLog> selectXinhuLogList(XinhuLog xinhuLog);

    /**
     * 新增系统日志
     * 
     * @param xinhuLog 系统日志
     * @return 结果
     */
    public int insertXinhuLog(XinhuLog xinhuLog);

    /**
     * 修改系统日志
     * 
     * @param xinhuLog 系统日志
     * @return 结果
     */
    public int updateXinhuLog(XinhuLog xinhuLog);

    /**
     * 批量删除系统日志
     * 
     * @param ids 需要删除的系统日志主键集合
     * @return 结果
     */
    public int deleteXinhuLogByIds(Long[] ids);

    /**
     * 删除系统日志信息
     * 
     * @param id 系统日志主键
     * @return 结果
     */
    public int deleteXinhuLogById(Long id);
}
