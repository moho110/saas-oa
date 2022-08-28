package com.vrmlstudio.document.mapper;

import java.util.List;
import com.vrmlstudio.document.domain.XinhuWenjuau;

/**
 * 问卷子Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuWenjuauMapper 
{
    /**
     * 查询问卷子
     * 
     * @param id 问卷子主键
     * @return 问卷子
     */
    public XinhuWenjuau selectXinhuWenjuauById(Long id);

    /**
     * 查询问卷子列表
     * 
     * @param xinhuWenjuau 问卷子
     * @return 问卷子集合
     */
    public List<XinhuWenjuau> selectXinhuWenjuauList(XinhuWenjuau xinhuWenjuau);

    /**
     * 新增问卷子
     * 
     * @param xinhuWenjuau 问卷子
     * @return 结果
     */
    public int insertXinhuWenjuau(XinhuWenjuau xinhuWenjuau);

    /**
     * 修改问卷子
     * 
     * @param xinhuWenjuau 问卷子
     * @return 结果
     */
    public int updateXinhuWenjuau(XinhuWenjuau xinhuWenjuau);

    /**
     * 删除问卷子
     * 
     * @param id 问卷子主键
     * @return 结果
     */
    public int deleteXinhuWenjuauById(Long id);

    /**
     * 批量删除问卷子
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuWenjuauByIds(Long[] ids);
}
