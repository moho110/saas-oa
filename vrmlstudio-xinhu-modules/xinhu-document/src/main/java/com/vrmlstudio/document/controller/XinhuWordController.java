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
import com.vrmlstudio.document.domain.XinhuWord;
import com.vrmlstudio.document.service.IXinhuWordService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 文档Controller
 * 
 * @author VRer
 * @date 2022-02-18
 */
@RestController
@RequestMapping("/xinhu-document/word")
public class XinhuWordController extends BaseController
{
    @Autowired
    private IXinhuWordService xinhuWordService;

    /**
     * 查询文档列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:word:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuWord xinhuWord)
    {
        startPage();
        List<XinhuWord> list = xinhuWordService.selectXinhuWordList(xinhuWord);
        return getDataTable(list);
    }

    /**
     * 导出文档列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:word:export')")
    @Log(title = "文档", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuWord xinhuWord)
    {
        List<XinhuWord> list = xinhuWordService.selectXinhuWordList(xinhuWord);
        ExcelUtil<XinhuWord> util = new ExcelUtil<XinhuWord>(XinhuWord.class);
        util.exportExcel(response, list, "文档数据");
    }

    /**
     * 获取文档详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:word:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuWordService.selectXinhuWordById(id));
    }

    /**
     * 新增文档
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:word:add')")
    @Log(title = "文档", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuWord xinhuWord)
    {
        return toAjax(xinhuWordService.insertXinhuWord(xinhuWord));
    }

    /**
     * 修改文档
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:word:edit')")
    @Log(title = "文档", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuWord xinhuWord)
    {
        return toAjax(xinhuWordService.updateXinhuWord(xinhuWord));
    }

    /**
     * 删除文档
     */
    @PreAuthorize("@ss.hasPermi('xinhu-document:word:remove')")
    @Log(title = "文档", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuWordService.deleteXinhuWordByIds(ids));
    }
}
