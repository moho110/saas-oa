package com.vrmlstudio.flow.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 流程步骤对象 xinhu_flow_course
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuFlowCourse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 上级ID */
    @Excel(name = "上级ID")
    private Long mid;

    /** 下级步骤ID */
    @Excel(name = "下级步骤ID")
    private Long nid;

    /** 模块ID */
    @Excel(name = "模块ID")
    private Integer setid;

    /** 步骤名称 */
    @Excel(name = "步骤名称")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String num;

    /** 审核人类型 */
    @Excel(name = "审核人类型")
    private String checktype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String checktypeid;

    /** 审核人 */
    @Excel(name = "审核人")
    private String checktypename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer sort;

    /** 流程模块条件下的Id */
    @Excel(name = "流程模块条件下的Id")
    private Integer whereid;

    /** 审核条件 */
    @Excel(name = "审核条件")
    private String wheres;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date optdt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status;

    /** 审核动作 */
    @Excel(name = "审核动作")
    private String courseact;

    /** 至少几人审核 ,0全部 */
    @Excel(name = "至少几人审核 ,0全部")
    private Integer checkshu;

    /** 审核处理表单 */
    @Excel(name = "审核处理表单")
    private String checkfields;

    /** 上级Id(弃用) */
    @Excel(name = "上级Id(弃用)")
    private Integer pid;

    /** 操作人id */
    @Excel(name = "操作人id")
    private Integer optid;

    /** 操作人姓名 */
    @Excel(name = "操作人姓名")
    private String optname;

    /** 适用对象id */
    @Excel(name = "适用对象id")
    private String receid;

    /** 适用对象 */
    @Excel(name = "适用对象")
    private String recename;

    /** 是否可以转给他人办理 */
    @Excel(name = "是否可以转给他人办理")
    private Integer iszf;

    /** 手写签名0不用,1都需要,2只需要通过,3只需要不通过 */
    @Excel(name = "手写签名0不用,1都需要,2只需要通过,3只需要不通过")
    private Integer isqm;

    /** 审批方式0顺序,1前置审批,2后置审批 */
    @Excel(name = "审批方式0顺序,1前置审批,2后置审批")
    private Integer coursetype;

    /** 超时时间(分钟) */
    @Excel(name = "超时时间(分钟)")
    private Long zshtime;

    /** 自动审核类型 */
    @Excel(name = "自动审核类型")
    private Integer zshstate;

    /** 转办人员可选范围 */
    @Excel(name = "转办人员可选范围")
    private String zbrangeame;

    /** 转办人员可选范围ID */
    @Excel(name = "转办人员可选范围ID")
    private String zbrangeid;

    /** 处理说明类型 */
    @Excel(name = "处理说明类型")
    private Integer smlx;

    /** 相关文件类型 */
    @Excel(name = "相关文件类型")
    private Integer wjlx;

    /** 审批时是否可直接编辑附件 */
    @Excel(name = "审批时是否可直接编辑附件")
    private Integer isxgfj;

    /** 抄送类型 */
    @Excel(name = "抄送类型")
    private Integer cslx;

    /** 抄送范围 */
    @Excel(name = "抄送范围")
    private String csfwname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String csfwid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMid(Long mid) 
    {
        this.mid = mid;
    }

    public Long getMid() 
    {
        return mid;
    }
    public void setNid(Long nid) 
    {
        this.nid = nid;
    }

    public Long getNid() 
    {
        return nid;
    }
    public void setSetid(Integer setid) 
    {
        this.setid = setid;
    }

    public Integer getSetid() 
    {
        return setid;
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
    public void setChecktype(String checktype) 
    {
        this.checktype = checktype;
    }

    public String getChecktype() 
    {
        return checktype;
    }
    public void setChecktypeid(String checktypeid) 
    {
        this.checktypeid = checktypeid;
    }

    public String getChecktypeid() 
    {
        return checktypeid;
    }
    public void setChecktypename(String checktypename) 
    {
        this.checktypename = checktypename;
    }

    public String getChecktypename() 
    {
        return checktypename;
    }
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
    }
    public void setWhereid(Integer whereid) 
    {
        this.whereid = whereid;
    }

    public Integer getWhereid() 
    {
        return whereid;
    }
    public void setWhere(String wheres)
    {
        this.wheres = wheres;
    }

    public String getWhere() 
    {
        return wheres;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
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
    public void setCourseact(String courseact) 
    {
        this.courseact = courseact;
    }

    public String getCourseact() 
    {
        return courseact;
    }
    public void setCheckshu(Integer checkshu) 
    {
        this.checkshu = checkshu;
    }

    public Integer getCheckshu() 
    {
        return checkshu;
    }
    public void setCheckfields(String checkfields) 
    {
        this.checkfields = checkfields;
    }

    public String getCheckfields() 
    {
        return checkfields;
    }
    public void setPid(Integer pid) 
    {
        this.pid = pid;
    }

    public Integer getPid() 
    {
        return pid;
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
    public void setIszf(Integer iszf) 
    {
        this.iszf = iszf;
    }

    public Integer getIszf() 
    {
        return iszf;
    }
    public void setIsqm(Integer isqm) 
    {
        this.isqm = isqm;
    }

    public Integer getIsqm() 
    {
        return isqm;
    }
    public void setCoursetype(Integer coursetype) 
    {
        this.coursetype = coursetype;
    }

    public Integer getCoursetype() 
    {
        return coursetype;
    }
    public void setZshtime(Long zshtime) 
    {
        this.zshtime = zshtime;
    }

    public Long getZshtime() 
    {
        return zshtime;
    }
    public void setZshstate(Integer zshstate) 
    {
        this.zshstate = zshstate;
    }

    public Integer getZshstate() 
    {
        return zshstate;
    }
    public void setZbrangeame(String zbrangeame) 
    {
        this.zbrangeame = zbrangeame;
    }

    public String getZbrangeame() 
    {
        return zbrangeame;
    }
    public void setZbrangeid(String zbrangeid) 
    {
        this.zbrangeid = zbrangeid;
    }

    public String getZbrangeid() 
    {
        return zbrangeid;
    }
    public void setSmlx(Integer smlx) 
    {
        this.smlx = smlx;
    }

    public Integer getSmlx() 
    {
        return smlx;
    }
    public void setWjlx(Integer wjlx) 
    {
        this.wjlx = wjlx;
    }

    public Integer getWjlx() 
    {
        return wjlx;
    }
    public void setIsxgfj(Integer isxgfj) 
    {
        this.isxgfj = isxgfj;
    }

    public Integer getIsxgfj() 
    {
        return isxgfj;
    }
    public void setCslx(Integer cslx) 
    {
        this.cslx = cslx;
    }

    public Integer getCslx() 
    {
        return cslx;
    }
    public void setCsfwname(String csfwname) 
    {
        this.csfwname = csfwname;
    }

    public String getCsfwname() 
    {
        return csfwname;
    }
    public void setCsfwid(String csfwid) 
    {
        this.csfwid = csfwid;
    }

    public String getCsfwid() 
    {
        return csfwid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("mid", getMid())
            .append("nid", getNid())
            .append("setid", getSetid())
            .append("name", getName())
            .append("num", getNum())
            .append("checktype", getChecktype())
            .append("checktypeid", getChecktypeid())
            .append("checktypename", getChecktypename())
            .append("sort", getSort())
            .append("whereid", getWhereid())
            .append("wheres", getWhere())
            .append("content", getContent())
            .append("optdt", getOptdt())
            .append("status", getStatus())
            .append("courseact", getCourseact())
            .append("checkshu", getCheckshu())
            .append("checkfields", getCheckfields())
            .append("pid", getPid())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("receid", getReceid())
            .append("recename", getRecename())
            .append("iszf", getIszf())
            .append("isqm", getIsqm())
            .append("coursetype", getCoursetype())
            .append("zshtime", getZshtime())
            .append("zshstate", getZshstate())
            .append("zbrangeame", getZbrangeame())
            .append("zbrangeid", getZbrangeid())
            .append("smlx", getSmlx())
            .append("wjlx", getWjlx())
            .append("isxgfj", getIsxgfj())
            .append("cslx", getCslx())
            .append("csfwname", getCsfwname())
            .append("csfwid", getCsfwid())
            .toString();
    }
}
