package com.vrmlstudio.xsystem.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 系统选项对象 xinhu_option
 * 
 * @author VRer
 * @date 2022-02-20
 */
public class XinhuOption extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 选项类型 */
    @Excel(name = "选项类型")
    private Long types;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long pid;

    /** 编号 */
    @Excel(name = "编号")
    private String num;

    /** 对应值 */
    @Excel(name = "对应值")
    private String avalue;

    /** 排序号 */
    @Excel(name = "排序号")
    private Integer sort;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String valuess;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer avalid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer optid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String receid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String recename;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** 所属单位id */
    @Excel(name = "所属单位id")
    private Integer comid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setTypes(Long type)
    {
        this.types = types;
    }

    public Long getTypes()
    {
        return types;
    }
    public void setPid(Long pid) 
    {
        this.pid = pid;
    }

    public Long getPid() 
    {
        return pid;
    }
    public void setNum(String num) 
    {
        this.num = num;
    }

    public String getNum() 
    {
        return num;
    }
    public void setAvalue(String avalue)
    {
        this.avalue = avalue;
    }

    public String getAvalue()
    {
        return avalue;
    }
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
    }
    public void setValuess(String valuess)
    {
        this.valuess = valuess;
    }

    public String getValuess()
    {
        return valuess;
    }
    public void setAvalids(Integer Avalid)
    {
        this.avalid = avalid;
    }

    public Integer getAvalid()
    {
        return avalid;
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
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
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
            .append("name", getName())
            .append("types", getTypes())
            .append("pid", getPid())
            .append("num", getNum())
            .append("avalue", getAvalue())
            .append("sort", getSort())
            .append("valuess", getValuess())
            .append("avalid", getAvalid())
            .append("optdt", getOptdt())
            .append("optid", getOptid())
            .append("receid", getReceid())
            .append("recename", getRecename())
            .append("Content", getContent())
            .append("comid", getComid())
            .toString();
    }
}
