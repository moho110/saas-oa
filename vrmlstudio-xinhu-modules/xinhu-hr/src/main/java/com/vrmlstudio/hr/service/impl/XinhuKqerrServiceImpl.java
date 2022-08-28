package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuKqerr;
import com.vrmlstudio.hr.mapper.XinhuKqerrMapper;
import com.vrmlstudio.hr.service.IXinhuKqerrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 打卡异常申请Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuKqerrServiceImpl implements IXinhuKqerrService
{
    @Autowired
    private XinhuKqerrMapper xinhuKqerrMapper;

    /**
     * 查询打卡异常申请
     * 
     * @param id 打卡异常申请主键
     * @return 打卡异常申请
     */
    @Override
    public XinhuKqerr selectXinhuKqerrById(Long id)
    {
        return xinhuKqerrMapper.selectXinhuKqerrById(id);
    }

    /**
     * 查询打卡异常申请列表
     * 
     * @param xinhuKqerr 打卡异常申请
     * @return 打卡异常申请
     */
    @Override
    public List<XinhuKqerr> selectXinhuKqerrList(XinhuKqerr xinhuKqerr)
    {
        return xinhuKqerrMapper.selectXinhuKqerrList(xinhuKqerr);
    }

    /**
     * 新增打卡异常申请
     * 
     * @param xinhuKqerr 打卡异常申请
     * @return 结果
     */
    @Override
    public int insertXinhuKqerr(XinhuKqerr xinhuKqerr)
    {
        return xinhuKqerrMapper.insertXinhuKqerr(xinhuKqerr);
    }

    /**
     * 修改打卡异常申请
     * 
     * @param xinhuKqerr 打卡异常申请
     * @return 结果
     */
    @Override
    public int updateXinhuKqerr(XinhuKqerr xinhuKqerr)
    {
        return xinhuKqerrMapper.updateXinhuKqerr(xinhuKqerr);
    }

    /**
     * 批量删除打卡异常申请
     * 
     * @param ids 需要删除的打卡异常申请主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqerrByIds(Long[] ids)
    {
        return xinhuKqerrMapper.deleteXinhuKqerrByIds(ids);
    }

    /**
     * 删除打卡异常申请信息
     * 
     * @param id 打卡异常申请主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqerrById(Long id)
    {
        return xinhuKqerrMapper.deleteXinhuKqerrById(id);
    }
}
