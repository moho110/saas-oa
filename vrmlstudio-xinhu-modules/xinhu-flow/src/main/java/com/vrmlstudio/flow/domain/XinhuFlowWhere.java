package com.vrmlstudio.flow.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 单据条件对象 xinhu_flow_where
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuFlowWhere extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 对应模块 */
    @Excel(name = "对应模块")
    private Integer setid;

    /** 编号 */
    @Excel(name = "编号")
    private String num;

    /** 编号分组 */
    @Excel(name = "编号分组")
    private String pnum;

    /** 条件名称 */
    @Excel(name = "条件名称")
    private String name;

    /** 对应表条件 */
    @Excel(name = "对应表条件")
    private String wheresstr;

    /** 用户条件 */
    @Excel(name = "用户条件")
    private String whereustr;

    /** 对应部门条件 */
    @Excel(name = "对应部门条件")
    private String wheredstr;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer sort;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String receid;

    /** 包含用户 */
    @Excel(name = "包含用户")
    private String recename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String nreceid;

    /** 不包含用户 */
    @Excel(name = "不包含用户")
    private String nrecename;

    /** 是否在生成列表页面上显示 */
    @Excel(name = "是否在生成列表页面上显示")
    private Integer islb;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String syrid;

    /** 此条件可适用对象 */
    @Excel(name = "此条件可适用对象")
    private String syrname;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
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
    public void setNum(String num) 
    {
        this.num = num;
    }

    public String getNum() 
    {
        return num;
    }
    public void setPnum(String pnum) 
    {
        this.pnum = pnum;
    }

    public String getPnum() 
    {
        return pnum;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setWheresstr(String wheresstr) 
    {
        this.wheresstr = wheresstr;
    }

    public String getWheresstr() 
    {
        return wheresstr;
    }
    public void setWhereustr(String whereustr) 
    {
        this.whereustr = whereustr;
    }

    public String getWhereustr() 
    {
        return whereustr;
    }
    public void setWheredstr(String wheredstr) 
    {
        this.wheredstr = wheredstr;
    }

    public String getWheredstr() 
    {
        return wheredstr;
    }
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
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
    public void setNreceid(String nreceid) 
    {
        this.nreceid = nreceid;
    }

    public String getNreceid() 
    {
        return nreceid;
    }
    public void setNrecename(String nrecename) 
    {
        this.nrecename = nrecename;
    }

    public String getNrecename() 
    {
        return nrecename;
    }
    public void setIslb(Integer islb) 
    {
        this.islb = islb;
    }

    public Integer getIslb() 
    {
        return islb;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setSyrid(String syrid) 
    {
        this.syrid = syrid;
    }

    public String getSyrid() 
    {
        return syrid;
    }
    public void setSyrname(String syrname) 
    {
        this.syrname = syrname;
    }

    public String getSyrname() 
    {
        return syrname;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("setid", getSetid())
            .append("num", getNum())
            .append("pnum", getPnum())
            .append("name", getName())
            .append("wheresstr", getWheresstr())
            .append("whereustr", getWhereustr())
            .append("wheredstr", getWheredstr())
            .append("sort", getSort())
            .append("content", getContent())
            .append("receid", getReceid())
            .append("recename", getRecename())
            .append("nreceid", getNreceid())
            .append("nrecename", getNrecename())
            .append("islb", getIslb())
            .append("status", getStatus())
            .append("syrid", getSyrid())
            .append("syrname", getSyrname())
            .toString();
    }
}
