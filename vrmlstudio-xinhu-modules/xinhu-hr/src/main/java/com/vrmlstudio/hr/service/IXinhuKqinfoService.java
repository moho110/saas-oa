package com.vrmlstudio.hr.service;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuKqinfo;

/**
 * 请假条加班单Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuKqinfoService 
{
    /**
     * 查询请假条加班单
     * 
     * @param id 请假条加班单主键
     * @return 请假条加班单
     */
    public XinhuKqinfo selectXinhuKqinfoById(Long id);

    /**
     * 查询请假条加班单列表
     * 
     * @param xinhuKqinfo 请假条加班单
     * @return 请假条加班单集合
     */
    public List<XinhuKqinfo> selectXinhuKqinfoList(XinhuKqinfo xinhuKqinfo);

    /**
     * 新增请假条加班单
     * 
     * @param xinhuKqinfo 请假条加班单
     * @return 结果
     */
    public int insertXinhuKqinfo(XinhuKqinfo xinhuKqinfo);

    /**
     * 修改请假条加班单
     * 
     * @param xinhuKqinfo 请假条加班单
     * @return 结果
     */
    public int updateXinhuKqinfo(XinhuKqinfo xinhuKqinfo);

    /**
     * 批量删除请假条加班单
     * 
     * @param ids 需要删除的请假条加班单主键集合
     * @return 结果
     */
    public int deleteXinhuKqinfoByIds(Long[] ids);

    /**
     * 删除请假条加班单信息
     * 
     * @param id 请假条加班单主键
     * @return 结果
     */
    public int deleteXinhuKqinfoById(Long id);
}
