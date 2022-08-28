package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuKqsjgz;
import com.vrmlstudio.hr.mapper.XinhuKqsjgzMapper;
import com.vrmlstudio.hr.service.IXinhuKqsjgzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 考勤时间规则Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuKqsjgzServiceImpl implements IXinhuKqsjgzService
{
    @Autowired
    private XinhuKqsjgzMapper xinhuKqsjgzMapper;

    /**
     * 查询考勤时间规则
     * 
     * @param id 考勤时间规则主键
     * @return 考勤时间规则
     */
    @Override
    public XinhuKqsjgz selectXinhuKqsjgzById(Integer id)
    {
        return xinhuKqsjgzMapper.selectXinhuKqsjgzById(id);
    }

    /**
     * 查询考勤时间规则列表
     * 
     * @param xinhuKqsjgz 考勤时间规则
     * @return 考勤时间规则
     */
    @Override
    public List<XinhuKqsjgz> selectXinhuKqsjgzList(XinhuKqsjgz xinhuKqsjgz)
    {
        return xinhuKqsjgzMapper.selectXinhuKqsjgzList(xinhuKqsjgz);
    }

    /**
     * 新增考勤时间规则
     * 
     * @param xinhuKqsjgz 考勤时间规则
     * @return 结果
     */
    @Override
    public int insertXinhuKqsjgz(XinhuKqsjgz xinhuKqsjgz)
    {
        return xinhuKqsjgzMapper.insertXinhuKqsjgz(xinhuKqsjgz);
    }

    /**
     * 修改考勤时间规则
     * 
     * @param xinhuKqsjgz 考勤时间规则
     * @return 结果
     */
    @Override
    public int updateXinhuKqsjgz(XinhuKqsjgz xinhuKqsjgz)
    {
        return xinhuKqsjgzMapper.updateXinhuKqsjgz(xinhuKqsjgz);
    }

    /**
     * 批量删除考勤时间规则
     * 
     * @param ids 需要删除的考勤时间规则主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqsjgzByIds(Integer[] ids)
    {
        return xinhuKqsjgzMapper.deleteXinhuKqsjgzByIds(ids);
    }

    /**
     * 删除考勤时间规则信息
     * 
     * @param id 考勤时间规则主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqsjgzById(Integer id)
    {
        return xinhuKqsjgzMapper.deleteXinhuKqsjgzById(id);
    }
}
