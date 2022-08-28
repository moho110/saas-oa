package com.vrmlstudio.person.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.person.mapper.XinhuBookborrowMapper;
import com.vrmlstudio.person.domain.XinhuBookborrow;
import com.vrmlstudio.person.service.IXinhuBookborrowService;

/**
 * 图书借阅Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuBookborrowServiceImpl implements IXinhuBookborrowService 
{
    @Autowired
    private XinhuBookborrowMapper xinhuBookborrowMapper;

    /**
     * 查询图书借阅
     * 
     * @param id 图书借阅主键
     * @return 图书借阅
     */
    @Override
    public XinhuBookborrow selectXinhuBookborrowById(Long id)
    {
        return xinhuBookborrowMapper.selectXinhuBookborrowById(id);
    }

    /**
     * 查询图书借阅列表
     * 
     * @param xinhuBookborrow 图书借阅
     * @return 图书借阅
     */
    @Override
    public List<XinhuBookborrow> selectXinhuBookborrowList(XinhuBookborrow xinhuBookborrow)
    {
        return xinhuBookborrowMapper.selectXinhuBookborrowList(xinhuBookborrow);
    }

    /**
     * 新增图书借阅
     * 
     * @param xinhuBookborrow 图书借阅
     * @return 结果
     */
    @Override
    public int insertXinhuBookborrow(XinhuBookborrow xinhuBookborrow)
    {
        return xinhuBookborrowMapper.insertXinhuBookborrow(xinhuBookborrow);
    }

    /**
     * 修改图书借阅
     * 
     * @param xinhuBookborrow 图书借阅
     * @return 结果
     */
    @Override
    public int updateXinhuBookborrow(XinhuBookborrow xinhuBookborrow)
    {
        return xinhuBookborrowMapper.updateXinhuBookborrow(xinhuBookborrow);
    }

    /**
     * 批量删除图书借阅
     * 
     * @param ids 需要删除的图书借阅主键
     * @return 结果
     */
    @Override
    public int deleteXinhuBookborrowByIds(Long[] ids)
    {
        return xinhuBookborrowMapper.deleteXinhuBookborrowByIds(ids);
    }

    /**
     * 删除图书借阅信息
     * 
     * @param id 图书借阅主键
     * @return 结果
     */
    @Override
    public int deleteXinhuBookborrowById(Long id)
    {
        return xinhuBookborrowMapper.deleteXinhuBookborrowById(id);
    }
}
