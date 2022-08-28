package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuHrkaohem;

/**
 * 考核项目Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuHrkaohemMapper 
{
    /**
     * 查询考核项目
     * 
     * @param id 考核项目主键
     * @return 考核项目
     */
    public XinhuHrkaohem selectXinhuHrkaohemById(Long id);

    /**
     * 查询考核项目列表
     * 
     * @param xinhuHrkaohem 考核项目
     * @return 考核项目集合
     */
    public List<XinhuHrkaohem> selectXinhuHrkaohemList(XinhuHrkaohem xinhuHrkaohem);

    /**
     * 新增考核项目
     * 
     * @param xinhuHrkaohem 考核项目
     * @return 结果
     */
    public int insertXinhuHrkaohem(XinhuHrkaohem xinhuHrkaohem);

    /**
     * 修改考核项目
     * 
     * @param xinhuHrkaohem 考核项目
     * @return 结果
     */
    public int updateXinhuHrkaohem(XinhuHrkaohem xinhuHrkaohem);

    /**
     * 删除考核项目
     * 
     * @param id 考核项目主键
     * @return 结果
     */
    public int deleteXinhuHrkaohemById(Long id);

    /**
     * 批量删除考核项目
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuHrkaohemByIds(Long[] ids);
}
