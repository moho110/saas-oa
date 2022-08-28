package com.vrmlstudio.hr.service;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuInfor;

/**
 * 通知公告Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuInforService 
{
    /**
     * 查询通知公告
     * 
     * @param id 通知公告主键
     * @return 通知公告
     */
    public XinhuInfor selectXinhuInforById(Long id);

    /**
     * 查询通知公告列表
     * 
     * @param xinhuInfor 通知公告
     * @return 通知公告集合
     */
    public List<XinhuInfor> selectXinhuInforList(XinhuInfor xinhuInfor);

    /**
     * 新增通知公告
     * 
     * @param xinhuInfor 通知公告
     * @return 结果
     */
    public int insertXinhuInfor(XinhuInfor xinhuInfor);

    /**
     * 修改通知公告
     * 
     * @param xinhuInfor 通知公告
     * @return 结果
     */
    public int updateXinhuInfor(XinhuInfor xinhuInfor);

    /**
     * 批量删除通知公告
     * 
     * @param ids 需要删除的通知公告主键集合
     * @return 结果
     */
    public int deleteXinhuInforByIds(Long[] ids);

    /**
     * 删除通知公告信息
     * 
     * @param id 通知公告主键
     * @return 结果
     */
    public int deleteXinhuInforById(Long id);
}
