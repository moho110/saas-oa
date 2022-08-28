package com.vrmlstudio.hr.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 奖惩对象 xinhu_reward
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuReward extends BaseEntity
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

    /** 奖惩对象 */
    @Excel(name = "奖惩对象")
    private String object;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer objectid;

    /** 奖惩类型0奖励,1处罚 */
    @Excel(name = "奖惩类型0奖励,1处罚")
    private Integer types;

    /** 奖惩结果 */
    @Excel(name = "奖惩结果")
    private String result;

    /** 奖惩金额 */
    @Excel(name = "奖惩金额")
    private Integer money;

    /** 发生时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发生时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date happendt;

    /** 发生地点 */
    @Excel(name = "发生地点")
    private String hapaddress;

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
    public void setObject(String object) 
    {
        this.object = object;
    }

    public String getObject() 
    {
        return object;
    }
    public void setObjectid(Integer objectid) 
    {
        this.objectid = objectid;
    }

    public Integer getObjectid() 
    {
        return objectid;
    }
    public void setTypes(Integer type)
    {
        this.types = types;
    }

    public Integer getTypes()
    {
        return types;
    }
    public void setResult(String result) 
    {
        this.result = result;
    }

    public String getResult() 
    {
        return result;
    }
    public void setMoney(Integer money) 
    {
        this.money = money;
    }

    public Integer getMoney() 
    {
        return money;
    }
    public void setHappendt(Date happendt) 
    {
        this.happendt = happendt;
    }

    public Date getHappendt() 
    {
        return happendt;
    }
    public void setHapaddress(String hapaddress) 
    {
        this.hapaddress = hapaddress;
    }

    public String getHapaddress() 
    {
        return hapaddress;
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
            .append("object", getObject())
            .append("objectid", getObjectid())
            .append("types", getTypes())
            .append("result", getResult())
            .append("money", getMoney())
            .append("happendt", getHappendt())
            .append("hapaddress", getHapaddress())
            .append("comid", getComid())
            .toString();
    }
}
