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
import com.vrmlstudio.person.domain.XinhuUserract;
import com.vrmlstudio.person.service.IXinhuUserractService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 用户合同Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-person/userract")
public class XinhuUserractController extends BaseController
{
    @Autowired
    private IXinhuUserractService xinhuUserractService;

    /**
     * 查询用户合同列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:userract:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuUserract xinhuUserract)
    {
        startPage();
        List<XinhuUserract> list = xinhuUserractService.selectXinhuUserractList(xinhuUserract);
        return getDataTable(list);
    }

    /**
     * 导出用户合同列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:userract:export')")
    @Log(title = "用户合同", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuUserract xinhuUserract)
    {
        List<XinhuUserract> list = xinhuUserractService.selectXinhuUserractList(xinhuUserract);
        ExcelUtil<XinhuUserract> util = new ExcelUtil<XinhuUserract>(XinhuUserract.class);
        util.exportExcel(response, list, "用户合同数据");
    }

    /**
     * 获取用户合同详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:userract:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuUserractService.selectXinhuUserractById(id));
    }

    /**
     * 新增用户合同
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:userract:add')")
    @Log(title = "用户合同", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuUserract xinhuUserract)
    {
        return toAjax(xinhuUserractService.insertXinhuUserract(xinhuUserract));
    }

    /**
     * 修改用户合同
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:userract:edit')")
    @Log(title = "用户合同", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuUserract xinhuUserract)
    {
        return toAjax(xinhuUserractService.updateXinhuUserract(xinhuUserract));
    }

    /**
     * 删除用户合同
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:userract:remove')")
    @Log(title = "用户合同", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuUserractService.deleteXinhuUserractByIds(ids));
    }
}
