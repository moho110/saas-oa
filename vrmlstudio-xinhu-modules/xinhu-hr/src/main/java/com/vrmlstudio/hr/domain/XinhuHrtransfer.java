package com.vrmlstudio.hr.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 职位调动对象 xinhu_hrtransfer
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuHrtransfer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer uid;

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
    private String content;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 是否提交 */
    @Excel(name = "是否提交")
    private Integer isturn;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer tranuid;

    /** 要调动人 */
    @Excel(name = "要调动人")
    private String tranname;

    /** 调动类型 */
    @Excel(name = "调动类型")
    private String trantype;

    /** 原来部门 */
    @Excel(name = "原来部门")
    private String olddeptname;

    /** 原来职位 */
    @Excel(name = "原来职位")
    private String oldranking;

    /** 生效日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生效日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date effectivedt;

    /** 调动后部门 */
    @Excel(name = "调动后部门")
    private String newdeptname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer newdeptid;

    /** 调动后职位 */
    @Excel(name = "调动后职位")
    private String newranking;

    /** 是否已完成 */
    @Excel(name = "是否已完成")
    private Integer isover;

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
    public void setTranuid(Integer tranuid) 
    {
        this.tranuid = tranuid;
    }

    public Integer getTranuid() 
    {
        return tranuid;
    }
    public void setTranname(String tranname) 
    {
        this.tranname = tranname;
    }

    public String getTranname() 
    {
        return tranname;
    }
    public void setTrantype(String trantype) 
    {
        this.trantype = trantype;
    }

    public String getTrantype() 
    {
        return trantype;
    }
    public void setOlddeptname(String olddeptname) 
    {
        this.olddeptname = olddeptname;
    }

    public String getOlddeptname() 
    {
        return olddeptname;
    }
    public void setOldranking(String oldranking) 
    {
        this.oldranking = oldranking;
    }

    public String getOldranking() 
    {
        return oldranking;
    }
    public void setEffectivedt(Date effectivedt) 
    {
        this.effectivedt = effectivedt;
    }

    public Date getEffectivedt() 
    {
        return effectivedt;
    }
    public void setNewdeptname(String newdeptname) 
    {
        this.newdeptname = newdeptname;
    }

    public String getNewdeptname() 
    {
        return newdeptname;
    }
    public void setNewdeptid(Integer newdeptid) 
    {
        this.newdeptid = newdeptid;
    }

    public Integer getNewdeptid() 
    {
        return newdeptid;
    }
    public void setNewranking(String newranking) 
    {
        this.newranking = newranking;
    }

    public String getNewranking() 
    {
        return newranking;
    }
    public void setIsover(Integer isover) 
    {
        this.isover = isover;
    }

    public Integer getIsover() 
    {
        return isover;
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
            .append("optdt", getOptdt())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("applydt", getApplydt())
            .append("content", getContent())
            .append("status", getStatus())
            .append("isturn", getIsturn())
            .append("tranuid", getTranuid())
            .append("tranname", getTranname())
            .append("trantype", getTrantype())
            .append("olddeptname", getOlddeptname())
            .append("oldranking", getOldranking())
            .append("effectivedt", getEffectivedt())
            .append("newdeptname", getNewdeptname())
            .append("newdeptid", getNewdeptid())
            .append("newranking", getNewranking())
            .append("isover", getIsover())
            .append("comid", getComid())
            .toString();
    }
}
