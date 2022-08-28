package com.vrmlstudio.police.service;

import java.util.List;
import com.vrmlstudio.police.domain.XinhuFlowChao;

/**
 * 抄送Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuFlowChaoService 
{
    /**
     * 查询抄送
     * 
     * @param id 抄送主键
     * @return 抄送
     */
    public XinhuFlowChao selectXinhuFlowChaoById(Long id);

    /**
     * 查询抄送列表
     * 
     * @param xinhuFlowChao 抄送
     * @return 抄送集合
     */
    public List<XinhuFlowChao> selectXinhuFlowChaoList(XinhuFlowChao xinhuFlowChao);

    /**
     * 新增抄送
     * 
     * @param xinhuFlowChao 抄送
     * @return 结果
     */
    public int insertXinhuFlowChao(XinhuFlowChao xinhuFlowChao);

    /**
     * 修改抄送
     * 
     * @param xinhuFlowChao 抄送
     * @return 结果
     */
    public int updateXinhuFlowChao(XinhuFlowChao xinhuFlowChao);

    /**
     * 批量删除抄送
     * 
     * @param ids 需要删除的抄送主键集合
     * @return 结果
     */
    public int deleteXinhuFlowChaoByIds(Long[] ids);

    /**
     * 删除抄送信息
     * 
     * @param id 抄送主键
     * @return 结果
     */
    public int deleteXinhuFlowChaoById(Long id);
}
