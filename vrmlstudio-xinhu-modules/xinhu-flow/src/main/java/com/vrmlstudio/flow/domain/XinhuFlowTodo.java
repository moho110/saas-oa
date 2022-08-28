package com.vrmlstudio.flow.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 单据通知设置对象 xinhu_flow_todo
 * 
 * @author VRer
 * @date 2022-02-18
 */
public class XinhuFlowTodo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 名称标题 */
    @Excel(name = "名称标题")
    private String name;

    /** 编号 */
    @Excel(name = "编号")
    private String num;

    /** 对应模块 */
    @Excel(name = "对应模块")
    private Integer setid;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    /** 对应条件id */
    @Excel(name = "对应条件id")
    private Integer whereid;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String receid;

    /** 通知给 */
    @Excel(name = "通知给")
    private String recename;

    /** 改变字段 */
    @Excel(name = "改变字段")
    private String changefields;

    /** 对应步做id */
    @Excel(name = "对应步做id")
    private String changecourse;

    /** 提交时 */
    @Excel(name = "提交时")
    private Integer boturn;

    /** 编辑时 */
    @Excel(name = "编辑时")
    private Integer boedit;

    /** 字段改变时 */
    @Excel(name = "字段改变时")
    private Integer bochang;

    /** 删除时 */
    @Excel(name = "删除时")
    private Integer bodel;

    /** 作废时 */
    @Excel(name = "作废时")
    private Integer bozuofei;

    /** 步骤处理通过时 */
    @Excel(name = "步骤处理通过时")
    private Integer botong;

    /** 步骤处理不通过时 */
    @Excel(name = "步骤处理不通过时")
    private Integer bobutong;

    /** 处理完成时 */
    @Excel(name = "处理完成时")
    private Integer bofinish;

    /** 追加说明时 */
    @Excel(name = "追加说明时")
    private Integer bozhui;

    /** 流程转办时 */
    @Excel(name = "流程转办时")
    private Integer bozhuan;

    /** 是否通知给提交人 */
    @Excel(name = "是否通知给提交人")
    private Integer toturn;

    /** 是否通知给流程所有参与人 */
    @Excel(name = "是否通知给流程所有参与人")
    private Integer tocourse;

    /** 通知给主表上字段 */
    @Excel(name = "通知给主表上字段")
    private String todofields;

    /** 通知内容摘要 */
    @Excel(name = "通知内容摘要")
    private String summary;

    /** 计划任务 */
    @Excel(name = "计划任务")
    private Integer botask;

    /** 评论时 */
    @Excel(name = "评论时")
    private Integer boping;

    /** 回执时 */
    @Excel(name = "回执时")
    private Integer bohuiz;

    /** 直属上级 */
    @Excel(name = "直属上级")
    private Integer tosuper;

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
    public void setSetid(Integer setid) 
    {
        this.setid = setid;
    }

    public Integer getSetid() 
    {
        return setid;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setWhereid(Integer whereid) 
    {
        this.whereid = whereid;
    }

    public Integer getWhereid() 
    {
        return whereid;
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
    public void setChangefields(String changefields) 
    {
        this.changefields = changefields;
    }

    public String getChangefields() 
    {
        return changefields;
    }
    public void setChangecourse(String changecourse) 
    {
        this.changecourse = changecourse;
    }

    public String getChangecourse() 
    {
        return changecourse;
    }
    public void setBoturn(Integer boturn) 
    {
        this.boturn = boturn;
    }

    public Integer getBoturn() 
    {
        return boturn;
    }
    public void setBoedit(Integer boedit) 
    {
        this.boedit = boedit;
    }

    public Integer getBoedit() 
    {
        return boedit;
    }
    public void setBochang(Integer bochang) 
    {
        this.bochang = bochang;
    }

    public Integer getBochang() 
    {
        return bochang;
    }
    public void setBodel(Integer bodel) 
    {
        this.bodel = bodel;
    }

    public Integer getBodel() 
    {
        return bodel;
    }
    public void setBozuofei(Integer bozuofei) 
    {
        this.bozuofei = bozuofei;
    }

    public Integer getBozuofei() 
    {
        return bozuofei;
    }
    public void setBotong(Integer botong) 
    {
        this.botong = botong;
    }

    public Integer getBotong() 
    {
        return botong;
    }
    public void setBobutong(Integer bobutong) 
    {
        this.bobutong = bobutong;
    }

    public Integer getBobutong() 
    {
        return bobutong;
    }
    public void setBofinish(Integer bofinish) 
    {
        this.bofinish = bofinish;
    }

    public Integer getBofinish() 
    {
        return bofinish;
    }
    public void setBozhui(Integer bozhui) 
    {
        this.bozhui = bozhui;
    }

    public Integer getBozhui() 
    {
        return bozhui;
    }
    public void setBozhuan(Integer bozhuan) 
    {
        this.bozhuan = bozhuan;
    }

    public Integer getBozhuan() 
    {
        return bozhuan;
    }
    public void setToturn(Integer toturn) 
    {
        this.toturn = toturn;
    }

    public Integer getToturn() 
    {
        return toturn;
    }
    public void setTocourse(Integer tocourse) 
    {
        this.tocourse = tocourse;
    }

    public Integer getTocourse() 
    {
        return tocourse;
    }
    public void setTodofields(String todofields) 
    {
        this.todofields = todofields;
    }

    public String getTodofields() 
    {
        return todofields;
    }
    public void setSummary(String summary) 
    {
        this.summary = summary;
    }

    public String getSummary() 
    {
        return summary;
    }
    public void setBotask(Integer botask) 
    {
        this.botask = botask;
    }

    public Integer getBotask() 
    {
        return botask;
    }
    public void setBoping(Integer boping) 
    {
        this.boping = boping;
    }

    public Integer getBoping() 
    {
        return boping;
    }
    public void setBohuiz(Integer bohuiz) 
    {
        this.bohuiz = bohuiz;
    }

    public Integer getBohuiz() 
    {
        return bohuiz;
    }
    public void setTosuper(Integer tosuper) 
    {
        this.tosuper = tosuper;
    }

    public Integer getTosuper() 
    {
        return tosuper;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("num", getNum())
            .append("setid", getSetid())
            .append("content", getContent())
            .append("whereid", getWhereid())
            .append("status", getStatus())
            .append("receid", getReceid())
            .append("recename", getRecename())
            .append("changefields", getChangefields())
            .append("changecourse", getChangecourse())
            .append("boturn", getBoturn())
            .append("boedit", getBoedit())
            .append("bochang", getBochang())
            .append("bodel", getBodel())
            .append("bozuofei", getBozuofei())
            .append("botong", getBotong())
            .append("bobutong", getBobutong())
            .append("bofinish", getBofinish())
            .append("bozhui", getBozhui())
            .append("bozhuan", getBozhuan())
            .append("toturn", getToturn())
            .append("tocourse", getTocourse())
            .append("todofields", getTodofields())
            .append("summary", getSummary())
            .append("botask", getBotask())
            .append("boping", getBoping())
            .append("bohuiz", getBohuiz())
            .append("tosuper", getTosuper())
            .toString();
    }
}
