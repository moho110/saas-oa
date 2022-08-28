package com.vrmlstudio.xsystem.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 人脸识别对象 xinhu_wxtx_renlian
 * 
 * @author VRer
 * @date 2022-02-20
 */
public class XinhuWxtxRenlian extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String personname;

    /** 人员id */
    @Excel(name = "人员id")
    private String personid;

    /** 性别 */
    @Excel(name = "性别")
    private Integer gender;

    /** 包含的人脸照片列表 */
    @Excel(name = "包含的人脸照片列表")
    private String faceids;

    /** 是否启用 */
    @Excel(name = "是否启用")
    private Integer status;

    /** 关联用户ID */
    @Excel(name = "关联用户ID")
    private Long uid;

    /** 人脸图片 */
    @Excel(name = "人脸图片")
    private String imgurl;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPersonname(String personname) 
    {
        this.personname = personname;
    }

    public String getPersonname() 
    {
        return personname;
    }
    public void setPersonid(String personid) 
    {
        this.personid = personid;
    }

    public String getPersonid() 
    {
        return personid;
    }
    public void setGender(Integer gender) 
    {
        this.gender = gender;
    }

    public Integer getGender() 
    {
        return gender;
    }
    public void setFaceids(String faceids) 
    {
        this.faceids = faceids;
    }

    public String getFaceids() 
    {
        return faceids;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setImgurl(String imgurl) 
    {
        this.imgurl = imgurl;
    }

    public String getImgurl() 
    {
        return imgurl;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("personname", getPersonname())
            .append("personid", getPersonid())
            .append("gender", getGender())
            .append("faceids", getFaceids())
            .append("status", getStatus())
            .append("uid", getUid())
            .append("imgurl", getImgurl())
            .toString();
    }
}
