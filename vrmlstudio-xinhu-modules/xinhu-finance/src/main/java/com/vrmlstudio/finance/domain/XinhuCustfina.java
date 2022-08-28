package com.vrmlstudio.finance.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 客户收付款对象 xinhu_custfina
 * 
 * @author VRer
 * @date 2022-02-20
 */
public class XinhuCustfina extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 合同ID */
    @Excel(name = "合同ID")
    private Long htid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String htnum;

    /** 所属日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "所属日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer uid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer custid;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String custname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String optname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal money;

    /** 0收款单,1付款单 */
    @Excel(name = "0收款单,1付款单")
    private Integer types;

    /** 是否收款,付款 */
    @Excel(name = "是否收款,付款")
    private Integer ispay;

    /** 收付款时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "收付款时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date paydt;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer createid;

    /** 是否转移的 */
    @Excel(name = "是否转移的")
    private Integer ismove;

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
    public void setHtid(Long htid) 
    {
        this.htid = htid;
    }

    public Long getHtid() 
    {
        return htid;
    }
    public void setHtnum(String htnum) 
    {
        this.htnum = htnum;
    }

    public String getHtnum() 
    {
        return htnum;
    }
    public void setDt(Date dt) 
    {
        this.dt = dt;
    }

    public Date getDt() 
    {
        return dt;
    }
    public void setUid(Integer uid) 
    {
        this.uid = uid;
    }

    public Integer getUid() 
    {
        return uid;
    }
    public void setCustid(Integer custid) 
    {
        this.custid = custid;
    }

    public Integer getCustid() 
    {
        return custid;
    }
    public void setCustname(String custname) 
    {
        this.custname = custname;
    }

    public String getCustname() 
    {
        return custname;
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
    public void setMoney(BigDecimal money) 
    {
        this.money = money;
    }

    public BigDecimal getMoney() 
    {
        return money;
    }
    public void setType(Integer types)
    {
        this.types = types;
    }

    public Integer getType() 
    {
        return types;
    }
    public void setIspay(Integer ispay) 
    {
        this.ispay = ispay;
    }

    public Integer getIspay() 
    {
        return ispay;
    }
    public void setPaydt(Date paydt) 
    {
        this.paydt = paydt;
    }

    public Date getPaydt() 
    {
        return paydt;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setCreatedt(Date createdt) 
    {
        this.createdt = createdt;
    }

    public Date getCreatedt() 
    {
        return createdt;
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
    public void setIsmove(Integer ismove) 
    {
        this.ismove = ismove;
    }

    public Integer getIsmove() 
    {
        return ismove;
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
            .append("htid", getHtid())
            .append("htnum", getHtnum())
            .append("dt", getDt())
            .append("uid", getUid())
            .append("custid", getCustid())
            .append("custname", getCustname())
            .append("optdt", getOptdt())
            .append("optname", getOptname())
            .append("money", getMoney())
            .append("types", getType())
            .append("ispay", getIspay())
            .append("paydt", getPaydt())
            .append("content", getContent())
            .append("createdt", getCreatedt())
            .append("createname", getCreatename())
            .append("createid", getCreateid())
            .append("ismove", getIsmove())
            .append("comid", getComid())
            .toString();
    }
}
