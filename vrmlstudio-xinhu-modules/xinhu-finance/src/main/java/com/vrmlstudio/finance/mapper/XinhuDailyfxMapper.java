package com.vrmlstudio.finance.mapper;

import java.util.List;
import com.vrmlstudio.finance.domain.XinhuDailyfx;

/**
 * 日报分析统计Mapper接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface XinhuDailyfxMapper 
{
    /**
     * 查询日报分析统计
     * 
     * @param id 日报分析统计主键
     * @return 日报分析统计
     */
    public XinhuDailyfx selectXinhuDailyfxById(Long id);

    /**
     * 查询日报分析统计列表
     * 
     * @param xinhuDailyfx 日报分析统计
     * @return 日报分析统计集合
     */
    public List<XinhuDailyfx> selectXinhuDailyfxList(XinhuDailyfx xinhuDailyfx);

    /**
     * 新增日报分析统计
     * 
     * @param xinhuDailyfx 日报分析统计
     * @return 结果
     */
    public int insertXinhuDailyfx(XinhuDailyfx xinhuDailyfx);

    /**
     * 修改日报分析统计
     * 
     * @param xinhuDailyfx 日报分析统计
     * @return 结果
     */
    public int updateXinhuDailyfx(XinhuDailyfx xinhuDailyfx);

    /**
     * 删除日报分析统计
     * 
     * @param id 日报分析统计主键
     * @return 结果
     */
    public int deleteXinhuDailyfxById(Long id);

    /**
     * 批量删除日报分析统计
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuDailyfxByIds(Long[] ids);
}
