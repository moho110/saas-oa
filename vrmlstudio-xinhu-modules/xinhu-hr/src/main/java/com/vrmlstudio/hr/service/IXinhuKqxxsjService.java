package com.vrmlstudio.hr.service;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuKqxxsj;

/**
 * 休息时间规则Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuKqxxsjService 
{
    /**
     * 查询休息时间规则
     * 
     * @param id 休息时间规则主键
     * @return 休息时间规则
     */
    public XinhuKqxxsj selectXinhuKqxxsjById(Long id);

    /**
     * 查询休息时间规则列表
     * 
     * @param xinhuKqxxsj 休息时间规则
     * @return 休息时间规则集合
     */
    public List<XinhuKqxxsj> selectXinhuKqxxsjList(XinhuKqxxsj xinhuKqxxsj);

    /**
     * 新增休息时间规则
     * 
     * @param xinhuKqxxsj 休息时间规则
     * @return 结果
     */
    public int insertXinhuKqxxsj(XinhuKqxxsj xinhuKqxxsj);

    /**
     * 修改休息时间规则
     * 
     * @param xinhuKqxxsj 休息时间规则
     * @return 结果
     */
    public int updateXinhuKqxxsj(XinhuKqxxsj xinhuKqxxsj);

    /**
     * 批量删除休息时间规则
     * 
     * @param ids 需要删除的休息时间规则主键集合
     * @return 结果
     */
    public int deleteXinhuKqxxsjByIds(Long[] ids);

    /**
     * 删除休息时间规则信息
     * 
     * @param id 休息时间规则主键
     * @return 结果
     */
    public int deleteXinhuKqxxsjById(Long id);
}
