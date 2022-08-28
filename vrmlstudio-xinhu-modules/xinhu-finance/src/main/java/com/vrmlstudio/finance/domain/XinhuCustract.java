package com.vrmlstudio.finance.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 客户合同对象 xinhu_custract
 * 
 * @author VRer
 * @date 2022-02-20
 */
public class XinhuCustract extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer uid;

    /** 合同编号 */
    @Excel(name = "合同编号")
    private String num;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** 操作人 */
    @Excel(name = "操作人")
    private String optname;

    /** 申请日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applydt;

    /** 说明 */
    @Excel(name = "说明")
    private String contents;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long custid;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String custname;

    /** 客户联系人 */
    @Excel(name = "客户联系人")
    private String linkman;

    /** 合同金额 */
    @Excel(name = "合同金额")
    private BigDecimal money;

    /** 待收金额 */
    @Excel(name = "待收金额")
    private BigDecimal moneys;

    /** 生效日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生效日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startdt;

    /** 截止日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "截止日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date enddt;

    /** 合同内容 */
    @Excel(name = "合同内容")
    private String content;

    /** 销售机会Id */
    @Excel(name = "销售机会Id")
    private Integer saleid;

    /** 是否提交 */
    @Excel(name = "是否提交")
    private Integer isturn;

    /** 签约日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "签约日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date signdt;

    /** 0收款合同，1付款合同 */
    @Excel(name = "0收款合同，1付款合同")
    private Integer types;

    /** 0待,1已完成,2部分 */
    @Excel(name = "0待,1已完成,2部分")
    private Integer ispay;

    /** 是否已全部创建收付款单 */
    @Excel(name = "是否已全部创建收付款单")
    private Integer isover;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer createid;

    /** 对应销售goodm.id */
    @Excel(name = "对应销售goodm.id")
    private Long xiaoid;

    /** 对应单位id */
    @Excel(name = "对应单位id")
    private Integer comid;

    /** 合同分类 */
    @Excel(name = "合同分类")
    private String fenlei;

    /** 合同文件 */
    @Excel(name = "合同文件")
    private String htfileid;

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
    public void setContents(String contents)
    {
        this.contents = contents;
    }

    public String getContents()
    {
        return contents;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setCustid(Long custid) 
    {
        this.custid = custid;
    }

    public Long getCustid() 
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
    public void setLinkman(String linkman) 
    {
        this.linkman = linkman;
    }

    public String getLinkman() 
    {
        return linkman;
    }
    public void setMoney(BigDecimal money) 
    {
        this.money = money;
    }

    public BigDecimal getMoney() 
    {
        return money;
    }
    public void setMoneys(BigDecimal moneys) 
    {
        this.moneys = moneys;
    }

    public BigDecimal getMoneys() 
    {
        return moneys;
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
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setSaleid(Integer saleid) 
    {
        this.saleid = saleid;
    }

    public Integer getSaleid() 
    {
        return saleid;
    }
    public void setIsturn(Integer isturn) 
    {
        this.isturn = isturn;
    }

    public Integer getIsturn() 
    {
        return isturn;
    }
    public void setSigndt(Date signdt) 
    {
        this.signdt = signdt;
    }

    public Date getSigndt() 
    {
        return signdt;
    }
    public void setTypes(Integer types)
    {
        this.types = types;
    }

    public Integer getTypes()
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
    public void setIsover(Integer isover) 
    {
        this.isover = isover;
    }

    public Integer getIsover() 
    {
        return isover;
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
    public void setXiaoid(Long xiaoid) 
    {
        this.xiaoid = xiaoid;
    }

    public Long getXiaoid() 
    {
        return xiaoid;
    }
    public void setComid(Integer comid) 
    {
        this.comid = comid;
    }

    public Integer getComid() 
    {
        return comid;
    }
    public void setFenlei(String fenlei) 
    {
        this.fenlei = fenlei;
    }

    public String getFenlei() 
    {
        return fenlei;
    }
    public void setHtfileid(String htfileid) 
    {
        this.htfileid = htfileid;
    }

    public String getHtfileid() 
    {
        return htfileid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("uid", getUid())
            .append("num", getNum())
            .append("optdt", getOptdt())
            .append("optname", getOptname())
            .append("applydt", getApplydt())
            .append("contents", getContent())
            .append("status", getStatus())
            .append("custid", getCustid())
            .append("custname", getCustname())
            .append("linkman", getLinkman())
            .append("money", getMoney())
            .append("moneys", getMoneys())
            .append("startdt", getStartdt())
            .append("enddt", getEnddt())
            .append("content", getContent())
            .append("saleid", getSaleid())
            .append("isturn", getIsturn())
            .append("signdt", getSigndt())
            .append("types", getTypes())
            .append("ispay", getIspay())
            .append("isover", getIsover())
            .append("createname", getCreatename())
            .append("createid", getCreateid())
            .append("xiaoid", getXiaoid())
            .append("comid", getComid())
            .append("fenlei", getFenlei())
            .append("htfileid", getHtfileid())
            .toString();
    }
}
