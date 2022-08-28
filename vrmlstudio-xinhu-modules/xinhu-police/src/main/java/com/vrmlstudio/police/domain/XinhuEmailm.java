package com.vrmlstudio.police.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 邮件主对象 xinhu_emailm
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuEmailm extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 用户iD */
    @Excel(name = "用户iD")
    private Integer uid;

    /** 主题 */
    @Excel(name = "主题")
    private String title;

    /** 邮件内容 */
    @Excel(name = "邮件内容")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer sendid;

    /** 发送人 */
    @Excel(name = "发送人")
    private String sendname;

    /** 发送时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发送时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date senddt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String receid;

    /** 接收人 */
    @Excel(name = "接收人")
    private String recename;

    /** @0|草稿,1|已发送 */
    @Excel(name = "@0|草稿,1|已发送")
    private Integer isturn;

    /** @回复id */
    @Excel(name = "@回复id")
    private Integer hid;

    /** @是否有附件 */
    @Excel(name = "@是否有附件")
    private Integer isfile;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date applydt;

    /** 邮件Id */
    @Excel(name = "邮件Id")
    private String messageId;

    /** 发送人邮件 */
    @Excel(name = "发送人邮件")
    private String fromemail;

    /** 发给邮件人 */
    @Excel(name = "发给邮件人")
    private String toemail;

    /** 回复邮件 */
    @Excel(name = "回复邮件")
    private String replyToemail;

    /** 抄送给 */
    @Excel(name = "抄送给")
    private String ccemail;

    /** 邮件大小 */
    @Excel(name = "邮件大小")
    private Long size;

    /** 抄送给 */
    @Excel(name = "抄送给")
    private String ccname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ccid;

    /** 0内部邮件,1用邮件外发 */
    @Excel(name = "0内部邮件,1用邮件外发")
    private Integer type;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long numoi;

    /** 对应单位id */
    @Excel(name = "对应单位id")
    private Integer comid;

    /** 外发状态 */
    @Excel(name = "外发状态")
    private Integer outzt;

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
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setSendid(Integer sendid) 
    {
        this.sendid = sendid;
    }

    public Integer getSendid() 
    {
        return sendid;
    }
    public void setSendname(String sendname) 
    {
        this.sendname = sendname;
    }

    public String getSendname() 
    {
        return sendname;
    }
    public void setSenddt(Date senddt) 
    {
        this.senddt = senddt;
    }

    public Date getSenddt() 
    {
        return senddt;
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
    public void setIsturn(Integer isturn) 
    {
        this.isturn = isturn;
    }

    public Integer getIsturn() 
    {
        return isturn;
    }
    public void setHid(Integer hid) 
    {
        this.hid = hid;
    }

    public Integer getHid() 
    {
        return hid;
    }
    public void setIsfile(Integer isfile) 
    {
        this.isfile = isfile;
    }

    public Integer getIsfile() 
    {
        return isfile;
    }
    public void setApplydt(Date applydt) 
    {
        this.applydt = applydt;
    }

    public Date getApplydt() 
    {
        return applydt;
    }
    public void setMessageId(String messageId) 
    {
        this.messageId = messageId;
    }

    public String getMessageId() 
    {
        return messageId;
    }
    public void setFromemail(String fromemail) 
    {
        this.fromemail = fromemail;
    }

    public String getFromemail() 
    {
        return fromemail;
    }
    public void setToemail(String toemail) 
    {
        this.toemail = toemail;
    }

    public String getToemail() 
    {
        return toemail;
    }
    public void setReplyToemail(String replyToemail) 
    {
        this.replyToemail = replyToemail;
    }

    public String getReplyToemail() 
    {
        return replyToemail;
    }
    public void setCcemail(String ccemail) 
    {
        this.ccemail = ccemail;
    }

    public String getCcemail() 
    {
        return ccemail;
    }
    public void setSize(Long size) 
    {
        this.size = size;
    }

    public Long getSize() 
    {
        return size;
    }
    public void setCcname(String ccname) 
    {
        this.ccname = ccname;
    }

    public String getCcname() 
    {
        return ccname;
    }
    public void setCcid(String ccid) 
    {
        this.ccid = ccid;
    }

    public String getCcid() 
    {
        return ccid;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setNumoi(Long numoi) 
    {
        this.numoi = numoi;
    }

    public Long getNumoi() 
    {
        return numoi;
    }
    public void setComid(Integer comid) 
    {
        this.comid = comid;
    }

    public Integer getComid() 
    {
        return comid;
    }
    public void setOutzt(Integer outzt) 
    {
        this.outzt = outzt;
    }

    public Integer getOutzt() 
    {
        return outzt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("uid", getUid())
            .append("title", getTitle())
            .append("content", getContent())
            .append("sendid", getSendid())
            .append("sendname", getSendname())
            .append("senddt", getSenddt())
            .append("receid", getReceid())
            .append("recename", getRecename())
            .append("isturn", getIsturn())
            .append("hid", getHid())
            .append("isfile", getIsfile())
            .append("applydt", getApplydt())
            .append("messageId", getMessageId())
            .append("fromemail", getFromemail())
            .append("toemail", getToemail())
            .append("replyToemail", getReplyToemail())
            .append("ccemail", getCcemail())
            .append("size", getSize())
            .append("ccname", getCcname())
            .append("ccid", getCcid())
            .append("type", getType())
            .append("optdt", getOptdt())
            .append("numoi", getNumoi())
            .append("comid", getComid())
            .append("outzt", getOutzt())
            .toString();
    }
}
