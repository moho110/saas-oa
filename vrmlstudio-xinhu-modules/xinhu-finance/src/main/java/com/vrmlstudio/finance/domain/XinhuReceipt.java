package com.vrmlstudio.finance.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 回执确认对象 xinhu_receipt
 * 
 * @author VRer
 * @date 2022-02-20
 */
public class XinhuReceipt extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 对应模块编号 */
    @Excel(name = "对应模块编号")
    private String modenum;

    /** 模块名称 */
    @Excel(name = "模块名称")
    private String modename;

    /** 对应主表 */
    @Excel(name = "对应主表")
    private String tables;

    /** 主表Id */
    @Excel(name = "主表Id")
    private Long mid;

    /** 对应人员 */
    @Excel(name = "对应人员")
    private Long uid;

    /** 发送给 */
    @Excel(name = "发送给")
    private String receid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String recename;

    /** 已确认人员Id */
    @Excel(name = "已确认人员Id")
    private String receids;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 总人数 */
    @Excel(name = "总人数")
    private Long ushuz;

    /** 已确认 */
    @Excel(name = "已确认")
    private Long ushuy;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status;

    /** 操作人 */
    @Excel(name = "操作人")
    private String optname;

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
    public void setModenum(String modenum) 
    {
        this.modenum = modenum;
    }

    public String getModenum() 
    {
        return modenum;
    }
    public void setModename(String modename) 
    {
        this.modename = modename;
    }

    public String getModename() 
    {
        return modename;
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
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
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
    public void setReceids(String receids) 
    {
        this.receids = receids;
    }

    public String getReceids() 
    {
        return receids;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setUshuz(Long ushuz) 
    {
        this.ushuz = ushuz;
    }

    public Long getUshuz() 
    {
        return ushuz;
    }
    public void setUshuy(Long ushuy) 
    {
        this.ushuy = ushuy;
    }

    public Long getUshuy() 
    {
        return ushuy;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setOptname(String optname) 
    {
        this.optname = optname;
    }

    public String getOptname() 
    {
        return optname;
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
            .append("modenum", getModenum())
            .append("modename", getModename())
            .append("tables", getTables())
            .append("mid", getMid())
            .append("uid", getUid())
            .append("receid", getReceid())
            .append("recename", getRecename())
            .append("receids", getReceids())
            .append("optdt", getOptdt())
            .append("content", getContent())
            .append("ushuz", getUshuz())
            .append("ushuy", getUshuy())
            .append("status", getStatus())
            .append("optname", getOptname())
            .append("comid", getComid())
            .toString();
    }
}
