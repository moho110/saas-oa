package com.vrmlstudio.police.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 修改记录对象 xinhu_editrecord
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuEditrecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 字段名称 */
    @Excel(name = "字段名称")
    private String fieldsname;

    /** 原来值 */
    @Excel(name = "原来值")
    private String oldval;

    /** 新值 */
    @Excel(name = "新值")
    private String newval;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String tables;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long mid;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** 操作人Id */
    @Excel(name = "操作人Id")
    private Integer optid;

    /** 操作人 */
    @Excel(name = "操作人")
    private String optname;

    /** 第几次修改记录 */
    @Excel(name = "第几次修改记录")
    private Integer editci;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setFieldsname(String fieldsname) 
    {
        this.fieldsname = fieldsname;
    }

    public String getFieldsname() 
    {
        return fieldsname;
    }
    public void setOldval(String oldval) 
    {
        this.oldval = oldval;
    }

    public String getOldval() 
    {
        return oldval;
    }
    public void setNewval(String newval) 
    {
        this.newval = newval;
    }

    public String getNewval() 
    {
        return newval;
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
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setOptid(Integer optid) 
    {
        this.optid = optid;
    }

    public Integer getOptid() 
    {
        return optid;
    }
    public void setOptname(String optname) 
    {
        this.optname = optname;
    }

    public String getOptname() 
    {
        return optname;
    }
    public void setEditci(Integer editci) 
    {
        this.editci = editci;
    }

    public Integer getEditci() 
    {
        return editci;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("fieldsname", getFieldsname())
            .append("oldval", getOldval())
            .append("newval", getNewval())
            .append("tables", getTables())
            .append("mid", getMid())
            .append("optdt", getOptdt())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("editci", getEditci())
            .toString();
    }
}
