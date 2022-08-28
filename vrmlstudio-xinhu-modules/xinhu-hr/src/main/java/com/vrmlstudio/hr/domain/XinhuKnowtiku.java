package com.vrmlstudio.hr.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 知识题库对象 xinhu_knowtiku
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuKnowtiku extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer typeid;

    /** 0单选,1多选,2判断题 */
    @Excel(name = "0单选,1多选,2判断题")
    private Integer types;

    /** 答案A */
    @Excel(name = "答案A")
    private String ana;

    /** 答案B */
    @Excel(name = "答案B")
    private String anb;

    /** 答案C */
    @Excel(name = "答案C")
    private String anc;

    /** 答案D */
    @Excel(name = "答案D")
    private String ands;

    /** 答案E */
    @Excel(name = "答案E")
    private String ane;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String answer;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer sort;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date adddt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String contents;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer optid;

    /** 相关图片地址 */
    @Excel(name = "相关图片地址")
    private String imgurl;

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
    public void setTypes(Integer types)
    {
        this.types = types;
    }

    public Integer getTypes()
    {
        return types;
    }
    public void setAna(String ana) 
    {
        this.ana = ana;
    }

    public String getAna() 
    {
        return ana;
    }
    public void setAnb(String anb) 
    {
        this.anb = anb;
    }

    public String getAnb() 
    {
        return anb;
    }
    public void setAnc(String anc) 
    {
        this.anc = anc;
    }

    public String getAnc() 
    {
        return anc;
    }
    public void setAnds(String ands)
    {
        this.ands = ands;
    }

    public String getAnds()
    {
        return ands;
    }
    public void setAne(String ane) 
    {
        this.ane = ane;
    }

    public String getAne() 
    {
        return ane;
    }
    public void setAnswer(String answer) 
    {
        this.answer = answer;
    }

    public String getAnswer() 
    {
        return answer;
    }
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
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
    public void setContents(String contents)
    {
        this.contents = contents;
    }

    public String getContents()
    {
        return contents;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setOptid(Integer optid) 
    {
        this.optid = optid;
    }

    public Integer getOptid() 
    {
        return optid;
    }
    public void setImgurl(String imgurl) 
    {
        this.imgurl = imgurl;
    }

    public String getImgurl() 
    {
        return imgurl;
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
            .append("types", getTypes())
            .append("ana", getAna())
            .append("anb", getAnb())
            .append("anc", getAnc())
            .append("ands", getAnds())
            .append("ane", getAne())
            .append("answer", getAnswer())
            .append("sort", getSort())
            .append("adddt", getAdddt())
            .append("optdt", getOptdt())
            .append("contents", getContents())
            .append("status", getStatus())
            .append("content", getContent())
            .append("optid", getOptid())
            .append("imgurl", getImgurl())
            .append("comid", getComid())
            .toString();
    }
}
