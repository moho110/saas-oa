package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuVcard;

/**
 * 个人通讯录Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuVcardMapper 
{
    /**
     * 查询个人通讯录
     * 
     * @param id 个人通讯录主键
     * @return 个人通讯录
     */
    public XinhuVcard selectXinhuVcardById(Long id);

    /**
     * 查询个人通讯录列表
     * 
     * @param xinhuVcard 个人通讯录
     * @return 个人通讯录集合
     */
    public List<XinhuVcard> selectXinhuVcardList(XinhuVcard xinhuVcard);

    /**
     * 新增个人通讯录
     * 
     * @param xinhuVcard 个人通讯录
     * @return 结果
     */
    public int insertXinhuVcard(XinhuVcard xinhuVcard);

    /**
     * 修改个人通讯录
     * 
     * @param xinhuVcard 个人通讯录
     * @return 结果
     */
    public int updateXinhuVcard(XinhuVcard xinhuVcard);

    /**
     * 删除个人通讯录
     * 
     * @param id 个人通讯录主键
     * @return 结果
     */
    public int deleteXinhuVcardById(Long id);

    /**
     * 批量删除个人通讯录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuVcardByIds(Long[] ids);
}
