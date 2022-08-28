package com.vrmlstudio.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.finance.mapper.XinhuReceiptMapper;
import com.vrmlstudio.finance.domain.XinhuReceipt;
import com.vrmlstudio.finance.service.IXinhuReceiptService;

/**
 * 回执确认Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuReceiptServiceImpl implements IXinhuReceiptService 
{
    @Autowired
    private XinhuReceiptMapper xinhuReceiptMapper;

    /**
     * 查询回执确认
     * 
     * @param id 回执确认主键
     * @return 回执确认
     */
    @Override
    public XinhuReceipt selectXinhuReceiptById(Long id)
    {
        return xinhuReceiptMapper.selectXinhuReceiptById(id);
    }

    /**
     * 查询回执确认列表
     * 
     * @param xinhuReceipt 回执确认
     * @return 回执确认
     */
    @Override
    public List<XinhuReceipt> selectXinhuReceiptList(XinhuReceipt xinhuReceipt)
    {
        return xinhuReceiptMapper.selectXinhuReceiptList(xinhuReceipt);
    }

    /**
     * 新增回执确认
     * 
     * @param xinhuReceipt 回执确认
     * @return 结果
     */
    @Override
    public int insertXinhuReceipt(XinhuReceipt xinhuReceipt)
    {
        return xinhuReceiptMapper.insertXinhuReceipt(xinhuReceipt);
    }

    /**
     * 修改回执确认
     * 
     * @param xinhuReceipt 回执确认
     * @return 结果
     */
    @Override
    public int updateXinhuReceipt(XinhuReceipt xinhuReceipt)
    {
        return xinhuReceiptMapper.updateXinhuReceipt(xinhuReceipt);
    }

    /**
     * 批量删除回执确认
     * 
     * @param ids 需要删除的回执确认主键
     * @return 结果
     */
    @Override
    public int deleteXinhuReceiptByIds(Long[] ids)
    {
        return xinhuReceiptMapper.deleteXinhuReceiptByIds(ids);
    }

    /**
     * 删除回执确认信息
     * 
     * @param id 回执确认主键
     * @return 结果
     */
    @Override
    public int deleteXinhuReceiptById(Long id)
    {
        return xinhuReceiptMapper.deleteXinhuReceiptById(id);
    }
}
