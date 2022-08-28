package com.vrmlstudio.person.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.TreeEntity;

/**
 * 区域表对象 xinhu_areas
 * 
 * @author VRer
 * @date 2022-03-09
 */
public class XinhuAreas extends TreeEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 区域名称 */
    @Excel(name = "区域名称")
    private String areaName;

    /** 是否显示 */
    @Excel(name = "是否显示")
    private Integer isShow;

    /** 区域排序 */
    @Excel(name = "区域排序")
    private Integer areaSort;

    /** 区域关键字 */
    @Excel(name = "区域关键字")
    private String areaKey;

    /** 区域类型 */
    @Excel(name = "区域类型")
    private Integer areaType;

    /** 数据标识 */
    @Excel(name = "数据标识")
    private Integer dataFlag;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setAreaName(String areaName) 
    {
        this.areaName = areaName;
    }

    public String getAreaName() 
    {
        return areaName;
    }
    public void setIsShow(Integer isShow) 
    {
        this.isShow = isShow;
    }

    public Integer getIsShow() 
    {
        return isShow;
    }
    public void setAreaSort(Integer areaSort) 
    {
        this.areaSort = areaSort;
    }

    public Integer getAreaSort() 
    {
        return areaSort;
    }
    public void setAreaKey(String areaKey) 
    {
        this.areaKey = areaKey;
    }

    public String getAreaKey() 
    {
        return areaKey;
    }
    public void setAreaType(Integer areaType) 
    {
        this.areaType = areaType;
    }

    public Integer getAreaType() 
    {
        return areaType;
    }
    public void setDataFlag(Integer dataFlag) 
    {
        this.dataFlag = dataFlag;
    }

    public Integer getDataFlag() 
    {
        return dataFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("parentId", getParentId())
            .append("areaName", getAreaName())
            .append("isShow", getIsShow())
            .append("areaSort", getAreaSort())
            .append("areaKey", getAreaKey())
            .append("areaType", getAreaType())
            .append("dataFlag", getDataFlag())
            .append("createTime", getCreateTime())
            .toString();
    }
}
