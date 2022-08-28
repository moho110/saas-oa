package com.vrmlstudio.resources.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.resources.mapper.XinhuScheduldMapper;
import com.vrmlstudio.resources.domain.XinhuScheduld;
import com.vrmlstudio.resources.service.IXinhuScheduldService;

/**
 * 日程待办Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuScheduldServiceImpl implements IXinhuScheduldService 
{
    @Autowired
    private XinhuScheduldMapper xinhuScheduldMapper;

    /**
     * 查询日程待办
     * 
     * @param id 日程待办主键
     * @return 日程待办
     */
    @Override
    public XinhuScheduld selectXinhuScheduldById(Long id)
    {
        return xinhuScheduldMapper.selectXinhuScheduldById(id);
    }

    /**
     * 查询日程待办列表
     * 
     * @param xinhuScheduld 日程待办
     * @return 日程待办
     */
    @Override
    public List<XinhuScheduld> selectXinhuScheduldList(XinhuScheduld xinhuScheduld)
    {
        return xinhuScheduldMapper.selectXinhuScheduldList(xinhuScheduld);
    }

    /**
     * 新增日程待办
     * 
     * @param xinhuScheduld 日程待办
     * @return 结果
     */
    @Override
    public int insertXinhuScheduld(XinhuScheduld xinhuScheduld)
    {
        return xinhuScheduldMapper.insertXinhuScheduld(xinhuScheduld);
    }

    /**
     * 修改日程待办
     * 
     * @param xinhuScheduld 日程待办
     * @return 结果
     */
    @Override
    public int updateXinhuScheduld(XinhuScheduld xinhuScheduld)
    {
        return xinhuScheduldMapper.updateXinhuScheduld(xinhuScheduld);
    }

    /**
     * 批量删除日程待办
     * 
     * @param ids 需要删除的日程待办主键
     * @return 结果
     */
    @Override
    public int deleteXinhuScheduldByIds(Long[] ids)
    {
        return xinhuScheduldMapper.deleteXinhuScheduldByIds(ids);
    }

    /**
     * 删除日程待办信息
     * 
     * @param id 日程待办主键
     * @return 结果
     */
    @Override
    public int deleteXinhuScheduldById(Long id)
    {
        return xinhuScheduldMapper.deleteXinhuScheduldById(id);
    }
}
