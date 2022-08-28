package com.vrmlstudio.document.mapper;

import java.util.List;
import com.vrmlstudio.document.domain.XinhuWenjuat;

/**
 * 问卷子Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuWenjuatMapper 
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
     * 删除问卷子
     * 
     * @param id 问卷子主键
     * @return 结果
     */
    public int deleteXinhuWenjuatById(Long id);

    /**
     * 批量删除问卷子
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuWenjuatByIds(Long[] ids);
}
