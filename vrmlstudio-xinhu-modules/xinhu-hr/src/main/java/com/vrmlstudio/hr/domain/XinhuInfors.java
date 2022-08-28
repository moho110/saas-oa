package com.vrmlstudio.hr.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 信息子投票项对象 xinhu_infors
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuInfors extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 对应主表infor.id */
    @Excel(name = "对应主表infor.id")
    private Integer mid;

    /** 排序号 */
    @Excel(name = "排序号")
    private Integer sort;

    /** 投票选项 */
    @Excel(name = "投票选项")
    private String touitems;

    /** 得到票数 */
    @Excel(name = "得到票数")
    private Long touci;

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
    public void setTouitems(String touitems) 
    {
        this.touitems = touitems;
    }

    public String getTouitems() 
    {
        return touitems;
    }
    public void setTouci(Long touci) 
    {
        this.touci = touci;
    }

    public Long getTouci() 
    {
        return touci;
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
            .append("touitems", getTouitems())
            .append("touci", getTouci())
            .append("comid", getComid())
            .toString();
    }
}
