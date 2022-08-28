package com.vrmlstudio.hr.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 请假条加班单对象 xinhu_kqinfo
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuKqinfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer uid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String uname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date stime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date etime;

    /** 类型 */
    @Excel(name = "类型")
    private String kind;

    /** 请假类型 */
    @Excel(name = "请假类型")
    private String qjkind;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 时间 */
    @Excel(name = "时间")
    private BigDecimal totals;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 是否提交 */
    @Excel(name = "是否提交")
    private Integer isturn;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String optname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer optid;

    /** 申请日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applydt;

    /** 加班费 */
    @Excel(name = "加班费")
    private BigDecimal jiafee;

    /** 加班方式0换调休,1给加班费 */
    @Excel(name = "加班方式0换调休,1给加班费")
    private Integer jiatype;

    /** 请假天数 */
    @Excel(name = "请假天数")
    private BigDecimal totday;

    /** 截止使用时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "截止使用时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date enddt;

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
    public void setUid(Integer uid) 
    {
        this.uid = uid;
    }

    public Integer getUid() 
    {
        return uid;
    }
    public void setUname(String uname) 
    {
        this.uname = uname;
    }

    public String getUname() 
    {
        return uname;
    }
    public void setStime(Date stime) 
    {
        this.stime = stime;
    }

    public Date getStime() 
    {
        return stime;
    }
    public void setEtime(Date etime) 
    {
        this.etime = etime;
    }

    public Date getEtime() 
    {
        return etime;
    }
    public void setKind(String kind) 
    {
        this.kind = kind;
    }

    public String getKind() 
    {
        return kind;
    }
    public void setQjkind(String qjkind) 
    {
        this.qjkind = qjkind;
    }

    public String getQjkind() 
    {
        return qjkind;
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
    public void setTotals(BigDecimal totals) 
    {
        this.totals = totals;
    }

    public BigDecimal getTotals() 
    {
        return totals;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setIsturn(Integer isturn) 
    {
        this.isturn = isturn;
    }

    public Integer getIsturn() 
    {
        return isturn;
    }
    public void setOptname(String optname) 
    {
        this.optname = optname;
    }

    public String getOptname() 
    {
        return optname;
    }
    public void setOptid(Integer optid) 
    {
        this.optid = optid;
    }

    public Integer getOptid() 
    {
        return optid;
    }
    public void setApplydt(Date applydt) 
    {
        this.applydt = applydt;
    }

    public Date getApplydt() 
    {
        return applydt;
    }
    public void setJiafee(BigDecimal jiafee) 
    {
        this.jiafee = jiafee;
    }

    public BigDecimal getJiafee() 
    {
        return jiafee;
    }
    public void setJiatype(Integer jiatype) 
    {
        this.jiatype = jiatype;
    }

    public Integer getJiatype() 
    {
        return jiatype;
    }
    public void setTotday(BigDecimal totday) 
    {
        this.totday = totday;
    }

    public BigDecimal getTotday() 
    {
        return totday;
    }
    public void setEnddt(Date enddt) 
    {
        this.enddt = enddt;
    }

    public Date getEnddt() 
    {
        return enddt;
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
            .append("uid", getUid())
            .append("uname", getUname())
            .append("stime", getStime())
            .append("etime", getEtime())
            .append("kind", getKind())
            .append("qjkind", getQjkind())
            .append("content", getContent())
            .append("status", getStatus())
            .append("totals", getTotals())
            .append("optdt", getOptdt())
            .append("isturn", getIsturn())
            .append("optname", getOptname())
            .append("optid", getOptid())
            .append("applydt", getApplydt())
            .append("jiafee", getJiafee())
            .append("jiatype", getJiatype())
            .append("totday", getTotday())
            .append("enddt", getEnddt())
            .append("comid", getComid())
            .toString();
    }
}
