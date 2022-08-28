package com.vrmlstudio.document.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.document.mapper.XinhuWordeilMapper;
import com.vrmlstudio.document.domain.XinhuWordeil;
import com.vrmlstudio.document.service.IXinhuWordeilService;

/**
 * 文件传送Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuWordeilServiceImpl implements IXinhuWordeilService 
{
    @Autowired
    private XinhuWordeilMapper xinhuWordeilMapper;

    /**
     * 查询文件传送
     * 
     * @param id 文件传送主键
     * @return 文件传送
     */
    @Override
    public XinhuWordeil selectXinhuWordeilById(Long id)
    {
        return xinhuWordeilMapper.selectXinhuWordeilById(id);
    }

    /**
     * 查询文件传送列表
     * 
     * @param xinhuWordeil 文件传送
     * @return 文件传送
     */
    @Override
    public List<XinhuWordeil> selectXinhuWordeilList(XinhuWordeil xinhuWordeil)
    {
        return xinhuWordeilMapper.selectXinhuWordeilList(xinhuWordeil);
    }

    /**
     * 新增文件传送
     * 
     * @param xinhuWordeil 文件传送
     * @return 结果
     */
    @Override
    public int insertXinhuWordeil(XinhuWordeil xinhuWordeil)
    {
        return xinhuWordeilMapper.insertXinhuWordeil(xinhuWordeil);
    }

    /**
     * 修改文件传送
     * 
     * @param xinhuWordeil 文件传送
     * @return 结果
     */
    @Override
    public int updateXinhuWordeil(XinhuWordeil xinhuWordeil)
    {
        return xinhuWordeilMapper.updateXinhuWordeil(xinhuWordeil);
    }

    /**
     * 批量删除文件传送
     * 
     * @param ids 需要删除的文件传送主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWordeilByIds(Long[] ids)
    {
        return xinhuWordeilMapper.deleteXinhuWordeilByIds(ids);
    }

    /**
     * 删除文件传送信息
     * 
     * @param id 文件传送主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWordeilById(Long id)
    {
        return xinhuWordeilMapper.deleteXinhuWordeilById(id);
    }
}
