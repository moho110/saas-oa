package com.vrmlstudio.document.service;

import java.util.List;
import com.vrmlstudio.document.domain.XinhuWenjuan;

/**
 * 问卷Service接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface IXinhuWenjuanService 
{
    /**
     * 查询问卷
     * 
     * @param id 问卷主键
     * @return 问卷
     */
    public XinhuWenjuan selectXinhuWenjuanById(Long id);

    /**
     * 查询问卷列表
     * 
     * @param xinhuWenjuan 问卷
     * @return 问卷集合
     */
    public List<XinhuWenjuan> selectXinhuWenjuanList(XinhuWenjuan xinhuWenjuan);

    /**
     * 新增问卷
     * 
     * @param xinhuWenjuan 问卷
     * @return 结果
     */
    public int insertXinhuWenjuan(XinhuWenjuan xinhuWenjuan);

    /**
     * 修改问卷
     * 
     * @param xinhuWenjuan 问卷
     * @return 结果
     */
    public int updateXinhuWenjuan(XinhuWenjuan xinhuWenjuan);

    /**
     * 批量删除问卷
     * 
     * @param ids 需要删除的问卷主键集合
     * @return 结果
     */
    public int deleteXinhuWenjuanByIds(Long[] ids);

    /**
     * 删除问卷信息
     * 
     * @param id 问卷主键
     * @return 结果
     */
    public int deleteXinhuWenjuanById(Long id);
}
