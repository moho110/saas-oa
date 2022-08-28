package com.vrmlstudio.finance.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 演示测试模块对象 xinhu_demo
 * 
 * @author VRer
 * @date 2022-02-20
 */
public class XinhuDemo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 省 */
    @Excel(name = "省")
    private String sheng;

    /** 市 */
    @Excel(name = "市")
    private String shi;

    /** 县(区) */
    @Excel(name = "县(区)")
    private String xian;

    /** 申请日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applydt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer uid;

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

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 是否提交 */
    @Excel(name = "是否提交")
    private Integer isturn;

    /** 弹出下来单选 */
    @Excel(name = "弹出下来单选")
    private String tanxuan;

    /** 弹框下拉多选 */
    @Excel(name = "弹框下拉多选")
    private String tanxuancheck;

    /** 文件上传1 */
    @Excel(name = "文件上传1")
    private String upfile1;

    /** 文件上传2 */
    @Excel(name = "文件上传2")
    private String upfile2;

    /** 测试字段 */
    @Excel(name = "测试字段")
    private String testfirs;

    /** 客户 */
    @Excel(name = "客户")
    private String custname;

    /** 客户id */
    @Excel(name = "客户id")
    private Long custid;

    /** 金额 */
    @Excel(name = "金额")
    private BigDecimal money;

    /** 单选弹出选择id */
    @Excel(name = "单选弹出选择id")
    private Integer tanxuanid;

    /** 封面图片 */
    @Excel(name = "封面图片")
    private String fengmian;

    /** 编号 */
    @Excel(name = "编号")
    private String num;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long mid;

    /** 对应单位id */
    @Excel(name = "对应单位id")
    private Integer comid;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long sort;

    /** 0多行子表1,1多行子表2 */
    @Excel(name = "0多行子表1,1多行子表2")
    private Integer sslx;

    /** html编辑器 */
    @Excel(name = "html编辑器")
    private String htmlcont;

    /** 选择人员 */
    @Excel(name = "选择人员")
    private String xuanren;

    /** 选择人员的ID */
    @Excel(name = "选择人员的ID")
    private String xuanrenid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSheng(String sheng) 
    {
        this.sheng = sheng;
    }

    public String getSheng() 
    {
        return sheng;
    }
    public void setShi(String shi) 
    {
        this.shi = shi;
    }

    public String getShi() 
    {
        return shi;
    }
    public void setXian(String xian) 
    {
        this.xian = xian;
    }

    public String getXian() 
    {
        return xian;
    }
    public void setApplydt(Date applydt) 
    {
        this.applydt = applydt;
    }

    public Date getApplydt() 
    {
        return applydt;
    }
    public void setUid(Integer uid) 
    {
        this.uid = uid;
    }

    public Integer getUid() 
    {
        return uid;
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
    public void setTanxuan(String tanxuan) 
    {
        this.tanxuan = tanxuan;
    }

    public String getTanxuan() 
    {
        return tanxuan;
    }
    public void setTanxuancheck(String tanxuancheck) 
    {
        this.tanxuancheck = tanxuancheck;
    }

    public String getTanxuancheck() 
    {
        return tanxuancheck;
    }
    public void setUpfile1(String upfile1) 
    {
        this.upfile1 = upfile1;
    }

    public String getUpfile1() 
    {
        return upfile1;
    }
    public void setUpfile2(String upfile2) 
    {
        this.upfile2 = upfile2;
    }

    public String getUpfile2() 
    {
        return upfile2;
    }
    public void setTestfirs(String testfirs) 
    {
        this.testfirs = testfirs;
    }

    public String getTestfirs() 
    {
        return testfirs;
    }
    public void setCustname(String custname) 
    {
        this.custname = custname;
    }

    public String getCustname() 
    {
        return custname;
    }
    public void setCustid(Long custid) 
    {
        this.custid = custid;
    }

    public Long getCustid() 
    {
        return custid;
    }
    public void setMoney(BigDecimal money) 
    {
        this.money = money;
    }

    public BigDecimal getMoney() 
    {
        return money;
    }
    public void setTanxuanid(Integer tanxuanid) 
    {
        this.tanxuanid = tanxuanid;
    }

    public Integer getTanxuanid() 
    {
        return tanxuanid;
    }
    public void setFengmian(String fengmian) 
    {
        this.fengmian = fengmian;
    }

    public String getFengmian() 
    {
        return fengmian;
    }
    public void setNum(String num) 
    {
        this.num = num;
    }

    public String getNum() 
    {
        return num;
    }
    public void setMid(Long mid) 
    {
        this.mid = mid;
    }

    public Long getMid() 
    {
        return mid;
    }
    public void setComid(Integer comid) 
    {
        this.comid = comid;
    }

    public Integer getComid() 
    {
        return comid;
    }
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
    }
    public void setSslx(Integer sslx) 
    {
        this.sslx = sslx;
    }

    public Integer getSslx() 
    {
        return sslx;
    }
    public void setHtmlcont(String htmlcont) 
    {
        this.htmlcont = htmlcont;
    }

    public String getHtmlcont() 
    {
        return htmlcont;
    }
    public void setXuanren(String xuanren) 
    {
        this.xuanren = xuanren;
    }

    public String getXuanren() 
    {
        return xuanren;
    }
    public void setXuanrenid(String xuanrenid) 
    {
        this.xuanrenid = xuanrenid;
    }

    public String getXuanrenid() 
    {
        return xuanrenid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sheng", getSheng())
            .append("shi", getShi())
            .append("xian", getXian())
            .append("applydt", getApplydt())
            .append("uid", getUid())
            .append("optdt", getOptdt())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("content", getContent())
            .append("status", getStatus())
            .append("isturn", getIsturn())
            .append("tanxuan", getTanxuan())
            .append("tanxuancheck", getTanxuancheck())
            .append("upfile1", getUpfile1())
            .append("upfile2", getUpfile2())
            .append("testfirs", getTestfirs())
            .append("custname", getCustname())
            .append("custid", getCustid())
            .append("money", getMoney())
            .append("tanxuanid", getTanxuanid())
            .append("fengmian", getFengmian())
            .append("num", getNum())
            .append("mid", getMid())
            .append("comid", getComid())
            .append("sort", getSort())
            .append("sslx", getSslx())
            .append("htmlcont", getHtmlcont())
            .append("xuanren", getXuanren())
            .append("xuanrenid", getXuanrenid())
            .toString();
    }
}
