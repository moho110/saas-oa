package com.vrmlstudio.person.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.TreeEntity;

/**
 * 城市对象 xinhu_city
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuCity extends TreeEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 上级ＩＤ */
    @Excel(name = "上级ＩＤ")
    private Long pid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** 类型0国家,1省,2市,3县 */
    @Excel(name = "类型0国家,1省,2市,3县")
    private Integer types;

    /** 排序 */
    @Excel(name = "排序")
    private Integer sorts;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String pinyin;

    /** 拼音简称 */
    @Excel(name = "拼音简称")
    private String pinyins;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPid(Long pid) 
    {
        this.pid = pid;
    }

    public Long getPid() 
    {
        return pid;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setTypes(Integer types)
    {
        this.types = types;
    }

    public Integer getTypes()
    {
        return types;
    }
    public void setSorts(Integer sorts) 
    {
        this.sorts = sorts;
    }

    public Integer getSorts() 
    {
        return sorts;
    }
    public void setPinyin(String pinyin) 
    {
        this.pinyin = pinyin;
    }

    public String getPinyin() 
    {
        return pinyin;
    }
    public void setPinyins(String pinyins) 
    {
        this.pinyins = pinyins;
    }

    public String getPinyins() 
    {
        return pinyins;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("pid", getPid())
            .append("name", getName())
            .append("types", getTypes())
            .append("sorts", getSorts())
            .append("pinyin", getPinyin())
            .append("pinyins", getPinyins())
            .toString();
    }
}
