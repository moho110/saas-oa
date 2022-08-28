package com.vrmlstudio.finance.service;

import java.util.List;
import com.vrmlstudio.finance.domain.XinhuReads;

/**
 * 单据浏览记录Service接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface IXinhuReadsService 
{
    /**
     * 查询单据浏览记录
     * 
     * @param id 单据浏览记录主键
     * @return 单据浏览记录
     */
    public XinhuReads selectXinhuReadsById(Long id);

    /**
     * 查询单据浏览记录列表
     * 
     * @param xinhuReads 单据浏览记录
     * @return 单据浏览记录集合
     */
    public List<XinhuReads> selectXinhuReadsList(XinhuReads xinhuReads);

    /**
     * 新增单据浏览记录
     * 
     * @param xinhuReads 单据浏览记录
     * @return 结果
     */
    public int insertXinhuReads(XinhuReads xinhuReads);

    /**
     * 修改单据浏览记录
     * 
     * @param xinhuReads 单据浏览记录
     * @return 结果
     */
    public int updateXinhuReads(XinhuReads xinhuReads);

    /**
     * 批量删除单据浏览记录
     * 
     * @param ids 需要删除的单据浏览记录主键集合
     * @return 结果
     */
    public int deleteXinhuReadsByIds(Long[] ids);

    /**
     * 删除单据浏览记录信息
     * 
     * @param id 单据浏览记录主键
     * @return 结果
     */
    public int deleteXinhuReadsById(Long id);
}
