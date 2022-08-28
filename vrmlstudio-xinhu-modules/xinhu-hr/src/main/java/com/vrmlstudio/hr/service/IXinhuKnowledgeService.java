package com.vrmlstudio.hr.service;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuKnowledge;

/**
 * 知识信息Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuKnowledgeService 
{
    /**
     * 查询知识信息
     * 
     * @param id 知识信息主键
     * @return 知识信息
     */
    public XinhuKnowledge selectXinhuKnowledgeById(Long id);

    /**
     * 查询知识信息列表
     * 
     * @param xinhuKnowledge 知识信息
     * @return 知识信息集合
     */
    public List<XinhuKnowledge> selectXinhuKnowledgeList(XinhuKnowledge xinhuKnowledge);

    /**
     * 新增知识信息
     * 
     * @param xinhuKnowledge 知识信息
     * @return 结果
     */
    public int insertXinhuKnowledge(XinhuKnowledge xinhuKnowledge);

    /**
     * 修改知识信息
     * 
     * @param xinhuKnowledge 知识信息
     * @return 结果
     */
    public int updateXinhuKnowledge(XinhuKnowledge xinhuKnowledge);

    /**
     * 批量删除知识信息
     * 
     * @param ids 需要删除的知识信息主键集合
     * @return 结果
     */
    public int deleteXinhuKnowledgeByIds(Long[] ids);

    /**
     * 删除知识信息信息
     * 
     * @param id 知识信息主键
     * @return 结果
     */
    public int deleteXinhuKnowledgeById(Long id);
}
