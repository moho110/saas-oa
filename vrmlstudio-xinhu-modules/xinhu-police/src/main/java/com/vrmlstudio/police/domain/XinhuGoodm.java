package com.vrmlstudio.police.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 物品领用采购申请主对象 xinhu_goodm
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuGoodm extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long uid;

    /** 编号如销售号 */
    @Excel(name = "编号如销售号")
    private String num;

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

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 是否提交 */
    @Excel(name = "是否提交")
    private Integer isturn;

    /** 0领用,1采购申请 */
    @Excel(name = "0领用,1采购申请")
    private Integer types;

    /** 费用 */
    @Excel(name = "费用")
    private BigDecimal money;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer custid;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String custname;

    /** 优惠价格 */
    @Excel(name = "优惠价格")
    private BigDecimal discount;

    /** 0待出入库,2部分出入库,1已全部出入库 */
    @Excel(name = "0待出入库,2部分出入库,1已全部出入库")
    private Integer state;

    /** 关联客户合同custract.id */
    @Excel(name = "关联客户合同custract.id")
    private Long custractid;

    /** 是否全部创建收款单 */
    @Excel(name = "是否全部创建收款单")
    private Integer ispay;

    /** 对应单位id */
    @Excel(name = "对应单位id")
    private Integer comid;

    /** 退货类型 */
    @Excel(name = "退货类型")
    private String leixing;

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
    public void setNum(String num) 
    {
        this.num = num;
    }

    public String getNum() 
    {
        return num;
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
    public void setTypes(Integer types)
    {
        this.types = types;
    }

    public Integer getTypes()
    {
        return types;
    }
    public void setMoney(BigDecimal money) 
    {
        this.money = money;
    }

    public BigDecimal getMoney() 
    {
        return money;
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
    public void setDiscount(BigDecimal discount) 
    {
        this.discount = discount;
    }

    public BigDecimal getDiscount() 
    {
        return discount;
    }
    public void setState(Integer state) 
    {
        this.state = state;
    }

    public Integer getState() 
    {
        return state;
    }
    public void setCustractid(Long custractid) 
    {
        this.custractid = custractid;
    }

    public Long getCustractid() 
    {
        return custractid;
    }
    public void setIspay(Integer ispay) 
    {
        this.ispay = ispay;
    }

    public Integer getIspay() 
    {
        return ispay;
    }
    public void setComid(Integer comid) 
    {
        this.comid = comid;
    }

    public Integer getComid() 
    {
        return comid;
    }
    public void setLeixing(String leixing) 
    {
        this.leixing = leixing;
    }

    public String getLeixing() 
    {
        return leixing;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("uid", getUid())
            .append("num", getNum())
            .append("optdt", getOptdt())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("applydt", getApplydt())
            .append("content", getContent())
            .append("status", getStatus())
            .append("isturn", getIsturn())
            .append("types", getTypes())
            .append("money", getMoney())
            .append("custid", getCustid())
            .append("custname", getCustname())
            .append("discount", getDiscount())
            .append("state", getState())
            .append("custractid", getCustractid())
            .append("ispay", getIspay())
            .append("comid", getComid())
            .append("leixing", getLeixing())
            .toString();
    }
}
