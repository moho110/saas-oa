package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuHrshebao;
import com.vrmlstudio.hr.mapper.XinhuHrshebaoMapper;
import com.vrmlstudio.hr.service.IXinhuHrshebaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 社保公积金Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuHrshebaoServiceImpl implements IXinhuHrshebaoService
{
    @Autowired
    private XinhuHrshebaoMapper xinhuHrshebaoMapper;

    /**
     * 查询社保公积金
     * 
     * @param id 社保公积金主键
     * @return 社保公积金
     */
    @Override
    public XinhuHrshebao selectXinhuHrshebaoById(Long id)
    {
        return xinhuHrshebaoMapper.selectXinhuHrshebaoById(id);
    }

    /**
     * 查询社保公积金列表
     * 
     * @param xinhuHrshebao 社保公积金
     * @return 社保公积金
     */
    @Override
    public List<XinhuHrshebao> selectXinhuHrshebaoList(XinhuHrshebao xinhuHrshebao)
    {
        return xinhuHrshebaoMapper.selectXinhuHrshebaoList(xinhuHrshebao);
    }

    /**
     * 新增社保公积金
     * 
     * @param xinhuHrshebao 社保公积金
     * @return 结果
     */
    @Override
    public int insertXinhuHrshebao(XinhuHrshebao xinhuHrshebao)
    {
        return xinhuHrshebaoMapper.insertXinhuHrshebao(xinhuHrshebao);
    }

    /**
     * 修改社保公积金
     * 
     * @param xinhuHrshebao 社保公积金
     * @return 结果
     */
    @Override
    public int updateXinhuHrshebao(XinhuHrshebao xinhuHrshebao)
    {
        return xinhuHrshebaoMapper.updateXinhuHrshebao(xinhuHrshebao);
    }

    /**
     * 批量删除社保公积金
     * 
     * @param ids 需要删除的社保公积金主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrshebaoByIds(Long[] ids)
    {
        return xinhuHrshebaoMapper.deleteXinhuHrshebaoByIds(ids);
    }

    /**
     * 删除社保公积金信息
     * 
     * @param id 社保公积金主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrshebaoById(Long id)
    {
        return xinhuHrshebaoMapper.deleteXinhuHrshebaoById(id);
    }
}
