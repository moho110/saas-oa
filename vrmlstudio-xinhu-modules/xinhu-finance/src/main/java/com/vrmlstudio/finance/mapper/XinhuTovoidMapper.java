package com.vrmlstudio.finance.mapper;

import java.util.List;
import com.vrmlstudio.finance.domain.XinhuTovoid;

/**
 * 单据申请作废Mapper接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface XinhuTovoidMapper 
{
    /**
     * 查询单据申请作废
     * 
     * @param id 单据申请作废主键
     * @return 单据申请作废
     */
    public XinhuTovoid selectXinhuTovoidById(Long id);

    /**
     * 查询单据申请作废列表
     * 
     * @param xinhuTovoid 单据申请作废
     * @return 单据申请作废集合
     */
    public List<XinhuTovoid> selectXinhuTovoidList(XinhuTovoid xinhuTovoid);

    /**
     * 新增单据申请作废
     * 
     * @param xinhuTovoid 单据申请作废
     * @return 结果
     */
    public int insertXinhuTovoid(XinhuTovoid xinhuTovoid);

    /**
     * 修改单据申请作废
     * 
     * @param xinhuTovoid 单据申请作废
     * @return 结果
     */
    public int updateXinhuTovoid(XinhuTovoid xinhuTovoid);

    /**
     * 删除单据申请作废
     * 
     * @param id 单据申请作废主键
     * @return 结果
     */
    public int deleteXinhuTovoidById(Long id);

    /**
     * 批量删除单据申请作废
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuTovoidByIds(Long[] ids);
}
