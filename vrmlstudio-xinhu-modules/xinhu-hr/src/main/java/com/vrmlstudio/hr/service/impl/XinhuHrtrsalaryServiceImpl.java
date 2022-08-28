package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuHrtrsalary;
import com.vrmlstudio.hr.mapper.XinhuHrtrsalaryMapper;
import com.vrmlstudio.hr.service.IXinhuHrtrsalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 调薪申请Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuHrtrsalaryServiceImpl implements IXinhuHrtrsalaryService
{
    @Autowired
    private XinhuHrtrsalaryMapper xinhuHrtrsalaryMapper;

    /**
     * 查询调薪申请
     * 
     * @param id 调薪申请主键
     * @return 调薪申请
     */
    @Override
    public XinhuHrtrsalary selectXinhuHrtrsalaryById(Long id)
    {
        return xinhuHrtrsalaryMapper.selectXinhuHrtrsalaryById(id);
    }

    /**
     * 查询调薪申请列表
     * 
     * @param xinhuHrtrsalary 调薪申请
     * @return 调薪申请
     */
    @Override
    public List<XinhuHrtrsalary> selectXinhuHrtrsalaryList(XinhuHrtrsalary xinhuHrtrsalary)
    {
        return xinhuHrtrsalaryMapper.selectXinhuHrtrsalaryList(xinhuHrtrsalary);
    }

    /**
     * 新增调薪申请
     * 
     * @param xinhuHrtrsalary 调薪申请
     * @return 结果
     */
    @Override
    public int insertXinhuHrtrsalary(XinhuHrtrsalary xinhuHrtrsalary)
    {
        return xinhuHrtrsalaryMapper.insertXinhuHrtrsalary(xinhuHrtrsalary);
    }

    /**
     * 修改调薪申请
     * 
     * @param xinhuHrtrsalary 调薪申请
     * @return 结果
     */
    @Override
    public int updateXinhuHrtrsalary(XinhuHrtrsalary xinhuHrtrsalary)
    {
        return xinhuHrtrsalaryMapper.updateXinhuHrtrsalary(xinhuHrtrsalary);
    }

    /**
     * 批量删除调薪申请
     * 
     * @param ids 需要删除的调薪申请主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrtrsalaryByIds(Long[] ids)
    {
        return xinhuHrtrsalaryMapper.deleteXinhuHrtrsalaryByIds(ids);
    }

    /**
     * 删除调薪申请信息
     * 
     * @param id 调薪申请主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrtrsalaryById(Long id)
    {
        return xinhuHrtrsalaryMapper.deleteXinhuHrtrsalaryById(id);
    }
}
