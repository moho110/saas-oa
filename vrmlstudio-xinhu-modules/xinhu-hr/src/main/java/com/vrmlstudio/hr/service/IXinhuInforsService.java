package com.vrmlstudio.hr.service;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuInfors;

/**
 * 信息子投票项Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuInforsService 
{
    /**
     * 查询信息子投票项
     * 
     * @param id 信息子投票项主键
     * @return 信息子投票项
     */
    public XinhuInfors selectXinhuInforsById(Long id);

    /**
     * 查询信息子投票项列表
     * 
     * @param xinhuInfors 信息子投票项
     * @return 信息子投票项集合
     */
    public List<XinhuInfors> selectXinhuInforsList(XinhuInfors xinhuInfors);

    /**
     * 新增信息子投票项
     * 
     * @param xinhuInfors 信息子投票项
     * @return 结果
     */
    public int insertXinhuInfors(XinhuInfors xinhuInfors);

    /**
     * 修改信息子投票项
     * 
     * @param xinhuInfors 信息子投票项
     * @return 结果
     */
    public int updateXinhuInfors(XinhuInfors xinhuInfors);

    /**
     * 批量删除信息子投票项
     * 
     * @param ids 需要删除的信息子投票项主键集合
     * @return 结果
     */
    public int deleteXinhuInforsByIds(Long[] ids);

    /**
     * 删除信息子投票项信息
     * 
     * @param id 信息子投票项主键
     * @return 结果
     */
    public int deleteXinhuInforsById(Long id);
}
