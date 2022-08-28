package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuKqerr;
import com.vrmlstudio.hr.service.IXinhuKqerrService;
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
 * 打卡异常申请Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/kqerr")
public class XinhuKqerrController extends BaseController
{
    @Autowired
    private IXinhuKqerrService xinhuKqerrService;

    /**
     * 查询打卡异常申请列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqerr:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuKqerr xinhuKqerr)
    {
        startPage();
        List<XinhuKqerr> list = xinhuKqerrService.selectXinhuKqerrList(xinhuKqerr);
        return getDataTable(list);
    }

    /**
     * 导出打卡异常申请列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqerr:export')")
    @Log(title = "打卡异常申请", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuKqerr xinhuKqerr)
    {
        List<XinhuKqerr> list = xinhuKqerrService.selectXinhuKqerrList(xinhuKqerr);
        ExcelUtil<XinhuKqerr> util = new ExcelUtil<XinhuKqerr>(XinhuKqerr.class);
        util.exportExcel(response, list, "打卡异常申请数据");
    }

    /**
     * 获取打卡异常申请详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqerr:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuKqerrService.selectXinhuKqerrById(id));
    }

    /**
     * 新增打卡异常申请
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqerr:add')")
    @Log(title = "打卡异常申请", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuKqerr xinhuKqerr)
    {
        return toAjax(xinhuKqerrService.insertXinhuKqerr(xinhuKqerr));
    }

    /**
     * 修改打卡异常申请
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqerr:edit')")
    @Log(title = "打卡异常申请", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuKqerr xinhuKqerr)
    {
        return toAjax(xinhuKqerrService.updateXinhuKqerr(xinhuKqerr));
    }

    /**
     * 删除打卡异常申请
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqerr:remove')")
    @Log(title = "打卡异常申请", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuKqerrService.deleteXinhuKqerrByIds(ids));
    }
}
