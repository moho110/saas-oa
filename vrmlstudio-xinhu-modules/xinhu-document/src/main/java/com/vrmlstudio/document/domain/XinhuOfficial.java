package com.vrmlstudio.document.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 公文对象 xinhu_official
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuOfficial extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer uid;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 副标题 */
    @Excel(name = "副标题")
    private String titles;

    /** 类型 */
    @Excel(name = "类型")
    private String types;

    /** 1收文单,0发文单 */
    @Excel(name = "1收文单,0发文单")
    private Integer type;

    /** 等级 */
    @Excel(name = "等级")
    private String grade;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String optname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 来源 */
    @Excel(name = "来源")
    private String receid;

    /** 发给 */
    @Excel(name = "发给")
    private String recename;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applydt;

    /** 编号 */
    @Excel(name = "编号")
    private String num;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer optid;

    /** 说明 */
    @Excel(name = "说明")
    private String contents;

    /** 是否提交 */
    @Excel(name = "是否提交")
    private Integer isturn;

    /** 正文文件Id */
    @Excel(name = "正文文件Id")
    private String filecontid;

    /** 发文字号 */
    @Excel(name = "发文字号")
    private String zinum;

    /** 主送单位 */
    @Excel(name = "主送单位")
    private String unitname;

    /** 发文单位 */
    @Excel(name = "发文单位")
    private String unitsame;

    /** 公文密级 */
    @Excel(name = "公文密级")
    private String miji;

    /** 来文日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "来文日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date laidt;

    /** 抄送单位 */
    @Excel(name = "抄送单位")
    private String chaoname;

    /** 正文上称呼 */
    @Excel(name = "正文上称呼")
    private String zuncheng;

    /** 对应officialhong里id */
    @Excel(name = "对应officialhong里id")
    private Long thid;

    /** 对应印章sealapl里Id */
    @Excel(name = "对应印章sealapl里Id")
    private Long yzid;

    /** 对应分发表officialfa的Id */
    @Excel(name = "对应分发表officialfa的Id")
    private Long ffid;

    /** 截止日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "截止日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date enddt;

    /** 查阅日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "查阅日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startdt;

    /** 对应单位id */
    @Excel(name = "对应单位id")
    private Integer comid;

    /** 分发日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "分发日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date ffdt;

    /** 生成pdf文件id */
    @Excel(name = "生成pdf文件id")
    private Long pdfid;

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
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setTitles(String titles) 
    {
        this.titles = titles;
    }

    public String getTitles() 
    {
        return titles;
    }
    public void setTypes(String types) 
    {
        this.types = types;
    }

    public String getTypes() 
    {
        return types;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }
    public void setGrade(String grade) 
    {
        this.grade = grade;
    }

    public String getGrade() 
    {
        return grade;
    }
    public void setOptname(String optname) 
    {
        this.optname = optname;
    }

    public String getOptname() 
    {
        return optname;
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
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setReceid(String receid) 
    {
        this.receid = receid;
    }

    public String getReceid() 
    {
        return receid;
    }
    public void setRecename(String recename) 
    {
        this.recename = recename;
    }

    public String getRecename() 
    {
        return recename;
    }
    public void setApplydt(Date applydt) 
    {
        this.applydt = applydt;
    }

    public Date getApplydt() 
    {
        return applydt;
    }
    public void setNum(String num) 
    {
        this.num = num;
    }

    public String getNum() 
    {
        return num;
    }
    public void setOptid(Integer optid) 
    {
        this.optid = optid;
    }

    public Integer getOptid() 
    {
        return optid;
    }
    public void setContents(String contents)
    {
        this.contents = contents;
    }

    public String getContents()
    {
        return contents;
    }
    public void setIsturn(Integer isturn) 
    {
        this.isturn = isturn;
    }

    public Integer getIsturn() 
    {
        return isturn;
    }
    public void setFilecontid(String filecontid) 
    {
        this.filecontid = filecontid;
    }

    public String getFilecontid() 
    {
        return filecontid;
    }
    public void setZinum(String zinum) 
    {
        this.zinum = zinum;
    }

    public String getZinum() 
    {
        return zinum;
    }
    public void setUnitname(String unitname) 
    {
        this.unitname = unitname;
    }

    public String getUnitname() 
    {
        return unitname;
    }
    public void setUnitsame(String unitsame) 
    {
        this.unitsame = unitsame;
    }

    public String getUnitsame() 
    {
        return unitsame;
    }
    public void setMiji(String miji) 
    {
        this.miji = miji;
    }

    public String getMiji() 
    {
        return miji;
    }
    public void setLaidt(Date laidt) 
    {
        this.laidt = laidt;
    }

    public Date getLaidt() 
    {
        return laidt;
    }
    public void setChaoname(String chaoname) 
    {
        this.chaoname = chaoname;
    }

    public String getChaoname() 
    {
        return chaoname;
    }
    public void setZuncheng(String zuncheng) 
    {
        this.zuncheng = zuncheng;
    }

    public String getZuncheng() 
    {
        return zuncheng;
    }
    public void setThid(Long thid) 
    {
        this.thid = thid;
    }

    public Long getThid() 
    {
        return thid;
    }
    public void setYzid(Long yzid) 
    {
        this.yzid = yzid;
    }

    public Long getYzid() 
    {
        return yzid;
    }
    public void setFfid(Long ffid) 
    {
        this.ffid = ffid;
    }

    public Long getFfid() 
    {
        return ffid;
    }
    public void setEnddt(Date enddt) 
    {
        this.enddt = enddt;
    }

    public Date getEnddt() 
    {
        return enddt;
    }
    public void setStartdt(Date startdt) 
    {
        this.startdt = startdt;
    }

    public Date getStartdt() 
    {
        return startdt;
    }
    public void setComid(Integer comid) 
    {
        this.comid = comid;
    }

    public Integer getComid() 
    {
        return comid;
    }
    public void setFfdt(Date ffdt) 
    {
        this.ffdt = ffdt;
    }

    public Date getFfdt() 
    {
        return ffdt;
    }
    public void setPdfid(Long pdfid) 
    {
        this.pdfid = pdfid;
    }

    public Long getPdfid() 
    {
        return pdfid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("uid", getUid())
            .append("title", getTitle())
            .append("titles", getTitles())
            .append("types", getTypes())
            .append("type", getType())
            .append("grade", getGrade())
            .append("optname", getOptname())
            .append("optdt", getOptdt())
            .append("status", getStatus())
            .append("content", getContent())
            .append("receid", getReceid())
            .append("recename", getRecename())
            .append("applydt", getApplydt())
            .append("num", getNum())
            .append("optid", getOptid())
            .append("contents", getContents())
            .append("isturn", getIsturn())
            .append("filecontid", getFilecontid())
            .append("zinum", getZinum())
            .append("unitname", getUnitname())
            .append("unitsame", getUnitsame())
            .append("miji", getMiji())
            .append("laidt", getLaidt())
            .append("chaoname", getChaoname())
            .append("zuncheng", getZuncheng())
            .append("thid", getThid())
            .append("yzid", getYzid())
            .append("ffid", getFfid())
            .append("enddt", getEnddt())
            .append("startdt", getStartdt())
            .append("comid", getComid())
            .append("ffdt", getFfdt())
            .append("pdfid", getPdfid())
            .toString();
    }
}
