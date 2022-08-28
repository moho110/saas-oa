package com.vrmlstudio.xsystem.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 系统组对象 xinhu_group
 * 
 * @author VRer
 * @date 2022-02-20
 */
public class XinhuGroup extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 组名 */
    @Excel(name = "组名")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long sort;

    /** 是否权限验证 */
    @Excel(name = "是否权限验证")
    private Integer ispir;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date indate;

    /** 所属单位Id */
    @Excel(name = "所属单位Id")
    private Integer companyid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
    }
    public void setIspir(Integer ispir) 
    {
        this.ispir = ispir;
    }

    public Integer getIspir() 
    {
        return ispir;
    }
    public void setIndate(Date indate) 
    {
        this.indate = indate;
    }

    public Date getIndate() 
    {
        return indate;
    }
    public void setCompanyid(Integer companyid) 
    {
        this.companyid = companyid;
    }

    public Integer getCompanyid() 
    {
        return companyid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("sort", getSort())
            .append("ispir", getIspir())
            .append("indate", getIndate())
            .append("companyid", getCompanyid())
            .toString();
    }
}
