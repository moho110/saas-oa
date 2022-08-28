package com.vrmlstudio.flow.mapper;

import java.util.List;
import com.vrmlstudio.flow.domain.XinhuFlowRemind;

/**
 * 单据提醒设置Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuFlowRemindMapper 
{
    /**
     * 查询单据提醒设置
     * 
     * @param id 单据提醒设置主键
     * @return 单据提醒设置
     */
    public XinhuFlowRemind selectXinhuFlowRemindById(Long id);

    /**
     * 查询单据提醒设置列表
     * 
     * @param xinhuFlowRemind 单据提醒设置
     * @return 单据提醒设置集合
     */
    public List<XinhuFlowRemind> selectXinhuFlowRemindList(XinhuFlowRemind xinhuFlowRemind);

    /**
     * 新增单据提醒设置
     * 
     * @param xinhuFlowRemind 单据提醒设置
     * @return 结果
     */
    public int insertXinhuFlowRemind(XinhuFlowRemind xinhuFlowRemind);

    /**
     * 修改单据提醒设置
     * 
     * @param xinhuFlowRemind 单据提醒设置
     * @return 结果
     */
    public int updateXinhuFlowRemind(XinhuFlowRemind xinhuFlowRemind);

    /**
     * 删除单据提醒设置
     * 
     * @param id 单据提醒设置主键
     * @return 结果
     */
    public int deleteXinhuFlowRemindById(Long id);

    /**
     * 批量删除单据提醒设置
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuFlowRemindByIds(Long[] ids);
}
