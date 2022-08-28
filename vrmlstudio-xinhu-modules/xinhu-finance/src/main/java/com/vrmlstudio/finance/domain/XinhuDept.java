package com.vrmlstudio.finance.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.TreeEntity;

/**
 * 组织结构部门对象 xinhu_dept
 * 
 * @author VRer
 * @date 2022-02-20
 */
public class XinhuDept extends TreeEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 编号 */
    @Excel(name = "编号")
    private String num;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long pid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long sort;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 负责人 */
    @Excel(name = "负责人")
    private String headman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String headid;

    /** 对应单位id */
    @Excel(name = "对应单位id")
    private Integer companyid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setNum(String num) 
    {
        this.num = num;
    }

    public String getNum() 
    {
        return num;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPid(Long pid) 
    {
        this.pid = pid;
    }

    public Long getPid() 
    {
        return pid;
    }
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setHeadman(String headman) 
    {
        this.headman = headman;
    }

    public String getHeadman() 
    {
        return headman;
    }
    public void setHeadid(String headid) 
    {
        this.headid = headid;
    }

    public String getHeadid() 
    {
        return headid;
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
            .append("num", getNum())
            .append("name", getName())
            .append("pid", getPid())
            .append("sort", getSort())
            .append("optdt", getOptdt())
            .append("headman", getHeadman())
            .append("headid", getHeadid())
            .append("companyid", getCompanyid())
            .toString();
    }
}
