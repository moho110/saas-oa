package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuKnowledge;
import com.vrmlstudio.hr.mapper.XinhuKnowledgeMapper;
import com.vrmlstudio.hr.service.IXinhuKnowledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 知识信息Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuKnowledgeServiceImpl implements IXinhuKnowledgeService
{
    @Autowired
    private XinhuKnowledgeMapper xinhuKnowledgeMapper;

    /**
     * 查询知识信息
     * 
     * @param id 知识信息主键
     * @return 知识信息
     */
    @Override
    public XinhuKnowledge selectXinhuKnowledgeById(Long id)
    {
        return xinhuKnowledgeMapper.selectXinhuKnowledgeById(id);
    }

    /**
     * 查询知识信息列表
     * 
     * @param xinhuKnowledge 知识信息
     * @return 知识信息
     */
    @Override
    public List<XinhuKnowledge> selectXinhuKnowledgeList(XinhuKnowledge xinhuKnowledge)
    {
        return xinhuKnowledgeMapper.selectXinhuKnowledgeList(xinhuKnowledge);
    }

    /**
     * 新增知识信息
     * 
     * @param xinhuKnowledge 知识信息
     * @return 结果
     */
    @Override
    public int insertXinhuKnowledge(XinhuKnowledge xinhuKnowledge)
    {
        return xinhuKnowledgeMapper.insertXinhuKnowledge(xinhuKnowledge);
    }

    /**
     * 修改知识信息
     * 
     * @param xinhuKnowledge 知识信息
     * @return 结果
     */
    @Override
    public int updateXinhuKnowledge(XinhuKnowledge xinhuKnowledge)
    {
        return xinhuKnowledgeMapper.updateXinhuKnowledge(xinhuKnowledge);
    }

    /**
     * 批量删除知识信息
     * 
     * @param ids 需要删除的知识信息主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKnowledgeByIds(Long[] ids)
    {
        return xinhuKnowledgeMapper.deleteXinhuKnowledgeByIds(ids);
    }

    /**
     * 删除知识信息信息
     * 
     * @param id 知识信息主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKnowledgeById(Long id)
    {
        return xinhuKnowledgeMapper.deleteXinhuKnowledgeById(id);
    }
}
