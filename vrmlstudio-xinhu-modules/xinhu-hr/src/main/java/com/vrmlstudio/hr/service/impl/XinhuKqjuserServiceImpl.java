package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuKqjuser;
import com.vrmlstudio.hr.mapper.XinhuKqjuserMapper;
import com.vrmlstudio.hr.service.IXinhuKqjuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 考勤机上人员Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuKqjuserServiceImpl implements IXinhuKqjuserService
{
    @Autowired
    private XinhuKqjuserMapper xinhuKqjuserMapper;

    /**
     * 查询考勤机上人员
     * 
     * @param id 考勤机上人员主键
     * @return 考勤机上人员
     */
    @Override
    public XinhuKqjuser selectXinhuKqjuserById(Long id)
    {
        return xinhuKqjuserMapper.selectXinhuKqjuserById(id);
    }

    /**
     * 查询考勤机上人员列表
     * 
     * @param xinhuKqjuser 考勤机上人员
     * @return 考勤机上人员
     */
    @Override
    public List<XinhuKqjuser> selectXinhuKqjuserList(XinhuKqjuser xinhuKqjuser)
    {
        return xinhuKqjuserMapper.selectXinhuKqjuserList(xinhuKqjuser);
    }

    /**
     * 新增考勤机上人员
     * 
     * @param xinhuKqjuser 考勤机上人员
     * @return 结果
     */
    @Override
    public int insertXinhuKqjuser(XinhuKqjuser xinhuKqjuser)
    {
        return xinhuKqjuserMapper.insertXinhuKqjuser(xinhuKqjuser);
    }

    /**
     * 修改考勤机上人员
     * 
     * @param xinhuKqjuser 考勤机上人员
     * @return 结果
     */
    @Override
    public int updateXinhuKqjuser(XinhuKqjuser xinhuKqjuser)
    {
        return xinhuKqjuserMapper.updateXinhuKqjuser(xinhuKqjuser);
    }

    /**
     * 批量删除考勤机上人员
     * 
     * @param ids 需要删除的考勤机上人员主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqjuserByIds(Long[] ids)
    {
        return xinhuKqjuserMapper.deleteXinhuKqjuserByIds(ids);
    }

    /**
     * 删除考勤机上人员信息
     * 
     * @param id 考勤机上人员主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqjuserById(Long id)
    {
        return xinhuKqjuserMapper.deleteXinhuKqjuserById(id);
    }
}
