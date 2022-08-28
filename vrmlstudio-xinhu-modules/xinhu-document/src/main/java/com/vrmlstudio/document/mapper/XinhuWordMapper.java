package com.vrmlstudio.document.mapper;

import java.util.List;
import com.vrmlstudio.document.domain.XinhuWord;

/**
 * 文档Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuWordMapper 
{
    /**
     * 查询文档
     * 
     * @param id 文档主键
     * @return 文档
     */
    public XinhuWord selectXinhuWordById(Long id);

    /**
     * 查询文档列表
     * 
     * @param xinhuWord 文档
     * @return 文档集合
     */
    public List<XinhuWord> selectXinhuWordList(XinhuWord xinhuWord);

    /**
     * 新增文档
     * 
     * @param xinhuWord 文档
     * @return 结果
     */
    public int insertXinhuWord(XinhuWord xinhuWord);

    /**
     * 修改文档
     * 
     * @param xinhuWord 文档
     * @return 结果
     */
    public int updateXinhuWord(XinhuWord xinhuWord);

    /**
     * 删除文档
     * 
     * @param id 文档主键
     * @return 结果
     */
    public int deleteXinhuWordById(Long id);

    /**
     * 批量删除文档
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuWordByIds(Long[] ids);
}
