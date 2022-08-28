package com.vrmlstudio.person.mapper;

import java.util.List;
import com.vrmlstudio.person.domain.XinhuHomeitems;

/**
 * 桌面项目Mapper接口
 * 
 * @author VR爱好者
 * @date 2022-02-18
 */
public interface XinhuHomeitemsMapper 
{
    /**
     * 查询桌面项目
     * 
     * @param id 桌面项目主键
     * @return 桌面项目
     */
    public XinhuHomeitems selectXinhuHomeitemsById(Long id);

    /**
     * 查询桌面项目列表
     * 
     * @param xinhuHomeitems 桌面项目
     * @return 桌面项目集合
     */
    public List<XinhuHomeitems> selectXinhuHomeitemsList(XinhuHomeitems xinhuHomeitems);

    /**
     * 新增桌面项目
     * 
     * @param xinhuHomeitems 桌面项目
     * @return 结果
     */
    public int insertXinhuHomeitems(XinhuHomeitems xinhuHomeitems);

    /**
     * 修改桌面项目
     * 
     * @param xinhuHomeitems 桌面项目
     * @return 结果
     */
    public int updateXinhuHomeitems(XinhuHomeitems xinhuHomeitems);

    /**
     * 删除桌面项目
     * 
     * @param id 桌面项目主键
     * @return 结果
     */
    public int deleteXinhuHomeitemsById(Long id);

    /**
     * 批量删除桌面项目
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuHomeitemsByIds(Long[] ids);
}
