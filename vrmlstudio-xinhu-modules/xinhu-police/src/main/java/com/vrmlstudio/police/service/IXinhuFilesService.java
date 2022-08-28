package com.vrmlstudio.police.service;

import java.util.List;
import com.vrmlstudio.police.domain.XinhuFiles;

/**
 * 文件记录下载和预览Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuFilesService 
{
    /**
     * 查询文件记录下载和预览
     * 
     * @param id 文件记录下载和预览主键
     * @return 文件记录下载和预览
     */
    public XinhuFiles selectXinhuFilesById(Long id);

    /**
     * 查询文件记录下载和预览列表
     * 
     * @param xinhuFiles 文件记录下载和预览
     * @return 文件记录下载和预览集合
     */
    public List<XinhuFiles> selectXinhuFilesList(XinhuFiles xinhuFiles);

    /**
     * 新增文件记录下载和预览
     * 
     * @param xinhuFiles 文件记录下载和预览
     * @return 结果
     */
    public int insertXinhuFiles(XinhuFiles xinhuFiles);

    /**
     * 修改文件记录下载和预览
     * 
     * @param xinhuFiles 文件记录下载和预览
     * @return 结果
     */
    public int updateXinhuFiles(XinhuFiles xinhuFiles);

    /**
     * 批量删除文件记录下载和预览
     * 
     * @param ids 需要删除的文件记录下载和预览主键集合
     * @return 结果
     */
    public int deleteXinhuFilesByIds(Long[] ids);

    /**
     * 删除文件记录下载和预览信息
     * 
     * @param id 文件记录下载和预览主键
     * @return 结果
     */
    public int deleteXinhuFilesById(Long id);
}
