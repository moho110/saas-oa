package com.vrmlstudio.person.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 系统菜单对象 xinhu_menu
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuMenu extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 菜单名 */
    @Excel(name = "菜单名")
    private String name;

    /** 上级id */
    @Excel(name = "上级id")
    private Integer pid;

    /** 排序 */
    @Excel(name = "排序")
    private Integer sorts;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String url;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String icons;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 编号 */
    @Excel(name = "编号")
    private String num;

    /** 1验证 */
    @Excel(name = "1验证")
    private Integer ispir;

    /** 1启用 */
    @Excel(name = "1启用")
    private Integer status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String color;

    /** 是否在首页显示 */
    @Excel(name = "是否在首页显示")
    private Integer ishs;

    /** 是否为桌面版图标 */
    @Excel(name = "是否为桌面版图标")
    private Integer iszm;

    /** 菜单类型 */
    @Excel(name = "菜单类型")
    private Integer ctype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer types;

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
    public void setPid(Integer pid) 
    {
        this.pid = pid;
    }

    public Integer getPid() 
    {
        return pid;
    }
    public void setSorts(Integer sorts) 
    {
        this.sorts = sorts;
    }

    public Integer getSorts() 
    {
        return sorts;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }
    public void setIcons(String icons) 
    {
        this.icons = icons;
    }

    public String getIcons() 
    {
        return icons;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setNum(String num) 
    {
        this.num = num;
    }

    public String getNum() 
    {
        return num;
    }
    public void setIspir(Integer ispir) 
    {
        this.ispir = ispir;
    }

    public Integer getIspir() 
    {
        return ispir;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setColor(String color) 
    {
        this.color = color;
    }

    public String getColor() 
    {
        return color;
    }
    public void setIshs(Integer ishs) 
    {
        this.ishs = ishs;
    }

    public Integer getIshs() 
    {
        return ishs;
    }
    public void setIszm(Integer iszm) 
    {
        this.iszm = iszm;
    }

    public Integer getIszm() 
    {
        return iszm;
    }
    public void setCtype(Integer ctype)
    {
        this.ctype = ctype;
    }

    public Integer getCtype()
    {
        return ctype;
    }
    public void setTypes(Integer types) 
    {
        this.types = types;
    }

    public Integer getTypes() 
    {
        return types;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("pid", getPid())
            .append("sorts", getSorts())
            .append("url", getUrl())
            .append("icons", getIcons())
            .append("optdt", getOptdt())
            .append("num", getNum())
            .append("ispir", getIspir())
            .append("status", getStatus())
            .append("color", getColor())
            .append("ishs", getIshs())
            .append("iszm", getIszm())
            .append("ctype", getCtype())
            .append("types", getTypes())
            .toString();
    }
}
