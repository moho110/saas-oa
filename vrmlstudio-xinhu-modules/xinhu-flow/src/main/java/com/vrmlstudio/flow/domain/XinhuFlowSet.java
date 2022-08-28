package com.vrmlstudio.flow.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 流程模块对象 xinhu_flow_set
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuFlowSet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 模块名称 */
    @Excel(name = "模块名称")
    private String name;

    /** 模块编号 */
    @Excel(name = "模块编号")
    private String num;

    /** 排序 */
    @Excel(name = "排序")
    private Integer sort;

    /** 对应的表 */
    @Excel(name = "对应的表")
    private String ttable;

    /** 相关条件 */
    @Excel(name = "相关条件")
    private String wheres;

    /** 摘要 */
    @Excel(name = "摘要")
    private String summary;

    /** 应用摘要 */
    @Excel(name = "应用摘要")
    private String summarx;

    /** 分类 */
    @Excel(name = "分类")
    private String types;

    /** pc端提醒 */
    @Excel(name = "pc端提醒")
    private Integer pctx;

    /** app提醒 */
    @Excel(name = "app提醒")
    private Integer mctx;

    /** 微信提醒 */
    @Excel(name = "微信提醒")
    private Integer wxtx;

    /** 是否邮件提醒 */
    @Excel(name = "是否邮件提醒")
    private Integer emtx;

    /** 编号规则 */
    @Excel(name = "编号规则")
    private String sericnum;

    /** 是否有流程 */
    @Excel(name = "是否有流程")
    private Integer isflow;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String receid;

    /** 针对对象 */
    @Excel(name = "针对对象")
    private String recename;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status;

    /** 是否可录入 */
    @Excel(name = "是否可录入")
    private Integer islu;

    /** 多行子表 */
    @Excel(name = "多行子表")
    private String tables;

    /** 多行子表名称 */
    @Excel(name = "多行子表名称")
    private String names;

    /** 状态值设置 */
    @Excel(name = "状态值设置")
    private String statusstr;

    /** 是否关闭操作记录 */
    @Excel(name = "是否关闭操作记录")
    private Integer isgbjl;

    /** 是否不显示查阅记录 */
    @Excel(name = "是否不显示查阅记录")
    private Integer isgbcy;

    /** 是否生成列表页 */
    @Excel(name = "是否生成列表页")
    private Integer isscl;

    /** 更新时是否同步 */
    @Excel(name = "更新时是否同步")
    private Integer isup;

    /** 是否钉钉提醒 */
    @Excel(name = "是否钉钉提醒")
    private Integer ddtx;

    /** 录入页面是否不显示流程图 */
    @Excel(name = "录入页面是否不显示流程图")
    private Integer isbxs;

    /** 列表页状态搜索显示0默认,1必须显示,2显示 */
    @Excel(name = "列表页状态搜索显示0默认,1必须显示,2显示")
    private Integer lbztxs;

    /** 从新提交时0默认，1从新走流程 */
    @Excel(name = "从新提交时0默认，1从新走流程")
    private Integer isflowlx;

    /** 是否自定义抄送 */
    @Excel(name = "是否自定义抄送")
    private Integer iscs;

    /** 超过分钟自动作废 */
    @Excel(name = "超过分钟自动作废")
    private Long zfeitime;

    /** 是否开启评论 */
    @Excel(name = "是否开启评论")
    private Integer ispl;

    /** 是否开启单据提醒设置 */
    @Excel(name = "是否开启单据提醒设置")
    private Integer istxset;

    /** 回执确认0不开启,1必须选择,2可选 */
    @Excel(name = "回执确认0不开启,1必须选择,2可选")
    private Integer ishz;

    /** 是否支持多模版 */
    @Excel(name = "是否支持多模版")
    private Integer istpl;

    /** 默认排序 */
    @Excel(name = "默认排序")
    private String sortdir;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
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
    public void setNum(String num) 
    {
        this.num = num;
    }

    public String getNum() 
    {
        return num;
    }
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
    }
    public void setTtable(String ttable)
    {
        this.ttable = ttable;
    }

    public String getTtable()
    {
        return ttable;
    }
    public void setWhere(String wheres)
    {
        this.wheres = wheres;
    }

    public String getWhere() 
    {
        return wheres;
    }
    public void setSummary(String summary) 
    {
        this.summary = summary;
    }

    public String getSummary() 
    {
        return summary;
    }
    public void setSummarx(String summarx) 
    {
        this.summarx = summarx;
    }

    public String getSummarx() 
    {
        return summarx;
    }
    public void setTypes(String types)
    {
        this.types = types;
    }

    public String getTypes()
    {
        return types;
    }
    public void setPctx(Integer pctx) 
    {
        this.pctx = pctx;
    }

    public Integer getPctx() 
    {
        return pctx;
    }
    public void setMctx(Integer mctx) 
    {
        this.mctx = mctx;
    }

    public Integer getMctx() 
    {
        return mctx;
    }
    public void setWxtx(Integer wxtx) 
    {
        this.wxtx = wxtx;
    }

    public Integer getWxtx() 
    {
        return wxtx;
    }
    public void setEmtx(Integer emtx) 
    {
        this.emtx = emtx;
    }

    public Integer getEmtx() 
    {
        return emtx;
    }
    public void setSericnum(String sericnum) 
    {
        this.sericnum = sericnum;
    }

    public String getSericnum() 
    {
        return sericnum;
    }
    public void setIsflow(Integer isflow) 
    {
        this.isflow = isflow;
    }

    public Integer getIsflow() 
    {
        return isflow;
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
    public void setIslu(Integer islu) 
    {
        this.islu = islu;
    }

    public Integer getIslu() 
    {
        return islu;
    }
    public void setTables(String tables) 
    {
        this.tables = tables;
    }

    public String getTables() 
    {
        return tables;
    }
    public void setNames(String names) 
    {
        this.names = names;
    }

    public String getNames() 
    {
        return names;
    }
    public void setStatusstr(String statusstr) 
    {
        this.statusstr = statusstr;
    }

    public String getStatusstr() 
    {
        return statusstr;
    }
    public void setIsgbjl(Integer isgbjl) 
    {
        this.isgbjl = isgbjl;
    }

    public Integer getIsgbjl() 
    {
        return isgbjl;
    }
    public void setIsgbcy(Integer isgbcy) 
    {
        this.isgbcy = isgbcy;
    }

    public Integer getIsgbcy() 
    {
        return isgbcy;
    }
    public void setIsscl(Integer isscl) 
    {
        this.isscl = isscl;
    }

    public Integer getIsscl() 
    {
        return isscl;
    }
    public void setIsup(Integer isup) 
    {
        this.isup = isup;
    }

    public Integer getIsup() 
    {
        return isup;
    }
    public void setDdtx(Integer ddtx) 
    {
        this.ddtx = ddtx;
    }

    public Integer getDdtx() 
    {
        return ddtx;
    }
    public void setIsbxs(Integer isbxs) 
    {
        this.isbxs = isbxs;
    }

    public Integer getIsbxs() 
    {
        return isbxs;
    }
    public void setLbztxs(Integer lbztxs) 
    {
        this.lbztxs = lbztxs;
    }

    public Integer getLbztxs() 
    {
        return lbztxs;
    }
    public void setIsflowlx(Integer isflowlx) 
    {
        this.isflowlx = isflowlx;
    }

    public Integer getIsflowlx() 
    {
        return isflowlx;
    }
    public void setIscs(Integer iscs) 
    {
        this.iscs = iscs;
    }

    public Integer getIscs() 
    {
        return iscs;
    }
    public void setZfeitime(Long zfeitime) 
    {
        this.zfeitime = zfeitime;
    }

    public Long getZfeitime() 
    {
        return zfeitime;
    }
    public void setIspl(Integer ispl) 
    {
        this.ispl = ispl;
    }

    public Integer getIspl() 
    {
        return ispl;
    }
    public void setIstxset(Integer istxset) 
    {
        this.istxset = istxset;
    }

    public Integer getIstxset() 
    {
        return istxset;
    }
    public void setIshz(Integer ishz) 
    {
        this.ishz = ishz;
    }

    public Integer getIshz() 
    {
        return ishz;
    }
    public void setIstpl(Integer istpl) 
    {
        this.istpl = istpl;
    }

    public Integer getIstpl() 
    {
        return istpl;
    }
    public void setSortdir(String sortdir) 
    {
        this.sortdir = sortdir;
    }

    public String getSortdir() 
    {
        return sortdir;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("num", getNum())
            .append("sort", getSort())
            .append("ttable", getTtable())
            .append("wheres", getWhere())
            .append("summary", getSummary())
            .append("summarx", getSummarx())
            .append("types", getTypes())
            .append("pctx", getPctx())
            .append("mctx", getMctx())
            .append("wxtx", getWxtx())
            .append("emtx", getEmtx())
            .append("sericnum", getSericnum())
            .append("isflow", getIsflow())
            .append("receid", getReceid())
            .append("recename", getRecename())
            .append("optdt", getOptdt())
            .append("status", getStatus())
            .append("islu", getIslu())
            .append("tables", getTables())
            .append("names", getNames())
            .append("statusstr", getStatusstr())
            .append("isgbjl", getIsgbjl())
            .append("isgbcy", getIsgbcy())
            .append("isscl", getIsscl())
            .append("isup", getIsup())
            .append("ddtx", getDdtx())
            .append("isbxs", getIsbxs())
            .append("lbztxs", getLbztxs())
            .append("isflowlx", getIsflowlx())
            .append("iscs", getIscs())
            .append("zfeitime", getZfeitime())
            .append("ispl", getIspl())
            .append("istxset", getIstxset())
            .append("ishz", getIshz())
            .append("istpl", getIstpl())
            .append("sortdir", getSortdir())
            .toString();
    }
}
