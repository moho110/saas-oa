package com.vrmlstudio.document.mapper;

import java.util.List;
import com.vrmlstudio.document.domain.XinhuSeal;

/**
 * 印章Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuSealMapper 
{
    /**
     * 查询印章
     * 
     * @param id 印章主键
     * @return 印章
     */
    public XinhuSeal selectXinhuSealById(Long id);

    /**
     * 查询印章列表
     * 
     * @param xinhuSeal 印章
     * @return 印章集合
     */
    public List<XinhuSeal> selectXinhuSealList(XinhuSeal xinhuSeal);

    /**
     * 新增印章
     * 
     * @param xinhuSeal 印章
     * @return 结果
     */
    public int insertXinhuSeal(XinhuSeal xinhuSeal);

    /**
     * 修改印章
     * 
     * @param xinhuSeal 印章
     * @return 结果
     */
    public int updateXinhuSeal(XinhuSeal xinhuSeal);

    /**
     * 删除印章
     * 
     * @param id 印章主键
     * @return 结果
     */
    public int deleteXinhuSealById(Long id);

    /**
     * 批量删除印章
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuSealByIds(Long[] ids);
}
