package com.vrmlstudio.flow.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 模块权限对象 xinhu_flow_extent
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuFlowExtent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String recename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String receid;

    /** 模块 */
    @Excel(name = "模块")
    private Integer modeid;

    /** 0查看,1添加,2编辑,3删除 */
    @Excel(name = "0查看,1添加,2编辑,3删除")
    private Integer types;

    /** 条件 */
    @Excel(name = "条件")
    private String wherestr;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status;

    /** 条件Id */
    @Excel(name = "条件Id")
    private Integer whereid;

    /** 相关字段 */
    @Excel(name = "相关字段")
    private String fieldstr;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setRecename(String recename) 
    {
        this.recename = recename;
    }

    public String getRecename() 
    {
        return recename;
    }
    public void setReceid(String receid) 
    {
        this.receid = receid;
    }

    public String getReceid() 
    {
        return receid;
    }
    public void setModeid(Integer modeid) 
    {
        this.modeid = modeid;
    }

    public Integer getModeid() 
    {
        return modeid;
    }
    public void setTypes(Integer type)
    {
        this.types = types;
    }

    public Integer getTypes()
    {
        return types;
    }
    public void setWherestr(String wherestr) 
    {
        this.wherestr = wherestr;
    }

    public String getWherestr() 
    {
        return wherestr;
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
    public void setWhereid(Integer whereid) 
    {
        this.whereid = whereid;
    }

    public Integer getWhereid() 
    {
        return whereid;
    }
    public void setFieldstr(String fieldstr) 
    {
        this.fieldstr = fieldstr;
    }

    public String getFieldstr() 
    {
        return fieldstr;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("recename", getRecename())
            .append("receid", getReceid())
            .append("modeid", getModeid())
            .append("type", getTypes())
            .append("wherestr", getWherestr())
            .append("content", getContent())
            .append("status", getStatus())
            .append("whereid", getWhereid())
            .append("fieldstr", getFieldstr())
            .toString();
    }
}
