package com.vrmlstudio.hr.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.vrmlstudio.hr.domain.XinhuReward;
import com.vrmlstudio.hr.service.IXinhuRewardService;
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
 * 奖惩Controller
 * 
 * @author VRer
 * @date 2022-02-19
 */
@RestController
@RequestMapping("/xinhu-hr/reward")
public class XinhuRewardController extends BaseController
{
    @Autowired
    private IXinhuRewardService xinhuRewardService;

    /**
     * 查询奖惩列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:reward:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuReward xinhuReward)
    {
        startPage();
        List<XinhuReward> list = xinhuRewardService.selectXinhuRewardList(xinhuReward);
        return getDataTable(list);
    }

    /**
     * 导出奖惩列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:reward:export')")
    @Log(title = "奖惩", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuReward xinhuReward)
    {
        List<XinhuReward> list = xinhuRewardService.selectXinhuRewardList(xinhuReward);
        ExcelUtil<XinhuReward> util = new ExcelUtil<XinhuReward>(XinhuReward.class);
        util.exportExcel(response, list, "奖惩数据");
    }

    /**
     * 获取奖惩详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:reward:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuRewardService.selectXinhuRewardById(id));
    }

    /**
     * 新增奖惩
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:reward:add')")
    @Log(title = "奖惩", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuReward xinhuReward)
    {
        return toAjax(xinhuRewardService.insertXinhuReward(xinhuReward));
    }

    /**
     * 修改奖惩
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:reward:edit')")
    @Log(title = "奖惩", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuReward xinhuReward)
    {
        return toAjax(xinhuRewardService.updateXinhuReward(xinhuReward));
    }

    /**
     * 删除奖惩
     */
    @PreAuthorize("@ss.hasPermi('xinhu-hr:reward:remove')")
    @Log(title = "奖惩", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuRewardService.deleteXinhuRewardByIds(ids));
    }
}
