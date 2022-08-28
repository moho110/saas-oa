package com.vrmlstudio.resources.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 订阅管理对象 xinhu_subscribe
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuSubscribe extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 订阅标题 */
    @Excel(name = "订阅标题")
    private String title;

    /** 订阅时提醒内容 */
    @Excel(name = "订阅时提醒内容")
    private String cont;

    /** 订阅说明 */
    @Excel(name = "订阅说明")
    private String content;

    /** 操作人ID */
    @Excel(name = "操作人ID")
    private Long optid;

    /** 操作人 */
    @Excel(name = "操作人")
    private String optname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 订阅地址 */
    @Excel(name = "订阅地址")
    private String suburl;

    /** 订阅地址post参数 */
    @Excel(name = "订阅地址post参数")
    private String suburlpost;

    /** 最后运行时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后运行时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String shateid;

    /** 共享给 */
    @Excel(name = "共享给")
    private String shatename;

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
    public void setCont(String cont) 
    {
        this.cont = cont;
    }

    public String getCont() 
    {
        return cont;
    }
    public void setExplain(String content)
    {
        this.content = content;
    }

    public String getExplain() 
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
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setSuburl(String suburl) 
    {
        this.suburl = suburl;
    }

    public String getSuburl() 
    {
        return suburl;
    }
    public void setSuburlpost(String suburlpost) 
    {
        this.suburlpost = suburlpost;
    }

    public String getSuburlpost() 
    {
        return suburlpost;
    }
    public void setLastdt(Date lastdt) 
    {
        this.lastdt = lastdt;
    }

    public Date getLastdt() 
    {
        return lastdt;
    }
    public void setShateid(String shateid) 
    {
        this.shateid = shateid;
    }

    public String getShateid() 
    {
        return shateid;
    }
    public void setShatename(String shatename) 
    {
        this.shatename = shatename;
    }

    public String getShatename() 
    {
        return shatename;
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
            .append("cont", getCont())
            .append("content", getExplain())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("optdt", getOptdt())
            .append("status", getStatus())
            .append("suburl", getSuburl())
            .append("suburlpost", getSuburlpost())
            .append("lastdt", getLastdt())
            .append("shateid", getShateid())
            .append("shatename", getShatename())
            .append("comid", getComid())
            .toString();
    }
}
