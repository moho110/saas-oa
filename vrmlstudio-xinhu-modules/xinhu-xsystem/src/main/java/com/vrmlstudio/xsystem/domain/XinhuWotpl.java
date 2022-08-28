package com.vrmlstudio.xsystem.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 微信公众号消息模版对象 xinhu_wotpl
 * 
 * @author VRer
 * @date 2022-02-20
 */
public class XinhuWotpl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 模版消息id */
    @Excel(name = "模版消息id")
    private String templateId;

    /** 模板标题 */
    @Excel(name = "模板标题")
    private String title;

    /** 模板所属行业的一级行业 */
    @Excel(name = "模板所属行业的一级行业")
    private String primaryIndustry;

    /** 模板所属行业的二级行业 */
    @Excel(name = "模板所属行业的二级行业")
    private String deputyIndustry;

    /** 模板内容 */
    @Excel(name = "模板内容")
    private String content;

    /** 模板示例 */
    @Excel(name = "模板示例")
    private String example;

    /** 使用名称 */
    @Excel(name = "使用名称")
    private String modename;

    /** 参数设置 */
    @Excel(name = "参数设置")
    private String modeparams;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTemplateId(String templateId) 
    {
        this.templateId = templateId;
    }

    public String getTemplateId() 
    {
        return templateId;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setPrimaryIndustry(String primaryIndustry) 
    {
        this.primaryIndustry = primaryIndustry;
    }

    public String getPrimaryIndustry() 
    {
        return primaryIndustry;
    }
    public void setDeputyIndustry(String deputyIndustry) 
    {
        this.deputyIndustry = deputyIndustry;
    }

    public String getDeputyIndustry() 
    {
        return deputyIndustry;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setExample(String example) 
    {
        this.example = example;
    }

    public String getExample() 
    {
        return example;
    }
    public void setModename(String modename) 
    {
        this.modename = modename;
    }

    public String getModename() 
    {
        return modename;
    }
    public void setModeparams(String modeparams) 
    {
        this.modeparams = modeparams;
    }

    public String getModeparams() 
    {
        return modeparams;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("templateId", getTemplateId())
            .append("title", getTitle())
            .append("primaryIndustry", getPrimaryIndustry())
            .append("deputyIndustry", getDeputyIndustry())
            .append("content", getContent())
            .append("example", getExample())
            .append("modename", getModename())
            .append("modeparams", getModeparams())
            .append("status", getStatus())
            .toString();
    }
}
