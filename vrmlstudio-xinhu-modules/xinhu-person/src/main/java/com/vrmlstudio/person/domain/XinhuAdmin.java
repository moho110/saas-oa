package com.vrmlstudio.person.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 用户对象 xinhu_admin
 * 
 * @author VR爱好者
 * @date 2022-02-18
 */
public class XinhuAdmin extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 编号 */
    @Excel(name = "编号")
    private String num;

    /** 用户名 */
    @Excel(name = "用户名")
    private String user;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 密码 */
    @Excel(name = "密码")
    private String pass;

    /** 登录次数 */
    @Excel(name = "登录次数")
    private Integer loginci;

    /** 是否启用 */
    @Excel(name = "是否启用")
    private Integer status;

    /** 0普通1管理员 */
    @Excel(name = "0普通1管理员")
    private Integer types;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 电话 */
    @Excel(name = "电话")
    private String tel;

    /** 头像地址 */
    @Excel(name = "头像地址")
    private String face;

    /** 主部门ID */
    @Excel(name = "主部门ID")
    private Long deptid;

    /** 部门 */
    @Excel(name = "部门")
    private String deptname;

    /** 其他部门ID */
    @Excel(name = "其他部门ID")
    private String deptids;

    /** 多部门 */
    @Excel(name = "多部门")
    private String deptnames;

    /** 多职位 */
    @Excel(name = "多职位")
    private String rankings;

    /** 部门全部路径 */
    @Excel(name = "部门全部路径")
    private String deptallname;

    /** 上级主管ID */
    @Excel(name = "上级主管ID")
    private String superid;

    /** 上级主管 */
    @Excel(name = "上级主管")
    private String superman;

    /** 岗位 */
    @Excel(name = "岗位")
    private String ranking;

    /** 排序号 */
    @Excel(name = "排序号")
    private Integer sorts;

    /** 部门路径 */
    @Excel(name = "部门路径")
    private String deptpath;

    /** 上级主管路径 */
    @Excel(name = "上级主管路径")
    private String superpath;

    /** 组名称 */
    @Excel(name = "组名称")
    private String groupname;

    /** 移动电话 */
    @Excel(name = "移动电话")
    private String mobile;

    /** 是否app提醒 */
    @Excel(name = "是否app提醒")
    private Integer apptx;

    /** 入职时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入职时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date workdate;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String email;

    /** 最后app推送时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后app推送时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastpush;

    /** 新增时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "新增时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date adddt;

    /** 微信号 */
    @Excel(name = "微信号")
    private String weixinid;

    /** 离职日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "离职日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date quitdt;

    /** 默认样式 */
    @Excel(name = "默认样式")
    private Integer style;

    /** 名字拼音 */
    @Excel(name = "名字拼音")
    private String pingyin;

    /** 邮箱密码 */
    @Excel(name = "邮箱密码")
    private String emailpass;

    /** 所在公司单位Id */
    @Excel(name = "所在公司单位Id")
    private Long companyid;

    /** 在线状态 */
    @Excel(name = "在线状态")
    private Integer online;

    /** 最后在线时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后在线时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastonline;

    /** 是否在通讯录上显示 */
    @Excel(name = "是否在通讯录上显示")
    private Integer isvcard;

    /** 随机字符串 */
    @Excel(name = "随机字符串")
    private String randslat;

    /** 加入单位id */
    @Excel(name = "加入单位id")
    private String dwid;

    /** 修改密码次数 */
    @Excel(name = "修改密码次数")
    private Long editpass;

    /** 默认单位Id */
    @Excel(name = "默认单位Id")
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
    public void setUser(String user) 
    {
        this.user = user;
    }

    public String getUser() 
    {
        return user;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPass(String pass) 
    {
        this.pass = pass;
    }

    public String getPass() 
    {
        return pass;
    }
    public void setLoginci(Integer loginci) 
    {
        this.loginci = loginci;
    }

    public Integer getLoginci() 
    {
        return loginci;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setTypes(Integer types)
    {
        this.types = types;
    }

    public Integer getTypes()
    {
        return types;
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
    public void setFace(String face) 
    {
        this.face = face;
    }

    public String getFace() 
    {
        return face;
    }
    public void setDeptid(Long deptid) 
    {
        this.deptid = deptid;
    }

    public Long getDeptid() 
    {
        return deptid;
    }
    public void setDeptname(String deptname) 
    {
        this.deptname = deptname;
    }

    public String getDeptname() 
    {
        return deptname;
    }
    public void setDeptids(String deptids) 
    {
        this.deptids = deptids;
    }

    public String getDeptids() 
    {
        return deptids;
    }
    public void setDeptnames(String deptnames) 
    {
        this.deptnames = deptnames;
    }

    public String getDeptnames() 
    {
        return deptnames;
    }
    public void setRankings(String rankings) 
    {
        this.rankings = rankings;
    }

    public String getRankings() 
    {
        return rankings;
    }
    public void setDeptallname(String deptallname) 
    {
        this.deptallname = deptallname;
    }

    public String getDeptallname() 
    {
        return deptallname;
    }
    public void setSuperid(String superid) 
    {
        this.superid = superid;
    }

    public String getSuperid() 
    {
        return superid;
    }
    public void setSuperman(String superman) 
    {
        this.superman = superman;
    }

    public String getSuperman() 
    {
        return superman;
    }
    public void setRanking(String ranking) 
    {
        this.ranking = ranking;
    }

    public String getRanking() 
    {
        return ranking;
    }
    public void setSorts(Integer sorts) 
    {
        this.sorts = sorts;
    }

    public Integer getSorts() 
    {
        return sorts;
    }
    public void setDeptpath(String deptpath) 
    {
        this.deptpath = deptpath;
    }

    public String getDeptpath() 
    {
        return deptpath;
    }
    public void setSuperpath(String superpath) 
    {
        this.superpath = superpath;
    }

    public String getSuperpath() 
    {
        return superpath;
    }
    public void setGroupname(String groupname) 
    {
        this.groupname = groupname;
    }

    public String getGroupname() 
    {
        return groupname;
    }
    public void setMobile(String mobile) 
    {
        this.mobile = mobile;
    }

    public String getMobile() 
    {
        return mobile;
    }
    public void setApptx(Integer apptx) 
    {
        this.apptx = apptx;
    }

    public Integer getApptx() 
    {
        return apptx;
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
    public void setLastpush(Date lastpush) 
    {
        this.lastpush = lastpush;
    }

    public Date getLastpush() 
    {
        return lastpush;
    }
    public void setAdddt(Date adddt) 
    {
        this.adddt = adddt;
    }

    public Date getAdddt() 
    {
        return adddt;
    }
    public void setWeixinid(String weixinid) 
    {
        this.weixinid = weixinid;
    }

    public String getWeixinid() 
    {
        return weixinid;
    }
    public void setQuitdt(Date quitdt) 
    {
        this.quitdt = quitdt;
    }

    public Date getQuitdt() 
    {
        return quitdt;
    }
    public void setStyle(Integer style) 
    {
        this.style = style;
    }

    public Integer getStyle() 
    {
        return style;
    }
    public void setPingyin(String pingyin) 
    {
        this.pingyin = pingyin;
    }

    public String getPingyin() 
    {
        return pingyin;
    }
    public void setEmailpass(String emailpass) 
    {
        this.emailpass = emailpass;
    }

    public String getEmailpass() 
    {
        return emailpass;
    }
    public void setCompanyid(Long companyid) 
    {
        this.companyid = companyid;
    }

    public Long getCompanyid() 
    {
        return companyid;
    }
    public void setOnline(Integer online) 
    {
        this.online = online;
    }

    public Integer getOnline() 
    {
        return online;
    }
    public void setLastonline(Date lastonline) 
    {
        this.lastonline = lastonline;
    }

    public Date getLastonline() 
    {
        return lastonline;
    }
    public void setIsvcard(Integer isvcard) 
    {
        this.isvcard = isvcard;
    }

    public Integer getIsvcard() 
    {
        return isvcard;
    }
    public void setRandslat(String randslat) 
    {
        this.randslat = randslat;
    }

    public String getRandslat() 
    {
        return randslat;
    }
    public void setDwid(String dwid) 
    {
        this.dwid = dwid;
    }

    public String getDwid() 
    {
        return dwid;
    }
    public void setEditpass(Long editpass) 
    {
        this.editpass = editpass;
    }

    public Long getEditpass() 
    {
        return editpass;
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
            .append("user", getUser())
            .append("name", getName())
            .append("pass", getPass())
            .append("loginci", getLoginci())
            .append("status", getStatus())
            .append("types", getTypes())
            .append("sex", getSex())
            .append("tel", getTel())
            .append("face", getFace())
            .append("deptid", getDeptid())
            .append("deptname", getDeptname())
            .append("deptids", getDeptids())
            .append("deptnames", getDeptnames())
            .append("rankings", getRankings())
            .append("deptallname", getDeptallname())
            .append("superid", getSuperid())
            .append("superman", getSuperman())
            .append("ranking", getRanking())
            .append("sorts", getSorts())
            .append("deptpath", getDeptpath())
            .append("superpath", getSuperpath())
            .append("groupname", getGroupname())
            .append("mobile", getMobile())
            .append("apptx", getApptx())
            .append("workdate", getWorkdate())
            .append("email", getEmail())
            .append("lastpush", getLastpush())
            .append("adddt", getAdddt())
            .append("weixinid", getWeixinid())
            .append("quitdt", getQuitdt())
            .append("style", getStyle())
            .append("pingyin", getPingyin())
            .append("emailpass", getEmailpass())
            .append("companyid", getCompanyid())
            .append("online", getOnline())
            .append("lastonline", getLastonline())
            .append("isvcard", getIsvcard())
            .append("randslat", getRandslat())
            .append("dwid", getDwid())
            .append("editpass", getEditpass())
            .append("comid", getComid())
            .toString();
    }
}
