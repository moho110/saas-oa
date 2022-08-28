package com.vrmlstudio.hr.service;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuKqjsn;

/**
 * 考勤机设备Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuKqjsnService 
{
    /**
     * 查询考勤机设备
     * 
     * @param id 考勤机设备主键
     * @return 考勤机设备
     */
    public XinhuKqjsn selectXinhuKqjsnById(Long id);

    /**
     * 查询考勤机设备列表
     * 
     * @param xinhuKqjsn 考勤机设备
     * @return 考勤机设备集合
     */
    public List<XinhuKqjsn> selectXinhuKqjsnList(XinhuKqjsn xinhuKqjsn);

    /**
     * 新增考勤机设备
     * 
     * @param xinhuKqjsn 考勤机设备
     * @return 结果
     */
    public int insertXinhuKqjsn(XinhuKqjsn xinhuKqjsn);

    /**
     * 修改考勤机设备
     * 
     * @param xinhuKqjsn 考勤机设备
     * @return 结果
     */
    public int updateXinhuKqjsn(XinhuKqjsn xinhuKqjsn);

    /**
     * 批量删除考勤机设备
     * 
     * @param ids 需要删除的考勤机设备主键集合
     * @return 结果
     */
    public int deleteXinhuKqjsnByIds(Long[] ids);

    /**
     * 删除考勤机设备信息
     * 
     * @param id 考勤机设备主键
     * @return 结果
     */
    public int deleteXinhuKqjsnById(Long id);
}
