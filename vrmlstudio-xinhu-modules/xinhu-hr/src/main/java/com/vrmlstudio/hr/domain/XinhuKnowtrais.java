package com.vrmlstudio.hr.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 考试培训子对象 xinhu_knowtrais
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuKnowtrais extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long mid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long uid;

    /** 考试时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "考试时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date kssdt;

    /** 考试结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "考试结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date ksedt;

    /** 得分 */
    @Excel(name = "得分")
    private Integer fenshu;

    /** 考试时间(秒数) */
    @Excel(name = "考试时间(秒数)")
    private Long kstime;

    /** 是否已考试 */
    @Excel(name = "是否已考试")
    private Integer isks;

    /** 考试题目id */
    @Excel(name = "考试题目id")
    private String tkids;

    /** 我做题得到答案 */
    @Excel(name = "我做题得到答案")
    private String dyids;

    /** 答题结果0未答,1正确,2错误 */
    @Excel(name = "答题结果0未答,1正确,2错误")
    private String dyjgs;

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
    public void setMid(Long mid) 
    {
        this.mid = mid;
    }

    public Long getMid() 
    {
        return mid;
    }
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setKssdt(Date kssdt) 
    {
        this.kssdt = kssdt;
    }

    public Date getKssdt() 
    {
        return kssdt;
    }
    public void setKsedt(Date ksedt) 
    {
        this.ksedt = ksedt;
    }

    public Date getKsedt() 
    {
        return ksedt;
    }
    public void setFenshu(Integer fenshu) 
    {
        this.fenshu = fenshu;
    }

    public Integer getFenshu() 
    {
        return fenshu;
    }
    public void setKstime(Long kstime) 
    {
        this.kstime = kstime;
    }

    public Long getKstime() 
    {
        return kstime;
    }
    public void setIsks(Integer isks) 
    {
        this.isks = isks;
    }

    public Integer getIsks() 
    {
        return isks;
    }
    public void setTkids(String tkids) 
    {
        this.tkids = tkids;
    }

    public String getTkids() 
    {
        return tkids;
    }
    public void setDyids(String dyids) 
    {
        this.dyids = dyids;
    }

    public String getDyids() 
    {
        return dyids;
    }
    public void setDyjgs(String dyjgs) 
    {
        this.dyjgs = dyjgs;
    }

    public String getDyjgs() 
    {
        return dyjgs;
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
            .append("uid", getUid())
            .append("kssdt", getKssdt())
            .append("ksedt", getKsedt())
            .append("fenshu", getFenshu())
            .append("kstime", getKstime())
            .append("isks", getIsks())
            .append("tkids", getTkids())
            .append("dyids", getDyids())
            .append("dyjgs", getDyjgs())
            .append("comid", getComid())
            .toString();
    }
}
