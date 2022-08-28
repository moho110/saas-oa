package com.vrmlstudio.hr.service;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuHrkaohes;

/**
 * 考核项目的内容Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuHrkaohesService 
{
    /**
     * 查询考核项目的内容
     * 
     * @param id 考核项目的内容主键
     * @return 考核项目的内容
     */
    public XinhuHrkaohes selectXinhuHrkaohesById(Long id);

    /**
     * 查询考核项目的内容列表
     * 
     * @param xinhuHrkaohes 考核项目的内容
     * @return 考核项目的内容集合
     */
    public List<XinhuHrkaohes> selectXinhuHrkaohesList(XinhuHrkaohes xinhuHrkaohes);

    /**
     * 新增考核项目的内容
     * 
     * @param xinhuHrkaohes 考核项目的内容
     * @return 结果
     */
    public int insertXinhuHrkaohes(XinhuHrkaohes xinhuHrkaohes);

    /**
     * 修改考核项目的内容
     * 
     * @param xinhuHrkaohes 考核项目的内容
     * @return 结果
     */
    public int updateXinhuHrkaohes(XinhuHrkaohes xinhuHrkaohes);

    /**
     * 批量删除考核项目的内容
     * 
     * @param ids 需要删除的考核项目的内容主键集合
     * @return 结果
     */
    public int deleteXinhuHrkaohesByIds(Long[] ids);

    /**
     * 删除考核项目的内容信息
     * 
     * @param id 考核项目的内容主键
     * @return 结果
     */
    public int deleteXinhuHrkaohesById(Long id);
}
