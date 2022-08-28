package com.vrmlstudio.police.controller;

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
import com.vrmlstudio.police.domain.XinhuFininfom;
import com.vrmlstudio.police.service.IXinhuFininfomService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 费用报销Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-police/fininfom")
public class XinhuFininfomController extends BaseController
{
    @Autowired
    private IXinhuFininfomService xinhuFininfomService;

    /**
     * 查询费用报销列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:fininfom:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuFininfom xinhuFininfom)
    {
        startPage();
        List<XinhuFininfom> list = xinhuFininfomService.selectXinhuFininfomList(xinhuFininfom);
        return getDataTable(list);
    }

    /**
     * 导出费用报销列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:fininfom:export')")
    @Log(title = "费用报销", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuFininfom xinhuFininfom)
    {
        List<XinhuFininfom> list = xinhuFininfomService.selectXinhuFininfomList(xinhuFininfom);
        ExcelUtil<XinhuFininfom> util = new ExcelUtil<XinhuFininfom>(XinhuFininfom.class);
        util.exportExcel(response, list, "费用报销数据");
    }

    /**
     * 获取费用报销详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:fininfom:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuFininfomService.selectXinhuFininfomById(id));
    }

    /**
     * 新增费用报销
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:fininfom:add')")
    @Log(title = "费用报销", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuFininfom xinhuFininfom)
    {
        return toAjax(xinhuFininfomService.insertXinhuFininfom(xinhuFininfom));
    }

    /**
     * 修改费用报销
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:fininfom:edit')")
    @Log(title = "费用报销", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuFininfom xinhuFininfom)
    {
        return toAjax(xinhuFininfomService.updateXinhuFininfom(xinhuFininfom));
    }

    /**
     * 删除费用报销
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:fininfom:remove')")
    @Log(title = "费用报销", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuFininfomService.deleteXinhuFininfomByIds(ids));
    }
}
