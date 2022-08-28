package com.vrmlstudio.hr.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 考核项目人员对象 xinhu_hrkaohen
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuHrkaohen extends BaseEntity
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

    /** 评分名称 */
    @Excel(name = "评分名称")
    private String pfname;

    /** 评分人类型 */
    @Excel(name = "评分人类型")
    private String pftype;

    /** 评分人 */
    @Excel(name = "评分人")
    private String pfren;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String pfrenid;

    /** 评分权重 */
    @Excel(name = "评分权重")
    private BigDecimal pfweight;

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
    public void setPfname(String pfname) 
    {
        this.pfname = pfname;
    }

    public String getPfname() 
    {
        return pfname;
    }
    public void setPftype(String pftype) 
    {
        this.pftype = pftype;
    }

    public String getPftype() 
    {
        return pftype;
    }
    public void setPfren(String pfren) 
    {
        this.pfren = pfren;
    }

    public String getPfren() 
    {
        return pfren;
    }
    public void setPfrenid(String pfrenid) 
    {
        this.pfrenid = pfrenid;
    }

    public String getPfrenid() 
    {
        return pfrenid;
    }
    public void setPfweight(BigDecimal pfweight) 
    {
        this.pfweight = pfweight;
    }

    public BigDecimal getPfweight() 
    {
        return pfweight;
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
            .append("pfname", getPfname())
            .append("pftype", getPftype())
            .append("pfren", getPfren())
            .append("pfrenid", getPfrenid())
            .append("pfweight", getPfweight())
            .append("comid", getComid())
            .toString();
    }
}
