package com.vrmlstudio.police.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 物品库存详细对象 xinhu_goodn
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuGoodn extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 对应主表 */
    @Excel(name = "对应主表")
    private Integer mid;

    /** 物品Id */
    @Excel(name = "物品Id")
    private Integer aid;

    /** 数量 */
    @Excel(name = "数量")
    private Long count;

    /** 已出库入库数跟count相等时就全部了 */
    @Excel(name = "已出库入库数跟count相等时就全部了")
    private Long couns;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer sort;

    /** 单位 */
    @Excel(name = "单位")
    private String unit;

    /** 单价 */
    @Excel(name = "单价")
    private BigDecimal price;

    /** 对应单位id */
    @Excel(name = "对应单位id")
    private Integer comid;

    /** 是否需要归还 */
    @Excel(name = "是否需要归还")
    private Integer lygh;

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
    public void setAid(Integer aid) 
    {
        this.aid = aid;
    }

    public Integer getAid() 
    {
        return aid;
    }
    public void setCount(Long count) 
    {
        this.count = count;
    }

    public Long getCount() 
    {
        return count;
    }
    public void setCouns(Long couns) 
    {
        this.couns = couns;
    }

    public Long getCouns() 
    {
        return couns;
    }
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
    }
    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setComid(Integer comid) 
    {
        this.comid = comid;
    }

    public Integer getComid() 
    {
        return comid;
    }
    public void setLygh(Integer lygh) 
    {
        this.lygh = lygh;
    }

    public Integer getLygh() 
    {
        return lygh;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("mid", getMid())
            .append("aid", getAid())
            .append("count", getCount())
            .append("couns", getCouns())
            .append("sort", getSort())
            .append("unit", getUnit())
            .append("price", getPrice())
            .append("comid", getComid())
            .append("lygh", getLygh())
            .toString();
    }
}
