package com.vrmlstudio.police.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 上传文件记录对象 xinhu_file
 * 
 * @author VRer
 * @date 2022-02-19
 */
public class XinhuFile extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 文件编号 */
    @Excel(name = "文件编号")
    private String filenum;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer valid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String filename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String filetype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fileext;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long filesize;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String filesizecn;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String filepath;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String thumbpath;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long optid;

    /** 上传者 */
    @Excel(name = "上传者")
    private String optname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date adddt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ip;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String web;

    /** 对应类型 */
    @Excel(name = "对应类型")
    private String mtype;

    /** 管理id */
    @Excel(name = "管理id")
    private Long mid;

    /** 下载次数 */
    @Excel(name = "下载次数")
    private Long downci;

    /** 对应序号邮件附件中用到 */
    @Excel(name = "对应序号邮件附件中用到")
    private String keyoi;

    /** 转pdf后路径 */
    @Excel(name = "转pdf后路径")
    private String pdfpath;

    /** 旧ID */
    @Excel(name = "旧ID")
    private Long oid;

    /** 模块编号 */
    @Excel(name = "模块编号")
    private String mknum;

    /** 所属单位 */
    @Excel(name = "所属单位")
    private Integer comid;

    /** 上传到平台上缩略图 */
    @Excel(name = "上传到平台上缩略图")
    private String thumbplat;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String onlynum;

    /** 远程路径 */
    @Excel(name = "远程路径")
    private String filepathout;

    /** 说明 */
    @Excel(name = "说明")
    private String content;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setFilenum(String filenum) 
    {
        this.filenum = filenum;
    }

    public String getFilenum() 
    {
        return filenum;
    }
    public void setValid(Integer valid) 
    {
        this.valid = valid;
    }

    public Integer getValid() 
    {
        return valid;
    }
    public void setFilename(String filename) 
    {
        this.filename = filename;
    }

    public String getFilename() 
    {
        return filename;
    }
    public void setFiletype(String filetype) 
    {
        this.filetype = filetype;
    }

    public String getFiletype() 
    {
        return filetype;
    }
    public void setFileext(String fileext) 
    {
        this.fileext = fileext;
    }

    public String getFileext() 
    {
        return fileext;
    }
    public void setFilesize(Long filesize) 
    {
        this.filesize = filesize;
    }

    public Long getFilesize() 
    {
        return filesize;
    }
    public void setFilesizecn(String filesizecn) 
    {
        this.filesizecn = filesizecn;
    }

    public String getFilesizecn() 
    {
        return filesizecn;
    }
    public void setFilepath(String filepath) 
    {
        this.filepath = filepath;
    }

    public String getFilepath() 
    {
        return filepath;
    }
    public void setThumbpath(String thumbpath) 
    {
        this.thumbpath = thumbpath;
    }

    public String getThumbpath() 
    {
        return thumbpath;
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
    public void setAdddt(Date adddt) 
    {
        this.adddt = adddt;
    }

    public Date getAdddt() 
    {
        return adddt;
    }
    public void setIp(String ip) 
    {
        this.ip = ip;
    }

    public String getIp() 
    {
        return ip;
    }
    public void setWeb(String web) 
    {
        this.web = web;
    }

    public String getWeb() 
    {
        return web;
    }
    public void setMtype(String mtype) 
    {
        this.mtype = mtype;
    }

    public String getMtype() 
    {
        return mtype;
    }
    public void setMid(Long mid) 
    {
        this.mid = mid;
    }

    public Long getMid() 
    {
        return mid;
    }
    public void setDownci(Long downci) 
    {
        this.downci = downci;
    }

    public Long getDownci() 
    {
        return downci;
    }
    public void setKeyoi(String keyoi) 
    {
        this.keyoi = keyoi;
    }

    public String getKeyoi() 
    {
        return keyoi;
    }
    public void setPdfpath(String pdfpath) 
    {
        this.pdfpath = pdfpath;
    }

    public String getPdfpath() 
    {
        return pdfpath;
    }
    public void setOid(Long oid) 
    {
        this.oid = oid;
    }

    public Long getOid() 
    {
        return oid;
    }
    public void setMknum(String mknum) 
    {
        this.mknum = mknum;
    }

    public String getMknum() 
    {
        return mknum;
    }
    public void setComid(Integer comid) 
    {
        this.comid = comid;
    }

    public Integer getComid() 
    {
        return comid;
    }
    public void setThumbplat(String thumbplat) 
    {
        this.thumbplat = thumbplat;
    }

    public String getThumbplat() 
    {
        return thumbplat;
    }
    public void setOnlynum(String onlynum) 
    {
        this.onlynum = onlynum;
    }

    public String getOnlynum() 
    {
        return onlynum;
    }
    public void setFilepathout(String filepathout) 
    {
        this.filepathout = filepathout;
    }

    public String getFilepathout() 
    {
        return filepathout;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("filenum", getFilenum())
            .append("valid", getValid())
            .append("filename", getFilename())
            .append("filetype", getFiletype())
            .append("fileext", getFileext())
            .append("filesize", getFilesize())
            .append("filesizecn", getFilesizecn())
            .append("filepath", getFilepath())
            .append("thumbpath", getThumbpath())
            .append("optid", getOptid())
            .append("optname", getOptname())
            .append("adddt", getAdddt())
            .append("ip", getIp())
            .append("web", getWeb())
            .append("mtype", getMtype())
            .append("mid", getMid())
            .append("downci", getDownci())
            .append("keyoi", getKeyoi())
            .append("pdfpath", getPdfpath())
            .append("oid", getOid())
            .append("mknum", getMknum())
            .append("comid", getComid())
            .append("thumbplat", getThumbplat())
            .append("onlynum", getOnlynum())
            .append("filepathout", getFilepathout())
            .append("content", getContent())
            .toString();
    }
}
