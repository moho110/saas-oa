package com.vrmlstudio.police.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.police.mapper.XinhuFilesMapper;
import com.vrmlstudio.police.domain.XinhuFiles;
import com.vrmlstudio.police.service.IXinhuFilesService;

/**
 * 文件记录下载和预览Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-19
 */
@Service
public class XinhuFilesServiceImpl implements IXinhuFilesService 
{
    @Autowired
    private XinhuFilesMapper xinhuFilesMapper;

    /**
     * 查询文件记录下载和预览
     * 
     * @param id 文件记录下载和预览主键
     * @return 文件记录下载和预览
     */
    @Override
    public XinhuFiles selectXinhuFilesById(Long id)
    {
        return xinhuFilesMapper.selectXinhuFilesById(id);
    }

    /**
     * 查询文件记录下载和预览列表
     * 
     * @param xinhuFiles 文件记录下载和预览
     * @return 文件记录下载和预览
     */
    @Override
    public List<XinhuFiles> selectXinhuFilesList(XinhuFiles xinhuFiles)
    {
        return xinhuFilesMapper.selectXinhuFilesList(xinhuFiles);
    }

    /**
     * 新增文件记录下载和预览
     * 
     * @param xinhuFiles 文件记录下载和预览
     * @return 结果
     */
    @Override
    public int insertXinhuFiles(XinhuFiles xinhuFiles)
    {
        return xinhuFilesMapper.insertXinhuFiles(xinhuFiles);
    }

    /**
     * 修改文件记录下载和预览
     * 
     * @param xinhuFiles 文件记录下载和预览
     * @return 结果
     */
    @Override
    public int updateXinhuFiles(XinhuFiles xinhuFiles)
    {
        return xinhuFilesMapper.updateXinhuFiles(xinhuFiles);
    }

    /**
     * 批量删除文件记录下载和预览
     * 
     * @param ids 需要删除的文件记录下载和预览主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFilesByIds(Long[] ids)
    {
        return xinhuFilesMapper.deleteXinhuFilesByIds(ids);
    }

    /**
     * 删除文件记录下载和预览信息
     * 
     * @param id 文件记录下载和预览主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFilesById(Long id)
    {
        return xinhuFilesMapper.deleteXinhuFilesById(id);
    }
}
