package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuKnowtraim;

/**
 * 培训出题考试Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuKnowtraimMapper 
{
    /**
     * 查询培训出题考试
     * 
     * @param id 培训出题考试主键
     * @return 培训出题考试
     */
    public XinhuKnowtraim selectXinhuKnowtraimById(Long id);

    /**
     * 查询培训出题考试列表
     * 
     * @param xinhuKnowtraim 培训出题考试
     * @return 培训出题考试集合
     */
    public List<XinhuKnowtraim> selectXinhuKnowtraimList(XinhuKnowtraim xinhuKnowtraim);

    /**
     * 新增培训出题考试
     * 
     * @param xinhuKnowtraim 培训出题考试
     * @return 结果
     */
    public int insertXinhuKnowtraim(XinhuKnowtraim xinhuKnowtraim);

    /**
     * 修改培训出题考试
     * 
     * @param xinhuKnowtraim 培训出题考试
     * @return 结果
     */
    public int updateXinhuKnowtraim(XinhuKnowtraim xinhuKnowtraim);

    /**
     * 删除培训出题考试
     * 
     * @param id 培训出题考试主键
     * @return 结果
     */
    public int deleteXinhuKnowtraimById(Long id);

    /**
     * 批量删除培训出题考试
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuKnowtraimByIds(Long[] ids);
}
