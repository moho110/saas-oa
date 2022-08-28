package com.vrmlstudio.hr.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * IM聊天消息状态对象 xinhu_im_messzt
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuImMesszt extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 信息id */
    @Excel(name = "信息id")
    private Long mid;

    /** 人员id */
    @Excel(name = "人员id")
    private Long uid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer gid;

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
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setGid(Integer gid) 
    {
        this.gid = gid;
    }

    public Integer getGid() 
    {
        return gid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("mid", getMid())
            .append("uid", getUid())
            .append("gid", getGid())
            .toString();
    }
}
