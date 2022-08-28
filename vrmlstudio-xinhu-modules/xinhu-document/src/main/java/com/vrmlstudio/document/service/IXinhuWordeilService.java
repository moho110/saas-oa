package com.vrmlstudio.document.service;

import java.util.List;
import com.vrmlstudio.document.domain.XinhuWordeil;

/**
 * 文件传送Service接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface IXinhuWordeilService 
{
    /**
     * 查询文件传送
     * 
     * @param id 文件传送主键
     * @return 文件传送
     */
    public XinhuWordeil selectXinhuWordeilById(Long id);

    /**
     * 查询文件传送列表
     * 
     * @param xinhuWordeil 文件传送
     * @return 文件传送集合
     */
    public List<XinhuWordeil> selectXinhuWordeilList(XinhuWordeil xinhuWordeil);

    /**
     * 新增文件传送
     * 
     * @param xinhuWordeil 文件传送
     * @return 结果
     */
    public int insertXinhuWordeil(XinhuWordeil xinhuWordeil);

    /**
     * 修改文件传送
     * 
     * @param xinhuWordeil 文件传送
     * @return 结果
     */
    public int updateXinhuWordeil(XinhuWordeil xinhuWordeil);

    /**
     * 批量删除文件传送
     * 
     * @param ids 需要删除的文件传送主键集合
     * @return 结果
     */
    public int deleteXinhuWordeilByIds(Long[] ids);

    /**
     * 删除文件传送信息
     * 
     * @param id 文件传送主键
     * @return 结果
     */
    public int deleteXinhuWordeilById(Long id);
}
