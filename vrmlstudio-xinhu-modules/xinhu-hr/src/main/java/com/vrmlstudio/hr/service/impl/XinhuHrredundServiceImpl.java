package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuHrredund;
import com.vrmlstudio.hr.mapper.XinhuHrredundMapper;
import com.vrmlstudio.hr.service.IXinhuHrredundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 离职申请Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuHrredundServiceImpl implements IXinhuHrredundService
{
    @Autowired
    private XinhuHrredundMapper xinhuHrredundMapper;

    /**
     * 查询离职申请
     * 
     * @param id 离职申请主键
     * @return 离职申请
     */
    @Override
    public XinhuHrredund selectXinhuHrredundById(Long id)
    {
        return xinhuHrredundMapper.selectXinhuHrredundById(id);
    }

    /**
     * 查询离职申请列表
     * 
     * @param xinhuHrredund 离职申请
     * @return 离职申请
     */
    @Override
    public List<XinhuHrredund> selectXinhuHrredundList(XinhuHrredund xinhuHrredund)
    {
        return xinhuHrredundMapper.selectXinhuHrredundList(xinhuHrredund);
    }

    /**
     * 新增离职申请
     * 
     * @param xinhuHrredund 离职申请
     * @return 结果
     */
    @Override
    public int insertXinhuHrredund(XinhuHrredund xinhuHrredund)
    {
        return xinhuHrredundMapper.insertXinhuHrredund(xinhuHrredund);
    }

    /**
     * 修改离职申请
     * 
     * @param xinhuHrredund 离职申请
     * @return 结果
     */
    @Override
    public int updateXinhuHrredund(XinhuHrredund xinhuHrredund)
    {
        return xinhuHrredundMapper.updateXinhuHrredund(xinhuHrredund);
    }

    /**
     * 批量删除离职申请
     * 
     * @param ids 需要删除的离职申请主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrredundByIds(Long[] ids)
    {
        return xinhuHrredundMapper.deleteXinhuHrredundByIds(ids);
    }

    /**
     * 删除离职申请信息
     * 
     * @param id 离职申请主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrredundById(Long id)
    {
        return xinhuHrredundMapper.deleteXinhuHrredundById(id);
    }
}
