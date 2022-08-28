package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuHrpositive;

/**
 * HR转正Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuHrpositiveMapper 
{
    /**
     * 查询HR转正
     * 
     * @param id HR转正主键
     * @return HR转正
     */
    public XinhuHrpositive selectXinhuHrpositiveById(Long id);

    /**
     * 查询HR转正列表
     * 
     * @param xinhuHrpositive HR转正
     * @return HR转正集合
     */
    public List<XinhuHrpositive> selectXinhuHrpositiveList(XinhuHrpositive xinhuHrpositive);

    /**
     * 新增HR转正
     * 
     * @param xinhuHrpositive HR转正
     * @return 结果
     */
    public int insertXinhuHrpositive(XinhuHrpositive xinhuHrpositive);

    /**
     * 修改HR转正
     * 
     * @param xinhuHrpositive HR转正
     * @return 结果
     */
    public int updateXinhuHrpositive(XinhuHrpositive xinhuHrpositive);

    /**
     * 删除HR转正
     * 
     * @param id HR转正主键
     * @return 结果
     */
    public int deleteXinhuHrpositiveById(Long id);

    /**
     * 批量删除HR转正
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuHrpositiveByIds(Long[] ids);
}
