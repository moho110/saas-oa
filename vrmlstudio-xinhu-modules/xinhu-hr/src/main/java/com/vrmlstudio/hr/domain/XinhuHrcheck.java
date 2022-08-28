package com.vrmlstudio.hr.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 考核评分对象 xinhu_hrcheck
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuHrcheck extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer uid;

    /** 考核名称 */
    @Excel(name = "考核名称")
    private String title;

    /** 申请人姓名 */
    @Excel(name = "申请人姓名")
    private String applyname;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer optid;

    /** 操作人 */
    @Excel(name = "操作人")
    private String optname;

    /** 申请日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applydt;

    /** 说明 */
    @Excel(name = "说明")
    private String contents;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 是否提交 */
    @Excel(name = "是否提交")
    private Integer isturn;

    /** 对应人 */
    @Excel(name = "对应人")
    private String uname;

    /** 月份 */
    @Excel(name = "月份")
    private String month;

    /** 考核内容 */
    @Excel(name = "考核内容")
    private String content;

    /** 自评分数 */
    @Excel(name = "自评分数")
    private BigDecimal fenzp;

    /** 上级评分 */
    @Excel(name = "上级评分")
    private BigDecimal fensj;

    /** 人事评分 */
    @Excel(name = "人事评分")
    private BigDecimal fenrs;

    /** 最后得分 */
    @Excel(name = "最后得分")
    private BigDecimal fen;

    /** 关联考核项目hrkaohem.id */
    @Excel(name = "关联考核项目hrkaohem.id")
    private Long khid;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdt;

    /** 评分开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "评分开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startdt;

    /** 评分截止时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "评分截止时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date enddt;

    /** 评分人 */
    @Excel(name = "评分人")
    private String pfren;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String pfrenid;

    /** 未评分人Id */
    @Excel(name = "未评分人Id")
    private String pfrenids;

    /** 未评分人 */
    @Excel(name = "未评分人")
    private String pfrens;

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
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setApplyname(String applyname) 
    {
        this.applyname = applyname;
    }

    public String getApplyname() 
    {
        return applyname;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setOptid(Integer optid) 
    {
        this.optid = optid;
    }

    public Integer getOptid() 
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
    public void setContents(String contents)
    {
        this.contents = contents;
    }

    public String getContents()
    {
        return contents;
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
    public void setUname(String uname) 
    {
        this.uname = uname;
    }

    public String getUname() 
    {
        return uname;
    }
    public void setMonth(String month) 
    {
        this.month = month;
    }

    public String getMonth() 
    {
        return month;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setFenzp(BigDecimal fenzp) 
    {
        this.fenzp = fenzp;
    }

    public BigDecimal getFenzp() 
    {
        return fenzp;
    }
    public void setFensj(BigDecimal fensj) 
    {
        this.fensj = fensj;
    }

    public BigDecimal getFensj() 
    {
        return fensj;
    }
    public void setFenrs(BigDecimal fenrs) 
    {
        this.fenrs = fenrs;
    }

    public BigDecimal getFenrs() 
    {
        return fenrs;
    }
    public void setFen(BigDecimal fen) 
    {
        this.fen = fen;
    }

    public BigDecimal getFen() 
    {
        return fen;
    }
    public void setKhid(Long khid) 
    {
        this.khid = khid;
    }

    public Long getKhid() 
    {
        return khid;
    }
    public void setCreatedt(Date createdt) 
    {
        this.createdt = createdt;
    }

    public Date getCreatedt() 
    {
        return createdt;
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
    public void setPfren(String pfren) 
    {
        this.pfren = pfren;
    }

    public String getPfren() 
    {
        return pfren;
    }
    public void setPfrenid(String pfrenid) 
    {
        this.pfrenid = pfrenid;
    }

    public String getPfrenid() 
    {
        return pfrenid;
    }
    public void setPfrenids(String pfrenids) 
    {
        this.pfrenids = pfrenids;
    }

    public String getPfrenids() 
    {
        return pfrenids;
    }
    public void setPfrens(String pfrens) 
    {
        this.pfrens = pfrens;
    }

    public String getPfrens() 
    {
        return pfrens;
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
            .append("title", getTitle())
            .append("applyname", getApplyname())
            .append("optdt", getOptdt())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("applydt", getApplydt())
            .append("contents", getContents())
            .append("status", getStatus())
            .append("isturn", getIsturn())
            .append("uname", getUname())
            .append("month", getMonth())
            .append("content", getContent())
            .append("fenzp", getFenzp())
            .append("fensj", getFensj())
            .append("fenrs", getFenrs())
            .append("fen", getFen())
            .append("khid", getKhid())
            .append("createdt", getCreatedt())
            .append("startdt", getStartdt())
            .append("enddt", getEnddt())
            .append("pfren", getPfren())
            .append("pfrenid", getPfrenid())
            .append("pfrenids", getPfrenids())
            .append("pfrens", getPfrens())
            .append("comid", getComid())
            .toString();
    }
}
