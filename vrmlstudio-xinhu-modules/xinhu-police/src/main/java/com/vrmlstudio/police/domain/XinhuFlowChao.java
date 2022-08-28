package com.vrmlstudio.police.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 抄送对象 xinhu_flow_chao
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuFlowChao extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long modeid;

    /** 对应表 */
    @Excel(name = "对应表")
    private String tables;

    /** 对应记录Id */
    @Excel(name = "对应记录Id")
    private Long mid;

    /** 人员Id */
    @Excel(name = "人员Id")
    private Long uid;

    /** 抄送给 */
    @Excel(name = "抄送给")
    private String csname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String csnameid;

    /** 0抄送,1关注 */
    @Excel(name = "0抄送,1关注")
    private Integer types;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setModeid(Long modeid) 
    {
        this.modeid = modeid;
    }

    public Long getModeid() 
    {
        return modeid;
    }
    public void setTables(String tables)
    {
        this.tables = tables;
    }

    public String getTables()
    {
        return tables;
    }
    public void setMid(Long mid) 
    {
        this.mid = mid;
    }

    public Long getMid() 
    {
        return mid;
    }
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setCsname(String csname) 
    {
        this.csname = csname;
    }

    public String getCsname() 
    {
        return csname;
    }
    public void setCsnameid(String csnameid) 
    {
        this.csnameid = csnameid;
    }

    public String getCsnameid() 
    {
        return csnameid;
    }
    public void setTypes(Integer type)
    {
        this.types = types;
    }

    public Integer getTypes()
    {
        return types;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("modeid", getModeid())
            .append("tables", getTables())
            .append("mid", getMid())
            .append("uid", getUid())
            .append("csname", getCsname())
            .append("csnameid", getCsnameid())
            .append("types", getTypes())
            .toString();
    }
}
