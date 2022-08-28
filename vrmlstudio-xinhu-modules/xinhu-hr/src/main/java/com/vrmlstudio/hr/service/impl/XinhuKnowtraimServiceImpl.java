package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuKnowtraim;
import com.vrmlstudio.hr.mapper.XinhuKnowtraimMapper;
import com.vrmlstudio.hr.service.IXinhuKnowtraimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 培训出题考试Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuKnowtraimServiceImpl implements IXinhuKnowtraimService
{
    @Autowired
    private XinhuKnowtraimMapper xinhuKnowtraimMapper;

    /**
     * 查询培训出题考试
     * 
     * @param id 培训出题考试主键
     * @return 培训出题考试
     */
    @Override
    public XinhuKnowtraim selectXinhuKnowtraimById(Long id)
    {
        return xinhuKnowtraimMapper.selectXinhuKnowtraimById(id);
    }

    /**
     * 查询培训出题考试列表
     * 
     * @param xinhuKnowtraim 培训出题考试
     * @return 培训出题考试
     */
    @Override
    public List<XinhuKnowtraim> selectXinhuKnowtraimList(XinhuKnowtraim xinhuKnowtraim)
    {
        return xinhuKnowtraimMapper.selectXinhuKnowtraimList(xinhuKnowtraim);
    }

    /**
     * 新增培训出题考试
     * 
     * @param xinhuKnowtraim 培训出题考试
     * @return 结果
     */
    @Override
    public int insertXinhuKnowtraim(XinhuKnowtraim xinhuKnowtraim)
    {
        return xinhuKnowtraimMapper.insertXinhuKnowtraim(xinhuKnowtraim);
    }

    /**
     * 修改培训出题考试
     * 
     * @param xinhuKnowtraim 培训出题考试
     * @return 结果
     */
    @Override
    public int updateXinhuKnowtraim(XinhuKnowtraim xinhuKnowtraim)
    {
        return xinhuKnowtraimMapper.updateXinhuKnowtraim(xinhuKnowtraim);
    }

    /**
     * 批量删除培训出题考试
     * 
     * @param ids 需要删除的培训出题考试主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKnowtraimByIds(Long[] ids)
    {
        return xinhuKnowtraimMapper.deleteXinhuKnowtraimByIds(ids);
    }

    /**
     * 删除培训出题考试信息
     * 
     * @param id 培训出题考试主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKnowtraimById(Long id)
    {
        return xinhuKnowtraimMapper.deleteXinhuKnowtraimById(id);
    }
}
