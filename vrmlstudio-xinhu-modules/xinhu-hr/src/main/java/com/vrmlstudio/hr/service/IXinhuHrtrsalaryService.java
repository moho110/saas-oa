package com.vrmlstudio.hr.service;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuHrtrsalary;

/**
 * 调薪申请Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuHrtrsalaryService 
{
    /**
     * 查询调薪申请
     * 
     * @param id 调薪申请主键
     * @return 调薪申请
     */
    public XinhuHrtrsalary selectXinhuHrtrsalaryById(Long id);

    /**
     * 查询调薪申请列表
     * 
     * @param xinhuHrtrsalary 调薪申请
     * @return 调薪申请集合
     */
    public List<XinhuHrtrsalary> selectXinhuHrtrsalaryList(XinhuHrtrsalary xinhuHrtrsalary);

    /**
     * 新增调薪申请
     * 
     * @param xinhuHrtrsalary 调薪申请
     * @return 结果
     */
    public int insertXinhuHrtrsalary(XinhuHrtrsalary xinhuHrtrsalary);

    /**
     * 修改调薪申请
     * 
     * @param xinhuHrtrsalary 调薪申请
     * @return 结果
     */
    public int updateXinhuHrtrsalary(XinhuHrtrsalary xinhuHrtrsalary);

    /**
     * 批量删除调薪申请
     * 
     * @param ids 需要删除的调薪申请主键集合
     * @return 结果
     */
    public int deleteXinhuHrtrsalaryByIds(Long[] ids);

    /**
     * 删除调薪申请信息
     * 
     * @param id 调薪申请主键
     * @return 结果
     */
    public int deleteXinhuHrtrsalaryById(Long id);
}
