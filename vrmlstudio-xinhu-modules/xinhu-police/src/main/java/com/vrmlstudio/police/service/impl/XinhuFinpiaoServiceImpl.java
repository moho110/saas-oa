package com.vrmlstudio.police.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.police.mapper.XinhuFinpiaoMapper;
import com.vrmlstudio.police.domain.XinhuFinpiao;
import com.vrmlstudio.police.service.IXinhuFinpiaoService;

/**
 * 发票管理Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuFinpiaoServiceImpl implements IXinhuFinpiaoService 
{
    @Autowired
    private XinhuFinpiaoMapper xinhuFinpiaoMapper;

    /**
     * 查询发票管理
     * 
     * @param id 发票管理主键
     * @return 发票管理
     */
    @Override
    public XinhuFinpiao selectXinhuFinpiaoById(Long id)
    {
        return xinhuFinpiaoMapper.selectXinhuFinpiaoById(id);
    }

    /**
     * 查询发票管理列表
     * 
     * @param xinhuFinpiao 发票管理
     * @return 发票管理
     */
    @Override
    public List<XinhuFinpiao> selectXinhuFinpiaoList(XinhuFinpiao xinhuFinpiao)
    {
        return xinhuFinpiaoMapper.selectXinhuFinpiaoList(xinhuFinpiao);
    }

    /**
     * 新增发票管理
     * 
     * @param xinhuFinpiao 发票管理
     * @return 结果
     */
    @Override
    public int insertXinhuFinpiao(XinhuFinpiao xinhuFinpiao)
    {
        return xinhuFinpiaoMapper.insertXinhuFinpiao(xinhuFinpiao);
    }

    /**
     * 修改发票管理
     * 
     * @param xinhuFinpiao 发票管理
     * @return 结果
     */
    @Override
    public int updateXinhuFinpiao(XinhuFinpiao xinhuFinpiao)
    {
        return xinhuFinpiaoMapper.updateXinhuFinpiao(xinhuFinpiao);
    }

    /**
     * 批量删除发票管理
     * 
     * @param ids 需要删除的发票管理主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFinpiaoByIds(Long[] ids)
    {
        return xinhuFinpiaoMapper.deleteXinhuFinpiaoByIds(ids);
    }

    /**
     * 删除发票管理信息
     * 
     * @param id 发票管理主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFinpiaoById(Long id)
    {
        return xinhuFinpiaoMapper.deleteXinhuFinpiaoById(id);
    }
}
