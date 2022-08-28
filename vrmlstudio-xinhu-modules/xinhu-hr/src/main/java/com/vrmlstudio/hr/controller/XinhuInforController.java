package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuInfor;
import com.vrmlstudio.hr.service.IXinhuInforService;
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
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 通知公告Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/infor")
public class XinhuInforController extends BaseController
{
    @Autowired
    private IXinhuInforService xinhuInforService;

    /**
     * 查询通知公告列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:infor:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuInfor xinhuInfor)
    {
        startPage();
        List<XinhuInfor> list = xinhuInforService.selectXinhuInforList(xinhuInfor);
        return getDataTable(list);
    }

    /**
     * 导出通知公告列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:infor:export')")
    @Log(title = "通知公告", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuInfor xinhuInfor)
    {
        List<XinhuInfor> list = xinhuInforService.selectXinhuInforList(xinhuInfor);
        ExcelUtil<XinhuInfor> util = new ExcelUtil<XinhuInfor>(XinhuInfor.class);
        util.exportExcel(response, list, "通知公告数据");
    }

    /**
     * 获取通知公告详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:infor:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuInforService.selectXinhuInforById(id));
    }

    /**
     * 新增通知公告
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:infor:add')")
    @Log(title = "通知公告", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuInfor xinhuInfor)
    {
        return toAjax(xinhuInforService.insertXinhuInfor(xinhuInfor));
    }

    /**
     * 修改通知公告
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:infor:edit')")
    @Log(title = "通知公告", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuInfor xinhuInfor)
    {
        return toAjax(xinhuInforService.updateXinhuInfor(xinhuInfor));
    }

    /**
     * 删除通知公告
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:infor:remove')")
    @Log(title = "通知公告", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuInforService.deleteXinhuInforByIds(ids));
    }
}
