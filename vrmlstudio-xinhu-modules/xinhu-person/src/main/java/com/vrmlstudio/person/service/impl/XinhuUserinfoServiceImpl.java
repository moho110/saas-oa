package com.vrmlstudio.person.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.vrmlstudio.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.vrmlstudio.person.domain.XinhuUserinfos;
import com.vrmlstudio.person.mapper.XinhuUserinfoMapper;
import com.vrmlstudio.person.domain.XinhuUserinfo;
import com.vrmlstudio.person.service.IXinhuUserinfoService;

/**
 * 用户档案Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuUserinfoServiceImpl implements IXinhuUserinfoService 
{
    @Autowired
    private XinhuUserinfoMapper xinhuUserinfoMapper;

    /**
     * 查询用户档案
     * 
     * @param id 用户档案主键
     * @return 用户档案
     */
    @Override
    public XinhuUserinfo selectXinhuUserinfoById(Integer id)
    {
        return xinhuUserinfoMapper.selectXinhuUserinfoById(id);
    }

    /**
     * 查询用户档案列表
     * 
     * @param xinhuUserinfo 用户档案
     * @return 用户档案
     */
    @Override
    public List<XinhuUserinfo> selectXinhuUserinfoList(XinhuUserinfo xinhuUserinfo)
    {
        return xinhuUserinfoMapper.selectXinhuUserinfoList(xinhuUserinfo);
    }

    /**
     * 新增用户档案
     * 
     * @param xinhuUserinfo 用户档案
     * @return 结果
     */
    @Transactional
    @Override
    public int insertXinhuUserinfo(XinhuUserinfo xinhuUserinfo)
    {
        int rows = xinhuUserinfoMapper.insertXinhuUserinfo(xinhuUserinfo);
        insertXinhuUserinfos(xinhuUserinfo);
        return rows;
    }

    /**
     * 修改用户档案
     * 
     * @param xinhuUserinfo 用户档案
     * @return 结果
     */
    @Transactional
    @Override
    public int updateXinhuUserinfo(XinhuUserinfo xinhuUserinfo)
    {
        xinhuUserinfoMapper.deleteXinhuUserinfosByMid((long) xinhuUserinfo.getId());
        insertXinhuUserinfos(xinhuUserinfo);
        return xinhuUserinfoMapper.updateXinhuUserinfo(xinhuUserinfo);
    }

    /**
     * 批量删除用户档案
     * 
     * @param ids 需要删除的用户档案主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteXinhuUserinfoByIds(Long[] ids)
    {
        xinhuUserinfoMapper.deleteXinhuUserinfosByMids(ids);
        return xinhuUserinfoMapper.deleteXinhuUserinfoByIds(ids);
    }

    /**
     * 删除用户档案信息
     * 
     * @param id 用户档案主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteXinhuUserinfoById(Long id)
    {
        xinhuUserinfoMapper.deleteXinhuUserinfosByMid(id);
        return xinhuUserinfoMapper.deleteXinhuUserinfoById(id);
    }

    /**
     * 新增人员档案子信息
     * 
     * @param xinhuUserinfo 用户档案对象
     */
    public void insertXinhuUserinfos(XinhuUserinfo xinhuUserinfo)
    {
        List<XinhuUserinfos> xinhuUserinfosList = xinhuUserinfo.getXinhuUserinfosList();
        Integer id = xinhuUserinfo.getId();
        if (StringUtils.isNotNull(xinhuUserinfosList))
        {
            List<XinhuUserinfos> list = new ArrayList<XinhuUserinfos>();
            for (XinhuUserinfos xinhuUserinfos : xinhuUserinfosList)
            {
                xinhuUserinfos.setMid(id);
                list.add(xinhuUserinfos);
            }
            if (list.size() > 0)
            {
                xinhuUserinfoMapper.batchXinhuUserinfos(list);
            }
        }
    }
}
