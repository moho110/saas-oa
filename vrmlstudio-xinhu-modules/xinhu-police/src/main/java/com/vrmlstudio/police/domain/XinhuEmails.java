package com.vrmlstudio.police.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 邮件子对象 xinhu_emails
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuEmails extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long mid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer uid;

    /** @0|未读,1|已读 */
    @Excel(name = "@0|未读,1|已读")
    private Integer zt;

    /** 0接收,1抄送,2发送者 */
    @Excel(name = "0接收,1抄送,2发送者")
    private Integer types;

    /** 是否回复 */
    @Excel(name = "是否回复")
    private Integer ishui;

    /** @0|未删,1|已删 */
    @Excel(name = "@0|未删,1|已删")
    private Integer isdel;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String email;

    /** 人员 */
    @Excel(name = "人员")
    private String personal;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMid(Long mid) 
    {
        this.mid = mid;
    }

    public Long getMid() 
    {
        return mid;
    }
    public void setUid(Integer uid) 
    {
        this.uid = uid;
    }

    public Integer getUid() 
    {
        return uid;
    }
    public void setZt(Integer zt) 
    {
        this.zt = zt;
    }

    public Integer getZt() 
    {
        return zt;
    }
    public void setTypes(Integer types)
    {
        this.types = types;
    }

    public Integer getTypes()
    {
        return types;
    }
    public void setIshui(Integer ishui) 
    {
        this.ishui = ishui;
    }

    public Integer getIshui() 
    {
        return ishui;
    }
    public void setIsdel(Integer isdel) 
    {
        this.isdel = isdel;
    }

    public Integer getIsdel() 
    {
        return isdel;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setPersonal(String personal) 
    {
        this.personal = personal;
    }

    public String getPersonal() 
    {
        return personal;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("mid", getMid())
            .append("uid", getUid())
            .append("zt", getZt())
            .append("types", getTypes())
            .append("ishui", getIshui())
            .append("isdel", getIsdel())
            .append("optdt", getOptdt())
            .append("email", getEmail())
            .append("personal", getPersonal())
            .toString();
    }
}
