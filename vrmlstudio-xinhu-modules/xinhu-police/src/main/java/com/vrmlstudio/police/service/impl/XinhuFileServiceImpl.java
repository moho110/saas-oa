package com.vrmlstudio.police.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.police.mapper.XinhuFileMapper;
import com.vrmlstudio.police.domain.XinhuFile;
import com.vrmlstudio.police.service.IXinhuFileService;

/**
 * 上传文件记录Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuFileServiceImpl implements IXinhuFileService 
{
    @Autowired
    private XinhuFileMapper xinhuFileMapper;

    /**
     * 查询上传文件记录
     * 
     * @param id 上传文件记录主键
     * @return 上传文件记录
     */
    @Override
    public XinhuFile selectXinhuFileById(Long id)
    {
        return xinhuFileMapper.selectXinhuFileById(id);
    }

    /**
     * 查询上传文件记录列表
     * 
     * @param xinhuFile 上传文件记录
     * @return 上传文件记录
     */
    @Override
    public List<XinhuFile> selectXinhuFileList(XinhuFile xinhuFile)
    {
        return xinhuFileMapper.selectXinhuFileList(xinhuFile);
    }

    /**
     * 新增上传文件记录
     * 
     * @param xinhuFile 上传文件记录
     * @return 结果
     */
    @Override
    public int insertXinhuFile(XinhuFile xinhuFile)
    {
        return xinhuFileMapper.insertXinhuFile(xinhuFile);
    }

    /**
     * 修改上传文件记录
     * 
     * @param xinhuFile 上传文件记录
     * @return 结果
     */
    @Override
    public int updateXinhuFile(XinhuFile xinhuFile)
    {
        return xinhuFileMapper.updateXinhuFile(xinhuFile);
    }

    /**
     * 批量删除上传文件记录
     * 
     * @param ids 需要删除的上传文件记录主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFileByIds(Long[] ids)
    {
        return xinhuFileMapper.deleteXinhuFileByIds(ids);
    }

    /**
     * 删除上传文件记录信息
     * 
     * @param id 上传文件记录主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFileById(Long id)
    {
        return xinhuFileMapper.deleteXinhuFileById(id);
    }
}
