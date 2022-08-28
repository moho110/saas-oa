package com.vrmlstudio.police.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 发票管理对象 xinhu_finpiao
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuFinpiao extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String optname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long optid;

    /** 对应客户ID */
    @Excel(name = "对应客户ID")
    private Long custid;

    /** 购买方 */
    @Excel(name = "购买方")
    private String maicustname;

    /** 购买方Id */
    @Excel(name = "购买方Id")
    private Long maicustid;

    /** 0开,1收到 */
    @Excel(name = "0开,1收到")
    private Integer types;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String custname;

    /** 发票代码 */
    @Excel(name = "发票代码")
    private String daima;

    /** 发票号码 */
    @Excel(name = "发票号码")
    private String haoma;

    /** 金额 */
    @Excel(name = "金额")
    private BigDecimal money;

    /** 开票日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开票日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date opendt;

    /** 发票类型 */
    @Excel(name = "发票类型")
    private String ptype;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 开票人 */
    @Excel(name = "开票人")
    private String kainame;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

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
    public void setOptname(String optname) 
    {
        this.optname = optname;
    }

    public String getOptname() 
    {
        return optname;
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
    public void setCustid(Long custid) 
    {
        this.custid = custid;
    }

    public Long getCustid() 
    {
        return custid;
    }
    public void setMaicustname(String maicustname) 
    {
        this.maicustname = maicustname;
    }

    public String getMaicustname() 
    {
        return maicustname;
    }
    public void setMaicustid(Long maicustid) 
    {
        this.maicustid = maicustid;
    }

    public Long getMaicustid() 
    {
        return maicustid;
    }
    public void setTypes(Integer type)
    {
        this.types = types;
    }

    public Integer getTypes()
    {
        return types;
    }
    public void setCustname(String custname) 
    {
        this.custname = custname;
    }

    public String getCustname() 
    {
        return custname;
    }
    public void setDaima(String daima) 
    {
        this.daima = daima;
    }

    public String getDaima() 
    {
        return daima;
    }
    public void setHaoma(String haoma) 
    {
        this.haoma = haoma;
    }

    public String getHaoma() 
    {
        return haoma;
    }
    public void setMoney(BigDecimal money) 
    {
        this.money = money;
    }

    public BigDecimal getMoney() 
    {
        return money;
    }
    public void setOpendt(Date opendt) 
    {
        this.opendt = opendt;
    }

    public Date getOpendt() 
    {
        return opendt;
    }
    public void setPtype(String ptype) 
    {
        this.ptype = ptype;
    }

    public String getPtype() 
    {
        return ptype;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setKainame(String kainame) 
    {
        this.kainame = kainame;
    }

    public String getKainame() 
    {
        return kainame;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
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
            .append("optname", getOptname())
            .append("optdt", getOptdt())
            .append("optid", getOptid())
            .append("custid", getCustid())
            .append("maicustname", getMaicustname())
            .append("maicustid", getMaicustid())
            .append("types", getTypes())
            .append("custname", getCustname())
            .append("daima", getDaima())
            .append("haoma", getHaoma())
            .append("money", getMoney())
            .append("opendt", getOpendt())
            .append("ptype", getPtype())
            .append("status", getStatus())
            .append("kainame", getKainame())
            .append("content", getContent())
            .append("comid", getComid())
            .toString();
    }
}
