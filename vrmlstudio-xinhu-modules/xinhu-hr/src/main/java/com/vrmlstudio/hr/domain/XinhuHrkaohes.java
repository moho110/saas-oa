package com.vrmlstudio.hr.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 考核项目的内容对象 xinhu_hrkaohes
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuHrkaohes extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 对应主表hrkaohem.id */
    @Excel(name = "对应主表hrkaohem.id")
    private Integer mid;

    /** 排序号 */
    @Excel(name = "排序号")
    private Integer sort;

    /** 考评项目 */
    @Excel(name = "考评项目")
    private String itemname;

    /** 权重(%) */
    @Excel(name = "权重(%)")
    private BigDecimal weight;

    /** 对应单位id */
    @Excel(name = "对应单位id")
    private Integer comid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMid(Integer mid) 
    {
        this.mid = mid;
    }

    public Integer getMid() 
    {
        return mid;
    }
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
    }
    public void setItemname(String itemname) 
    {
        this.itemname = itemname;
    }

    public String getItemname() 
    {
        return itemname;
    }
    public void setWeight(BigDecimal weight) 
    {
        this.weight = weight;
    }

    public BigDecimal getWeight() 
    {
        return weight;
    }
    public void setComid(Integer comid) 
    {
        this.comid = comid;
    }

    public Integer getComid() 
    {
        return comid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("mid", getMid())
            .append("sort", getSort())
            .append("itemname", getItemname())
            .append("weight", getWeight())
            .append("comid", getComid())
            .toString();
    }
}
