package com.vrmlstudio.person.domain;

import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 用户档案对象 xinhu_userinfo
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuUserinfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 编号 */
    @Excel(name = "编号")
    private String num;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String deptname;

    /** 多部门 */
    @Excel(name = "多部门")
    private String deptnames;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String deptallname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ranking;

    /** 多职位 */
    @Excel(name = "多职位")
    private String rankings;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String dkip;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String dkmac;

    /** 状态来自userstate */
    @Excel(name = "状态来自userstate")
    private Integer state;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 电话 */
    @Excel(name = "电话")
    private String tel;

    /** 手机号 */
    @Excel(name = "手机号")
    private String mobile;

    /** 入职时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入职时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date workdate;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String email;

    /** 离职日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "离职日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date quitdt;

    /** 是否考勤 */
    @Excel(name = "是否考勤")
    private Integer iskq;

    /** 是否定位打卡 */
    @Excel(name = "是否定位打卡")
    private Integer isdwdk;

    /** 生日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String xueli;

    /** 0阳历1农历 */
    @Excel(name = "0阳历1农历")
    private Integer birtype;

    /** 民族 */
    @Excel(name = "民族")
    private String minzu;

    /** 婚姻 */
    @Excel(name = "婚姻")
    private String hunyin;

    /** 籍贯 */
    @Excel(name = "籍贯")
    private String jiguan;

    /** 现住址 */
    @Excel(name = "现住址")
    private String nowdizhi;

    /** 家庭地址 */
    @Excel(name = "家庭地址")
    private String housedizhi;

    /** 试用期到 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "试用期到", width = 30, dateFormat = "yyyy-MM-dd")
    private Date syenddt;

    /** 转正日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "转正日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date positivedt;

    /** 开户行 */
    @Excel(name = "开户行")
    private String bankname;

    /** 工资卡帐号 */
    @Excel(name = "工资卡帐号")
    private String banknum;

    /** 照片 */
    @Excel(name = "照片")
    private String zhaopian;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String idnum;

    /** 备用联系人 */
    @Excel(name = "备用联系人")
    private String spareman;

    /** 备用联系人电话 */
    @Excel(name = "备用联系人电话")
    private String sparetel;

    /** 是否需要写日报 */
    @Excel(name = "是否需要写日报")
    private Integer isdaily;

    /** 所在公司单位Id */
    @Excel(name = "所在公司单位Id")
    private Long companyid;

    /** 关联考勤机人员编号 */
    @Excel(name = "关联考勤机人员编号")
    private String finger;

    /** 加入单位id */
    @Excel(name = "加入单位id")
    private String dwid;

    /** 人员档案子信息 */
    private List<XinhuUserinfos> xinhuUserinfosList;

    public void setId(Long id)
    {
        this.id = Math.toIntExact(id);
    }

    public int getId()
    {

        return id.intValue();
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setNum(String num) 
    {
        this.num = num;
    }

    public String getNum() 
    {
        return num;
    }
    public void setDeptname(String deptname) 
    {
        this.deptname = deptname;
    }

    public String getDeptname() 
    {
        return deptname;
    }
    public void setDeptnames(String deptnames) 
    {
        this.deptnames = deptnames;
    }

    public String getDeptnames() 
    {
        return deptnames;
    }
    public void setDeptallname(String deptallname) 
    {
        this.deptallname = deptallname;
    }

    public String getDeptallname() 
    {
        return deptallname;
    }
    public void setRanking(String ranking) 
    {
        this.ranking = ranking;
    }

    public String getRanking() 
    {
        return ranking;
    }
    public void setRankings(String rankings) 
    {
        this.rankings = rankings;
    }

    public String getRankings() 
    {
        return rankings;
    }
    public void setDkip(String dkip) 
    {
        this.dkip = dkip;
    }

    public String getDkip() 
    {
        return dkip;
    }
    public void setDkmac(String dkmac) 
    {
        this.dkmac = dkmac;
    }

    public String getDkmac() 
    {
        return dkmac;
    }
    public void setState(Integer state) 
    {
        this.state = state;
    }

    public Integer getState() 
    {
        return state;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setTel(String tel) 
    {
        this.tel = tel;
    }

    public String getTel() 
    {
        return tel;
    }
    public void setMobile(String mobile) 
    {
        this.mobile = mobile;
    }

    public String getMobile() 
    {
        return mobile;
    }
    public void setWorkdate(Date workdate) 
    {
        this.workdate = workdate;
    }

    public Date getWorkdate() 
    {
        return workdate;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setQuitdt(Date quitdt) 
    {
        this.quitdt = quitdt;
    }

    public Date getQuitdt() 
    {
        return quitdt;
    }
    public void setIskq(Integer iskq) 
    {
        this.iskq = iskq;
    }

    public Integer getIskq() 
    {
        return iskq;
    }
    public void setIsdwdk(Integer isdwdk) 
    {
        this.isdwdk = isdwdk;
    }

    public Integer getIsdwdk() 
    {
        return isdwdk;
    }
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setXueli(String xueli) 
    {
        this.xueli = xueli;
    }

    public String getXueli() 
    {
        return xueli;
    }
    public void setBirtype(Integer birtype) 
    {
        this.birtype = birtype;
    }

    public Integer getBirtype() 
    {
        return birtype;
    }
    public void setMinzu(String minzu) 
    {
        this.minzu = minzu;
    }

    public String getMinzu() 
    {
        return minzu;
    }
    public void setHunyin(String hunyin) 
    {
        this.hunyin = hunyin;
    }

    public String getHunyin() 
    {
        return hunyin;
    }
    public void setJiguan(String jiguan) 
    {
        this.jiguan = jiguan;
    }

    public String getJiguan() 
    {
        return jiguan;
    }
    public void setNowdizhi(String nowdizhi) 
    {
        this.nowdizhi = nowdizhi;
    }

    public String getNowdizhi() 
    {
        return nowdizhi;
    }
    public void setHousedizhi(String housedizhi) 
    {
        this.housedizhi = housedizhi;
    }

    public String getHousedizhi() 
    {
        return housedizhi;
    }
    public void setSyenddt(Date syenddt) 
    {
        this.syenddt = syenddt;
    }

    public Date getSyenddt() 
    {
        return syenddt;
    }
    public void setPositivedt(Date positivedt) 
    {
        this.positivedt = positivedt;
    }

    public Date getPositivedt() 
    {
        return positivedt;
    }
    public void setBankname(String bankname) 
    {
        this.bankname = bankname;
    }

    public String getBankname() 
    {
        return bankname;
    }
    public void setBanknum(String banknum) 
    {
        this.banknum = banknum;
    }

    public String getBanknum() 
    {
        return banknum;
    }
    public void setZhaopian(String zhaopian) 
    {
        this.zhaopian = zhaopian;
    }

    public String getZhaopian() 
    {
        return zhaopian;
    }
    public void setIdnum(String idnum) 
    {
        this.idnum = idnum;
    }

    public String getIdnum() 
    {
        return idnum;
    }
    public void setSpareman(String spareman) 
    {
        this.spareman = spareman;
    }

    public String getSpareman() 
    {
        return spareman;
    }
    public void setSparetel(String sparetel) 
    {
        this.sparetel = sparetel;
    }

    public String getSparetel() 
    {
        return sparetel;
    }
    public void setIsdaily(Integer isdaily) 
    {
        this.isdaily = isdaily;
    }

    public Integer getIsdaily() 
    {
        return isdaily;
    }
    public void setCompanyid(Long companyid) 
    {
        this.companyid = companyid;
    }

    public Long getCompanyid() 
    {
        return companyid;
    }
    public void setFinger(String finger) 
    {
        this.finger = finger;
    }

    public String getFinger() 
    {
        return finger;
    }
    public void setDwid(String dwid) 
    {
        this.dwid = dwid;
    }

    public String getDwid() 
    {
        return dwid;
    }

    public List<XinhuUserinfos> getXinhuUserinfosList()
    {
        return xinhuUserinfosList;
    }

    public void setXinhuUserinfosList(List<XinhuUserinfos> xinhuUserinfosList)
    {
        this.xinhuUserinfosList = xinhuUserinfosList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("num", getNum())
            .append("deptname", getDeptname())
            .append("deptnames", getDeptnames())
            .append("deptallname", getDeptallname())
            .append("ranking", getRanking())
            .append("rankings", getRankings())
            .append("dkip", getDkip())
            .append("dkmac", getDkmac())
            .append("state", getState())
            .append("sex", getSex())
            .append("tel", getTel())
            .append("mobile", getMobile())
            .append("workdate", getWorkdate())
            .append("email", getEmail())
            .append("quitdt", getQuitdt())
            .append("iskq", getIskq())
            .append("isdwdk", getIsdwdk())
            .append("birthday", getBirthday())
            .append("xueli", getXueli())
            .append("birtype", getBirtype())
            .append("minzu", getMinzu())
            .append("hunyin", getHunyin())
            .append("jiguan", getJiguan())
            .append("nowdizhi", getNowdizhi())
            .append("housedizhi", getHousedizhi())
            .append("syenddt", getSyenddt())
            .append("positivedt", getPositivedt())
            .append("bankname", getBankname())
            .append("banknum", getBanknum())
            .append("zhaopian", getZhaopian())
            .append("idnum", getIdnum())
            .append("spareman", getSpareman())
            .append("sparetel", getSparetel())
            .append("isdaily", getIsdaily())
            .append("companyid", getCompanyid())
            .append("finger", getFinger())
            .append("dwid", getDwid())
            .append("xinhuUserinfosList", getXinhuUserinfosList())
            .toString();
    }
}
