package com.vrmlstudio.finance.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 车辆预定对象 xinhu_carmrese
 * 
 * @author VRer
 * @date 2022-02-20
 */
public class XinhuCarmrese extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long uid;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long optid;

    /** 操作人 */
    @Excel(name = "操作人")
    private String optname;

    /** 申请日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applydt;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer isturn;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String useid;

    /** 使用者 */
    @Excel(name = "使用者")
    private String usename;

    /** 使用人数 */
    @Excel(name = "使用人数")
    private Integer useren;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startdt;

    /** 截止时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "截止时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date enddt;

    /** 目的地 */
    @Excel(name = "目的地")
    private String address;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer carid;

    /** 使用车辆 */
    @Excel(name = "使用车辆")
    private String carnum;

    /** 线路 */
    @Excel(name = "线路")
    private String xianlines;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String jiaid;

    /** 驾驶员 */
    @Excel(name = "驾驶员")
    private String jianame;

    /** 起始公里数 */
    @Excel(name = "起始公里数")
    private String kmstart;

    /** 结束公里数 */
    @Excel(name = "结束公里数")
    private String kmend;

    /** 归还时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "归还时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date returndt;

    /** 对应单位id */
    @Excel(name = "对应单位id")
    private Integer comid;

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
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setOptid(Long optid) 
    {
        this.optid = optid;
    }

    public Long getOptid() 
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
    public void setApplydt(Date applydt) 
    {
        this.applydt = applydt;
    }

    public Date getApplydt() 
    {
        return applydt;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setIsturn(Integer isturn) 
    {
        this.isturn = isturn;
    }

    public Integer getIsturn() 
    {
        return isturn;
    }
    public void setUseid(String useid) 
    {
        this.useid = useid;
    }

    public String getUseid() 
    {
        return useid;
    }
    public void setUsename(String usename) 
    {
        this.usename = usename;
    }

    public String getUsename() 
    {
        return usename;
    }
    public void setUseren(Integer useren) 
    {
        this.useren = useren;
    }

    public Integer getUseren() 
    {
        return useren;
    }
    public void setStartdt(Date startdt) 
    {
        this.startdt = startdt;
    }

    public Date getStartdt() 
    {
        return startdt;
    }
    public void setEnddt(Date enddt) 
    {
        this.enddt = enddt;
    }

    public Date getEnddt() 
    {
        return enddt;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setCarid(Integer carid) 
    {
        this.carid = carid;
    }

    public Integer getCarid() 
    {
        return carid;
    }
    public void setCarnum(String carnum) 
    {
        this.carnum = carnum;
    }

    public String getCarnum() 
    {
        return carnum;
    }
    public void setXianlines(String xianlines) 
    {
        this.xianlines = xianlines;
    }

    public String getXianlines() 
    {
        return xianlines;
    }
    public void setJiaid(String jiaid) 
    {
        this.jiaid = jiaid;
    }

    public String getJiaid() 
    {
        return jiaid;
    }
    public void setJianame(String jianame) 
    {
        this.jianame = jianame;
    }

    public String getJianame() 
    {
        return jianame;
    }
    public void setKmstart(String kmstart) 
    {
        this.kmstart = kmstart;
    }

    public String getKmstart() 
    {
        return kmstart;
    }
    public void setKmend(String kmend) 
    {
        this.kmend = kmend;
    }

    public String getKmend() 
    {
        return kmend;
    }
    public void setReturndt(Date returndt) 
    {
        this.returndt = returndt;
    }

    public Date getReturndt() 
    {
        return returndt;
    }
    public void setComid(Integer comid) 
    {
        this.comid = comid;
    }

    public Integer getComid() 
    {
        return comid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("uid", getUid())
            .append("optdt", getOptdt())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("applydt", getApplydt())
            .append("content", getContent())
            .append("status", getStatus())
            .append("isturn", getIsturn())
            .append("useid", getUseid())
            .append("usename", getUsename())
            .append("useren", getUseren())
            .append("startdt", getStartdt())
            .append("enddt", getEnddt())
            .append("address", getAddress())
            .append("carid", getCarid())
            .append("carnum", getCarnum())
            .append("xianlines", getXianlines())
            .append("jiaid", getJiaid())
            .append("jianame", getJianame())
            .append("kmstart", getKmstart())
            .append("kmend", getKmend())
            .append("returndt", getReturndt())
            .append("comid", getComid())
            .toString();
    }
}
