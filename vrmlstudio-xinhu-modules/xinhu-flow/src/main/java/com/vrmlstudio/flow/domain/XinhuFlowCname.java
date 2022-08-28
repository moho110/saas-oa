package com.vrmlstudio.flow.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 自定义审核人组对象 xinhu_flow_cname
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuFlowCname extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 编号 */
    @Excel(name = "编号")
    private String num;

    /** 审核组名 */
    @Excel(name = "审核组名")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String checkid;

    /** 审核人 */
    @Excel(name = "审核人")
    private String checkname;

    /** 上级ID */
    @Excel(name = "上级ID")
    private Long pid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String receid;

    /** 适用对象 */
    @Excel(name = "适用对象")
    private String recename;

    /** 排序号 */
    @Excel(name = "排序号")
    private Integer sort;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
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
    public void setCheckid(String checkid) 
    {
        this.checkid = checkid;
    }

    public String getCheckid() 
    {
        return checkid;
    }
    public void setCheckname(String checkname) 
    {
        this.checkname = checkname;
    }

    public String getCheckname() 
    {
        return checkname;
    }
    public void setPid(Long pid) 
    {
        this.pid = pid;
    }

    public Long getPid() 
    {
        return pid;
    }
    public void setReceid(String receid) 
    {
        this.receid = receid;
    }

    public String getReceid() 
    {
        return receid;
    }
    public void setRecename(String recename) 
    {
        this.recename = recename;
    }

    public String getRecename() 
    {
        return recename;
    }
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("num", getNum())
            .append("name", getName())
            .append("checkid", getCheckid())
            .append("checkname", getCheckname())
            .append("pid", getPid())
            .append("receid", getReceid())
            .append("recename", getRecename())
            .append("sort", getSort())
            .toString();
    }
}
