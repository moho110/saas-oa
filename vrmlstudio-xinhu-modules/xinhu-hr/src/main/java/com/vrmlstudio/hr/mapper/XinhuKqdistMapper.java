package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuKqdist;

/**
 * 考勤分配Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuKqdistMapper 
{
    /**
     * 查询考勤分配
     * 
     * @param id 考勤分配主键
     * @return 考勤分配
     */
    public XinhuKqdist selectXinhuKqdistById(Long id);

    /**
     * 查询考勤分配列表
     * 
     * @param xinhuKqdist 考勤分配
     * @return 考勤分配集合
     */
    public List<XinhuKqdist> selectXinhuKqdistList(XinhuKqdist xinhuKqdist);

    /**
     * 新增考勤分配
     * 
     * @param xinhuKqdist 考勤分配
     * @return 结果
     */
    public int insertXinhuKqdist(XinhuKqdist xinhuKqdist);

    /**
     * 修改考勤分配
     * 
     * @param xinhuKqdist 考勤分配
     * @return 结果
     */
    public int updateXinhuKqdist(XinhuKqdist xinhuKqdist);

    /**
     * 删除考勤分配
     * 
     * @param id 考勤分配主键
     * @return 结果
     */
    public int deleteXinhuKqdistById(Long id);

    /**
     * 批量删除考勤分配
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuKqdistByIds(Long[] ids);
}
