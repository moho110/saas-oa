package com.vrmlstudio.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.finance.mapper.XinhuTovoidMapper;
import com.vrmlstudio.finance.domain.XinhuTovoid;
import com.vrmlstudio.finance.service.IXinhuTovoidService;

/**
 * 单据申请作废Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuTovoidServiceImpl implements IXinhuTovoidService 
{
    @Autowired
    private XinhuTovoidMapper xinhuTovoidMapper;

    /**
     * 查询单据申请作废
     * 
     * @param id 单据申请作废主键
     * @return 单据申请作废
     */
    @Override
    public XinhuTovoid selectXinhuTovoidById(Long id)
    {
        return xinhuTovoidMapper.selectXinhuTovoidById(id);
    }

    /**
     * 查询单据申请作废列表
     * 
     * @param xinhuTovoid 单据申请作废
     * @return 单据申请作废
     */
    @Override
    public List<XinhuTovoid> selectXinhuTovoidList(XinhuTovoid xinhuTovoid)
    {
        return xinhuTovoidMapper.selectXinhuTovoidList(xinhuTovoid);
    }

    /**
     * 新增单据申请作废
     * 
     * @param xinhuTovoid 单据申请作废
     * @return 结果
     */
    @Override
    public int insertXinhuTovoid(XinhuTovoid xinhuTovoid)
    {
        return xinhuTovoidMapper.insertXinhuTovoid(xinhuTovoid);
    }

    /**
     * 修改单据申请作废
     * 
     * @param xinhuTovoid 单据申请作废
     * @return 结果
     */
    @Override
    public int updateXinhuTovoid(XinhuTovoid xinhuTovoid)
    {
        return xinhuTovoidMapper.updateXinhuTovoid(xinhuTovoid);
    }

    /**
     * 批量删除单据申请作废
     * 
     * @param ids 需要删除的单据申请作废主键
     * @return 结果
     */
    @Override
    public int deleteXinhuTovoidByIds(Long[] ids)
    {
        return xinhuTovoidMapper.deleteXinhuTovoidByIds(ids);
    }

    /**
     * 删除单据申请作废信息
     * 
     * @param id 单据申请作废主键
     * @return 结果
     */
    @Override
    public int deleteXinhuTovoidById(Long id)
    {
        return xinhuTovoidMapper.deleteXinhuTovoidById(id);
    }
}
