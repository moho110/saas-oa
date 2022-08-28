package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuKqjuser;
import com.vrmlstudio.hr.service.IXinhuKqjuserService;
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
 * 考勤机上人员Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/kqjuser")
public class XinhuKqjuserController extends BaseController
{
    @Autowired
    private IXinhuKqjuserService xinhuKqjuserService;

    /**
     * 查询考勤机上人员列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqjuser:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuKqjuser xinhuKqjuser)
    {
        startPage();
        List<XinhuKqjuser> list = xinhuKqjuserService.selectXinhuKqjuserList(xinhuKqjuser);
        return getDataTable(list);
    }

    /**
     * 导出考勤机上人员列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqjuser:export')")
    @Log(title = "考勤机上人员", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuKqjuser xinhuKqjuser)
    {
        List<XinhuKqjuser> list = xinhuKqjuserService.selectXinhuKqjuserList(xinhuKqjuser);
        ExcelUtil<XinhuKqjuser> util = new ExcelUtil<XinhuKqjuser>(XinhuKqjuser.class);
        util.exportExcel(response, list, "考勤机上人员数据");
    }

    /**
     * 获取考勤机上人员详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqjuser:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuKqjuserService.selectXinhuKqjuserById(id));
    }

    /**
     * 新增考勤机上人员
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqjuser:add')")
    @Log(title = "考勤机上人员", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuKqjuser xinhuKqjuser)
    {
        return toAjax(xinhuKqjuserService.insertXinhuKqjuser(xinhuKqjuser));
    }

    /**
     * 修改考勤机上人员
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqjuser:edit')")
    @Log(title = "考勤机上人员", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuKqjuser xinhuKqjuser)
    {
        return toAjax(xinhuKqjuserService.updateXinhuKqjuser(xinhuKqjuser));
    }

    /**
     * 删除考勤机上人员
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqjuser:remove')")
    @Log(title = "考勤机上人员", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuKqjuserService.deleteXinhuKqjuserByIds(ids));
    }
}
