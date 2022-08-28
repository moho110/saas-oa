package com.vrmlstudio.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.finance.mapper.XinhuCarmreseMapper;
import com.vrmlstudio.finance.domain.XinhuCarmrese;
import com.vrmlstudio.finance.service.IXinhuCarmreseService;

/**
 * 车辆预定Service业务层处理
 * 
 * @author VRer
 * @date 2022-02-20
 */
@Service
public class XinhuCarmreseServiceImpl implements IXinhuCarmreseService 
{
    @Autowired
    private XinhuCarmreseMapper xinhuCarmreseMapper;

    /**
     * 查询车辆预定
     * 
     * @param id 车辆预定主键
     * @return 车辆预定
     */
    @Override
    public XinhuCarmrese selectXinhuCarmreseById(Long id)
    {
        return xinhuCarmreseMapper.selectXinhuCarmreseById(id);
    }

    /**
     * 查询车辆预定列表
     * 
     * @param xinhuCarmrese 车辆预定
     * @return 车辆预定
     */
    @Override
    public List<XinhuCarmrese> selectXinhuCarmreseList(XinhuCarmrese xinhuCarmrese)
    {
        return xinhuCarmreseMapper.selectXinhuCarmreseList(xinhuCarmrese);
    }

    /**
     * 新增车辆预定
     * 
     * @param xinhuCarmrese 车辆预定
     * @return 结果
     */
    @Override
    public int insertXinhuCarmrese(XinhuCarmrese xinhuCarmrese)
    {
        return xinhuCarmreseMapper.insertXinhuCarmrese(xinhuCarmrese);
    }

    /**
     * 修改车辆预定
     * 
     * @param xinhuCarmrese 车辆预定
     * @return 结果
     */
    @Override
    public int updateXinhuCarmrese(XinhuCarmrese xinhuCarmrese)
    {
        return xinhuCarmreseMapper.updateXinhuCarmrese(xinhuCarmrese);
    }

    /**
     * 批量删除车辆预定
     * 
     * @param ids 需要删除的车辆预定主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCarmreseByIds(Long[] ids)
    {
        return xinhuCarmreseMapper.deleteXinhuCarmreseByIds(ids);
    }

    /**
     * 删除车辆预定信息
     * 
     * @param id 车辆预定主键
     * @return 结果
     */
    @Override
    public int deleteXinhuCarmreseById(Long id)
    {
        return xinhuCarmreseMapper.deleteXinhuCarmreseById(id);
    }
}
