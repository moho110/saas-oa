package com.vrmlstudio.police.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.police.mapper.XinhuFininfosMapper;
import com.vrmlstudio.police.domain.XinhuFininfos;
import com.vrmlstudio.police.service.IXinhuFininfosService;

/**
 * 费用报销子Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuFininfosServiceImpl implements IXinhuFininfosService 
{
    @Autowired
    private XinhuFininfosMapper xinhuFininfosMapper;

    /**
     * 查询费用报销子
     * 
     * @param id 费用报销子主键
     * @return 费用报销子
     */
    @Override
    public XinhuFininfos selectXinhuFininfosById(Long id)
    {
        return xinhuFininfosMapper.selectXinhuFininfosById(id);
    }

    /**
     * 查询费用报销子列表
     * 
     * @param xinhuFininfos 费用报销子
     * @return 费用报销子
     */
    @Override
    public List<XinhuFininfos> selectXinhuFininfosList(XinhuFininfos xinhuFininfos)
    {
        return xinhuFininfosMapper.selectXinhuFininfosList(xinhuFininfos);
    }

    /**
     * 新增费用报销子
     * 
     * @param xinhuFininfos 费用报销子
     * @return 结果
     */
    @Override
    public int insertXinhuFininfos(XinhuFininfos xinhuFininfos)
    {
        return xinhuFininfosMapper.insertXinhuFininfos(xinhuFininfos);
    }

    /**
     * 修改费用报销子
     * 
     * @param xinhuFininfos 费用报销子
     * @return 结果
     */
    @Override
    public int updateXinhuFininfos(XinhuFininfos xinhuFininfos)
    {
        return xinhuFininfosMapper.updateXinhuFininfos(xinhuFininfos);
    }

    /**
     * 批量删除费用报销子
     * 
     * @param ids 需要删除的费用报销子主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFininfosByIds(Long[] ids)
    {
        return xinhuFininfosMapper.deleteXinhuFininfosByIds(ids);
    }

    /**
     * 删除费用报销子信息
     * 
     * @param id 费用报销子主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFininfosById(Long id)
    {
        return xinhuFininfosMapper.deleteXinhuFininfosById(id);
    }
}
