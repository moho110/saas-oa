package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuKqxxsj;

/**
 * 休息时间规则Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuKqxxsjMapper 
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
     * 删除休息时间规则
     * 
     * @param id 休息时间规则主键
     * @return 结果
     */
    public int deleteXinhuKqxxsjById(Long id);

    /**
     * 批量删除休息时间规则
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuKqxxsjByIds(Long[] ids);
}
