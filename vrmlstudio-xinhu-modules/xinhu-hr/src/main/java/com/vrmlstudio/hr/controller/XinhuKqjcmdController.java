package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuKqjcmd;
import com.vrmlstudio.hr.service.IXinhuKqjcmdService;
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
 * 考勤机命令发送Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/kqjcmd")
public class XinhuKqjcmdController extends BaseController
{
    @Autowired
    private IXinhuKqjcmdService xinhuKqjcmdService;

    /**
     * 查询考勤机命令发送列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqjcmd:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuKqjcmd xinhuKqjcmd)
    {
        startPage();
        List<XinhuKqjcmd> list = xinhuKqjcmdService.selectXinhuKqjcmdList(xinhuKqjcmd);
        return getDataTable(list);
    }

    /**
     * 导出考勤机命令发送列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqjcmd:export')")
    @Log(title = "考勤机命令发送", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuKqjcmd xinhuKqjcmd)
    {
        List<XinhuKqjcmd> list = xinhuKqjcmdService.selectXinhuKqjcmdList(xinhuKqjcmd);
        ExcelUtil<XinhuKqjcmd> util = new ExcelUtil<XinhuKqjcmd>(XinhuKqjcmd.class);
        util.exportExcel(response, list, "考勤机命令发送数据");
    }

    /**
     * 获取考勤机命令发送详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqjcmd:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuKqjcmdService.selectXinhuKqjcmdById(id));
    }

    /**
     * 新增考勤机命令发送
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqjcmd:add')")
    @Log(title = "考勤机命令发送", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuKqjcmd xinhuKqjcmd)
    {
        return toAjax(xinhuKqjcmdService.insertXinhuKqjcmd(xinhuKqjcmd));
    }

    /**
     * 修改考勤机命令发送
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqjcmd:edit')")
    @Log(title = "考勤机命令发送", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuKqjcmd xinhuKqjcmd)
    {
        return toAjax(xinhuKqjcmdService.updateXinhuKqjcmd(xinhuKqjcmd));
    }

    /**
     * 删除考勤机命令发送
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:kqjcmd:remove')")
    @Log(title = "考勤机命令发送", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuKqjcmdService.deleteXinhuKqjcmdByIds(ids));
    }
}
