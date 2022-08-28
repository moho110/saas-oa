package com.vrmlstudio.police.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 物品仓库对象 xinhu_godepot
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuGodepot extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 仓库名称 */
    @Excel(name = "仓库名称")
    private String depotname;

    /** 仓库地址 */
    @Excel(name = "仓库地址")
    private String depotaddress;

    /** 仓库管理员 */
    @Excel(name = "仓库管理员")
    private String cgname;

    /** 仓库管理员的ID */
    @Excel(name = "仓库管理员的ID")
    private String cgid;

    /** 说明 */
    @Excel(name = "说明")
    private String depotcontent;

    /** 排序号 */
    @Excel(name = "排序号")
    private Integer sort;

    /** 仓库编号 */
    @Excel(name = "仓库编号")
    private String depotnum;

    /** 物品数 */
    @Excel(name = "物品数")
    private Long wpshu;

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
    public void setDepotname(String depotname) 
    {
        this.depotname = depotname;
    }

    public String getDepotname() 
    {
        return depotname;
    }
    public void setDepotaddress(String depotaddress) 
    {
        this.depotaddress = depotaddress;
    }

    public String getDepotaddress() 
    {
        return depotaddress;
    }
    public void setCgname(String cgname) 
    {
        this.cgname = cgname;
    }

    public String getCgname() 
    {
        return cgname;
    }
    public void setCgid(String cgid) 
    {
        this.cgid = cgid;
    }

    public String getCgid() 
    {
        return cgid;
    }
    public void setDepotcontent(String depotcontent)
    {
        this.depotcontent = depotcontent;
    }

    public String getDepotcontent()
    {
        return depotcontent;
    }
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
    }
    public void setDepotnum(String depotnum) 
    {
        this.depotnum = depotnum;
    }

    public String getDepotnum() 
    {
        return depotnum;
    }
    public void setWpshu(Long wpshu) 
    {
        this.wpshu = wpshu;
    }

    public Long getWpshu() 
    {
        return wpshu;
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
            .append("depotname", getDepotname())
            .append("depotaddress", getDepotaddress())
            .append("cgname", getCgname())
            .append("cgid", getCgid())
            .append("depotcontent", getDepotcontent())
            .append("sort", getSort())
            .append("depotnum", getDepotnum())
            .append("wpshu", getWpshu())
            .append("comid", getComid())
            .toString();
    }
}
