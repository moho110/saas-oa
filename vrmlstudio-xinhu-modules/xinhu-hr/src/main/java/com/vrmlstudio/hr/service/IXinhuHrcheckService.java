package com.vrmlstudio.hr.service;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuHrcheck;

/**
 * 考核评分Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuHrcheckService 
{
    /**
     * 查询考核评分
     * 
     * @param id 考核评分主键
     * @return 考核评分
     */
    public XinhuHrcheck selectXinhuHrcheckById(Long id);

    /**
     * 查询考核评分列表
     * 
     * @param xinhuHrcheck 考核评分
     * @return 考核评分集合
     */
    public List<XinhuHrcheck> selectXinhuHrcheckList(XinhuHrcheck xinhuHrcheck);

    /**
     * 新增考核评分
     * 
     * @param xinhuHrcheck 考核评分
     * @return 结果
     */
    public int insertXinhuHrcheck(XinhuHrcheck xinhuHrcheck);

    /**
     * 修改考核评分
     * 
     * @param xinhuHrcheck 考核评分
     * @return 结果
     */
    public int updateXinhuHrcheck(XinhuHrcheck xinhuHrcheck);

    /**
     * 批量删除考核评分
     * 
     * @param ids 需要删除的考核评分主键集合
     * @return 结果
     */
    public int deleteXinhuHrcheckByIds(Long[] ids);

    /**
     * 删除考核评分信息
     * 
     * @param id 考核评分主键
     * @return 结果
     */
    public int deleteXinhuHrcheckById(Long id);
}
