package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuKnowledge;
import com.vrmlstudio.hr.service.IXinhuKnowledgeService;
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
 * 知识信息Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/knowledge")
public class XinhuKnowledgeController extends BaseController
{
    @Autowired
    private IXinhuKnowledgeService xinhuKnowledgeService;

    /**
     * 查询知识信息列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowledge:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuKnowledge xinhuKnowledge)
    {
        startPage();
        List<XinhuKnowledge> list = xinhuKnowledgeService.selectXinhuKnowledgeList(xinhuKnowledge);
        return getDataTable(list);
    }

    /**
     * 导出知识信息列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowledge:export')")
    @Log(title = "知识信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuKnowledge xinhuKnowledge)
    {
        List<XinhuKnowledge> list = xinhuKnowledgeService.selectXinhuKnowledgeList(xinhuKnowledge);
        ExcelUtil<XinhuKnowledge> util = new ExcelUtil<XinhuKnowledge>(XinhuKnowledge.class);
        util.exportExcel(response, list, "知识信息数据");
    }

    /**
     * 获取知识信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowledge:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuKnowledgeService.selectXinhuKnowledgeById(id));
    }

    /**
     * 新增知识信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowledge:add')")
    @Log(title = "知识信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuKnowledge xinhuKnowledge)
    {
        return toAjax(xinhuKnowledgeService.insertXinhuKnowledge(xinhuKnowledge));
    }

    /**
     * 修改知识信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowledge:edit')")
    @Log(title = "知识信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuKnowledge xinhuKnowledge)
    {
        return toAjax(xinhuKnowledgeService.updateXinhuKnowledge(xinhuKnowledge));
    }

    /**
     * 删除知识信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowledge:remove')")
    @Log(title = "知识信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuKnowledgeService.deleteXinhuKnowledgeByIds(ids));
    }
}
