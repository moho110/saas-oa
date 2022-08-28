package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuKnowtiku;
import com.vrmlstudio.hr.service.IXinhuKnowtikuService;
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
 * 知识题库Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/knowtiku")
public class XinhuKnowtikuController extends BaseController
{
    @Autowired
    private IXinhuKnowtikuService xinhuKnowtikuService;

    /**
     * 查询知识题库列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowtiku:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuKnowtiku xinhuKnowtiku)
    {
        startPage();
        List<XinhuKnowtiku> list = xinhuKnowtikuService.selectXinhuKnowtikuList(xinhuKnowtiku);
        return getDataTable(list);
    }

    /**
     * 导出知识题库列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowtiku:export')")
    @Log(title = "知识题库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuKnowtiku xinhuKnowtiku)
    {
        List<XinhuKnowtiku> list = xinhuKnowtikuService.selectXinhuKnowtikuList(xinhuKnowtiku);
        ExcelUtil<XinhuKnowtiku> util = new ExcelUtil<XinhuKnowtiku>(XinhuKnowtiku.class);
        util.exportExcel(response, list, "知识题库数据");
    }

    /**
     * 获取知识题库详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowtiku:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuKnowtikuService.selectXinhuKnowtikuById(id));
    }

    /**
     * 新增知识题库
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowtiku:add')")
    @Log(title = "知识题库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuKnowtiku xinhuKnowtiku)
    {
        return toAjax(xinhuKnowtikuService.insertXinhuKnowtiku(xinhuKnowtiku));
    }

    /**
     * 修改知识题库
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowtiku:edit')")
    @Log(title = "知识题库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuKnowtiku xinhuKnowtiku)
    {
        return toAjax(xinhuKnowtikuService.updateXinhuKnowtiku(xinhuKnowtiku));
    }

    /**
     * 删除知识题库
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:knowtiku:remove')")
    @Log(title = "知识题库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuKnowtikuService.deleteXinhuKnowtikuByIds(ids));
    }
}
