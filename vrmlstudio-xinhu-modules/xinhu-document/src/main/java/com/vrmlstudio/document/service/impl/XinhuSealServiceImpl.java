package com.vrmlstudio.document.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.document.mapper.XinhuSealMapper;
import com.vrmlstudio.document.domain.XinhuSeal;
import com.vrmlstudio.document.service.IXinhuSealService;

/**
 * 印章Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuSealServiceImpl implements IXinhuSealService 
{
    @Autowired
    private XinhuSealMapper xinhuSealMapper;

    /**
     * 查询印章
     * 
     * @param id 印章主键
     * @return 印章
     */
    @Override
    public XinhuSeal selectXinhuSealById(Long id)
    {
        return xinhuSealMapper.selectXinhuSealById(id);
    }

    /**
     * 查询印章列表
     * 
     * @param xinhuSeal 印章
     * @return 印章
     */
    @Override
    public List<XinhuSeal> selectXinhuSealList(XinhuSeal xinhuSeal)
    {
        return xinhuSealMapper.selectXinhuSealList(xinhuSeal);
    }

    /**
     * 新增印章
     * 
     * @param xinhuSeal 印章
     * @return 结果
     */
    @Override
    public int insertXinhuSeal(XinhuSeal xinhuSeal)
    {
        return xinhuSealMapper.insertXinhuSeal(xinhuSeal);
    }

    /**
     * 修改印章
     * 
     * @param xinhuSeal 印章
     * @return 结果
     */
    @Override
    public int updateXinhuSeal(XinhuSeal xinhuSeal)
    {
        return xinhuSealMapper.updateXinhuSeal(xinhuSeal);
    }

    /**
     * 批量删除印章
     * 
     * @param ids 需要删除的印章主键
     * @return 结果
     */
    @Override
    public int deleteXinhuSealByIds(Long[] ids)
    {
        return xinhuSealMapper.deleteXinhuSealByIds(ids);
    }

    /**
     * 删除印章信息
     * 
     * @param id 印章主键
     * @return 结果
     */
    @Override
    public int deleteXinhuSealById(Long id)
    {
        return xinhuSealMapper.deleteXinhuSealById(id);
    }
}
