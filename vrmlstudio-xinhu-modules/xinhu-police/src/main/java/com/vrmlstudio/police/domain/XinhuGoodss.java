package com.vrmlstudio.police.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 物品库存详细对象 xinhu_goodss
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuGoodss extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 物品Id */
    @Excel(name = "物品Id")
    private Integer aid;

    /** 数量 */
    @Excel(name = "数量")
    private Long count;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer uid;

    /** 0入库,1出库 */
    @Excel(name = "0入库,1出库")
    private Integer types;

    /** 出入库类型 */
    @Excel(name = "出入库类型")
    private Integer kind;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String optname;

    /** 申请日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applydt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long optid;

    /** 对应主表 */
    @Excel(name = "对应主表")
    private Integer mid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer sort;

    /** 单位 */
    @Excel(name = "单位")
    private String unit;

    /** 单价 */
    @Excel(name = "单价")
    private BigDecimal price;

    /** 存放仓库ID */
    @Excel(name = "存放仓库ID")
    private Integer depotid;

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
    public void setUid(Integer uid) 
    {
        this.uid = uid;
    }

    public Integer getUid() 
    {
        return uid;
    }
    public void setTypes(Integer types)
    {
        this.types = types;
    }

    public Integer getTypes()
    {
        return types;
    }
    public void setKind(Integer kind) 
    {
        this.kind = kind;
    }

    public Integer getKind() 
    {
        return kind;
    }
    public void setOptname(String optname) 
    {
        this.optname = optname;
    }

    public String getOptname() 
    {
        return optname;
    }
    public void setApplydt(Date applydt) 
    {
        this.applydt = applydt;
    }

    public Date getApplydt() 
    {
        return applydt;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setOptid(Long optid) 
    {
        this.optid = optid;
    }

    public Long getOptid() 
    {
        return optid;
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
    public void setDepotid(Integer depotid) 
    {
        this.depotid = depotid;
    }

    public Integer getDepotid() 
    {
        return depotid;
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
            .append("aid", getAid())
            .append("count", getCount())
            .append("uid", getUid())
            .append("types", getTypes())
            .append("kind", getKind())
            .append("optname", getOptname())
            .append("applydt", getApplydt())
            .append("optdt", getOptdt())
            .append("content", getContent())
            .append("status", getStatus())
            .append("optid", getOptid())
            .append("mid", getMid())
            .append("sort", getSort())
            .append("unit", getUnit())
            .append("price", getPrice())
            .append("depotid", getDepotid())
            .append("comid", getComid())
            .toString();
    }
}
