package com.vrmlstudio.police.service;

import java.util.List;
import com.vrmlstudio.police.domain.XinhuFininfom;

/**
 * 费用报销Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuFininfomService 
{
    /**
     * 查询费用报销
     * 
     * @param id 费用报销主键
     * @return 费用报销
     */
    public XinhuFininfom selectXinhuFininfomById(Long id);

    /**
     * 查询费用报销列表
     * 
     * @param xinhuFininfom 费用报销
     * @return 费用报销集合
     */
    public List<XinhuFininfom> selectXinhuFininfomList(XinhuFininfom xinhuFininfom);

    /**
     * 新增费用报销
     * 
     * @param xinhuFininfom 费用报销
     * @return 结果
     */
    public int insertXinhuFininfom(XinhuFininfom xinhuFininfom);

    /**
     * 修改费用报销
     * 
     * @param xinhuFininfom 费用报销
     * @return 结果
     */
    public int updateXinhuFininfom(XinhuFininfom xinhuFininfom);

    /**
     * 批量删除费用报销
     * 
     * @param ids 需要删除的费用报销主键集合
     * @return 结果
     */
    public int deleteXinhuFininfomByIds(Long[] ids);

    /**
     * 删除费用报销信息
     * 
     * @param id 费用报销主键
     * @return 结果
     */
    public int deleteXinhuFininfomById(Long id);
}
