package com.vrmlstudio.hr.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * IM会话记录历史对象 xinhu_im_history
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuImHistory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String types;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer receid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer uid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer sendid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cont;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer stotal;

    /** 推送时标题 */
    @Excel(name = "推送时标题")
    private String title;

    /** 相关地址 */
    @Excel(name = "相关地址")
    private String xgurl;

    /** 最后一条消息id */
    @Excel(name = "最后一条消息id")
    private Long messid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTypes(String type)
    {
        this.types = types;
    }

    public String getTypes()
    {
        return types;
    }
    public void setReceid(Integer receid) 
    {
        this.receid = receid;
    }

    public Integer getReceid() 
    {
        return receid;
    }
    public void setUid(Integer uid) 
    {
        this.uid = uid;
    }

    public Integer getUid() 
    {
        return uid;
    }
    public void setSendid(Integer sendid) 
    {
        this.sendid = sendid;
    }

    public Integer getSendid() 
    {
        return sendid;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setCont(String cont) 
    {
        this.cont = cont;
    }

    public String getCont() 
    {
        return cont;
    }
    public void setStotal(Integer stotal) 
    {
        this.stotal = stotal;
    }

    public Integer getStotal() 
    {
        return stotal;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setXgurl(String xgurl) 
    {
        this.xgurl = xgurl;
    }

    public String getXgurl() 
    {
        return xgurl;
    }
    public void setMessid(Long messid) 
    {
        this.messid = messid;
    }

    public Long getMessid() 
    {
        return messid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("types", getTypes())
            .append("receid", getReceid())
            .append("uid", getUid())
            .append("sendid", getSendid())
            .append("optdt", getOptdt())
            .append("cont", getCont())
            .append("stotal", getStotal())
            .append("title", getTitle())
            .append("xgurl", getXgurl())
            .append("messid", getMessid())
            .toString();
    }
}
