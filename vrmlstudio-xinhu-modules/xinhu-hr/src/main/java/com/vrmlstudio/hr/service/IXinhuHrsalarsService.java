package com.vrmlstudio.hr.service;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuHrsalars;

/**
 * 薪资模版子Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuHrsalarsService 
{
    /**
     * 查询薪资模版子
     * 
     * @param id 薪资模版子主键
     * @return 薪资模版子
     */
    public XinhuHrsalars selectXinhuHrsalarsById(Long id);

    /**
     * 查询薪资模版子列表
     * 
     * @param xinhuHrsalars 薪资模版子
     * @return 薪资模版子集合
     */
    public List<XinhuHrsalars> selectXinhuHrsalarsList(XinhuHrsalars xinhuHrsalars);

    /**
     * 新增薪资模版子
     * 
     * @param xinhuHrsalars 薪资模版子
     * @return 结果
     */
    public int insertXinhuHrsalars(XinhuHrsalars xinhuHrsalars);

    /**
     * 修改薪资模版子
     * 
     * @param xinhuHrsalars 薪资模版子
     * @return 结果
     */
    public int updateXinhuHrsalars(XinhuHrsalars xinhuHrsalars);

    /**
     * 批量删除薪资模版子
     * 
     * @param ids 需要删除的薪资模版子主键集合
     * @return 结果
     */
    public int deleteXinhuHrsalarsByIds(Long[] ids);

    /**
     * 删除薪资模版子信息
     * 
     * @param id 薪资模版子主键
     * @return 结果
     */
    public int deleteXinhuHrsalarsById(Long id);
}
