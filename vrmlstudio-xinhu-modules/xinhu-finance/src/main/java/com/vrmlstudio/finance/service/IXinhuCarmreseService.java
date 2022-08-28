package com.vrmlstudio.finance.service;

import java.util.List;
import com.vrmlstudio.finance.domain.XinhuCarmrese;

/**
 * 车辆预定Service接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface IXinhuCarmreseService 
{
    /**
     * 查询车辆预定
     * 
     * @param id 车辆预定主键
     * @return 车辆预定
     */
    public XinhuCarmrese selectXinhuCarmreseById(Long id);

    /**
     * 查询车辆预定列表
     * 
     * @param xinhuCarmrese 车辆预定
     * @return 车辆预定集合
     */
    public List<XinhuCarmrese> selectXinhuCarmreseList(XinhuCarmrese xinhuCarmrese);

    /**
     * 新增车辆预定
     * 
     * @param xinhuCarmrese 车辆预定
     * @return 结果
     */
    public int insertXinhuCarmrese(XinhuCarmrese xinhuCarmrese);

    /**
     * 修改车辆预定
     * 
     * @param xinhuCarmrese 车辆预定
     * @return 结果
     */
    public int updateXinhuCarmrese(XinhuCarmrese xinhuCarmrese);

    /**
     * 批量删除车辆预定
     * 
     * @param ids 需要删除的车辆预定主键集合
     * @return 结果
     */
    public int deleteXinhuCarmreseByIds(Long[] ids);

    /**
     * 删除车辆预定信息
     * 
     * @param id 车辆预定主键
     * @return 结果
     */
    public int deleteXinhuCarmreseById(Long id);
}
