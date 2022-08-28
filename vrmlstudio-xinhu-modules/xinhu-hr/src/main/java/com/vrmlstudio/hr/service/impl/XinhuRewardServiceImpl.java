package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuReward;
import com.vrmlstudio.hr.mapper.XinhuRewardMapper;
import com.vrmlstudio.hr.service.IXinhuRewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 奖惩Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuRewardServiceImpl implements IXinhuRewardService
{
    @Autowired
    private XinhuRewardMapper xinhuRewardMapper;

    /**
     * 查询奖惩
     * 
     * @param id 奖惩主键
     * @return 奖惩
     */
    @Override
    public XinhuReward selectXinhuRewardById(Long id)
    {
        return xinhuRewardMapper.selectXinhuRewardById(id);
    }

    /**
     * 查询奖惩列表
     * 
     * @param xinhuReward 奖惩
     * @return 奖惩
     */
    @Override
    public List<XinhuReward> selectXinhuRewardList(XinhuReward xinhuReward)
    {
        return xinhuRewardMapper.selectXinhuRewardList(xinhuReward);
    }

    /**
     * 新增奖惩
     * 
     * @param xinhuReward 奖惩
     * @return 结果
     */
    @Override
    public int insertXinhuReward(XinhuReward xinhuReward)
    {
        return xinhuRewardMapper.insertXinhuReward(xinhuReward);
    }

    /**
     * 修改奖惩
     * 
     * @param xinhuReward 奖惩
     * @return 结果
     */
    @Override
    public int updateXinhuReward(XinhuReward xinhuReward)
    {
        return xinhuRewardMapper.updateXinhuReward(xinhuReward);
    }

    /**
     * 批量删除奖惩
     * 
     * @param ids 需要删除的奖惩主键
     * @return 结果
     */
    @Override
    public int deleteXinhuRewardByIds(Long[] ids)
    {
        return xinhuRewardMapper.deleteXinhuRewardByIds(ids);
    }

    /**
     * 删除奖惩信息
     * 
     * @param id 奖惩主键
     * @return 结果
     */
    @Override
    public int deleteXinhuRewardById(Long id)
    {
        return xinhuRewardMapper.deleteXinhuRewardById(id);
    }
}
