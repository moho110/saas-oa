package com.vrmlstudio.finance.service;

import java.util.List;
import com.vrmlstudio.finance.domain.XinhuDemo;

/**
 * 演示测试模块Service接口
 * 
 * @author VRer
 * @date 2022-02-20
 */
public interface IXinhuDemoService 
{
    /**
     * 查询演示测试模块
     * 
     * @param id 演示测试模块主键
     * @return 演示测试模块
     */
    public XinhuDemo selectXinhuDemoById(Long id);

    /**
     * 查询演示测试模块列表
     * 
     * @param xinhuDemo 演示测试模块
     * @return 演示测试模块集合
     */
    public List<XinhuDemo> selectXinhuDemoList(XinhuDemo xinhuDemo);

    /**
     * 新增演示测试模块
     * 
     * @param xinhuDemo 演示测试模块
     * @return 结果
     */
    public int insertXinhuDemo(XinhuDemo xinhuDemo);

    /**
     * 修改演示测试模块
     * 
     * @param xinhuDemo 演示测试模块
     * @return 结果
     */
    public int updateXinhuDemo(XinhuDemo xinhuDemo);

    /**
     * 批量删除演示测试模块
     * 
     * @param ids 需要删除的演示测试模块主键集合
     * @return 结果
     */
    public int deleteXinhuDemoByIds(Long[] ids);

    /**
     * 删除演示测试模块信息
     * 
     * @param id 演示测试模块主键
     * @return 结果
     */
    public int deleteXinhuDemoById(Long id);
}
