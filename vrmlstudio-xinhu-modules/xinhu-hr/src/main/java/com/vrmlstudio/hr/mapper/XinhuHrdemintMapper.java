package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuHrdemint;

/**
 * 面试和人员需求Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuHrdemintMapper 
{
    /**
     * 查询面试和人员需求
     * 
     * @param id 面试和人员需求主键
     * @return 面试和人员需求
     */
    public XinhuHrdemint selectXinhuHrdemintById(Long id);

    /**
     * 查询面试和人员需求列表
     * 
     * @param xinhuHrdemint 面试和人员需求
     * @return 面试和人员需求集合
     */
    public List<XinhuHrdemint> selectXinhuHrdemintList(XinhuHrdemint xinhuHrdemint);

    /**
     * 新增面试和人员需求
     * 
     * @param xinhuHrdemint 面试和人员需求
     * @return 结果
     */
    public int insertXinhuHrdemint(XinhuHrdemint xinhuHrdemint);

    /**
     * 修改面试和人员需求
     * 
     * @param xinhuHrdemint 面试和人员需求
     * @return 结果
     */
    public int updateXinhuHrdemint(XinhuHrdemint xinhuHrdemint);

    /**
     * 删除面试和人员需求
     * 
     * @param id 面试和人员需求主键
     * @return 结果
     */
    public int deleteXinhuHrdemintById(Long id);

    /**
     * 批量删除面试和人员需求
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuHrdemintByIds(Long[] ids);
}
