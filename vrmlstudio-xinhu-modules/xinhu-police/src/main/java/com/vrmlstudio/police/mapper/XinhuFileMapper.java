package com.vrmlstudio.police.mapper;

import java.util.List;
import com.vrmlstudio.police.domain.XinhuFile;

/**
 * 上传文件记录Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuFileMapper 
{
    /**
     * 查询上传文件记录
     * 
     * @param id 上传文件记录主键
     * @return 上传文件记录
     */
    public XinhuFile selectXinhuFileById(Long id);

    /**
     * 查询上传文件记录列表
     * 
     * @param xinhuFile 上传文件记录
     * @return 上传文件记录集合
     */
    public List<XinhuFile> selectXinhuFileList(XinhuFile xinhuFile);

    /**
     * 新增上传文件记录
     * 
     * @param xinhuFile 上传文件记录
     * @return 结果
     */
    public int insertXinhuFile(XinhuFile xinhuFile);

    /**
     * 修改上传文件记录
     * 
     * @param xinhuFile 上传文件记录
     * @return 结果
     */
    public int updateXinhuFile(XinhuFile xinhuFile);

    /**
     * 删除上传文件记录
     * 
     * @param id 上传文件记录主键
     * @return 结果
     */
    public int deleteXinhuFileById(Long id);

    /**
     * 批量删除上传文件记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuFileByIds(Long[] ids);
}
