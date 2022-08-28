package com.vrmlstudio.police.service;

import java.util.List;
import com.vrmlstudio.police.domain.XinhuAssetm;

/**
 * 固定资产Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuAssetmService 
{
    /**
     * 查询固定资产
     * 
     * @param id 固定资产主键
     * @return 固定资产
     */
    public XinhuAssetm selectXinhuAssetmById(Long id);

    /**
     * 查询固定资产列表
     * 
     * @param xinhuAssetm 固定资产
     * @return 固定资产集合
     */
    public List<XinhuAssetm> selectXinhuAssetmList(XinhuAssetm xinhuAssetm);

    /**
     * 新增固定资产
     * 
     * @param xinhuAssetm 固定资产
     * @return 结果
     */
    public int insertXinhuAssetm(XinhuAssetm xinhuAssetm);

    /**
     * 修改固定资产
     * 
     * @param xinhuAssetm 固定资产
     * @return 结果
     */
    public int updateXinhuAssetm(XinhuAssetm xinhuAssetm);

    /**
     * 批量删除固定资产
     * 
     * @param ids 需要删除的固定资产主键集合
     * @return 结果
     */
    public int deleteXinhuAssetmByIds(Long[] ids);

    /**
     * 删除固定资产信息
     * 
     * @param id 固定资产主键
     * @return 结果
     */
    public int deleteXinhuAssetmById(Long id);
}
