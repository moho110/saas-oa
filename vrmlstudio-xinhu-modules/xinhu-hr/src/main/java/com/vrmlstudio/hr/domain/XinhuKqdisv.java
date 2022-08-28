package com.vrmlstudio.hr.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 考勤排班对象 xinhu_kqdisv
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuKqdisv extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 1组排班,2人员 */
    @Excel(name = "1组排班,2人员")
    private Integer plx;

    /** 组id,人员Id */
    @Excel(name = "组id,人员Id")
    private Long receid;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dt;

    /** 0考勤时间,1休息,2工作日 */
    @Excel(name = "0考勤时间,1休息,2工作日")
    private Integer types;

    /** 对应主ID */
    @Excel(name = "对应主ID")
    private Long mid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPlx(Integer plx) 
    {
        this.plx = plx;
    }

    public Integer getPlx() 
    {
        return plx;
    }
    public void setReceid(Long receid) 
    {
        this.receid = receid;
    }

    public Long getReceid() 
    {
        return receid;
    }
    public void setDt(Date dt) 
    {
        this.dt = dt;
    }

    public Date getDt() 
    {
        return dt;
    }
    public void setTypes(Integer types)
    {
        this.types = types;
    }

    public Integer getTypes()
    {
        return types;
    }
    public void setMid(Long mid) 
    {
        this.mid = mid;
    }

    public Long getMid() 
    {
        return mid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("plx", getPlx())
            .append("receid", getReceid())
            .append("dt", getDt())
            .append("types", getTypes())
            .append("mid", getMid())
            .toString();
    }
}
