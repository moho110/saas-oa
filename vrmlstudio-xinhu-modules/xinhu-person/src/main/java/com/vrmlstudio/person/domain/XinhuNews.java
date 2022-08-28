package com.vrmlstudio.person.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 新闻资讯对象 xinhu_news
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuNews extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String title;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String typename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String url;

    /** 接收人Id */
    @Excel(name = "接收人Id")
    private String receid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String recename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long optid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String optname;

    /** 截止时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "截止时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date enddt;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startdt;

    /** 发布者 */
    @Excel(name = "发布者")
    private String zuozhe;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date indate;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 封面图片 */
    @Excel(name = "封面图片")
    private String fengmian;

    /** 至少投票 */
    @Excel(name = "至少投票")
    private Integer mintou;

    /** 最多投投票0不限制 */
    @Excel(name = "最多投投票0不限制")
    private Integer maxtou;

    /** 是否发短信 */
    @Excel(name = "是否发短信")
    private Integer issms;

    /** 排序号越大越靠前 */
    @Excel(name = "排序号越大越靠前")
    private Integer istop;

    /** 对应单位id */
    @Excel(name = "对应单位id")
    private Integer comid;

    /** app首页显示 */
    @Excel(name = "app首页显示")
    private Integer appxs;

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
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setTypename(String typename) 
    {
        this.typename = typename;
    }

    public String getTypename() 
    {
        return typename;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
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
    public void setEnddt(Date enddt) 
    {
        this.enddt = enddt;
    }

    public Date getEnddt() 
    {
        return enddt;
    }
    public void setStartdt(Date startdt) 
    {
        this.startdt = startdt;
    }

    public Date getStartdt() 
    {
        return startdt;
    }
    public void setZuozhe(String zuozhe) 
    {
        this.zuozhe = zuozhe;
    }

    public String getZuozhe() 
    {
        return zuozhe;
    }
    public void setIndate(Date indate) 
    {
        this.indate = indate;
    }

    public Date getIndate() 
    {
        return indate;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setFengmian(String fengmian) 
    {
        this.fengmian = fengmian;
    }

    public String getFengmian() 
    {
        return fengmian;
    }
    public void setMintou(Integer mintou) 
    {
        this.mintou = mintou;
    }

    public Integer getMintou() 
    {
        return mintou;
    }
    public void setMaxtou(Integer maxtou) 
    {
        this.maxtou = maxtou;
    }

    public Integer getMaxtou() 
    {
        return maxtou;
    }
    public void setIssms(Integer issms) 
    {
        this.issms = issms;
    }

    public Integer getIssms() 
    {
        return issms;
    }
    public void setIstop(Integer istop) 
    {
        this.istop = istop;
    }

    public Integer getIstop() 
    {
        return istop;
    }
    public void setComid(Integer comid) 
    {
        this.comid = comid;
    }

    public Integer getComid() 
    {
        return comid;
    }
    public void setAppxs(Integer appxs) 
    {
        this.appxs = appxs;
    }

    public Integer getAppxs() 
    {
        return appxs;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("optdt", getOptdt())
            .append("typename", getTypename())
            .append("content", getContent())
            .append("url", getUrl())
            .append("receid", getReceid())
            .append("recename", getRecename())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("enddt", getEnddt())
            .append("startdt", getStartdt())
            .append("zuozhe", getZuozhe())
            .append("indate", getIndate())
            .append("status", getStatus())
            .append("fengmian", getFengmian())
            .append("mintou", getMintou())
            .append("maxtou", getMaxtou())
            .append("issms", getIssms())
            .append("istop", getIstop())
            .append("comid", getComid())
            .append("appxs", getAppxs())
            .toString();
    }
}
