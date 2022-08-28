package com.vrmlstudio.resources.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 订阅内容信息对象 xinhu_subscribeinfo
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuSubscribeinfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 对应定ID */
    @Excel(name = "对应定ID")
    private Long mid;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 内容 */
    @Excel(name = "内容")
    private String cont;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 文件路径 */
    @Excel(name = "文件路径")
    private String filepath;

    /** 发送给 */
    @Excel(name = "发送给")
    private String receid;

    /** 对应人 */
    @Excel(name = "对应人")
    private String recename;

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
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setCont(String cont) 
    {
        this.cont = cont;
    }

    public String getCont() 
    {
        return cont;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setFilepath(String filepath) 
    {
        this.filepath = filepath;
    }

    public String getFilepath() 
    {
        return filepath;
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
            .append("title", getTitle())
            .append("cont", getCont())
            .append("optdt", getOptdt())
            .append("filepath", getFilepath())
            .append("receid", getReceid())
            .append("recename", getRecename())
            .append("comid", getComid())
            .toString();
    }
}
