package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuImMess;
import com.vrmlstudio.hr.service.IXinhuImMessService;
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
 * IM聊天记录Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/mess")
public class XinhuImMessController extends BaseController
{
    @Autowired
    private IXinhuImMessService xinhuImMessService;

    /**
     * 查询IM聊天记录列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:mess:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuImMess xinhuImMess)
    {
        startPage();
        List<XinhuImMess> list = xinhuImMessService.selectXinhuImMessList(xinhuImMess);
        return getDataTable(list);
    }

    /**
     * 导出IM聊天记录列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:mess:export')")
    @Log(title = "IM聊天记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuImMess xinhuImMess)
    {
        List<XinhuImMess> list = xinhuImMessService.selectXinhuImMessList(xinhuImMess);
        ExcelUtil<XinhuImMess> util = new ExcelUtil<XinhuImMess>(XinhuImMess.class);
        util.exportExcel(response, list, "IM聊天记录数据");
    }

    /**
     * 获取IM聊天记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:mess:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuImMessService.selectXinhuImMessById(id));
    }

    /**
     * 新增IM聊天记录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:mess:add')")
    @Log(title = "IM聊天记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuImMess xinhuImMess)
    {
        return toAjax(xinhuImMessService.insertXinhuImMess(xinhuImMess));
    }

    /**
     * 修改IM聊天记录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:mess:edit')")
    @Log(title = "IM聊天记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuImMess xinhuImMess)
    {
        return toAjax(xinhuImMessService.updateXinhuImMess(xinhuImMess));
    }

    /**
     * 删除IM聊天记录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:mess:remove')")
    @Log(title = "IM聊天记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuImMessService.deleteXinhuImMessByIds(ids));
    }
}
