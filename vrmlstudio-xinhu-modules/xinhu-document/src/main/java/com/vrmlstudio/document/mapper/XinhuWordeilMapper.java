package com.vrmlstudio.document.mapper;

import java.util.List;
import com.vrmlstudio.document.domain.XinhuWordeil;

/**
 * 文件传送Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuWordeilMapper 
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
     * 删除文件传送
     * 
     * @param id 文件传送主键
     * @return 结果
     */
    public int deleteXinhuWordeilById(Long id);

    /**
     * 批量删除文件传送
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuWordeilByIds(Long[] ids);
}
