package com.vrmlstudio.xsystem.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * REIM即时通讯平台用户对象 xinhu_zreim_user
 * 
 * @author VRer
 * @date 2022-02-20
 */
public class XinhuZreimUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String user;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String position;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String mobile;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String email;

    /** 状态@1|已关注,2|已冻结,0|未关注 */
    @Excel(name = "状态@1|已关注,2|已冻结,0|未关注")
    private Integer status;

    /** 部门id */
    @Excel(name = "部门id")
    private Long deptid;

    /** 头像 */
    @Excel(name = "头像")
    private String face;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String tel;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUser(String user) 
    {
        this.user = user;
    }

    public String getUser() 
    {
        return user;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPosition(String position) 
    {
        this.position = position;
    }

    public String getPosition() 
    {
        return position;
    }
    public void setMobile(String mobile) 
    {
        this.mobile = mobile;
    }

    public String getMobile() 
    {
        return mobile;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setDeptid(Long deptid) 
    {
        this.deptid = deptid;
    }

    public Long getDeptid() 
    {
        return deptid;
    }
    public void setFace(String face) 
    {
        this.face = face;
    }

    public String getFace() 
    {
        return face;
    }
    public void setTel(String tel) 
    {
        this.tel = tel;
    }

    public String getTel() 
    {
        return tel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("user", getUser())
            .append("name", getName())
            .append("position", getPosition())
            .append("mobile", getMobile())
            .append("email", getEmail())
            .append("status", getStatus())
            .append("deptid", getDeptid())
            .append("face", getFace())
            .append("tel", getTel())
            .toString();
    }
}
