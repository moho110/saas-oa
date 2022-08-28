package com.vrmlstudio.finance.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 客户对象 xinhu_customer
 * 
 * @author VRer
 * @date 2022-02-20
 */
public class XinhuCustomer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 客户类型 */
    @Excel(name = "客户类型")
    private String types;

    /** 所属人 */
    @Excel(name = "所属人")
    private Integer uid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String optname;

    /** 联系人 */
    @Excel(name = "联系人")
    private String linkname;

    /** 单位名称 */
    @Excel(name = "单位名称")
    private String unitname;

    /** 来源 */
    @Excel(name = "来源")
    private String laiyuan;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String tel;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String mobile;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String email;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String address;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String routeline;

    /** 主页地址 */
    @Excel(name = "主页地址")
    private String url;

    /** 启用停用 */
    @Excel(name = "启用停用")
    private Integer status;

    /** 添加时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "添加时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date adddt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer createid;

    /** 共享给 */
    @Excel(name = "共享给")
    private String shate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String shateid;

    /** 是否供应商 */
    @Excel(name = "是否供应商")
    private Integer isgys;

    /** 是否标*客户 */
    @Excel(name = "是否标*客户")
    private Integer isstat;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer fzid;

    /** 客户负责人 */
    @Excel(name = "客户负责人")
    private String fzname;

    /** 合同数 */
    @Excel(name = "合同数")
    private Integer htshu;

    /** 销售总额 */
    @Excel(name = "销售总额")
    private BigDecimal moneyz;

    /** 待收金额 */
    @Excel(name = "待收金额")
    private BigDecimal moneyd;

    /** 所在省 */
    @Excel(name = "所在省")
    private String sheng;

    /** 所在市 */
    @Excel(name = "所在市")
    private String shi;

    /** 是否放入公海 */
    @Excel(name = "是否放入公海")
    private Integer isgh;

    /** 最后跟进时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后跟进时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastdt;

    /** 纳税识别号 */
    @Excel(name = "纳税识别号")
    private String shibieid;

    /** 开户行 */
    @Excel(name = "开户行")
    private String openbank;

    /** 开户帐号 */
    @Excel(name = "开户帐号")
    private String cardid;

    /** 对应单位id */
    @Excel(name = "对应单位id")
    private Integer comid;

    /** 地址经纬度 */
    @Excel(name = "地址经纬度")
    private String addresslatlng;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setType(String types)
    {
        this.types = types;
    }

    public String getType() 
    {
        return types;
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
    public void setOptname(String optname) 
    {
        this.optname = optname;
    }

    public String getOptname() 
    {
        return optname;
    }
    public void setLinkname(String linkname) 
    {
        this.linkname = linkname;
    }

    public String getLinkname() 
    {
        return linkname;
    }
    public void setUnitname(String unitname) 
    {
        this.unitname = unitname;
    }

    public String getUnitname() 
    {
        return unitname;
    }
    public void setLaiyuan(String laiyuan) 
    {
        this.laiyuan = laiyuan;
    }

    public String getLaiyuan() 
    {
        return laiyuan;
    }
    public void setTel(String tel) 
    {
        this.tel = tel;
    }

    public String getTel() 
    {
        return tel;
    }
    public void setMobile(String mobile) 
    {
        this.mobile = mobile;
    }

    public String getMobile() 
    {
        return mobile;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setRouteline(String routeline) 
    {
        this.routeline = routeline;
    }

    public String getRouteline() 
    {
        return routeline;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setAdddt(Date adddt) 
    {
        this.adddt = adddt;
    }

    public Date getAdddt() 
    {
        return adddt;
    }
    public void setCreatename(String createname) 
    {
        this.createname = createname;
    }

    public String getCreatename() 
    {
        return createname;
    }
    public void setCreateid(Integer createid) 
    {
        this.createid = createid;
    }

    public Integer getCreateid() 
    {
        return createid;
    }
    public void setShate(String shate) 
    {
        this.shate = shate;
    }

    public String getShate() 
    {
        return shate;
    }
    public void setShateid(String shateid) 
    {
        this.shateid = shateid;
    }

    public String getShateid() 
    {
        return shateid;
    }
    public void setIsgys(Integer isgys) 
    {
        this.isgys = isgys;
    }

    public Integer getIsgys() 
    {
        return isgys;
    }
    public void setIsstat(Integer isstat) 
    {
        this.isstat = isstat;
    }

    public Integer getIsstat() 
    {
        return isstat;
    }
    public void setFzid(Integer fzid) 
    {
        this.fzid = fzid;
    }

    public Integer getFzid() 
    {
        return fzid;
    }
    public void setFzname(String fzname) 
    {
        this.fzname = fzname;
    }

    public String getFzname() 
    {
        return fzname;
    }
    public void setHtshu(Integer htshu) 
    {
        this.htshu = htshu;
    }

    public Integer getHtshu() 
    {
        return htshu;
    }
    public void setMoneyz(BigDecimal moneyz) 
    {
        this.moneyz = moneyz;
    }

    public BigDecimal getMoneyz() 
    {
        return moneyz;
    }
    public void setMoneyd(BigDecimal moneyd) 
    {
        this.moneyd = moneyd;
    }

    public BigDecimal getMoneyd() 
    {
        return moneyd;
    }
    public void setSheng(String sheng) 
    {
        this.sheng = sheng;
    }

    public String getSheng() 
    {
        return sheng;
    }
    public void setShi(String shi) 
    {
        this.shi = shi;
    }

    public String getShi() 
    {
        return shi;
    }
    public void setIsgh(Integer isgh) 
    {
        this.isgh = isgh;
    }

    public Integer getIsgh() 
    {
        return isgh;
    }
    public void setLastdt(Date lastdt) 
    {
        this.lastdt = lastdt;
    }

    public Date getLastdt() 
    {
        return lastdt;
    }
    public void setShibieid(String shibieid) 
    {
        this.shibieid = shibieid;
    }

    public String getShibieid() 
    {
        return shibieid;
    }
    public void setOpenbank(String openbank) 
    {
        this.openbank = openbank;
    }

    public String getOpenbank() 
    {
        return openbank;
    }
    public void setCardid(String cardid) 
    {
        this.cardid = cardid;
    }

    public String getCardid() 
    {
        return cardid;
    }
    public void setComid(Integer comid) 
    {
        this.comid = comid;
    }

    public Integer getComid() 
    {
        return comid;
    }
    public void setAddresslatlng(String addresslatlng) 
    {
        this.addresslatlng = addresslatlng;
    }

    public String getAddresslatlng() 
    {
        return addresslatlng;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("types", getType())
            .append("uid", getUid())
            .append("optdt", getOptdt())
            .append("optname", getOptname())
            .append("linkname", getLinkname())
            .append("unitname", getUnitname())
            .append("laiyuan", getLaiyuan())
            .append("tel", getTel())
            .append("mobile", getMobile())
            .append("email", getEmail())
            .append("content", getContent())
            .append("address", getAddress())
            .append("routeline", getRouteline())
            .append("url", getUrl())
            .append("status", getStatus())
            .append("adddt", getAdddt())
            .append("createname", getCreatename())
            .append("createid", getCreateid())
            .append("shate", getShate())
            .append("shateid", getShateid())
            .append("isgys", getIsgys())
            .append("isstat", getIsstat())
            .append("fzid", getFzid())
            .append("fzname", getFzname())
            .append("htshu", getHtshu())
            .append("moneyz", getMoneyz())
            .append("moneyd", getMoneyd())
            .append("sheng", getSheng())
            .append("shi", getShi())
            .append("isgh", getIsgh())
            .append("lastdt", getLastdt())
            .append("shibieid", getShibieid())
            .append("openbank", getOpenbank())
            .append("cardid", getCardid())
            .append("comid", getComid())
            .append("addresslatlng", getAddresslatlng())
            .toString();
    }
}
