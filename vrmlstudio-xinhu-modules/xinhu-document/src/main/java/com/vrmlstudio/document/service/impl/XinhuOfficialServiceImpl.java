package com.vrmlstudio.document.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.document.mapper.XinhuOfficialMapper;
import com.vrmlstudio.document.domain.XinhuOfficial;
import com.vrmlstudio.document.service.IXinhuOfficialService;

/**
 * 公文Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuOfficialServiceImpl implements IXinhuOfficialService 
{
    @Autowired(required = false)
    private XinhuOfficialMapper xinhuOfficialMapper;

    /**
     * 查询公文
     * 
     * @param id 公文主键
     * @return 公文
     */
    @Override
    public XinhuOfficial selectXinhuOfficialById(Long id)
    {
        return xinhuOfficialMapper.selectXinhuOfficialById(id);
    }

    /**
     * 查询公文列表
     * 
     * @param xinhuOfficial 公文
     * @return 公文
     */
    @Override
    public List<XinhuOfficial> selectXinhuOfficialList(XinhuOfficial xinhuOfficial)
    {
        return xinhuOfficialMapper.selectXinhuOfficialList(xinhuOfficial);
    }

    /**
     * 新增公文
     * 
     * @param xinhuOfficial 公文
     * @return 结果
     */
    @Override
    public int insertXinhuOfficial(XinhuOfficial xinhuOfficial)
    {
        return xinhuOfficialMapper.insertXinhuOfficial(xinhuOfficial);
    }

    /**
     * 修改公文
     * 
     * @param xinhuOfficial 公文
     * @return 结果
     */
    @Override
    public int updateXinhuOfficial(XinhuOfficial xinhuOfficial)
    {
        return xinhuOfficialMapper.updateXinhuOfficial(xinhuOfficial);
    }

    /**
     * 批量删除公文
     * 
     * @param ids 需要删除的公文主键
     * @return 结果
     */
    @Override
    public int deleteXinhuOfficialByIds(Long[] ids)
    {
        return xinhuOfficialMapper.deleteXinhuOfficialByIds(ids);
    }

    /**
     * 删除公文信息
     * 
     * @param id 公文主键
     * @return 结果
     */
    @Override
    public int deleteXinhuOfficialById(Long id)
    {
        return xinhuOfficialMapper.deleteXinhuOfficialById(id);
    }
}
