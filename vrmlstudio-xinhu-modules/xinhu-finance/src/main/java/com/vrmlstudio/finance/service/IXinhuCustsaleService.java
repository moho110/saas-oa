package com.vrmlstudio.finance.service;

import java.util.List;
import com.vrmlstudio.finance.domain.XinhuCustsale;

/**
 * 销售机会Service接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface IXinhuCustsaleService 
{
    /**
     * 查询销售机会
     * 
     * @param id 销售机会主键
     * @return 销售机会
     */
    public XinhuCustsale selectXinhuCustsaleById(Long id);

    /**
     * 查询销售机会列表
     * 
     * @param xinhuCustsale 销售机会
     * @return 销售机会集合
     */
    public List<XinhuCustsale> selectXinhuCustsaleList(XinhuCustsale xinhuCustsale);

    /**
     * 新增销售机会
     * 
     * @param xinhuCustsale 销售机会
     * @return 结果
     */
    public int insertXinhuCustsale(XinhuCustsale xinhuCustsale);

    /**
     * 修改销售机会
     * 
     * @param xinhuCustsale 销售机会
     * @return 结果
     */
    public int updateXinhuCustsale(XinhuCustsale xinhuCustsale);

    /**
     * 批量删除销售机会
     * 
     * @param ids 需要删除的销售机会主键集合
     * @return 结果
     */
    public int deleteXinhuCustsaleByIds(Long[] ids);

    /**
     * 删除销售机会信息
     * 
     * @param id 销售机会主键
     * @return 结果
     */
    public int deleteXinhuCustsaleById(Long id);
}
