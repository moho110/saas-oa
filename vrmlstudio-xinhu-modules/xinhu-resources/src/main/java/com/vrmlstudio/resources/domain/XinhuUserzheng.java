package com.vrmlstudio.resources.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 说明对象 xinhu_userzheng
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuUserzheng extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 对应单位id */
    @Excel(name = "对应单位id")
    private Integer comid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long uid;

    /** 所属人 */
    @Excel(name = "所属人")
    private String uname;

    /** 证件名称 */
    @Excel(name = "证件名称")
    private String mingc;

    /** 证书编号 */
    @Excel(name = "证书编号")
    private String numc;

    /** 取得时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "取得时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date sdt;

    /** 到期时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "到期时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date edt;

    /** 相关图标 */
    @Excel(name = "相关图标")
    private String fengmian;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long optid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String optname;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setComid(Integer comid) 
    {
        this.comid = comid;
    }

    public Integer getComid() 
    {
        return comid;
    }
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setUname(String uname) 
    {
        this.uname = uname;
    }

    public String getUname() 
    {
        return uname;
    }
    public void setMingc(String mingc) 
    {
        this.mingc = mingc;
    }

    public String getMingc() 
    {
        return mingc;
    }
    public void setNumc(String numc) 
    {
        this.numc = numc;
    }

    public String getNumc() 
    {
        return numc;
    }
    public void setSdt(Date sdt) 
    {
        this.sdt = sdt;
    }

    public Date getSdt() 
    {
        return sdt;
    }
    public void setEdt(Date edt) 
    {
        this.edt = edt;
    }

    public Date getEdt() 
    {
        return edt;
    }
    public void setFengmian(String fengmian) 
    {
        this.fengmian = fengmian;
    }

    public String getFengmian() 
    {
        return fengmian;
    }
    public void setOptid(Long optid) 
    {
        this.optid = optid;
    }

    public Long getOptid() 
    {
        return optid;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setOptname(String optname) 
    {
        this.optname = optname;
    }

    public String getOptname() 
    {
        return optname;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("comid", getComid())
            .append("uid", getUid())
            .append("uname", getUname())
            .append("mingc", getMingc())
            .append("numc", getNumc())
            .append("sdt", getSdt())
            .append("edt", getEdt())
            .append("fengmian", getFengmian())
            .append("optid", getOptid())
            .append("optdt", getOptdt())
            .append("optname", getOptname())
            .append("content", getContent())
            .toString();
    }
}
