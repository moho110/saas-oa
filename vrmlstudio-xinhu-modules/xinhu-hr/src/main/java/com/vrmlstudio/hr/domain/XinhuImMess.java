package com.vrmlstudio.hr.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * IM聊天记录对象 xinhu_im_mess
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuImMess extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 状态 */
    @Excel(name = "状态")
    private Integer zt;

    /** 内容 */
    @Excel(name = "内容")
    private String cont;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer sendid;

    /** 接收 */
    @Excel(name = "接收")
    private Integer receid;

    /** 接收用户id */
    @Excel(name = "接收用户id")
    private String receuid;

    /** 信息类型 */
    @Excel(name = "信息类型")
    private String types;

    /** 相关地址 */
    @Excel(name = "相关地址")
    private String url;

    /** 对应文件Id */
    @Excel(name = "对应文件Id")
    private Long fileid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String msgid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setZt(Integer zt) 
    {
        this.zt = zt;
    }

    public Integer getZt() 
    {
        return zt;
    }
    public void setCont(String cont) 
    {
        this.cont = cont;
    }

    public String getCont() 
    {
        return cont;
    }
    public void setSendid(Integer sendid) 
    {
        this.sendid = sendid;
    }

    public Integer getSendid() 
    {
        return sendid;
    }
    public void setReceid(Integer receid) 
    {
        this.receid = receid;
    }

    public Integer getReceid() 
    {
        return receid;
    }
    public void setReceuid(String receuid) 
    {
        this.receuid = receuid;
    }

    public String getReceuid() 
    {
        return receuid;
    }
    public void setTypes(String types)
    {
        this.types = types;
    }

    public String getTypes()
    {
        return types;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }
    public void setFileid(Long fileid) 
    {
        this.fileid = fileid;
    }

    public Long getFileid() 
    {
        return fileid;
    }
    public void setMsgid(String msgid) 
    {
        this.msgid = msgid;
    }

    public String getMsgid() 
    {
        return msgid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("optdt", getOptdt())
            .append("zt", getZt())
            .append("cont", getCont())
            .append("sendid", getSendid())
            .append("receid", getReceid())
            .append("receuid", getReceuid())
            .append("types", getTypes())
            .append("url", getUrl())
            .append("fileid", getFileid())
            .append("msgid", getMsgid())
            .toString();
    }
}
