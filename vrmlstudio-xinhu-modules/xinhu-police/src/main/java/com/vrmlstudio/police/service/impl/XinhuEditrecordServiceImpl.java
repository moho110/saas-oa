package com.vrmlstudio.police.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.police.mapper.XinhuEditrecordMapper;
import com.vrmlstudio.police.domain.XinhuEditrecord;
import com.vrmlstudio.police.service.IXinhuEditrecordService;

/**
 * 修改记录Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuEditrecordServiceImpl implements IXinhuEditrecordService 
{
    @Autowired
    private XinhuEditrecordMapper xinhuEditrecordMapper;

    /**
     * 查询修改记录
     * 
     * @param id 修改记录主键
     * @return 修改记录
     */
    @Override
    public XinhuEditrecord selectXinhuEditrecordById(Long id)
    {
        return xinhuEditrecordMapper.selectXinhuEditrecordById(id);
    }

    /**
     * 查询修改记录列表
     * 
     * @param xinhuEditrecord 修改记录
     * @return 修改记录
     */
    @Override
    public List<XinhuEditrecord> selectXinhuEditrecordList(XinhuEditrecord xinhuEditrecord)
    {
        return xinhuEditrecordMapper.selectXinhuEditrecordList(xinhuEditrecord);
    }

    /**
     * 新增修改记录
     * 
     * @param xinhuEditrecord 修改记录
     * @return 结果
     */
    @Override
    public int insertXinhuEditrecord(XinhuEditrecord xinhuEditrecord)
    {
        return xinhuEditrecordMapper.insertXinhuEditrecord(xinhuEditrecord);
    }

    /**
     * 修改修改记录
     * 
     * @param xinhuEditrecord 修改记录
     * @return 结果
     */
    @Override
    public int updateXinhuEditrecord(XinhuEditrecord xinhuEditrecord)
    {
        return xinhuEditrecordMapper.updateXinhuEditrecord(xinhuEditrecord);
    }

    /**
     * 批量删除修改记录
     * 
     * @param ids 需要删除的修改记录主键
     * @return 结果
     */
    @Override
    public int deleteXinhuEditrecordByIds(Long[] ids)
    {
        return xinhuEditrecordMapper.deleteXinhuEditrecordByIds(ids);
    }

    /**
     * 删除修改记录信息
     * 
     * @param id 修改记录主键
     * @return 结果
     */
    @Override
    public int deleteXinhuEditrecordById(Long id)
    {
        return xinhuEditrecordMapper.deleteXinhuEditrecordById(id);
    }
}
