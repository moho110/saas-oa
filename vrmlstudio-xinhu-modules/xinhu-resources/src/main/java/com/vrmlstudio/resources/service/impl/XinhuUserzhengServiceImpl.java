package com.vrmlstudio.resources.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.resources.mapper.XinhuUserzhengMapper;
import com.vrmlstudio.resources.domain.XinhuUserzheng;
import com.vrmlstudio.resources.service.IXinhuUserzhengService;

/**
 * 说明Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuUserzhengServiceImpl implements IXinhuUserzhengService 
{
    @Autowired
    private XinhuUserzhengMapper xinhuUserzhengMapper;

    /**
     * 查询说明
     * 
     * @param id 说明主键
     * @return 说明
     */
    @Override
    public XinhuUserzheng selectXinhuUserzhengById(Long id)
    {
        return xinhuUserzhengMapper.selectXinhuUserzhengById(id);
    }

    /**
     * 查询说明列表
     * 
     * @param xinhuUserzheng 说明
     * @return 说明
     */
    @Override
    public List<XinhuUserzheng> selectXinhuUserzhengList(XinhuUserzheng xinhuUserzheng)
    {
        return xinhuUserzhengMapper.selectXinhuUserzhengList(xinhuUserzheng);
    }

    /**
     * 新增说明
     * 
     * @param xinhuUserzheng 说明
     * @return 结果
     */
    @Override
    public int insertXinhuUserzheng(XinhuUserzheng xinhuUserzheng)
    {
        return xinhuUserzhengMapper.insertXinhuUserzheng(xinhuUserzheng);
    }

    /**
     * 修改说明
     * 
     * @param xinhuUserzheng 说明
     * @return 结果
     */
    @Override
    public int updateXinhuUserzheng(XinhuUserzheng xinhuUserzheng)
    {
        return xinhuUserzhengMapper.updateXinhuUserzheng(xinhuUserzheng);
    }

    /**
     * 批量删除说明
     * 
     * @param ids 需要删除的说明主键
     * @return 结果
     */
    @Override
    public int deleteXinhuUserzhengByIds(Long[] ids)
    {
        return xinhuUserzhengMapper.deleteXinhuUserzhengByIds(ids);
    }

    /**
     * 删除说明信息
     * 
     * @param id 说明主键
     * @return 结果
     */
    @Override
    public int deleteXinhuUserzhengById(Long id)
    {
        return xinhuUserzhengMapper.deleteXinhuUserzhengById(id);
    }
}
