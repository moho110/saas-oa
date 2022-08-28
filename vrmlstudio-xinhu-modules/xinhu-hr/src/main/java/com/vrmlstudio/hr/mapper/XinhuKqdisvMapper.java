package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuKqdisv;

/**
 * 考勤排班Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuKqdisvMapper 
{
    /**
     * 查询考勤排班
     * 
     * @param id 考勤排班主键
     * @return 考勤排班
     */
    public XinhuKqdisv selectXinhuKqdisvById(Long id);

    /**
     * 查询考勤排班列表
     * 
     * @param xinhuKqdisv 考勤排班
     * @return 考勤排班集合
     */
    public List<XinhuKqdisv> selectXinhuKqdisvList(XinhuKqdisv xinhuKqdisv);

    /**
     * 新增考勤排班
     * 
     * @param xinhuKqdisv 考勤排班
     * @return 结果
     */
    public int insertXinhuKqdisv(XinhuKqdisv xinhuKqdisv);

    /**
     * 修改考勤排班
     * 
     * @param xinhuKqdisv 考勤排班
     * @return 结果
     */
    public int updateXinhuKqdisv(XinhuKqdisv xinhuKqdisv);

    /**
     * 删除考勤排班
     * 
     * @param id 考勤排班主键
     * @return 结果
     */
    public int deleteXinhuKqdisvById(Long id);

    /**
     * 批量删除考勤排班
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuKqdisvByIds(Long[] ids);
}
