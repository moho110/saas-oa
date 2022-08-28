package com.vrmlstudio.document.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.document.mapper.XinhuWorcMapper;
import com.vrmlstudio.document.domain.XinhuWorc;
import com.vrmlstudio.document.service.IXinhuWorcService;

/**
 * 文档分区Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuWorcServiceImpl implements IXinhuWorcService 
{
    @Autowired
    private XinhuWorcMapper xinhuWorcMapper;

    /**
     * 查询文档分区
     * 
     * @param id 文档分区主键
     * @return 文档分区
     */
    @Override
    public XinhuWorc selectXinhuWorcById(Long id)
    {
        return xinhuWorcMapper.selectXinhuWorcById(id);
    }

    /**
     * 查询文档分区列表
     * 
     * @param xinhuWorc 文档分区
     * @return 文档分区
     */
    @Override
    public List<XinhuWorc> selectXinhuWorcList(XinhuWorc xinhuWorc)
    {
        return xinhuWorcMapper.selectXinhuWorcList(xinhuWorc);
    }

    /**
     * 新增文档分区
     * 
     * @param xinhuWorc 文档分区
     * @return 结果
     */
    @Override
    public int insertXinhuWorc(XinhuWorc xinhuWorc)
    {
        return xinhuWorcMapper.insertXinhuWorc(xinhuWorc);
    }

    /**
     * 修改文档分区
     * 
     * @param xinhuWorc 文档分区
     * @return 结果
     */
    @Override
    public int updateXinhuWorc(XinhuWorc xinhuWorc)
    {
        return xinhuWorcMapper.updateXinhuWorc(xinhuWorc);
    }

    /**
     * 批量删除文档分区
     * 
     * @param ids 需要删除的文档分区主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWorcByIds(Long[] ids)
    {
        return xinhuWorcMapper.deleteXinhuWorcByIds(ids);
    }

    /**
     * 删除文档分区信息
     * 
     * @param id 文档分区主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWorcById(Long id)
    {
        return xinhuWorcMapper.deleteXinhuWorcById(id);
    }
}
