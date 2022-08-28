package com.vrmlstudio.document.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.document.mapper.XinhuWenjuanMapper;
import com.vrmlstudio.document.domain.XinhuWenjuan;
import com.vrmlstudio.document.service.IXinhuWenjuanService;

/**
 * 问卷Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuWenjuanServiceImpl implements IXinhuWenjuanService 
{
    @Autowired
    private XinhuWenjuanMapper xinhuWenjuanMapper;

    /**
     * 查询问卷
     * 
     * @param id 问卷主键
     * @return 问卷
     */
    @Override
    public XinhuWenjuan selectXinhuWenjuanById(Long id)
    {
        return xinhuWenjuanMapper.selectXinhuWenjuanById(id);
    }

    /**
     * 查询问卷列表
     * 
     * @param xinhuWenjuan 问卷
     * @return 问卷
     */
    @Override
    public List<XinhuWenjuan> selectXinhuWenjuanList(XinhuWenjuan xinhuWenjuan)
    {
        return xinhuWenjuanMapper.selectXinhuWenjuanList(xinhuWenjuan);
    }

    /**
     * 新增问卷
     * 
     * @param xinhuWenjuan 问卷
     * @return 结果
     */
    @Override
    public int insertXinhuWenjuan(XinhuWenjuan xinhuWenjuan)
    {
        return xinhuWenjuanMapper.insertXinhuWenjuan(xinhuWenjuan);
    }

    /**
     * 修改问卷
     * 
     * @param xinhuWenjuan 问卷
     * @return 结果
     */
    @Override
    public int updateXinhuWenjuan(XinhuWenjuan xinhuWenjuan)
    {
        return xinhuWenjuanMapper.updateXinhuWenjuan(xinhuWenjuan);
    }

    /**
     * 批量删除问卷
     * 
     * @param ids 需要删除的问卷主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWenjuanByIds(Long[] ids)
    {
        return xinhuWenjuanMapper.deleteXinhuWenjuanByIds(ids);
    }

    /**
     * 删除问卷信息
     * 
     * @param id 问卷主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWenjuanById(Long id)
    {
        return xinhuWenjuanMapper.deleteXinhuWenjuanById(id);
    }
}
