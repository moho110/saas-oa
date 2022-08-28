package com.vrmlstudio.person.mapper;

import java.util.List;
import com.vrmlstudio.person.domain.XinhuBookborrow;

/**
 * 图书借阅Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuBookborrowMapper 
{
    /**
     * 查询图书借阅
     * 
     * @param id 图书借阅主键
     * @return 图书借阅
     */
    public XinhuBookborrow selectXinhuBookborrowById(Long id);

    /**
     * 查询图书借阅列表
     * 
     * @param xinhuBookborrow 图书借阅
     * @return 图书借阅集合
     */
    public List<XinhuBookborrow> selectXinhuBookborrowList(XinhuBookborrow xinhuBookborrow);

    /**
     * 新增图书借阅
     * 
     * @param xinhuBookborrow 图书借阅
     * @return 结果
     */
    public int insertXinhuBookborrow(XinhuBookborrow xinhuBookborrow);

    /**
     * 修改图书借阅
     * 
     * @param xinhuBookborrow 图书借阅
     * @return 结果
     */
    public int updateXinhuBookborrow(XinhuBookborrow xinhuBookborrow);

    /**
     * 删除图书借阅
     * 
     * @param id 图书借阅主键
     * @return 结果
     */
    public int deleteXinhuBookborrowById(Long id);

    /**
     * 批量删除图书借阅
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuBookborrowByIds(Long[] ids);
}
