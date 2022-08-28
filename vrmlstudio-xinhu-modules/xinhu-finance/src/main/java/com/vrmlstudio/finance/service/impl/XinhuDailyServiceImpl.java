package com.vrmlstudio.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.finance.mapper.XinhuDailyMapper;
import com.vrmlstudio.finance.domain.XinhuDaily;
import com.vrmlstudio.finance.service.IXinhuDailyService;

/**
 * 日报Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuDailyServiceImpl implements IXinhuDailyService 
{
    @Autowired
    private XinhuDailyMapper xinhuDailyMapper;

    /**
     * 查询日报
     * 
     * @param id 日报主键
     * @return 日报
     */
    @Override
    public XinhuDaily selectXinhuDailyById(Long id)
    {
        return xinhuDailyMapper.selectXinhuDailyById(id);
    }

    /**
     * 查询日报列表
     * 
     * @param xinhuDaily 日报
     * @return 日报
     */
    @Override
    public List<XinhuDaily> selectXinhuDailyList(XinhuDaily xinhuDaily)
    {
        return xinhuDailyMapper.selectXinhuDailyList(xinhuDaily);
    }

    /**
     * 新增日报
     * 
     * @param xinhuDaily 日报
     * @return 结果
     */
    @Override
    public int insertXinhuDaily(XinhuDaily xinhuDaily)
    {
        return xinhuDailyMapper.insertXinhuDaily(xinhuDaily);
    }

    /**
     * 修改日报
     * 
     * @param xinhuDaily 日报
     * @return 结果
     */
    @Override
    public int updateXinhuDaily(XinhuDaily xinhuDaily)
    {
        return xinhuDailyMapper.updateXinhuDaily(xinhuDaily);
    }

    /**
     * 批量删除日报
     * 
     * @param ids 需要删除的日报主键
     * @return 结果
     */
    @Override
    public int deleteXinhuDailyByIds(Long[] ids)
    {
        return xinhuDailyMapper.deleteXinhuDailyByIds(ids);
    }

    /**
     * 删除日报信息
     * 
     * @param id 日报主键
     * @return 结果
     */
    @Override
    public int deleteXinhuDailyById(Long id)
    {
        return xinhuDailyMapper.deleteXinhuDailyById(id);
    }
}
