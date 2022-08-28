package com.vrmlstudio.hr.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 打卡记录对象 xinhu_kqdkjl
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuKqdkjl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long uid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date dkdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 0在线打卡,1考勤机,2手机定位,3手动添加,4异常添加,5数据导入,6接口导入 */
    @Excel(name = "0在线打卡,1考勤机,2手机定位,3手动添加,4异常添加,5数据导入,6接口导入")
    private Integer types;

    /** 定位地址 */
    @Excel(name = "定位地址")
    private String address;

    /** 纬度 */
    @Excel(name = "纬度")
    private String lat;

    /** 经度 */
    @Excel(name = "经度")
    private String lng;

    /** 精确范围 */
    @Excel(name = "精确范围")
    private Integer accuracy;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ip;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String mac;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** 相关图片 */
    @Excel(name = "相关图片")
    private String imgpath;

    /** 考勤机设备id */
    @Excel(name = "考勤机设备id")
    private Long snid;

    /** 考勤机打卡方式0密码,1指纹,2刷卡 */
    @Excel(name = "考勤机打卡方式0密码,1指纹,2刷卡")
    private Integer sntype;

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
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setDkdt(Date dkdt) 
    {
        this.dkdt = dkdt;
    }

    public Date getDkdt() 
    {
        return dkdt;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setTypes(Integer types)
    {
        this.types = types;
    }

    public Integer getTypes()
    {
        return types;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setLat(String lat) 
    {
        this.lat = lat;
    }

    public String getLat() 
    {
        return lat;
    }
    public void setLng(String lng) 
    {
        this.lng = lng;
    }

    public String getLng() 
    {
        return lng;
    }
    public void setAccuracy(Integer accuracy) 
    {
        this.accuracy = accuracy;
    }

    public Integer getAccuracy() 
    {
        return accuracy;
    }
    public void setIp(String ip) 
    {
        this.ip = ip;
    }

    public String getIp() 
    {
        return ip;
    }
    public void setMac(String mac) 
    {
        this.mac = mac;
    }

    public String getMac() 
    {
        return mac;
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
    public void setSnid(Long snid) 
    {
        this.snid = snid;
    }

    public Long getSnid() 
    {
        return snid;
    }
    public void setSntype(Integer sntype) 
    {
        this.sntype = sntype;
    }

    public Integer getSntype() 
    {
        return sntype;
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
            .append("dkdt", getDkdt())
            .append("optdt", getOptdt())
            .append("types", getTypes())
            .append("address", getAddress())
            .append("lat", getLat())
            .append("lng", getLng())
            .append("accuracy", getAccuracy())
            .append("ip", getIp())
            .append("mac", getMac())
            .append("content", getContent())
            .append("imgpath", getImgpath())
            .append("snid", getSnid())
            .append("sntype", getSntype())
            .append("comid", getComid())
            .toString();
    }
}
