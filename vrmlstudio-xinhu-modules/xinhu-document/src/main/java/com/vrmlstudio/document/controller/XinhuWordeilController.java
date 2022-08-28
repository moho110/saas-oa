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
import com.vrmlstudio.document.domain.XinhuWordeil;
import com.vrmlstudio.document.service.IXinhuWordeilService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 文件传送Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-document/wordeil")
public class XinhuWordeilController extends BaseController
{
    @Autowired
    private IXinhuWordeilService xinhuWordeilService;

    /**
     * 查询文件传送列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wordeil:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuWordeil xinhuWordeil)
    {
        startPage();
        List<XinhuWordeil> list = xinhuWordeilService.selectXinhuWordeilList(xinhuWordeil);
        return getDataTable(list);
    }

    /**
     * 导出文件传送列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wordeil:export')")
    @Log(title = "文件传送", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuWordeil xinhuWordeil)
    {
        List<XinhuWordeil> list = xinhuWordeilService.selectXinhuWordeilList(xinhuWordeil);
        ExcelUtil<XinhuWordeil> util = new ExcelUtil<XinhuWordeil>(XinhuWordeil.class);
        util.exportExcel(response, list, "文件传送数据");
    }

    /**
     * 获取文件传送详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wordeil:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuWordeilService.selectXinhuWordeilById(id));
    }

    /**
     * 新增文件传送
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wordeil:add')")
    @Log(title = "文件传送", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuWordeil xinhuWordeil)
    {
        return toAjax(xinhuWordeilService.insertXinhuWordeil(xinhuWordeil));
    }

    /**
     * 修改文件传送
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wordeil:edit')")
    @Log(title = "文件传送", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuWordeil xinhuWordeil)
    {
        return toAjax(xinhuWordeilService.updateXinhuWordeil(xinhuWordeil));
    }

    /**
     * 删除文件传送
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:wordeil:remove')")
    @Log(title = "文件传送", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuWordeilService.deleteXinhuWordeilByIds(ids));
    }
}
