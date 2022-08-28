package com.vrmlstudio.hr.service.impl;

import java.util.List;

import com.vrmlstudio.hr.domain.XinhuHrtransfer;
import com.vrmlstudio.hr.mapper.XinhuHrtransferMapper;
import com.vrmlstudio.hr.service.IXinhuHrtransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 职位调动Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuHrtransferServiceImpl implements IXinhuHrtransferService
{
    @Autowired
    private XinhuHrtransferMapper xinhuHrtransferMapper;

    /**
     * 查询职位调动
     * 
     * @param id 职位调动主键
     * @return 职位调动
     */
    @Override
    public XinhuHrtransfer selectXinhuHrtransferById(Long id)
    {
        return xinhuHrtransferMapper.selectXinhuHrtransferById(id);
    }

    /**
     * 查询职位调动列表
     * 
     * @param xinhuHrtransfer 职位调动
     * @return 职位调动
     */
    @Override
    public List<XinhuHrtransfer> selectXinhuHrtransferList(XinhuHrtransfer xinhuHrtransfer)
    {
        return xinhuHrtransferMapper.selectXinhuHrtransferList(xinhuHrtransfer);
    }

    /**
     * 新增职位调动
     * 
     * @param xinhuHrtransfer 职位调动
     * @return 结果
     */
    @Override
    public int insertXinhuHrtransfer(XinhuHrtransfer xinhuHrtransfer)
    {
        return xinhuHrtransferMapper.insertXinhuHrtransfer(xinhuHrtransfer);
    }

    /**
     * 修改职位调动
     * 
     * @param xinhuHrtransfer 职位调动
     * @return 结果
     */
    @Override
    public int updateXinhuHrtransfer(XinhuHrtransfer xinhuHrtransfer)
    {
        return xinhuHrtransferMapper.updateXinhuHrtransfer(xinhuHrtransfer);
    }

    /**
     * 批量删除职位调动
     * 
     * @param ids 需要删除的职位调动主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrtransferByIds(Long[] ids)
    {
        return xinhuHrtransferMapper.deleteXinhuHrtransferByIds(ids);
    }

    /**
     * 删除职位调动信息
     * 
     * @param id 职位调动主键
     * @return 结果
     */
    @Override
    public int deleteXinhuHrtransferById(Long id)
    {
        return xinhuHrtransferMapper.deleteXinhuHrtransferById(id);
    }
}
