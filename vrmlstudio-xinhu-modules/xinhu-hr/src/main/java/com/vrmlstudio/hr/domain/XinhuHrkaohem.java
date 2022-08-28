package com.vrmlstudio.hr.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 考核项目对象 xinhu_hrkaohem
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuHrkaohem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 考核名称 */
    @Excel(name = "考核名称")
    private String title;

    /** 开始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startdt;

    /** 截止日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "截止日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date enddt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String receid;

    /** 对应考核人 */
    @Excel(name = "对应考核人")
    private String recename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long optid;

    /** 操作人 */
    @Excel(name = "操作人")
    private String optname;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** 合格分数 */
    @Excel(name = "合格分数")
    private Integer hegfen;

    /** 最高分数 */
    @Excel(name = "最高分数")
    private Integer maxfen;

    /** 考核频率 */
    @Excel(name = "考核频率")
    private String pinlv;

    /** 生成时间 */
    @Excel(name = "生成时间")
    private String sctime;

    /** 评分时间(天) */
    @Excel(name = "评分时间(天)")
    private Integer pfsj;

    /** 是否启用 */
    @Excel(name = "是否启用")
    private Integer status;

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
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
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
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setHegfen(Integer hegfen) 
    {
        this.hegfen = hegfen;
    }

    public Integer getHegfen() 
    {
        return hegfen;
    }
    public void setMaxfen(Integer maxfen) 
    {
        this.maxfen = maxfen;
    }

    public Integer getMaxfen() 
    {
        return maxfen;
    }
    public void setPinlv(String pinlv) 
    {
        this.pinlv = pinlv;
    }

    public String getPinlv() 
    {
        return pinlv;
    }
    public void setSctime(String sctime) 
    {
        this.sctime = sctime;
    }

    public String getSctime() 
    {
        return sctime;
    }
    public void setPfsj(Integer pfsj) 
    {
        this.pfsj = pfsj;
    }

    public Integer getPfsj() 
    {
        return pfsj;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
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
            .append("title", getTitle())
            .append("startdt", getStartdt())
            .append("enddt", getEnddt())
            .append("receid", getReceid())
            .append("recename", getRecename())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("optdt", getOptdt())
            .append("hegfen", getHegfen())
            .append("maxfen", getMaxfen())
            .append("pinlv", getPinlv())
            .append("sctime", getSctime())
            .append("pfsj", getPfsj())
            .append("status", getStatus())
            .append("comid", getComid())
            .toString();
    }
}
