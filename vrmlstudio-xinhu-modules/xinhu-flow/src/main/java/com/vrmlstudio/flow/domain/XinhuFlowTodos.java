package com.vrmlstudio.flow.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 单据通知给对应人员对象 xinhu_flow_todos
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuFlowTodos extends BaseEntity
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

    /** 添加时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "添加时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date adddt;

    /** 已读时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "已读时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date readdt;

    /** 是否已读 */
    @Excel(name = "是否已读")
    private Integer isread;

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
    public void setAdddt(Date adddt) 
    {
        this.adddt = adddt;
    }

    public Date getAdddt() 
    {
        return adddt;
    }
    public void setReaddt(Date readdt) 
    {
        this.readdt = readdt;
    }

    public Date getReaddt() 
    {
        return readdt;
    }
    public void setIsread(Integer isread) 
    {
        this.isread = isread;
    }

    public Integer getIsread() 
    {
        return isread;
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
            .append("adddt", getAdddt())
            .append("readdt", getReaddt())
            .append("isread", getIsread())
            .toString();
    }
}
