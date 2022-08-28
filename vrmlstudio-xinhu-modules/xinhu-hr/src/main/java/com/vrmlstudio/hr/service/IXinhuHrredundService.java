package com.vrmlstudio.hr.service;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuHrredund;

/**
 * 离职申请Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuHrredundService 
{
    /**
     * 查询离职申请
     * 
     * @param id 离职申请主键
     * @return 离职申请
     */
    public XinhuHrredund selectXinhuHrredundById(Long id);

    /**
     * 查询离职申请列表
     * 
     * @param xinhuHrredund 离职申请
     * @return 离职申请集合
     */
    public List<XinhuHrredund> selectXinhuHrredundList(XinhuHrredund xinhuHrredund);

    /**
     * 新增离职申请
     * 
     * @param xinhuHrredund 离职申请
     * @return 结果
     */
    public int insertXinhuHrredund(XinhuHrredund xinhuHrredund);

    /**
     * 修改离职申请
     * 
     * @param xinhuHrredund 离职申请
     * @return 结果
     */
    public int updateXinhuHrredund(XinhuHrredund xinhuHrredund);

    /**
     * 批量删除离职申请
     * 
     * @param ids 需要删除的离职申请主键集合
     * @return 结果
     */
    public int deleteXinhuHrredundByIds(Long[] ids);

    /**
     * 删除离职申请信息
     * 
     * @param id 离职申请主键
     * @return 结果
     */
    public int deleteXinhuHrredundById(Long id);
}
