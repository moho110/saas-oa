package com.vrmlstudio.police.service;

import java.util.List;
import com.vrmlstudio.police.domain.XinhuFinpiao;

/**
 * 发票管理Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuFinpiaoService 
{
    /**
     * 查询发票管理
     * 
     * @param id 发票管理主键
     * @return 发票管理
     */
    public XinhuFinpiao selectXinhuFinpiaoById(Long id);

    /**
     * 查询发票管理列表
     * 
     * @param xinhuFinpiao 发票管理
     * @return 发票管理集合
     */
    public List<XinhuFinpiao> selectXinhuFinpiaoList(XinhuFinpiao xinhuFinpiao);

    /**
     * 新增发票管理
     * 
     * @param xinhuFinpiao 发票管理
     * @return 结果
     */
    public int insertXinhuFinpiao(XinhuFinpiao xinhuFinpiao);

    /**
     * 修改发票管理
     * 
     * @param xinhuFinpiao 发票管理
     * @return 结果
     */
    public int updateXinhuFinpiao(XinhuFinpiao xinhuFinpiao);

    /**
     * 批量删除发票管理
     * 
     * @param ids 需要删除的发票管理主键集合
     * @return 结果
     */
    public int deleteXinhuFinpiaoByIds(Long[] ids);

    /**
     * 删除发票管理信息
     * 
     * @param id 发票管理主键
     * @return 结果
     */
    public int deleteXinhuFinpiaoById(Long id);
}
