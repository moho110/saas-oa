package com.vrmlstudio.hr.service;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuKqdw;

/**
 * 考勤定位规则Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuKqdwService 
{
    /**
     * 查询考勤定位规则
     * 
     * @param id 考勤定位规则主键
     * @return 考勤定位规则
     */
    public XinhuKqdw selectXinhuKqdwById(Integer id);

    /**
     * 查询考勤定位规则列表
     * 
     * @param xinhuKqdw 考勤定位规则
     * @return 考勤定位规则集合
     */
    public List<XinhuKqdw> selectXinhuKqdwList(XinhuKqdw xinhuKqdw);

    /**
     * 新增考勤定位规则
     * 
     * @param xinhuKqdw 考勤定位规则
     * @return 结果
     */
    public int insertXinhuKqdw(XinhuKqdw xinhuKqdw);

    /**
     * 修改考勤定位规则
     * 
     * @param xinhuKqdw 考勤定位规则
     * @return 结果
     */
    public int updateXinhuKqdw(XinhuKqdw xinhuKqdw);

    /**
     * 批量删除考勤定位规则
     * 
     * @param ids 需要删除的考勤定位规则主键集合
     * @return 结果
     */
    public int deleteXinhuKqdwByIds(Integer[] ids);

    /**
     * 删除考勤定位规则信息
     * 
     * @param id 考勤定位规则主键
     * @return 结果
     */
    public int deleteXinhuKqdwById(Integer id);
}
