package com.vrmlstudio.resources.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 项目对象 xinhu_project
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuProject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer pid;

    /** 项目类型 */
    @Excel(name = "项目类型")
    private String types;

    /** 编号 */
    @Excel(name = "编号")
    private String num;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String title;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startdt;

    /** 预计结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预计结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date enddt;

    /** 负责人 */
    @Excel(name = "负责人")
    private String fuze;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fuzeid;

    /** 执行人员 */
    @Excel(name = "执行人员")
    private String runuser;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String runuserid;

    /** 进度 */
    @Excel(name = "进度")
    private Integer progress;

    /** 授权查看 */
    @Excel(name = "授权查看")
    private String viewuser;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String viewuserid;

    /** 说明备注 */
    @Excel(name = "说明备注")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer optid;

    /** 操作人 */
    @Excel(name = "操作人")
    private String optname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 添加时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "添加时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date adddt;

    /** 排序 */
    @Excel(name = "排序")
    private Integer sort;

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
    public void setPid(Integer pid) 
    {
        this.pid = pid;
    }

    public Integer getPid() 
    {
        return pid;
    }
    public void setTypes(String types)
    {
        this.types = types;
    }

    public String getTypes()
    {
        return types;
    }
    public void setNum(String num) 
    {
        this.num = num;
    }

    public String getNum() 
    {
        return num;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
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
    public void setFuze(String fuze) 
    {
        this.fuze = fuze;
    }

    public String getFuze() 
    {
        return fuze;
    }
    public void setFuzeid(String fuzeid) 
    {
        this.fuzeid = fuzeid;
    }

    public String getFuzeid() 
    {
        return fuzeid;
    }
    public void setRunuser(String runuser) 
    {
        this.runuser = runuser;
    }

    public String getRunuser() 
    {
        return runuser;
    }
    public void setRunuserid(String runuserid) 
    {
        this.runuserid = runuserid;
    }

    public String getRunuserid() 
    {
        return runuserid;
    }
    public void setProgress(Integer progress) 
    {
        this.progress = progress;
    }

    public Integer getProgress() 
    {
        return progress;
    }
    public void setViewuser(String viewuser) 
    {
        this.viewuser = viewuser;
    }

    public String getViewuser() 
    {
        return viewuser;
    }
    public void setViewuserid(String viewuserid) 
    {
        this.viewuserid = viewuserid;
    }

    public String getViewuserid() 
    {
        return viewuserid;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setOptid(Integer optid) 
    {
        this.optid = optid;
    }

    public Integer getOptid() 
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
    public void setAdddt(Date adddt) 
    {
        this.adddt = adddt;
    }

    public Date getAdddt() 
    {
        return adddt;
    }
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
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
            .append("pid", getPid())
            .append("types", getTypes())
            .append("num", getNum())
            .append("status", getStatus())
            .append("title", getTitle())
            .append("startdt", getStartdt())
            .append("enddt", getEnddt())
            .append("fuze", getFuze())
            .append("fuzeid", getFuzeid())
            .append("runuser", getRunuser())
            .append("runuserid", getRunuserid())
            .append("progress", getProgress())
            .append("viewuser", getViewuser())
            .append("viewuserid", getViewuserid())
            .append("content", getContent())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("optdt", getOptdt())
            .append("adddt", getAdddt())
            .append("sort", getSort())
            .append("comid", getComid())
            .toString();
    }
}
