package com.vrmlstudio.resources.mapper;

import java.util.List;
import com.vrmlstudio.resources.domain.XinhuWork;

/**
 * 任务Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuWorkMapper 
{
    /**
     * 查询任务
     * 
     * @param id 任务主键
     * @return 任务
     */
    public XinhuWork selectXinhuWorkById(Long id);

    /**
     * 查询任务列表
     * 
     * @param xinhuWork 任务
     * @return 任务集合
     */
    public List<XinhuWork> selectXinhuWorkList(XinhuWork xinhuWork);

    /**
     * 新增任务
     * 
     * @param xinhuWork 任务
     * @return 结果
     */
    public int insertXinhuWork(XinhuWork xinhuWork);

    /**
     * 修改任务
     * 
     * @param xinhuWork 任务
     * @return 结果
     */
    public int updateXinhuWork(XinhuWork xinhuWork);

    /**
     * 删除任务
     * 
     * @param id 任务主键
     * @return 结果
     */
    public int deleteXinhuWorkById(Long id);

    /**
     * 批量删除任务
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuWorkByIds(Long[] ids);
}
