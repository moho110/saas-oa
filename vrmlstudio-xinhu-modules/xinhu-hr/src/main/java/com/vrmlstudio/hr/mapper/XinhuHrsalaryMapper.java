package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuHrsalary;

/**
 * 工资Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuHrsalaryMapper 
{
    /**
     * 查询工资
     * 
     * @param id 工资主键
     * @return 工资
     */
    public XinhuHrsalary selectXinhuHrsalaryById(Long id);

    /**
     * 查询工资列表
     * 
     * @param xinhuHrsalary 工资
     * @return 工资集合
     */
    public List<XinhuHrsalary> selectXinhuHrsalaryList(XinhuHrsalary xinhuHrsalary);

    /**
     * 新增工资
     * 
     * @param xinhuHrsalary 工资
     * @return 结果
     */
    public int insertXinhuHrsalary(XinhuHrsalary xinhuHrsalary);

    /**
     * 修改工资
     * 
     * @param xinhuHrsalary 工资
     * @return 结果
     */
    public int updateXinhuHrsalary(XinhuHrsalary xinhuHrsalary);

    /**
     * 删除工资
     * 
     * @param id 工资主键
     * @return 结果
     */
    public int deleteXinhuHrsalaryById(Long id);

    /**
     * 批量删除工资
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuHrsalaryByIds(Long[] ids);
}
