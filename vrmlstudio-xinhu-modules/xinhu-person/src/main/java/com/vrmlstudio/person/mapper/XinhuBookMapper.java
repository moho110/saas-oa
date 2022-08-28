package com.vrmlstudio.person.mapper;

import java.util.List;
import com.vrmlstudio.person.domain.XinhuBook;

/**
 * 图书Mapper接口
 * 
 * @author VR爱好者
 * @date 2022-02-18
 */
public interface XinhuBookMapper 
{
    /**
     * 查询图书
     * 
     * @param id 图书主键
     * @return 图书
     */
    public XinhuBook selectXinhuBookById(Long id);

    /**
     * 查询图书列表
     * 
     * @param xinhuBook 图书
     * @return 图书集合
     */
    public List<XinhuBook> selectXinhuBookList(XinhuBook xinhuBook);

    /**
     * 新增图书
     * 
     * @param xinhuBook 图书
     * @return 结果
     */
    public int insertXinhuBook(XinhuBook xinhuBook);

    /**
     * 修改图书
     * 
     * @param xinhuBook 图书
     * @return 结果
     */
    public int updateXinhuBook(XinhuBook xinhuBook);

    /**
     * 删除图书
     * 
     * @param id 图书主键
     * @return 结果
     */
    public int deleteXinhuBookById(Long id);

    /**
     * 批量删除图书
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuBookByIds(Long[] ids);
}
