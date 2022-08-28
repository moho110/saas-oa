package com.vrmlstudio.document.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 问卷子对象 xinhu_wenjuat
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuWenjuat extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 对应主表wenjuan.id */
    @Excel(name = "对应主表wenjuan.id")
    private Long mid;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long sort;

    /** 对应单位id */
    @Excel(name = "对应单位id")
    private Integer comid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String itemname;

    /** 项说明 */
    @Excel(name = "项说明")
    private String itemcont;

    /** 项类型 */
    @Excel(name = "项类型")
    private Integer itemtype;

    /** 选项A */
    @Excel(name = "选项A")
    private String itema;

    /** 选项B */
    @Excel(name = "选项B")
    private String itemb;

    /** 选项C */
    @Excel(name = "选项C")
    private String itemc;

    /** 选项D */
    @Excel(name = "选项D")
    private String itemd;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMid(Long mid) 
    {
        this.mid = mid;
    }

    public Long getMid() 
    {
        return mid;
    }
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
    }
    public void setComid(Integer comid) 
    {
        this.comid = comid;
    }

    public Integer getComid() 
    {
        return comid;
    }
    public void setItemname(String itemname) 
    {
        this.itemname = itemname;
    }

    public String getItemname() 
    {
        return itemname;
    }
    public void setItemcont(String itemcont)
    {
        this.itemcont = itemcont;
    }

    public String getItemcont() 
    {
        return itemcont;
    }
    public void setItemtype(Integer itemtype) 
    {
        this.itemtype = itemtype;
    }

    public Integer getItemtype() 
    {
        return itemtype;
    }
    public void setItema(String itema)
    {
        this.itema = itema;
    }

    public String getItema() 
    {
        return itema;
    }
    public void setItemb(String itemb) 
    {
        this.itemb = itemb;
    }

    public String getItemb() 
    {
        return itemb;
    }
    public void setItemc(String itemc) 
    {
        this.itemc = itemc;
    }

    public String getItemc() 
    {
        return itemc;
    }
    public void setItemd(String itemd) 
    {
        this.itemd = itemd;
    }

    public String getItemd() 
    {
        return itemd;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("mid", getMid())
            .append("sort", getSort())
            .append("comid", getComid())
            .append("itemname", getItemname())
            .append("itemcont", getItemcont())
            .append("itemtype", getItemtype())
            .append("itema", getItema())
            .append("itemb", getItemb())
            .append("itemc", getItemc())
            .append("itemd", getItemd())
            .toString();
    }
}
