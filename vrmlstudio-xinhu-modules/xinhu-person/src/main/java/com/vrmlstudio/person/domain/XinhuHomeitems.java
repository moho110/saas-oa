package com.vrmlstudio.person.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 桌面项目对象 xinhu_homeitems
 * 
 * @author VR爱好者
 * @date 2022-02-18
 */
public class XinhuHomeitems extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 编号 */
    @Excel(name = "编号")
    private String num;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String receid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String recename;

    /** 排序号 */
    @Excel(name = "排序号")
    private Integer sorts;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 所在位置 */
    @Excel(name = "所在位置")
    private Integer row;

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
    public void setNum(String num) 
    {
        this.num = num;
    }

    public String getNum() 
    {
        return num;
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
    public void setSorts(Integer sorts) 
    {
        this.sorts = sorts;
    }

    public Integer getSorts() 
    {
        return sorts;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setRow(Integer row) 
    {
        this.row = row;
    }

    public Integer getRow() 
    {
        return row;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("num", getNum())
            .append("receid", getReceid())
            .append("recename", getRecename())
            .append("sorts", getSorts())
            .append("status", getStatus())
            .append("row", getRow())
            .toString();
    }
}
