package com.vrmlstudio.person.service;

import java.util.List;
import com.vrmlstudio.person.domain.XinhuCompany;

/**
 * 公司单位Service接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface IXinhuCompanyService 
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
     * 批量删除公司单位
     * 
     * @param ids 需要删除的公司单位主键集合
     * @return 结果
     */
    public int deleteXinhuCompanyByIds(Long[] ids);

    /**
     * 删除公司单位信息
     * 
     * @param id 公司单位主键
     * @return 结果
     */
    public int deleteXinhuCompanyById(Long id);
}
