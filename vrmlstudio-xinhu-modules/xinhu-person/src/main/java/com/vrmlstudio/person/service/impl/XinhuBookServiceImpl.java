package com.vrmlstudio.person.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.person.mapper.XinhuBookMapper;
import com.vrmlstudio.person.domain.XinhuBook;
import com.vrmlstudio.person.service.IXinhuBookService;

/**
 * 图书Service业务层处理
 * 
 * @author VR爱好者
 * @date 2022-02-18
 */
@Service
public class XinhuBookServiceImpl implements IXinhuBookService 
{
    @Autowired
    private XinhuBookMapper xinhuBookMapper;

    /**
     * 查询图书
     * 
     * @param id 图书主键
     * @return 图书
     */
    @Override
    public XinhuBook selectXinhuBookById(Long id)
    {
        return xinhuBookMapper.selectXinhuBookById(id);
    }

    /**
     * 查询图书列表
     * 
     * @param xinhuBook 图书
     * @return 图书
     */
    @Override
    public List<XinhuBook> selectXinhuBookList(XinhuBook xinhuBook)
    {
        return xinhuBookMapper.selectXinhuBookList(xinhuBook);
    }

    /**
     * 新增图书
     * 
     * @param xinhuBook 图书
     * @return 结果
     */
    @Override
    public int insertXinhuBook(XinhuBook xinhuBook)
    {
        return xinhuBookMapper.insertXinhuBook(xinhuBook);
    }

    /**
     * 修改图书
     * 
     * @param xinhuBook 图书
     * @return 结果
     */
    @Override
    public int updateXinhuBook(XinhuBook xinhuBook)
    {
        return xinhuBookMapper.updateXinhuBook(xinhuBook);
    }

    /**
     * 批量删除图书
     * 
     * @param ids 需要删除的图书主键
     * @return 结果
     */
    @Override
    public int deleteXinhuBookByIds(Long[] ids)
    {
        return xinhuBookMapper.deleteXinhuBookByIds(ids);
    }

    /**
     * 删除图书信息
     * 
     * @param id 图书主键
     * @return 结果
     */
    @Override
    public int deleteXinhuBookById(Long id)
    {
        return xinhuBookMapper.deleteXinhuBookById(id);
    }
}
