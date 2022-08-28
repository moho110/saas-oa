package com.vrmlstudio.hr.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 考勤时间规则对象 xinhu_kqsjgz
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuKqsjgz extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 排序号 */
    @Excel(name = "排序号")
    private Integer sort;

    /** 主 */
    @Excel(name = "主")
    private Integer pid;

    /** 开始时间 */
    @Excel(name = "开始时间")
    private String stime;

    /** 结束时间 */
    @Excel(name = "结束时间")
    private String etime;

    /** 取值类型@0|最小值,1|最大值 */
    @Excel(name = "取值类型@0|最小值,1|最大值")
    private Integer qtype;

    /** 是否跨天 */
    @Excel(name = "是否跨天")
    private Integer iskt;

    /** 是否需要考勤 */
    @Excel(name = "是否需要考勤")
    private Integer iskq;

    /** 是否休息断 */
    @Excel(name = "是否休息断")
    private Integer isxx;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
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
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
    }
    public void setPid(Integer pid) 
    {
        this.pid = pid;
    }

    public Integer getPid() 
    {
        return pid;
    }
    public void setStime(String stime) 
    {
        this.stime = stime;
    }

    public String getStime() 
    {
        return stime;
    }
    public void setEtime(String etime) 
    {
        this.etime = etime;
    }

    public String getEtime() 
    {
        return etime;
    }
    public void setQtype(Integer qtype) 
    {
        this.qtype = qtype;
    }

    public Integer getQtype() 
    {
        return qtype;
    }
    public void setIskt(Integer iskt) 
    {
        this.iskt = iskt;
    }

    public Integer getIskt() 
    {
        return iskt;
    }
    public void setIskq(Integer iskq) 
    {
        this.iskq = iskq;
    }

    public Integer getIskq() 
    {
        return iskq;
    }
    public void setIsxx(Integer isxx) 
    {
        this.isxx = isxx;
    }

    public Integer getIsxx() 
    {
        return isxx;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("sort", getSort())
            .append("pid", getPid())
            .append("stime", getStime())
            .append("etime", getEtime())
            .append("qtype", getQtype())
            .append("iskt", getIskt())
            .append("iskq", getIskq())
            .append("isxx", getIsxx())
            .toString();
    }
}
