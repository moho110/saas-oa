package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuKqout;
import com.vrmlstudio.hr.mapper.XinhuKqoutMapper;
import com.vrmlstudio.hr.service.IXinhuKqoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 外出出差Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuKqoutServiceImpl implements IXinhuKqoutService
{
    @Autowired
    private XinhuKqoutMapper xinhuKqoutMapper;

    /**
     * 查询外出出差
     * 
     * @param id 外出出差主键
     * @return 外出出差
     */
    @Override
    public XinhuKqout selectXinhuKqoutById(Long id)
    {
        return xinhuKqoutMapper.selectXinhuKqoutById(id);
    }

    /**
     * 查询外出出差列表
     * 
     * @param xinhuKqout 外出出差
     * @return 外出出差
     */
    @Override
    public List<XinhuKqout> selectXinhuKqoutList(XinhuKqout xinhuKqout)
    {
        return xinhuKqoutMapper.selectXinhuKqoutList(xinhuKqout);
    }

    /**
     * 新增外出出差
     * 
     * @param xinhuKqout 外出出差
     * @return 结果
     */
    @Override
    public int insertXinhuKqout(XinhuKqout xinhuKqout)
    {
        return xinhuKqoutMapper.insertXinhuKqout(xinhuKqout);
    }

    /**
     * 修改外出出差
     * 
     * @param xinhuKqout 外出出差
     * @return 结果
     */
    @Override
    public int updateXinhuKqout(XinhuKqout xinhuKqout)
    {
        return xinhuKqoutMapper.updateXinhuKqout(xinhuKqout);
    }

    /**
     * 批量删除外出出差
     * 
     * @param ids 需要删除的外出出差主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqoutByIds(Long[] ids)
    {
        return xinhuKqoutMapper.deleteXinhuKqoutByIds(ids);
    }

    /**
     * 删除外出出差信息
     * 
     * @param id 外出出差主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKqoutById(Long id)
    {
        return xinhuKqoutMapper.deleteXinhuKqoutById(id);
    }
}
