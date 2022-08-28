package com.vrmlstudio.flow.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 模块多模版设置对象 xinhu_flow_modetpl
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuFlowModetpl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 模块Id */
    @Excel(name = "模块Id")
    private Integer setid;

    /** 名称 */
    @Excel(name = "名称")
    private String tplname;

    /** 多模版编号 */
    @Excel(name = "多模版编号")
    private String tplnum;

    /** 录入字段 */
    @Excel(name = "录入字段")
    private String fieldsluru;

    /** 必填字段 */
    @Excel(name = "必填字段")
    private String fieldsbitian;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** 适用对象 */
    @Excel(name = "适用对象")
    private String recename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String receid;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long sort;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSetid(Integer setid) 
    {
        this.setid = setid;
    }

    public Integer getSetid() 
    {
        return setid;
    }
    public void setTplname(String tplname) 
    {
        this.tplname = tplname;
    }

    public String getTplname() 
    {
        return tplname;
    }
    public void setTplnum(String tplnum) 
    {
        this.tplnum = tplnum;
    }

    public String getTplnum() 
    {
        return tplnum;
    }
    public void setFieldsluru(String fieldsluru) 
    {
        this.fieldsluru = fieldsluru;
    }

    public String getFieldsluru() 
    {
        return fieldsluru;
    }
    public void setFieldsbitian(String fieldsbitian) 
    {
        this.fieldsbitian = fieldsbitian;
    }

    public String getFieldsbitian() 
    {
        return fieldsbitian;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
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
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("setid", getSetid())
            .append("tplname", getTplname())
            .append("tplnum", getTplnum())
            .append("fieldsluru", getFieldsluru())
            .append("fieldsbitian", getFieldsbitian())
            .append("content", getContent())
            .append("recename", getRecename())
            .append("receid", getReceid())
            .append("status", getStatus())
            .append("sort", getSort())
            .toString();
    }
}
