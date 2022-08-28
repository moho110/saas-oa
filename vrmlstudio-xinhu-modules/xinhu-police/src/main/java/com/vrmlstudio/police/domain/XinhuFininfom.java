package com.vrmlstudio.police.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 费用报销对象 xinhu_fininfom
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuFininfom extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 类型@0|报销单,1|出差报销,2|借款单,3|还款单,4|付款申请,5|开票申请 */
    @Excel(name = "类型@0|报销单,1|出差报销,2|借款单,3|还款单,4|付款申请,5|开票申请")
    private Integer types;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long uid;

    /** 金额 */
    @Excel(name = "金额")
    private BigDecimal money;

    /** 大写金额 */
    @Excel(name = "大写金额")
    private String moneycn;

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

    /** 附单据(张) */
    @Excel(name = "附单据(张)")
    private Integer bills;

    /** 付款方式 */
    @Excel(name = "付款方式")
    private String paytype;

    /** 收款人全称 */
    @Excel(name = "收款人全称")
    private String fullname;

    /** 收款帐号 */
    @Excel(name = "收款帐号")
    private String cardid;

    /** 开户行 */
    @Excel(name = "开户行")
    private String openbank;

    /** 用途 */
    @Excel(name = "用途")
    private String purpose;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String purresult;

    /** 付款日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "付款日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date paydt;

    /** 合同号/订单号 */
    @Excel(name = "合同号/订单号")
    private String num;

    /** 开票名称 */
    @Excel(name = "开票名称")
    private String name;

    /** 纳税识别号 */
    @Excel(name = "纳税识别号")
    private String shibieid;

    /** 公司地址 */
    @Excel(name = "公司地址")
    private String address;

    /** 电话 */
    @Excel(name = "电话")
    private String tel;

    /** 对应客户ID */
    @Excel(name = "对应客户ID")
    private Long custid;

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
    public void setTypes(Integer types)
    {
        this.types = types;
    }

    public Integer getTypes()
    {
        return types;
    }
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setMoney(BigDecimal money) 
    {
        this.money = money;
    }

    public BigDecimal getMoney() 
    {
        return money;
    }
    public void setMoneycn(String moneycn) 
    {
        this.moneycn = moneycn;
    }

    public String getMoneycn() 
    {
        return moneycn;
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
    public void setBills(Integer bills) 
    {
        this.bills = bills;
    }

    public Integer getBills() 
    {
        return bills;
    }
    public void setPaytype(String paytype) 
    {
        this.paytype = paytype;
    }

    public String getPaytype() 
    {
        return paytype;
    }
    public void setFullname(String fullname) 
    {
        this.fullname = fullname;
    }

    public String getFullname() 
    {
        return fullname;
    }
    public void setCardid(String cardid) 
    {
        this.cardid = cardid;
    }

    public String getCardid() 
    {
        return cardid;
    }
    public void setOpenbank(String openbank) 
    {
        this.openbank = openbank;
    }

    public String getOpenbank() 
    {
        return openbank;
    }
    public void setPurpose(String purpose) 
    {
        this.purpose = purpose;
    }

    public String getPurpose() 
    {
        return purpose;
    }
    public void setPurresult(String purresult) 
    {
        this.purresult = purresult;
    }

    public String getPurresult() 
    {
        return purresult;
    }
    public void setPaydt(Date paydt) 
    {
        this.paydt = paydt;
    }

    public Date getPaydt() 
    {
        return paydt;
    }
    public void setNum(String num) 
    {
        this.num = num;
    }

    public String getNum() 
    {
        return num;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setShibieid(String shibieid) 
    {
        this.shibieid = shibieid;
    }

    public String getShibieid() 
    {
        return shibieid;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setTel(String tel) 
    {
        this.tel = tel;
    }

    public String getTel() 
    {
        return tel;
    }
    public void setCustid(Long custid) 
    {
        this.custid = custid;
    }

    public Long getCustid() 
    {
        return custid;
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
            .append("types", getTypes())
            .append("uid", getUid())
            .append("money", getMoney())
            .append("moneycn", getMoneycn())
            .append("optdt", getOptdt())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("applydt", getApplydt())
            .append("content", getContent())
            .append("status", getStatus())
            .append("isturn", getIsturn())
            .append("bills", getBills())
            .append("paytype", getPaytype())
            .append("fullname", getFullname())
            .append("cardid", getCardid())
            .append("openbank", getOpenbank())
            .append("purpose", getPurpose())
            .append("purresult", getPurresult())
            .append("paydt", getPaydt())
            .append("num", getNum())
            .append("name", getName())
            .append("shibieid", getShibieid())
            .append("address", getAddress())
            .append("tel", getTel())
            .append("custid", getCustid())
            .append("comid", getComid())
            .toString();
    }
}
