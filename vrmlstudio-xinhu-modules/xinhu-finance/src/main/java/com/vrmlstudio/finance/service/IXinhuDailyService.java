package com.vrmlstudio.finance.service;

import java.util.List;
import com.vrmlstudio.finance.domain.XinhuDaily;

/**
 * 日报Service接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface IXinhuDailyService 
{
    /**
     * 查询日报
     * 
     * @param id 日报主键
     * @return 日报
     */
    public XinhuDaily selectXinhuDailyById(Long id);

    /**
     * 查询日报列表
     * 
     * @param xinhuDaily 日报
     * @return 日报集合
     */
    public List<XinhuDaily> selectXinhuDailyList(XinhuDaily xinhuDaily);

    /**
     * 新增日报
     * 
     * @param xinhuDaily 日报
     * @return 结果
     */
    public int insertXinhuDaily(XinhuDaily xinhuDaily);

    /**
     * 修改日报
     * 
     * @param xinhuDaily 日报
     * @return 结果
     */
    public int updateXinhuDaily(XinhuDaily xinhuDaily);

    /**
     * 批量删除日报
     * 
     * @param ids 需要删除的日报主键集合
     * @return 结果
     */
    public int deleteXinhuDailyByIds(Long[] ids);

    /**
     * 删除日报信息
     * 
     * @param id 日报主键
     * @return 结果
     */
    public int deleteXinhuDailyById(Long id);
}
