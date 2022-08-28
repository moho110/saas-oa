package com.vrmlstudio.xsystem.mapper;

import java.util.List;
import com.vrmlstudio.xsystem.domain.XinhuOption;

/**
 * 系统选项Mapper接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface XinhuOptionMapper 
{
    /**
     * 查询系统选项
     * 
     * @param id 系统选项主键
     * @return 系统选项
     */
    public XinhuOption selectXinhuOptionById(Long id);

    /**
     * 查询系统选项列表
     * 
     * @param xinhuOption 系统选项
     * @return 系统选项集合
     */
    public List<XinhuOption> selectXinhuOptionList(XinhuOption xinhuOption);

    /**
     * 新增系统选项
     * 
     * @param xinhuOption 系统选项
     * @return 结果
     */
    public int insertXinhuOption(XinhuOption xinhuOption);

    /**
     * 修改系统选项
     * 
     * @param xinhuOption 系统选项
     * @return 结果
     */
    public int updateXinhuOption(XinhuOption xinhuOption);

    /**
     * 删除系统选项
     * 
     * @param id 系统选项主键
     * @return 结果
     */
    public int deleteXinhuOptionById(Long id);

    /**
     * 批量删除系统选项
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuOptionByIds(Long[] ids);
}
