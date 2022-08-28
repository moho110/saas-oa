package com.vrmlstudio.finance.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 日报分析统计对象 xinhu_dailyfx
 * 
 * @author VRer
 * @date 2022-02-20
 */
public class XinhuDailyfx extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long uid;

    /** 月份 */
    @Excel(name = "月份")
    private String month;

    /** 分析时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "分析时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optdt;

    /** 0未写,1已写,2请假,3休息日 */
    @Excel(name = "0未写,1已写,2请假,3休息日")
    private Integer day1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day3;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day4;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day5;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day6;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day7;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day8;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day9;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day10;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day11;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day12;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day13;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day14;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day15;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day16;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day17;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day18;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day19;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day20;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day21;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day22;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day23;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day24;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day25;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day26;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day27;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day28;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day29;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day30;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer day31;

    /** 应写次数 */
    @Excel(name = "应写次数")
    private Integer totaly;

    /** 已写次数 */
    @Excel(name = "已写次数")
    private Integer totalx;

    /** 未写次数 */
    @Excel(name = "未写次数")
    private Integer totalw;

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
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setMonth(String month) 
    {
        this.month = month;
    }

    public String getMonth() 
    {
        return month;
    }
    public void setOptdt(Date optdt) 
    {
        this.optdt = optdt;
    }

    public Date getOptdt() 
    {
        return optdt;
    }
    public void setDay1(Integer day1) 
    {
        this.day1 = day1;
    }

    public Integer getDay1() 
    {
        return day1;
    }
    public void setDay2(Integer day2) 
    {
        this.day2 = day2;
    }

    public Integer getDay2() 
    {
        return day2;
    }
    public void setDay3(Integer day3) 
    {
        this.day3 = day3;
    }

    public Integer getDay3() 
    {
        return day3;
    }
    public void setDay4(Integer day4) 
    {
        this.day4 = day4;
    }

    public Integer getDay4() 
    {
        return day4;
    }
    public void setDay5(Integer day5) 
    {
        this.day5 = day5;
    }

    public Integer getDay5() 
    {
        return day5;
    }
    public void setDay6(Integer day6) 
    {
        this.day6 = day6;
    }

    public Integer getDay6() 
    {
        return day6;
    }
    public void setDay7(Integer day7) 
    {
        this.day7 = day7;
    }

    public Integer getDay7() 
    {
        return day7;
    }
    public void setDay8(Integer day8) 
    {
        this.day8 = day8;
    }

    public Integer getDay8() 
    {
        return day8;
    }
    public void setDay9(Integer day9) 
    {
        this.day9 = day9;
    }

    public Integer getDay9() 
    {
        return day9;
    }
    public void setDay10(Integer day10) 
    {
        this.day10 = day10;
    }

    public Integer getDay10() 
    {
        return day10;
    }
    public void setDay11(Integer day11) 
    {
        this.day11 = day11;
    }

    public Integer getDay11() 
    {
        return day11;
    }
    public void setDay12(Integer day12) 
    {
        this.day12 = day12;
    }

    public Integer getDay12() 
    {
        return day12;
    }
    public void setDay13(Integer day13) 
    {
        this.day13 = day13;
    }

    public Integer getDay13() 
    {
        return day13;
    }
    public void setDay14(Integer day14) 
    {
        this.day14 = day14;
    }

    public Integer getDay14() 
    {
        return day14;
    }
    public void setDay15(Integer day15) 
    {
        this.day15 = day15;
    }

    public Integer getDay15() 
    {
        return day15;
    }
    public void setDay16(Integer day16) 
    {
        this.day16 = day16;
    }

    public Integer getDay16() 
    {
        return day16;
    }
    public void setDay17(Integer day17) 
    {
        this.day17 = day17;
    }

    public Integer getDay17() 
    {
        return day17;
    }
    public void setDay18(Integer day18) 
    {
        this.day18 = day18;
    }

    public Integer getDay18() 
    {
        return day18;
    }
    public void setDay19(Integer day19) 
    {
        this.day19 = day19;
    }

    public Integer getDay19() 
    {
        return day19;
    }
    public void setDay20(Integer day20) 
    {
        this.day20 = day20;
    }

    public Integer getDay20() 
    {
        return day20;
    }
    public void setDay21(Integer day21) 
    {
        this.day21 = day21;
    }

    public Integer getDay21() 
    {
        return day21;
    }
    public void setDay22(Integer day22) 
    {
        this.day22 = day22;
    }

    public Integer getDay22() 
    {
        return day22;
    }
    public void setDay23(Integer day23) 
    {
        this.day23 = day23;
    }

    public Integer getDay23() 
    {
        return day23;
    }
    public void setDay24(Integer day24) 
    {
        this.day24 = day24;
    }

    public Integer getDay24() 
    {
        return day24;
    }
    public void setDay25(Integer day25) 
    {
        this.day25 = day25;
    }

    public Integer getDay25() 
    {
        return day25;
    }
    public void setDay26(Integer day26) 
    {
        this.day26 = day26;
    }

    public Integer getDay26() 
    {
        return day26;
    }
    public void setDay27(Integer day27) 
    {
        this.day27 = day27;
    }

    public Integer getDay27() 
    {
        return day27;
    }
    public void setDay28(Integer day28) 
    {
        this.day28 = day28;
    }

    public Integer getDay28() 
    {
        return day28;
    }
    public void setDay29(Integer day29) 
    {
        this.day29 = day29;
    }

    public Integer getDay29() 
    {
        return day29;
    }
    public void setDay30(Integer day30) 
    {
        this.day30 = day30;
    }

    public Integer getDay30() 
    {
        return day30;
    }
    public void setDay31(Integer day31) 
    {
        this.day31 = day31;
    }

    public Integer getDay31() 
    {
        return day31;
    }
    public void setTotaly(Integer totaly) 
    {
        this.totaly = totaly;
    }

    public Integer getTotaly() 
    {
        return totaly;
    }
    public void setTotalx(Integer totalx) 
    {
        this.totalx = totalx;
    }

    public Integer getTotalx() 
    {
        return totalx;
    }
    public void setTotalw(Integer totalw) 
    {
        this.totalw = totalw;
    }

    public Integer getTotalw() 
    {
        return totalw;
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
            .append("uid", getUid())
            .append("month", getMonth())
            .append("optdt", getOptdt())
            .append("day1", getDay1())
            .append("day2", getDay2())
            .append("day3", getDay3())
            .append("day4", getDay4())
            .append("day5", getDay5())
            .append("day6", getDay6())
            .append("day7", getDay7())
            .append("day8", getDay8())
            .append("day9", getDay9())
            .append("day10", getDay10())
            .append("day11", getDay11())
            .append("day12", getDay12())
            .append("day13", getDay13())
            .append("day14", getDay14())
            .append("day15", getDay15())
            .append("day16", getDay16())
            .append("day17", getDay17())
            .append("day18", getDay18())
            .append("day19", getDay19())
            .append("day20", getDay20())
            .append("day21", getDay21())
            .append("day22", getDay22())
            .append("day23", getDay23())
            .append("day24", getDay24())
            .append("day25", getDay25())
            .append("day26", getDay26())
            .append("day27", getDay27())
            .append("day28", getDay28())
            .append("day29", getDay29())
            .append("day30", getDay30())
            .append("day31", getDay31())
            .append("totaly", getTotaly())
            .append("totalx", getTotalx())
            .append("totalw", getTotalw())
            .append("content", getContent())
            .toString();
    }
}
