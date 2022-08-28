package com.vrmlstudio.hr.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * IM会话对象 xinhu_im_group
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuImGroup extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 对应上级 */
    @Excel(name = "对应上级")
    private Integer pid;

    /** 应用分类 */
    @Excel(name = "应用分类")
    private String types;

    /** 类型@0|群,1|讨论组,2|应用 */
    @Excel(name = "类型@0|群,1|讨论组,2|应用")
    private Integer ctype;

    /** 排序号 */
    @Excel(name = "排序号")
    private Integer sort;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long createid;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createname;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdt;

    /** 头像 */
    @Excel(name = "头像")
    private String face;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String num;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String receid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String recename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String url;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer valid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** 对应字体图标 */
    @Excel(name = "对应字体图标")
    private String iconfont;

    /** 字体图标颜色 */
    @Excel(name = "字体图标颜色")
    private String iconcolor;

    /** 应用类型0全部,1pc,2手机 */
    @Excel(name = "应用类型0全部,1pc,2手机")
    private Integer yylx;

    /** 应用上PC地址 */
    @Excel(name = "应用上PC地址")
    private String urlpc;

    /** 应用上手机端地址 */
    @Excel(name = "应用上手机端地址")
    private String urlm;

    /** 对应部门id */
    @Excel(name = "对应部门id")
    private String deptid;

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
    public void setType(Integer ctype)
    {
        this.ctype = ctype;
    }

    public Integer getType() 
    {
        return ctype;
    }
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
    }
    public void setCreateid(Long createid) 
    {
        this.createid = createid;
    }

    public Long getCreateid() 
    {
        return createid;
    }
    public void setCreatename(String createname) 
    {
        this.createname = createname;
    }

    public String getCreatename() 
    {
        return createname;
    }
    public void setCreatedt(Date createdt) 
    {
        this.createdt = createdt;
    }

    public Date getCreatedt() 
    {
        return createdt;
    }
    public void setFace(String face) 
    {
        this.face = face;
    }

    public String getFace() 
    {
        return face;
    }
    public void setNum(String num) 
    {
        this.num = num;
    }

    public String getNum() 
    {
        return num;
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
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }
    public void setValid(Integer valid) 
    {
        this.valid = valid;
    }

    public Integer getValid() 
    {
        return valid;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setIconfont(String iconfont) 
    {
        this.iconfont = iconfont;
    }

    public String getIconfont() 
    {
        return iconfont;
    }
    public void setIconcolor(String iconcolor) 
    {
        this.iconcolor = iconcolor;
    }

    public String getIconcolor() 
    {
        return iconcolor;
    }
    public void setYylx(Integer yylx) 
    {
        this.yylx = yylx;
    }

    public Integer getYylx() 
    {
        return yylx;
    }
    public void setUrlpc(String urlpc) 
    {
        this.urlpc = urlpc;
    }

    public String getUrlpc() 
    {
        return urlpc;
    }
    public void setUrlm(String urlm) 
    {
        this.urlm = urlm;
    }

    public String getUrlm() 
    {
        return urlm;
    }
    public void setDeptid(String deptid) 
    {
        this.deptid = deptid;
    }

    public String getDeptid() 
    {
        return deptid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("pid", getPid())
            .append("types", getTypes())
            .append("ctype", getType())
            .append("sort", getSort())
            .append("createid", getCreateid())
            .append("createname", getCreatename())
            .append("createdt", getCreatedt())
            .append("face", getFace())
            .append("num", getNum())
            .append("receid", getReceid())
            .append("recename", getRecename())
            .append("url", getUrl())
            .append("valid", getValid())
            .append("content", getContent())
            .append("iconfont", getIconfont())
            .append("iconcolor", getIconcolor())
            .append("yylx", getYylx())
            .append("urlpc", getUrlpc())
            .append("urlm", getUrlm())
            .append("deptid", getDeptid())
            .toString();
    }
}
