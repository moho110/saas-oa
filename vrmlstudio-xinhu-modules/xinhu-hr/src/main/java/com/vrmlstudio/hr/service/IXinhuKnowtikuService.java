package com.vrmlstudio.hr.service;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuKnowtiku;

/**
 * 知识题库Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuKnowtikuService 
{
    /**
     * 查询知识题库
     * 
     * @param id 知识题库主键
     * @return 知识题库
     */
    public XinhuKnowtiku selectXinhuKnowtikuById(Long id);

    /**
     * 查询知识题库列表
     * 
     * @param xinhuKnowtiku 知识题库
     * @return 知识题库集合
     */
    public List<XinhuKnowtiku> selectXinhuKnowtikuList(XinhuKnowtiku xinhuKnowtiku);

    /**
     * 新增知识题库
     * 
     * @param xinhuKnowtiku 知识题库
     * @return 结果
     */
    public int insertXinhuKnowtiku(XinhuKnowtiku xinhuKnowtiku);

    /**
     * 修改知识题库
     * 
     * @param xinhuKnowtiku 知识题库
     * @return 结果
     */
    public int updateXinhuKnowtiku(XinhuKnowtiku xinhuKnowtiku);

    /**
     * 批量删除知识题库
     * 
     * @param ids 需要删除的知识题库主键集合
     * @return 结果
     */
    public int deleteXinhuKnowtikuByIds(Long[] ids);

    /**
     * 删除知识题库信息
     * 
     * @param id 知识题库主键
     * @return 结果
     */
    public int deleteXinhuKnowtikuById(Long id);
}
