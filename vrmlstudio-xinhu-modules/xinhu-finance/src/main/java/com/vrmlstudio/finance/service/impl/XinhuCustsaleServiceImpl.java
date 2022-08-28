package com.vrmlstudio.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.finance.mapper.XinhuCustsaleMapper;
import com.vrmlstudio.finance.domain.XinhuCustsale;
import com.vrmlstudio.finance.service.IXinhuCustsaleService;

/**
 * 销售机会Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuCustsaleServiceImpl implements IXinhuCustsaleService 
{
    @Autowired
    private XinhuCustsaleMapper xinhuCustsaleMapper;

    /**
     * 查询销售机会
     * 
     * @param id 销售机会主键
     * @return 销售机会
     */
    @Override
    public XinhuCustsale selectXinhuCustsaleById(Long id)
    {
        return xinhuCustsaleMapper.selectXinhuCustsaleById(id);
    }

    /**
     * 查询销售机会列表
     * 
     * @param xinhuCustsale 销售机会
     * @return 销售机会
     */
    @Override
    public List<XinhuCustsale> selectXinhuCustsaleList(XinhuCustsale xinhuCustsale)
    {
        return xinhuCustsaleMapper.selectXinhuCustsaleList(xinhuCustsale);
    }

    /**
     * 新增销售机会
     * 
     * @param xinhuCustsale 销售机会
     * @return 结果
     */
    @Override
    public int insertXinhuCustsale(XinhuCustsale xinhuCustsale)
    {
        return xinhuCustsaleMapper.insertXinhuCustsale(xinhuCustsale);
    }

    /**
     * 修改销售机会
     * 
     * @param xinhuCustsale 销售机会
     * @return 结果
     */
    @Override
    public int updateXinhuCustsale(XinhuCustsale xinhuCustsale)
    {
        return xinhuCustsaleMapper.updateXinhuCustsale(xinhuCustsale);
    }

    /**
     * 批量删除销售机会
     * 
     * @param ids 需要删除的销售机会主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCustsaleByIds(Long[] ids)
    {
        return xinhuCustsaleMapper.deleteXinhuCustsaleByIds(ids);
    }

    /**
     * 删除销售机会信息
     * 
     * @param id 销售机会主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCustsaleById(Long id)
    {
        return xinhuCustsaleMapper.deleteXinhuCustsaleById(id);
    }
}
