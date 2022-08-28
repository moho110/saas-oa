package com.vrmlstudio.hr.mapper;

import java.util.List;
import com.vrmlstudio.hr.domain.XinhuKnowtrais;

/**
 * 考试培训子Mapper接口
 * 
 * @author VRer
 * @date 2022-02-19
 */
public interface XinhuKnowtraisMapper 
{
    /**
     * 查询考试培训子
     * 
     * @param id 考试培训子主键
     * @return 考试培训子
     */
    public XinhuKnowtrais selectXinhuKnowtraisById(Long id);

    /**
     * 查询考试培训子列表
     * 
     * @param xinhuKnowtrais 考试培训子
     * @return 考试培训子集合
     */
    public List<XinhuKnowtrais> selectXinhuKnowtraisList(XinhuKnowtrais xinhuKnowtrais);

    /**
     * 新增考试培训子
     * 
     * @param xinhuKnowtrais 考试培训子
     * @return 结果
     */
    public int insertXinhuKnowtrais(XinhuKnowtrais xinhuKnowtrais);

    /**
     * 修改考试培训子
     * 
     * @param xinhuKnowtrais 考试培训子
     * @return 结果
     */
    public int updateXinhuKnowtrais(XinhuKnowtrais xinhuKnowtrais);

    /**
     * 删除考试培训子
     * 
     * @param id 考试培训子主键
     * @return 结果
     */
    public int deleteXinhuKnowtraisById(Long id);

    /**
     * 批量删除考试培训子
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXinhuKnowtraisByIds(Long[] ids);
}
