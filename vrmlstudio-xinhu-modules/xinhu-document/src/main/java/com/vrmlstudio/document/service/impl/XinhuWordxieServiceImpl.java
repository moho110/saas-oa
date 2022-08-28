package com.vrmlstudio.document.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.document.mapper.XinhuWordxieMapper;
import com.vrmlstudio.document.domain.XinhuWordxie;
import com.vrmlstudio.document.service.IXinhuWordxieService;

/**
 * 文档协作Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuWordxieServiceImpl implements IXinhuWordxieService 
{
    @Autowired
    private XinhuWordxieMapper xinhuWordxieMapper;

    /**
     * 查询文档协作
     * 
     * @param id 文档协作主键
     * @return 文档协作
     */
    @Override
    public XinhuWordxie selectXinhuWordxieById(Long id)
    {
        return xinhuWordxieMapper.selectXinhuWordxieById(id);
    }

    /**
     * 查询文档协作列表
     * 
     * @param xinhuWordxie 文档协作
     * @return 文档协作
     */
    @Override
    public List<XinhuWordxie> selectXinhuWordxieList(XinhuWordxie xinhuWordxie)
    {
        return xinhuWordxieMapper.selectXinhuWordxieList(xinhuWordxie);
    }

    /**
     * 新增文档协作
     * 
     * @param xinhuWordxie 文档协作
     * @return 结果
     */
    @Override
    public int insertXinhuWordxie(XinhuWordxie xinhuWordxie)
    {
        return xinhuWordxieMapper.insertXinhuWordxie(xinhuWordxie);
    }

    /**
     * 修改文档协作
     * 
     * @param xinhuWordxie 文档协作
     * @return 结果
     */
    @Override
    public int updateXinhuWordxie(XinhuWordxie xinhuWordxie)
    {
        return xinhuWordxieMapper.updateXinhuWordxie(xinhuWordxie);
    }

    /**
     * 批量删除文档协作
     * 
     * @param ids 需要删除的文档协作主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWordxieByIds(Long[] ids)
    {
        return xinhuWordxieMapper.deleteXinhuWordxieByIds(ids);
    }

    /**
     * 删除文档协作信息
     * 
     * @param id 文档协作主键
     * @return 结果
     */
    @Override
    public int deleteXinhuWordxieById(Long id)
    {
        return xinhuWordxieMapper.deleteXinhuWordxieById(id);
    }
}
