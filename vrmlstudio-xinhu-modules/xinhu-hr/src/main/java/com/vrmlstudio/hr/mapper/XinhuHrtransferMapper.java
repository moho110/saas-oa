package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuHrtransfer;

/**
 * 职位调动Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuHrtransferMapper 
{
    /**
     * 查询职位调动
     * 
     * @param id 职位调动主键
     * @return 职位调动
     */
    public XinhuHrtransfer selectXinhuHrtransferById(Long id);

    /**
     * 查询职位调动列表
     * 
     * @param xinhuHrtransfer 职位调动
     * @return 职位调动集合
     */
    public List<XinhuHrtransfer> selectXinhuHrtransferList(XinhuHrtransfer xinhuHrtransfer);

    /**
     * 新增职位调动
     * 
     * @param xinhuHrtransfer 职位调动
     * @return 结果
     */
    public int insertXinhuHrtransfer(XinhuHrtransfer xinhuHrtransfer);

    /**
     * 修改职位调动
     * 
     * @param xinhuHrtransfer 职位调动
     * @return 结果
     */
    public int updateXinhuHrtransfer(XinhuHrtransfer xinhuHrtransfer);

    /**
     * 删除职位调动
     * 
     * @param id 职位调动主键
     * @return 结果
     */
    public int deleteXinhuHrtransferById(Long id);

    /**
     * 批量删除职位调动
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuHrtransferByIds(Long[] ids);
}
