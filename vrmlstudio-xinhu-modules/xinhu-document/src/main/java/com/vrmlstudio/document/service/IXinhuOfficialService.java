package com.vrmlstudio.document.service;

import java.util.List;
import com.vrmlstudio.document.domain.XinhuOfficial;

/**
 * 公文Service接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface IXinhuOfficialService 
{
    /**
     * 查询公文
     * 
     * @param id 公文主键
     * @return 公文
     */
    public XinhuOfficial selectXinhuOfficialById(Long id);

    /**
     * 查询公文列表
     * 
     * @param xinhuOfficial 公文
     * @return 公文集合
     */
    public List<XinhuOfficial> selectXinhuOfficialList(XinhuOfficial xinhuOfficial);

    /**
     * 新增公文
     * 
     * @param xinhuOfficial 公文
     * @return 结果
     */
    public int insertXinhuOfficial(XinhuOfficial xinhuOfficial);

    /**
     * 修改公文
     * 
     * @param xinhuOfficial 公文
     * @return 结果
     */
    public int updateXinhuOfficial(XinhuOfficial xinhuOfficial);

    /**
     * 批量删除公文
     * 
     * @param ids 需要删除的公文主键集合
     * @return 结果
     */
    public int deleteXinhuOfficialByIds(Long[] ids);

    /**
     * 删除公文信息
     * 
     * @param id 公文主键
     * @return 结果
     */
    public int deleteXinhuOfficialById(Long id);
}
