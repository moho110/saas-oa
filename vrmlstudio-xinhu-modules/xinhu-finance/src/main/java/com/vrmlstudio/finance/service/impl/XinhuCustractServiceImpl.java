package com.vrmlstudio.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.finance.mapper.XinhuCustractMapper;
import com.vrmlstudio.finance.domain.XinhuCustract;
import com.vrmlstudio.finance.service.IXinhuCustractService;

/**
 * 客户合同Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuCustractServiceImpl implements IXinhuCustractService 
{
    @Autowired
    private XinhuCustractMapper xinhuCustractMapper;

    /**
     * 查询客户合同
     * 
     * @param id 客户合同主键
     * @return 客户合同
     */
    @Override
    public XinhuCustract selectXinhuCustractById(Long id)
    {
        return xinhuCustractMapper.selectXinhuCustractById(id);
    }

    /**
     * 查询客户合同列表
     * 
     * @param xinhuCustract 客户合同
     * @return 客户合同
     */
    @Override
    public List<XinhuCustract> selectXinhuCustractList(XinhuCustract xinhuCustract)
    {
        return xinhuCustractMapper.selectXinhuCustractList(xinhuCustract);
    }

    /**
     * 新增客户合同
     * 
     * @param xinhuCustract 客户合同
     * @return 结果
     */
    @Override
    public int insertXinhuCustract(XinhuCustract xinhuCustract)
    {
        return xinhuCustractMapper.insertXinhuCustract(xinhuCustract);
    }

    /**
     * 修改客户合同
     * 
     * @param xinhuCustract 客户合同
     * @return 结果
     */
    @Override
    public int updateXinhuCustract(XinhuCustract xinhuCustract)
    {
        return xinhuCustractMapper.updateXinhuCustract(xinhuCustract);
    }

    /**
     * 批量删除客户合同
     * 
     * @param ids 需要删除的客户合同主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCustractByIds(Long[] ids)
    {
        return xinhuCustractMapper.deleteXinhuCustractByIds(ids);
    }

    /**
     * 删除客户合同信息
     * 
     * @param id 客户合同主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCustractById(Long id)
    {
        return xinhuCustractMapper.deleteXinhuCustractById(id);
    }
}
