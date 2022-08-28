package com.vrmlstudio.police.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 固定资产对象 xinhu_assetm
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuAssetm extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 类别 */
    @Excel(name = "类别")
    private Integer typeid;

    /** 名称 */
    @Excel(name = "名称")
    private String title;

    /** 编号 */
    @Excel(name = "编号")
    private String num;

    /** 品牌 */
    @Excel(name = "品牌")
    private String brand;

    /** 规格型号 */
    @Excel(name = "规格型号")
    private String model;

    /** 来源 */
    @Excel(name = "来源")
    private String laiyuan;

    /** 所属部门 */
    @Excel(name = "所属部门")
    private String shuname;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dt;

    /** 存放地点 */
    @Excel(name = "存放地点")
    private Long ckid;

    /** 状态 */
    @Excel(name = "状态")
    private Integer state;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** 操作人 */
    @Excel(name = "操作人")
    private String optname;

    /** 添加时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "添加时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date adddt;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** 购进日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "购进日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date buydt;

    /** 价格 */
    @Excel(name = "价格")
    private BigDecimal price;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer optid;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String useid;

    /** 使用人 */
    @Excel(name = "使用人")
    private String usename;

    /** 封面图片 */
    @Excel(name = "封面图片")
    private String fengmian;

    /** 对应单位id */
    @Excel(name = "对应单位id")
    private Integer comid;

    /** 所在位置 */
    @Excel(name = "所在位置")
    private String address;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTypeid(Integer typeid) 
    {
        this.typeid = typeid;
    }

    public Integer getTypeid() 
    {
        return typeid;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setNum(String num) 
    {
        this.num = num;
    }

    public String getNum() 
    {
        return num;
    }
    public void setBrand(String brand) 
    {
        this.brand = brand;
    }

    public String getBrand() 
    {
        return brand;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }
    public void setLaiyuan(String laiyuan) 
    {
        this.laiyuan = laiyuan;
    }

    public String getLaiyuan() 
    {
        return laiyuan;
    }
    public void setShuname(String shuname) 
    {
        this.shuname = shuname;
    }

    public String getShuname() 
    {
        return shuname;
    }
    public void setDt(Date dt) 
    {
        this.dt = dt;
    }

    public Date getDt() 
    {
        return dt;
    }
    public void setCkid(Long ckid) 
    {
        this.ckid = ckid;
    }

    public Long getCkid() 
    {
        return ckid;
    }
    public void setState(Integer state) 
    {
        this.state = state;
    }

    public Integer getState() 
    {
        return state;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setOptname(String optname) 
    {
        this.optname = optname;
    }

    public String getOptname() 
    {
        return optname;
    }
    public void setAdddt(Date adddt) 
    {
        this.adddt = adddt;
    }

    public Date getAdddt() 
    {
        return adddt;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setBuydt(Date buydt) 
    {
        this.buydt = buydt;
    }

    public Date getBuydt() 
    {
        return buydt;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setOptid(Integer optid) 
    {
        this.optid = optid;
    }

    public Integer getOptid() 
    {
        return optid;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
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
    public void setFengmian(String fengmian) 
    {
        this.fengmian = fengmian;
    }

    public String getFengmian() 
    {
        return fengmian;
    }
    public void setComid(Integer comid) 
    {
        this.comid = comid;
    }

    public Integer getComid() 
    {
        return comid;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("typeid", getTypeid())
            .append("title", getTitle())
            .append("num", getNum())
            .append("brand", getBrand())
            .append("model", getModel())
            .append("laiyuan", getLaiyuan())
            .append("shuname", getShuname())
            .append("dt", getDt())
            .append("ckid", getCkid())
            .append("state", getState())
            .append("content", getContent())
            .append("optname", getOptname())
            .append("adddt", getAdddt())
            .append("optdt", getOptdt())
            .append("buydt", getBuydt())
            .append("price", getPrice())
            .append("optid", getOptid())
            .append("status", getStatus())
            .append("useid", getUseid())
            .append("usename", getUsename())
            .append("fengmian", getFengmian())
            .append("comid", getComid())
            .append("address", getAddress())
            .toString();
    }
}
