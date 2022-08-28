package com.vrmlstudio.person.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 图书对象 xinhu_book
 * 
 * @author VR爱好者
 * @date 2022-02-18
 */
public class XinhuBook extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 书名 */
    @Excel(name = "书名")
    private String title;

    /** 对应分类 */
    @Excel(name = "对应分类")
    private Integer typeid;

    /** 编号 */
    @Excel(name = "编号")
    private String num;

    /** 作者 */
    @Excel(name = "作者")
    private String author;

    /** 出版社 */
    @Excel(name = "出版社")
    private String chuban;

    /** 出版日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出版日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date cbdt;

    /** 价格 */
    @Excel(name = "价格")
    private BigDecimal price;

    /** 存放位置 */
    @Excel(name = "存放位置")
    private String weizhi;

    /** 数量 */
    @Excel(name = "数量")
    private Integer shuliang;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date adddt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 操作人 */
    @Excel(name = "操作人")
    private String optname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer optid;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String isbn;

    /** 被借阅数 */
    @Excel(name = "被借阅数")
    private Integer jieshu;

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
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setTypeid(Integer typeid) 
    {
        this.typeid = typeid;
    }

    public Integer getTypeid() 
    {
        return typeid;
    }
    public void setNum(String num) 
    {
        this.num = num;
    }

    public String getNum() 
    {
        return num;
    }
    public void setAuthor(String author) 
    {
        this.author = author;
    }

    public String getAuthor() 
    {
        return author;
    }
    public void setChuban(String chuban) 
    {
        this.chuban = chuban;
    }

    public String getChuban() 
    {
        return chuban;
    }
    public void setCbdt(Date cbdt) 
    {
        this.cbdt = cbdt;
    }

    public Date getCbdt() 
    {
        return cbdt;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setWeizhi(String weizhi) 
    {
        this.weizhi = weizhi;
    }

    public String getWeizhi() 
    {
        return weizhi;
    }
    public void setShuliang(Integer shuliang)
    {
        this.shuliang = shuliang;
    }

    public Integer getShuliang()
    {
        return shuliang;
    }
    public void setAdddt(Date adddt) 
    {
        this.adddt = adddt;
    }

    public Date getAdddt() 
    {
        return adddt;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setOptname(String optname) 
    {
        this.optname = optname;
    }

    public String getOptname() 
    {
        return optname;
    }
    public void setOptid(Integer optid) 
    {
        this.optid = optid;
    }

    public Integer getOptid() 
    {
        return optid;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setIsbn(String isbn) 
    {
        this.isbn = isbn;
    }

    public String getIsbn() 
    {
        return isbn;
    }
    public void setJieshu(Integer jieshu) 
    {
        this.jieshu = jieshu;
    }

    public Integer getJieshu() 
    {
        return jieshu;
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
            .append("title", getTitle())
            .append("typeid", getTypeid())
            .append("num", getNum())
            .append("author", getAuthor())
            .append("chuban", getChuban())
            .append("cbdt", getCbdt())
            .append("price", getPrice())
            .append("weizhi", getWeizhi())
            .append("shuliang", getShuliang())
            .append("adddt", getAdddt())
            .append("optdt", getOptdt())
            .append("optname", getOptname())
            .append("optid", getOptid())
            .append("content", getContent())
            .append("isbn", getIsbn())
            .append("jieshu", getJieshu())
            .append("comid", getComid())
            .toString();
    }
}
