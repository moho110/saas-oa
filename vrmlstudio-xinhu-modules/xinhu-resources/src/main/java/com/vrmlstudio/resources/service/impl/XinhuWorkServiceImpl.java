package com.vrmlstudio.resources.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.resources.mapper.XinhuWorkMapper;
import com.vrmlstudio.resources.domain.XinhuWork;
import com.vrmlstudio.resources.service.IXinhuWorkService;

/**
 * 任务Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuWorkServiceImpl implements IXinhuWorkService 
{
    @Autowired
    private XinhuWorkMapper xinhuWorkMapper;

    /**
     * 查询任务
     * 
     * @param id 任务主键
     * @return 任务
     */
    @Override
    public XinhuWork selectXinhuWorkById(Long id)
    {
        return xinhuWorkMapper.selectXinhuWorkById(id);
    }

    /**
     * 查询任务列表
     * 
     * @param xinhuWork 任务
     * @return 任务
     */
    @Override
    public List<XinhuWork> selectXinhuWorkList(XinhuWork xinhuWork)
    {
        return xinhuWorkMapper.selectXinhuWorkList(xinhuWork);
    }

    /**
     * 新增任务
     * 
     * @param xinhuWork 任务
     * @return 结果
     */
    @Override
    public int insertXinhuWork(XinhuWork xinhuWork)
    {
        return xinhuWorkMapper.insertXinhuWork(xinhuWork);
    }

    /**
     * 修改任务
     * 
     * @param xinhuWork 任务
     * @return 结果
     */
    @Override
    public int updateXinhuWork(XinhuWork xinhuWork)
    {
        return xinhuWorkMapper.updateXinhuWork(xinhuWork);
    }

    /**
     * 批量删除任务
     * 
     * @param ids 需要删除的任务主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWorkByIds(Long[] ids)
    {
        return xinhuWorkMapper.deleteXinhuWorkByIds(ids);
    }

    /**
     * 删除任务信息
     * 
     * @param id 任务主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWorkById(Long id)
    {
        return xinhuWorkMapper.deleteXinhuWorkById(id);
    }
}
