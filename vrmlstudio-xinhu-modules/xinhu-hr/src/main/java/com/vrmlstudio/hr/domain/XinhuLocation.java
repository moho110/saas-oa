package com.vrmlstudio.hr.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 外勤定位对象 xinhu_location
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuLocation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String user;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long uid;

    /** 应用Id */
    @Excel(name = "应用Id")
    private String agentid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 地理位置纬度 */
    @Excel(name = "地理位置纬度")
    private String locationX;

    /** 地理位置经度  */
    @Excel(name = "地理位置经度 ")
    private String locationY;

    /** 地图缩放大小 */
    @Excel(name = "地图缩放大小")
    private Integer scale;

    /** 地理位置 */
    @Excel(name = "地理位置")
    private String label;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String msgid;

    /** 地理位置精度 */
    @Excel(name = "地理位置精度")
    private Integer precisions;

    /** 0普通,1事件,2企业微信定位 */
    @Excel(name = "0普通,1事件,2企业微信定位")
    private Integer types;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** 相关图片 */
    @Excel(name = "相关图片")
    private String imgpath;

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
    public void setUser(String user) 
    {
        this.user = user;
    }

    public String getUser() 
    {
        return user;
    }
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setAgentid(String agentid) 
    {
        this.agentid = agentid;
    }

    public String getAgentid() 
    {
        return agentid;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setLocationX(String locationX) 
    {
        this.locationX = locationX;
    }

    public String getLocationX() 
    {
        return locationX;
    }
    public void setLocationY(String locationY) 
    {
        this.locationY = locationY;
    }

    public String getLocationY() 
    {
        return locationY;
    }
    public void setScale(Integer scale) 
    {
        this.scale = scale;
    }

    public Integer getScale() 
    {
        return scale;
    }
    public void setLabel(String label) 
    {
        this.label = label;
    }

    public String getLabel() 
    {
        return label;
    }
    public void setMsgid(String msgid) 
    {
        this.msgid = msgid;
    }

    public String getMsgid() 
    {
        return msgid;
    }
    public void setPrecisions(Integer precisions)
    {
        this.precisions = precisions;
    }

    public Integer getPrecisions()
    {
        return precisions;
    }
    public void setTypes(Integer type)
    {
        this.types = types;
    }

    public Integer getTypes()
    {
        return types;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setImgpath(String imgpath) 
    {
        this.imgpath = imgpath;
    }

    public String getImgpath() 
    {
        return imgpath;
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
            .append("user", getUser())
            .append("uid", getUid())
            .append("agentid", getAgentid())
            .append("optdt", getOptdt())
            .append("locationX", getLocationX())
            .append("locationY", getLocationY())
            .append("scale", getScale())
            .append("label", getLabel())
            .append("msgid", getMsgid())
            .append("precisions", getPrecisions())
            .append("types", getTypes())
            .append("content", getContent())
            .append("imgpath", getImgpath())
            .append("comid", getComid())
            .toString();
    }
}
