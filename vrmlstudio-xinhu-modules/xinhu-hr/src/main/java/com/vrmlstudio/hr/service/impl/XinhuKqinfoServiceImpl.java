package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuKqinfo;
import com.vrmlstudio.hr.mapper.XinhuKqinfoMapper;
import com.vrmlstudio.hr.service.IXinhuKqinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 请假条加班单Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuKqinfoServiceImpl implements IXinhuKqinfoService
{
    @Autowired
    private XinhuKqinfoMapper xinhuKqinfoMapper;

    /**
     * 查询请假条加班单
     * 
     * @param id 请假条加班单主键
     * @return 请假条加班单
     */
    @Override
    public XinhuKqinfo selectXinhuKqinfoById(Long id)
    {
        return xinhuKqinfoMapper.selectXinhuKqinfoById(id);
    }

    /**
     * 查询请假条加班单列表
     * 
     * @param xinhuKqinfo 请假条加班单
     * @return 请假条加班单
     */
    @Override
    public List<XinhuKqinfo> selectXinhuKqinfoList(XinhuKqinfo xinhuKqinfo)
    {
        return xinhuKqinfoMapper.selectXinhuKqinfoList(xinhuKqinfo);
    }

    /**
     * 新增请假条加班单
     * 
     * @param xinhuKqinfo 请假条加班单
     * @return 结果
     */
    @Override
    public int insertXinhuKqinfo(XinhuKqinfo xinhuKqinfo)
    {
        return xinhuKqinfoMapper.insertXinhuKqinfo(xinhuKqinfo);
    }

    /**
     * 修改请假条加班单
     * 
     * @param xinhuKqinfo 请假条加班单
     * @return 结果
     */
    @Override
    public int updateXinhuKqinfo(XinhuKqinfo xinhuKqinfo)
    {
        return xinhuKqinfoMapper.updateXinhuKqinfo(xinhuKqinfo);
    }

    /**
     * 批量删除请假条加班单
     * 
     * @param ids 需要删除的请假条加班单主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqinfoByIds(Long[] ids)
    {
        return xinhuKqinfoMapper.deleteXinhuKqinfoByIds(ids);
    }

    /**
     * 删除请假条加班单信息
     * 
     * @param id 请假条加班单主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqinfoById(Long id)
    {
        return xinhuKqinfoMapper.deleteXinhuKqinfoById(id);
    }
}
