package com.vrmlstudio.hr.service;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuHrshebao;

/**
 * 社保公积金Service接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface IXinhuHrshebaoService 
{
    /**
     * 查询社保公积金
     * 
     * @param id 社保公积金主键
     * @return 社保公积金
     */
    public XinhuHrshebao selectXinhuHrshebaoById(Long id);

    /**
     * 查询社保公积金列表
     * 
     * @param xinhuHrshebao 社保公积金
     * @return 社保公积金集合
     */
    public List<XinhuHrshebao> selectXinhuHrshebaoList(XinhuHrshebao xinhuHrshebao);

    /**
     * 新增社保公积金
     * 
     * @param xinhuHrshebao 社保公积金
     * @return 结果
     */
    public int insertXinhuHrshebao(XinhuHrshebao xinhuHrshebao);

    /**
     * 修改社保公积金
     * 
     * @param xinhuHrshebao 社保公积金
     * @return 结果
     */
    public int updateXinhuHrshebao(XinhuHrshebao xinhuHrshebao);

    /**
     * 批量删除社保公积金
     * 
     * @param ids 需要删除的社保公积金主键集合
     * @return 结果
     */
    public int deleteXinhuHrshebaoByIds(Long[] ids);

    /**
     * 删除社保公积金信息
     * 
     * @param id 社保公积金主键
     * @return 结果
     */
    public int deleteXinhuHrshebaoById(Long id);
}
