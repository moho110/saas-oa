package com.vrmlstudio.finance.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 车辆维修保养记录对象 xinhu_carmang
 * 
 * @author VRer
 * @date 2022-02-20
 */
public class XinhuCarmang extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer uid;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer optid;

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

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 是否提交 */
    @Excel(name = "是否提交")
    private Integer isturn;

    /** 维修车辆 */
    @Excel(name = "维修车辆")
    private Integer carid;

    /** 维修原因 */
    @Excel(name = "维修原因")
    private String reason;

    /** 维修地点 */
    @Excel(name = "维修地点")
    private String address;

    /** 驾驶员 */
    @Excel(name = "驾驶员")
    private String jianame;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String jiaid;

    /** 更换部件 */
    @Excel(name = "更换部件")
    private String bujian;

    /** 维修时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "维修时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startdt;

    /** 维修截止时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "维修截止时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date enddt;

    /** 维修金额 */
    @Excel(name = "维修金额")
    private BigDecimal money;

    /** 类型@0|车辆维修,1|保养 */
    @Excel(name = "类型@0|车辆维修,1|保养")
    private Integer types;

    /** 下次保养日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下次保养日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date nextdt;

    /** 当前保养公里数 */
    @Excel(name = "当前保养公里数")
    private String kmshu;

    /** 下次保养公里数 */
    @Excel(name = "下次保养公里数")
    private String kmnshu;

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
    public void setUid(Integer uid) 
    {
        this.uid = uid;
    }

    public Integer getUid() 
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
    public void setCarid(Integer carid) 
    {
        this.carid = carid;
    }

    public Integer getCarid() 
    {
        return carid;
    }
    public void setReason(String reason) 
    {
        this.reason = reason;
    }

    public String getReason() 
    {
        return reason;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setJianame(String jianame) 
    {
        this.jianame = jianame;
    }

    public String getJianame() 
    {
        return jianame;
    }
    public void setJiaid(String jiaid) 
    {
        this.jiaid = jiaid;
    }

    public String getJiaid() 
    {
        return jiaid;
    }
    public void setBujian(String bujian) 
    {
        this.bujian = bujian;
    }

    public String getBujian() 
    {
        return bujian;
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
    public void setTypes(Integer types)
    {
        this.types = types;
    }

    public Integer getTypes()
    {
        return types;
    }
    public void setNextdt(Date nextdt) 
    {
        this.nextdt = nextdt;
    }

    public Date getNextdt() 
    {
        return nextdt;
    }
    public void setKmshu(String kmshu) 
    {
        this.kmshu = kmshu;
    }

    public String getKmshu() 
    {
        return kmshu;
    }
    public void setKmnshu(String kmnshu) 
    {
        this.kmnshu = kmnshu;
    }

    public String getKmnshu() 
    {
        return kmnshu;
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
            .append("carid", getCarid())
            .append("reason", getReason())
            .append("address", getAddress())
            .append("jianame", getJianame())
            .append("jiaid", getJiaid())
            .append("bujian", getBujian())
            .append("startdt", getStartdt())
            .append("enddt", getEnddt())
            .append("money", getMoney())
            .append("types", getTypes())
            .append("nextdt", getNextdt())
            .append("kmshu", getKmshu())
            .append("kmnshu", getKmnshu())
            .append("comid", getComid())
            .toString();
    }
}
