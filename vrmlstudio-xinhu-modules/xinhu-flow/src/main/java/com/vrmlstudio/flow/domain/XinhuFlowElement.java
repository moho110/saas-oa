package com.vrmlstudio.flow.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 模块元素对象 xinhu_flow_element
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuFlowElement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer mid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** 对应字段 */
    @Excel(name = "对应字段")
    private String fields;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fieldstype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer sort;

    /** 默认值 */
    @Excel(name = "默认值")
    private String dev;

    /** 是否必填 */
    @Excel(name = "是否必填")
    private Integer isbt;

    /** 数据源 */
    @Excel(name = "数据源")
    private String data;

    /** 是否录入元素 */
    @Excel(name = "是否录入元素")
    private Integer islu;

    /** 是否列表展示 */
    @Excel(name = "是否列表展示")
    private Integer iszs;

    /** 属性 */
    @Excel(name = "属性")
    private String attr;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer iszb;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer isss;

    /** 列属性 */
    @Excel(name = "列属性")
    private String lattr;

    /** 列宽 */
    @Excel(name = "列宽")
    private String width;

    /** 字段长度 */
    @Excel(name = "字段长度")
    private Integer lens;

    /** 保存条件 */
    @Excel(name = "保存条件")
    private String savewhere;

    /** 是否列表列 */
    @Excel(name = "是否列表列")
    private Integer islb;

    /** 是否可排序 */
    @Excel(name = "是否可排序")
    private Integer ispx;

    /** 0居中,1居左,2居右 */
    @Excel(name = "0居中,1居左,2居右")
    private Integer isalign;

    /** 是否可搜索 */
    @Excel(name = "是否可搜索")
    private Integer issou;

    /** 是否可统计 */
    @Excel(name = "是否可统计")
    private Integer istj;

    /** 计算公式 */
    @Excel(name = "计算公式")
    private String gongsi;

    /** 提示内容 */
    @Excel(name = "提示内容")
    private String placeholder;

    /** 是否唯一 */
    @Excel(name = "是否唯一")
    private Integer isonly;

    /** 是否导入字段 */
    @Excel(name = "是否导入字段")
    private Integer isdr;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMid(Integer mid) 
    {
        this.mid = mid;
    }

    public Integer getMid() 
    {
        return mid;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setFields(String fields) 
    {
        this.fields = fields;
    }

    public String getFields() 
    {
        return fields;
    }
    public void setFieldstype(String fieldstype) 
    {
        this.fieldstype = fieldstype;
    }

    public String getFieldstype() 
    {
        return fieldstype;
    }
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
    }
    public void setDev(String dev) 
    {
        this.dev = dev;
    }

    public String getDev() 
    {
        return dev;
    }
    public void setIsbt(Integer isbt) 
    {
        this.isbt = isbt;
    }

    public Integer getIsbt() 
    {
        return isbt;
    }
    public void setData(String data) 
    {
        this.data = data;
    }

    public String getData() 
    {
        return data;
    }
    public void setIslu(Integer islu) 
    {
        this.islu = islu;
    }

    public Integer getIslu() 
    {
        return islu;
    }
    public void setIszs(Integer iszs) 
    {
        this.iszs = iszs;
    }

    public Integer getIszs() 
    {
        return iszs;
    }
    public void setAttr(String attr) 
    {
        this.attr = attr;
    }

    public String getAttr() 
    {
        return attr;
    }
    public void setIszb(Integer iszb) 
    {
        this.iszb = iszb;
    }

    public Integer getIszb() 
    {
        return iszb;
    }
    public void setIsss(Integer isss) 
    {
        this.isss = isss;
    }

    public Integer getIsss() 
    {
        return isss;
    }
    public void setLattr(String lattr) 
    {
        this.lattr = lattr;
    }

    public String getLattr() 
    {
        return lattr;
    }
    public void setWidth(String width) 
    {
        this.width = width;
    }

    public String getWidth() 
    {
        return width;
    }
    public void setLens(Integer lens) 
    {
        this.lens = lens;
    }

    public Integer getLens() 
    {
        return lens;
    }
    public void setSavewhere(String savewhere) 
    {
        this.savewhere = savewhere;
    }

    public String getSavewhere() 
    {
        return savewhere;
    }
    public void setIslb(Integer islb) 
    {
        this.islb = islb;
    }

    public Integer getIslb() 
    {
        return islb;
    }
    public void setIspx(Integer ispx) 
    {
        this.ispx = ispx;
    }

    public Integer getIspx() 
    {
        return ispx;
    }
    public void setIsalign(Integer isalign) 
    {
        this.isalign = isalign;
    }

    public Integer getIsalign() 
    {
        return isalign;
    }
    public void setIssou(Integer issou) 
    {
        this.issou = issou;
    }

    public Integer getIssou() 
    {
        return issou;
    }
    public void setIstj(Integer istj) 
    {
        this.istj = istj;
    }

    public Integer getIstj() 
    {
        return istj;
    }
    public void setGongsi(String gongsi) 
    {
        this.gongsi = gongsi;
    }

    public String getGongsi() 
    {
        return gongsi;
    }
    public void setPlaceholder(String placeholder) 
    {
        this.placeholder = placeholder;
    }

    public String getPlaceholder() 
    {
        return placeholder;
    }
    public void setIsonly(Integer isonly) 
    {
        this.isonly = isonly;
    }

    public Integer getIsonly() 
    {
        return isonly;
    }
    public void setIsdr(Integer isdr) 
    {
        this.isdr = isdr;
    }

    public Integer getIsdr() 
    {
        return isdr;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("mid", getMid())
            .append("name", getName())
            .append("fields", getFields())
            .append("fieldstype", getFieldstype())
            .append("sort", getSort())
            .append("dev", getDev())
            .append("isbt", getIsbt())
            .append("data", getData())
            .append("islu", getIslu())
            .append("iszs", getIszs())
            .append("attr", getAttr())
            .append("iszb", getIszb())
            .append("isss", getIsss())
            .append("lattr", getLattr())
            .append("width", getWidth())
            .append("lens", getLens())
            .append("savewhere", getSavewhere())
            .append("islb", getIslb())
            .append("ispx", getIspx())
            .append("isalign", getIsalign())
            .append("issou", getIssou())
            .append("istj", getIstj())
            .append("gongsi", getGongsi())
            .append("placeholder", getPlaceholder())
            .append("isonly", getIsonly())
            .append("isdr", getIsdr())
            .toString();
    }
}
