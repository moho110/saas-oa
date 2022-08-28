package com.vrmlstudio.hr.service;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuKqsjgz;

/**
 * 考勤时间规则Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuKqsjgzService 
{
    /**
     * 查询考勤时间规则
     * 
     * @param id 考勤时间规则主键
     * @return 考勤时间规则
     */
    public XinhuKqsjgz selectXinhuKqsjgzById(Integer id);

    /**
     * 查询考勤时间规则列表
     * 
     * @param xinhuKqsjgz 考勤时间规则
     * @return 考勤时间规则集合
     */
    public List<XinhuKqsjgz> selectXinhuKqsjgzList(XinhuKqsjgz xinhuKqsjgz);

    /**
     * 新增考勤时间规则
     * 
     * @param xinhuKqsjgz 考勤时间规则
     * @return 结果
     */
    public int insertXinhuKqsjgz(XinhuKqsjgz xinhuKqsjgz);

    /**
     * 修改考勤时间规则
     * 
     * @param xinhuKqsjgz 考勤时间规则
     * @return 结果
     */
    public int updateXinhuKqsjgz(XinhuKqsjgz xinhuKqsjgz);

    /**
     * 批量删除考勤时间规则
     * 
     * @param ids 需要删除的考勤时间规则主键集合
     * @return 结果
     */
    public int deleteXinhuKqsjgzByIds(Integer[] ids);

    /**
     * 删除考勤时间规则信息
     * 
     * @param id 考勤时间规则主键
     * @return 结果
     */
    public int deleteXinhuKqsjgzById(Integer id);
}
