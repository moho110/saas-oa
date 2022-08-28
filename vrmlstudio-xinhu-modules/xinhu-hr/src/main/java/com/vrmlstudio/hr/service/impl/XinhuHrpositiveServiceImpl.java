package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuHrpositive;
import com.vrmlstudio.hr.mapper.XinhuHrpositiveMapper;
import com.vrmlstudio.hr.service.IXinhuHrpositiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * HR转正Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuHrpositiveServiceImpl implements IXinhuHrpositiveService
{
    @Autowired
    private XinhuHrpositiveMapper xinhuHrpositiveMapper;

    /**
     * 查询HR转正
     * 
     * @param id HR转正主键
     * @return HR转正
     */
    @Override
    public XinhuHrpositive selectXinhuHrpositiveById(Long id)
    {
        return xinhuHrpositiveMapper.selectXinhuHrpositiveById(id);
    }

    /**
     * 查询HR转正列表
     * 
     * @param xinhuHrpositive HR转正
     * @return HR转正
     */
    @Override
    public List<XinhuHrpositive> selectXinhuHrpositiveList(XinhuHrpositive xinhuHrpositive)
    {
        return xinhuHrpositiveMapper.selectXinhuHrpositiveList(xinhuHrpositive);
    }

    /**
     * 新增HR转正
     * 
     * @param xinhuHrpositive HR转正
     * @return 结果
     */
    @Override
    public int insertXinhuHrpositive(XinhuHrpositive xinhuHrpositive)
    {
        return xinhuHrpositiveMapper.insertXinhuHrpositive(xinhuHrpositive);
    }

    /**
     * 修改HR转正
     * 
     * @param xinhuHrpositive HR转正
     * @return 结果
     */
    @Override
    public int updateXinhuHrpositive(XinhuHrpositive xinhuHrpositive)
    {
        return xinhuHrpositiveMapper.updateXinhuHrpositive(xinhuHrpositive);
    }

    /**
     * 批量删除HR转正
     * 
     * @param ids 需要删除的HR转正主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrpositiveByIds(Long[] ids)
    {
        return xinhuHrpositiveMapper.deleteXinhuHrpositiveByIds(ids);
    }

    /**
     * 删除HR转正信息
     * 
     * @param id HR转正主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrpositiveById(Long id)
    {
        return xinhuHrpositiveMapper.deleteXinhuHrpositiveById(id);
    }
}
