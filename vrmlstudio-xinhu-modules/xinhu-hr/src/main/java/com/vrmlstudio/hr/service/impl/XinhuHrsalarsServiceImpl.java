package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuHrsalars;
import com.vrmlstudio.hr.mapper.XinhuHrsalarsMapper;
import com.vrmlstudio.hr.service.IXinhuHrsalarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 薪资模版子Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuHrsalarsServiceImpl implements IXinhuHrsalarsService
{
    @Autowired
    private XinhuHrsalarsMapper xinhuHrsalarsMapper;

    /**
     * 查询薪资模版子
     * 
     * @param id 薪资模版子主键
     * @return 薪资模版子
     */
    @Override
    public XinhuHrsalars selectXinhuHrsalarsById(Long id)
    {
        return xinhuHrsalarsMapper.selectXinhuHrsalarsById(id);
    }

    /**
     * 查询薪资模版子列表
     * 
     * @param xinhuHrsalars 薪资模版子
     * @return 薪资模版子
     */
    @Override
    public List<XinhuHrsalars> selectXinhuHrsalarsList(XinhuHrsalars xinhuHrsalars)
    {
        return xinhuHrsalarsMapper.selectXinhuHrsalarsList(xinhuHrsalars);
    }

    /**
     * 新增薪资模版子
     * 
     * @param xinhuHrsalars 薪资模版子
     * @return 结果
     */
    @Override
    public int insertXinhuHrsalars(XinhuHrsalars xinhuHrsalars)
    {
        return xinhuHrsalarsMapper.insertXinhuHrsalars(xinhuHrsalars);
    }

    /**
     * 修改薪资模版子
     * 
     * @param xinhuHrsalars 薪资模版子
     * @return 结果
     */
    @Override
    public int updateXinhuHrsalars(XinhuHrsalars xinhuHrsalars)
    {
        return xinhuHrsalarsMapper.updateXinhuHrsalars(xinhuHrsalars);
    }

    /**
     * 批量删除薪资模版子
     * 
     * @param ids 需要删除的薪资模版子主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrsalarsByIds(Long[] ids)
    {
        return xinhuHrsalarsMapper.deleteXinhuHrsalarsByIds(ids);
    }

    /**
     * 删除薪资模版子信息
     * 
     * @param id 薪资模版子主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrsalarsById(Long id)
    {
        return xinhuHrsalarsMapper.deleteXinhuHrsalarsById(id);
    }
}
