package com.vrmlstudio.document.service;

import java.util.List;
import com.vrmlstudio.document.domain.XinhuWenjuat;

/**
 * 问卷子Service接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface IXinhuWenjuatService 
{
    /**
     * 查询问卷子
     * 
     * @param id 问卷子主键
     * @return 问卷子
     */
    public XinhuWenjuat selectXinhuWenjuatById(Long id);

    /**
     * 查询问卷子列表
     * 
     * @param xinhuWenjuat 问卷子
     * @return 问卷子集合
     */
    public List<XinhuWenjuat> selectXinhuWenjuatList(XinhuWenjuat xinhuWenjuat);

    /**
     * 新增问卷子
     * 
     * @param xinhuWenjuat 问卷子
     * @return 结果
     */
    public int insertXinhuWenjuat(XinhuWenjuat xinhuWenjuat);

    /**
     * 修改问卷子
     * 
     * @param xinhuWenjuat 问卷子
     * @return 结果
     */
    public int updateXinhuWenjuat(XinhuWenjuat xinhuWenjuat);

    /**
     * 批量删除问卷子
     * 
     * @param ids 需要删除的问卷子主键集合
     * @return 结果
     */
    public int deleteXinhuWenjuatByIds(Long[] ids);

    /**
     * 删除问卷子信息
     * 
     * @param id 问卷子主键
     * @return 结果
     */
    public int deleteXinhuWenjuatById(Long id);
}
