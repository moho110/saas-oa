package com.vrmlstudio.person.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.person.mapper.XinhuUserinfosMapper;
import com.vrmlstudio.person.domain.XinhuUserinfos;
import com.vrmlstudio.person.service.IXinhuUserinfosService;

/**
 * 人员档案子Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuUserinfosServiceImpl implements IXinhuUserinfosService 
{
    @Autowired
    private XinhuUserinfosMapper xinhuUserinfosMapper;

    /**
     * 查询人员档案子
     * 
     * @param id 人员档案子主键
     * @return 人员档案子
     */
    @Override
    public XinhuUserinfos selectXinhuUserinfosById(Long id)
    {
        return xinhuUserinfosMapper.selectXinhuUserinfosById(id);
    }

    /**
     * 查询人员档案子列表
     * 
     * @param xinhuUserinfos 人员档案子
     * @return 人员档案子
     */
    @Override
    public List<XinhuUserinfos> selectXinhuUserinfosList(XinhuUserinfos xinhuUserinfos)
    {
        return xinhuUserinfosMapper.selectXinhuUserinfosList(xinhuUserinfos);
    }

    /**
     * 新增人员档案子
     * 
     * @param xinhuUserinfos 人员档案子
     * @return 结果
     */
    @Override
    public int insertXinhuUserinfos(XinhuUserinfos xinhuUserinfos)
    {
        return xinhuUserinfosMapper.insertXinhuUserinfos(xinhuUserinfos);
    }

    /**
     * 修改人员档案子
     * 
     * @param xinhuUserinfos 人员档案子
     * @return 结果
     */
    @Override
    public int updateXinhuUserinfos(XinhuUserinfos xinhuUserinfos)
    {
        return xinhuUserinfosMapper.updateXinhuUserinfos(xinhuUserinfos);
    }

    /**
     * 批量删除人员档案子
     * 
     * @param ids 需要删除的人员档案子主键
     * @return 结果
     */
    @Override
    public int deleteXinhuUserinfosByIds(Long[] ids)
    {
        return xinhuUserinfosMapper.deleteXinhuUserinfosByIds(ids);
    }

    /**
     * 删除人员档案子信息
     * 
     * @param id 人员档案子主键
     * @return 结果
     */
    @Override
    public int deleteXinhuUserinfosById(Long id)
    {
        return xinhuUserinfosMapper.deleteXinhuUserinfosById(id);
    }
}
