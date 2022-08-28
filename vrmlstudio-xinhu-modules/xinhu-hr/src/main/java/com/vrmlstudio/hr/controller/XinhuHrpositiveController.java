package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuHrpositive;
import com.vrmlstudio.hr.service.IXinhuHrpositiveService;
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
 * HR转正Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/hrpositive")
public class XinhuHrpositiveController extends BaseController
{
    @Autowired
    private IXinhuHrpositiveService xinhuHrpositiveService;

    /**
     * 查询HR转正列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrpositive:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuHrpositive xinhuHrpositive)
    {
        startPage();
        List<XinhuHrpositive> list = xinhuHrpositiveService.selectXinhuHrpositiveList(xinhuHrpositive);
        return getDataTable(list);
    }

    /**
     * 导出HR转正列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrpositive:export')")
    @Log(title = "HR转正", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuHrpositive xinhuHrpositive)
    {
        List<XinhuHrpositive> list = xinhuHrpositiveService.selectXinhuHrpositiveList(xinhuHrpositive);
        ExcelUtil<XinhuHrpositive> util = new ExcelUtil<XinhuHrpositive>(XinhuHrpositive.class);
        util.exportExcel(response, list, "HR转正数据");
    }

    /**
     * 获取HR转正详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrpositive:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuHrpositiveService.selectXinhuHrpositiveById(id));
    }

    /**
     * 新增HR转正
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrpositive:add')")
    @Log(title = "HR转正", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuHrpositive xinhuHrpositive)
    {
        return toAjax(xinhuHrpositiveService.insertXinhuHrpositive(xinhuHrpositive));
    }

    /**
     * 修改HR转正
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrpositive:edit')")
    @Log(title = "HR转正", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuHrpositive xinhuHrpositive)
    {
        return toAjax(xinhuHrpositiveService.updateXinhuHrpositive(xinhuHrpositive));
    }

    /**
     * 删除HR转正
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:hrpositive:remove')")
    @Log(title = "HR转正", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuHrpositiveService.deleteXinhuHrpositiveByIds(ids));
    }
}
