package com.vrmlstudio.hr.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 社保公积金对象 xinhu_hrshebao
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuHrshebao extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 名称 */
    @Excel(name = "名称")
    private String title;

    /** 适用对象 */
    @Excel(name = "适用对象")
    private String recename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String receid;

    /** 是否开启 */
    @Excel(name = "是否开启")
    private Integer status;

    /** 公积金基数 */
    @Excel(name = "公积金基数")
    private BigDecimal gongjishu;

    /** 养老保险基数 */
    @Excel(name = "养老保险基数")
    private BigDecimal yljishu;

    /** 养老个人比例(%) */
    @Excel(name = "养老个人比例(%)")
    private BigDecimal ylgeren;

    /** 养老单位比例(%) */
    @Excel(name = "养老单位比例(%)")
    private BigDecimal ylunit;

    /** 失业报销基数 */
    @Excel(name = "失业报销基数")
    private BigDecimal syjishu;

    /** 失业个人比例(%) */
    @Excel(name = "失业个人比例(%)")
    private BigDecimal sygeren;

    /** 失业单位比例(%) */
    @Excel(name = "失业单位比例(%)")
    private BigDecimal syunit;

    /** 工伤报销基数 */
    @Excel(name = "工伤报销基数")
    private BigDecimal gsjishu;

    /** 工伤个人比例(%) */
    @Excel(name = "工伤个人比例(%)")
    private BigDecimal gsgeren;

    /** 工伤单位比例(%) */
    @Excel(name = "工伤单位比例(%)")
    private BigDecimal gsunit;

    /** 生育保险基数 */
    @Excel(name = "生育保险基数")
    private BigDecimal syujishu;

    /** 生育个人比例(%) */
    @Excel(name = "生育个人比例(%)")
    private BigDecimal syugeren;

    /** 生育单位比例(%) */
    @Excel(name = "生育单位比例(%)")
    private BigDecimal syuunit;

    /** 医疗报销基数 */
    @Excel(name = "医疗报销基数")
    private BigDecimal yijishu;

    /** 医疗个人比例(%) */
    @Excel(name = "医疗个人比例(%)")
    private BigDecimal yigeren;

    /** 医疗单位比例(%) */
    @Excel(name = "医疗单位比例(%)")
    private BigDecimal yiunit;

    /** 大病个人 */
    @Excel(name = "大病个人")
    private BigDecimal dbgeren;

    /** 公积金个人比例(%) */
    @Excel(name = "公积金个人比例(%)")
    private BigDecimal gjjgeren;

    /** 公积金单位比例(%) */
    @Excel(name = "公积金单位比例(%)")
    private BigDecimal gjjunit;

    /** 个人社保缴费 */
    @Excel(name = "个人社保缴费")
    private BigDecimal shebaogeren;

    /** 单位社保缴费 */
    @Excel(name = "单位社保缴费")
    private BigDecimal shebaounit;

    /** 每月生成时间 */
    @Excel(name = "每月生成时间")
    private String sctime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 公积金个人 */
    @Excel(name = "公积金个人")
    private BigDecimal gonggeren;

    /** 公积金单位 */
    @Excel(name = "公积金单位")
    private BigDecimal gongunit;

    /** 说明 */
    @Excel(name = "说明")
    private String explian;

    /** 开始月份 */
    @Excel(name = "开始月份")
    private String startdt;

    /** 截止月份 */
    @Excel(name = "截止月份")
    private String enddt;

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
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setRecename(String recename) 
    {
        this.recename = recename;
    }

    public String getRecename() 
    {
        return recename;
    }
    public void setReceid(String receid) 
    {
        this.receid = receid;
    }

    public String getReceid() 
    {
        return receid;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setGongjishu(BigDecimal gongjishu) 
    {
        this.gongjishu = gongjishu;
    }

    public BigDecimal getGongjishu() 
    {
        return gongjishu;
    }
    public void setYljishu(BigDecimal yljishu) 
    {
        this.yljishu = yljishu;
    }

    public BigDecimal getYljishu() 
    {
        return yljishu;
    }
    public void setYlgeren(BigDecimal ylgeren) 
    {
        this.ylgeren = ylgeren;
    }

    public BigDecimal getYlgeren() 
    {
        return ylgeren;
    }
    public void setYlunit(BigDecimal ylunit) 
    {
        this.ylunit = ylunit;
    }

    public BigDecimal getYlunit() 
    {
        return ylunit;
    }
    public void setSyjishu(BigDecimal syjishu) 
    {
        this.syjishu = syjishu;
    }

    public BigDecimal getSyjishu() 
    {
        return syjishu;
    }
    public void setSygeren(BigDecimal sygeren) 
    {
        this.sygeren = sygeren;
    }

    public BigDecimal getSygeren() 
    {
        return sygeren;
    }
    public void setSyunit(BigDecimal syunit) 
    {
        this.syunit = syunit;
    }

    public BigDecimal getSyunit() 
    {
        return syunit;
    }
    public void setGsjishu(BigDecimal gsjishu) 
    {
        this.gsjishu = gsjishu;
    }

    public BigDecimal getGsjishu() 
    {
        return gsjishu;
    }
    public void setGsgeren(BigDecimal gsgeren) 
    {
        this.gsgeren = gsgeren;
    }

    public BigDecimal getGsgeren() 
    {
        return gsgeren;
    }
    public void setGsunit(BigDecimal gsunit) 
    {
        this.gsunit = gsunit;
    }

    public BigDecimal getGsunit() 
    {
        return gsunit;
    }
    public void setSyujishu(BigDecimal syujishu) 
    {
        this.syujishu = syujishu;
    }

    public BigDecimal getSyujishu() 
    {
        return syujishu;
    }
    public void setSyugeren(BigDecimal syugeren) 
    {
        this.syugeren = syugeren;
    }

    public BigDecimal getSyugeren() 
    {
        return syugeren;
    }
    public void setSyuunit(BigDecimal syuunit) 
    {
        this.syuunit = syuunit;
    }

    public BigDecimal getSyuunit() 
    {
        return syuunit;
    }
    public void setYijishu(BigDecimal yijishu) 
    {
        this.yijishu = yijishu;
    }

    public BigDecimal getYijishu() 
    {
        return yijishu;
    }
    public void setYigeren(BigDecimal yigeren) 
    {
        this.yigeren = yigeren;
    }

    public BigDecimal getYigeren() 
    {
        return yigeren;
    }
    public void setYiunit(BigDecimal yiunit) 
    {
        this.yiunit = yiunit;
    }

    public BigDecimal getYiunit() 
    {
        return yiunit;
    }
    public void setDbgeren(BigDecimal dbgeren) 
    {
        this.dbgeren = dbgeren;
    }

    public BigDecimal getDbgeren() 
    {
        return dbgeren;
    }
    public void setGjjgeren(BigDecimal gjjgeren) 
    {
        this.gjjgeren = gjjgeren;
    }

    public BigDecimal getGjjgeren() 
    {
        return gjjgeren;
    }
    public void setGjjunit(BigDecimal gjjunit) 
    {
        this.gjjunit = gjjunit;
    }

    public BigDecimal getGjjunit() 
    {
        return gjjunit;
    }
    public void setShebaogeren(BigDecimal shebaogeren) 
    {
        this.shebaogeren = shebaogeren;
    }

    public BigDecimal getShebaogeren() 
    {
        return shebaogeren;
    }
    public void setShebaounit(BigDecimal shebaounit) 
    {
        this.shebaounit = shebaounit;
    }

    public BigDecimal getShebaounit() 
    {
        return shebaounit;
    }
    public void setSctime(String sctime) 
    {
        this.sctime = sctime;
    }

    public String getSctime() 
    {
        return sctime;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
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
    public void setExplian(String explian)
    {
        this.explian = explian;
    }

    public String getExplian()
    {
        return explian;
    }
    public void setStartdt(String startdt) 
    {
        this.startdt = startdt;
    }

    public String getStartdt() 
    {
        return startdt;
    }
    public void setEnddt(String enddt) 
    {
        this.enddt = enddt;
    }

    public String getEnddt() 
    {
        return enddt;
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
            .append("title", getTitle())
            .append("recename", getRecename())
            .append("receid", getReceid())
            .append("status", getStatus())
            .append("gongjishu", getGongjishu())
            .append("yljishu", getYljishu())
            .append("ylgeren", getYlgeren())
            .append("ylunit", getYlunit())
            .append("syjishu", getSyjishu())
            .append("sygeren", getSygeren())
            .append("syunit", getSyunit())
            .append("gsjishu", getGsjishu())
            .append("gsgeren", getGsgeren())
            .append("gsunit", getGsunit())
            .append("syujishu", getSyujishu())
            .append("syugeren", getSyugeren())
            .append("syuunit", getSyuunit())
            .append("yijishu", getYijishu())
            .append("yigeren", getYigeren())
            .append("yiunit", getYiunit())
            .append("dbgeren", getDbgeren())
            .append("gjjgeren", getGjjgeren())
            .append("gjjunit", getGjjunit())
            .append("shebaogeren", getShebaogeren())
            .append("shebaounit", getShebaounit())
            .append("sctime", getSctime())
            .append("optdt", getOptdt())
            .append("gonggeren", getGonggeren())
            .append("gongunit", getGongunit())
            .append("explian", getExplian())
            .append("startdt", getStartdt())
            .append("enddt", getEnddt())
            .append("comid", getComid())
            .toString();
    }
}
