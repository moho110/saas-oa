package com.vrmlstudio.hr.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 薪资模版对象 xinhu_hrsalarm
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuHrsalarm extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 模版名称 */
    @Excel(name = "模版名称")
    private String title;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String receid;

    /** 适用对象 */
    @Excel(name = "适用对象")
    private String recename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long optid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String optname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 模版类型 */
    @Excel(name = "模版类型")
    private String atype;

    /** 开始月份 */
    @Excel(name = "开始月份")
    private String startdt;

    /** 截止月份 */
    @Excel(name = "截止月份")
    private String enddt;

    /** 排序号 */
    @Excel(name = "排序号")
    private Integer sort;

    /** 是否启用 */
    @Excel(name = "是否启用")
    private Integer status;

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
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setReceid(String receid) 
    {
        this.receid = receid;
    }

    public String getReceid() 
    {
        return receid;
    }
    public void setRecename(String recename) 
    {
        this.recename = recename;
    }

    public String getRecename() 
    {
        return recename;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setOptid(Long optid) 
    {
        this.optid = optid;
    }

    public Long getOptid() 
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
    public void setAtype(String atype) 
    {
        this.atype = atype;
    }

    public String getAtype() 
    {
        return atype;
    }
    public void setStartdt(String startdt) 
    {
        this.startdt = startdt;
    }

    public String getStartdt() 
    {
        return startdt;
    }
    public void setEnddt(String enddt) 
    {
        this.enddt = enddt;
    }

    public String getEnddt() 
    {
        return enddt;
    }
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
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
            .append("title", getTitle())
            .append("receid", getReceid())
            .append("recename", getRecename())
            .append("content", getContent())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("optdt", getOptdt())
            .append("atype", getAtype())
            .append("startdt", getStartdt())
            .append("enddt", getEnddt())
            .append("sort", getSort())
            .append("status", getStatus())
            .append("comid", getComid())
            .toString();
    }
}
