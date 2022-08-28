package com.vrmlstudio.person.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 会议对象 xinhu_meet
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuMeet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 会议室名称 */
    @Excel(name = "会议室名称")
    private String hyname;

    /** 主题 */
    @Excel(name = "主题")
    private String title;

    /** 开始时间 */
    @Excel(name = "开始时间")
    private String startdt;

    /** 结束时间 */
    @Excel(name = "结束时间")
    private String enddt;

    /** 会议状态@0|正常,1|会议中,2|结束,3|取消 */
    @Excel(name = "会议状态@0|正常,1|会议中,2|结束,3|取消")
    private Integer state;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status;

    /** 类型@0|普通,1|固定,2|纪要 */
    @Excel(name = "类型@0|普通,1|固定,2|纪要")
    private Integer types;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String joinid;

    /** 参加人员 */
    @Excel(name = "参加人员")
    private String joinname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long mid;

    /** 发起人 */
    @Excel(name = "发起人")
    private String optname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String rate;

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

    /** 说明 */
    @Excel(name = "说明")
    private String contents;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cancelreason;

    /** 会议纪要人id */
    @Excel(name = "会议纪要人id")
    private String jyid;

    /** 会议纪要人 */
    @Excel(name = "会议纪要人")
    private String jyname;

    /** 会议纪要内容 */
    @Excel(name = "会议纪要内容")
    private String content;

    /** 是否短信通知 */
    @Excel(name = "是否短信通知")
    private Integer issms;

    /** 对应单位id */
    @Excel(name = "对应单位id")
    private Integer comid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String zcrenid;

    /** 主持人 */
    @Excel(name = "主持人")
    private String zcren;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setHyname(String hyname) 
    {
        this.hyname = hyname;
    }

    public String getHyname() 
    {
        return hyname;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
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
    public void setState(Integer state)
    {
        this.state = state;
    }

    public Integer getState()
    {
        return state;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setTypes(Integer types)
    {
        this.types = types;
    }

    public Integer getTypes()
    {
        return types;
    }
    public void setJoinid(String joinid) 
    {
        this.joinid = joinid;
    }

    public String getJoinid() 
    {
        return joinid;
    }
    public void setJoinname(String joinname) 
    {
        this.joinname = joinname;
    }

    public String getJoinname() 
    {
        return joinname;
    }
    public void setMid(Long mid) 
    {
        this.mid = mid;
    }

    public Long getMid() 
    {
        return mid;
    }
    public void setOptname(String optname) 
    {
        this.optname = optname;
    }

    public String getOptname() 
    {
        return optname;
    }
    public void setRate(String rate) 
    {
        this.rate = rate;
    }

    public String getRate() 
    {
        return rate;
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
    public void setContents(String contents)
    {
        this.contents = contents;
    }

    public String getContents()
    {
        return contents;
    }
    public void setCancelreason(String cancelreason) 
    {
        this.cancelreason = cancelreason;
    }

    public String getCancelreason() 
    {
        return cancelreason;
    }
    public void setJyid(String jyid) 
    {
        this.jyid = jyid;
    }

    public String getJyid() 
    {
        return jyid;
    }
    public void setJyname(String jyname) 
    {
        this.jyname = jyname;
    }

    public String getJyname() 
    {
        return jyname;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setIssms(Integer issms) 
    {
        this.issms = issms;
    }

    public Integer getIssms() 
    {
        return issms;
    }
    public void setComid(Integer comid) 
    {
        this.comid = comid;
    }

    public Integer getComid() 
    {
        return comid;
    }
    public void setZcrenid(String zcrenid) 
    {
        this.zcrenid = zcrenid;
    }

    public String getZcrenid() 
    {
        return zcrenid;
    }
    public void setZcren(String zcren) 
    {
        this.zcren = zcren;
    }

    public String getZcren() 
    {
        return zcren;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("hyname", getHyname())
            .append("title", getTitle())
            .append("startdt", getStartdt())
            .append("enddt", getEnddt())
            .append("state", getState())
            .append("status", getStatus())
            .append("types", getTypes())
            .append("joinid", getJoinid())
            .append("joinname", getJoinname())
            .append("mid", getMid())
            .append("optname", getOptname())
            .append("rate", getRate())
            .append("uid", getUid())
            .append("optdt", getOptdt())
            .append("optid", getOptid())
            .append("contents", getContents())
            .append("cancelreason", getCancelreason())
            .append("jyid", getJyid())
            .append("jyname", getJyname())
            .append("content", getContent())
            .append("issms", getIssms())
            .append("comid", getComid())
            .append("zcrenid", getZcrenid())
            .append("zcren", getZcren())
            .toString();
    }
}
