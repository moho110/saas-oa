package com.vrmlstudio.hr.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 考核评分记录对象 xinhu_hrcheckn
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuHrcheckn extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 评分项目 */
    @Excel(name = "评分项目")
    private String itemname;

    /** 评分名称 */
    @Excel(name = "评分名称")
    private String pfname;

    /** 对应主表hrcheck.id */
    @Excel(name = "对应主表hrcheck.id")
    private Integer mid;

    /** 排序号 */
    @Excel(name = "排序号")
    private Integer sort;

    /** 对应hrchecks.id */
    @Excel(name = "对应hrchecks.id")
    private Long sid;

    /** 评分分数 */
    @Excel(name = "评分分数")
    private Integer fenshu;

    /** 权重 */
    @Excel(name = "权重")
    private BigDecimal weight;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long optid;

    /** 评分人 */
    @Excel(name = "评分人")
    private String optname;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** 最后得分 */
    @Excel(name = "最后得分")
    private BigDecimal defen;

    /** 关联评分hrkaohen.Id */
    @Excel(name = "关联评分hrkaohen.Id")
    private Long pfid;

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
    public void setItemname(String itemname) 
    {
        this.itemname = itemname;
    }

    public String getItemname() 
    {
        return itemname;
    }
    public void setPfname(String pfname) 
    {
        this.pfname = pfname;
    }

    public String getPfname() 
    {
        return pfname;
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
    public void setSid(Long sid) 
    {
        this.sid = sid;
    }

    public Long getSid() 
    {
        return sid;
    }
    public void setFenshu(Integer fenshu) 
    {
        this.fenshu = fenshu;
    }

    public Integer getFenshu() 
    {
        return fenshu;
    }
    public void setWeight(BigDecimal weight) 
    {
        this.weight = weight;
    }

    public BigDecimal getWeight() 
    {
        return weight;
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
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setDefen(BigDecimal defen) 
    {
        this.defen = defen;
    }

    public BigDecimal getDefen() 
    {
        return defen;
    }
    public void setPfid(Long pfid) 
    {
        this.pfid = pfid;
    }

    public Long getPfid() 
    {
        return pfid;
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
            .append("itemname", getItemname())
            .append("pfname", getPfname())
            .append("mid", getMid())
            .append("sort", getSort())
            .append("sid", getSid())
            .append("fenshu", getFenshu())
            .append("weight", getWeight())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("optdt", getOptdt())
            .append("defen", getDefen())
            .append("pfid", getPfid())
            .append("comid", getComid())
            .toString();
    }
}
