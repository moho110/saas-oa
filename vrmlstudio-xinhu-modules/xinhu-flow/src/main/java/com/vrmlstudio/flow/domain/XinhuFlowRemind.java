package com.vrmlstudio.flow.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 单据提醒设置对象 xinhu_flow_remind
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuFlowRemind extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startdt;

    /** 截止时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "截止时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date enddt;

    /** 用户Id */
    @Excel(name = "用户Id")
    private Integer uid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 操作人 */
    @Excel(name = "操作人")
    private String optname;

    /** 对应模块编号 */
    @Excel(name = "对应模块编号")
    private String modenum;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String tables;

    /** 主Id */
    @Excel(name = "主Id")
    private Long mid;

    /** 频率 */
    @Excel(name = "频率")
    private String ratecont;

    /** 提醒内容 */
    @Excel(name = "提醒内容")
    private String content;

    /** 提醒频率o仅一次,d天,w周,m月 */
    @Excel(name = "提醒频率o仅一次,d天,w周,m月")
    private String rate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String rateval;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String receid;

    /** 提醒给 */
    @Excel(name = "提醒给")
    private String recename;

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
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setOptname(String optname) 
    {
        this.optname = optname;
    }

    public String getOptname() 
    {
        return optname;
    }
    public void setModenum(String modenum) 
    {
        this.modenum = modenum;
    }

    public String getModenum() 
    {
        return modenum;
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
    public void setRatecont(String ratecont) 
    {
        this.ratecont = ratecont;
    }

    public String getRatecont() 
    {
        return ratecont;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setRate(String rate) 
    {
        this.rate = rate;
    }

    public String getRate() 
    {
        return rate;
    }
    public void setRateval(String rateval) 
    {
        this.rateval = rateval;
    }

    public String getRateval() 
    {
        return rateval;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
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
            .append("startdt", getStartdt())
            .append("enddt", getEnddt())
            .append("uid", getUid())
            .append("optdt", getOptdt())
            .append("optname", getOptname())
            .append("modenum", getModenum())
            .append("tables", getTables())
            .append("mid", getMid())
            .append("ratecont", getRatecont())
            .append("content", getContent())
            .append("rate", getRate())
            .append("rateval", getRateval())
            .append("status", getStatus())
            .append("receid", getReceid())
            .append("recename", getRecename())
            .append("comid", getComid())
            .toString();
    }
}
