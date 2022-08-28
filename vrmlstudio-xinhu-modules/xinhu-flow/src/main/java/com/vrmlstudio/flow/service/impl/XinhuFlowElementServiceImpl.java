package com.vrmlstudio.flow.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.flow.mapper.XinhuFlowElementMapper;
import com.vrmlstudio.flow.domain.XinhuFlowElement;
import com.vrmlstudio.flow.service.IXinhuFlowElementService;

/**
 * 模块元素Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-18
 */
@Service
public class XinhuFlowElementServiceImpl implements IXinhuFlowElementService 
{
    @Autowired
    private XinhuFlowElementMapper xinhuFlowElementMapper;

    /**
     * 查询模块元素
     * 
     * @param id 模块元素主键
     * @return 模块元素
     */
    @Override
    public XinhuFlowElement selectXinhuFlowElementById(Long id)
    {
        return xinhuFlowElementMapper.selectXinhuFlowElementById(id);
    }

    /**
     * 查询模块元素列表
     * 
     * @param xinhuFlowElement 模块元素
     * @return 模块元素
     */
    @Override
    public List<XinhuFlowElement> selectXinhuFlowElementList(XinhuFlowElement xinhuFlowElement)
    {
        return xinhuFlowElementMapper.selectXinhuFlowElementList(xinhuFlowElement);
    }

    /**
     * 新增模块元素
     * 
     * @param xinhuFlowElement 模块元素
     * @return 结果
     */
    @Override
    public int insertXinhuFlowElement(XinhuFlowElement xinhuFlowElement)
    {
        return xinhuFlowElementMapper.insertXinhuFlowElement(xinhuFlowElement);
    }

    /**
     * 修改模块元素
     * 
     * @param xinhuFlowElement 模块元素
     * @return 结果
     */
    @Override
    public int updateXinhuFlowElement(XinhuFlowElement xinhuFlowElement)
    {
        return xinhuFlowElementMapper.updateXinhuFlowElement(xinhuFlowElement);
    }

    /**
     * 批量删除模块元素
     * 
     * @param ids 需要删除的模块元素主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowElementByIds(Long[] ids)
    {
        return xinhuFlowElementMapper.deleteXinhuFlowElementByIds(ids);
    }

    /**
     * 删除模块元素信息
     * 
     * @param id 模块元素主键
     * @return 结果
     */
    @Override
    public int deleteXinhuFlowElementById(Long id)
    {
        return xinhuFlowElementMapper.deleteXinhuFlowElementById(id);
    }
}
