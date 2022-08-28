package com.vrmlstudio.resources.service;

import java.util.List;
import com.vrmlstudio.resources.domain.XinhuScheduld;

/**
 * 日程待办Service接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface IXinhuScheduldService 
{
    /**
     * 查询日程待办
     * 
     * @param id 日程待办主键
     * @return 日程待办
     */
    public XinhuScheduld selectXinhuScheduldById(Long id);

    /**
     * 查询日程待办列表
     * 
     * @param xinhuScheduld 日程待办
     * @return 日程待办集合
     */
    public List<XinhuScheduld> selectXinhuScheduldList(XinhuScheduld xinhuScheduld);

    /**
     * 新增日程待办
     * 
     * @param xinhuScheduld 日程待办
     * @return 结果
     */
    public int insertXinhuScheduld(XinhuScheduld xinhuScheduld);

    /**
     * 修改日程待办
     * 
     * @param xinhuScheduld 日程待办
     * @return 结果
     */
    public int updateXinhuScheduld(XinhuScheduld xinhuScheduld);

    /**
     * 批量删除日程待办
     * 
     * @param ids 需要删除的日程待办主键集合
     * @return 结果
     */
    public int deleteXinhuScheduldByIds(Long[] ids);

    /**
     * 删除日程待办信息
     * 
     * @param id 日程待办主键
     * @return 结果
     */
    public int deleteXinhuScheduldById(Long id);
}
