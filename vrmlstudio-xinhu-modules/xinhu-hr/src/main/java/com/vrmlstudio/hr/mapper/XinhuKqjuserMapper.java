package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuKqjuser;

/**
 * 考勤机上人员Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuKqjuserMapper 
{
    /**
     * 查询考勤机上人员
     * 
     * @param id 考勤机上人员主键
     * @return 考勤机上人员
     */
    public XinhuKqjuser selectXinhuKqjuserById(Long id);

    /**
     * 查询考勤机上人员列表
     * 
     * @param xinhuKqjuser 考勤机上人员
     * @return 考勤机上人员集合
     */
    public List<XinhuKqjuser> selectXinhuKqjuserList(XinhuKqjuser xinhuKqjuser);

    /**
     * 新增考勤机上人员
     * 
     * @param xinhuKqjuser 考勤机上人员
     * @return 结果
     */
    public int insertXinhuKqjuser(XinhuKqjuser xinhuKqjuser);

    /**
     * 修改考勤机上人员
     * 
     * @param xinhuKqjuser 考勤机上人员
     * @return 结果
     */
    public int updateXinhuKqjuser(XinhuKqjuser xinhuKqjuser);

    /**
     * 删除考勤机上人员
     * 
     * @param id 考勤机上人员主键
     * @return 结果
     */
    public int deleteXinhuKqjuserById(Long id);

    /**
     * 批量删除考勤机上人员
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuKqjuserByIds(Long[] ids);
}
