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
import com.vrmlstudio.police.domain.XinhuFile;
import com.vrmlstudio.police.service.IXinhuFileService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 上传文件记录Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-police/file")
public class XinhuFileController extends BaseController
{
    @Autowired
    private IXinhuFileService xinhuFileService;

    /**
     * 查询上传文件记录列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:file:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuFile xinhuFile)
    {
        startPage();
        List<XinhuFile> list = xinhuFileService.selectXinhuFileList(xinhuFile);
        return getDataTable(list);
    }

    /**
     * 导出上传文件记录列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:file:export')")
    @Log(title = "上传文件记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuFile xinhuFile)
    {
        List<XinhuFile> list = xinhuFileService.selectXinhuFileList(xinhuFile);
        ExcelUtil<XinhuFile> util = new ExcelUtil<XinhuFile>(XinhuFile.class);
        util.exportExcel(response, list, "上传文件记录数据");
    }

    /**
     * 获取上传文件记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:file:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuFileService.selectXinhuFileById(id));
    }

    /**
     * 新增上传文件记录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:file:add')")
    @Log(title = "上传文件记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuFile xinhuFile)
    {
        return toAjax(xinhuFileService.insertXinhuFile(xinhuFile));
    }

    /**
     * 修改上传文件记录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:file:edit')")
    @Log(title = "上传文件记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuFile xinhuFile)
    {
        return toAjax(xinhuFileService.updateXinhuFile(xinhuFile));
    }

    /**
     * 删除上传文件记录
     */
    @PreAuthorize("@ss.hasPermi('xinhu-police:file:remove')")
    @Log(title = "上传文件记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuFileService.deleteXinhuFileByIds(ids));
    }
}
