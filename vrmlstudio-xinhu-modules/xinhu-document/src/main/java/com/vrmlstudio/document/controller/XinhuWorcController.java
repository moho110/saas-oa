package com.vrmlstudio.document.controller;

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
import com.vrmlstudio.document.domain.XinhuWorc;
import com.vrmlstudio.document.service.IXinhuWorcService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 文档分区Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-document/worc")
public class XinhuWorcController extends BaseController
{
    @Autowired
    private IXinhuWorcService xinhuWorcService;

    /**
     * 查询文档分区列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:worc:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuWorc xinhuWorc)
    {
        startPage();
        List<XinhuWorc> list = xinhuWorcService.selectXinhuWorcList(xinhuWorc);
        return getDataTable(list);
    }

    /**
     * 导出文档分区列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:worc:export')")
    @Log(title = "文档分区", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuWorc xinhuWorc)
    {
        List<XinhuWorc> list = xinhuWorcService.selectXinhuWorcList(xinhuWorc);
        ExcelUtil<XinhuWorc> util = new ExcelUtil<XinhuWorc>(XinhuWorc.class);
        util.exportExcel(response, list, "文档分区数据");
    }

    /**
     * 获取文档分区详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:worc:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuWorcService.selectXinhuWorcById(id));
    }

    /**
     * 新增文档分区
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:worc:add')")
    @Log(title = "文档分区", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuWorc xinhuWorc)
    {
        return toAjax(xinhuWorcService.insertXinhuWorc(xinhuWorc));
    }

    /**
     * 修改文档分区
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:worc:edit')")
    @Log(title = "文档分区", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuWorc xinhuWorc)
    {
        return toAjax(xinhuWorcService.updateXinhuWorc(xinhuWorc));
    }

    /**
     * 删除文档分区
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:worc:remove')")
    @Log(title = "文档分区", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuWorcService.deleteXinhuWorcByIds(ids));
    }
}
