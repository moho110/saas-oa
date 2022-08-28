package com.vrmlstudio.resources.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 计划任务对象 xinhu_task
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuTask extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** 类型分类 */
    @Excel(name = "类型分类")
    private String fenlei;

    /** 运行地址 */
    @Excel(name = "运行地址")
    private String url;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String type;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String time;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ratecont;

    /** 是否启用 */
    @Excel(name = "是否启用")
    private Integer status;

    /** 最后状态 */
    @Excel(name = "最后状态")
    private Integer state;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date lastdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer sort;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String lastcont;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String todoid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String todoname;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
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
    public void setFenlei(String fenlei) 
    {
        this.fenlei = fenlei;
    }

    public String getFenlei() 
    {
        return fenlei;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setTime(String time) 
    {
        this.time = time;
    }

    public String getTime() 
    {
        return time;
    }
    public void setRatecont(String ratecont) 
    {
        this.ratecont = ratecont;
    }

    public String getRatecont() 
    {
        return ratecont;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setState(Integer state) 
    {
        this.state = state;
    }

    public Integer getState() 
    {
        return state;
    }
    public void setLastdt(Date lastdt) 
    {
        this.lastdt = lastdt;
    }

    public Date getLastdt() 
    {
        return lastdt;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
    }
    public void setStartdt(Date startdt) 
    {
        this.startdt = startdt;
    }

    public Date getStartdt() 
    {
        return startdt;
    }
    public void setLastcont(String lastcont) 
    {
        this.lastcont = lastcont;
    }

    public String getLastcont() 
    {
        return lastcont;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setTodoid(String todoid) 
    {
        this.todoid = todoid;
    }

    public String getTodoid() 
    {
        return todoid;
    }
    public void setTodoname(String todoname) 
    {
        this.todoname = todoname;
    }

    public String getTodoname() 
    {
        return todoname;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("fenlei", getFenlei())
            .append("url", getUrl())
            .append("type", getType())
            .append("time", getTime())
            .append("ratecont", getRatecont())
            .append("status", getStatus())
            .append("state", getState())
            .append("lastdt", getLastdt())
            .append("optdt", getOptdt())
            .append("sort", getSort())
            .append("startdt", getStartdt())
            .append("lastcont", getLastcont())
            .append("content", getContent())
            .append("todoid", getTodoid())
            .append("todoname", getTodoname())
            .toString();
    }
}
