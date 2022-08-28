package com.vrmlstudio.resources.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 任务对象 xinhu_work
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuWork extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String num;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 任务类型 */
    @Excel(name = "任务类型")
    private String types;

    /** 任务等级 */
    @Excel(name = "任务等级")
    private String grade;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String distid;

    /** 分配给 */
    @Excel(name = "分配给")
    private String dist;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

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

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startdt;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date enddt;

    /** 状态 */
    @Excel(name = "状态")
    private Integer state;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date txdt;

    /** 分值 */
    @Excel(name = "分值")
    private Integer fen;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status;

    /** 对应项目Id */
    @Excel(name = "对应项目Id")
    private Integer projectid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ddid;

    /** 督导人员，不填默认上级 */
    @Excel(name = "督导人员，不填默认上级")
    private String ddname;

    /** 任务分数 */
    @Excel(name = "任务分数")
    private Integer score;

    /** 得分 */
    @Excel(name = "得分")
    private Integer mark;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer uid;

    /** 申请日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applydt;

    /** 是否提交 */
    @Excel(name = "是否提交")
    private Integer isturn;

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
    public void setNum(String num) 
    {
        this.num = num;
    }

    public String getNum() 
    {
        return num;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setTypes(String types)
    {
        this.types = types;
    }

    public String getTypes()
    {
        return types;
    }
    public void setGrade(String grade) 
    {
        this.grade = grade;
    }

    public String getGrade() 
    {
        return grade;
    }
    public void setDistid(String distid) 
    {
        this.distid = distid;
    }

    public String getDistid() 
    {
        return distid;
    }
    public void setDist(String dist) 
    {
        this.dist = dist;
    }

    public String getDist() 
    {
        return dist;
    }
    public void setContent(String explain)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
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
    public void setState(Integer state) 
    {
        this.state = state;
    }

    public Integer getState() 
    {
        return state;
    }
    public void setTxdt(Date txdt) 
    {
        this.txdt = txdt;
    }

    public Date getTxdt() 
    {
        return txdt;
    }
    public void setFen(Integer fen) 
    {
        this.fen = fen;
    }

    public Integer getFen() 
    {
        return fen;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setProjectid(Integer projectid) 
    {
        this.projectid = projectid;
    }

    public Integer getProjectid() 
    {
        return projectid;
    }
    public void setDdid(String ddid) 
    {
        this.ddid = ddid;
    }

    public String getDdid() 
    {
        return ddid;
    }
    public void setDdname(String ddname) 
    {
        this.ddname = ddname;
    }

    public String getDdname() 
    {
        return ddname;
    }
    public void setScore(Integer score) 
    {
        this.score = score;
    }

    public Integer getScore() 
    {
        return score;
    }
    public void setMark(Integer mark) 
    {
        this.mark = mark;
    }

    public Integer getMark() 
    {
        return mark;
    }
    public void setUid(Integer uid) 
    {
        this.uid = uid;
    }

    public Integer getUid() 
    {
        return uid;
    }
    public void setApplydt(Date applydt) 
    {
        this.applydt = applydt;
    }

    public Date getApplydt() 
    {
        return applydt;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("num", getNum())
            .append("title", getTitle())
            .append("types", getTypes())
            .append("grade", getGrade())
            .append("distid", getDistid())
            .append("dist", getDist())
            .append("content", getContent())
            .append("optdt", getOptdt())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("startdt", getStartdt())
            .append("enddt", getEnddt())
            .append("state", getState())
            .append("txdt", getTxdt())
            .append("fen", getFen())
            .append("status", getStatus())
            .append("projectid", getProjectid())
            .append("ddid", getDdid())
            .append("ddname", getDdname())
            .append("score", getScore())
            .append("mark", getMark())
            .append("uid", getUid())
            .append("applydt", getApplydt())
            .append("isturn", getIsturn())
            .append("comid", getComid())
            .toString();
    }
}
