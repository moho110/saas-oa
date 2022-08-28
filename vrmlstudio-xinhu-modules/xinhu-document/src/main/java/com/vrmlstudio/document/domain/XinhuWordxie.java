package com.vrmlstudio.document.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 文档协作对象 xinhu_wordxie
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuWordxie extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 文档名称 */
    @Excel(name = "文档名称")
    private String name;

    /** 分类 */
    @Excel(name = "分类")
    private String fenlei;

    /** 文档类型 */
    @Excel(name = "文档类型")
    private String wtype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String optname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long optid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 协作人 */
    @Excel(name = "协作人")
    private String xiename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String xienameid;

    /** 可查看人 */
    @Excel(name = "可查看人")
    private String recename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String receid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long fileid;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** 对应单位id */
    @Excel(name = "对应单位id")
    private Integer comid;

    /** 是否可让他人选择 */
    @Excel(name = "是否可让他人选择")
    private Integer isgk;

    /** 模版中变量 */
    @Excel(name = "模版中变量")
    private String tplvar;

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
    public void setFenlei(String fenlei) 
    {
        this.fenlei = fenlei;
    }

    public String getFenlei() 
    {
        return fenlei;
    }
    public void setWtype(String wtype) 
    {
        this.wtype = wtype;
    }

    public String getWtype() 
    {
        return wtype;
    }
    public void setOptname(String optname) 
    {
        this.optname = optname;
    }

    public String getOptname() 
    {
        return optname;
    }
    public void setOptid(Long optid) 
    {
        this.optid = optid;
    }

    public Long getOptid() 
    {
        return optid;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setXiename(String xiename) 
    {
        this.xiename = xiename;
    }

    public String getXiename() 
    {
        return xiename;
    }
    public void setXienameid(String xienameid) 
    {
        this.xienameid = xienameid;
    }

    public String getXienameid() 
    {
        return xienameid;
    }
    public void setRecename(String recename) 
    {
        this.recename = recename;
    }

    public String getRecename() 
    {
        return recename;
    }
    public void setReceid(String receid) 
    {
        this.receid = receid;
    }

    public String getReceid() 
    {
        return receid;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setFileid(Long fileid) 
    {
        this.fileid = fileid;
    }

    public Long getFileid() 
    {
        return fileid;
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
    public void setIsgk(Integer isgk) 
    {
        this.isgk = isgk;
    }

    public Integer getIsgk() 
    {
        return isgk;
    }
    public void setTplvar(String tplvar) 
    {
        this.tplvar = tplvar;
    }

    public String getTplvar() 
    {
        return tplvar;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("fenlei", getFenlei())
            .append("wtype", getWtype())
            .append("optname", getOptname())
            .append("optid", getOptid())
            .append("optdt", getOptdt())
            .append("xiename", getXiename())
            .append("xienameid", getXienameid())
            .append("recename", getRecename())
            .append("receid", getReceid())
            .append("status", getStatus())
            .append("fileid", getFileid())
            .append("content", getContent())
            .append("comid", getComid())
            .append("isgk", getIsgk())
            .append("tplvar", getTplvar())
            .toString();
    }
}
