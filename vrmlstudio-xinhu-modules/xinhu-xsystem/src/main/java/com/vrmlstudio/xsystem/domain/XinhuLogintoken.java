package com.vrmlstudio.xsystem.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 系统登录token对象 xinhu_logintoken
 * 
 * @author VRer
 * @date 2022-02-20
 */
public class XinhuLogintoken extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long uid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String token;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date adddt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date moddt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cfrom;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String device;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ip;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String web;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer online;

    /** 是否可推送 */
    @Excel(name = "是否可推送")
    private Integer ispush;

    /** 推送token */
    @Excel(name = "推送token")
    private String pushtoken;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setToken(String token) 
    {
        this.token = token;
    }

    public String getToken() 
    {
        return token;
    }
    public void setAdddt(Date adddt) 
    {
        this.adddt = adddt;
    }

    public Date getAdddt() 
    {
        return adddt;
    }
    public void setModdt(Date moddt) 
    {
        this.moddt = moddt;
    }

    public Date getModdt() 
    {
        return moddt;
    }
    public void setCfrom(String cfrom) 
    {
        this.cfrom = cfrom;
    }

    public String getCfrom() 
    {
        return cfrom;
    }
    public void setDevice(String device) 
    {
        this.device = device;
    }

    public String getDevice() 
    {
        return device;
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
    public void setOnline(Integer online) 
    {
        this.online = online;
    }

    public Integer getOnline() 
    {
        return online;
    }
    public void setIspush(Integer ispush) 
    {
        this.ispush = ispush;
    }

    public Integer getIspush() 
    {
        return ispush;
    }
    public void setPushtoken(String pushtoken) 
    {
        this.pushtoken = pushtoken;
    }

    public String getPushtoken() 
    {
        return pushtoken;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("uid", getUid())
            .append("name", getName())
            .append("token", getToken())
            .append("adddt", getAdddt())
            .append("moddt", getModdt())
            .append("cfrom", getCfrom())
            .append("device", getDevice())
            .append("ip", getIp())
            .append("web", getWeb())
            .append("online", getOnline())
            .append("ispush", getIspush())
            .append("pushtoken", getPushtoken())
            .toString();
    }
}
