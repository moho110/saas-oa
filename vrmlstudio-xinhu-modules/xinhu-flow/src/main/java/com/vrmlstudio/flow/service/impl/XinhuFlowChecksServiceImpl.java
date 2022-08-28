package com.vrmlstudio.flow.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.flow.mapper.XinhuFlowChecksMapper;
import com.vrmlstudio.flow.domain.XinhuFlowChecks;
import com.vrmlstudio.flow.service.IXinhuFlowChecksService;

/**
 * 单据的审核人Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuFlowChecksServiceImpl implements IXinhuFlowChecksService 
{
    @Autowired
    private XinhuFlowChecksMapper xinhuFlowChecksMapper;

    /**
     * 查询单据的审核人
     * 
     * @param id 单据的审核人主键
     * @return 单据的审核人
     */
    @Override
    public XinhuFlowChecks selectXinhuFlowChecksById(Long id)
    {
        return xinhuFlowChecksMapper.selectXinhuFlowChecksById(id);
    }

    /**
     * 查询单据的审核人列表
     * 
     * @param xinhuFlowChecks 单据的审核人
     * @return 单据的审核人
     */
    @Override
    public List<XinhuFlowChecks> selectXinhuFlowChecksList(XinhuFlowChecks xinhuFlowChecks)
    {
        return xinhuFlowChecksMapper.selectXinhuFlowChecksList(xinhuFlowChecks);
    }

    /**
     * 新增单据的审核人
     * 
     * @param xinhuFlowChecks 单据的审核人
     * @return 结果
     */
    @Override
    public int insertXinhuFlowChecks(XinhuFlowChecks xinhuFlowChecks)
    {
        return xinhuFlowChecksMapper.insertXinhuFlowChecks(xinhuFlowChecks);
    }

    /**
     * 修改单据的审核人
     * 
     * @param xinhuFlowChecks 单据的审核人
     * @return 结果
     */
    @Override
    public int updateXinhuFlowChecks(XinhuFlowChecks xinhuFlowChecks)
    {
        return xinhuFlowChecksMapper.updateXinhuFlowChecks(xinhuFlowChecks);
    }

    /**
     * 批量删除单据的审核人
     * 
     * @param ids 需要删除的单据的审核人主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowChecksByIds(Long[] ids)
    {
        return xinhuFlowChecksMapper.deleteXinhuFlowChecksByIds(ids);
    }

    /**
     * 删除单据的审核人信息
     * 
     * @param id 单据的审核人主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowChecksById(Long id)
    {
        return xinhuFlowChecksMapper.deleteXinhuFlowChecksById(id);
    }
}
