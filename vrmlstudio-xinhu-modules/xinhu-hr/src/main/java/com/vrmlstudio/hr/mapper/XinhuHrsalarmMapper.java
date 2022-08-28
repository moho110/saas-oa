package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuHrsalarm;

/**
 * 薪资模版Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuHrsalarmMapper 
{
    /**
     * 查询薪资模版
     * 
     * @param id 薪资模版主键
     * @return 薪资模版
     */
    public XinhuHrsalarm selectXinhuHrsalarmById(Long id);

    /**
     * 查询薪资模版列表
     * 
     * @param xinhuHrsalarm 薪资模版
     * @return 薪资模版集合
     */
    public List<XinhuHrsalarm> selectXinhuHrsalarmList(XinhuHrsalarm xinhuHrsalarm);

    /**
     * 新增薪资模版
     * 
     * @param xinhuHrsalarm 薪资模版
     * @return 结果
     */
    public int insertXinhuHrsalarm(XinhuHrsalarm xinhuHrsalarm);

    /**
     * 修改薪资模版
     * 
     * @param xinhuHrsalarm 薪资模版
     * @return 结果
     */
    public int updateXinhuHrsalarm(XinhuHrsalarm xinhuHrsalarm);

    /**
     * 删除薪资模版
     * 
     * @param id 薪资模版主键
     * @return 结果
     */
    public int deleteXinhuHrsalarmById(Long id);

    /**
     * 批量删除薪资模版
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuHrsalarmByIds(Long[] ids);
}
