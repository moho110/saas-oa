package com.vrmlstudio.flow.mapper;

import java.util.List;
import com.vrmlstudio.flow.domain.XinhuFlowElement;

/**
 * 模块元素Mapper接口
 * 
 * @author VRer
 * @date 2022-02-18
 */
public interface XinhuFlowElementMapper 
{
    /**
     * 查询模块元素
     * 
     * @param id 模块元素主键
     * @return 模块元素
     */
    public XinhuFlowElement selectXinhuFlowElementById(Long id);

    /**
     * 查询模块元素列表
     * 
     * @param xinhuFlowElement 模块元素
     * @return 模块元素集合
     */
    public List<XinhuFlowElement> selectXinhuFlowElementList(XinhuFlowElement xinhuFlowElement);

    /**
     * 新增模块元素
     * 
     * @param xinhuFlowElement 模块元素
     * @return 结果
     */
    public int insertXinhuFlowElement(XinhuFlowElement xinhuFlowElement);

    /**
     * 修改模块元素
     * 
     * @param xinhuFlowElement 模块元素
     * @return 结果
     */
    public int updateXinhuFlowElement(XinhuFlowElement xinhuFlowElement);

    /**
     * 删除模块元素
     * 
     * @param id 模块元素主键
     * @return 结果
     */
    public int deleteXinhuFlowElementById(Long id);

    /**
     * 批量删除模块元素
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuFlowElementByIds(Long[] ids);
}
