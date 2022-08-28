package com.vrmlstudio.police.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 流程单据对象 xinhu_flow_bill
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuFlowBill extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 单号 */
    @Excel(name = "单号")
    private String sericnum;

    /** 对应表 */
    @Excel(name = "对应表")
    private String tables;

    /** 主id */
    @Excel(name = "主id")
    private Long mid;

    /** 模块id */
    @Excel(name = "模块id")
    private Integer modeid;

    /** 模块名称 */
    @Excel(name = "模块名称")
    private String modename;

    /** 申请人姓名 */
    @Excel(name = "申请人姓名")
    private String uname;

    /** 用户id */
    @Excel(name = "用户id")
    private Integer uid;

    /** 部门0为主部门 */
    @Excel(name = "部门0为主部门")
    private Long udeptid;

    /** 申请人部门 */
    @Excel(name = "申请人部门")
    private String udeptname;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** 操作人Id */
    @Excel(name = "操作人Id")
    private Integer optid;

    /** 操作人 */
    @Excel(name = "操作人")
    private String optname;

    /** @所有审核人 */
    @Excel(name = "@所有审核人")
    private String allcheckid;

    /** 是否删除 */
    @Excel(name = "是否删除")
    private Integer isdel;

    /** 当前状态值 */
    @Excel(name = "当前状态值")
    private Integer nstatus;

    /** 申请日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applydt;

    /** 当前状态 */
    @Excel(name = "当前状态")
    private String nstatustext;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status;

    /** 当前步骤Id */
    @Excel(name = "当前步骤Id")
    private Long nowcourseid;

    /** 当前审核人id */
    @Excel(name = "当前审核人id")
    private String nowcheckid;

    /** 当前审核人 */
    @Excel(name = "当前审核人")
    private String nowcheckname;

    /** 最后审核说明 */
    @Excel(name = "最后审核说明")
    private String checksm;

    /** 最后更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updt;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdt;

    /** 退回flow_log.Id */
    @Excel(name = "退回flow_log.Id")
    private Long tuiid;

    /** 是否已提交了 */
    @Excel(name = "是否已提交了")
    private Integer isturn;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSericnum(String sericnum) 
    {
        this.sericnum = sericnum;
    }

    public String getSericnum() 
    {
        return sericnum;
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
    public void setModeid(Integer modeid) 
    {
        this.modeid = modeid;
    }

    public Integer getModeid() 
    {
        return modeid;
    }
    public void setModename(String modename) 
    {
        this.modename = modename;
    }

    public String getModename() 
    {
        return modename;
    }
    public void setUname(String uname) 
    {
        this.uname = uname;
    }

    public String getUname() 
    {
        return uname;
    }
    public void setUid(Integer uid) 
    {
        this.uid = uid;
    }

    public Integer getUid() 
    {
        return uid;
    }
    public void setUdeptid(Long udeptid) 
    {
        this.udeptid = udeptid;
    }

    public Long getUdeptid() 
    {
        return udeptid;
    }
    public void setUdeptname(String udeptname) 
    {
        this.udeptname = udeptname;
    }

    public String getUdeptname() 
    {
        return udeptname;
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
    public void setAllcheckid(String allcheckid) 
    {
        this.allcheckid = allcheckid;
    }

    public String getAllcheckid() 
    {
        return allcheckid;
    }
    public void setIsdel(Integer isdel) 
    {
        this.isdel = isdel;
    }

    public Integer getIsdel() 
    {
        return isdel;
    }
    public void setNstatus(Integer nstatus) 
    {
        this.nstatus = nstatus;
    }

    public Integer getNstatus() 
    {
        return nstatus;
    }
    public void setApplydt(Date applydt) 
    {
        this.applydt = applydt;
    }

    public Date getApplydt() 
    {
        return applydt;
    }
    public void setNstatustext(String nstatustext) 
    {
        this.nstatustext = nstatustext;
    }

    public String getNstatustext() 
    {
        return nstatustext;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setNowcourseid(Long nowcourseid) 
    {
        this.nowcourseid = nowcourseid;
    }

    public Long getNowcourseid() 
    {
        return nowcourseid;
    }
    public void setNowcheckid(String nowcheckid) 
    {
        this.nowcheckid = nowcheckid;
    }

    public String getNowcheckid() 
    {
        return nowcheckid;
    }
    public void setNowcheckname(String nowcheckname) 
    {
        this.nowcheckname = nowcheckname;
    }

    public String getNowcheckname() 
    {
        return nowcheckname;
    }
    public void setChecksm(String checksm) 
    {
        this.checksm = checksm;
    }

    public String getChecksm() 
    {
        return checksm;
    }
    public void setUpdt(Date updt) 
    {
        this.updt = updt;
    }

    public Date getUpdt() 
    {
        return updt;
    }
    public void setCreatedt(Date createdt) 
    {
        this.createdt = createdt;
    }

    public Date getCreatedt() 
    {
        return createdt;
    }
    public void setTuiid(Long tuiid) 
    {
        this.tuiid = tuiid;
    }

    public Long getTuiid() 
    {
        return tuiid;
    }
    public void setIsturn(Integer isturn) 
    {
        this.isturn = isturn;
    }

    public Integer getIsturn() 
    {
        return isturn;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sericnum", getSericnum())
            .append("tables", getTables())
            .append("mid", getMid())
            .append("modeid", getModeid())
            .append("modename", getModename())
            .append("uname", getUname())
            .append("uid", getUid())
            .append("udeptid", getUdeptid())
            .append("udeptname", getUdeptname())
            .append("optdt", getOptdt())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("allcheckid", getAllcheckid())
            .append("isdel", getIsdel())
            .append("nstatus", getNstatus())
            .append("applydt", getApplydt())
            .append("nstatustext", getNstatustext())
            .append("status", getStatus())
            .append("nowcourseid", getNowcourseid())
            .append("nowcheckid", getNowcheckid())
            .append("nowcheckname", getNowcheckname())
            .append("checksm", getChecksm())
            .append("updt", getUpdt())
            .append("createdt", getCreatedt())
            .append("tuiid", getTuiid())
            .append("isturn", getIsturn())
            .toString();
    }
}
