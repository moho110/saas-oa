package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuKnowtrais;
import com.vrmlstudio.hr.service.IXinhuKnowtraisService;
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
 * 考试培训子Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/knowtrais")
public class XinhuKnowtraisController extends BaseController
{
    @Autowired
    private IXinhuKnowtraisService xinhuKnowtraisService;

    /**
     * 查询考试培训子列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowtrais:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuKnowtrais xinhuKnowtrais)
    {
        startPage();
        List<XinhuKnowtrais> list = xinhuKnowtraisService.selectXinhuKnowtraisList(xinhuKnowtrais);
        return getDataTable(list);
    }

    /**
     * 导出考试培训子列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowtrais:export')")
    @Log(title = "考试培训子", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuKnowtrais xinhuKnowtrais)
    {
        List<XinhuKnowtrais> list = xinhuKnowtraisService.selectXinhuKnowtraisList(xinhuKnowtrais);
        ExcelUtil<XinhuKnowtrais> util = new ExcelUtil<XinhuKnowtrais>(XinhuKnowtrais.class);
        util.exportExcel(response, list, "考试培训子数据");
    }

    /**
     * 获取考试培训子详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowtrais:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuKnowtraisService.selectXinhuKnowtraisById(id));
    }

    /**
     * 新增考试培训子
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowtrais:add')")
    @Log(title = "考试培训子", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuKnowtrais xinhuKnowtrais)
    {
        return toAjax(xinhuKnowtraisService.insertXinhuKnowtrais(xinhuKnowtrais));
    }

    /**
     * 修改考试培训子
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowtrais:edit')")
    @Log(title = "考试培训子", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuKnowtrais xinhuKnowtrais)
    {
        return toAjax(xinhuKnowtraisService.updateXinhuKnowtrais(xinhuKnowtrais));
    }

    /**
     * 删除考试培训子
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowtrais:remove')")
    @Log(title = "考试培训子", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuKnowtraisService.deleteXinhuKnowtraisByIds(ids));
    }
}
