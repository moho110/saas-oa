package com.vrmlstudio.hr.service;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuKqerr;

/**
 * 打卡异常申请Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuKqerrService 
{
    /**
     * 查询打卡异常申请
     * 
     * @param id 打卡异常申请主键
     * @return 打卡异常申请
     */
    public XinhuKqerr selectXinhuKqerrById(Long id);

    /**
     * 查询打卡异常申请列表
     * 
     * @param xinhuKqerr 打卡异常申请
     * @return 打卡异常申请集合
     */
    public List<XinhuKqerr> selectXinhuKqerrList(XinhuKqerr xinhuKqerr);

    /**
     * 新增打卡异常申请
     * 
     * @param xinhuKqerr 打卡异常申请
     * @return 结果
     */
    public int insertXinhuKqerr(XinhuKqerr xinhuKqerr);

    /**
     * 修改打卡异常申请
     * 
     * @param xinhuKqerr 打卡异常申请
     * @return 结果
     */
    public int updateXinhuKqerr(XinhuKqerr xinhuKqerr);

    /**
     * 批量删除打卡异常申请
     * 
     * @param ids 需要删除的打卡异常申请主键集合
     * @return 结果
     */
    public int deleteXinhuKqerrByIds(Long[] ids);

    /**
     * 删除打卡异常申请信息
     * 
     * @param id 打卡异常申请主键
     * @return 结果
     */
    public int deleteXinhuKqerrById(Long id);
}
