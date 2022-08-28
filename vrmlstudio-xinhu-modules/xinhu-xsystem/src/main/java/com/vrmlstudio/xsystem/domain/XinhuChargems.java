package com.vrmlstudio.xsystem.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 系统升级对象 xinhu_chargems
 * 
 * @author VRer
 * @date 2022-02-20
 */
public class XinhuChargems extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer types;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer mid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date updatedt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String keyword;

    /** 对应安装模块Id */
    @Excel(name = "对应安装模块Id")
    private Integer modeid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTypes(Integer types)
    {
        this.types = types;
    }

    public Integer getTypes()
    {
        return types;
    }
    public void setMid(Integer mid) 
    {
        this.mid = mid;
    }

    public Integer getMid() 
    {
        return mid;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setUpdatedt(Date updatedt) 
    {
        this.updatedt = updatedt;
    }

    public Date getUpdatedt() 
    {
        return updatedt;
    }
    public void setKeyword(String keyword)
    {
        this.keyword = keyword;
    }

    public String getKeyword()
    {
        return keyword;
    }
    public void setModeid(Integer modeid) 
    {
        this.modeid = modeid;
    }

    public Integer getModeid() 
    {
        return modeid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("types", getTypes())
            .append("mid", getMid())
            .append("optdt", getOptdt())
            .append("updatedt", getUpdatedt())
            .append("keyword", getKeyword())
            .append("modeid", getModeid())
            .toString();
    }
}
