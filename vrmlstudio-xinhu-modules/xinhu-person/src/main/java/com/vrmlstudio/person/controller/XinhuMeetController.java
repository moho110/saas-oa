package com.vrmlstudio.person.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vrmlstudio.common.annotation.Log;
import com.vrmlstudio.common.core.controller.BaseController;
import com.vrmlstudio.common.core.domain.AjaxResult;
import com.vrmlstudio.common.enums.BusinessType;
import com.vrmlstudio.person.domain.XinhuMeet;
import com.vrmlstudio.person.service.IXinhuMeetService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 会议Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-person/meet")
public class XinhuMeetController extends BaseController
{
    @Autowired
    private IXinhuMeetService xinhuMeetService;

    /**
     * 查询会议列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:meet:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuMeet xinhuMeet)
    {
        startPage();
        List<XinhuMeet> list = xinhuMeetService.selectXinhuMeetList(xinhuMeet);
        return getDataTable(list);
    }

    /**
     * 导出会议列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:meet:export')")
    @Log(title = "会议", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuMeet xinhuMeet)
    {
        List<XinhuMeet> list = xinhuMeetService.selectXinhuMeetList(xinhuMeet);
        ExcelUtil<XinhuMeet> util = new ExcelUtil<XinhuMeet>(XinhuMeet.class);
        util.exportExcel(response, list, "会议数据");
    }

    /**
     * 获取会议详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:meet:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuMeetService.selectXinhuMeetById(id));
    }

    /**
     * 新增会议
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:meet:add')")
    @Log(title = "会议", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuMeet xinhuMeet)
    {
        return toAjax(xinhuMeetService.insertXinhuMeet(xinhuMeet));
    }

    /**
     * 修改会议
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:meet:edit')")
    @Log(title = "会议", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuMeet xinhuMeet)
    {
        return toAjax(xinhuMeetService.updateXinhuMeet(xinhuMeet));
    }

    /**
     * 删除会议
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:meet:remove')")
    @Log(title = "会议", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuMeetService.deleteXinhuMeetByIds(ids));
    }
}
