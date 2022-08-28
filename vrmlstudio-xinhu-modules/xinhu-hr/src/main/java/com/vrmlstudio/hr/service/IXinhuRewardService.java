package com.vrmlstudio.hr.service;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuReward;

/**
 * 奖惩Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuRewardService 
{
    /**
     * 查询奖惩
     * 
     * @param id 奖惩主键
     * @return 奖惩
     */
    public XinhuReward selectXinhuRewardById(Long id);

    /**
     * 查询奖惩列表
     * 
     * @param xinhuReward 奖惩
     * @return 奖惩集合
     */
    public List<XinhuReward> selectXinhuRewardList(XinhuReward xinhuReward);

    /**
     * 新增奖惩
     * 
     * @param xinhuReward 奖惩
     * @return 结果
     */
    public int insertXinhuReward(XinhuReward xinhuReward);

    /**
     * 修改奖惩
     * 
     * @param xinhuReward 奖惩
     * @return 结果
     */
    public int updateXinhuReward(XinhuReward xinhuReward);

    /**
     * 批量删除奖惩
     * 
     * @param ids 需要删除的奖惩主键集合
     * @return 结果
     */
    public int deleteXinhuRewardByIds(Long[] ids);

    /**
     * 删除奖惩信息
     * 
     * @param id 奖惩主键
     * @return 结果
     */
    public int deleteXinhuRewardById(Long id);
}
