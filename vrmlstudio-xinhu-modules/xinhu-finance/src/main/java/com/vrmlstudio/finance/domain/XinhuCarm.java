package com.vrmlstudio.finance.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 车辆对象 xinhu_carm
 * 
 * @author VRer
 * @date 2022-02-20
 */
public class XinhuCarm extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 车牌号 */
    @Excel(name = "车牌号")
    private String carnum;

    /** 车辆品牌 */
    @Excel(name = "车辆品牌")
    private String carbrand;

    /** 型号 */
    @Excel(name = "型号")
    private String carmode;

    /** 车辆类型 */
    @Excel(name = "车辆类型")
    private String cartype;

    /** 购买日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "购买日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date buydt;

    /** 购买价格 */
    @Excel(name = "购买价格")
    private Integer buyprice;

    /** 发动机号 */
    @Excel(name = "发动机号")
    private String enginenb;

    /** 是否公开使用 */
    @Excel(name = "是否公开使用")
    private Integer ispublic;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer optid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String optname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date adddt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createname;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** 状态@0|办理中,1|可用,2|维修中,3|报废 */
    @Excel(name = "状态@0|办理中,1|可用,2|维修中,3|报废")
    private Integer state;

    /** 车架号 */
    @Excel(name = "车架号")
    private String framenum;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status;

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
    public void setCarnum(String carnum) 
    {
        this.carnum = carnum;
    }

    public String getCarnum() 
    {
        return carnum;
    }
    public void setCarbrand(String carbrand) 
    {
        this.carbrand = carbrand;
    }

    public String getCarbrand() 
    {
        return carbrand;
    }
    public void setCarmode(String carmode) 
    {
        this.carmode = carmode;
    }

    public String getCarmode() 
    {
        return carmode;
    }
    public void setCartype(String cartype) 
    {
        this.cartype = cartype;
    }

    public String getCartype() 
    {
        return cartype;
    }
    public void setBuydt(Date buydt) 
    {
        this.buydt = buydt;
    }

    public Date getBuydt() 
    {
        return buydt;
    }
    public void setBuyprice(Integer buyprice) 
    {
        this.buyprice = buyprice;
    }

    public Integer getBuyprice() 
    {
        return buyprice;
    }
    public void setEnginenb(String enginenb) 
    {
        this.enginenb = enginenb;
    }

    public String getEnginenb() 
    {
        return enginenb;
    }
    public void setIspublic(Integer ispublic) 
    {
        this.ispublic = ispublic;
    }

    public Integer getIspublic() 
    {
        return ispublic;
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
    public void setAdddt(Date adddt) 
    {
        this.adddt = adddt;
    }

    public Date getAdddt() 
    {
        return adddt;
    }
    public void setCreatename(String createname) 
    {
        this.createname = createname;
    }

    public String getCreatename() 
    {
        return createname;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setState(Integer state) 
    {
        this.state = state;
    }

    public Integer getState() 
    {
        return state;
    }
    public void setFramenum(String framenum) 
    {
        this.framenum = framenum;
    }

    public String getFramenum() 
    {
        return framenum;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
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
            .append("carnum", getCarnum())
            .append("carbrand", getCarbrand())
            .append("carmode", getCarmode())
            .append("cartype", getCartype())
            .append("buydt", getBuydt())
            .append("buyprice", getBuyprice())
            .append("enginenb", getEnginenb())
            .append("ispublic", getIspublic())
            .append("optdt", getOptdt())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("adddt", getAdddt())
            .append("createname", getCreatename())
            .append("content", getContent())
            .append("state", getState())
            .append("framenum", getFramenum())
            .append("status", getStatus())
            .append("comid", getComid())
            .toString();
    }
}
