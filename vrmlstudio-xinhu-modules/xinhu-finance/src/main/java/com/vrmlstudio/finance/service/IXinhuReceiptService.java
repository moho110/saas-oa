package com.vrmlstudio.finance.service;

import java.util.List;
import com.vrmlstudio.finance.domain.XinhuReceipt;

/**
 * 回执确认Service接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface IXinhuReceiptService 
{
    /**
     * 查询回执确认
     * 
     * @param id 回执确认主键
     * @return 回执确认
     */
    public XinhuReceipt selectXinhuReceiptById(Long id);

    /**
     * 查询回执确认列表
     * 
     * @param xinhuReceipt 回执确认
     * @return 回执确认集合
     */
    public List<XinhuReceipt> selectXinhuReceiptList(XinhuReceipt xinhuReceipt);

    /**
     * 新增回执确认
     * 
     * @param xinhuReceipt 回执确认
     * @return 结果
     */
    public int insertXinhuReceipt(XinhuReceipt xinhuReceipt);

    /**
     * 修改回执确认
     * 
     * @param xinhuReceipt 回执确认
     * @return 结果
     */
    public int updateXinhuReceipt(XinhuReceipt xinhuReceipt);

    /**
     * 批量删除回执确认
     * 
     * @param ids 需要删除的回执确认主键集合
     * @return 结果
     */
    public int deleteXinhuReceiptByIds(Long[] ids);

    /**
     * 删除回执确认信息
     * 
     * @param id 回执确认主键
     * @return 结果
     */
    public int deleteXinhuReceiptById(Long id);
}
