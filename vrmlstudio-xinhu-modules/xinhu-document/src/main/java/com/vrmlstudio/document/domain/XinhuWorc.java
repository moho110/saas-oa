package com.vrmlstudio.document.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 文档分区对象 xinhu_worc
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuWorc extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 文档分区名称 */
    @Excel(name = "文档分区名称")
    private String name;

    /** 可查看人员 */
    @Excel(name = "可查看人员")
    private String recename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String receid;

    /** 排序号 */
    @Excel(name = "排序号")
    private Integer sort;

    /** 管理人员 */
    @Excel(name = "管理人员")
    private String guanname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String guanid;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** 所属用户 */
    @Excel(name = "所属用户")
    private Long uid;

    /** 创建人 */
    @Excel(name = "创建人")
    private String optname;

    /** 限制上传类型 */
    @Excel(name = "限制上传类型")
    private String uptype;

    /** 可上传人员ID */
    @Excel(name = "可上传人员ID")
    private String upuserid;

    /** 可上传人员 */
    @Excel(name = "可上传人员")
    private String upuser;

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
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
    }
    public void setGuanname(String guanname) 
    {
        this.guanname = guanname;
    }

    public String getGuanname() 
    {
        return guanname;
    }
    public void setGuanid(String guanid) 
    {
        this.guanid = guanid;
    }

    public String getGuanid() 
    {
        return guanid;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setOptname(String optname) 
    {
        this.optname = optname;
    }

    public String getOptname() 
    {
        return optname;
    }
    public void setUptype(String uptype) 
    {
        this.uptype = uptype;
    }

    public String getUptype() 
    {
        return uptype;
    }
    public void setUpuserid(String upuserid) 
    {
        this.upuserid = upuserid;
    }

    public String getUpuserid() 
    {
        return upuserid;
    }
    public void setUpuser(String upuser) 
    {
        this.upuser = upuser;
    }

    public String getUpuser() 
    {
        return upuser;
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
            .append("recename", getRecename())
            .append("receid", getReceid())
            .append("sort", getSort())
            .append("guanname", getGuanname())
            .append("guanid", getGuanid())
            .append("optdt", getOptdt())
            .append("uid", getUid())
            .append("optname", getOptname())
            .append("uptype", getUptype())
            .append("upuserid", getUpuserid())
            .append("upuser", getUpuser())
            .append("comid", getComid())
            .toString();
    }
}
