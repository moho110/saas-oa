package com.vrmlstudio.hr.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 薪资模版子对象 xinhu_hrsalars
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuHrsalars extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 对应主表hrsalarm.id */
    @Excel(name = "对应主表hrsalarm.id")
    private Integer mid;

    /** 排序号 */
    @Excel(name = "排序号")
    private Integer sort;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 对应字段 */
    @Excel(name = "对应字段")
    private String fields;

    /** 公式 */
    @Excel(name = "公式")
    private String gongsi;

    /** 0字段,1增加,2减少 */
    @Excel(name = "0字段,1增加,2减少")
    private Integer types;

    /** 备注 */
    @Excel(name = "备注")
    private String beizhu;

    /** 默认值 */
    @Excel(name = "默认值")
    private String devzhi;

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
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setFields(String fields) 
    {
        this.fields = fields;
    }

    public String getFields() 
    {
        return fields;
    }
    public void setGongsi(String gongsi) 
    {
        this.gongsi = gongsi;
    }

    public String getGongsi() 
    {
        return gongsi;
    }
    public void setTypes(Integer types)
    {
        this.types = types;
    }

    public Integer getTypes()
    {
        return types;
    }
    public void setBeizhu(String beizhu) 
    {
        this.beizhu = beizhu;
    }

    public String getBeizhu() 
    {
        return beizhu;
    }
    public void setDevzhi(String devzhi) 
    {
        this.devzhi = devzhi;
    }

    public String getDevzhi() 
    {
        return devzhi;
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
            .append("name", getName())
            .append("fields", getFields())
            .append("gongsi", getGongsi())
            .append("types", getTypes())
            .append("beizhu", getBeizhu())
            .append("devzhi", getDevzhi())
            .append("comid", getComid())
            .toString();
    }
}
