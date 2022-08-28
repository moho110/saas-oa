package com.vrmlstudio.hr.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 考勤机命令发送对象 xinhu_kqjcmd
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuKqjcmd extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 设备ID */
    @Excel(name = "设备ID")
    private Long snid;

    /** 发送命令内容 */
    @Excel(name = "发送命令内容")
    private String cmd;

    /** 运行状态0待运行,1已运行,2请求中 */
    @Excel(name = "运行状态0待运行,1已运行,2请求中")
    private Integer status;

    /** 请求时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "请求时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date qjtime;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** 处理时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "处理时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date cjtime;

    /** 类型 */
    @Excel(name = "类型")
    private String atype;

    /** 推送主键id */
    @Excel(name = "推送主键id")
    private String others;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSnid(Long snid) 
    {
        this.snid = snid;
    }

    public Long getSnid() 
    {
        return snid;
    }
    public void setCmd(String cmd) 
    {
        this.cmd = cmd;
    }

    public String getCmd() 
    {
        return cmd;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setQjtime(Date qjtime) 
    {
        this.qjtime = qjtime;
    }

    public Date getQjtime() 
    {
        return qjtime;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setCjtime(Date cjtime) 
    {
        this.cjtime = cjtime;
    }

    public Date getCjtime() 
    {
        return cjtime;
    }
    public void setAtype(String atype) 
    {
        this.atype = atype;
    }

    public String getAtype() 
    {
        return atype;
    }
    public void setOthers(String others) 
    {
        this.others = others;
    }

    public String getOthers() 
    {
        return others;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("snid", getSnid())
            .append("cmd", getCmd())
            .append("status", getStatus())
            .append("qjtime", getQjtime())
            .append("optdt", getOptdt())
            .append("cjtime", getCjtime())
            .append("atype", getAtype())
            .append("others", getOthers())
            .toString();
    }
}
