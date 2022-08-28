package com.vrmlstudio.person.mapper;

import java.util.List;
import com.vrmlstudio.person.domain.XinhuCompany;

/**
 * 公司单位Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuCompanyMapper 
{
    /**
     * 查询公司单位
     * 
     * @param id 公司单位主键
     * @return 公司单位
     */
    public XinhuCompany selectXinhuCompanyById(Long id);

    /**
     * 查询公司单位列表
     * 
     * @param xinhuCompany 公司单位
     * @return 公司单位集合
     */
    public List<XinhuCompany> selectXinhuCompanyList(XinhuCompany xinhuCompany);

    /**
     * 新增公司单位
     * 
     * @param xinhuCompany 公司单位
     * @return 结果
     */
    public int insertXinhuCompany(XinhuCompany xinhuCompany);

    /**
     * 修改公司单位
     * 
     * @param xinhuCompany 公司单位
     * @return 结果
     */
    public int updateXinhuCompany(XinhuCompany xinhuCompany);

    /**
     * 删除公司单位
     * 
     * @param id 公司单位主键
     * @return 结果
     */
    public int deleteXinhuCompanyById(Long id);

    /**
     * 批量删除公司单位
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuCompanyByIds(Long[] ids);
}
