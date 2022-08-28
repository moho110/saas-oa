package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuKnowtiku;

/**
 * 知识题库Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuKnowtikuMapper 
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
     * 删除知识题库
     * 
     * @param id 知识题库主键
     * @return 结果
     */
    public int deleteXinhuKnowtikuById(Long id);

    /**
     * 批量删除知识题库
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuKnowtikuByIds(Long[] ids);
}
