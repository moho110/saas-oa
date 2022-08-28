package com.vrmlstudio.police.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.police.mapper.XinhuGoodnMapper;
import com.vrmlstudio.police.domain.XinhuGoodn;
import com.vrmlstudio.police.service.IXinhuGoodnService;

/**
 * 物品库存详细Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuGoodnServiceImpl implements IXinhuGoodnService 
{
    @Autowired
    private XinhuGoodnMapper xinhuGoodnMapper;

    /**
     * 查询物品库存详细
     * 
     * @param id 物品库存详细主键
     * @return 物品库存详细
     */
    @Override
    public XinhuGoodn selectXinhuGoodnById(Long id)
    {
        return xinhuGoodnMapper.selectXinhuGoodnById(id);
    }

    /**
     * 查询物品库存详细列表
     * 
     * @param xinhuGoodn 物品库存详细
     * @return 物品库存详细
     */
    @Override
    public List<XinhuGoodn> selectXinhuGoodnList(XinhuGoodn xinhuGoodn)
    {
        return xinhuGoodnMapper.selectXinhuGoodnList(xinhuGoodn);
    }

    /**
     * 新增物品库存详细
     * 
     * @param xinhuGoodn 物品库存详细
     * @return 结果
     */
    @Override
    public int insertXinhuGoodn(XinhuGoodn xinhuGoodn)
    {
        return xinhuGoodnMapper.insertXinhuGoodn(xinhuGoodn);
    }

    /**
     * 修改物品库存详细
     * 
     * @param xinhuGoodn 物品库存详细
     * @return 结果
     */
    @Override
    public int updateXinhuGoodn(XinhuGoodn xinhuGoodn)
    {
        return xinhuGoodnMapper.updateXinhuGoodn(xinhuGoodn);
    }

    /**
     * 批量删除物品库存详细
     * 
     * @param ids 需要删除的物品库存详细主键
     * @return 结果
     */
    @Override
    public int deleteXinhuGoodnByIds(Long[] ids)
    {
        return xinhuGoodnMapper.deleteXinhuGoodnByIds(ids);
    }

    /**
     * 删除物品库存详细信息
     * 
     * @param id 物品库存详细主键
     * @return 结果
     */
    @Override
    public int deleteXinhuGoodnById(Long id)
    {
        return xinhuGoodnMapper.deleteXinhuGoodnById(id);
    }
}
