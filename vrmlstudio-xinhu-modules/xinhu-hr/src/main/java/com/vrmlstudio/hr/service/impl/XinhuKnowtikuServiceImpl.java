package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuKnowtiku;
import com.vrmlstudio.hr.mapper.XinhuKnowtikuMapper;
import com.vrmlstudio.hr.service.IXinhuKnowtikuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 知识题库Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuKnowtikuServiceImpl implements IXinhuKnowtikuService
{
    @Autowired
    private XinhuKnowtikuMapper xinhuKnowtikuMapper;

    /**
     * 查询知识题库
     * 
     * @param id 知识题库主键
     * @return 知识题库
     */
    @Override
    public XinhuKnowtiku selectXinhuKnowtikuById(Long id)
    {
        return xinhuKnowtikuMapper.selectXinhuKnowtikuById(id);
    }

    /**
     * 查询知识题库列表
     * 
     * @param xinhuKnowtiku 知识题库
     * @return 知识题库
     */
    @Override
    public List<XinhuKnowtiku> selectXinhuKnowtikuList(XinhuKnowtiku xinhuKnowtiku)
    {
        return xinhuKnowtikuMapper.selectXinhuKnowtikuList(xinhuKnowtiku);
    }

    /**
     * 新增知识题库
     * 
     * @param xinhuKnowtiku 知识题库
     * @return 结果
     */
    @Override
    public int insertXinhuKnowtiku(XinhuKnowtiku xinhuKnowtiku)
    {
        return xinhuKnowtikuMapper.insertXinhuKnowtiku(xinhuKnowtiku);
    }

    /**
     * 修改知识题库
     * 
     * @param xinhuKnowtiku 知识题库
     * @return 结果
     */
    @Override
    public int updateXinhuKnowtiku(XinhuKnowtiku xinhuKnowtiku)
    {
        return xinhuKnowtikuMapper.updateXinhuKnowtiku(xinhuKnowtiku);
    }

    /**
     * 批量删除知识题库
     * 
     * @param ids 需要删除的知识题库主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKnowtikuByIds(Long[] ids)
    {
        return xinhuKnowtikuMapper.deleteXinhuKnowtikuByIds(ids);
    }

    /**
     * 删除知识题库信息
     * 
     * @param id 知识题库主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKnowtikuById(Long id)
    {
        return xinhuKnowtikuMapper.deleteXinhuKnowtikuById(id);
    }
}
