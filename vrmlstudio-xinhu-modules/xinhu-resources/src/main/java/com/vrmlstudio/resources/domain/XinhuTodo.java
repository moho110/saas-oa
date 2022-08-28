package com.vrmlstudio.resources.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 提醒消息对象 xinhu_todo
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuTodo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer uid;

    /** 类型 */
    @Excel(name = "类型")
    private String title;

    /** 信息内容 */
    @Excel(name = "信息内容")
    private String mess;

    /** 状态@0|未读,1|已读 */
    @Excel(name = "状态@0|未读,1|已读")
    private Integer status;

    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String tables;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long mid;

    /** 已读时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "已读时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date readdt;

    /** 提醒时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "提醒时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date tododt;

    /** 对应模块编号 */
    @Excel(name = "对应模块编号")
    private String modenum;

    /** 相关url */
    @Excel(name = "相关url")
    private String url;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUid(Integer uid) 
    {
        this.uid = uid;
    }

    public Integer getUid() 
    {
        return uid;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setMess(String mess) 
    {
        this.mess = mess;
    }

    public String getMess() 
    {
        return mess;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setTables(String tables)
    {
        this.tables = tables;
    }

    public String getTables()
    {
        return tables;
    }
    public void setMid(Long mid) 
    {
        this.mid = mid;
    }

    public Long getMid() 
    {
        return mid;
    }
    public void setReaddt(Date readdt) 
    {
        this.readdt = readdt;
    }

    public Date getReaddt() 
    {
        return readdt;
    }
    public void setTododt(Date tododt) 
    {
        this.tododt = tododt;
    }

    public Date getTododt() 
    {
        return tododt;
    }
    public void setModenum(String modenum) 
    {
        this.modenum = modenum;
    }

    public String getModenum() 
    {
        return modenum;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("uid", getUid())
            .append("title", getTitle())
            .append("mess", getMess())
            .append("status", getStatus())
            .append("optdt", getOptdt())
            .append("tables", getTables())
            .append("mid", getMid())
            .append("readdt", getReaddt())
            .append("tododt", getTododt())
            .append("modenum", getModenum())
            .append("url", getUrl())
            .toString();
    }
}
