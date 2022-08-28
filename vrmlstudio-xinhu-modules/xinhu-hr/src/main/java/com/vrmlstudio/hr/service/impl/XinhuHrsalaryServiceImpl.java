package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuHrsalary;
import com.vrmlstudio.hr.mapper.XinhuHrsalaryMapper;
import com.vrmlstudio.hr.service.IXinhuHrsalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 工资Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuHrsalaryServiceImpl implements IXinhuHrsalaryService
{
    @Autowired
    private XinhuHrsalaryMapper xinhuHrsalaryMapper;

    /**
     * 查询工资
     * 
     * @param id 工资主键
     * @return 工资
     */
    @Override
    public XinhuHrsalary selectXinhuHrsalaryById(Long id)
    {
        return xinhuHrsalaryMapper.selectXinhuHrsalaryById(id);
    }

    /**
     * 查询工资列表
     * 
     * @param xinhuHrsalary 工资
     * @return 工资
     */
    @Override
    public List<XinhuHrsalary> selectXinhuHrsalaryList(XinhuHrsalary xinhuHrsalary)
    {
        return xinhuHrsalaryMapper.selectXinhuHrsalaryList(xinhuHrsalary);
    }

    /**
     * 新增工资
     * 
     * @param xinhuHrsalary 工资
     * @return 结果
     */
    @Override
    public int insertXinhuHrsalary(XinhuHrsalary xinhuHrsalary)
    {
        return xinhuHrsalaryMapper.insertXinhuHrsalary(xinhuHrsalary);
    }

    /**
     * 修改工资
     * 
     * @param xinhuHrsalary 工资
     * @return 结果
     */
    @Override
    public int updateXinhuHrsalary(XinhuHrsalary xinhuHrsalary)
    {
        return xinhuHrsalaryMapper.updateXinhuHrsalary(xinhuHrsalary);
    }

    /**
     * 批量删除工资
     * 
     * @param ids 需要删除的工资主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrsalaryByIds(Long[] ids)
    {
        return xinhuHrsalaryMapper.deleteXinhuHrsalaryByIds(ids);
    }

    /**
     * 删除工资信息
     * 
     * @param id 工资主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrsalaryById(Long id)
    {
        return xinhuHrsalaryMapper.deleteXinhuHrsalaryById(id);
    }
}
