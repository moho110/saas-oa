package com.vrmlstudio.hr.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 培训出题考试对象 xinhu_knowtraim
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuKnowtraim extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long optid;

    /** 操作人 */
    @Excel(name = "操作人")
    private String optname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** 多选题目数量 */
    @Excel(name = "多选题目数量")
    private Integer dxshu;

    /** 单选题目数量 */
    @Excel(name = "单选题目数量")
    private Integer dsshu;

    /** 判断题数 */
    @Excel(name = "判断题数")
    private Integer pdshu;

    /** 培训人数 */
    @Excel(name = "培训人数")
    private Integer reshu;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startdt;

    /** 截止时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "截止时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date enddt;

    /** 考试时间(分钟) */
    @Excel(name = "考试时间(分钟)")
    private Integer kstime;

    /** 已答题人数 */
    @Excel(name = "已答题人数")
    private Integer ydshu;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String receid;

    /** 发给谁培训 */
    @Excel(name = "发给谁培训")
    private String recename;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** 0还没开始,1考试中,2已结束 */
    @Excel(name = "0还没开始,1考试中,2已结束")
    private Integer state;

    /** 总分 */
    @Excel(name = "总分")
    private Long zfenshu;

    /** 合格分数 */
    @Excel(name = "合格分数")
    private Long hgfen;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String tikuid;

    /** 对应题库 */
    @Excel(name = "对应题库")
    private String tikuname;

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
    public void setOptid(Long optid) 
    {
        this.optid = optid;
    }

    public Long getOptid() 
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
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setDxshu(Integer dxshu) 
    {
        this.dxshu = dxshu;
    }

    public Integer getDxshu() 
    {
        return dxshu;
    }
    public void setDsshu(Integer dsshu) 
    {
        this.dsshu = dsshu;
    }

    public Integer getDsshu() 
    {
        return dsshu;
    }
    public void setPdshu(Integer pdshu) 
    {
        this.pdshu = pdshu;
    }

    public Integer getPdshu() 
    {
        return pdshu;
    }
    public void setReshu(Integer reshu) 
    {
        this.reshu = reshu;
    }

    public Integer getReshu() 
    {
        return reshu;
    }
    public void setStartdt(Date startdt) 
    {
        this.startdt = startdt;
    }

    public Date getStartdt() 
    {
        return startdt;
    }
    public void setEnddt(Date enddt) 
    {
        this.enddt = enddt;
    }

    public Date getEnddt() 
    {
        return enddt;
    }
    public void setKstime(Integer kstime) 
    {
        this.kstime = kstime;
    }

    public Integer getKstime() 
    {
        return kstime;
    }
    public void setYdshu(Integer ydshu) 
    {
        this.ydshu = ydshu;
    }

    public Integer getYdshu() 
    {
        return ydshu;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
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
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setState(Integer state) 
    {
        this.state = state;
    }

    public Integer getState() 
    {
        return state;
    }
    public void setZfenshu(Long zfenshu) 
    {
        this.zfenshu = zfenshu;
    }

    public Long getZfenshu() 
    {
        return zfenshu;
    }
    public void setHgfen(Long hgfen) 
    {
        this.hgfen = hgfen;
    }

    public Long getHgfen() 
    {
        return hgfen;
    }
    public void setTikuid(String tikuid) 
    {
        this.tikuid = tikuid;
    }

    public String getTikuid() 
    {
        return tikuid;
    }
    public void setTikuname(String tikuname) 
    {
        this.tikuname = tikuname;
    }

    public String getTikuname() 
    {
        return tikuname;
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
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("optdt", getOptdt())
            .append("dxshu", getDxshu())
            .append("dsshu", getDsshu())
            .append("pdshu", getPdshu())
            .append("reshu", getReshu())
            .append("startdt", getStartdt())
            .append("enddt", getEnddt())
            .append("kstime", getKstime())
            .append("ydshu", getYdshu())
            .append("status", getStatus())
            .append("receid", getReceid())
            .append("recename", getRecename())
            .append("content", getContent())
            .append("state", getState())
            .append("zfenshu", getZfenshu())
            .append("hgfen", getHgfen())
            .append("tikuid", getTikuid())
            .append("tikuname", getTikuname())
            .append("comid", getComid())
            .toString();
    }
}
