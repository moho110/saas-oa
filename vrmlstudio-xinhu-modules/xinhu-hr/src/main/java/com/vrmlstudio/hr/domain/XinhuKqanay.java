package com.vrmlstudio.hr.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 考勤分析对象 xinhu_kqanay
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuKqanay extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dt;

    /** 人员id */
    @Excel(name = "人员id")
    private Integer uid;

    /** 状态名称 */
    @Excel(name = "状态名称")
    private String ztname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date time;

    /** 状态名称 */
    @Excel(name = "状态名称")
    private String state;

    /** 其他状态,如请假 */
    @Excel(name = "其他状态,如请假")
    private String states;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer sort;

    /** 是否工作日 */
    @Excel(name = "是否工作日")
    private Integer iswork;

    /** 秒数 */
    @Excel(name = "秒数")
    private Long emiao;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 应上班时间(小时) */
    @Excel(name = "应上班时间(小时)")
    private BigDecimal timesb;

    /** 已上班时间(小时) */
    @Excel(name = "已上班时间(小时)")
    private BigDecimal timeys;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
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
    public void setZtname(String ztname) 
    {
        this.ztname = ztname;
    }

    public String getZtname() 
    {
        return ztname;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }
    public void setState(String state) 
    {
        this.state = state;
    }

    public String getState() 
    {
        return state;
    }
    public void setStates(String states) 
    {
        this.states = states;
    }

    public String getStates() 
    {
        return states;
    }
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
    }
    public void setIswork(Integer iswork) 
    {
        this.iswork = iswork;
    }

    public Integer getIswork() 
    {
        return iswork;
    }
    public void setEmiao(Long emiao) 
    {
        this.emiao = emiao;
    }

    public Long getEmiao() 
    {
        return emiao;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setTimesb(BigDecimal timesb) 
    {
        this.timesb = timesb;
    }

    public BigDecimal getTimesb() 
    {
        return timesb;
    }
    public void setTimeys(BigDecimal timeys) 
    {
        this.timeys = timeys;
    }

    public BigDecimal getTimeys() 
    {
        return timeys;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("dt", getDt())
            .append("uid", getUid())
            .append("ztname", getZtname())
            .append("time", getTime())
            .append("state", getState())
            .append("states", getStates())
            .append("sort", getSort())
            .append("iswork", getIswork())
            .append("emiao", getEmiao())
            .append("optdt", getOptdt())
            .append("remark", getRemark())
            .append("timesb", getTimesb())
            .append("timeys", getTimeys())
            .toString();
    }
}
