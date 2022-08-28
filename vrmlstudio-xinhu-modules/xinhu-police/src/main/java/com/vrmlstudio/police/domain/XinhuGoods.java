package com.vrmlstudio.police.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 物品对象 xinhu_goods
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuGoods extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 对应分类 */
    @Excel(name = "对应分类")
    private Integer typeid;

    /** 物品编号 */
    @Excel(name = "物品编号")
    private String num;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** 规格 */
    @Excel(name = "规格")
    private String guige;

    /** 型号 */
    @Excel(name = "型号")
    private String xinghao;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** 单价 */
    @Excel(name = "单价")
    private BigDecimal price;

    /** 单位 */
    @Excel(name = "单位")
    private String unit;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date adddt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer optid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String optname;

    /** 库存 */
    @Excel(name = "库存")
    private Long stock;

    /** 初始库存 */
    @Excel(name = "初始库存")
    private Long stockcs;

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
    public void setTypeid(Integer typeid) 
    {
        this.typeid = typeid;
    }

    public Integer getTypeid() 
    {
        return typeid;
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
    public void setGuige(String guige) 
    {
        this.guige = guige;
    }

    public String getGuige() 
    {
        return guige;
    }
    public void setXinghao(String xinghao) 
    {
        this.xinghao = xinghao;
    }

    public String getXinghao() 
    {
        return xinghao;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
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
    public void setStock(Long stock) 
    {
        this.stock = stock;
    }

    public Long getStock() 
    {
        return stock;
    }
    public void setStockcs(Long stockcs) 
    {
        this.stockcs = stockcs;
    }

    public Long getStockcs() 
    {
        return stockcs;
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
            .append("typeid", getTypeid())
            .append("num", getNum())
            .append("name", getName())
            .append("guige", getGuige())
            .append("xinghao", getXinghao())
            .append("content", getContent())
            .append("price", getPrice())
            .append("unit", getUnit())
            .append("adddt", getAdddt())
            .append("optdt", getOptdt())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("stock", getStock())
            .append("stockcs", getStockcs())
            .append("comid", getComid())
            .toString();
    }
}
