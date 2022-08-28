package com.vrmlstudio.finance.controller;

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
import com.vrmlstudio.finance.domain.XinhuDemo;
import com.vrmlstudio.finance.service.IXinhuDemoService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 演示测试模块Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-finance/demo")
public class XinhuDemoController extends BaseController
{
    @Autowired
    private IXinhuDemoService xinhuDemoService;

    /**
     * 查询演示测试模块列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:demo:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuDemo xinhuDemo)
    {
        startPage();
        List<XinhuDemo> list = xinhuDemoService.selectXinhuDemoList(xinhuDemo);
        return getDataTable(list);
    }

    /**
     * 导出演示测试模块列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:demo:export')")
    @Log(title = "演示测试模块", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuDemo xinhuDemo)
    {
        List<XinhuDemo> list = xinhuDemoService.selectXinhuDemoList(xinhuDemo);
        ExcelUtil<XinhuDemo> util = new ExcelUtil<XinhuDemo>(XinhuDemo.class);
        util.exportExcel(response, list, "演示测试模块数据");
    }

    /**
     * 获取演示测试模块详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:demo:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuDemoService.selectXinhuDemoById(id));
    }

    /**
     * 新增演示测试模块
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:demo:add')")
    @Log(title = "演示测试模块", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuDemo xinhuDemo)
    {
        return toAjax(xinhuDemoService.insertXinhuDemo(xinhuDemo));
    }

    /**
     * 修改演示测试模块
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:demo:edit')")
    @Log(title = "演示测试模块", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuDemo xinhuDemo)
    {
        return toAjax(xinhuDemoService.updateXinhuDemo(xinhuDemo));
    }

    /**
     * 删除演示测试模块
     */
    @PreAuthorize("@ss.hasPermi('xinhu-finance:demo:remove')")
    @Log(title = "演示测试模块", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuDemoService.deleteXinhuDemoByIds(ids));
    }
}
