package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuImMess;
import com.vrmlstudio.hr.mapper.XinhuImMessMapper;
import com.vrmlstudio.hr.service.IXinhuImMessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * IM聊天记录Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuImMessServiceImpl implements IXinhuImMessService
{
    @Autowired
    private XinhuImMessMapper xinhuImMessMapper;

    /**
     * 查询IM聊天记录
     * 
     * @param id IM聊天记录主键
     * @return IM聊天记录
     */
    @Override
    public XinhuImMess selectXinhuImMessById(Long id)
    {
        return xinhuImMessMapper.selectXinhuImMessById(id);
    }

    /**
     * 查询IM聊天记录列表
     * 
     * @param xinhuImMess IM聊天记录
     * @return IM聊天记录
     */
    @Override
    public List<XinhuImMess> selectXinhuImMessList(XinhuImMess xinhuImMess)
    {
        return xinhuImMessMapper.selectXinhuImMessList(xinhuImMess);
    }

    /**
     * 新增IM聊天记录
     * 
     * @param xinhuImMess IM聊天记录
     * @return 结果
     */
    @Override
    public int insertXinhuImMess(XinhuImMess xinhuImMess)
    {
        return xinhuImMessMapper.insertXinhuImMess(xinhuImMess);
    }

    /**
     * 修改IM聊天记录
     * 
     * @param xinhuImMess IM聊天记录
     * @return 结果
     */
    @Override
    public int updateXinhuImMess(XinhuImMess xinhuImMess)
    {
        return xinhuImMessMapper.updateXinhuImMess(xinhuImMess);
    }

    /**
     * 批量删除IM聊天记录
     * 
     * @param ids 需要删除的IM聊天记录主键
     * @return 结果
     */
    @Override
    public int deleteXinhuImMessByIds(Long[] ids)
    {
        return xinhuImMessMapper.deleteXinhuImMessByIds(ids);
    }

    /**
     * 删除IM聊天记录信息
     * 
     * @param id IM聊天记录主键
     * @return 结果
     */
    @Override
    public int deleteXinhuImMessById(Long id)
    {
        return xinhuImMessMapper.deleteXinhuImMessById(id);
    }
}
