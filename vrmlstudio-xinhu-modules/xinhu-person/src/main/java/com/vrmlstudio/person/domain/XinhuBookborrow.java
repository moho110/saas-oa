package com.vrmlstudio.person.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 图书借阅对象 xinhu_bookborrow
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuBookborrow extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer uid;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer optid;

    /** 操作人 */
    @Excel(name = "操作人")
    private String optname;

    /** 申请日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applydt;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 是否提交 */
    @Excel(name = "是否提交")
    private Integer isturn;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer bookid;

    /** 书名 */
    @Excel(name = "书名")
    private String bookname;

    /** 借阅日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "借阅日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jydt;

    /** 预计归还 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预计归还", width = 30, dateFormat = "yyyy-MM-dd")
    private Date yjdt;

    /** 归还时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "归还时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date ghtime;

    /** 是否归返 */
    @Excel(name = "是否归返")
    private Integer isgh;

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
    public void setUid(Integer uid) 
    {
        this.uid = uid;
    }

    public Integer getUid() 
    {
        return uid;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setOptid(Integer optid) 
    {
        this.optid = optid;
    }

    public Integer getOptid() 
    {
        return optid;
    }
    public void setOptname(String optname) 
    {
        this.optname = optname;
    }

    public String getOptname() 
    {
        return optname;
    }
    public void setApplydt(Date applydt) 
    {
        this.applydt = applydt;
    }

    public Date getApplydt() 
    {
        return applydt;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setIsturn(Integer isturn) 
    {
        this.isturn = isturn;
    }

    public Integer getIsturn() 
    {
        return isturn;
    }
    public void setBookid(Integer bookid) 
    {
        this.bookid = bookid;
    }

    public Integer getBookid() 
    {
        return bookid;
    }
    public void setBookname(String bookname) 
    {
        this.bookname = bookname;
    }

    public String getBookname() 
    {
        return bookname;
    }
    public void setJydt(Date jydt) 
    {
        this.jydt = jydt;
    }

    public Date getJydt() 
    {
        return jydt;
    }
    public void setYjdt(Date yjdt) 
    {
        this.yjdt = yjdt;
    }

    public Date getYjdt() 
    {
        return yjdt;
    }
    public void setGhtime(Date ghtime) 
    {
        this.ghtime = ghtime;
    }

    public Date getGhtime() 
    {
        return ghtime;
    }
    public void setIsgh(Integer isgh) 
    {
        this.isgh = isgh;
    }

    public Integer getIsgh() 
    {
        return isgh;
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
            .append("uid", getUid())
            .append("optdt", getOptdt())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("applydt", getApplydt())
            .append("content", getContent())
            .append("status", getStatus())
            .append("isturn", getIsturn())
            .append("bookid", getBookid())
            .append("bookname", getBookname())
            .append("jydt", getJydt())
            .append("yjdt", getYjdt())
            .append("ghtime", getGhtime())
            .append("isgh", getIsgh())
            .append("comid", getComid())
            .toString();
    }
}
