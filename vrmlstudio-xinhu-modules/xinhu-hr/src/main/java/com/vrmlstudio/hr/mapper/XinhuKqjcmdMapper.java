package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuKqjcmd;

/**
 * 考勤机命令发送Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuKqjcmdMapper 
{
    /**
     * 查询考勤机命令发送
     * 
     * @param id 考勤机命令发送主键
     * @return 考勤机命令发送
     */
    public XinhuKqjcmd selectXinhuKqjcmdById(Long id);

    /**
     * 查询考勤机命令发送列表
     * 
     * @param xinhuKqjcmd 考勤机命令发送
     * @return 考勤机命令发送集合
     */
    public List<XinhuKqjcmd> selectXinhuKqjcmdList(XinhuKqjcmd xinhuKqjcmd);

    /**
     * 新增考勤机命令发送
     * 
     * @param xinhuKqjcmd 考勤机命令发送
     * @return 结果
     */
    public int insertXinhuKqjcmd(XinhuKqjcmd xinhuKqjcmd);

    /**
     * 修改考勤机命令发送
     * 
     * @param xinhuKqjcmd 考勤机命令发送
     * @return 结果
     */
    public int updateXinhuKqjcmd(XinhuKqjcmd xinhuKqjcmd);

    /**
     * 删除考勤机命令发送
     * 
     * @param id 考勤机命令发送主键
     * @return 结果
     */
    public int deleteXinhuKqjcmdById(Long id);

    /**
     * 批量删除考勤机命令发送
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuKqjcmdByIds(Long[] ids);
}
