package com.vrmlstudio.document.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.document.mapper.XinhuSealaplMapper;
import com.vrmlstudio.document.domain.XinhuSealapl;
import com.vrmlstudio.document.service.IXinhuSealaplService;

/**
 * 印章申请使用Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuSealaplServiceImpl implements IXinhuSealaplService 
{
    @Autowired
    private XinhuSealaplMapper xinhuSealaplMapper;

    /**
     * 查询印章申请使用
     * 
     * @param id 印章申请使用主键
     * @return 印章申请使用
     */
    @Override
    public XinhuSealapl selectXinhuSealaplById(Long id)
    {
        return xinhuSealaplMapper.selectXinhuSealaplById(id);
    }

    /**
     * 查询印章申请使用列表
     * 
     * @param xinhuSealapl 印章申请使用
     * @return 印章申请使用
     */
    @Override
    public List<XinhuSealapl> selectXinhuSealaplList(XinhuSealapl xinhuSealapl)
    {
        return xinhuSealaplMapper.selectXinhuSealaplList(xinhuSealapl);
    }

    /**
     * 新增印章申请使用
     * 
     * @param xinhuSealapl 印章申请使用
     * @return 结果
     */
    @Override
    public int insertXinhuSealapl(XinhuSealapl xinhuSealapl)
    {
        return xinhuSealaplMapper.insertXinhuSealapl(xinhuSealapl);
    }

    /**
     * 修改印章申请使用
     * 
     * @param xinhuSealapl 印章申请使用
     * @return 结果
     */
    @Override
    public int updateXinhuSealapl(XinhuSealapl xinhuSealapl)
    {
        return xinhuSealaplMapper.updateXinhuSealapl(xinhuSealapl);
    }

    /**
     * 批量删除印章申请使用
     * 
     * @param ids 需要删除的印章申请使用主键
     * @return 结果
     */
    @Override
    public int deleteXinhuSealaplByIds(Long[] ids)
    {
        return xinhuSealaplMapper.deleteXinhuSealaplByIds(ids);
    }

    /**
     * 删除印章申请使用信息
     * 
     * @param id 印章申请使用主键
     * @return 结果
     */
    @Override
    public int deleteXinhuSealaplById(Long id)
    {
        return xinhuSealaplMapper.deleteXinhuSealaplById(id);
    }
}
