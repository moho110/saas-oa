package com.vrmlstudio.document.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 文档对象 xinhu_word
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuWord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long optid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String optname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long fileid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String shateid;

    /** 分享给我的 */
    @Excel(name = "分享给我的")
    private String shate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 对应类型 */
    @Excel(name = "对应类型")
    private Long typeid;

    /** 文档分区ID */
    @Excel(name = "文档分区ID")
    private Long cid;

    /** 0文件,1文件夹 */
    @Excel(name = "0文件,1文件夹")
    private Integer types;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long sort;

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
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setOptid(Long optid) 
    {
        this.optid = optid;
    }

    public Long getOptid() 
    {
        return optid;
    }
    public void setOptname(String optname) 
    {
        this.optname = optname;
    }

    public String getOptname() 
    {
        return optname;
    }
    public void setFileid(Long fileid) 
    {
        this.fileid = fileid;
    }

    public Long getFileid() 
    {
        return fileid;
    }
    public void setShateid(String shateid) 
    {
        this.shateid = shateid;
    }

    public String getShateid() 
    {
        return shateid;
    }
    public void setShate(String shate) 
    {
        this.shate = shate;
    }

    public String getShate() 
    {
        return shate;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setTypeid(Long typeid) 
    {
        this.typeid = typeid;
    }

    public Long getTypeid() 
    {
        return typeid;
    }
    public void setCid(Long cid) 
    {
        this.cid = cid;
    }

    public Long getCid() 
    {
        return cid;
    }
    public void setType(Integer types)
    {
        this.types = types;
    }

    public Integer getType() 
    {
        return types;
    }
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
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
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("fileid", getFileid())
            .append("shateid", getShateid())
            .append("shate", getShate())
            .append("optdt", getOptdt())
            .append("typeid", getTypeid())
            .append("cid", getCid())
            .append("types", getType())
            .append("sort", getSort())
            .append("comid", getComid())
            .toString();
    }
}
