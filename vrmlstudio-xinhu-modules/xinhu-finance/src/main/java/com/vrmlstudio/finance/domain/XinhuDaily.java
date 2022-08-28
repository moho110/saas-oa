package com.vrmlstudio.finance.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 日报对象 xinhu_daily
 * 
 * @author VRer
 * @date 2022-02-20
 */
public class XinhuDaily extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dt;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 新增时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "新增时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date adddt;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long uid;

    /** 姓名 */
    @Excel(name = "姓名")
    private String optname;

    /** 类型@0|日报,1|周报,2|月报,3|年报 */
    @Excel(name = "类型@0|日报,1|周报,2|月报,3|年报")
    private Integer types;

    /** 明日计划 */
    @Excel(name = "明日计划")
    private String plan;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date enddt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long optid;

    /** 得分 */
    @Excel(name = "得分")
    private Integer mark;

    /** 对应单位id */
    @Excel(name = "对应单位id")
    private Integer comid;

    /** 对应多模版flow_modetpl.id */
    @Excel(name = "对应多模版flow_modetpl.id")
    private Long mtplid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDt(Date dt) 
    {
        this.dt = dt;
    }

    public Date getDt() 
    {
        return dt;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setAdddt(Date adddt) 
    {
        this.adddt = adddt;
    }

    public Date getAdddt() 
    {
        return adddt;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setOptname(String optname) 
    {
        this.optname = optname;
    }

    public String getOptname() 
    {
        return optname;
    }
    public void setTypes(Integer types)
    {
        this.types = types;
    }

    public Integer getTypes()
    {
        return types;
    }
    public void setPlan(String plan) 
    {
        this.plan = plan;
    }

    public String getPlan() 
    {
        return plan;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setEnddt(Date enddt) 
    {
        this.enddt = enddt;
    }

    public Date getEnddt() 
    {
        return enddt;
    }
    public void setOptid(Long optid) 
    {
        this.optid = optid;
    }

    public Long getOptid() 
    {
        return optid;
    }
    public void setMark(Integer mark) 
    {
        this.mark = mark;
    }

    public Integer getMark() 
    {
        return mark;
    }
    public void setComid(Integer comid) 
    {
        this.comid = comid;
    }

    public Integer getComid() 
    {
        return comid;
    }
    public void setMtplid(Long mtplid) 
    {
        this.mtplid = mtplid;
    }

    public Long getMtplid() 
    {
        return mtplid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("dt", getDt())
            .append("content", getContent())
            .append("adddt", getAdddt())
            .append("optdt", getOptdt())
            .append("uid", getUid())
            .append("optname", getOptname())
            .append("types", getTypes())
            .append("plan", getPlan())
            .append("status", getStatus())
            .append("enddt", getEnddt())
            .append("optid", getOptid())
            .append("mark", getMark())
            .append("comid", getComid())
            .append("mtplid", getMtplid())
            .toString();
    }
}
