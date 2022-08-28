package com.vrmlstudio.police.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.police.mapper.XinhuFininfomMapper;
import com.vrmlstudio.police.domain.XinhuFininfom;
import com.vrmlstudio.police.service.IXinhuFininfomService;

/**
 * 费用报销Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuFininfomServiceImpl implements IXinhuFininfomService 
{
    @Autowired
    private XinhuFininfomMapper xinhuFininfomMapper;

    /**
     * 查询费用报销
     * 
     * @param id 费用报销主键
     * @return 费用报销
     */
    @Override
    public XinhuFininfom selectXinhuFininfomById(Long id)
    {
        return xinhuFininfomMapper.selectXinhuFininfomById(id);
    }

    /**
     * 查询费用报销列表
     * 
     * @param xinhuFininfom 费用报销
     * @return 费用报销
     */
    @Override
    public List<XinhuFininfom> selectXinhuFininfomList(XinhuFininfom xinhuFininfom)
    {
        return xinhuFininfomMapper.selectXinhuFininfomList(xinhuFininfom);
    }

    /**
     * 新增费用报销
     * 
     * @param xinhuFininfom 费用报销
     * @return 结果
     */
    @Override
    public int insertXinhuFininfom(XinhuFininfom xinhuFininfom)
    {
        return xinhuFininfomMapper.insertXinhuFininfom(xinhuFininfom);
    }

    /**
     * 修改费用报销
     * 
     * @param xinhuFininfom 费用报销
     * @return 结果
     */
    @Override
    public int updateXinhuFininfom(XinhuFininfom xinhuFininfom)
    {
        return xinhuFininfomMapper.updateXinhuFininfom(xinhuFininfom);
    }

    /**
     * 批量删除费用报销
     * 
     * @param ids 需要删除的费用报销主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFininfomByIds(Long[] ids)
    {
        return xinhuFininfomMapper.deleteXinhuFininfomByIds(ids);
    }

    /**
     * 删除费用报销信息
     * 
     * @param id 费用报销主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFininfomById(Long id)
    {
        return xinhuFininfomMapper.deleteXinhuFininfomById(id);
    }
}
