package com.vrmlstudio.xsystem.controller;

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
import com.vrmlstudio.xsystem.domain.XinhuZreimUser;
import com.vrmlstudio.xsystem.service.IXinhuZreimUserService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * REIM即时通讯平台用户Controller
 * 
 * @author VRer
 * @date 2022-02-20
 */
@RestController
@RequestMapping("/xinhu-system/user")
public class XinhuZreimUserController extends BaseController
{
    @Autowired
    private IXinhuZreimUserService xinhuZreimUserService;

    /**
     * 查询REIM即时通讯平台用户列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:user:list')")
    @GetMapping("/list")
    public TableDataInfo list(XinhuZreimUser xinhuZreimUser)
    {
        startPage();
        List<XinhuZreimUser> list = xinhuZreimUserService.selectXinhuZreimUserList(xinhuZreimUser);
        return getDataTable(list);
    }

    /**
     * 导出REIM即时通讯平台用户列表
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:user:export')")
    @Log(title = "REIM即时通讯平台用户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XinhuZreimUser xinhuZreimUser)
    {
        List<XinhuZreimUser> list = xinhuZreimUserService.selectXinhuZreimUserList(xinhuZreimUser);
        ExcelUtil<XinhuZreimUser> util = new ExcelUtil<XinhuZreimUser>(XinhuZreimUser.class);
        util.exportExcel(response, list, "REIM即时通讯平台用户数据");
    }

    /**
     * 获取REIM即时通讯平台用户详细信息
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:user:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(xinhuZreimUserService.selectXinhuZreimUserById(id));
    }

    /**
     * 新增REIM即时通讯平台用户
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:user:add')")
    @Log(title = "REIM即时通讯平台用户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XinhuZreimUser xinhuZreimUser)
    {
        return toAjax(xinhuZreimUserService.insertXinhuZreimUser(xinhuZreimUser));
    }

    /**
     * 修改REIM即时通讯平台用户
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:user:edit')")
    @Log(title = "REIM即时通讯平台用户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XinhuZreimUser xinhuZreimUser)
    {
        return toAjax(xinhuZreimUserService.updateXinhuZreimUser(xinhuZreimUser));
    }

    /**
     * 删除REIM即时通讯平台用户
     */
    @PreAuthorize("@ss.hasPermi('xinhu-system:user:remove')")
    @Log(title = "REIM即时通讯平台用户", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xinhuZreimUserService.deleteXinhuZreimUserByIds(ids));
    }
}
