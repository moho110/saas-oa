package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuKqdkjl;

/**
 * 打卡记录Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuKqdkjlMapper 
{
    /**
     * 查询打卡记录
     * 
     * @param id 打卡记录主键
     * @return 打卡记录
     */
    public XinhuKqdkjl selectXinhuKqdkjlById(Long id);

    /**
     * 查询打卡记录列表
     * 
     * @param xinhuKqdkjl 打卡记录
     * @return 打卡记录集合
     */
    public List<XinhuKqdkjl> selectXinhuKqdkjlList(XinhuKqdkjl xinhuKqdkjl);

    /**
     * 新增打卡记录
     * 
     * @param xinhuKqdkjl 打卡记录
     * @return 结果
     */
    public int insertXinhuKqdkjl(XinhuKqdkjl xinhuKqdkjl);

    /**
     * 修改打卡记录
     * 
     * @param xinhuKqdkjl 打卡记录
     * @return 结果
     */
    public int updateXinhuKqdkjl(XinhuKqdkjl xinhuKqdkjl);

    /**
     * 删除打卡记录
     * 
     * @param id 打卡记录主键
     * @return 结果
     */
    public int deleteXinhuKqdkjlById(Long id);

    /**
     * 批量删除打卡记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuKqdkjlByIds(Long[] ids);
}
