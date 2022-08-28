package com.vrmlstudio.finance.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 跟进计划对象 xinhu_custplan
 * 
 * @author VRer
 * @date 2022-02-20
 */
public class XinhuCustplan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 对应单位id */
    @Excel(name = "对应单位id")
    private Integer comid;

    /** 客户Id */
    @Excel(name = "客户Id")
    private Long custid;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String custname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long optid;

    /** 跟进人 */
    @Excel(name = "跟进人")
    private String optname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 计划时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "计划时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date plandt;

    /** 状态0计划,1完成,5取消 */
    @Excel(name = "状态0计划,1完成,5取消")
    private Integer status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** 跟进方式 */
    @Excel(name = "跟进方式")
    private String gentype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long uid;

    /** 完成时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "完成时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date findt;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setComid(Integer comid) 
    {
        this.comid = comid;
    }

    public Integer getComid() 
    {
        return comid;
    }
    public void setCustid(Long custid) 
    {
        this.custid = custid;
    }

    public Long getCustid() 
    {
        return custid;
    }
    public void setCustname(String custname) 
    {
        this.custname = custname;
    }

    public String getCustname() 
    {
        return custname;
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
    public void setPlandt(Date plandt) 
    {
        this.plandt = plandt;
    }

    public Date getPlandt() 
    {
        return plandt;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setGentype(String gentype) 
    {
        this.gentype = gentype;
    }

    public String getGentype() 
    {
        return gentype;
    }
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setFindt(Date findt) 
    {
        this.findt = findt;
    }

    public Date getFindt() 
    {
        return findt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("comid", getComid())
            .append("custid", getCustid())
            .append("custname", getCustname())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("optdt", getOptdt())
            .append("plandt", getPlandt())
            .append("status", getStatus())
            .append("content", getContent())
            .append("gentype", getGentype())
            .append("uid", getUid())
            .append("findt", getFindt())
            .toString();
    }
}
