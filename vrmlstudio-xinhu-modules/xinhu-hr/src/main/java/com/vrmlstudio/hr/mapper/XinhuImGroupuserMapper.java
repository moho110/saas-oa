package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuImGroupuser;

/**
 * IM会话人员Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuImGroupuserMapper 
{
    /**
     * 查询IM会话人员
     * 
     * @param id IM会话人员主键
     * @return IM会话人员
     */
    public XinhuImGroupuser selectXinhuImGroupuserById(Long id);

    /**
     * 查询IM会话人员列表
     * 
     * @param xinhuImGroupuser IM会话人员
     * @return IM会话人员集合
     */
    public List<XinhuImGroupuser> selectXinhuImGroupuserList(XinhuImGroupuser xinhuImGroupuser);

    /**
     * 新增IM会话人员
     * 
     * @param xinhuImGroupuser IM会话人员
     * @return 结果
     */
    public int insertXinhuImGroupuser(XinhuImGroupuser xinhuImGroupuser);

    /**
     * 修改IM会话人员
     * 
     * @param xinhuImGroupuser IM会话人员
     * @return 结果
     */
    public int updateXinhuImGroupuser(XinhuImGroupuser xinhuImGroupuser);

    /**
     * 删除IM会话人员
     * 
     * @param id IM会话人员主键
     * @return 结果
     */
    public int deleteXinhuImGroupuserById(Long id);

    /**
     * 批量删除IM会话人员
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuImGroupuserByIds(Long[] ids);
}
