package com.vrmlstudio.person.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 用户合同对象 xinhu_userract
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuUserract extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** 开始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startdt;

    /** 截止日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "截止日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date enddt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer uid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer sort;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** 合同类型 */
    @Excel(name = "合同类型")
    private String httype;

    /** 0|待执行,1|生效中,2|已终止,3|已过期 */
    @Excel(name = "0|待执行,1|生效中,2|已终止,3|已过期")
    private Integer state;

    /** 提前终止 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "提前终止", width = 30, dateFormat = "yyyy-MM-dd")
    private Date tqenddt;

    /** 签署公司 */
    @Excel(name = "签署公司")
    private String company;

    /** 签署人 */
    @Excel(name = "签署人")
    private String uname;

    /** 签署公司Id */
    @Excel(name = "签署公司Id")
    private Integer companyid;

    /** 合同文件 */
    @Excel(name = "合同文件")
    private Long htfid;

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
    public void setStartdt(Date startdt) 
    {
        this.startdt = startdt;
    }

    public Date getStartdt() 
    {
        return startdt;
    }
    public void setEnddt(Date enddt) 
    {
        this.enddt = enddt;
    }

    public Date getEnddt() 
    {
        return enddt;
    }
    public void setUid(Integer uid) 
    {
        this.uid = uid;
    }

    public Integer getUid() 
    {
        return uid;
    }
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
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
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setHttype(String httype) 
    {
        this.httype = httype;
    }

    public String getHttype() 
    {
        return httype;
    }
    public void setState(Integer state) 
    {
        this.state = state;
    }

    public Integer getState() 
    {
        return state;
    }
    public void setTqenddt(Date tqenddt) 
    {
        this.tqenddt = tqenddt;
    }

    public Date getTqenddt() 
    {
        return tqenddt;
    }
    public void setCompany(String company) 
    {
        this.company = company;
    }

    public String getCompany() 
    {
        return company;
    }
    public void setUname(String uname) 
    {
        this.uname = uname;
    }

    public String getUname() 
    {
        return uname;
    }
    public void setCompanyid(Integer companyid) 
    {
        this.companyid = companyid;
    }

    public Integer getCompanyid() 
    {
        return companyid;
    }
    public void setHtfid(Long htfid) 
    {
        this.htfid = htfid;
    }

    public Long getHtfid() 
    {
        return htfid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("startdt", getStartdt())
            .append("enddt", getEnddt())
            .append("uid", getUid())
            .append("sort", getSort())
            .append("optdt", getOptdt())
            .append("content", getContent())
            .append("httype", getHttype())
            .append("state", getState())
            .append("tqenddt", getTqenddt())
            .append("company", getCompany())
            .append("uname", getUname())
            .append("companyid", getCompanyid())
            .append("htfid", getHtfid())
            .toString();
    }
}
