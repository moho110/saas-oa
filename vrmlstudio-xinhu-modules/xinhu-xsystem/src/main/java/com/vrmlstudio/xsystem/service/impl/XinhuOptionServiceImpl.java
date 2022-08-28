package com.vrmlstudio.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.XinhuOptionMapper;
import com.vrmlstudio.xsystem.domain.XinhuOption;
import com.vrmlstudio.xsystem.service.IXinhuOptionService;

/**
 * 系统选项Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuOptionServiceImpl implements IXinhuOptionService 
{
    @Autowired
    private XinhuOptionMapper xinhuOptionMapper;

    /**
     * 查询系统选项
     * 
     * @param id 系统选项主键
     * @return 系统选项
     */
    @Override
    public XinhuOption selectXinhuOptionById(Long id)
    {
        return xinhuOptionMapper.selectXinhuOptionById(id);
    }

    /**
     * 查询系统选项列表
     * 
     * @param xinhuOption 系统选项
     * @return 系统选项
     */
    @Override
    public List<XinhuOption> selectXinhuOptionList(XinhuOption xinhuOption)
    {
        return xinhuOptionMapper.selectXinhuOptionList(xinhuOption);
    }

    /**
     * 新增系统选项
     * 
     * @param xinhuOption 系统选项
     * @return 结果
     */
    @Override
    public int insertXinhuOption(XinhuOption xinhuOption)
    {
        return xinhuOptionMapper.insertXinhuOption(xinhuOption);
    }

    /**
     * 修改系统选项
     * 
     * @param xinhuOption 系统选项
     * @return 结果
     */
    @Override
    public int updateXinhuOption(XinhuOption xinhuOption)
    {
        return xinhuOptionMapper.updateXinhuOption(xinhuOption);
    }

    /**
     * 批量删除系统选项
     * 
     * @param ids 需要删除的系统选项主键
     * @return 结果
     */
    @Override
    public int deleteXinhuOptionByIds(Long[] ids)
    {
        return xinhuOptionMapper.deleteXinhuOptionByIds(ids);
    }

    /**
     * 删除系统选项信息
     * 
     * @param id 系统选项主键
     * @return 结果
     */
    @Override
    public int deleteXinhuOptionById(Long id)
    {
        return xinhuOptionMapper.deleteXinhuOptionById(id);
    }
}
