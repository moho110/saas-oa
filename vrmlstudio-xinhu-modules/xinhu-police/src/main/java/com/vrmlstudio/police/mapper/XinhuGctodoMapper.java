package com.vrmlstudio.police.mapper;

import java.util.List;
import com.vrmlstudio.police.domain.XinhuGctodo;

/**
 * 工程通知Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuGctodoMapper 
{
    /**
     * 查询工程通知
     * 
     * @param id 工程通知主键
     * @return 工程通知
     */
    public XinhuGctodo selectXinhuGctodoById(Long id);

    /**
     * 查询工程通知列表
     * 
     * @param xinhuGctodo 工程通知
     * @return 工程通知集合
     */
    public List<XinhuGctodo> selectXinhuGctodoList(XinhuGctodo xinhuGctodo);

    /**
     * 新增工程通知
     * 
     * @param xinhuGctodo 工程通知
     * @return 结果
     */
    public int insertXinhuGctodo(XinhuGctodo xinhuGctodo);

    /**
     * 修改工程通知
     * 
     * @param xinhuGctodo 工程通知
     * @return 结果
     */
    public int updateXinhuGctodo(XinhuGctodo xinhuGctodo);

    /**
     * 删除工程通知
     * 
     * @param id 工程通知主键
     * @return 结果
     */
    public int deleteXinhuGctodoById(Long id);

    /**
     * 批量删除工程通知
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuGctodoByIds(Long[] ids);
}
