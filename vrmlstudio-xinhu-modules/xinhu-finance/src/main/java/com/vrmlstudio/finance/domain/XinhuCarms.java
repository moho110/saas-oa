package com.vrmlstudio.finance.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 车辆信息登记对象 xinhu_carms
 * 
 * @author VRer
 * @date 2022-02-20
 */
public class XinhuCarms extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 车辆Id */
    @Excel(name = "车辆Id")
    private Long carid;

    /** 类型,加油 */
    @Excel(name = "类型,加油")
    private String otype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date startdt;

    /** 截止时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "截止时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date enddt;

    /** 花费金额 */
    @Excel(name = "花费金额")
    private BigDecimal money;

    /** 添加人id */
    @Excel(name = "添加人id")
    private Long optid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 添加人 */
    @Excel(name = "添加人")
    private String optname;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** 对应名称 */
    @Excel(name = "对应名称")
    private String unitname;

    /** 申请日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applydt;

    /** 地点 */
    @Excel(name = "地点")
    private String address;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String jiaid;

    /** 驾驶员 */
    @Excel(name = "驾驶员")
    private String jianame;

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
    public void setCarid(Long carid) 
    {
        this.carid = carid;
    }

    public Long getCarid() 
    {
        return carid;
    }
    public void setOtype(String otype) 
    {
        this.otype = otype;
    }

    public String getOtype() 
    {
        return otype;
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
    public void setMoney(BigDecimal money) 
    {
        this.money = money;
    }

    public BigDecimal getMoney() 
    {
        return money;
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
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setUnitname(String unitname) 
    {
        this.unitname = unitname;
    }

    public String getUnitname() 
    {
        return unitname;
    }
    public void setApplydt(Date applydt) 
    {
        this.applydt = applydt;
    }

    public Date getApplydt() 
    {
        return applydt;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
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
            .append("carid", getCarid())
            .append("otype", getOtype())
            .append("startdt", getStartdt())
            .append("enddt", getEnddt())
            .append("money", getMoney())
            .append("optid", getOptid())
            .append("optdt", getOptdt())
            .append("optname", getOptname())
            .append("status", getStatus())
            .append("content", getContent())
            .append("unitname", getUnitname())
            .append("applydt", getApplydt())
            .append("address", getAddress())
            .append("jiaid", getJiaid())
            .append("jianame", getJianame())
            .append("comid", getComid())
            .toString();
    }
}
