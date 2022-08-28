package com.vrmlstudio.hr.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 外出出差对象 xinhu_kqout
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuKqout extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer uid;

    /** 申请人姓名 */
    @Excel(name = "申请人姓名")
    private String applyname;

    /** 外出时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "外出时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date outtime;

    /** 回岗时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "回岗时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date intime;

    /** 外出地址 */
    @Excel(name = "外出地址")
    private String address;

    /** 外出事由 */
    @Excel(name = "外出事由")
    private String reason;

    /** 外出类型@外出,出差 */
    @Excel(name = "外出类型@外出,出差")
    private String atype;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** @0|待审核,1|审核通过,2|审核不通过 */
    @Excel(name = "@0|待审核,1|审核通过,2|审核不通过")
    private Integer status;

    /** @0|未提交,1|提交 */
    @Excel(name = "@0|未提交,1|提交")
    private Integer isturn;

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

    /** 是否销假@0|否,1|是 */
    @Excel(name = "是否销假@0|否,1|是")
    private Integer isxj;

    /** 销假说明 */
    @Excel(name = "销假说明")
    private String sicksm;

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
    public void setApplyname(String applyname) 
    {
        this.applyname = applyname;
    }

    public String getApplyname() 
    {
        return applyname;
    }
    public void setOuttime(Date outtime) 
    {
        this.outtime = outtime;
    }

    public Date getOuttime() 
    {
        return outtime;
    }
    public void setIntime(Date intime) 
    {
        this.intime = intime;
    }

    public Date getIntime() 
    {
        return intime;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setReason(String reason) 
    {
        this.reason = reason;
    }

    public String getReason() 
    {
        return reason;
    }
    public void setAtype(String atype) 
    {
        this.atype = atype;
    }

    public String getAtype() 
    {
        return atype;
    }
    public void setContent(String content)
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
    public void setIsxj(Integer isxj) 
    {
        this.isxj = isxj;
    }

    public Integer getIsxj() 
    {
        return isxj;
    }
    public void setSicksm(String sicksm) 
    {
        this.sicksm = sicksm;
    }

    public String getSicksm() 
    {
        return sicksm;
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
            .append("outtime", getOuttime())
            .append("intime", getIntime())
            .append("address", getAddress())
            .append("reason", getReason())
            .append("atype", getAtype())
            .append("content", getContent())
            .append("optdt", getOptdt())
            .append("status", getStatus())
            .append("isturn", getIsturn())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("applydt", getApplydt())
            .append("isxj", getIsxj())
            .append("sicksm", getSicksm())
            .append("comid", getComid())
            .toString();
    }
}
