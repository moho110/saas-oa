package com.vrmlstudio.hr.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 工资对象 xinhu_hrsalary
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuHrsalary extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer uid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer xuid;

    /** 对应人 */
    @Excel(name = "对应人")
    private String uname;

    /** 对应人员部门 */
    @Excel(name = "对应人员部门")
    private String udeptname;

    /** 职位 */
    @Excel(name = "职位")
    private String ranking;

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

    /** 月份 */
    @Excel(name = "月份")
    private String month;

    /** 基本工资 */
    @Excel(name = "基本工资")
    private BigDecimal base;

    /** 实发 */
    @Excel(name = "实发")
    private BigDecimal money;

    /** 应发工资 */
    @Excel(name = "应发工资")
    private BigDecimal mones;

    /** 职务津贴 */
    @Excel(name = "职务津贴")
    private BigDecimal postjt;

    /** 技能津贴 */
    @Excel(name = "技能津贴")
    private BigDecimal skilljt;

    /** 交通补贴 */
    @Excel(name = "交通补贴")
    private BigDecimal travelbt;

    /** 通信补贴 */
    @Excel(name = "通信补贴")
    private BigDecimal telbt;

    /** 奖励 */
    @Excel(name = "奖励")
    private BigDecimal reward;

    /** 处罚 */
    @Excel(name = "处罚")
    private BigDecimal punish;

    /** 个人社保 */
    @Excel(name = "个人社保")
    private BigDecimal socials;

    /** 单位社保缴费 */
    @Excel(name = "单位社保缴费")
    private BigDecimal socialsunit;

    /** 个人所得税 */
    @Excel(name = "个人所得税")
    private BigDecimal taxes;

    /** 个税起征点 */
    @Excel(name = "个税起征点")
    private BigDecimal taxbase;

    /** 是否发放 */
    @Excel(name = "是否发放")
    private Integer ispay;

    /** 其它增加 */
    @Excel(name = "其它增加")
    private BigDecimal otherzj;

    /** 其它减少 */
    @Excel(name = "其它减少")
    private BigDecimal otherjs;

    /** 迟到(次) */
    @Excel(name = "迟到(次)")
    private Integer cidao;

    /** 迟到处罚 */
    @Excel(name = "迟到处罚")
    private BigDecimal cidaos;

    /** 早退(次) */
    @Excel(name = "早退(次)")
    private Integer zaotui;

    /** 早退处罚 */
    @Excel(name = "早退处罚")
    private BigDecimal zaotuis;

    /** 请假(小时) */
    @Excel(name = "请假(小时)")
    private Integer leavet;

    /** 请假减少 */
    @Excel(name = "请假减少")
    private BigDecimal leaves;

    /** 加班(小时) */
    @Excel(name = "加班(小时)")
    private Integer jiaban;

    /** 加班补贴 */
    @Excel(name = "加班补贴")
    private BigDecimal jiabans;

    /** 未打卡(次) */
    @Excel(name = "未打卡(次)")
    private Integer weidk;

    /** 未打卡减少 */
    @Excel(name = "未打卡减少")
    private BigDecimal weidks;

    /** 绩效基数 */
    @Excel(name = "绩效基数")
    private BigDecimal jxjs;

    /** 绩效系数 */
    @Excel(name = "绩效系数")
    private BigDecimal jxxs;

    /** 绩效打分 */
    @Excel(name = "绩效打分")
    private BigDecimal jxdf;

    /** 绩效收入 */
    @Excel(name = "绩效收入")
    private BigDecimal jtpost;

    /** 应上班天数 */
    @Excel(name = "应上班天数")
    private BigDecimal ysbtime;

    /** 已上班天数 */
    @Excel(name = "已上班天数")
    private BigDecimal zsbtime;

    /** 公积金个人 */
    @Excel(name = "公积金个人")
    private BigDecimal gonggeren;

    /** 公积金单位 */
    @Excel(name = "公积金单位")
    private BigDecimal gongunit;

    /** 餐补贴 */
    @Excel(name = "餐补贴")
    private BigDecimal foodbt;

    /** 高温津贴 */
    @Excel(name = "高温津贴")
    private BigDecimal hotbt;

    /** 电脑补贴 */
    @Excel(name = "电脑补贴")
    private BigDecimal dnbt;

    /** 计件收入 */
    @Excel(name = "计件收入")
    private BigDecimal jiansr;

    /** 其他补贴 */
    @Excel(name = "其他补贴")
    private BigDecimal otherbt;

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
    public void setXuid(Integer xuid) 
    {
        this.xuid = xuid;
    }

    public Integer getXuid() 
    {
        return xuid;
    }
    public void setUname(String uname) 
    {
        this.uname = uname;
    }

    public String getUname() 
    {
        return uname;
    }
    public void setUdeptname(String udeptname) 
    {
        this.udeptname = udeptname;
    }

    public String getUdeptname() 
    {
        return udeptname;
    }
    public void setRanking(String ranking) 
    {
        this.ranking = ranking;
    }

    public String getRanking() 
    {
        return ranking;
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
    public void setMonth(String month) 
    {
        this.month = month;
    }

    public String getMonth() 
    {
        return month;
    }
    public void setBase(BigDecimal base) 
    {
        this.base = base;
    }

    public BigDecimal getBase() 
    {
        return base;
    }
    public void setMoney(BigDecimal money) 
    {
        this.money = money;
    }

    public BigDecimal getMoney() 
    {
        return money;
    }
    public void setMones(BigDecimal mones) 
    {
        this.mones = mones;
    }

    public BigDecimal getMones() 
    {
        return mones;
    }
    public void setPostjt(BigDecimal postjt) 
    {
        this.postjt = postjt;
    }

    public BigDecimal getPostjt() 
    {
        return postjt;
    }
    public void setSkilljt(BigDecimal skilljt) 
    {
        this.skilljt = skilljt;
    }

    public BigDecimal getSkilljt() 
    {
        return skilljt;
    }
    public void setTravelbt(BigDecimal travelbt) 
    {
        this.travelbt = travelbt;
    }

    public BigDecimal getTravelbt() 
    {
        return travelbt;
    }
    public void setTelbt(BigDecimal telbt) 
    {
        this.telbt = telbt;
    }

    public BigDecimal getTelbt() 
    {
        return telbt;
    }
    public void setReward(BigDecimal reward) 
    {
        this.reward = reward;
    }

    public BigDecimal getReward() 
    {
        return reward;
    }
    public void setPunish(BigDecimal punish) 
    {
        this.punish = punish;
    }

    public BigDecimal getPunish() 
    {
        return punish;
    }
    public void setSocials(BigDecimal socials) 
    {
        this.socials = socials;
    }

    public BigDecimal getSocials() 
    {
        return socials;
    }
    public void setSocialsunit(BigDecimal socialsunit) 
    {
        this.socialsunit = socialsunit;
    }

    public BigDecimal getSocialsunit() 
    {
        return socialsunit;
    }
    public void setTaxes(BigDecimal taxes) 
    {
        this.taxes = taxes;
    }

    public BigDecimal getTaxes() 
    {
        return taxes;
    }
    public void setTaxbase(BigDecimal taxbase) 
    {
        this.taxbase = taxbase;
    }

    public BigDecimal getTaxbase() 
    {
        return taxbase;
    }
    public void setIspay(Integer ispay) 
    {
        this.ispay = ispay;
    }

    public Integer getIspay() 
    {
        return ispay;
    }
    public void setOtherzj(BigDecimal otherzj) 
    {
        this.otherzj = otherzj;
    }

    public BigDecimal getOtherzj() 
    {
        return otherzj;
    }
    public void setOtherjs(BigDecimal otherjs) 
    {
        this.otherjs = otherjs;
    }

    public BigDecimal getOtherjs() 
    {
        return otherjs;
    }
    public void setCidao(Integer cidao) 
    {
        this.cidao = cidao;
    }

    public Integer getCidao() 
    {
        return cidao;
    }
    public void setCidaos(BigDecimal cidaos) 
    {
        this.cidaos = cidaos;
    }

    public BigDecimal getCidaos() 
    {
        return cidaos;
    }
    public void setZaotui(Integer zaotui) 
    {
        this.zaotui = zaotui;
    }

    public Integer getZaotui() 
    {
        return zaotui;
    }
    public void setZaotuis(BigDecimal zaotuis) 
    {
        this.zaotuis = zaotuis;
    }

    public BigDecimal getZaotuis() 
    {
        return zaotuis;
    }
    public void setLeavet(Integer leavet)
    {
        this.leavet = leavet;
    }

    public Integer getLeavet()
    {
        return leavet;
    }
    public void setLeaves(BigDecimal leaves) 
    {
        this.leaves = leaves;
    }

    public BigDecimal getLeaves() 
    {
        return leaves;
    }
    public void setJiaban(Integer jiaban) 
    {
        this.jiaban = jiaban;
    }

    public Integer getJiaban() 
    {
        return jiaban;
    }
    public void setJiabans(BigDecimal jiabans) 
    {
        this.jiabans = jiabans;
    }

    public BigDecimal getJiabans() 
    {
        return jiabans;
    }
    public void setWeidk(Integer weidk) 
    {
        this.weidk = weidk;
    }

    public Integer getWeidk() 
    {
        return weidk;
    }
    public void setWeidks(BigDecimal weidks) 
    {
        this.weidks = weidks;
    }

    public BigDecimal getWeidks() 
    {
        return weidks;
    }
    public void setJxjs(BigDecimal jxjs) 
    {
        this.jxjs = jxjs;
    }

    public BigDecimal getJxjs() 
    {
        return jxjs;
    }
    public void setJxxs(BigDecimal jxxs) 
    {
        this.jxxs = jxxs;
    }

    public BigDecimal getJxxs() 
    {
        return jxxs;
    }
    public void setJxdf(BigDecimal jxdf) 
    {
        this.jxdf = jxdf;
    }

    public BigDecimal getJxdf() 
    {
        return jxdf;
    }
    public void setJtpost(BigDecimal jtpost) 
    {
        this.jtpost = jtpost;
    }

    public BigDecimal getJtpost() 
    {
        return jtpost;
    }
    public void setYsbtime(BigDecimal ysbtime) 
    {
        this.ysbtime = ysbtime;
    }

    public BigDecimal getYsbtime() 
    {
        return ysbtime;
    }
    public void setZsbtime(BigDecimal zsbtime) 
    {
        this.zsbtime = zsbtime;
    }

    public BigDecimal getZsbtime() 
    {
        return zsbtime;
    }
    public void setGonggeren(BigDecimal gonggeren) 
    {
        this.gonggeren = gonggeren;
    }

    public BigDecimal getGonggeren() 
    {
        return gonggeren;
    }
    public void setGongunit(BigDecimal gongunit) 
    {
        this.gongunit = gongunit;
    }

    public BigDecimal getGongunit() 
    {
        return gongunit;
    }
    public void setFoodbt(BigDecimal foodbt) 
    {
        this.foodbt = foodbt;
    }

    public BigDecimal getFoodbt() 
    {
        return foodbt;
    }
    public void setHotbt(BigDecimal hotbt) 
    {
        this.hotbt = hotbt;
    }

    public BigDecimal getHotbt() 
    {
        return hotbt;
    }
    public void setDnbt(BigDecimal dnbt) 
    {
        this.dnbt = dnbt;
    }

    public BigDecimal getDnbt() 
    {
        return dnbt;
    }
    public void setJiansr(BigDecimal jiansr) 
    {
        this.jiansr = jiansr;
    }

    public BigDecimal getJiansr() 
    {
        return jiansr;
    }
    public void setOtherbt(BigDecimal otherbt) 
    {
        this.otherbt = otherbt;
    }

    public BigDecimal getOtherbt() 
    {
        return otherbt;
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
            .append("xuid", getXuid())
            .append("uname", getUname())
            .append("udeptname", getUdeptname())
            .append("ranking", getRanking())
            .append("optdt", getOptdt())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("applydt", getApplydt())
            .append("content", getContent())
            .append("status", getStatus())
            .append("isturn", getIsturn())
            .append("month", getMonth())
            .append("base", getBase())
            .append("money", getMoney())
            .append("mones", getMones())
            .append("postjt", getPostjt())
            .append("skilljt", getSkilljt())
            .append("travelbt", getTravelbt())
            .append("telbt", getTelbt())
            .append("reward", getReward())
            .append("punish", getPunish())
            .append("socials", getSocials())
            .append("socialsunit", getSocialsunit())
            .append("taxes", getTaxes())
            .append("taxbase", getTaxbase())
            .append("ispay", getIspay())
            .append("otherzj", getOtherzj())
            .append("otherjs", getOtherjs())
            .append("cidao", getCidao())
            .append("cidaos", getCidaos())
            .append("zaotui", getZaotui())
            .append("zaotuis", getZaotuis())
            .append("leavet", getLeavet())
            .append("leaves", getLeaves())
            .append("jiaban", getJiaban())
            .append("jiabans", getJiabans())
            .append("weidk", getWeidk())
            .append("weidks", getWeidks())
            .append("jxjs", getJxjs())
            .append("jxxs", getJxxs())
            .append("jxdf", getJxdf())
            .append("jtpost", getJtpost())
            .append("ysbtime", getYsbtime())
            .append("zsbtime", getZsbtime())
            .append("gonggeren", getGonggeren())
            .append("gongunit", getGongunit())
            .append("foodbt", getFoodbt())
            .append("hotbt", getHotbt())
            .append("dnbt", getDnbt())
            .append("jiansr", getJiansr())
            .append("otherbt", getOtherbt())
            .append("comid", getComid())
            .toString();
    }
}
