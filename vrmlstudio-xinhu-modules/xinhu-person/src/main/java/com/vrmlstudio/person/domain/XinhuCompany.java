package com.vrmlstudio.person.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 公司单位对象 xinhu_company
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuCompany extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 对应logo */
    @Excel(name = "对应logo")
    private String logo;

    /** 公司名称 */
    @Excel(name = "公司名称")
    private String name;

    /** 英文名 */
    @Excel(name = "英文名")
    private String nameen;

    /** 显示OA名称 */
    @Excel(name = "显示OA名称")
    private String oaname;

    /** 移动端显示名称 */
    @Excel(name = "移动端显示名称")
    private String oanemes;

    /** 电话 */
    @Excel(name = "电话")
    private String tel;

    /** 传真 */
    @Excel(name = "传真")
    private String fax;

    /** 对应上级 */
    @Excel(name = "对应上级")
    private Long pid;

    /** 排序号 */
    @Excel(name = "排序号")
    private Integer sorts;

    /** 对应负责人Id */
    @Excel(name = "对应负责人Id")
    private String fuzeid;

    /** 对应负责人 */
    @Excel(name = "对应负责人")
    private String fuzename;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 所在城市 */
    @Excel(name = "所在城市")
    private String city;

    /** 单位编号 */
    @Excel(name = "单位编号")
    private String num;

    /** 对应单位id */
    @Excel(name = "对应单位id")
    private Integer comid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer iscreate;

    /** 使用域名 */
    @Excel(name = "使用域名")
    private String yuming;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setLogo(String logo) 
    {
        this.logo = logo;
    }

    public String getLogo() 
    {
        return logo;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setNameen(String nameen) 
    {
        this.nameen = nameen;
    }

    public String getNameen() 
    {
        return nameen;
    }
    public void setOaname(String oaname) 
    {
        this.oaname = oaname;
    }

    public String getOaname() 
    {
        return oaname;
    }
    public void setOanemes(String oanemes) 
    {
        this.oanemes = oanemes;
    }

    public String getOanemes() 
    {
        return oanemes;
    }
    public void setTel(String tel) 
    {
        this.tel = tel;
    }

    public String getTel() 
    {
        return tel;
    }
    public void setFax(String fax) 
    {
        this.fax = fax;
    }

    public String getFax() 
    {
        return fax;
    }
    public void setPid(Long pid) 
    {
        this.pid = pid;
    }

    public Long getPid() 
    {
        return pid;
    }
    public void setSorts(Integer sorts) 
    {
        this.sorts = sorts;
    }

    public Integer getSorts() 
    {
        return sorts;
    }
    public void setFuzeid(String fuzeid) 
    {
        this.fuzeid = fuzeid;
    }

    public String getFuzeid() 
    {
        return fuzeid;
    }
    public void setFuzename(String fuzename) 
    {
        this.fuzename = fuzename;
    }

    public String getFuzename() 
    {
        return fuzename;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }
    public void setNum(String num) 
    {
        this.num = num;
    }

    public String getNum() 
    {
        return num;
    }
    public void setComid(Integer comid) 
    {
        this.comid = comid;
    }

    public Integer getComid() 
    {
        return comid;
    }
    public void setIscreate(Integer iscreate) 
    {
        this.iscreate = iscreate;
    }

    public Integer getIscreate() 
    {
        return iscreate;
    }
    public void setYuming(String yuming) 
    {
        this.yuming = yuming;
    }

    public String getYuming() 
    {
        return yuming;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("logo", getLogo())
            .append("name", getName())
            .append("nameen", getNameen())
            .append("oaname", getOaname())
            .append("oanemes", getOanemes())
            .append("tel", getTel())
            .append("fax", getFax())
            .append("pid", getPid())
            .append("sorts", getSorts())
            .append("fuzeid", getFuzeid())
            .append("fuzename", getFuzename())
            .append("address", getAddress())
            .append("city", getCity())
            .append("num", getNum())
            .append("comid", getComid())
            .append("iscreate", getIscreate())
            .append("yuming", getYuming())
            .toString();
    }
}
