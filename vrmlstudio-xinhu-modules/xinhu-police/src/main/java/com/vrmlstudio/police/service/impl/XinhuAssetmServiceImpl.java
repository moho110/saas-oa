package com.vrmlstudio.police.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.police.mapper.XinhuAssetmMapper;
import com.vrmlstudio.police.domain.XinhuAssetm;
import com.vrmlstudio.police.service.IXinhuAssetmService;

/**
 * 固定资产Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuAssetmServiceImpl implements IXinhuAssetmService 
{
    @Autowired
    private XinhuAssetmMapper xinhuAssetmMapper;

    /**
     * 查询固定资产
     * 
     * @param id 固定资产主键
     * @return 固定资产
     */
    @Override
    public XinhuAssetm selectXinhuAssetmById(Long id)
    {
        return xinhuAssetmMapper.selectXinhuAssetmById(id);
    }

    /**
     * 查询固定资产列表
     * 
     * @param xinhuAssetm 固定资产
     * @return 固定资产
     */
    @Override
    public List<XinhuAssetm> selectXinhuAssetmList(XinhuAssetm xinhuAssetm)
    {
        return xinhuAssetmMapper.selectXinhuAssetmList(xinhuAssetm);
    }

    /**
     * 新增固定资产
     * 
     * @param xinhuAssetm 固定资产
     * @return 结果
     */
    @Override
    public int insertXinhuAssetm(XinhuAssetm xinhuAssetm)
    {
        return xinhuAssetmMapper.insertXinhuAssetm(xinhuAssetm);
    }

    /**
     * 修改固定资产
     * 
     * @param xinhuAssetm 固定资产
     * @return 结果
     */
    @Override
    public int updateXinhuAssetm(XinhuAssetm xinhuAssetm)
    {
        return xinhuAssetmMapper.updateXinhuAssetm(xinhuAssetm);
    }

    /**
     * 批量删除固定资产
     * 
     * @param ids 需要删除的固定资产主键
     * @return 结果
     */
    @Override
    public int deleteXinhuAssetmByIds(Long[] ids)
    {
        return xinhuAssetmMapper.deleteXinhuAssetmByIds(ids);
    }

    /**
     * 删除固定资产信息
     * 
     * @param id 固定资产主键
     * @return 结果
     */
    @Override
    public int deleteXinhuAssetmById(Long id)
    {
        return xinhuAssetmMapper.deleteXinhuAssetmById(id);
    }
}
