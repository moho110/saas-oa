package com.vrmlstudio.hr.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 离职申请对象 xinhu_hrredund
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuHrredund extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long uid;

    /** 申请人姓名 */
    @Excel(name = "申请人姓名")
    private String applyname;

    /** 职位 */
    @Excel(name = "职位")
    private String ranking;

    /** 入职日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入职日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date entrydt;

    /** 离职日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "离职日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date quitdt;

    /** 离职类型 */
    @Excel(name = "离职类型")
    private String redundtype;

    /** 离职原因 */
    @Excel(name = "离职原因")
    private String redundreson;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** @0|待审核,1|审核通过,2|审核不通过 */
    @Excel(name = "@0|待审核,1|审核通过,2|审核不通过")
    private Integer status;

    /** @0|未提交,1|提交 */
    @Excel(name = "@0|未提交,1|提交")
    private Integer isturn;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer isover;

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
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setApplyname(String applyname) 
    {
        this.applyname = applyname;
    }

    public String getApplyname() 
    {
        return applyname;
    }
    public void setRanking(String ranking) 
    {
        this.ranking = ranking;
    }

    public String getRanking() 
    {
        return ranking;
    }
    public void setEntrydt(Date entrydt) 
    {
        this.entrydt = entrydt;
    }

    public Date getEntrydt() 
    {
        return entrydt;
    }
    public void setQuitdt(Date quitdt) 
    {
        this.quitdt = quitdt;
    }

    public Date getQuitdt() 
    {
        return quitdt;
    }
    public void setRedundtype(String redundtype) 
    {
        this.redundtype = redundtype;
    }

    public String getRedundtype() 
    {
        return redundtype;
    }
    public void setRedundreson(String redundreson) 
    {
        this.redundreson = redundreson;
    }

    public String getRedundreson() 
    {
        return redundreson;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
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
    public void setIsover(Integer isover) 
    {
        this.isover = isover;
    }

    public Integer getIsover() 
    {
        return isover;
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
            .append("applyname", getApplyname())
            .append("ranking", getRanking())
            .append("entrydt", getEntrydt())
            .append("quitdt", getQuitdt())
            .append("redundtype", getRedundtype())
            .append("redundreson", getRedundreson())
            .append("optdt", getOptdt())
            .append("content", getContent())
            .append("status", getStatus())
            .append("isturn", getIsturn())
            .append("isover", getIsover())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("applydt", getApplydt())
            .append("comid", getComid())
            .toString();
    }
}
