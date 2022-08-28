package com.vrmlstudio.hr.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 考勤机设备对象 xinhu_kqjsn
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuKqjsn extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 设备号 */
    @Excel(name = "设备号")
    private String num;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String name;

    /** 公司名 */
    @Excel(name = "公司名")
    private String company;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long sort;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 部门ID聚合 */
    @Excel(name = "部门ID聚合")
    private String deptids;

    /** 人员ID聚合 */
    @Excel(name = "人员ID聚合")
    private String userids;

    /** 最后请求时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后请求时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastdt;

    /** sd卡剩余空间 */
    @Excel(name = "sd卡剩余空间")
    private Long space;

    /** 剩余内存 */
    @Excel(name = "剩余内存")
    private Long memory;

    /** 人员数 */
    @Excel(name = "人员数")
    private Long usershu;

    /** 指纹数 */
    @Excel(name = "指纹数")
    private Long fingerprintshu;

    /** 头像数量 */
    @Excel(name = "头像数量")
    private Long headpicshu;

    /** 打卡数 */
    @Excel(name = "打卡数")
    private Long clockinshu;

    /** 现场照片数 */
    @Excel(name = "现场照片数")
    private Long picshu;

    /** 系统版本 */
    @Excel(name = "系统版本")
    private String romver;

    /** 应用版本 */
    @Excel(name = "应用版本")
    private String appver;

    /** 设备型号 */
    @Excel(name = "设备型号")
    private String model;

    /** 品牌0群英,1中控 */
    @Excel(name = "品牌0群英,1中控")
    private Integer pinpai;

    /** 分配的ip */
    @Excel(name = "分配的ip")
    private String snip;

    /** 分配端口号 */
    @Excel(name = "分配端口号")
    private String snport;

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
    public void setNum(String num) 
    {
        this.num = num;
    }

    public String getNum() 
    {
        return num;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setCompany(String company) 
    {
        this.company = company;
    }

    public String getCompany() 
    {
        return company;
    }
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setDeptids(String deptids) 
    {
        this.deptids = deptids;
    }

    public String getDeptids() 
    {
        return deptids;
    }
    public void setUserids(String userids) 
    {
        this.userids = userids;
    }

    public String getUserids() 
    {
        return userids;
    }
    public void setLastdt(Date lastdt) 
    {
        this.lastdt = lastdt;
    }

    public Date getLastdt() 
    {
        return lastdt;
    }
    public void setSpace(Long space) 
    {
        this.space = space;
    }

    public Long getSpace() 
    {
        return space;
    }
    public void setMemory(Long memory) 
    {
        this.memory = memory;
    }

    public Long getMemory() 
    {
        return memory;
    }
    public void setUsershu(Long usershu) 
    {
        this.usershu = usershu;
    }

    public Long getUsershu() 
    {
        return usershu;
    }
    public void setFingerprintshu(Long fingerprintshu) 
    {
        this.fingerprintshu = fingerprintshu;
    }

    public Long getFingerprintshu() 
    {
        return fingerprintshu;
    }
    public void setHeadpicshu(Long headpicshu) 
    {
        this.headpicshu = headpicshu;
    }

    public Long getHeadpicshu() 
    {
        return headpicshu;
    }
    public void setClockinshu(Long clockinshu) 
    {
        this.clockinshu = clockinshu;
    }

    public Long getClockinshu() 
    {
        return clockinshu;
    }
    public void setPicshu(Long picshu) 
    {
        this.picshu = picshu;
    }

    public Long getPicshu() 
    {
        return picshu;
    }
    public void setRomver(String romver) 
    {
        this.romver = romver;
    }

    public String getRomver() 
    {
        return romver;
    }
    public void setAppver(String appver) 
    {
        this.appver = appver;
    }

    public String getAppver() 
    {
        return appver;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }
    public void setPinpai(Integer pinpai) 
    {
        this.pinpai = pinpai;
    }

    public Integer getPinpai() 
    {
        return pinpai;
    }
    public void setSnip(String snip) 
    {
        this.snip = snip;
    }

    public String getSnip() 
    {
        return snip;
    }
    public void setSnport(String snport) 
    {
        this.snport = snport;
    }

    public String getSnport() 
    {
        return snport;
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
            .append("num", getNum())
            .append("name", getName())
            .append("company", getCompany())
            .append("sort", getSort())
            .append("optdt", getOptdt())
            .append("status", getStatus())
            .append("deptids", getDeptids())
            .append("userids", getUserids())
            .append("lastdt", getLastdt())
            .append("space", getSpace())
            .append("memory", getMemory())
            .append("usershu", getUsershu())
            .append("fingerprintshu", getFingerprintshu())
            .append("headpicshu", getHeadpicshu())
            .append("clockinshu", getClockinshu())
            .append("picshu", getPicshu())
            .append("romver", getRomver())
            .append("appver", getAppver())
            .append("model", getModel())
            .append("pinpai", getPinpai())
            .append("snip", getSnip())
            .append("snport", getSnport())
            .append("comid", getComid())
            .toString();
    }
}
