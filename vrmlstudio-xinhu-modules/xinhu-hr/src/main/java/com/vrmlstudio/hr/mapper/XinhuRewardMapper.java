package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuReward;

/**
 * 奖惩Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuRewardMapper 
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
     * 删除奖惩
     * 
     * @param id 奖惩主键
     * @return 结果
     */
    public int deleteXinhuRewardById(Long id);

    /**
     * 批量删除奖惩
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuRewardByIds(Long[] ids);
}
