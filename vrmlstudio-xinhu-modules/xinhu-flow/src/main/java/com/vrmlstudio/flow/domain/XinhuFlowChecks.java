package com.vrmlstudio.flow.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 单据的审核人对象 xinhu_flow_checks
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuFlowChecks extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String tables;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long mid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer modeid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer courseid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String checkid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String checkname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer optid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String optname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 类型1自定义,2撤回添加,3退回添加,4转移添加 */
    @Excel(name = "类型1自定义,2撤回添加,3退回添加,4转移添加")
    private Integer addlx;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
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
    public void setModeid(Integer modeid) 
    {
        this.modeid = modeid;
    }

    public Integer getModeid() 
    {
        return modeid;
    }
    public void setCourseid(Integer courseid) 
    {
        this.courseid = courseid;
    }

    public Integer getCourseid() 
    {
        return courseid;
    }
    public void setCheckid(String checkid) 
    {
        this.checkid = checkid;
    }

    public String getCheckid() 
    {
        return checkid;
    }
    public void setCheckname(String checkname) 
    {
        this.checkname = checkname;
    }

    public String getCheckname() 
    {
        return checkname;
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
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setAddlx(Integer addlx) 
    {
        this.addlx = addlx;
    }

    public Integer getAddlx() 
    {
        return addlx;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("tables", getTables())
            .append("mid", getMid())
            .append("modeid", getModeid())
            .append("courseid", getCourseid())
            .append("checkid", getCheckid())
            .append("checkname", getCheckname())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("optdt", getOptdt())
            .append("status", getStatus())
            .append("addlx", getAddlx())
            .toString();
    }
}
