package com.vrmlstudio.person.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.person.mapper.XinhuCompanyMapper;
import com.vrmlstudio.person.domain.XinhuCompany;
import com.vrmlstudio.person.service.IXinhuCompanyService;

/**
 * 公司单位Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuCompanyServiceImpl implements IXinhuCompanyService 
{
    @Autowired
    private XinhuCompanyMapper xinhuCompanyMapper;

    /**
     * 查询公司单位
     * 
     * @param id 公司单位主键
     * @return 公司单位
     */
    @Override
    public XinhuCompany selectXinhuCompanyById(Long id)
    {
        return xinhuCompanyMapper.selectXinhuCompanyById(id);
    }

    /**
     * 查询公司单位列表
     * 
     * @param xinhuCompany 公司单位
     * @return 公司单位
     */
    @Override
    public List<XinhuCompany> selectXinhuCompanyList(XinhuCompany xinhuCompany)
    {
        return xinhuCompanyMapper.selectXinhuCompanyList(xinhuCompany);
    }

    /**
     * 新增公司单位
     * 
     * @param xinhuCompany 公司单位
     * @return 结果
     */
    @Override
    public int insertXinhuCompany(XinhuCompany xinhuCompany)
    {
        return xinhuCompanyMapper.insertXinhuCompany(xinhuCompany);
    }

    /**
     * 修改公司单位
     * 
     * @param xinhuCompany 公司单位
     * @return 结果
     */
    @Override
    public int updateXinhuCompany(XinhuCompany xinhuCompany)
    {
        return xinhuCompanyMapper.updateXinhuCompany(xinhuCompany);
    }

    /**
     * 批量删除公司单位
     * 
     * @param ids 需要删除的公司单位主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCompanyByIds(Long[] ids)
    {
        return xinhuCompanyMapper.deleteXinhuCompanyByIds(ids);
    }

    /**
     * 删除公司单位信息
     * 
     * @param id 公司单位主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCompanyById(Long id)
    {
        return xinhuCompanyMapper.deleteXinhuCompanyById(id);
    }
}
