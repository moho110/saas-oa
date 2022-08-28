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
import com.vrmlstudio.police.domain.XinhuFiles;
import com.vrmlstudio.police.service.IXinhuFilesService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 文件记录下载和预览Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-police/files")
public class XinhuFilesController extends BaseController
{
    @Autowired
    private IXinhuFilesService xinhuFilesService;

    /**
     * 查询文件记录下载和预览列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:files:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuFiles xinhuFiles)
    {
        startPage();
        List<XinhuFiles> list = xinhuFilesService.selectXinhuFilesList(xinhuFiles);
        return getDataTable(list);
    }

    /**
     * 导出文件记录下载和预览列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:files:export')")
    @Log(title = "文件记录下载和预览", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuFiles xinhuFiles)
    {
        List<XinhuFiles> list = xinhuFilesService.selectXinhuFilesList(xinhuFiles);
        ExcelUtil<XinhuFiles> util = new ExcelUtil<XinhuFiles>(XinhuFiles.class);
        util.exportExcel(response, list, "文件记录下载和预览数据");
    }

    /**
     * 获取文件记录下载和预览详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:files:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuFilesService.selectXinhuFilesById(id));
    }

    /**
     * 新增文件记录下载和预览
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:files:add')")
    @Log(title = "文件记录下载和预览", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuFiles xinhuFiles)
    {
        return toAjax(xinhuFilesService.insertXinhuFiles(xinhuFiles));
    }

    /**
     * 修改文件记录下载和预览
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:files:edit')")
    @Log(title = "文件记录下载和预览", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuFiles xinhuFiles)
    {
        return toAjax(xinhuFilesService.updateXinhuFiles(xinhuFiles));
    }

    /**
     * 删除文件记录下载和预览
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:files:remove')")
    @Log(title = "文件记录下载和预览", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuFilesService.deleteXinhuFilesByIds(ids));
    }
}
