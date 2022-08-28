package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuKnowtrais;
import com.vrmlstudio.hr.mapper.XinhuKnowtraisMapper;
import com.vrmlstudio.hr.service.IXinhuKnowtraisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 考试培训子Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuKnowtraisServiceImpl implements IXinhuKnowtraisService
{
    @Autowired
    private XinhuKnowtraisMapper xinhuKnowtraisMapper;

    /**
     * 查询考试培训子
     * 
     * @param id 考试培训子主键
     * @return 考试培训子
     */
    @Override
    public XinhuKnowtrais selectXinhuKnowtraisById(Long id)
    {
        return xinhuKnowtraisMapper.selectXinhuKnowtraisById(id);
    }

    /**
     * 查询考试培训子列表
     * 
     * @param xinhuKnowtrais 考试培训子
     * @return 考试培训子
     */
    @Override
    public List<XinhuKnowtrais> selectXinhuKnowtraisList(XinhuKnowtrais xinhuKnowtrais)
    {
        return xinhuKnowtraisMapper.selectXinhuKnowtraisList(xinhuKnowtrais);
    }

    /**
     * 新增考试培训子
     * 
     * @param xinhuKnowtrais 考试培训子
     * @return 结果
     */
    @Override
    public int insertXinhuKnowtrais(XinhuKnowtrais xinhuKnowtrais)
    {
        return xinhuKnowtraisMapper.insertXinhuKnowtrais(xinhuKnowtrais);
    }

    /**
     * 修改考试培训子
     * 
     * @param xinhuKnowtrais 考试培训子
     * @return 结果
     */
    @Override
    public int updateXinhuKnowtrais(XinhuKnowtrais xinhuKnowtrais)
    {
        return xinhuKnowtraisMapper.updateXinhuKnowtrais(xinhuKnowtrais);
    }

    /**
     * 批量删除考试培训子
     * 
     * @param ids 需要删除的考试培训子主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKnowtraisByIds(Long[] ids)
    {
        return xinhuKnowtraisMapper.deleteXinhuKnowtraisByIds(ids);
    }

    /**
     * 删除考试培训子信息
     * 
     * @param id 考试培训子主键
     * @return 结果
     */
    @Override
    public int deleteXinhuKnowtraisById(Long id)
    {
        return xinhuKnowtraisMapper.deleteXinhuKnowtraisById(id);
    }
}
