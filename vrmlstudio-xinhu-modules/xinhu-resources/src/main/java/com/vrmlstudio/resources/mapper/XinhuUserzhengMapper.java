package com.vrmlstudio.resources.mapper;

import java.util.List;
import com.vrmlstudio.resources.domain.XinhuUserzheng;

/**
 * 说明Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuUserzhengMapper 
{
    /**
     * 查询说明
     * 
     * @param id 说明主键
     * @return 说明
     */
    public XinhuUserzheng selectXinhuUserzhengById(Long id);

    /**
     * 查询说明列表
     * 
     * @param xinhuUserzheng 说明
     * @return 说明集合
     */
    public List<XinhuUserzheng> selectXinhuUserzhengList(XinhuUserzheng xinhuUserzheng);

    /**
     * 新增说明
     * 
     * @param xinhuUserzheng 说明
     * @return 结果
     */
    public int insertXinhuUserzheng(XinhuUserzheng xinhuUserzheng);

    /**
     * 修改说明
     * 
     * @param xinhuUserzheng 说明
     * @return 结果
     */
    public int updateXinhuUserzheng(XinhuUserzheng xinhuUserzheng);

    /**
     * 删除说明
     * 
     * @param id 说明主键
     * @return 结果
     */
    public int deleteXinhuUserzhengById(Long id);

    /**
     * 批量删除说明
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuUserzhengByIds(Long[] ids);
}
