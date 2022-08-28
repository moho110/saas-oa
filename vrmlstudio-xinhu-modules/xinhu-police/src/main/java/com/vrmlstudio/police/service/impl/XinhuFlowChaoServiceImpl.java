package com.vrmlstudio.police.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.police.mapper.XinhuFlowChaoMapper;
import com.vrmlstudio.police.domain.XinhuFlowChao;
import com.vrmlstudio.police.service.IXinhuFlowChaoService;

/**
 * 抄送Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuFlowChaoServiceImpl implements IXinhuFlowChaoService 
{
    @Autowired
    private XinhuFlowChaoMapper xinhuFlowChaoMapper;

    /**
     * 查询抄送
     * 
     * @param id 抄送主键
     * @return 抄送
     */
    @Override
    public XinhuFlowChao selectXinhuFlowChaoById(Long id)
    {
        return xinhuFlowChaoMapper.selectXinhuFlowChaoById(id);
    }

    /**
     * 查询抄送列表
     * 
     * @param xinhuFlowChao 抄送
     * @return 抄送
     */
    @Override
    public List<XinhuFlowChao> selectXinhuFlowChaoList(XinhuFlowChao xinhuFlowChao)
    {
        return xinhuFlowChaoMapper.selectXinhuFlowChaoList(xinhuFlowChao);
    }

    /**
     * 新增抄送
     * 
     * @param xinhuFlowChao 抄送
     * @return 结果
     */
    @Override
    public int insertXinhuFlowChao(XinhuFlowChao xinhuFlowChao)
    {
        return xinhuFlowChaoMapper.insertXinhuFlowChao(xinhuFlowChao);
    }

    /**
     * 修改抄送
     * 
     * @param xinhuFlowChao 抄送
     * @return 结果
     */
    @Override
    public int updateXinhuFlowChao(XinhuFlowChao xinhuFlowChao)
    {
        return xinhuFlowChaoMapper.updateXinhuFlowChao(xinhuFlowChao);
    }

    /**
     * 批量删除抄送
     * 
     * @param ids 需要删除的抄送主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowChaoByIds(Long[] ids)
    {
        return xinhuFlowChaoMapper.deleteXinhuFlowChaoByIds(ids);
    }

    /**
     * 删除抄送信息
     * 
     * @param id 抄送主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowChaoById(Long id)
    {
        return xinhuFlowChaoMapper.deleteXinhuFlowChaoById(id);
    }
}
