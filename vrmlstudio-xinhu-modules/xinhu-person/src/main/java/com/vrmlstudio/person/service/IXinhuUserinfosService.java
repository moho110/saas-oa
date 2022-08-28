package com.vrmlstudio.person.service;

import java.util.List;
import com.vrmlstudio.person.domain.XinhuUserinfos;

/**
 * 人员档案子Service接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface IXinhuUserinfosService 
{
    /**
     * 查询人员档案子
     * 
     * @param id 人员档案子主键
     * @return 人员档案子
     */
    public XinhuUserinfos selectXinhuUserinfosById(Long id);

    /**
     * 查询人员档案子列表
     * 
     * @param xinhuUserinfos 人员档案子
     * @return 人员档案子集合
     */
    public List<XinhuUserinfos> selectXinhuUserinfosList(XinhuUserinfos xinhuUserinfos);

    /**
     * 新增人员档案子
     * 
     * @param xinhuUserinfos 人员档案子
     * @return 结果
     */
    public int insertXinhuUserinfos(XinhuUserinfos xinhuUserinfos);

    /**
     * 修改人员档案子
     * 
     * @param xinhuUserinfos 人员档案子
     * @return 结果
     */
    public int updateXinhuUserinfos(XinhuUserinfos xinhuUserinfos);

    /**
     * 批量删除人员档案子
     * 
     * @param ids 需要删除的人员档案子主键集合
     * @return 结果
     */
    public int deleteXinhuUserinfosByIds(Long[] ids);

    /**
     * 删除人员档案子信息
     * 
     * @param id 人员档案子主键
     * @return 结果
     */
    public int deleteXinhuUserinfosById(Long id);
}
