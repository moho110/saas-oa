package com.vrmlstudio.hr.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 考勤机上人员对象 xinhu_kqjuser
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuKqjuser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 设备ID */
    @Excel(name = "设备ID")
    private Long snid;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long uid;

    /** 指纹1 */
    @Excel(name = "指纹1")
    private String fingerprint1;

    /** 指纹2 */
    @Excel(name = "指纹2")
    private String fingerprint2;

    /** 头像 */
    @Excel(name = "头像")
    private String headpic;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSnid(Long snid) 
    {
        this.snid = snid;
    }

    public Long getSnid() 
    {
        return snid;
    }
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setFingerprint1(String fingerprint1) 
    {
        this.fingerprint1 = fingerprint1;
    }

    public String getFingerprint1() 
    {
        return fingerprint1;
    }
    public void setFingerprint2(String fingerprint2) 
    {
        this.fingerprint2 = fingerprint2;
    }

    public String getFingerprint2() 
    {
        return fingerprint2;
    }
    public void setHeadpic(String headpic) 
    {
        this.headpic = headpic;
    }

    public String getHeadpic() 
    {
        return headpic;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("snid", getSnid())
            .append("uid", getUid())
            .append("fingerprint1", getFingerprint1())
            .append("fingerprint2", getFingerprint2())
            .append("headpic", getHeadpic())
            .toString();
    }
}
