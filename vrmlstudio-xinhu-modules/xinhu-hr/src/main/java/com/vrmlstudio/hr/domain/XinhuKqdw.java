package com.vrmlstudio.hr.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 考勤定位规则对象 xinhu_kqdw
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuKqdw extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String locationX;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String locationY;

    /** 位置名称 */
    @Excel(name = "位置名称")
    private String address;

    /** 允许误差米 */
    @Excel(name = "允许误差米")
    private Long precisions;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer scale;

    /** 打卡wifi名 */
    @Excel(name = "打卡wifi名")
    private String wifiname;

    /** 是否为无固定地点 */
    @Excel(name = "是否为无固定地点")
    private Integer iswgd;

    /** 关联对应ID,实现多点定位 */
    @Excel(name = "关联对应ID,实现多点定位")
    private String dwids;

    /** 是否需要拍照才能打卡 */
    @Excel(name = "是否需要拍照才能打卡")
    private Integer ispz;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
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
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setPrecisions(Long precisions)
    {
        this.precisions = precisions;
    }

    public Long getPrecisions()
    {
        return precisions;
    }
    public void setScale(Integer scale) 
    {
        this.scale = scale;
    }

    public Integer getScale() 
    {
        return scale;
    }
    public void setWifiname(String wifiname) 
    {
        this.wifiname = wifiname;
    }

    public String getWifiname() 
    {
        return wifiname;
    }
    public void setIswgd(Integer iswgd) 
    {
        this.iswgd = iswgd;
    }

    public Integer getIswgd() 
    {
        return iswgd;
    }
    public void setDwids(String dwids) 
    {
        this.dwids = dwids;
    }

    public String getDwids() 
    {
        return dwids;
    }
    public void setIspz(Integer ispz) 
    {
        this.ispz = ispz;
    }

    public Integer getIspz() 
    {
        return ispz;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("locationX", getLocationX())
            .append("locationY", getLocationY())
            .append("address", getAddress())
            .append("precisions", getPrecisions())
            .append("scale", getScale())
            .append("wifiname", getWifiname())
            .append("iswgd", getIswgd())
            .append("dwids", getDwids())
            .append("ispz", getIspz())
            .toString();
    }
}
