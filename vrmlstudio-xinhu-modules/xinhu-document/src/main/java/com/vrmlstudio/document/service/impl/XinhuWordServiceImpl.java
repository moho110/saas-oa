package com.vrmlstudio.document.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.document.mapper.XinhuWordMapper;
import com.vrmlstudio.document.domain.XinhuWord;
import com.vrmlstudio.document.service.IXinhuWordService;

/**
 * 文档Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuWordServiceImpl implements IXinhuWordService 
{
    @Autowired
    private XinhuWordMapper xinhuWordMapper;

    /**
     * 查询文档
     * 
     * @param id 文档主键
     * @return 文档
     */
    @Override
    public XinhuWord selectXinhuWordById(Long id)
    {
        return xinhuWordMapper.selectXinhuWordById(id);
    }

    /**
     * 查询文档列表
     * 
     * @param xinhuWord 文档
     * @return 文档
     */
    @Override
    public List<XinhuWord> selectXinhuWordList(XinhuWord xinhuWord)
    {
        return xinhuWordMapper.selectXinhuWordList(xinhuWord);
    }

    /**
     * 新增文档
     * 
     * @param xinhuWord 文档
     * @return 结果
     */
    @Override
    public int insertXinhuWord(XinhuWord xinhuWord)
    {
        return xinhuWordMapper.insertXinhuWord(xinhuWord);
    }

    /**
     * 修改文档
     * 
     * @param xinhuWord 文档
     * @return 结果
     */
    @Override
    public int updateXinhuWord(XinhuWord xinhuWord)
    {
        return xinhuWordMapper.updateXinhuWord(xinhuWord);
    }

    /**
     * 批量删除文档
     * 
     * @param ids 需要删除的文档主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWordByIds(Long[] ids)
    {
        return xinhuWordMapper.deleteXinhuWordByIds(ids);
    }

    /**
     * 删除文档信息
     * 
     * @param id 文档主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWordById(Long id)
    {
        return xinhuWordMapper.deleteXinhuWordById(id);
    }
}
