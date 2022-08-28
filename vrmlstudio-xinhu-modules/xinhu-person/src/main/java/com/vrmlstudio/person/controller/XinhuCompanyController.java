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
import com.vrmlstudio.person.domain.XinhuCompany;
import com.vrmlstudio.person.service.IXinhuCompanyService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 公司单位Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-person/company")
public class XinhuCompanyController extends BaseController
{
    @Autowired
    private IXinhuCompanyService xinhuCompanyService;

    /**
     * 查询公司单位列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:company:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuCompany xinhuCompany)
    {
        startPage();
        List<XinhuCompany> list = xinhuCompanyService.selectXinhuCompanyList(xinhuCompany);
        return getDataTable(list);
    }

    /**
     * 导出公司单位列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:company:export')")
    @Log(title = "公司单位", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuCompany xinhuCompany)
    {
        List<XinhuCompany> list = xinhuCompanyService.selectXinhuCompanyList(xinhuCompany);
        ExcelUtil<XinhuCompany> util = new ExcelUtil<XinhuCompany>(XinhuCompany.class);
        util.exportExcel(response, list, "公司单位数据");
    }

    /**
     * 获取公司单位详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:company:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuCompanyService.selectXinhuCompanyById(id));
    }

    /**
     * 新增公司单位
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:company:add')")
    @Log(title = "公司单位", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuCompany xinhuCompany)
    {
        return toAjax(xinhuCompanyService.insertXinhuCompany(xinhuCompany));
    }

    /**
     * 修改公司单位
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:company:edit')")
    @Log(title = "公司单位", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuCompany xinhuCompany)
    {
        return toAjax(xinhuCompanyService.updateXinhuCompany(xinhuCompany));
    }

    /**
     * 删除公司单位
     */
    @PreAuthorize("@ss.hasPermi('xinhu-person:company:remove')")
    @Log(title = "公司单位", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuCompanyService.deleteXinhuCompanyByIds(ids));
    }
}
