package com.vrmlstudio.police.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 费用报销子对象 xinhu_fininfos
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuFininfos extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 对应主表fininfom.id */
    @Excel(name = "对应主表fininfom.id")
    private Integer mid;

    /** 排序号 */
    @Excel(name = "排序号")
    private Integer sort;

    /** 发生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date sdt;

    /** 所属项目 */
    @Excel(name = "所属项目")
    private String name;

    /** 金额 */
    @Excel(name = "金额")
    private BigDecimal money;

    /** 说明 */
    @Excel(name = "说明")
    private String sm;

    /** 发生地点 */
    @Excel(name = "发生地点")
    private String didian;

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
    public void setMid(Integer mid) 
    {
        this.mid = mid;
    }

    public Integer getMid() 
    {
        return mid;
    }
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
    }
    public void setSdt(Date sdt) 
    {
        this.sdt = sdt;
    }

    public Date getSdt() 
    {
        return sdt;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setMoney(BigDecimal money) 
    {
        this.money = money;
    }

    public BigDecimal getMoney() 
    {
        return money;
    }
    public void setSm(String sm) 
    {
        this.sm = sm;
    }

    public String getSm() 
    {
        return sm;
    }
    public void setDidian(String didian) 
    {
        this.didian = didian;
    }

    public String getDidian() 
    {
        return didian;
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
            .append("mid", getMid())
            .append("sort", getSort())
            .append("sdt", getSdt())
            .append("name", getName())
            .append("money", getMoney())
            .append("sm", getSm())
            .append("didian", getDidian())
            .append("comid", getComid())
            .toString();
    }
}
