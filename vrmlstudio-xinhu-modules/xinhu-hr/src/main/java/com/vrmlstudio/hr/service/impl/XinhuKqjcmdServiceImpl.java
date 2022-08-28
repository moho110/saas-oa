package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuKqjcmd;
import com.vrmlstudio.hr.mapper.XinhuKqjcmdMapper;
import com.vrmlstudio.hr.service.IXinhuKqjcmdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 考勤机命令发送Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuKqjcmdServiceImpl implements IXinhuKqjcmdService
{
    @Autowired
    private XinhuKqjcmdMapper xinhuKqjcmdMapper;

    /**
     * 查询考勤机命令发送
     * 
     * @param id 考勤机命令发送主键
     * @return 考勤机命令发送
     */
    @Override
    public XinhuKqjcmd selectXinhuKqjcmdById(Long id)
    {
        return xinhuKqjcmdMapper.selectXinhuKqjcmdById(id);
    }

    /**
     * 查询考勤机命令发送列表
     * 
     * @param xinhuKqjcmd 考勤机命令发送
     * @return 考勤机命令发送
     */
    @Override
    public List<XinhuKqjcmd> selectXinhuKqjcmdList(XinhuKqjcmd xinhuKqjcmd)
    {
        return xinhuKqjcmdMapper.selectXinhuKqjcmdList(xinhuKqjcmd);
    }

    /**
     * 新增考勤机命令发送
     * 
     * @param xinhuKqjcmd 考勤机命令发送
     * @return 结果
     */
    @Override
    public int insertXinhuKqjcmd(XinhuKqjcmd xinhuKqjcmd)
    {
        return xinhuKqjcmdMapper.insertXinhuKqjcmd(xinhuKqjcmd);
    }

    /**
     * 修改考勤机命令发送
     * 
     * @param xinhuKqjcmd 考勤机命令发送
     * @return 结果
     */
    @Override
    public int updateXinhuKqjcmd(XinhuKqjcmd xinhuKqjcmd)
    {
        return xinhuKqjcmdMapper.updateXinhuKqjcmd(xinhuKqjcmd);
    }

    /**
     * 批量删除考勤机命令发送
     * 
     * @param ids 需要删除的考勤机命令发送主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqjcmdByIds(Long[] ids)
    {
        return xinhuKqjcmdMapper.deleteXinhuKqjcmdByIds(ids);
    }

    /**
     * 删除考勤机命令发送信息
     * 
     * @param id 考勤机命令发送主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqjcmdById(Long id)
    {
        return xinhuKqjcmdMapper.deleteXinhuKqjcmdById(id);
    }
}
