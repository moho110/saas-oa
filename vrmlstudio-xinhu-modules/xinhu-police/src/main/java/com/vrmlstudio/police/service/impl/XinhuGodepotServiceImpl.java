package com.vrmlstudio.police.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.police.mapper.XinhuGodepotMapper;
import com.vrmlstudio.police.domain.XinhuGodepot;
import com.vrmlstudio.police.service.IXinhuGodepotService;

/**
 * 物品仓库Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuGodepotServiceImpl implements IXinhuGodepotService 
{
    @Autowired
    private XinhuGodepotMapper xinhuGodepotMapper;

    /**
     * 查询物品仓库
     * 
     * @param id 物品仓库主键
     * @return 物品仓库
     */
    @Override
    public XinhuGodepot selectXinhuGodepotById(Long id)
    {
        return xinhuGodepotMapper.selectXinhuGodepotById(id);
    }

    /**
     * 查询物品仓库列表
     * 
     * @param xinhuGodepot 物品仓库
     * @return 物品仓库
     */
    @Override
    public List<XinhuGodepot> selectXinhuGodepotList(XinhuGodepot xinhuGodepot)
    {
        return xinhuGodepotMapper.selectXinhuGodepotList(xinhuGodepot);
    }

    /**
     * 新增物品仓库
     * 
     * @param xinhuGodepot 物品仓库
     * @return 结果
     */
    @Override
    public int insertXinhuGodepot(XinhuGodepot xinhuGodepot)
    {
        return xinhuGodepotMapper.insertXinhuGodepot(xinhuGodepot);
    }

    /**
     * 修改物品仓库
     * 
     * @param xinhuGodepot 物品仓库
     * @return 结果
     */
    @Override
    public int updateXinhuGodepot(XinhuGodepot xinhuGodepot)
    {
        return xinhuGodepotMapper.updateXinhuGodepot(xinhuGodepot);
    }

    /**
     * 批量删除物品仓库
     * 
     * @param ids 需要删除的物品仓库主键
     * @return 结果
     */
    @Override
    public int deleteXinhuGodepotByIds(Long[] ids)
    {
        return xinhuGodepotMapper.deleteXinhuGodepotByIds(ids);
    }

    /**
     * 删除物品仓库信息
     * 
     * @param id 物品仓库主键
     * @return 结果
     */
    @Override
    public int deleteXinhuGodepotById(Long id)
    {
        return xinhuGodepotMapper.deleteXinhuGodepotById(id);
    }
}
