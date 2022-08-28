package com.vrmlstudio.police.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 工程通知对象 xinhu_gctodo
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuGctodo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long uid;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long optid;

    /** 操作人 */
    @Excel(name = "操作人")
    private String optname;

    /** 申请日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applydt;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 是否提交 */
    @Excel(name = "是否提交")
    private Integer isturn;

    /** 对应单位id */
    @Excel(name = "对应单位id")
    private Integer comid;

    /** 类型 */
    @Excel(name = "类型")
    private Integer djtype;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date djdt;

    /** 对应项目 */
    @Excel(name = "对应项目")
    private Long pgcid;

    /** 工程名称 */
    @Excel(name = "工程名称")
    private String pgcname;

    /** 巡检员 */
    @Excel(name = "巡检员")
    private String selren;

    /** 巡检员的ID */
    @Excel(name = "巡检员的ID")
    private String selrenid;

    /** 巡检地方 */
    @Excel(name = "巡检地方")
    private String weizhi;

    /** 检查情况 */
    @Excel(name = "检查情况")
    private String qingkuan;

    /** 预防措施 */
    @Excel(name = "预防措施")
    private String cuoshi;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
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
    public void setApplydt(Date applydt) 
    {
        this.applydt = applydt;
    }

    public Date getApplydt() 
    {
        return applydt;
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
    public void setIsturn(Integer isturn) 
    {
        this.isturn = isturn;
    }

    public Integer getIsturn() 
    {
        return isturn;
    }
    public void setComid(Integer comid) 
    {
        this.comid = comid;
    }

    public Integer getComid() 
    {
        return comid;
    }
    public void setDjtype(Integer djtype) 
    {
        this.djtype = djtype;
    }

    public Integer getDjtype() 
    {
        return djtype;
    }
    public void setDjdt(Date djdt) 
    {
        this.djdt = djdt;
    }

    public Date getDjdt() 
    {
        return djdt;
    }
    public void setPgcid(Long pgcid) 
    {
        this.pgcid = pgcid;
    }

    public Long getPgcid() 
    {
        return pgcid;
    }
    public void setPgcname(String pgcname) 
    {
        this.pgcname = pgcname;
    }

    public String getPgcname() 
    {
        return pgcname;
    }
    public void setSelren(String selren) 
    {
        this.selren = selren;
    }

    public String getSelren() 
    {
        return selren;
    }
    public void setSelrenid(String selrenid) 
    {
        this.selrenid = selrenid;
    }

    public String getSelrenid() 
    {
        return selrenid;
    }
    public void setWeizhi(String weizhi) 
    {
        this.weizhi = weizhi;
    }

    public String getWeizhi() 
    {
        return weizhi;
    }
    public void setQingkuan(String qingkuan) 
    {
        this.qingkuan = qingkuan;
    }

    public String getQingkuan() 
    {
        return qingkuan;
    }
    public void setCuoshi(String cuoshi) 
    {
        this.cuoshi = cuoshi;
    }

    public String getCuoshi() 
    {
        return cuoshi;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("uid", getUid())
            .append("optdt", getOptdt())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("applydt", getApplydt())
            .append("content", getContent())
            .append("status", getStatus())
            .append("isturn", getIsturn())
            .append("comid", getComid())
            .append("djtype", getDjtype())
            .append("djdt", getDjdt())
            .append("pgcid", getPgcid())
            .append("pgcname", getPgcname())
            .append("selren", getSelren())
            .append("selrenid", getSelrenid())
            .append("weizhi", getWeizhi())
            .append("qingkuan", getQingkuan())
            .append("cuoshi", getCuoshi())
            .toString();
    }
}
