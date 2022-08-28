package com.vrmlstudio.document.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 印章对象 xinhu_seal
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuSeal extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 印章名称 */
    @Excel(name = "印章名称")
    private String name;

    /** 印章类型 */
    @Excel(name = "印章类型")
    private String types;

    /** 保管人 */
    @Excel(name = "保管人")
    private String bgname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String bgid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 排序号 */
    @Excel(name = "排序号")
    private Integer sort;

    /** 对应印章图片 */
    @Excel(name = "对应印章图片")
    private String sealimg;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** 签发日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "签发日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startdt;

    /** 截止日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "截止日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date enddt;

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
    public void setType(String types)
    {
        this.types = types;
    }

    public String getType() 
    {
        return types;
    }
    public void setBgname(String bgname) 
    {
        this.bgname = bgname;
    }

    public String getBgname() 
    {
        return bgname;
    }
    public void setBgid(String bgid) 
    {
        this.bgid = bgid;
    }

    public String getBgid() 
    {
        return bgid;
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
    public void setSealimg(String sealimg) 
    {
        this.sealimg = sealimg;
    }

    public String getSealimg() 
    {
        return sealimg;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setStartdt(Date startdt) 
    {
        this.startdt = startdt;
    }

    public Date getStartdt() 
    {
        return startdt;
    }
    public void setEnddt(Date enddt) 
    {
        this.enddt = enddt;
    }

    public Date getEnddt() 
    {
        return enddt;
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
            .append("types", getType())
            .append("bgname", getBgname())
            .append("bgid", getBgid())
            .append("optdt", getOptdt())
            .append("sort", getSort())
            .append("sealimg", getSealimg())
            .append("content", getContent())
            .append("startdt", getStartdt())
            .append("enddt", getEnddt())
            .append("comid", getComid())
            .toString();
    }
}
