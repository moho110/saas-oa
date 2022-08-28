package com.vrmlstudio.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.finance.mapper.XinhuDailyfxMapper;
import com.vrmlstudio.finance.domain.XinhuDailyfx;
import com.vrmlstudio.finance.service.IXinhuDailyfxService;

/**
 * 日报分析统计Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuDailyfxServiceImpl implements IXinhuDailyfxService 
{
    @Autowired
    private XinhuDailyfxMapper xinhuDailyfxMapper;

    /**
     * 查询日报分析统计
     * 
     * @param id 日报分析统计主键
     * @return 日报分析统计
     */
    @Override
    public XinhuDailyfx selectXinhuDailyfxById(Long id)
    {
        return xinhuDailyfxMapper.selectXinhuDailyfxById(id);
    }

    /**
     * 查询日报分析统计列表
     * 
     * @param xinhuDailyfx 日报分析统计
     * @return 日报分析统计
     */
    @Override
    public List<XinhuDailyfx> selectXinhuDailyfxList(XinhuDailyfx xinhuDailyfx)
    {
        return xinhuDailyfxMapper.selectXinhuDailyfxList(xinhuDailyfx);
    }

    /**
     * 新增日报分析统计
     * 
     * @param xinhuDailyfx 日报分析统计
     * @return 结果
     */
    @Override
    public int insertXinhuDailyfx(XinhuDailyfx xinhuDailyfx)
    {
        return xinhuDailyfxMapper.insertXinhuDailyfx(xinhuDailyfx);
    }

    /**
     * 修改日报分析统计
     * 
     * @param xinhuDailyfx 日报分析统计
     * @return 结果
     */
    @Override
    public int updateXinhuDailyfx(XinhuDailyfx xinhuDailyfx)
    {
        return xinhuDailyfxMapper.updateXinhuDailyfx(xinhuDailyfx);
    }

    /**
     * 批量删除日报分析统计
     * 
     * @param ids 需要删除的日报分析统计主键
     * @return 结果
     */
    @Override
    public int deleteXinhuDailyfxByIds(Long[] ids)
    {
        return xinhuDailyfxMapper.deleteXinhuDailyfxByIds(ids);
    }

    /**
     * 删除日报分析统计信息
     * 
     * @param id 日报分析统计主键
     * @return 结果
     */
    @Override
    public int deleteXinhuDailyfxById(Long id)
    {
        return xinhuDailyfxMapper.deleteXinhuDailyfxById(id);
    }
}
