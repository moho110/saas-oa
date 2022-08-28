package com.vrmlstudio.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.finance.mapper.XinhuDemoMapper;
import com.vrmlstudio.finance.domain.XinhuDemo;
import com.vrmlstudio.finance.service.IXinhuDemoService;

/**
 * 演示测试模块Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuDemoServiceImpl implements IXinhuDemoService 
{
    @Autowired
    private XinhuDemoMapper xinhuDemoMapper;

    /**
     * 查询演示测试模块
     * 
     * @param id 演示测试模块主键
     * @return 演示测试模块
     */
    @Override
    public XinhuDemo selectXinhuDemoById(Long id)
    {
        return xinhuDemoMapper.selectXinhuDemoById(id);
    }

    /**
     * 查询演示测试模块列表
     * 
     * @param xinhuDemo 演示测试模块
     * @return 演示测试模块
     */
    @Override
    public List<XinhuDemo> selectXinhuDemoList(XinhuDemo xinhuDemo)
    {
        return xinhuDemoMapper.selectXinhuDemoList(xinhuDemo);
    }

    /**
     * 新增演示测试模块
     * 
     * @param xinhuDemo 演示测试模块
     * @return 结果
     */
    @Override
    public int insertXinhuDemo(XinhuDemo xinhuDemo)
    {
        return xinhuDemoMapper.insertXinhuDemo(xinhuDemo);
    }

    /**
     * 修改演示测试模块
     * 
     * @param xinhuDemo 演示测试模块
     * @return 结果
     */
    @Override
    public int updateXinhuDemo(XinhuDemo xinhuDemo)
    {
        return xinhuDemoMapper.updateXinhuDemo(xinhuDemo);
    }

    /**
     * 批量删除演示测试模块
     * 
     * @param ids 需要删除的演示测试模块主键
     * @return 结果
     */
    @Override
    public int deleteXinhuDemoByIds(Long[] ids)
    {
        return xinhuDemoMapper.deleteXinhuDemoByIds(ids);
    }

    /**
     * 删除演示测试模块信息
     * 
     * @param id 演示测试模块主键
     * @return 结果
     */
    @Override
    public int deleteXinhuDemoById(Long id)
    {
        return xinhuDemoMapper.deleteXinhuDemoById(id);
    }
}
