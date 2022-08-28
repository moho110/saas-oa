package com.vrmlstudio.police.service;

import java.util.List;
import com.vrmlstudio.police.domain.XinhuFininfos;

/**
 * 费用报销子Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuFininfosService 
{
    /**
     * 查询费用报销子
     * 
     * @param id 费用报销子主键
     * @return 费用报销子
     */
    public XinhuFininfos selectXinhuFininfosById(Long id);

    /**
     * 查询费用报销子列表
     * 
     * @param xinhuFininfos 费用报销子
     * @return 费用报销子集合
     */
    public List<XinhuFininfos> selectXinhuFininfosList(XinhuFininfos xinhuFininfos);

    /**
     * 新增费用报销子
     * 
     * @param xinhuFininfos 费用报销子
     * @return 结果
     */
    public int insertXinhuFininfos(XinhuFininfos xinhuFininfos);

    /**
     * 修改费用报销子
     * 
     * @param xinhuFininfos 费用报销子
     * @return 结果
     */
    public int updateXinhuFininfos(XinhuFininfos xinhuFininfos);

    /**
     * 批量删除费用报销子
     * 
     * @param ids 需要删除的费用报销子主键集合
     * @return 结果
     */
    public int deleteXinhuFininfosByIds(Long[] ids);

    /**
     * 删除费用报销子信息
     * 
     * @param id 费用报销子主键
     * @return 结果
     */
    public int deleteXinhuFininfosById(Long id);
}
