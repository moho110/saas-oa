package com.vrmlstudio.flow.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 单据操作记录对象 xinhu_flow_log
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuFlowLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String tables;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long mid;

    /** 1通过 */
    @Excel(name = "1通过")
    private Integer status;

    /** 状态名称 */
    @Excel(name = "状态名称")
    private String statusname;

    /** 进程名称 */
    @Excel(name = "进程名称")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long courseid;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ip;

    /** 浏览器 */
    @Excel(name = "浏览器")
    private String web;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String checkname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer checkid;

    /** @模块Id */
    @Excel(name = "@模块Id")
    private Integer modeid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String color;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer valid;

    /** 步骤号 */
    @Excel(name = "步骤号")
    private Integer step;

    /** 签名的图片base64 */
    @Excel(name = "签名的图片base64")
    private String qmimg;

    /** 是否转办记录 */
    @Excel(name = "是否转办记录")
    private Integer iszb;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
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
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setStatusname(String statusname) 
    {
        this.statusname = statusname;
    }

    public String getStatusname() 
    {
        return statusname;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setCourseid(Long courseid) 
    {
        this.courseid = courseid;
    }

    public Long getCourseid() 
    {
        return courseid;
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
    public void setIp(String ip) 
    {
        this.ip = ip;
    }

    public String getIp() 
    {
        return ip;
    }
    public void setWeb(String web) 
    {
        this.web = web;
    }

    public String getWeb() 
    {
        return web;
    }
    public void setCheckname(String checkname) 
    {
        this.checkname = checkname;
    }

    public String getCheckname() 
    {
        return checkname;
    }
    public void setCheckid(Integer checkid) 
    {
        this.checkid = checkid;
    }

    public Integer getCheckid() 
    {
        return checkid;
    }
    public void setModeid(Integer modeid) 
    {
        this.modeid = modeid;
    }

    public Integer getModeid() 
    {
        return modeid;
    }
    public void setColor(String color) 
    {
        this.color = color;
    }

    public String getColor() 
    {
        return color;
    }
    public void setValid(Integer valid) 
    {
        this.valid = valid;
    }

    public Integer getValid() 
    {
        return valid;
    }
    public void setStep(Integer step) 
    {
        this.step = step;
    }

    public Integer getStep() 
    {
        return step;
    }
    public void setQmimg(String qmimg) 
    {
        this.qmimg = qmimg;
    }

    public String getQmimg() 
    {
        return qmimg;
    }
    public void setIszb(Integer iszb) 
    {
        this.iszb = iszb;
    }

    public Integer getIszb() 
    {
        return iszb;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("tables", getTables())
            .append("mid", getMid())
            .append("status", getStatus())
            .append("statusname", getStatusname())
            .append("name", getName())
            .append("courseid", getCourseid())
            .append("optdt", getOptdt())
            .append("content", getContent())
            .append("ip", getIp())
            .append("web", getWeb())
            .append("checkname", getCheckname())
            .append("checkid", getCheckid())
            .append("modeid", getModeid())
            .append("color", getColor())
            .append("valid", getValid())
            .append("step", getStep())
            .append("qmimg", getQmimg())
            .append("iszb", getIszb())
            .toString();
    }
}
