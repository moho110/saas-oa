package com.vrmlstudio.hr.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 面试和人员需求对象 xinhu_hrdemint
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuHrdemint extends BaseEntity
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

    /** 0需求,1面试 */
    @Excel(name = "0需求,1面试")
    private Integer types;

    /** 申请日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applydt;

    /** 说明 */
    @Excel(name = "说明")
    private String contents;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 是否提交 */
    @Excel(name = "是否提交")
    private Integer isturn;

    /** 需求职位 */
    @Excel(name = "需求职位")
    private String zhiwei;

    /** 薪资 */
    @Excel(name = "薪资")
    private String xinzi;

    /** 需求人数 */
    @Excel(name = "需求人数")
    private Integer renshu;

    /** 职位要求/面试者简历 */
    @Excel(name = "职位要求/面试者简历")
    private String content;

    /** 需求部门 */
    @Excel(name = "需求部门")
    private String bumen;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 面试人员 */
    @Excel(name = "面试人员")
    private String msuser;

    /** 面试人员的ID */
    @Excel(name = "面试人员的ID")
    private String msuserid;

    /** 面试记录 */
    @Excel(name = "面试记录")
    private String mscont;

    /** 面试结果0待面试,1录用,2不适合 */
    @Excel(name = "面试结果0待面试,1录用,2不适合")
    private Integer state;

    /** 面试时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "面试时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date msdt;

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
    public void setTypes(Integer types)
    {
        this.types = types;
    }

    public Integer getTypes()
    {
        return types;
    }
    public void setApplydt(Date applydt) 
    {
        this.applydt = applydt;
    }

    public Date getApplydt() 
    {
        return applydt;
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
    public void setIsturn(Integer isturn) 
    {
        this.isturn = isturn;
    }

    public Integer getIsturn() 
    {
        return isturn;
    }
    public void setZhiwei(String zhiwei) 
    {
        this.zhiwei = zhiwei;
    }

    public String getZhiwei() 
    {
        return zhiwei;
    }
    public void setXinzi(String xinzi) 
    {
        this.xinzi = xinzi;
    }

    public String getXinzi() 
    {
        return xinzi;
    }
    public void setRenshu(Integer renshu) 
    {
        this.renshu = renshu;
    }

    public Integer getRenshu() 
    {
        return renshu;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setBumen(String bumen) 
    {
        this.bumen = bumen;
    }

    public String getBumen() 
    {
        return bumen;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setMsuser(String msuser) 
    {
        this.msuser = msuser;
    }

    public String getMsuser() 
    {
        return msuser;
    }
    public void setMsuserid(String msuserid) 
    {
        this.msuserid = msuserid;
    }

    public String getMsuserid() 
    {
        return msuserid;
    }
    public void setMscont(String mscont) 
    {
        this.mscont = mscont;
    }

    public String getMscont() 
    {
        return mscont;
    }
    public void setState(Integer state) 
    {
        this.state = state;
    }

    public Integer getState() 
    {
        return state;
    }
    public void setMsdt(Date msdt) 
    {
        this.msdt = msdt;
    }

    public Date getMsdt() 
    {
        return msdt;
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
            .append("types", getTypes())
            .append("applydt", getApplydt())
            .append("contents", getContents())
            .append("status", getStatus())
            .append("isturn", getIsturn())
            .append("zhiwei", getZhiwei())
            .append("xinzi", getXinzi())
            .append("renshu", getRenshu())
            .append("content", getContent())
            .append("bumen", getBumen())
            .append("name", getName())
            .append("msuser", getMsuser())
            .append("msuserid", getMsuserid())
            .append("mscont", getMscont())
            .append("state", getState())
            .append("msdt", getMsdt())
            .append("comid", getComid())
            .toString();
    }
}
