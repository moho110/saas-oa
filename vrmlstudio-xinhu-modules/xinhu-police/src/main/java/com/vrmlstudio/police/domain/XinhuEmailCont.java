package com.vrmlstudio.police.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 系统发送邮件内容对象 xinhu_email_cont
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuEmailCont extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 内容 */
    @Excel(name = "内容")
    private String body;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String receid;

    /** 接收人 */
    @Excel(name = "接收人")
    private String recename;

    /** 接收邮件 */
    @Excel(name = "接收邮件")
    private String receemail;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer optid;

    /** 添加人 */
    @Excel(name = "添加人")
    private String optname;

    /** 0待发送,1成功,2失败 */
    @Excel(name = "0待发送,1成功,2失败")
    private Integer status;

    /** 发送时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发送时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date senddt;

    /** 抄送给 */
    @Excel(name = "抄送给")
    private String ccname;

    /** 抄送邮件 */
    @Excel(name = "抄送邮件")
    private String ccemail;

    /** 附件路径 */
    @Excel(name = "附件路径")
    private String attachpath;

    /** 附件名称 */
    @Excel(name = "附件名称")
    private String attachname;

    /** emailm.id */
    @Excel(name = "emailm.id")
    private Long mid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setBody(String body) 
    {
        this.body = body;
    }

    public String getBody() 
    {
        return body;
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
    public void setReceemail(String receemail) 
    {
        this.receemail = receemail;
    }

    public String getReceemail() 
    {
        return receemail;
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
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setSenddt(Date senddt) 
    {
        this.senddt = senddt;
    }

    public Date getSenddt() 
    {
        return senddt;
    }
    public void setCcname(String ccname) 
    {
        this.ccname = ccname;
    }

    public String getCcname() 
    {
        return ccname;
    }
    public void setCcemail(String ccemail) 
    {
        this.ccemail = ccemail;
    }

    public String getCcemail() 
    {
        return ccemail;
    }
    public void setAttachpath(String attachpath) 
    {
        this.attachpath = attachpath;
    }

    public String getAttachpath() 
    {
        return attachpath;
    }
    public void setAttachname(String attachname) 
    {
        this.attachname = attachname;
    }

    public String getAttachname() 
    {
        return attachname;
    }
    public void setMid(Long mid) 
    {
        this.mid = mid;
    }

    public Long getMid() 
    {
        return mid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("body", getBody())
            .append("receid", getReceid())
            .append("recename", getRecename())
            .append("receemail", getReceemail())
            .append("optdt", getOptdt())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("status", getStatus())
            .append("senddt", getSenddt())
            .append("ccname", getCcname())
            .append("ccemail", getCcemail())
            .append("attachpath", getAttachpath())
            .append("attachname", getAttachname())
            .append("mid", getMid())
            .toString();
    }
}
