package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuKqanay;

/**
 * 考勤分析Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuKqanayMapper 
{
    /**
     * 查询考勤分析
     * 
     * @param id 考勤分析主键
     * @return 考勤分析
     */
    public XinhuKqanay selectXinhuKqanayById(Long id);

    /**
     * 查询考勤分析列表
     * 
     * @param xinhuKqanay 考勤分析
     * @return 考勤分析集合
     */
    public List<XinhuKqanay> selectXinhuKqanayList(XinhuKqanay xinhuKqanay);

    /**
     * 新增考勤分析
     * 
     * @param xinhuKqanay 考勤分析
     * @return 结果
     */
    public int insertXinhuKqanay(XinhuKqanay xinhuKqanay);

    /**
     * 修改考勤分析
     * 
     * @param xinhuKqanay 考勤分析
     * @return 结果
     */
    public int updateXinhuKqanay(XinhuKqanay xinhuKqanay);

    /**
     * 删除考勤分析
     * 
     * @param id 考勤分析主键
     * @return 结果
     */
    public int deleteXinhuKqanayById(Long id);

    /**
     * 批量删除考勤分析
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuKqanayByIds(Long[] ids);
}
