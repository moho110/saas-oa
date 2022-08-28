package com.vrmlstudio.document.service;

import java.util.List;
import com.vrmlstudio.document.domain.XinhuSealapl;

/**
 * 印章申请使用Service接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface IXinhuSealaplService 
{
    /**
     * 查询印章申请使用
     * 
     * @param id 印章申请使用主键
     * @return 印章申请使用
     */
    public XinhuSealapl selectXinhuSealaplById(Long id);

    /**
     * 查询印章申请使用列表
     * 
     * @param xinhuSealapl 印章申请使用
     * @return 印章申请使用集合
     */
    public List<XinhuSealapl> selectXinhuSealaplList(XinhuSealapl xinhuSealapl);

    /**
     * 新增印章申请使用
     * 
     * @param xinhuSealapl 印章申请使用
     * @return 结果
     */
    public int insertXinhuSealapl(XinhuSealapl xinhuSealapl);

    /**
     * 修改印章申请使用
     * 
     * @param xinhuSealapl 印章申请使用
     * @return 结果
     */
    public int updateXinhuSealapl(XinhuSealapl xinhuSealapl);

    /**
     * 批量删除印章申请使用
     * 
     * @param ids 需要删除的印章申请使用主键集合
     * @return 结果
     */
    public int deleteXinhuSealaplByIds(Long[] ids);

    /**
     * 删除印章申请使用信息
     * 
     * @param id 印章申请使用主键
     * @return 结果
     */
    public int deleteXinhuSealaplById(Long id);
}
