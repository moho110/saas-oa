--
-- 数据库： `xinhu`
--

-- --------------------------------------------------------

--
-- 表的结构 `articles`
--

CREATE TABLE `articles` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `createtime` varchar(255) DEFAULT NULL,
  primary key(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文章列表' ROW_FORMAT=COMPACT;

BEGIN;
COMMIT;


--
-- 表的结构 `sys_menu`
--

CREATE TABLE `sys_menu` (
  `menu_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
  `menu_name` varchar(50) NOT NULL COMMENT '菜单名称',
  `parent_id` bigint(20) DEFAULT '0' COMMENT '父菜单ID',
  `order_num` int(4) DEFAULT '0' COMMENT '显示顺序',
  `path` varchar(200) DEFAULT '' COMMENT '路由地址',
  `component` varchar(255) DEFAULT NULL COMMENT '组件路径',
  `query` varchar(255) DEFAULT NULL COMMENT '路由参数',
  `is_frame` int(1) DEFAULT '1' COMMENT '是否为外链（0是 1否）',
  `is_cache` int(1) DEFAULT '0' COMMENT '是否缓存（0缓存 1不缓存）',
  `menu_type` char(1) DEFAULT '' COMMENT '菜单类型（M目录 C菜单 F按钮）',
  `visible` char(1) DEFAULT '0' COMMENT '菜单状态（0显示 1隐藏）',
  `status` char(1) DEFAULT '0' COMMENT '菜单状态（0正常 1停用）',
  `perms` varchar(100) DEFAULT NULL COMMENT '权限标识',
  `icon` varchar(100) DEFAULT '#' COMMENT '菜单图标',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`menu_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单权限表';

--
-- 转存表中的数据 `sys_menu`
--
BEGIN;
INSERT INTO `sys_menu` (`menu_id`, `menu_name`, `parent_id`, `order_num`, `path`, `component`, `query`, `is_frame`, `is_cache`, `menu_type`, `visible`, `status`, `perms`, `icon`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES
(1, '系统管理', 0, 1, 'system', NULL, '', 1, 0, 'M', '0', '0', '', 'system', 'admin', '2022-02-18 18:38:56', '', NULL, '系统管理目录'),
(2, '系统监控', 0, 2, 'monitor', NULL, '', 1, 0, 'M', '0', '0', '', 'monitor', 'admin', '2022-02-18 18:38:56', '', NULL, '系统监控目录'),
(3, '系统工具', 0, 3, 'tool', NULL, '', 1, 0, 'M', '0', '0', '', 'tool', 'admin', '2022-02-18 18:38:56', '', NULL, '系统工具目录'),
(4, '若依官网', 3, 4, 'http://ruoyi.vip', NULL, '', 0, 0, 'M', '1', '0', '', 'guide', 'admin', '2022-02-18 18:38:56', 'admin', '2022-02-22 20:19:03', '若依官网地址'),
(100, '用户管理', 1, 1, 'user', 'system/user/index', '', 1, 0, 'C', '0', '0', 'system:user:list', 'user', 'admin', '2022-02-18 18:38:56', '', NULL, '用户管理菜单'),
(101, '角色管理', 1, 2, 'role', 'system/role/index', '', 1, 0, 'C', '0', '0', 'system:role:list', 'peoples', 'admin', '2022-02-18 18:38:56', '', NULL, '角色管理菜单'),
(102, '菜单管理', 1, 3, 'menu', 'system/menu/index', '', 1, 0, 'C', '0', '0', 'system:menu:list', 'tree-table', 'admin', '2022-02-18 18:38:56', '', NULL, '菜单管理菜单'),
(103, '部门管理', 1, 4, 'dept', 'system/dept/index', '', 1, 0, 'C', '0', '0', 'system:dept:list', 'tree', 'admin', '2022-02-18 18:38:56', '', NULL, '部门管理菜单'),
(104, '岗位管理', 1, 5, 'post', 'system/post/index', '', 1, 0, 'C', '0', '0', 'system:post:list', 'post', 'admin', '2022-02-18 18:38:56', '', NULL, '岗位管理菜单'),
(105, '字典管理', 1, 6, 'dict', 'system/dict/index', '', 1, 0, 'C', '0', '0', 'system:dict:list', 'dict', 'admin', '2022-02-18 18:38:56', '', NULL, '字典管理菜单'),
(106, '参数设置', 1, 7, 'config', 'system/config/index', '', 1, 0, 'C', '0', '0', 'system:config:list', 'edit', 'admin', '2022-02-18 18:38:56', '', NULL, '参数设置菜单'),
(107, '通知公告', 1, 8, 'notice', 'system/notice/index', '', 1, 0, 'C', '0', '0', 'system:notice:list', 'message', 'admin', '2022-02-18 18:38:56', '', NULL, '通知公告菜单'),
(108, '日志管理', 1, 9, 'log', '', '', 1, 0, 'M', '0', '0', '', 'log', 'admin', '2022-02-18 18:38:56', '', NULL, '日志管理菜单'),
(109, '在线用户', 2, 1, 'online', 'monitor/online/index', '', 1, 0, 'C', '0', '0', 'monitor:online:list', 'online', 'admin', '2022-02-18 18:38:56', '', NULL, '在线用户菜单'),
(110, '定时任务', 2, 2, 'job', 'monitor/job/index', '', 1, 0, 'C', '0', '0', 'monitor:job:list', 'job', 'admin', '2022-02-18 18:38:56', '', NULL, '定时任务菜单'),
(111, '数据监控', 2, 3, 'druid', 'monitor/druid/index', '', 1, 0, 'C', '0', '0', 'monitor:druid:list', 'druid', 'admin', '2022-02-18 18:38:56', '', NULL, '数据监控菜单'),
(112, '服务监控', 2, 4, 'server', 'monitor/server/index', '', 1, 0, 'C', '0', '0', 'monitor:server:list', 'server', 'admin', '2022-02-18 18:38:56', '', NULL, '服务监控菜单'),
(113, '缓存监控', 2, 5, 'cache', 'monitor/cache/index', '', 1, 0, 'C', '0', '0', 'monitor:cache:list', 'redis', 'admin', '2022-02-18 18:38:56', '', NULL, '缓存监控菜单'),
(114, '表单构建', 3, 1, 'build', 'tool/build/index', '', 1, 0, 'C', '0', '0', 'tool:build:list', 'build', 'admin', '2022-02-18 18:38:56', '', NULL, '表单构建菜单'),
(115, '代码生成', 3, 2, 'gen', 'tool/gen/index', '', 1, 0, 'C', '0', '0', 'tool:gen:list', 'code', 'admin', '2022-02-18 18:38:56', '', NULL, '代码生成菜单'),
(116, '系统接口', 3, 3, 'swagger', 'tool/swagger/index', '', 1, 0, 'C', '0', '0', 'tool:swagger:list', 'swagger', 'admin', '2022-02-18 18:38:56', '', NULL, '系统接口菜单'),
(500, '操作日志', 108, 1, 'operlog', 'monitor/operlog/index', '', 1, 0, 'C', '0', '0', 'monitor:operlog:list', 'form', 'admin', '2022-02-18 18:38:56', '', NULL, '操作日志菜单'),
(501, '登录日志', 108, 2, 'logininfor', 'monitor/logininfor/index', '', 1, 0, 'C', '0', '0', 'monitor:logininfor:list', 'logininfor', 'admin', '2022-02-18 18:38:56', '', NULL, '登录日志菜单'),
(1001, '用户查询', 100, 1, '', '', '', 1, 0, 'F', '0', '0', 'system:user:query', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1002, '用户新增', 100, 2, '', '', '', 1, 0, 'F', '0', '0', 'system:user:add', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1003, '用户修改', 100, 3, '', '', '', 1, 0, 'F', '0', '0', 'system:user:edit', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1004, '用户删除', 100, 4, '', '', '', 1, 0, 'F', '0', '0', 'system:user:remove', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1005, '用户导出', 100, 5, '', '', '', 1, 0, 'F', '0', '0', 'system:user:export', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1006, '用户导入', 100, 6, '', '', '', 1, 0, 'F', '0', '0', 'system:user:import', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1007, '重置密码', 100, 7, '', '', '', 1, 0, 'F', '0', '0', 'system:user:resetPwd', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1008, '角色查询', 101, 1, '', '', '', 1, 0, 'F', '0', '0', 'system:role:query', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1009, '角色新增', 101, 2, '', '', '', 1, 0, 'F', '0', '0', 'system:role:add', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1010, '角色修改', 101, 3, '', '', '', 1, 0, 'F', '0', '0', 'system:role:edit', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1011, '角色删除', 101, 4, '', '', '', 1, 0, 'F', '0', '0', 'system:role:remove', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1012, '角色导出', 101, 5, '', '', '', 1, 0, 'F', '0', '0', 'system:role:export', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1013, '菜单查询', 102, 1, '', '', '', 1, 0, 'F', '0', '0', 'system:menu:query', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1014, '菜单新增', 102, 2, '', '', '', 1, 0, 'F', '0', '0', 'system:menu:add', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1015, '菜单修改', 102, 3, '', '', '', 1, 0, 'F', '0', '0', 'system:menu:edit', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1016, '菜单删除', 102, 4, '', '', '', 1, 0, 'F', '0', '0', 'system:menu:remove', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1017, '部门查询', 103, 1, '', '', '', 1, 0, 'F', '0', '0', 'system:dept:query', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1018, '部门新增', 103, 2, '', '', '', 1, 0, 'F', '0', '0', 'system:dept:add', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1019, '部门修改', 103, 3, '', '', '', 1, 0, 'F', '0', '0', 'system:dept:edit', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1020, '部门删除', 103, 4, '', '', '', 1, 0, 'F', '0', '0', 'system:dept:remove', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1021, '岗位查询', 104, 1, '', '', '', 1, 0, 'F', '0', '0', 'system:post:query', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1022, '岗位新增', 104, 2, '', '', '', 1, 0, 'F', '0', '0', 'system:post:add', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1023, '岗位修改', 104, 3, '', '', '', 1, 0, 'F', '0', '0', 'system:post:edit', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1024, '岗位删除', 104, 4, '', '', '', 1, 0, 'F', '0', '0', 'system:post:remove', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1025, '岗位导出', 104, 5, '', '', '', 1, 0, 'F', '0', '0', 'system:post:export', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1026, '字典查询', 105, 1, '#', '', '', 1, 0, 'F', '0', '0', 'system:dict:query', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1027, '字典新增', 105, 2, '#', '', '', 1, 0, 'F', '0', '0', 'system:dict:add', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1028, '字典修改', 105, 3, '#', '', '', 1, 0, 'F', '0', '0', 'system:dict:edit', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1029, '字典删除', 105, 4, '#', '', '', 1, 0, 'F', '0', '0', 'system:dict:remove', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1030, '字典导出', 105, 5, '#', '', '', 1, 0, 'F', '0', '0', 'system:dict:export', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1031, '参数查询', 106, 1, '#', '', '', 1, 0, 'F', '0', '0', 'system:config:query', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1032, '参数新增', 106, 2, '#', '', '', 1, 0, 'F', '0', '0', 'system:config:add', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1033, '参数修改', 106, 3, '#', '', '', 1, 0, 'F', '0', '0', 'system:config:edit', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1034, '参数删除', 106, 4, '#', '', '', 1, 0, 'F', '0', '0', 'system:config:remove', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1035, '参数导出', 106, 5, '#', '', '', 1, 0, 'F', '0', '0', 'system:config:export', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1036, '公告查询', 107, 1, '#', '', '', 1, 0, 'F', '0', '0', 'system:notice:query', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1037, '公告新增', 107, 2, '#', '', '', 1, 0, 'F', '0', '0', 'system:notice:add', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1038, '公告修改', 107, 3, '#', '', '', 1, 0, 'F', '0', '0', 'system:notice:edit', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1039, '公告删除', 107, 4, '#', '', '', 1, 0, 'F', '0', '0', 'system:notice:remove', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1040, '操作查询', 500, 1, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:operlog:query', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1041, '操作删除', 500, 2, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:operlog:remove', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1042, '日志导出', 500, 4, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:operlog:export', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1043, '登录查询', 501, 1, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:logininfor:query', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1044, '登录删除', 501, 2, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:logininfor:remove', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1045, '日志导出', 501, 3, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:logininfor:export', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1046, '在线查询', 109, 1, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:online:query', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1047, '批量强退', 109, 2, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:online:batchLogout', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1048, '单条强退', 109, 3, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:online:forceLogout', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1049, '任务查询', 110, 1, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:job:query', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1050, '任务新增', 110, 2, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:job:add', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1051, '任务修改', 110, 3, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:job:edit', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1052, '任务删除', 110, 4, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:job:remove', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1053, '状态修改', 110, 5, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:job:changeStatus', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1054, '任务导出', 110, 7, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:job:export', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1055, '生成查询', 115, 1, '#', '', '', 1, 0, 'F', '0', '0', 'tool:gen:query', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1056, '生成修改', 115, 2, '#', '', '', 1, 0, 'F', '0', '0', 'tool:gen:edit', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1057, '生成删除', 115, 3, '#', '', '', 1, 0, 'F', '0', '0', 'tool:gen:remove', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1058, '导入代码', 115, 2, '#', '', '', 1, 0, 'F', '0', '0', 'tool:gen:import', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1059, '预览代码', 115, 4, '#', '', '', 1, 0, 'F', '0', '0', 'tool:gen:preview', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1060, '生成代码', 115, 5, '#', '', '', 1, 0, 'F', '0', '0', 'tool:gen:code', '#', 'admin', '2022-02-18 18:38:56', '', NULL, ''),
(1061, '协同办公平台', 3, 100, 'oa', NULL, NULL, 1, 0, 'M', '0', '0', '', 'dashboard', 'admin', '2022-02-21 21:39:36', 'admin', '2022-02-22 20:18:54', ''),
(1062, '个人办公', 0, 5, 'person', NULL, NULL, 1, 0, 'M', '0', '0', NULL, 'people', 'admin', '2022-02-22 18:04:32', '', NULL, ''),
(1063, '工作流', 0, 6, 'flow', NULL, NULL, 1, 0, 'M', '0', '0', NULL, 'table', 'admin', '2022-02-22 18:05:10', '', NULL, ''),
(1064, '任务资源', 0, 7, 'resources', NULL, NULL, 1, 0, 'M', '0', '0', NULL, 'server', 'admin', '2022-02-22 18:05:52', '', NULL, ''),
(1065, '公文', 0, 8, 'document', NULL, NULL, 1, 0, 'M', '0', '0', NULL, 'excel', 'admin', '2022-02-22 18:06:40', '', NULL, ''),
(1066, '人事考勤', 0, 9, 'hr', NULL, NULL, 1, 0, 'M', '0', '0', NULL, 'people', 'admin', '2022-02-22 18:07:41', '', NULL, ''),
(1067, '行政', 0, 10, 'police', NULL, NULL, 1, 0, 'M', '0', '0', NULL, 'question', 'admin', '2022-02-22 18:08:15', '', NULL, ''),
(1068, '财务', 0, 11, 'finance', NULL, NULL, 1, 0, 'M', '0', '0', NULL, 'system', 'admin', '2022-02-22 18:10:18', '', NULL, ''),
(1069, '系统', 0, 12, 'xsystem', NULL, NULL, 1, 0, 'M', '0', '0', '', 'system', 'admin', '2022-02-22 18:10:43', 'admin', '2022-03-12 18:44:29', ''),
(1070, '桌面项目表', 1062, 1, 'homeitems', 'modules/person/xinhu-person/homeitems/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-person:homeitems:list', 'code', 'admin', '2022-02-22 18:13:12', 'admin', '2022-02-22 18:14:45', ''),
(1071, '新增桌面项目', 1070, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:homeitems:add', '#', 'admin', '2022-02-22 18:15:16', '', NULL, ''),
(1072, '修改桌面项目', 1070, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:homeitems:edit', '#', 'admin', '2022-02-22 18:15:48', '', NULL, ''),
(1073, '删除桌面项目', 1070, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:homeitems:remove', '#', 'admin', '2022-02-22 18:16:28', '', NULL, ''),
(1074, '桌面项目详情', 1070, 4, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:homeitems:query', '#', 'admin', '2022-02-22 18:17:27', '', NULL, ''),
(1075, '用户表', 1062, 2, 'admin', 'modules/person/xinhu-person/admin/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-person:admin:list', 'color', 'admin', '2022-02-22 18:29:37', '', NULL, ''),
(1076, '新增用户', 1075, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:admin:add', '#', 'admin', '2022-02-22 18:30:08', '', NULL, ''),
(1077, '修改用户', 1075, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:admin:edit', '#', 'admin', '2022-02-22 18:30:35', '', NULL, ''),
(1078, '删除用户', 1075, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:admin:remove', 'color', 'admin', '2022-02-22 18:31:09', '', NULL, ''),
(1079, '用户详情', 1075, 4, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:admin:query', '#', 'admin', '2022-02-22 18:31:53', '', NULL, ''),
(1080, '区域表', 1062, 3, 'areas', 'modules/person/xinhu-person/areas/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-person:areas:list', 'chart', 'admin', '2022-02-22 18:45:29', 'admin', '2022-04-01 19:22:19', ''),
(1081, '新增区域表', 1080, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:areas:add', '#', 'admin', '2022-02-22 18:45:53', '', NULL, ''),
(1082, '修改区域表', 1080, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:areas:edit', '#', 'admin', '2022-02-22 18:46:14', '', NULL, ''),
(1083, '删除区域表', 1080, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:areas:remove', '#', 'admin', '2022-02-22 18:46:34', '', NULL, ''),
(1084, '区域详情', 1080, 4, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:areas:query', '#', 'admin', '2022-02-22 18:47:11', '', NULL, ''),
(1085, '图书表', 1062, 4, 'book', 'modules/person/xinhu-person/book/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-person:book:list', 'code', 'admin', '2022-02-22 19:07:17', 'admin', '2022-04-01 19:22:05', ''),
(1086, '新增图书', 1085, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:book:add', '#', 'admin', '2022-02-22 19:07:51', '', NULL, ''),
(1087, '修改图书', 1085, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:book:edit', '#', 'admin', '2022-02-22 19:08:12', '', NULL, ''),
(1088, '删除图书', 1085, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:book:remove', '#', 'admin', '2022-02-22 19:08:44', '', NULL, ''),
(1089, '图书详情', 1085, 4, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:book:query', '#', 'admin', '2022-02-22 19:09:24', '', NULL, ''),
(1090, '图书借阅', 1062, 5, 'bookborrow', 'modules/person/xinhu-person/bookborrow/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-person:bookborrow:list', 'dict', 'admin', '2022-02-22 19:31:58', 'admin', '2022-04-01 19:21:59', ''),
(1091, '新增图书借阅', 1090, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:bookborrow:add', '#', 'admin', '2022-02-22 19:32:40', '', NULL, ''),
(1092, '修改图书借阅', 1090, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:bookborrow:edit', '#', 'admin', '2022-02-22 19:33:02', '', NULL, ''),
(1093, '删除图书借阅', 1090, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:bookborrow:remove', '#', 'admin', '2022-02-22 19:33:28', '', NULL, ''),
(1094, '图书借阅详情', 1090, 4, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:bookborrow:query', '#', 'admin', '2022-02-22 19:34:08', '', NULL, ''),
(1095, '公司管理', 1062, 6, 'company', 'modules/person/xinhu-person/company/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-person:company:list', 'component', 'admin', '2022-02-22 19:48:57', 'admin', '2022-04-01 19:21:53', ''),
(1096, '新增公司单位', 1095, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:company:add', '#', 'admin', '2022-02-22 19:51:53', '', NULL, ''),
(1097, '修改公司单位', 1095, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:company:edit', '#', 'admin', '2022-02-22 19:52:13', '', NULL, ''),
(1098, '删除公司单位', 1095, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:company:remove', '#', 'admin', '2022-02-22 19:52:33', '', NULL, ''),
(1099, '城市列表', 1062, 7, 'city', 'modules/person/xinhu-person/city/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-person:city:list', 'color', 'admin', '2022-02-22 20:00:29', 'admin', '2022-04-01 19:21:43', ''),
(1100, '新增城市', 1099, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:city:add', '#', 'admin', '2022-02-22 20:01:00', '', NULL, ''),
(1101, '修改城市', 1099, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:city:edit', '#', 'admin', '2022-02-22 20:01:20', '', NULL, ''),
(1102, '删除城市', 1099, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:city:remove', '#', 'admin', '2022-02-22 20:01:51', '', NULL, ''),
(1103, '会议列表', 1062, 8, 'meet', 'modules/person/xinhu-person/meet/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-person:meet:list', 'message', 'admin', '2022-02-22 20:03:24', 'admin', '2022-03-31 21:19:10', ''),
(1104, '新增会议', 1103, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:meet:add', '#', 'admin', '2022-02-22 20:04:22', '', NULL, ''),
(1105, '修改会议', 1103, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:meet:edit', '#', 'admin', '2022-02-22 20:04:41', '', NULL, ''),
(1106, '删除会议', 1103, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:meet:remove', '#', 'admin', '2022-02-22 20:05:03', 'admin', '2022-02-22 20:05:29', ''),
(1107, '系统菜单', 1062, 9, 'menu', 'modules/person/xinhu-person/menu/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-person:menu:list', 'excel', 'admin', '2022-02-22 20:07:46', 'admin', '2022-04-01 19:21:30', ''),
(1108, '新增系统菜单', 1107, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:menu:add', '#', 'admin', '2022-02-22 20:08:41', '', NULL, ''),
(1109, '修改系统菜单', 1107, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:menu:edit', '#', 'admin', '2022-02-22 20:09:02', '', NULL, ''),
(1110, '删除系统菜单', 1107, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:menu:remove', '#', 'admin', '2022-02-22 20:09:53', '', NULL, ''),
(1111, '新闻资讯', 1062, 10, 'news', 'modules/person/xinhu-person/news/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-person:news:list', 'color', 'admin', '2022-02-22 20:13:38', 'admin', '2022-04-01 19:21:24', ''),
(1112, '新增新闻资讯', 1111, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:news:add', '#', 'admin', '2022-02-22 20:14:09', '', NULL, ''),
(1113, '修改新闻资讯', 1111, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:news:edit', '#', 'admin', '2022-02-22 20:14:43', '', NULL, ''),
(1114, '删除新闻资讯', 1111, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:news:remove', '#', 'admin', '2022-02-22 20:15:03', '', NULL, ''),
(1115, '用户档案', 1062, 11, 'userinfo', 'modules/person/xinhu-person/userinfo/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-person:userinfo:list', 'color', 'admin', '2022-02-22 20:16:26', 'admin', '2022-04-01 19:21:18', ''),
(1116, '新增用户档案', 1115, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:userinfo:add', '#', 'admin', '2022-02-22 20:16:47', '', NULL, ''),
(1117, '修改用户档案', 1115, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:userinfo:edit', '#', 'admin', '2022-02-22 20:17:05', '', NULL, ''),
(1118, '删除用户档案', 1115, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:userinfo:remove', '#', 'admin', '2022-02-22 20:17:27', '', NULL, ''),
(1119, '人员子表', 1062, 12, 'userinfos', 'modules/person/xinhu-person/userinfos/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-person:userinfos:list', 'color', 'admin', '2022-02-22 20:18:23', 'admin', '2022-04-01 19:21:12', ''),
(1120, '新增人员档案子', 1119, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:userinfos:add', '#', 'admin', '2022-02-22 20:19:41', '', NULL, ''),
(1121, '修改人员档案子', 1119, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:userinfos:edit', '#', 'admin', '2022-02-22 20:20:04', '', NULL, ''),
(1122, '删除人员档案子', 1119, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:userinfos:remove', '#', 'admin', '2022-02-22 20:20:23', '', NULL, ''),
(1123, '用户合同', 1062, 13, 'userract', 'modules/person/xinhu-person/userract/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-person:userract:list', 'color', 'admin', '2022-02-22 20:21:18', 'admin', '2022-04-01 19:21:05', ''),
(1124, '新增用户合同', 1123, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:userract:add', '#', 'admin', '2022-02-22 20:22:06', '', NULL, ''),
(1125, '修改用户合同', 1123, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:userract:edit', '#', 'admin', '2022-02-22 20:22:26', '', NULL, ''),
(1126, '删除用户合同', 1123, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-person:userract:remove', '#', 'admin', '2022-02-22 20:22:44', '', NULL, ''),
(1127, '单据审核人', 1063, 1, 'checks', 'modules/flow/xinhu-flow/checks/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-flow:checks:list', 'color', 'admin', '2022-02-23 19:02:29', 'admin', '2022-04-01 19:22:42', ''),
(1128, '新增单据的审核人', 1127, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:checks:add', '#', 'admin', '2022-02-23 19:03:02', 'admin', '2022-02-23 19:03:11', ''),
(1129, '修改单据的审核人', 1127, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:checks:edit', '#', 'admin', '2022-02-23 19:03:31', '', NULL, ''),
(1130, '删除单据的审核人', 1127, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:checks:remove', '#', 'admin', '2022-02-23 19:03:50', '', NULL, ''),
(1131, '自定义审核人组', 1063, 2, 'cname', 'modules/flow/xinhu-flow/cname/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-flow:cname:list', 'color', 'admin', '2022-02-24 17:56:40', 'admin', '2022-03-13 19:13:08', ''),
(1132, '新增自定义审核人组', 1131, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:cname:add', '#', 'admin', '2022-02-24 17:57:15', '', NULL, ''),
(1133, '修改自定义审核人组', 1131, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:cname:edit', '#', 'admin', '2022-02-24 17:57:36', '', NULL, ''),
(1134, '删除自定义审核人组', 1131, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:cname:remove', '#', 'admin', '2022-02-24 17:58:04', '', NULL, ''),
(1135, '流程步骤', 1063, 3, 'course', 'modules/flow/xinhu-flow/course/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-flow:course:list', 'code', 'admin', '2022-02-24 18:00:08', 'admin', '2022-04-01 19:22:52', ''),
(1136, '新增流程步骤', 1135, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:course:add', '#', 'admin', '2022-02-24 18:00:44', '', NULL, ''),
(1137, '修改流程步骤', 1135, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:course:edit', '#', 'admin', '2022-02-24 18:01:05', '', NULL, ''),
(1138, '删除流程步骤', 1135, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:course:remove', '#', 'admin', '2022-02-24 18:01:36', '', NULL, ''),
(1139, '模块元素', 1063, 4, 'element', 'modules/flow/xinhu-flow/element/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-flow:element:list', 'color', 'admin', '2022-02-24 18:03:55', 'admin', '2022-04-01 19:23:53', ''),
(1140, '新增模块元素', 1139, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:element:add', '#', 'admin', '2022-02-24 18:04:33', '', NULL, ''),
(1141, '修改模块元素', 1139, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:element:edit', '#', 'admin', '2022-02-24 18:04:54', '', NULL, ''),
(1142, '删除模块元素', 1139, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:element:remove', '#', 'admin', '2022-02-24 18:05:12', '', NULL, ''),
(1143, '模块权限', 1063, 5, 'extent', 'modules/flow/xinhu-flow/extent/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-flow:extent:list', 'color', 'admin', '2022-02-24 18:09:57', 'admin', '2022-03-15 20:50:09', ''),
(1144, '新增模块权限', 1143, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:extent:add', '#', 'admin', '2022-02-24 18:11:27', '', NULL, ''),
(1145, '修改模块权限', 1143, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:extent:edit', '#', 'admin', '2022-02-24 18:11:51', '', NULL, ''),
(1146, '删除模块权限', 1143, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:extent:remove', '#', 'admin', '2022-02-24 18:12:17', '', NULL, ''),
(1147, '单据操作记录', 1063, 6, 'log', 'modules/flow/xinhu-flow/log/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-flow:log:list', 'color', 'admin', '2022-02-24 18:15:41', 'admin', '2022-03-15 20:50:21', ''),
(1148, '新增单据操作记录', 1147, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:log:add', '#', 'admin', '2022-02-24 18:16:36', '', NULL, ''),
(1149, '修改单据操作记录', 1147, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:log:edit', '#', 'admin', '2022-02-24 18:17:04', '', NULL, ''),
(1150, '删除单据操作记录', 1147, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:log:remove', '#', 'admin', '2022-02-24 18:18:52', '', NULL, ''),
(1151, '模块多模版设置', 1063, 7, 'modetpl', 'modules/flow/xinhu-flow/modetpl/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-flow:modetpl:list', 'color', 'admin', '2022-02-24 18:39:07', 'admin', '2022-03-15 20:50:32', ''),
(1152, '新增模块多模版设置', 1151, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:modetpl:add', '#', 'admin', '2022-02-24 18:39:37', '', NULL, ''),
(1153, '修改模块多模版设置', 1151, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:modetpl:edit', '#', 'admin', '2022-02-24 18:39:57', '', NULL, ''),
(1154, '删除模块多模版设置', 1151, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:modetpl:remove', '#', 'admin', '2022-02-24 18:40:17', '', NULL, ''),
(1155, '单据提醒设置', 1063, 8, 'remind', 'modules/flow/xinhu-flow/remind/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-flow:remind:list', 'code', 'admin', '2022-02-24 18:42:01', 'admin', '2022-04-01 19:30:33', ''),
(1156, '新增单据提醒设置', 1155, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:remind:add', '#', 'admin', '2022-02-24 18:42:23', '', NULL, ''),
(1157, '修改单据提醒设置', 1155, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:remind:edit', '#', 'admin', '2022-02-24 18:42:44', '', NULL, ''),
(1158, '删除单据提醒设置', 1155, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:remind:remove', '#', 'admin', '2022-02-24 18:43:04', '', NULL, ''),
(1159, '流程模块', 1063, 9, 'set', 'modules/flow/xinhu-flow/set/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-flow:set:list', 'code', 'admin', '2022-02-24 18:45:48', 'admin', '2022-03-15 20:50:40', ''),
(1160, '新增流程模块', 1159, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:set:add', '#', 'admin', '2022-02-24 18:46:11', '', NULL, ''),
(1161, '修改流程模块', 1159, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:set:edit', '#', 'admin', '2022-02-24 18:46:29', '', NULL, ''),
(1162, '删除流程模块', 1159, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:set:remove', '#', 'admin', '2022-02-24 18:46:57', '', NULL, ''),
(1163, '单据通知设置', 1063, 10, 'todo', 'modules/flow/xinhu-flow/todo/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-flow:todo:list', 'code', 'admin', '2022-02-24 18:52:17', 'admin', '2022-03-15 20:50:51', ''),
(1164, '新增单据通知设置', 1163, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:todo:add', '#', 'admin', '2022-02-24 18:52:41', '', NULL, ''),
(1165, '修改单据通知设置', 1163, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:todo:edit', '#', 'admin', '2022-02-24 18:53:03', '', NULL, ''),
(1166, '删除单据通知设置', 1163, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:todo:remove', '#', 'admin', '2022-02-24 18:53:24', '', NULL, ''),
(1167, '单据通知给对应人员', 1063, 11, 'todos', 'modules/flow/xinhu-flow/todos/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-flow:todos:list', 'code', 'admin', '2022-02-24 18:59:26', 'admin', '2022-03-15 20:50:59', ''),
(1168, '新增单据通知给对应人员', 1167, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:todos:add', '#', 'admin', '2022-02-24 18:59:49', '', NULL, ''),
(1169, '修改单据通知给对应人员', 1167, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:todos:edit', '#', 'admin', '2022-02-24 19:00:10', '', NULL, ''),
(1170, '删除单据通知给对应人员', 1167, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:todos:remove', '#', 'admin', '2022-02-24 19:00:29', '', NULL, ''),
(1171, '单据条件', 1063, 12, 'where', 'modules/flow/xinhu-flow/where/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-flow:where:list', 'color', 'admin', '2022-02-24 19:01:32', 'admin', '2022-03-15 20:51:07', ''),
(1172, '新增单据条件', 1171, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:where:add', '#', 'admin', '2022-02-24 19:01:57', '', NULL, ''),
(1173, '修改单据条件', 1171, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:where:edit', '#', 'admin', '2022-02-24 19:02:18', '', NULL, ''),
(1174, '删除单据条件', 1171, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-flow:where:remove', '#', 'admin', '2022-02-24 19:02:50', '', NULL, ''),
(1175, '任务列表', 1064, 1, 'work', 'modules/resources/xinhu-resources/work/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-resources:work:list', 'code', 'admin', '2022-02-24 19:08:23', 'admin', '2022-04-01 19:24:39', ''),
(1176, '新增任务', 1175, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:work:add', '#', 'admin', '2022-02-24 19:08:55', '', NULL, ''),
(1177, '修改任务', 1175, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:work:edit', '#', 'admin', '2022-02-24 19:09:13', '', NULL, ''),
(1178, '删除任务', 1175, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:work:remove', '#', 'admin', '2022-02-24 19:09:35', '', NULL, ''),
(1179, '项目表', 1064, 2, 'project', 'modules/resources/xinhu-resources/project/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-resources:project:list', 'code', 'admin', '2022-02-24 19:28:10', 'admin', '2022-04-01 19:25:50', ''),
(1180, '新增项目', 1179, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:project:add', '#', 'admin', '2022-02-24 19:28:39', '', NULL, ''),
(1181, '修改项目', 1179, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:project:edit', '#', 'admin', '2022-02-24 19:29:02', '', NULL, ''),
(1182, '删除项目', 1179, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:project:remove', '#', 'admin', '2022-02-24 19:29:24', '', NULL, ''),
(1183, '订阅管理表', 1064, 3, 'subscribe', 'modules/resources/xinhu-resources/subscribe/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-resources:subscribe:list', 'code', 'admin', '2022-02-24 19:58:09', 'admin', '2022-04-01 19:26:04', ''),
(1184, '新增订阅管理', 1183, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:subscribe:add', '#', 'admin', '2022-02-24 19:58:31', '', NULL, ''),
(1185, '修改订阅管理', 1183, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:subscribe:edit', '#', 'admin', '2022-02-24 19:58:48', '', NULL, ''),
(1186, '删除订阅管理', 1183, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:subscribe:remove', '#', 'admin', '2022-02-24 19:59:20', '', NULL, ''),
(1187, '订阅内容信息', 1064, 4, 'subscribeinfo', 'modules/resources/xinhu-resources/subscribeinfo/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-resources:subscribeinfo:list', 'code', 'admin', '2022-02-24 20:02:57', 'admin', '2022-04-01 19:26:12', ''),
(1188, '新增订阅内容信息', 1187, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:subscribeinfo:add', '#', 'admin', '2022-02-24 20:03:22', '', NULL, ''),
(1189, '修改订阅内容信息', 1187, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:subscribeinfo:edit', '#', 'admin', '2022-02-24 20:03:43', '', NULL, ''),
(1190, '删除订阅内容信息', 1187, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:subscribeinfo:remove', '#', 'admin', '2022-02-24 20:04:06', '', NULL, ''),
(1191, '计划任务', 1064, 5, 'task', 'modules/resources/xinhu-resources/task/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-resources:task:list', 'color', 'admin', '2022-02-24 20:10:09', 'admin', '2022-04-01 19:26:22', ''),
(1192, '新增计划任务', 1191, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:task:add', '#', 'admin', '2022-02-24 20:10:31', '', NULL, ''),
(1193, '修改计划任务', 1191, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:task:edit', '#', 'admin', '2022-02-24 20:10:50', '', NULL, ''),
(1194, '删除计划任务', 1191, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:task:remove', '#', 'admin', '2022-02-24 20:11:13', '', NULL, ''),
(1195, '提醒消息', 1064, 6, 'todo', 'modules/resources/xinhu-resources/todo/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-resources:todo:list', 'color', 'admin', '2022-02-24 20:13:38', 'admin', '2022-04-01 19:26:29', ''),
(1196, '新增提醒消息', 1195, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:todo:add', '#', 'admin', '2022-02-24 20:14:01', '', NULL, ''),
(1197, '修改提醒消息', 1195, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:todo:edit', '#', 'admin', '2022-02-24 20:14:25', '', NULL, ''),
(1198, '删除提醒消息', 1195, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:todo:remove', '#', 'admin', '2022-02-24 20:14:49', '', NULL, ''),
(1199, '日程待办', 1064, 7, 'scheduld', 'modules/resources/xinhu-resources/scheduld/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-resources:scheduld:list', 'color', 'admin', '2022-02-24 20:16:12', 'admin', '2022-04-01 19:27:22', ''),
(1200, '新增日程待办', 1199, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:scheduld:add', '#', 'admin', '2022-02-24 20:16:49', '', NULL, ''),
(1201, '修改日程待办', 1199, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:scheduld:edit', '#', 'admin', '2022-02-24 20:17:13', '', NULL, ''),
(1202, '删除日程待办', 1199, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:scheduld:remove', '#', 'admin', '2022-02-24 20:17:32', '', NULL, ''),
(1203, '日程', 1064, 8, 'schedule', 'modules/resources/xinhu-resources/schedule/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-resources:schedule:list', 'color', 'admin', '2022-02-24 20:18:36', 'admin', '2022-04-01 19:27:31', ''),
(1204, '新增日程', 1203, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:schedule:add', '#', 'admin', '2022-02-24 20:19:04', '', NULL, ''),
(1205, '修改日程', 1203, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:schedule:edit', '#', 'admin', '2022-02-24 20:19:25', '', NULL, ''),
(1206, '删除日程', 1203, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:schedule:remove', '#', 'admin', '2022-02-24 20:19:49', '', NULL, ''),
(1207, '说明', 1064, 9, 'userzheng', 'modules/resources/xinhu-resources/userzheng/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-resources:userzheng:list', 'list', 'admin', '2022-02-24 20:20:42', 'admin', '2022-04-01 19:27:37', ''),
(1208, '新增说明', 1207, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:userzheng:add', '#', 'admin', '2022-02-24 20:21:04', '', NULL, ''),
(1209, '修改说明', 1207, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:userzheng:edit', '#', 'admin', '2022-02-24 20:21:27', '', NULL, ''),
(1210, '删除说明', 1207, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-resources:userzheng:remove', '#', 'admin', '2022-02-24 20:21:47', '', NULL, ''),
(1211, '问卷表', 1065, 1, 'wenjuan', 'modules/document/xinhu-document/wenjuan/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-document:wenjuan:list', 'code', 'admin', '2022-02-24 20:24:00', 'admin', '2022-04-01 21:13:48', ''),
(1212, '新增问卷', 1211, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:wenjuan:add', '#', 'admin', '2022-03-09 20:18:01', '', NULL, ''),
(1213, '修改问卷', 1211, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:wenjuan:edit', '#', 'admin', '2022-03-09 20:19:01', '', NULL, ''),
(1214, '删除问卷', 1211, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:wenjuan:remove', '#', 'admin', '2022-03-09 20:19:21', '', NULL, ''),
(1215, '问卷表子表', 1065, 2, 'wenjuat', 'modules/document/xinhu-document/wenjuat/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-document:wenjuat:list', 'code', 'admin', '2022-03-09 20:22:52', '', NULL, ''),
(1216, '新增问卷子', 1215, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:wenjuat:add', '#', 'admin', '2022-03-09 20:24:09', '', NULL, ''),
(1217, '修改问卷子', 1215, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:wenjuat:edit', '#', 'admin', '2022-03-09 20:24:30', '', NULL, ''),
(1218, '删除问卷子', 1215, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:wenjuat:remove', '#', 'admin', '2022-03-09 20:24:48', '', NULL, ''),
(1219, '文档分区表', 1065, 3, 'worc', 'modules/document/xinhu-document/worc/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-document:worc:list', 'code', 'admin', '2022-03-09 20:26:51', '', NULL, ''),
(1220, '新增文档分区', 1219, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:worc:add', '#', 'admin', '2022-03-09 20:27:27', '', NULL, ''),
(1221, '修改文档分区', 1219, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:worc:edit', '#', 'admin', '2022-03-09 20:28:23', '', NULL, ''),
(1222, '删除文档分区', 1219, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:worc:remove', '#', 'admin', '2022-03-09 20:30:06', '', NULL, ''),
(1223, '文档表', 1065, 4, 'word', 'modules/document/xinhu-document/word/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-document:word:list', 'code', 'admin', '2022-03-09 20:32:27', '', NULL, ''),
(1224, '新增文档', 1223, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:word:add', '#', 'admin', '2022-03-09 20:32:50', '', NULL, ''),
(1225, '修改文档', 1223, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:word:edit', '#', 'admin', '2022-03-09 20:33:32', '', NULL, ''),
(1226, '删除文档', 1223, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:word:remove', '#', 'admin', '2022-03-09 20:33:50', '', NULL, ''),
(1227, '文件传送', 1065, 5, 'wordeil', 'modules/document/xinhu-document/wordeil/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-document:wordeil:list', 'code', 'admin', '2022-03-09 20:36:09', '', NULL, ''),
(1228, '新增文件传送', 1227, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:wordeil:add', '#', 'admin', '2022-03-09 20:36:37', '', NULL, ''),
(1229, '修改文件传送', 1227, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:wordeil:edit', '#', 'admin', '2022-03-09 20:37:08', '', NULL, ''),
(1230, '删除文件传送', 1227, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:wordeil:remove', '#', 'admin', '2022-03-09 20:37:30', '', NULL, ''),
(1231, '文档协作', 1065, 6, 'wordxie', 'modules/document/xinhu-document/wordxie/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-document:wordxie:list', 'code', 'admin', '2022-03-09 20:39:16', '', NULL, ''),
(1232, '新增文档协作', 1231, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:wordxie:add', '#', 'admin', '2022-03-09 20:39:43', '', NULL, ''),
(1233, '修改文档协作', 1231, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:wordxie:edit', '#', 'admin', '2022-03-09 20:40:15', '', NULL, ''),
(1234, '删除文档协作', 1231, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:wordxie:remove', '#', 'admin', '2022-03-09 20:40:33', '', NULL, ''),
(1235, '公文', 1065, 7, 'official', 'modules/document/xinhu-document/official/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-document:official:list', 'code', 'admin', '2022-03-09 20:42:29', '', NULL, ''),
(1236, '新增公文', 1235, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:official:add', '#', 'admin', '2022-03-09 20:43:30', '', NULL, ''),
(1237, '修改公文', 1235, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:official:edit', '#', 'admin', '2022-03-09 20:44:42', '', NULL, ''),
(1238, '删除公文', 1235, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:official:remove', '#', 'admin', '2022-03-09 20:45:44', '', NULL, ''),
(1239, '印章表', 1065, 8, 'seal', 'modules/document/xinhu-document/seal/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-document:seal:list', 'code', 'admin', '2022-03-09 20:49:02', '', NULL, ''),
(1240, '新增印章', 1239, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:seal:add', '#', 'admin', '2022-03-09 20:49:24', '', NULL, ''),
(1241, '修改印章', 1239, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:seal:edit', '#', 'admin', '2022-03-09 20:50:10', '', NULL, ''),
(1242, '删除印章', 1239, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:seal:remove', '#', 'admin', '2022-03-09 20:50:28', '', NULL, ''),
(1243, '印章申请使用表', 1065, 9, 'sealapl', 'modules/document/xinhu-document/sealapl/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-document:sealapl:list', 'code', 'admin', '2022-03-09 20:53:37', '', NULL, ''),
(1244, '新增印章申请使用', 1243, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:sealapl:add', '#', 'admin', '2022-03-09 20:54:24', '', NULL, ''),
(1245, '修改印章申请使用', 1243, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:sealapl:edit', '#', 'admin', '2022-03-09 20:54:42', '', NULL, ''),
(1246, '删除印章申请使用', 1243, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-document:sealapl:remove', '#', 'admin', '2022-03-09 20:55:36', '', NULL, ''),
(1247, '考核评分表', 1066, 1, 'hrcheck', 'modules/hr/xinhu-hr/hrcheck/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:hrcheck:list', 'code', 'admin', '2022-03-09 21:05:40', '', NULL, ''),
(1248, '新增考核评分', 1247, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrcheck:add', '#', 'admin', '2022-03-09 21:07:08', '', NULL, ''),
(1249, '修改考核评分', 1247, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrcheck:edit', '#', 'admin', '2022-03-09 21:07:27', '', NULL, ''),
(1250, '删除考核评分', 1247, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrcheck:remove', '#', 'admin', '2022-03-09 21:07:49', '', NULL, ''),
(1251, '考核评分记录', 1066, 2, 'hrcheckn', 'modules/hr/xinhu-hr/hrcheckn/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:hrcheckn:list', 'color', 'admin', '2022-03-09 21:10:45', '', NULL, ''),
(1252, '新增考核评分记录', 1251, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrcheckn:add', '#', 'admin', '2022-03-09 21:11:48', '', NULL, ''),
(1253, '修改考核评分记录', 1251, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrcheckn:edit', '#', 'admin', '2022-03-09 21:13:31', '', NULL, ''),
(1254, '删除考核评分记录', 1251, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrcheckn:remove', '#', 'admin', '2022-03-09 21:14:42', '', NULL, ''),
(1255, '考评内容', 1066, 3, 'hrchecks', 'modules/hr/xinhu-hr/hrchecks/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:hrchecks:list', 'code', 'admin', '2022-03-09 21:20:02', '', NULL, ''),
(1256, '新增考评内容', 1255, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrchecks:add', '#', 'admin', '2022-03-09 21:20:57', '', NULL, ''),
(1257, '修改考评内容', 1255, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrchecks:edit', '#', 'admin', '2022-03-09 21:21:16', '', NULL, ''),
(1258, '删除考评内容', 1255, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrchecks:remove', '#', 'admin', '2022-03-09 21:21:37', '', NULL, ''),
(1259, '面试和人员需求表', 1066, 4, 'hrdemint', 'modules/hr/xinhu-hr/hrdemint/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:hrdemint:list', 'code', 'admin', '2022-03-09 21:27:46', '', NULL, ''),
(1260, '新增面试和人员需求', 1259, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrdemint:add', '#', 'admin', '2022-03-09 21:28:40', '', NULL, ''),
(1261, '修改面试和人员需求', 1259, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrdemint:edit', '#', 'admin', '2022-03-09 21:28:58', '', NULL, ''),
(1262, '删除面试和人员需求', 1259, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrdemint:remove', '#', 'admin', '2022-03-09 21:29:16', '', NULL, ''),
(1263, '考核项目', 1066, 5, 'hrkaohem', 'modules/hr/xinhu-hr/hrkaohem/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:hrkaohem:list', 'code', 'admin', '2022-03-09 21:35:14', '', NULL, ''),
(1264, '新增考核项目', 1263, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrkaohem:add', '#', 'admin', '2022-03-09 21:35:56', '', NULL, ''),
(1265, '修改考核项目', 1263, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrkaohem:edit', '#', 'admin', '2022-03-09 21:36:45', '', NULL, ''),
(1266, '删除考核项目', 1263, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrkaohem:remove', '#', 'admin', '2022-03-09 21:37:07', '', NULL, ''),
(1267, '考核项目人员', 1066, 6, 'hrkaohen', 'modules/hr/xinhu-hr/hrkaohen/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:hrkaohen:list', 'code', 'admin', '2022-03-09 21:38:31', '', NULL, ''),
(1268, '新增考核项目人员', 1267, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrkaohen:add', '#', 'admin', '2022-03-09 21:39:51', '', NULL, ''),
(1269, '修改考核项目人员', 1267, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrkaohen:edit', '#', 'admin', '2022-03-09 21:40:27', '', NULL, ''),
(1270, '删除考核项目人员', 1267, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrkaohen:remove', '#', 'admin', '2022-03-09 21:40:46', '', NULL, ''),
(1271, '考核项目的内容', 1066, 7, 'hrkaohes', 'modules/hr/xinhu-hr/hrkaohes/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:hrkaohes:list', 'color', 'admin', '2022-03-09 21:44:25', '', NULL, ''),
(1272, '新增考核项目的内容', 1271, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrkaohes:add', '#', 'admin', '2022-03-09 21:45:25', '', NULL, ''),
(1273, '修改考核项目的内容', 1271, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrkaohes:edit', '#', 'admin', '2022-03-09 21:45:43', '', NULL, ''),
(1274, '删除考核项目的内容', 1271, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrkaohes:remove', '#', 'admin', '2022-03-09 21:46:10', '', NULL, ''),
(1275, 'HR转正', 1066, 8, 'hrpositive', 'modules/hr/xinhu-hr/hrpositive/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:hrpositive:list', 'color', 'admin', '2022-03-09 21:51:01', '', NULL, ''),
(1276, '新增HR转正', 1275, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrpositive:add', '#', 'admin', '2022-03-09 21:51:20', '', NULL, ''),
(1277, '修改HR转正', 1275, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrpositive:edit', '#', 'admin', '2022-03-09 21:52:10', '', NULL, ''),
(1278, '删除HR转正', 1275, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrpositive:remove', '#', 'admin', '2022-03-09 21:52:31', '', NULL, ''),
(1279, '离职申请', 1066, 9, 'hrredund', 'modules/hr/xinhu-hr/hrredund/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:hrredund:list', 'color', 'admin', '2022-03-09 21:53:58', '', NULL, ''),
(1280, '新增离职申请', 1279, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrredund:add', '#', 'admin', '2022-03-09 21:54:16', '', NULL, ''),
(1281, '修改离职申请', 1279, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrredund:edit', '#', 'admin', '2022-03-09 21:54:40', '', NULL, ''),
(1282, '删除离职申请', 1279, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrredund:remove', '#', 'admin', '2022-03-09 21:54:58', '', NULL, ''),
(1283, '薪资模版', 1066, 10, 'hrsalarm', 'modules/hr/xinhu-hr/hrsalarm/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:hrsalarm:list', 'code', 'admin', '2022-03-09 21:56:06', '', NULL, ''),
(1284, '新增薪资模版', 1283, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrsalarm:add', '#', 'admin', '2022-03-09 21:56:25', '', NULL, ''),
(1285, '修改薪资模版', 1283, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrsalarm:edit', '#', 'admin', '2022-03-09 21:56:42', '', NULL, ''),
(1286, '删除薪资模版', 1283, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrsalarm:remove', '#', 'admin', '2022-03-09 21:57:23', '', NULL, ''),
(1287, '薪资模版子表', 1066, 11, 'hrsalars', 'modules/hr/xinhu-hr/hrsalars/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:hrsalars:list', 'color', 'admin', '2022-03-10 18:25:21', '', NULL, ''),
(1288, '新增薪资模版子', 1287, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrsalars:add', '#', 'admin', '2022-03-10 18:26:13', '', NULL, ''),
(1289, '修改薪资模版子', 1287, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrsalars:edit', '#', 'admin', '2022-03-10 18:26:35', '', NULL, ''),
(1290, '删除薪资模版子', 1287, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrsalars:remove', '#', 'admin', '2022-03-10 18:26:53', '', NULL, ''),
(1291, '工资表', 1066, 12, 'hrsalary', 'modules/hr/xinhu-hr/hrsalary/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:hrsalary:list', 'code', 'admin', '2022-03-10 18:28:14', '', NULL, ''),
(1292, '新增工资', 1291, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrsalary:add', '#', 'admin', '2022-03-10 18:28:35', '', NULL, ''),
(1293, '修改工资', 1291, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrsalary:edit', '#', 'admin', '2022-03-10 18:28:54', '', NULL, ''),
(1294, '删除工资', 1291, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrsalary:remove', '#', 'admin', '2022-03-10 18:29:29', '', NULL, ''),
(1295, '社保公积金', 1066, 13, 'hrshebao', 'modules/hr/xinhu-hr/hrshebao/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:hrshebao:list', 'code', 'admin', '2022-03-10 18:30:25', '', NULL, ''),
(1296, '新增社保公积金', 1295, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrshebao:add', '#', 'admin', '2022-03-10 18:31:38', '', NULL, ''),
(1297, '修改社保公积金', 1295, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrshebao:edit', '#', 'admin', '2022-03-10 18:31:55', '', NULL, ''),
(1298, '删除社保公积金', 1295, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrshebao:remove', '#', 'admin', '2022-03-10 18:32:12', '', NULL, ''),
(1299, '职位调动', 1066, 14, 'hrtransfer', 'modules/hr/xinhu-hr/hrtransfer/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:hrtransfer:list', 'code', 'admin', '2022-03-10 18:32:59', '', NULL, ''),
(1300, '新增职位调动', 1299, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrtransfer:add', '#', 'admin', '2022-03-10 18:33:17', '', NULL, ''),
(1301, '修改职位调动', 1299, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrtransfer:edit', '#', 'admin', '2022-03-10 18:33:33', '', NULL, ''),
(1302, '删除职位调动', 1299, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrtransfer:remove', '#', 'admin', '2022-03-10 18:33:50', '', NULL, ''),
(1303, '调薪申请', 1066, 15, 'hrtrsalary', 'modules/hr/xinhu-hr/hrtrsalary/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:hrtrsalary:list', 'code', 'admin', '2022-03-10 18:36:25', '', NULL, ''),
(1304, '新增调薪申请', 1303, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrtrsalary:add', '#', 'admin', '2022-03-10 18:36:43', '', NULL, ''),
(1305, '修改调薪申请', 1303, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrtrsalary:edit', '#', 'admin', '2022-03-10 18:37:01', '', NULL, ''),
(1306, '删除调薪申请', 1303, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:hrtrsalary:remove', '#', 'admin', '2022-03-10 18:39:00', '', NULL, ''),
(1307, 'IM会话表', 1066, 16, 'group', 'modules/hr/xinhu-hr/group/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:group:list', 'code', 'admin', '2022-03-10 18:40:18', 'admin', '2022-04-02 21:12:24', ''),
(1308, '新增IM会话', 1307, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:group:add', '#', 'admin', '2022-03-10 18:40:42', '', NULL, '');
INSERT INTO `sys_menu` (`menu_id`, `menu_name`, `parent_id`, `order_num`, `path`, `component`, `query`, `is_frame`, `is_cache`, `menu_type`, `visible`, `status`, `perms`, `icon`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES
(1309, '修改IM会话', 1307, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:group:edit', '#', 'admin', '2022-03-10 18:40:58', '', NULL, ''),
(1310, '删除IM会话', 1307, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:group:remove', '#', 'admin', '2022-03-10 18:41:14', '', NULL, ''),
(1311, 'IM会话人员', 1066, 17, 'groupuser', 'modules/hr/xinhu-hr/groupuser/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:groupuser:list', 'code', 'admin', '2022-03-10 18:43:25', 'admin', '2022-04-02 21:12:12', ''),
(1312, '新增IM会话人员', 1311, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:groupuser:add', '#', 'admin', '2022-03-10 18:44:47', '', NULL, ''),
(1313, '修改IM会话人员', 1311, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:groupuser:edit', '#', 'admin', '2022-03-10 18:45:01', '', NULL, ''),
(1314, '删除IM会话人员', 1311, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:groupuser:remove', '#', 'admin', '2022-03-10 18:45:16', '', NULL, ''),
(1315, 'IM会话记录历史表', 1066, 18, 'history', 'modules/hr/xinhu-hr/history/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:history:list', 'code', 'admin', '2022-03-10 18:47:52', 'admin', '2022-04-02 21:12:05', ''),
(1316, '新增IM会话记录历史', 1315, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:history:add', '#', 'admin', '2022-03-10 18:48:12', '', NULL, ''),
(1317, '修改IM会话记录历史', 1315, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:history:edit', '#', 'admin', '2022-03-10 18:48:30', '', NULL, ''),
(1318, '删除IM会话记录历史', 1315, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:history:remove', '#', 'admin', '2022-03-10 18:48:48', '', NULL, ''),
(1319, '消息管理', 1066, 19, 'message', NULL, NULL, 1, 0, 'M', '0', '0', NULL, 'code', 'admin', '2022-03-10 18:51:51', '', NULL, ''),
(1320, 'IM下应用菜单', 1319, 1, 'menu', 'modules/hr/xinhu-hr/menu/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:menu:list', 'code', 'admin', '2022-03-10 18:52:55', 'admin', '2022-04-02 21:30:17', ''),
(1321, '新增IM下应用菜单', 1320, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:menu:add', '#', 'admin', '2022-03-10 18:54:24', '', NULL, ''),
(1322, '修改IM下应用菜单', 1320, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:menu:edit', '#', 'admin', '2022-03-10 18:54:45', '', NULL, ''),
(1323, '删除IM下应用菜单', 1320, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:menu:remove', '#', 'admin', '2022-03-10 18:55:06', '', NULL, ''),
(1324, 'IM聊天记录表', 1319, 2, 'mess', 'modules/hr/xinhu-hr/mess/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:mess:list', 'color', 'admin', '2022-03-10 18:55:57', 'admin', '2022-04-02 21:30:29', ''),
(1325, '新增IM聊天记录', 1324, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:mess:add', '#', 'admin', '2022-03-10 18:56:15', '', NULL, ''),
(1326, '修改IM聊天记录', 1324, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:mess:edit', '#', 'admin', '2022-03-10 18:56:30', '', NULL, ''),
(1327, '删除IM聊天记录', 1324, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:mess:remove', '#', 'admin', '2022-03-10 18:56:55', '', NULL, ''),
(1328, 'IM聊天消息状态表', 1319, 3, 'messzt', 'modules/hr/xinhu-hr/messzt/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:messzt:list', 'code', 'admin', '2022-03-10 18:59:46', 'admin', '2022-04-02 21:30:38', ''),
(1329, '新增IM聊天消息状态', 1328, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:messzt:add', '#', 'admin', '2022-03-10 19:00:06', '', NULL, ''),
(1330, '修改IM聊天消息状态', 1328, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:messzt:edit', '#', 'admin', '2022-03-10 19:00:24', '', NULL, ''),
(1331, '删除IM聊天消息状态', 1328, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:messzt:remove', '#', 'admin', '2022-03-10 19:00:39', '', NULL, ''),
(1332, '通知公告', 1319, 4, 'infor', 'modules/hr/xinhu-hr/infor/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:infor:list', 'color', 'admin', '2022-03-10 19:02:34', '', NULL, ''),
(1333, '信息子表投票项', 1319, 5, 'infors', 'modules/hr/xinhu-hr/infors/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:infors:list', 'color', 'admin', '2022-03-10 19:04:46', 'admin', '2022-03-10 19:05:18', ''),
(1334, '新增通知公告', 1332, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:infor:add', '#', 'admin', '2022-03-10 19:05:46', '', NULL, ''),
(1335, '修改通知公告', 1332, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:infor:edit', '#', 'admin', '2022-03-10 19:06:04', '', NULL, ''),
(1336, '删除通知公告', 1332, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:infor:remove', '#', 'admin', '2022-03-10 19:06:25', '', NULL, ''),
(1337, '新增信息子投票项', 1333, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:infors:add', '#', 'admin', '2022-03-10 19:06:49', '', NULL, ''),
(1338, '修改信息子投票项', 1333, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:infors:edit', '#', 'admin', '2022-03-10 19:07:05', '', NULL, ''),
(1339, '删除信息子投票项', 1333, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:infors:remove', '#', 'admin', '2022-03-10 19:07:21', '', NULL, ''),
(1340, '知识信息', 1319, 6, 'knowledge', 'modules/hr/xinhu-hr/knowledge/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:knowledge:list', 'code', 'admin', '2022-03-10 19:08:16', '', NULL, ''),
(1341, '新增知识信息', 1340, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:knowledge:add', '#', 'admin', '2022-03-10 19:08:38', '', NULL, ''),
(1342, '修改知识信息', 1340, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:knowledge:edit', '#', 'admin', '2022-03-10 19:08:57', '', NULL, ''),
(1343, '删除知识信息', 1340, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:knowledge:remove', '#', 'admin', '2022-03-10 19:09:12', '', NULL, ''),
(1344, '知识题库', 1319, 7, 'knowtiku', 'modules/hr/xinhu-hr/knowtiku/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:knowtiku:list', 'code', 'admin', '2022-03-10 19:22:29', '', NULL, ''),
(1345, '新增知识题库', 1344, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:knowtiku:add', '#', 'admin', '2022-03-10 19:23:01', '', NULL, ''),
(1346, '修改知识题库', 1344, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:knowtiku:edit', '#', 'admin', '2022-03-10 19:23:18', '', NULL, ''),
(1347, '删除知识题库', 1344, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:knowtiku:remove', '#', 'admin', '2022-03-10 19:23:39', '', NULL, ''),
(1348, '培训表出题考试', 1319, 8, 'knowtraim', 'modules/hr/xinhu-hr/knowtraim/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:knowtraim:list', 'code', 'admin', '2022-03-10 19:24:51', '', NULL, ''),
(1349, '新增培训出题考试', 1348, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:knowtraim:add', '#', 'admin', '2022-03-10 19:25:14', '', NULL, ''),
(1350, '修改培训出题考试', 1348, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:knowtraim:edit', '#', 'admin', '2022-03-10 19:25:30', '', NULL, ''),
(1351, '删除培训出题考试', 1348, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:knowtraim:remove', '#', 'admin', '2022-03-10 19:25:50', '', NULL, ''),
(1352, '考试培训子表', 1319, 9, 'knowtrais', 'modules/hr/xinhu-hr/knowtrais/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:knowtrais:list', 'color', 'admin', '2022-03-10 19:27:56', 'admin', '2022-04-02 22:02:21', ''),
(1353, '新增考试培训子', 1352, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:knowtrais:add', '#', 'admin', '2022-03-10 19:28:24', '', NULL, ''),
(1354, '修改考试培训子', 1352, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:knowtrais:edit', '#', 'admin', '2022-03-10 19:28:45', '', NULL, ''),
(1355, '删除考试培训子', 1352, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:knowtrais:remove', '#', 'admin', '2022-03-10 19:29:04', '', NULL, ''),
(1356, '培训内容', 1066, 20, 'trainning', NULL, NULL, 1, 0, 'M', '0', '0', NULL, 'code', 'admin', '2022-03-10 19:51:47', '', NULL, ''),
(1357, '考勤分析', 1356, 1, 'kqanay', 'modules/hr/xinhu-hr/kqanay/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:kqanay:list', 'code', 'admin', '2022-03-10 19:53:11', '', NULL, ''),
(1358, '新增考勤分析', 1357, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqanay:add', '#', 'admin', '2022-03-10 19:53:40', '', NULL, ''),
(1359, '修改考勤分析', 1357, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqanay:edit', '#', 'admin', '2022-03-10 19:53:59', '', NULL, ''),
(1360, '删除考勤分析', 1357, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqanay:remove', '#', 'admin', '2022-03-10 19:54:16', '', NULL, ''),
(1361, '考勤分配表', 1356, 2, 'kqdist', 'modules/hr/xinhu-hr/kqdist/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:kqdist:list', 'code', 'admin', '2022-03-10 19:55:05', '', NULL, ''),
(1362, '新增考勤分配', 1361, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqdist:add', '#', 'admin', '2022-03-10 19:58:44', '', NULL, ''),
(1363, '修改考勤分配', 1361, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqdist:edit', '#', 'admin', '2022-03-10 19:59:08', '', NULL, ''),
(1364, '删除考勤分配', 1361, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqdist:remove', '#', 'admin', '2022-03-10 19:59:26', '', NULL, ''),
(1365, '考勤排班', 1356, 3, 'kqdisv', 'modules/hr/xinhu-hr/kqdisv/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:kqdisv:list', 'code', 'admin', '2022-03-10 20:02:23', '', NULL, ''),
(1366, '新增考勤排班', 1365, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqdisv:add', '#', 'admin', '2022-03-10 20:02:50', '', NULL, ''),
(1367, '修改考勤排班', 1365, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqdisv:edit', '#', 'admin', '2022-03-10 20:03:06', '', NULL, ''),
(1368, '删除考勤排班', 1365, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqdisv:remove', '#', 'admin', '2022-03-10 20:03:23', '', NULL, ''),
(1369, '打卡记录', 1356, 4, 'kqdkjl', 'modules/hr/xinhu-hr/kqdkjl/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:kqdkjl:list', 'code', 'admin', '2022-03-10 20:07:35', '', NULL, ''),
(1370, '新增打卡记录', 1369, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqdkjl:add', '#', 'admin', '2022-03-10 20:08:58', '', NULL, ''),
(1371, '修改打卡记录', 1369, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqdkjl:edit', '#', 'admin', '2022-03-10 20:09:13', '', NULL, ''),
(1372, '删除打卡记录', 1369, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqdkjl:remove', '#', 'admin', '2022-03-10 20:09:30', '', NULL, ''),
(1373, '考勤定位规则', 1356, 5, 'kqdw', 'modules/hr/xinhu-hr/kqdw/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:kqdw:list', 'color', 'admin', '2022-03-10 20:11:58', '', NULL, ''),
(1374, '新增考勤定位规则', 1373, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqdw:add', '#', 'admin', '2022-03-10 20:12:18', '', NULL, ''),
(1375, '修改考勤定位规则', 1373, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqdw:edit', '#', 'admin', '2022-03-10 20:15:28', '', NULL, ''),
(1376, '删除考勤定位规则', 1373, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqdw:remove', '#', 'admin', '2022-03-10 20:15:42', '', NULL, ''),
(1377, '打卡异常申请', 1356, 6, 'kqerr', 'modules/hr/xinhu-hr/kqerr/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:kqerr:list', 'color', 'admin', '2022-03-10 20:18:59', '', NULL, ''),
(1378, '新增打卡异常申请', 1377, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqerr:add', '#', 'admin', '2022-03-10 20:23:35', '', NULL, ''),
(1379, '修改打卡异常申请', 1377, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqerr:edit', '#', 'admin', '2022-03-10 20:23:52', '', NULL, ''),
(1380, '删除打卡异常申请', 1377, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqerr:remove', '#', 'admin', '2022-03-10 20:24:06', '', NULL, ''),
(1381, '请假条加班单', 1356, 7, 'kqinfo', 'modules/hr/xinhu-hr/kqinfo/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:kqinfo:list', 'color', 'admin', '2022-03-10 20:30:26', '', NULL, ''),
(1382, '新增请假条加班单', 1381, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqinfo:add', '#', 'admin', '2022-03-10 20:30:42', '', NULL, ''),
(1383, '修改请假条加班单', 1381, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqinfo:edit', '#', 'admin', '2022-03-10 20:30:59', '', NULL, ''),
(1384, '删除请假条加班单', 1381, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqinfo:remove', '#', 'admin', '2022-03-10 20:31:14', '', NULL, ''),
(1385, '考勤机命令发送表', 1356, 8, 'kqjcmd', 'modules/hr/xinhu-hr/kqjcmd/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:kqjcmd:list', 'code', 'admin', '2022-03-10 20:33:20', '', NULL, ''),
(1386, '新增考勤机命令发送', 1385, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqjcmd:add', '#', 'admin', '2022-03-10 20:33:37', '', NULL, ''),
(1387, '修改考勤机命令发送', 1385, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqjcmd:edit', '#', 'admin', '2022-03-10 20:33:54', '', NULL, ''),
(1388, '删除考勤机命令发送', 1385, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqjcmd:remove', '#', 'admin', '2022-03-10 20:34:11', '', NULL, ''),
(1389, '考勤机设备表', 1356, 9, 'kqjsn', 'modules/hr/xinhu-hr/kqjsn/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:kqjsn:list', 'code', 'admin', '2022-03-10 20:36:30', '', NULL, ''),
(1390, '新增考勤机设备', 1389, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqjsn:add', '#', 'admin', '2022-03-10 20:37:00', '', NULL, ''),
(1391, '修改考勤机设备', 1389, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqjsn:edit', '#', 'admin', '2022-03-10 20:37:17', '', NULL, ''),
(1392, '删除考勤机设备', 1389, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqjsn:remove', '#', 'admin', '2022-03-10 20:37:36', '', NULL, ''),
(1393, '考勤机上人员', 1356, 10, 'kqjuser', 'modules/hr/xinhu-hr/kqjuser/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:kqjuser:list', 'code', 'admin', '2022-03-10 20:39:38', '', NULL, ''),
(1394, '新增考勤机上人员', 1393, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqjuser:add', '#', 'admin', '2022-03-10 20:44:55', '', NULL, ''),
(1395, '修改考勤机上人员', 1393, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqjuser:edit', '#', 'admin', '2022-03-10 20:45:11', '', NULL, ''),
(1396, '删除考勤机上人员', 1393, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqjuser:remove', '#', 'admin', '2022-03-10 20:45:27', '', NULL, ''),
(1397, '外出出差', 1356, 11, 'kqout', 'modules/hr/xinhu-hr/kqout/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:kqout:list', 'color', 'admin', '2022-03-10 20:47:28', '', NULL, ''),
(1398, '新增外出出差', 1397, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqout:add', '#', 'admin', '2022-03-10 20:47:45', '', NULL, ''),
(1399, '修改外出出差', 1397, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqout:edit', '#', 'admin', '2022-03-10 20:48:01', '', NULL, ''),
(1400, '删除外出出差', 1397, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqout:remove', '#', 'admin', '2022-03-10 20:48:17', '', NULL, ''),
(1401, '考勤时间规则', 1356, 12, 'kqsjgz', 'modules/hr/xinhu-hr/kqsjgz/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:kqsjgz:list', 'color', 'admin', '2022-03-10 20:50:37', '', NULL, ''),
(1402, '新增考勤时间规则', 1401, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqsjgz:add', '#', 'admin', '2022-03-10 20:50:52', '', NULL, ''),
(1403, '修改考勤时间规则', 1401, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqsjgz:edit', '#', 'admin', '2022-03-10 20:51:21', '', NULL, ''),
(1404, '删除考勤时间规则', 1401, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqsjgz:remove', '#', 'admin', '2022-03-10 20:51:35', '', NULL, ''),
(1405, '休息时间规则', 1356, 13, 'kqxxsj', 'modules/hr/xinhu-hr/kqxxsj/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:kqxxsj:list', 'code', 'admin', '2022-03-10 20:53:10', '', NULL, ''),
(1406, '新增休息时间规则', 1405, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqxxsj:add', '#', 'admin', '2022-03-10 20:53:27', '', NULL, ''),
(1407, '修改休息时间规则', 1405, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqxxsj:edit', '#', 'admin', '2022-03-10 20:53:42', '', NULL, ''),
(1408, '删除休息时间规则', 1405, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:kqxxsj:remove', '#', 'admin', '2022-03-10 20:53:57', '', NULL, ''),
(1409, '外勤定位', 1356, 14, 'location', 'modules/hr/xinhu-hr/location/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:location:list', 'code', 'admin', '2022-03-10 20:57:59', '', NULL, ''),
(1410, '奖惩', 1356, 15, 'reward', 'modules/hr/xinhu-hr/reward/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:reward:list', 'code', 'admin', '2022-03-10 20:58:49', '', NULL, ''),
(1411, '个人通讯录', 1356, 16, 'vcard', 'modules/hr/xinhu-hr/vcard/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-hr:vcard:list', 'color', 'admin', '2022-03-10 20:59:32', '', NULL, ''),
(1412, '新增个人通讯录', 1411, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:vcard:add', '#', 'admin', '2022-03-10 20:59:55', '', NULL, ''),
(1413, '修改个人通讯录', 1411, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:vcard:edit', '#', 'admin', '2022-03-10 21:00:11', '', NULL, ''),
(1414, '删除个人通讯录', 1411, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:vcard:remove', '#', 'admin', '2022-03-10 21:00:27', '', NULL, ''),
(1415, '新增奖惩', 1410, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:reward:add', '#', 'admin', '2022-03-10 21:00:51', '', NULL, ''),
(1416, '修改奖惩', 1410, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:reward:edit', '#', 'admin', '2022-03-10 21:01:06', '', NULL, ''),
(1417, '删除奖惩', 1410, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:reward:remove', '#', 'admin', '2022-03-10 21:01:23', '', NULL, ''),
(1418, '新增外勤定位', 1409, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:location:add', '#', 'admin', '2022-03-10 21:01:45', '', NULL, ''),
(1419, '修改外勤定位', 1409, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:location:edit', '#', 'admin', '2022-03-10 21:02:00', '', NULL, ''),
(1420, '删除外勤定位', 1409, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-hr:location:remove', '#', 'admin', '2022-03-10 21:02:19', '', NULL, ''),
(1421, '修改记录表', 1067, 1, 'editrecord', 'modules/police/xinhu-police/editrecord/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-police:editrecord:list', 'code', 'admin', '2022-03-10 21:05:14', '', NULL, ''),
(1422, '新增修改记录', 1421, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:editrecord:add', '#', 'admin', '2022-03-10 21:05:31', 'admin', '2022-03-10 21:06:51', ''),
(1423, '修改修改记录', 1421, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:editrecord:edit', '#', 'admin', '2022-03-10 21:05:46', 'admin', '2022-03-10 21:06:58', ''),
(1424, '删除修改记录', 1421, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:editrecord:remove', '#', 'admin', '2022-03-10 21:06:03', 'admin', '2022-03-10 21:07:05', ''),
(1425, '邮件主表', 1067, 2, 'emailm', 'modules/police/xinhu-police/emailm/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-police:emailm:list', 'color', 'admin', '2022-03-10 21:07:57', '', NULL, ''),
(1426, '新增邮件主', 1425, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:emailm:add', '#', 'admin', '2022-03-10 21:08:23', '', NULL, ''),
(1427, '修改邮件主', 1425, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:emailm:edit', '#', 'admin', '2022-03-10 21:08:38', '', NULL, ''),
(1428, '删除邮件主', 1425, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:emailm:remove', '#', 'admin', '2022-03-10 21:08:54', '', NULL, ''),
(1429, '获取邮件主详细信息', 1425, 4, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:emailm:query', '#', 'admin', '2022-03-10 21:09:21', '', NULL, ''),
(1430, '导出邮件主列表', 1425, 5, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:emailm:export', '#', 'admin', '2022-03-10 21:09:38', '', NULL, ''),
(1431, '邮件子表', 1067, 3, 'emails', 'modules/police/xinhu-police/emails/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-police:emails:list', 'color', 'admin', '2022-03-11 18:42:39', '', NULL, ''),
(1432, '新增邮件子', 1431, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:emails:add', '#', 'admin', '2022-03-11 18:48:02', '', NULL, ''),
(1433, '修改邮件子', 1431, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:emails:edit', '#', 'admin', '2022-03-11 18:49:54', '', NULL, ''),
(1434, '删除邮件子', 1431, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:emails:remove', '#', 'admin', '2022-03-11 18:50:45', '', NULL, ''),
(1435, '系统发送邮件内容', 1067, 4, 'cont', 'modules/police/xinhu-police/cont/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-police:cont:list', 'color', 'admin', '2022-03-11 18:53:44', 'admin', '2022-04-03 20:45:48', ''),
(1436, '新增系统发送邮件内容', 1435, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:cont:add', '#', 'admin', '2022-03-11 18:54:02', '', NULL, ''),
(1437, '修改系统发送邮件内容', 1435, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:cont:edit', '#', 'admin', '2022-03-11 18:54:19', '', NULL, ''),
(1438, '删除系统发送邮件内容', 1435, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:cont:remove', '#', 'admin', '2022-03-11 18:54:38', '', NULL, ''),
(1439, '上传文件记录表', 1067, 5, 'file', 'modules/police/xinhu-police/file/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-police:file:list', 'color', 'admin', '2022-03-11 18:58:58', '', NULL, ''),
(1440, '新增上传文件记录', 1439, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:file:add', '#', 'admin', '2022-03-11 18:59:53', '', NULL, ''),
(1441, '修改上传文件记录', 1439, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:file:edit', '#', 'admin', '2022-03-11 19:00:25', '', NULL, ''),
(1442, '删除上传文件记录', 1439, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:file:remove', '#', 'admin', '2022-03-11 19:00:52', '', NULL, ''),
(1443, '文件记录下载和预览', 1067, 6, 'files', 'modules/police/xinhu-police/files/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-police:files:list', 'color', 'admin', '2022-03-11 19:02:42', '', NULL, ''),
(1444, '新增文件记录下载和预览', 1443, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:files:add', '#', 'admin', '2022-03-11 19:02:59', '', NULL, ''),
(1445, '修改文件记录下载和预览', 1443, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:files:edit', '#', 'admin', '2022-03-11 19:03:20', '', NULL, ''),
(1446, '删除文件记录下载和预览', 1443, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:files:remove', '#', 'admin', '2022-03-11 19:04:06', '', NULL, ''),
(1447, '费用报销', 1067, 7, 'fininfom', 'modules/police/xinhu-police/fininfom/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-police:fininfom:list', 'code', 'admin', '2022-03-11 19:05:16', '', NULL, ''),
(1448, '新增费用报销', 1447, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:fininfom:add', '#', 'admin', '2022-03-11 19:06:08', '', NULL, ''),
(1449, '修改费用报销', 1447, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:fininfom:edit', '#', 'admin', '2022-03-11 19:06:25', '', NULL, ''),
(1450, '删除费用报销', 1447, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:fininfom:remove', '#', 'admin', '2022-03-11 19:06:57', '', NULL, ''),
(1451, '费用报销子表', 1067, 8, 'fininfos', 'modules/police/xinhu-police/fininfos/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-police:fininfos:list', 'color', 'admin', '2022-03-11 19:09:05', '', NULL, ''),
(1452, '新增费用报销子表', 1451, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:fininfos:add', '#', 'admin', '2022-03-11 19:09:27', '', NULL, ''),
(1453, '修改费用报销子表', 1451, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:fininfos:edit', '#', 'admin', '2022-03-11 19:09:47', '', NULL, ''),
(1454, '删除费用报销子表', 1451, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:fininfos:remove', '#', 'admin', '2022-03-11 19:10:08', '', NULL, ''),
(1455, '发票管理表', 1067, 9, 'finpiao', 'modules/police/xinhu-police/finpiao/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-police:finpiao:list', 'color', 'admin', '2022-03-11 19:11:28', '', NULL, ''),
(1456, '新增发票管理', 1455, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:finpiao:add', '#', 'admin', '2022-03-11 19:12:24', '', NULL, ''),
(1457, '修改发票管理', 1455, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:finpiao:edit', '#', 'admin', '2022-03-11 19:13:02', '', NULL, ''),
(1458, '删除发票管理', 1455, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:finpiao:remove', '#', 'admin', '2022-03-11 19:13:22', '', NULL, ''),
(1459, '流程单据', 1067, 10, 'bill', 'modules/police/xinhu-police/bill/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-police:bill:list', 'color', 'admin', '2022-03-11 19:16:25', 'admin', '2022-04-05 08:44:28', ''),
(1460, '新增流程单据', 1459, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:bill:add', '#', 'admin', '2022-03-11 19:16:42', '', NULL, ''),
(1461, '修改流程单据', 1459, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:bill:edit', '#', 'admin', '2022-03-11 19:16:57', '', NULL, ''),
(1462, '删除流程单据', 1459, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:bill:remove', '#', 'admin', '2022-03-11 19:17:11', '', NULL, ''),
(1463, '抄送表', 1067, 11, 'chao', 'modules/police/xinhu-police/chao/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-police:chao:list', 'color', 'admin', '2022-03-11 19:17:53', 'admin', '2022-04-05 08:48:35', ''),
(1464, '新增抄送', 1463, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:chao:add', '#', 'admin', '2022-03-11 19:18:10', '', NULL, ''),
(1465, '修改抄送', 1463, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:chao:edit', '#', 'admin', '2022-03-11 19:18:24', '', NULL, ''),
(1466, '删除抄送', 1463, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:chao:remove', '#', 'admin', '2022-03-11 19:18:42', '', NULL, ''),
(1467, '物品领用采购申请主表', 1067, 12, 'goodm', 'modules/police/xinhu-police/goodm/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-police:goodm:list', 'color', 'admin', '2022-03-11 19:21:40', '', NULL, ''),
(1468, '新增物品领用采购申请主', 1467, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:goodm:add', '#', 'admin', '2022-03-11 19:22:06', '', NULL, ''),
(1469, '修改物品领用采购申请主', 1467, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:goodm:edit', '#', 'admin', '2022-03-11 19:22:24', '', NULL, ''),
(1470, '删除物品领用采购申请主', 1467, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:goodm:remove', '#', 'admin', '2022-03-11 19:22:40', '', NULL, ''),
(1471, '物品库存详细表', 1067, 12, 'goodn', 'modules/police/xinhu-police/goodn/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-police:goodn:list', 'color', 'admin', '2022-03-11 19:25:43', '', NULL, ''),
(1472, '新增物品库存详细', 1471, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:goodn:add', '#', 'admin', '2022-03-11 19:26:09', '', NULL, ''),
(1473, '修改物品库存详细', 1471, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:goodn:edit', '#', 'admin', '2022-03-11 19:26:26', '', NULL, ''),
(1474, '删除物品库存详细', 1471, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:goodn:remove', '#', 'admin', '2022-03-11 19:26:40', '', NULL, ''),
(1475, '物品表', 1067, 13, 'goods', 'modules/police/xinhu-police/goods/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-police:goods:list', 'color', 'admin', '2022-03-11 19:29:19', '', NULL, ''),
(1476, '新增物品', 1475, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:goods:add', '#', 'admin', '2022-03-11 19:29:47', '', NULL, ''),
(1477, '修改物品', 1475, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:goods:edit', '#', 'admin', '2022-03-11 19:30:04', '', NULL, ''),
(1478, '删除物品', 1475, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:goods:remove', '#', 'admin', '2022-03-11 19:30:20', '', NULL, ''),
(1479, '固定资产表', 1067, 14, 'assetm', 'modules/police/xinhu-police/assetm/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-police:assetm:list', 'color', 'admin', '2022-03-11 19:37:57', '', NULL, ''),
(1480, '新增固定资产', 1479, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:assetm:add', '#', 'admin', '2022-03-11 19:38:30', '', NULL, ''),
(1481, '修改固定资产', 1479, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:assetm:edit', '#', 'admin', '2022-03-11 19:38:45', '', NULL, ''),
(1482, '删除固定资产', 1479, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:assetm:remove', '#', 'admin', '2022-03-11 19:39:00', '', NULL, ''),
(1483, '维修报修', 1067, 15, 'repair', 'modules/police/xinhu-police/repair/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-police:repair:list', 'color', 'admin', '2022-03-11 19:40:52', '', NULL, ''),
(1484, '新增维修报修', 1483, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:repair:add', '#', 'admin', '2022-03-11 19:41:10', '', NULL, ''),
(1485, '修改维修报修', 1483, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:repair:edit', '#', 'admin', '2022-03-11 19:41:25', '', NULL, ''),
(1486, '删除维修报修', 1483, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:repair:remove', '#', 'admin', '2022-03-11 19:41:40', '', NULL, ''),
(1487, '工程通知', 1067, 16, 'gctodo', 'modules/police/xinhu-police/gctodo/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-police:gctodo:list', 'color', 'admin', '2022-03-11 19:42:21', '', NULL, ''),
(1488, '新增工程通知', 1487, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:gctodo:add', '#', 'admin', '2022-03-11 19:44:49', '', NULL, ''),
(1489, '修改工程通知', 1487, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:gctodo:edit', '#', 'admin', '2022-03-11 19:45:09', '', NULL, ''),
(1490, '删除工程通知', 1487, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:gctodo:remove', '#', 'admin', '2022-03-11 19:45:26', '', NULL, ''),
(1491, '物品仓库表', 1067, 16, 'godepot', 'modules/police/xinhu-police/godepot/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-police:godepot:list', 'code', 'admin', '2022-03-11 19:47:59', '', NULL, ''),
(1492, '新增物品仓库', 1491, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:godepot:add', '#', 'admin', '2022-03-11 19:48:20', '', NULL, ''),
(1493, '修改物品仓库', 1491, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:godepot:edit', '#', 'admin', '2022-03-11 19:48:46', '', NULL, ''),
(1494, '删除物品仓库', 1491, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-police:godepot:remove', '#', 'admin', '2022-03-11 19:49:00', '', NULL, ''),
(1495, '客户申请使用', 1068, 1, 'custappy', 'modules/finance/xinhu-finance/custappy/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-finance:custappy:list', 'code', 'admin', '2022-03-11 19:51:35', '', NULL, ''),
(1496, '新增客户申请使用', 1495, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:custappy:add', '#', 'admin', '2022-03-11 19:52:13', '', NULL, ''),
(1497, '修改客户申请使用', 1495, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:custappy:edit', '#', 'admin', '2022-03-11 19:52:31', '', NULL, ''),
(1498, '删除客户申请使用', 1495, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:custappy:remove', '#', 'admin', '2022-03-11 19:52:46', '', NULL, ''),
(1499, '客户收付款', 1068, 2, 'custfina', 'modules/finance/xinhu-finance/custfina/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-finance:custfina:list', 'color', 'admin', '2022-03-11 19:54:50', '', NULL, ''),
(1500, '新增客户收付款', 1499, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:custfina:add', '#', 'admin', '2022-03-11 19:55:07', '', NULL, ''),
(1501, '修改客户收付款', 1499, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:custfina:edit', '#', 'admin', '2022-03-11 19:55:21', '', NULL, ''),
(1502, '删除客户收付款', 1499, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:custfina:remove', '#', 'admin', '2022-03-11 19:55:39', '', NULL, ''),
(1503, '客户', 1068, 3, 'customer', 'modules/finance/xinhu-finance/customer/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-finance:customer:list', 'color', 'admin', '2022-03-11 19:57:43', 'admin', '2022-03-11 19:58:06', ''),
(1504, '新增客户', 1503, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:customer:add', '#', 'admin', '2022-03-11 19:59:06', '', NULL, ''),
(1505, '修改客户', 1503, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:customer:edit', '#', 'admin', '2022-03-11 19:59:21', '', NULL, ''),
(1506, '删除客户', 1503, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:customer:remove', '#', 'admin', '2022-03-11 19:59:37', '', NULL, ''),
(1507, '跟进计划', 1068, 4, 'custplan', 'modules/finance/xinhu-finance/custplan/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-finance:custplan:list', 'color', 'admin', '2022-03-11 20:01:35', '', NULL, ''),
(1508, '新增跟进计划', 1507, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:custplan:add', '#', 'admin', '2022-03-11 20:01:52', '', NULL, ''),
(1509, '修改跟进计划', 1507, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:custplan:edit', '#', 'admin', '2022-03-11 20:02:36', '', NULL, ''),
(1510, '删除跟进计划', 1507, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:custplan:remove', '#', 'admin', '2022-03-11 20:02:51', '', NULL, ''),
(1511, '客户合同 ', 1068, 5, 'custract', 'modules/finance/xinhu-finance/custract/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-finance:custract:list', 'color', 'admin', '2022-03-11 20:08:49', '', NULL, ''),
(1512, '新增客户合同', 1511, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:custract:add', '#', 'admin', '2022-03-11 20:19:58', '', NULL, ''),
(1513, '修改客户合同', 1511, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:custract:edit', '#', 'admin', '2022-03-11 20:20:14', '', NULL, ''),
(1514, '删除客户合同', 1511, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:custract:remove', '#', 'admin', '2022-03-11 20:20:29', '', NULL, ''),
(1515, '销售机会', 1068, 6, 'custsale', 'modules/finance/xinhu-finance/custsale/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-finance:custsale:list', 'color', 'admin', '2022-03-11 20:26:07', '', NULL, ''),
(1516, '新增销售机会', 1515, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:custsale:add', '#', 'admin', '2022-03-11 20:26:24', '', NULL, ''),
(1517, '修改销售机会', 1515, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:custsale:edit', '#', 'admin', '2022-03-11 20:27:30', '', NULL, ''),
(1518, '删除销售机会', 1515, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:custsale:remove', '#', 'admin', '2022-03-11 20:27:47', '', NULL, ''),
(1519, '日报', 1068, 7, 'daily', 'modules/finance/xinhu-finance/daily/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-finance:daily:list', 'code', 'admin', '2022-03-11 20:31:59', '', NULL, ''),
(1520, '新增日报', 1519, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:daily:add', '#', 'admin', '2022-03-11 20:35:41', '', NULL, ''),
(1521, '修改日报', 1519, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:daily:edit', '#', 'admin', '2022-03-11 20:36:35', '', NULL, ''),
(1522, '删除日报', 1519, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:daily:remove', '#', 'admin', '2022-03-11 20:36:52', '', NULL, ''),
(1523, '日报分析统计表', 1068, 8, 'dailyfx', 'modules/finance/xinhu-finance/dailyfx/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-finance:dailyfx:list', 'color', 'admin', '2022-03-11 20:41:00', '', NULL, ''),
(1524, '新增日报分析统计', 1523, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:dailyfx:add', '#', 'admin', '2022-03-11 20:41:18', '', NULL, ''),
(1525, '修改日报分析统计', 1523, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:dailyfx:edit', '#', 'admin', '2022-03-11 20:43:15', '', NULL, ''),
(1526, '删除日报分析统计', 1523, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:dailyfx:remove', '#', 'admin', '2022-03-11 20:43:32', '', NULL, ''),
(1527, '演示测试模块', 1068, 9, 'demo', 'modules/finance/xinhu-finance/demo/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-finance:demo:list', 'color', 'admin', '2022-03-11 20:47:30', '', NULL, ''),
(1528, '新增演示测试模块', 1527, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:demo:add', '#', 'admin', '2022-03-11 20:48:46', '', NULL, ''),
(1529, '修改演示测试模块', 1527, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:demo:edit', '#', 'admin', '2022-03-11 20:49:07', '', NULL, ''),
(1530, '删除演示测试模块', 1527, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:demo:remove', '#', 'admin', '2022-03-11 20:50:21', '', NULL, ''),
(1531, '组织结构部门', 1068, 10, 'dept', 'modules/finance/xinhu-finance/dept/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-finance:dept:list', 'color', 'admin', '2022-03-11 21:02:36', '', NULL, ''),
(1532, '新增组织结构部门', 1531, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:dept:add', '#', 'admin', '2022-03-11 21:03:53', '', NULL, ''),
(1533, '修改组织结构部门', 1531, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:dept:edit', '#', 'admin', '2022-03-11 21:04:08', '', NULL, ''),
(1534, '删除组织结构部门', 1531, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:dept:remove', '#', 'admin', '2022-03-11 21:04:23', '', NULL, ''),
(1535, '车辆表', 1068, 11, 'carm', 'modules/finance/xinhu-finance/carm/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-finance:carm:list', 'color', 'admin', '2022-03-11 21:09:50', '', NULL, ''),
(1536, '新增车辆', 1535, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:carm:add', '#', 'admin', '2022-03-11 21:10:37', '', NULL, ''),
(1537, '修改车辆', 1535, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:carm:edit', '#', 'admin', '2022-03-11 21:10:52', '', NULL, ''),
(1538, '删除车辆', 1535, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:carm:remove', '#', 'admin', '2022-03-11 21:11:08', '', NULL, ''),
(1539, '车辆维修保养记录表', 1068, 12, 'carmang', 'modules/finance/xinhu-finance/carmang/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-finance:carmang:list', 'code', 'admin', '2022-03-11 21:13:37', '', NULL, ''),
(1540, '新增车辆维修保养记录', 1539, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:carmang:add', '#', 'admin', '2022-03-11 21:14:38', '', NULL, ''),
(1541, '修改车辆维修保养记录', 1539, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:carmang:edit', '#', 'admin', '2022-03-11 21:14:53', '', NULL, ''),
(1542, '删除车辆维修保养记录', 1539, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:carmang:remove', '#', 'admin', '2022-03-11 21:15:09', '', NULL, ''),
(1543, '车辆预定', 1068, 13, 'carmrese', 'modules/finance/xinhu-finance/carmrese/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-finance:carmrese:list', 'color', 'admin', '2022-03-11 21:20:59', '', NULL, ''),
(1544, '新增车辆预定', 1543, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:carmrese:add', '#', 'admin', '2022-03-11 21:21:16', '', NULL, ''),
(1545, '修改车辆预定', 1543, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:carmrese:edit', '#', 'admin', '2022-03-11 21:21:33', '', NULL, ''),
(1546, '删除车辆预定', 1543, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:carmrese:remove', '#', 'admin', '2022-03-11 21:21:48', '', NULL, ''),
(1547, '车辆信息登记表', 1068, 14, 'carms', 'modules/finance/xinhu-finance/carms/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-finance:carms:list', 'code', 'admin', '2022-03-11 21:24:17', '', NULL, ''),
(1548, '新增车辆信息登记', 1547, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:carms:add', '#', 'admin', '2022-03-11 21:24:35', '', NULL, ''),
(1549, '修改车辆信息登记', 1547, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:carms:edit', '#', 'admin', '2022-03-11 21:24:53', '', NULL, ''),
(1550, '删除车辆信息登记', 1547, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:carms:remove', '#', 'admin', '2022-03-11 21:25:17', '', NULL, ''),
(1551, '单据浏览记录表', 1068, 15, 'reads', 'modules/finance/xinhu-finance/reads/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-finance:reads:list', 'color', 'admin', '2022-03-11 21:27:05', '', NULL, ''),
(1552, '新增单据浏览记录', 1551, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:reads:add', '#', 'admin', '2022-03-11 21:27:24', '', NULL, ''),
(1553, '修改单据浏览记录', 1551, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:reads:edit', '#', 'admin', '2022-03-11 21:27:39', '', NULL, ''),
(1554, '删除单据浏览记录', 1551, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:reads:remove', '#', 'admin', '2022-03-11 21:27:55', '', NULL, ''),
(1555, '回执确认表', 1068, 16, 'receipt', 'modules/finance/xinhu-finance/receipt/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-finance:receipt:list', 'color', 'admin', '2022-03-11 21:29:33', '', NULL, ''),
(1556, '新增回执确认', 1555, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:receipt:add', '#', 'admin', '2022-03-11 21:29:51', '', NULL, ''),
(1557, '修改回执确认', 1555, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:receipt:edit', '#', 'admin', '2022-03-11 21:30:05', '', NULL, ''),
(1558, '删除回执确认', 1555, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:receipt:remove', '#', 'admin', '2022-03-11 21:30:18', '', NULL, ''),
(1559, '单据申请作废表', 1068, 17, 'tovoid', 'modules/finance/xinhu-finance/tovoid/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-finance:tovoid:list', 'code', 'admin', '2022-03-11 21:32:22', '', NULL, ''),
(1560, '新增单据申请作废', 1559, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:tovoid:add', '#', 'admin', '2022-03-11 21:32:39', '', NULL, ''),
(1561, '修改单据申请作废', 1559, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:tovoid:edit', '#', 'admin', '2022-03-11 21:33:10', '', NULL, ''),
(1562, '删除单据申请作废', 1559, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-finance:tovoid:remove', '#', 'admin', '2022-03-11 21:33:26', '', NULL, ''),
(1563, '微信公众号消息模版', 1069, 1, 'wotpl', 'modules/xsystem/xinhu-system/wotpl/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-system:wotpl:list', 'color', 'admin', '2022-03-11 21:35:57', 'admin', '2022-03-12 18:48:41', ''),
(1564, '新增微信公众号消息模版', 1563, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:wotpl:add', '#', 'admin', '2022-03-11 21:38:15', '', NULL, ''),
(1565, '修改微信公众号消息模版', 1563, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:wotpl:edit', '#', 'admin', '2022-03-11 21:38:37', '', NULL, ''),
(1566, '删除微信公众号消息模版', 1563, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:wotpl:remove', '#', 'admin', '2022-03-11 21:38:52', '', NULL, ''),
(1567, '微信用户信息表', 1069, 2, 'wouser', 'modules/xsystem/xinhu-system/wouser/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-system:wouser:list', 'code', 'admin', '2022-03-11 21:42:22', 'admin', '2022-03-12 18:48:51', ''),
(1568, '新增微信用户信息', 1567, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:wouser:add', '#', 'admin', '2022-03-11 21:43:24', '', NULL, ''),
(1569, '修改微信用户信息', 1567, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:wouser:edit', '#', 'admin', '2022-03-11 21:43:41', '', NULL, ''),
(1570, '删除微信用户信息', 1567, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:wouser:remove', '#', 'admin', '2022-03-11 21:43:58', '', NULL, ''),
(1571, '人脸识别', 1069, 3, 'renlian', 'modules/xsystem/xinhu-system/renlian/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-system:renlian:list', 'code', 'admin', '2022-03-12 18:11:04', 'admin', '2022-04-05 09:41:01', ''),
(1572, '新增人脸识别', 1571, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:renlian:add', '#', 'admin', '2022-03-12 18:12:09', '', NULL, ''),
(1573, '修改人脸识别', 1571, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:renlian:edit', '#', 'admin', '2022-03-12 18:12:27', '', NULL, ''),
(1574, '删除人脸识别', 1571, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:renlian:remove', '#', 'admin', '2022-03-12 18:12:54', '', NULL, ''),
(1575, 'REIM即时通讯平台用户', 1069, 4, 'user', 'modules/xsystem/xinhu-system/user/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-system:user:list', 'color', 'admin', '2022-03-12 18:13:50', 'admin', '2022-04-05 09:43:12', ''),
(1576, '新增REIM即时通讯平台用户', 1575, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:user:add', '#', 'admin', '2022-03-12 18:14:14', '', NULL, ''),
(1577, '修改REIM即时通讯平台用户', 1575, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:user:edit', '#', 'admin', '2022-03-12 18:14:32', '', NULL, ''),
(1578, '删除REIM即时通讯平台用户', 1575, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:user:remove', '#', 'admin', '2022-03-12 18:14:47', '', NULL, ''),
(1579, '系统组', 1069, 5, 'group', 'modules/xsystem/xinhu-system/group/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-system:group:list', 'color', 'admin', '2022-03-12 18:15:37', 'admin', '2022-03-12 18:49:41', ''),
(1580, '新增系统组', 1579, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:group:add', '#', 'admin', '2022-03-12 18:16:14', '', NULL, ''),
(1581, '修改系统组', 1579, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:group:edit', '#', 'admin', '2022-03-12 18:16:51', '', NULL, ''),
(1582, '删除系统组', 1579, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:group:remove', '#', 'admin', '2022-03-12 18:17:13', '', NULL, ''),
(1583, '系统升级', 1069, 6, 'chargems', 'modules/xsystem/xinhu-system/chargems/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-system:chargems:list', 'code', 'admin', '2022-03-12 18:18:36', 'admin', '2022-03-12 18:50:08', ''),
(1584, '新增系统升级', 1583, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:chargems:add', '#', 'admin', '2022-03-12 18:18:53', '', NULL, ''),
(1585, '修改系统升级', 1583, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:chargems:edit', '#', 'admin', '2022-03-12 18:21:52', '', NULL, ''),
(1586, '删除系统升级', 1583, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:chargems:remove', '#', 'admin', '2022-03-12 18:22:08', '', NULL, ''),
(1587, '系统日志', 1069, 7, 'log', 'modules/xsystem/xinhu-system/log/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-system:log:list', 'code', 'admin', '2022-03-12 18:22:57', 'admin', '2022-03-12 18:50:19', ''),
(1588, '新增系统日志', 1587, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:log:add', '#', 'admin', '2022-03-12 18:24:53', '', NULL, ''),
(1589, '修改系统日志', 1587, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:log:edit', '#', 'admin', '2022-03-12 18:25:07', '', NULL, ''),
(1590, '删除系统日志', 1587, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:log:remove', '#', 'admin', '2022-03-12 18:25:20', '', NULL, ''),
(1591, '系统登录token', 1069, 8, 'logintoken', 'modules/xsystem/xinhu-system/logintoken/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-system:logintoken:list', 'color', 'admin', '2022-03-12 18:27:50', 'admin', '2022-03-12 18:50:37', ''),
(1592, '新增系统登录token', 1591, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:logintoken:add', '#', 'admin', '2022-03-12 18:32:11', '', NULL, ''),
(1593, '修改系统登录token', 1591, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:logintoken:edit', '#', 'admin', '2022-03-12 18:32:25', '', NULL, ''),
(1594, '删除系统登录token', 1591, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:logintoken:remove', '#', 'admin', '2022-03-12 18:32:40', '', NULL, ''),
(1595, '系统选项', 1069, 9, 'option', 'modules/xsystem/xinhu-system/option/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-system:option:list', 'code', 'admin', '2022-03-12 18:39:25', 'admin', '2022-03-12 18:50:46', ''),
(1596, '新增系统选项', 1595, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:option:add', '#', 'admin', '2022-03-12 18:40:17', '', NULL, ''),
(1597, '修改系统选项', 1595, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:option:edit', '#', 'admin', '2022-03-12 18:40:41', '', NULL, ''),
(1598, '删除系统选项', 1595, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:option:remove', '#', 'admin', '2022-03-12 18:40:57', '', NULL, ''),
(1599, '后台菜单权限', 1069, 10, 'sjoin', 'modules/xsystem/xinhu-system/sjoin/index', NULL, 1, 0, 'C', '0', '0', 'xinhu-system:sjoin:list', 'color', 'admin', '2022-03-12 18:42:10', 'admin', '2022-03-12 18:50:56', ''),
(1600, '新增后台菜单权限', 1599, 1, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:sjoin:add', '#', 'admin', '2022-03-12 18:42:33', '', NULL, ''),
(1601, '修改后台菜单权限', 1599, 2, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:sjoin:edit', '#', 'admin', '2022-03-12 18:42:49', '', NULL, ''),
(1602, '删除后台菜单权限', 1599, 3, '', NULL, NULL, 1, 0, 'F', '0', '0', 'xinhu-system:sjoin:remove', '#', 'admin', '2022-03-12 18:43:05', '', NULL, '');
COMMIT;

--
-- 表的结构 `xinhu_admin`
--

CREATE TABLE `xinhu_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `num` varchar(20) DEFAULT NULL COMMENT '编号',
  `user` varchar(50) NOT NULL DEFAULT '' COMMENT '用户名',
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `pass` varchar(100) DEFAULT NULL COMMENT '密码',
  `loginci` smallint(6) DEFAULT '0' COMMENT '登录次数',
  `status` tinyint(1) DEFAULT '1' COMMENT '是否启用',
  `types` tinyint(1) DEFAULT '0' COMMENT '0普通1管理员',
  `sex` varchar(10) DEFAULT NULL COMMENT '性别',
  `tel` varchar(50) DEFAULT NULL COMMENT '电话',
  `face` varchar(300) DEFAULT NULL COMMENT '头像地址',
  `deptid` int(11) DEFAULT '0' COMMENT '主部门ID',
  `deptname` varchar(50) DEFAULT NULL COMMENT '部门',
  `deptids` varchar(50) DEFAULT NULL COMMENT '其他部门ID',
  `deptnames` varchar(100) DEFAULT NULL COMMENT '多部门',
  `rankings` varchar(100) DEFAULT NULL COMMENT '多职位',
  `deptallname` varchar(200) DEFAULT NULL COMMENT '部门全部路径',
  `superid` varchar(100) DEFAULT NULL COMMENT '上级主管ID',
  `superman` varchar(100) DEFAULT NULL COMMENT '上级主管',
  `ranking` varchar(255) DEFAULT NULL COMMENT '岗位',
  `sorts` smallint(6) DEFAULT '0' COMMENT '排序号',
  `deptpath` varchar(100) DEFAULT NULL COMMENT '部门路径',
  `superpath` varchar(100) DEFAULT NULL COMMENT '上级主管路径',
  `groupname` varchar(100) DEFAULT NULL COMMENT '组名称',
  `mobile` varchar(100) DEFAULT NULL COMMENT '移动电话',
  `apptx` tinyint(1) DEFAULT '1' COMMENT '是否app提醒',
  `workdate` date DEFAULT NULL COMMENT '入职时间',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `lastpush` datetime DEFAULT NULL COMMENT '最后app推送时间',
  `adddt` datetime DEFAULT NULL COMMENT '新增时间',
  `weixinid` varchar(50) DEFAULT NULL COMMENT '微信号',
  `quitdt` date DEFAULT NULL COMMENT '离职日期',
  `style` tinyint(2) DEFAULT '0' COMMENT '默认样式',
  `pingyin` varchar(50) DEFAULT NULL COMMENT '名字拼音',
  `emailpass` varchar(100) DEFAULT NULL COMMENT '邮箱密码',
  `companyid` int(11) DEFAULT '0' COMMENT '所在公司单位Id',
  `online` tinyint(1) DEFAULT '0' COMMENT '在线状态',
  `lastonline` datetime DEFAULT NULL COMMENT '最后在线时间',
  `isvcard` tinyint(1) DEFAULT '1' COMMENT '是否在通讯录上显示',
  `randslat` varchar(50) DEFAULT NULL COMMENT '随机字符串',
  `dwid` varchar(50) DEFAULT NULL COMMENT '加入单位id',
  `editpass` int(11) DEFAULT '0' COMMENT '修改密码次数',
  `comid` smallint(6) DEFAULT '0' COMMENT '默认单位Id',PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_areas`
--

CREATE TABLE `xinhu_areas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parent_id` int(11) NOT NULL,
  `area_name` varchar(100) NOT NULL,
  `is_show` tinyint(4) NOT NULL DEFAULT '1',
  `area_sort` int(11) NOT NULL DEFAULT '0',
  `area_key` char(10) DEFAULT NULL,
  `area_type` tinyint(4) NOT NULL DEFAULT '1',
  `data_flag` tinyint(4) NOT NULL DEFAULT '1',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_assetm`
--

CREATE TABLE `xinhu_assetm` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `typeid` smallint(6) DEFAULT '0' COMMENT '类别',
  `title` varchar(50) DEFAULT NULL COMMENT '名称',
  `num` varchar(20) DEFAULT NULL COMMENT '编号',
  `brand` varchar(20) DEFAULT NULL COMMENT '品牌',
  `model` varchar(100) DEFAULT NULL COMMENT '规格型号',
  `laiyuan` varchar(50) DEFAULT NULL COMMENT '来源',
  `shuname` varchar(50) DEFAULT NULL COMMENT '所属部门',
  `dt` date DEFAULT NULL COMMENT '日期',
  `ckid` smallint(50) DEFAULT '0' COMMENT '存放地点',
  `state` tinyint(1) DEFAULT '0' COMMENT '状态',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `adddt` datetime DEFAULT NULL COMMENT '添加时间',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `buydt` date DEFAULT NULL COMMENT '购进日期',
  `price` decimal(10,2) DEFAULT NULL COMMENT '价格',
  `optid` smallint(6) DEFAULT '0',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `useid` varchar(50) DEFAULT '0',
  `usename` varchar(50) DEFAULT NULL COMMENT '使用人',
  `fengmian` varchar(50) DEFAULT NULL COMMENT '封面图片',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  `address` varchar(50) DEFAULT NULL COMMENT '所在位置',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='固定资产表';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_book`
--

CREATE TABLE `xinhu_book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL COMMENT '书名',
  `typeid` smallint(6) DEFAULT '0' COMMENT '对应分类',
  `num` varchar(50) DEFAULT NULL COMMENT '编号',
  `author` varchar(20) DEFAULT NULL COMMENT '作者',
  `chuban` varchar(50) DEFAULT NULL COMMENT '出版社',
  `cbdt` date DEFAULT NULL COMMENT '出版日期',
  `price` decimal(10,2) DEFAULT '0.00' COMMENT '价格',
  `weizhi` varchar(50) DEFAULT NULL COMMENT '存放位置',
  `shuliang` smallint(6) DEFAULT '0' COMMENT '数量',
  `adddt` datetime DEFAULT NULL,
  `optdt` datetime DEFAULT NULL,
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `optid` smallint(6) DEFAULT '0',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `isbn` varchar(30) DEFAULT NULL,
  `jieshu` smallint(6) DEFAULT '0' COMMENT '被借阅数',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='图书表';

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_bookborrow`
--

CREATE TABLE `xinhu_bookborrow` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` smallint(6) DEFAULT '0',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` smallint(6) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `isturn` tinyint(1) DEFAULT '1' COMMENT '是否提交',
  `bookid` smallint(6) DEFAULT '0',
  `bookname` varchar(50) DEFAULT NULL COMMENT '书名',
  `jydt` date DEFAULT NULL COMMENT '借阅日期',
  `yjdt` date DEFAULT NULL COMMENT '预计归还',
  `ghtime` datetime DEFAULT NULL COMMENT '归还时间',
  `isgh` tinyint(1) DEFAULT '0' COMMENT '是否归返',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='图书借阅';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_carm`
--

CREATE TABLE `xinhu_carm` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `carnum` varchar(10) DEFAULT NULL COMMENT '车牌号',
  `carbrand` varchar(20) DEFAULT NULL COMMENT '车辆品牌',
  `carmode` varchar(30) DEFAULT NULL COMMENT '型号',
  `cartype` varchar(10) DEFAULT NULL COMMENT '车辆类型',
  `buydt` date DEFAULT NULL COMMENT '购买日期',
  `buyprice` mediumint(9) DEFAULT NULL COMMENT '购买价格',
  `enginenb` varchar(50) DEFAULT NULL COMMENT '发动机号',
  `ispublic` tinyint(1) DEFAULT '1' COMMENT '是否公开使用',
  `optdt` datetime DEFAULT NULL,
  `optid` smallint(6) DEFAULT NULL,
  `optname` varchar(20) DEFAULT NULL,
  `adddt` datetime DEFAULT NULL,
  `createname` varchar(20) DEFAULT NULL,
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `state` tinyint(1) DEFAULT '0' COMMENT '状态@0|办理中,1|可用,2|维修中,3|报废',
  `framenum` varchar(50) DEFAULT NULL COMMENT '车架号',
  `status` tinyint(4) DEFAULT '1',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车辆表';

BEGIN;
COMMIT;


-- --------------------------------------------------------

--
-- 表的结构 `xinhu_carmang`
--

CREATE TABLE `xinhu_carmang` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` smallint(6) DEFAULT '0',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` smallint(6) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `isturn` tinyint(1) DEFAULT '1' COMMENT '是否提交',
  `carid` smallint(6) DEFAULT '0' COMMENT '维修车辆',
  `reason` varchar(500) DEFAULT NULL COMMENT '维修原因',
  `address` varchar(50) DEFAULT NULL COMMENT '维修地点',
  `jianame` varchar(50) DEFAULT NULL COMMENT '驾驶员',
  `jiaid` varchar(50) DEFAULT NULL,
  `bujian` varchar(200) DEFAULT NULL COMMENT '更换部件',
  `startdt` datetime DEFAULT NULL COMMENT '维修时间',
  `enddt` datetime DEFAULT NULL COMMENT '维修截止时间',
  `money` decimal(8,2) DEFAULT '0.00' COMMENT '维修金额',
  `type` tinyint(1) DEFAULT '0' COMMENT '类型@0|车辆维修,1|保养',
  `nextdt` date DEFAULT NULL COMMENT '下次保养日期',
  `kmshu` varchar(20) DEFAULT NULL COMMENT '当前保养公里数',
  `kmnshu` varchar(20) DEFAULT NULL COMMENT '下次保养公里数',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车辆维修保养记录表';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_carmrese`
--

CREATE TABLE `xinhu_carmrese` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` int(11) DEFAULT NULL,
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '0',
  `isturn` tinyint(1) DEFAULT '0',
  `useid` varchar(200) DEFAULT NULL,
  `usename` varchar(200) DEFAULT NULL COMMENT '使用者',
  `useren` smallint(6) DEFAULT '0' COMMENT '使用人数',
  `startdt` datetime DEFAULT NULL COMMENT '开始时间',
  `enddt` datetime DEFAULT NULL COMMENT '截止时间',
  `address` varchar(50) DEFAULT NULL COMMENT '目的地',
  `carid` smallint(6) DEFAULT NULL,
  `carnum` varchar(10) DEFAULT NULL COMMENT '使用车辆',
  `xianlines` varchar(200) DEFAULT NULL COMMENT '线路',
  `jiaid` varchar(200) DEFAULT NULL,
  `jianame` varchar(200) DEFAULT NULL COMMENT '驾驶员',
  `kmstart` varchar(20) DEFAULT NULL COMMENT '起始公里数',
  `kmend` varchar(20) DEFAULT NULL COMMENT '结束公里数',
  `returndt` datetime DEFAULT NULL COMMENT '归还时间',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车辆预定';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_carms`
--

CREATE TABLE `xinhu_carms` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `carid` int(11) DEFAULT '0' COMMENT '车辆Id',
  `otype` varchar(20) DEFAULT NULL COMMENT '类型,加油',
  `startdt` date DEFAULT NULL,
  `enddt` date DEFAULT NULL COMMENT '截止时间',
  `money` decimal(8,2) DEFAULT '0.00' COMMENT '花费金额',
  `optid` int(11) DEFAULT '0' COMMENT '添加人id',
  `optdt` datetime DEFAULT NULL,
  `optname` varchar(20) DEFAULT NULL COMMENT '添加人',
  `status` tinyint(1) DEFAULT '0' COMMENT '状态',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `unitname` varchar(50) DEFAULT NULL COMMENT '对应名称',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `address` varchar(100) DEFAULT NULL COMMENT '地点',
  `jiaid` varchar(30) DEFAULT NULL,
  `jianame` varchar(30) DEFAULT NULL COMMENT '驾驶员',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车辆信息登记表';

BEGIN;
COMMIT;

--------------------------------------------

--
-- 表的结构 `xinhu_chargems`
--

CREATE TABLE `xinhu_chargems` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `types` tinyint(1) DEFAULT '0',
  `mid` smallint(6) DEFAULT '0',
  `optdt` datetime DEFAULT NULL,
  `updatedt` datetime DEFAULT NULL,
  `keyword` varchar(200) DEFAULT NULL,
  `modeid` smallint(6) DEFAULT '0' COMMENT '对应安装模块Id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统升级';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_city`
--

CREATE TABLE `xinhu_city` (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `pid` int(11) UNSIGNED NOT NULL DEFAULT '0' COMMENT '上级ＩＤ',
  `name` varchar(50) NOT NULL DEFAULT '',
  `types` tinyint(1) NOT NULL DEFAULT '2' COMMENT '类型0国家,1省,2市,3县',
  `sorts` smallint(6) DEFAULT '0' COMMENT '排序',
  `pinyin` varchar(50) DEFAULT NULL,
  `pinyins` varchar(50) DEFAULT NULL COMMENT '拼音简称',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='城市表';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_company`
--

CREATE TABLE `xinhu_company` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `logo` varchar(200) DEFAULT NULL COMMENT '对应logo',
  `name` varchar(100) DEFAULT NULL COMMENT '公司名称',
  `nameen` varchar(200) DEFAULT NULL COMMENT '英文名',
  `oaname` varchar(100) DEFAULT NULL COMMENT '显示OA名称',
  `oanemes` varchar(100) DEFAULT NULL COMMENT '移动端显示名称',
  `tel` varchar(30) DEFAULT NULL COMMENT '电话',
  `fax` varchar(30) DEFAULT NULL COMMENT '传真',
  `pid` int(11) DEFAULT '0' COMMENT '对应上级',
  `sorts` smallint(6) DEFAULT '0' COMMENT '排序号',
  `fuzeid` varchar(30) DEFAULT NULL COMMENT '对应负责人Id',
  `fuzename` varchar(30) DEFAULT NULL COMMENT '对应负责人',
  `address` varchar(50) DEFAULT NULL COMMENT '地址',
  `city` varchar(30) DEFAULT NULL COMMENT '所在城市',
  `num` varchar(50) DEFAULT NULL COMMENT '单位编号',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  `iscreate` tinyint(1) DEFAULT '0',
  `yuming` varchar(100) DEFAULT NULL COMMENT '使用域名',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='公司单位表';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_custappy`
--

CREATE TABLE `xinhu_custappy` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` smallint(6) DEFAULT '0',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` smallint(6) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `isturn` tinyint(1) DEFAULT '1' COMMENT '是否提交',
  `custid` int(11) DEFAULT '0' COMMENT '客户ID',
  `custname` varchar(50) DEFAULT NULL COMMENT '客户名称',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户申请使用';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_custfina`
--

CREATE TABLE `xinhu_custfina` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `htid` int(11) DEFAULT '0' COMMENT '合同ID',
  `htnum` varchar(20) DEFAULT NULL,
  `dt` date DEFAULT NULL COMMENT '所属日期',
  `uid` smallint(6) DEFAULT '0',
  `custid` smallint(6) DEFAULT '0',
  `custname` varchar(50) DEFAULT NULL COMMENT '客户名称',
  `optdt` datetime DEFAULT NULL,
  `optname` varchar(10) DEFAULT NULL,
  `money` decimal(10,2) DEFAULT '0.00',
  `types` tinyint(1) DEFAULT '0' COMMENT '0收款单,1付款单',
  `ispay` tinyint(1) DEFAULT '0' COMMENT '是否收款,付款',
  `paydt` datetime DEFAULT NULL COMMENT '收付款时间',
  `content` varchar(200) DEFAULT NULL COMMENT '说明',
  `createdt` datetime DEFAULT NULL COMMENT '创建时间',
  `createname` varchar(10) DEFAULT NULL,
  `createid` smallint(6) DEFAULT '0',
  `ismove` tinyint(1) DEFAULT '0' COMMENT '是否转移的',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户收付款';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_customer`
--

CREATE TABLE `xinhu_customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `types` varchar(20) DEFAULT NULL COMMENT '客户类型',
  `uid` smallint(6) DEFAULT '0' COMMENT '所属人',
  `optdt` datetime DEFAULT NULL,
  `optname` varchar(10) DEFAULT NULL,
  `linkname` varchar(20) DEFAULT NULL COMMENT '联系人',
  `unitname` varchar(100) DEFAULT NULL COMMENT '单位名称',
  `laiyuan` varchar(20) DEFAULT NULL COMMENT '来源',
  `tel` varchar(50) DEFAULT NULL,
  `mobile` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `content` varchar(500) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `routeline` varchar(100) DEFAULT NULL,
  `url` varchar(50) DEFAULT NULL COMMENT '主页地址',
  `status` tinyint(4) DEFAULT '1' COMMENT '启用停用',
  `adddt` datetime DEFAULT NULL COMMENT '添加时间',
  `createname` varchar(10) DEFAULT NULL,
  `createid` smallint(6) DEFAULT '0',
  `shate` varchar(50) DEFAULT NULL COMMENT '共享给',
  `shateid` varchar(50) DEFAULT NULL,
  `isgys` tinyint(1) DEFAULT '0' COMMENT '是否供应商',
  `isstat` tinyint(1) DEFAULT '0' COMMENT '是否标*客户',
  `fzid` smallint(6) DEFAULT '0',
  `fzname` varchar(20) DEFAULT NULL COMMENT '客户负责人',
  `htshu` smallint(6) DEFAULT '0' COMMENT '合同数',
  `moneyz` decimal(10,2) DEFAULT '0.00' COMMENT '销售总额',
  `moneyd` decimal(10,2) DEFAULT '0.00' COMMENT '待收金额',
  `sheng` varchar(50) DEFAULT NULL COMMENT '所在省',
  `shi` varchar(50) DEFAULT NULL COMMENT '所在市',
  `isgh` tinyint(1) DEFAULT '0' COMMENT '是否放入公海',
  `lastdt` datetime DEFAULT NULL COMMENT '最后跟进时间',
  `shibieid` varchar(30) DEFAULT NULL COMMENT '纳税识别号',
  `openbank` varchar(100) DEFAULT NULL COMMENT '开户行',
  `cardid` varchar(50) DEFAULT NULL COMMENT '开户帐号',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  `addresslatlng` varchar(200) DEFAULT NULL COMMENT '地址经纬度',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_custplan`
--

CREATE TABLE `xinhu_custplan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  `custid` int(11) DEFAULT '0' COMMENT '客户Id',
  `custname` varchar(200) DEFAULT NULL COMMENT '客户名称',
  `optid` int(11) DEFAULT '0',
  `optname` varchar(50) DEFAULT NULL COMMENT '跟进人',
  `optdt` datetime DEFAULT NULL,
  `plandt` datetime DEFAULT NULL COMMENT '计划时间',
  `status` tinyint(4) DEFAULT '0' COMMENT '状态0计划,1完成,5取消',
  `content` varchar(500) DEFAULT NULL,
  `gentype` varchar(50) DEFAULT NULL COMMENT '跟进方式',
  `uid` int(11) DEFAULT '0',
  `findt` datetime DEFAULT NULL COMMENT '完成时间',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='跟进计划';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_custract`
--

CREATE TABLE `xinhu_custract` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` smallint(6) DEFAULT '0',
  `num` varchar(30) DEFAULT NULL COMMENT '合同编号',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `contents` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `custid` int(11) DEFAULT '0',
  `custname` varchar(255) DEFAULT NULL COMMENT '客户名称',
  `linkman` varchar(20) DEFAULT NULL COMMENT '客户联系人',
  `money` decimal(10,2) DEFAULT '0.00' COMMENT '合同金额',
  `moneys` decimal(10,2) DEFAULT '0.00' COMMENT '待收金额',
  `startdt` date DEFAULT NULL COMMENT '生效日期',
  `enddt` date DEFAULT NULL COMMENT '截止日期',
  `content` text COMMENT '合同内容',
  `saleid` smallint(6) DEFAULT '0' COMMENT '销售机会Id',
  `isturn` tinyint(1) DEFAULT '1' COMMENT '是否提交',
  `signdt` date DEFAULT NULL COMMENT '签约日期',
  `types` tinyint(1) DEFAULT '0' COMMENT '0收款合同，1付款合同',
  `ispay` tinyint(1) DEFAULT '0' COMMENT '0待,1已完成,2部分',
  `isover` tinyint(1) DEFAULT '0' COMMENT '是否已全部创建收付款单',
  `createname` varchar(20) DEFAULT NULL,
  `createid` smallint(6) DEFAULT '0',
  `xiaoid` int(11) DEFAULT '0' COMMENT '对应销售goodm.id',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  `fenlei` varchar(50) DEFAULT NULL COMMENT '合同分类',
  `htfileid` varchar(50) DEFAULT NULL COMMENT '合同文件',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户合同';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_custsale`
--

CREATE TABLE `xinhu_custsale` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `custid` int(11) DEFAULT '0',
  `custname` varchar(50) DEFAULT NULL,
  `uid` smallint(6) DEFAULT '0',
  `optname` varchar(10) DEFAULT NULL,
  `optdt` datetime DEFAULT NULL,
  `state` tinyint(4) DEFAULT '0' COMMENT '状态',
  `content` varchar(500) DEFAULT NULL,
  `money` decimal(10,2) DEFAULT '0.00',
  `applydt` date DEFAULT NULL,
  `dealdt` datetime DEFAULT NULL COMMENT '成交时间',
  `adddt` datetime DEFAULT NULL,
  `laiyuan` varchar(20) DEFAULT NULL COMMENT '销售来源',
  `createid` smallint(6) DEFAULT '0',
  `createname` varchar(20) DEFAULT NULL,
  `htid` smallint(6) DEFAULT '0' COMMENT '合同ID',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='销售机会';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_daily`
--

CREATE TABLE `xinhu_daily` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dt` date DEFAULT NULL COMMENT '日期',
  `content` varchar(4000) DEFAULT NULL COMMENT '内容',
  `adddt` datetime DEFAULT NULL COMMENT '新增时间',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `uid` int(11) DEFAULT NULL,
  `optname` varchar(20) DEFAULT NULL COMMENT '姓名',
  `types` tinyint(1) DEFAULT '0' COMMENT '类型@0|日报,1|周报,2|月报,3|年报',
  `plan` varchar(2000) DEFAULT NULL COMMENT '明日计划',
  `status` tinyint(1) DEFAULT '0',
  `enddt` date DEFAULT NULL,
  `optid` int(11) DEFAULT NULL,
  `mark` smallint(6) DEFAULT '0' COMMENT '得分',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  `mtplid` int(11) DEFAULT '0' COMMENT '对应多模版flow_modetpl.id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='日报';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_dailyfx`
--

CREATE TABLE `xinhu_dailyfx` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `month` varchar(10) DEFAULT NULL COMMENT '月份',
  `optdt` datetime DEFAULT NULL COMMENT '分析时间',
  `day1` tinyint(1) DEFAULT '0' COMMENT '0未写,1已写,2请假,3休息日',
  `day2` tinyint(1) DEFAULT '0',
  `day3` tinyint(1) DEFAULT '0',
  `day4` tinyint(1) DEFAULT '0',
  `day5` tinyint(1) DEFAULT '0',
  `day6` tinyint(1) DEFAULT '0',
  `day7` tinyint(1) DEFAULT '0',
  `day8` tinyint(1) DEFAULT '0',
  `day9` tinyint(1) DEFAULT '0',
  `day10` tinyint(1) DEFAULT '0',
  `day11` tinyint(1) DEFAULT '0',
  `day12` tinyint(1) DEFAULT '0',
  `day13` tinyint(1) DEFAULT '0',
  `day14` tinyint(1) DEFAULT '0',
  `day15` tinyint(1) DEFAULT '0',
  `day16` tinyint(1) DEFAULT '0',
  `day17` tinyint(1) DEFAULT '0',
  `day18` tinyint(1) DEFAULT '0',
  `day19` tinyint(1) DEFAULT '0',
  `day20` tinyint(1) DEFAULT '0',
  `day21` tinyint(1) DEFAULT '0',
  `day22` tinyint(1) DEFAULT '0',
  `day23` tinyint(1) DEFAULT '0',
  `day24` tinyint(1) DEFAULT '0',
  `day25` tinyint(1) DEFAULT '0',
  `day26` tinyint(1) DEFAULT '0',
  `day27` tinyint(1) DEFAULT '0',
  `day28` tinyint(1) DEFAULT '0',
  `day29` tinyint(1) DEFAULT '0',
  `day30` tinyint(1) DEFAULT '0',
  `day31` tinyint(1) DEFAULT '0',
  `totaly` smallint(6) DEFAULT '0' COMMENT '应写次数',
  `totalx` smallint(6) DEFAULT '0' COMMENT '已写次数',
  `totalw` smallint(6) DEFAULT '0' COMMENT '未写次数',
  `content` varchar(200) DEFAULT NULL COMMENT '说明',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='日报分析统计表';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_demo`
--

CREATE TABLE `xinhu_demo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sheng` varchar(50) DEFAULT NULL COMMENT '省',
  `shi` varchar(50) DEFAULT NULL COMMENT '市',
  `xian` varchar(50) DEFAULT NULL COMMENT '县(区)',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `uid` smallint(6) DEFAULT '0',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` smallint(6) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `isturn` tinyint(1) DEFAULT '1' COMMENT '是否提交',
  `tanxuan` varchar(50) DEFAULT NULL COMMENT '弹出下来单选',
  `tanxuancheck` varchar(50) DEFAULT NULL COMMENT '弹框下拉多选',
  `upfile1` varchar(50) DEFAULT NULL COMMENT '文件上传1',
  `upfile2` varchar(50) DEFAULT NULL COMMENT '文件上传2',
  `testfirs` varchar(50) DEFAULT NULL COMMENT '测试字段',
  `custname` varchar(100) DEFAULT NULL COMMENT '客户',
  `custid` int(11) DEFAULT '0' COMMENT '客户id',
  `money` decimal(10,2) DEFAULT '0.00' COMMENT '金额',
  `tanxuanid` smallint(6) DEFAULT NULL COMMENT '单选弹出选择id',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面图片',
  `num` varchar(50) DEFAULT NULL COMMENT '编号',
  `mid` int(11) DEFAULT '0',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  `sort` int(11) DEFAULT '0' COMMENT '排序号',
  `sslx` tinyint(1) DEFAULT '0' COMMENT '0多行子表1,1多行子表2',
  `htmlcont` text COMMENT 'html编辑器',
  `xuanren` varchar(50) DEFAULT NULL COMMENT '选择人员',
  `xuanrenid` varchar(50) DEFAULT NULL COMMENT '选择人员的ID',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='演示测试模块';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_dept`
--

CREATE TABLE `xinhu_dept` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `num` varchar(30) DEFAULT NULL COMMENT '编号',
  `name` varchar(100) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  `sort` int(11) DEFAULT '0',
  `optdt` datetime DEFAULT NULL,
  `headman` varchar(50) DEFAULT NULL COMMENT '负责人',
  `headid` varchar(50) DEFAULT NULL,
  `companyid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='组织结构部门';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_editrecord`
--

CREATE TABLE `xinhu_editrecord` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fieldsname` varchar(50) DEFAULT NULL COMMENT '字段名称',
  `oldval` text COMMENT '原来值',
  `newval` text COMMENT '新值',
  `tables` varchar(30) DEFAULT NULL,
  `mid` int(11) DEFAULT NULL,
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` smallint(6) DEFAULT NULL COMMENT '操作人Id',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `editci` smallint(6) DEFAULT '0' COMMENT '第几次修改记录',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='修改记录表';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_emailm`
--

CREATE TABLE `xinhu_emailm` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` smallint(6) DEFAULT '0' COMMENT '用户iD',
  `title` varchar(220) DEFAULT NULL COMMENT '主题',
  `content` longtext COMMENT '邮件内容',
  `sendid` smallint(6) DEFAULT NULL,
  `sendname` varchar(100) DEFAULT NULL COMMENT '发送人',
  `senddt` datetime DEFAULT NULL COMMENT '发送时间',
  `receid` varchar(2000) DEFAULT NULL,
  `recename` varchar(4000) DEFAULT NULL COMMENT '接收人',
  `isturn` tinyint(1) DEFAULT '0' COMMENT '@0|草稿,1|已发送',
  `hid` smallint(6) DEFAULT '0' COMMENT '@回复id',
  `isfile` tinyint(1) DEFAULT '0' COMMENT '@是否有附件',
  `applydt` date DEFAULT NULL,
  `message_id` varchar(100) DEFAULT NULL COMMENT '邮件Id',
  `fromemail` varchar(500) DEFAULT NULL COMMENT '发送人邮件',
  `toemail` varchar(500) DEFAULT NULL COMMENT '发给邮件人',
  `reply_toemail` varchar(500) DEFAULT NULL COMMENT '回复邮件',
  `ccemail` varchar(500) DEFAULT NULL COMMENT '抄送给',
  `size` int(11) DEFAULT '0' COMMENT '邮件大小',
  `ccname` varchar(100) DEFAULT NULL COMMENT '抄送给',
  `ccid` varchar(100) DEFAULT NULL,
  `type` tinyint(1) DEFAULT '0' COMMENT '0内部邮件,1用邮件外发',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `numoi` int(11) DEFAULT '0',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  `outzt` tinyint(1) DEFAULT '1' COMMENT '外发状态',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='邮件主表';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_emails`
--

CREATE TABLE `xinhu_emails` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` int(11) DEFAULT '0',
  `uid` smallint(6) DEFAULT '0',
  `zt` tinyint(1) DEFAULT '0' COMMENT '@0|未读,1|已读',
  `types` tinyint(1) DEFAULT '0' COMMENT '0接收,1抄送,2发送者',
  `ishui` tinyint(1) DEFAULT '0' COMMENT '是否回复',
  `isdel` tinyint(1) DEFAULT '0' COMMENT '@0|未删,1|已删',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `email` varchar(50) DEFAULT NULL,
  `personal` varchar(20) DEFAULT NULL COMMENT '人员',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='邮件子表';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_email_cont`
--

CREATE TABLE `xinhu_email_cont` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL COMMENT '标题',
  `body` longtext COMMENT '内容',
  `receid` varchar(500) DEFAULT '0',
  `recename` varchar(500) DEFAULT NULL COMMENT '接收人',
  `receemail` varchar(500) DEFAULT NULL COMMENT '接收邮件',
  `optdt` datetime DEFAULT NULL,
  `optid` smallint(6) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '添加人',
  `status` tinyint(1) DEFAULT '0' COMMENT '0待发送,1成功,2失败',
  `senddt` datetime DEFAULT NULL COMMENT '发送时间',
  `ccname` varchar(500) DEFAULT NULL COMMENT '抄送给',
  `ccemail` varchar(500) DEFAULT NULL COMMENT '抄送邮件',
  `attachpath` varchar(2000) DEFAULT NULL COMMENT '附件路径',
  `attachname` varchar(2000) DEFAULT NULL COMMENT '附件名称',
  `mid` int(11) DEFAULT '0' COMMENT 'emailm.id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统发送邮件内容';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_file`
--

CREATE TABLE `xinhu_file` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `filenum` varchar(20) DEFAULT NULL COMMENT '文件编号',
  `valid` tinyint(4) DEFAULT '1',
  `filename` varchar(200) DEFAULT NULL,
  `filetype` varchar(50) DEFAULT NULL,
  `fileext` varchar(20) DEFAULT NULL,
  `filesize` int(11) DEFAULT NULL,
  `filesizecn` varchar(30) DEFAULT NULL,
  `filepath` varchar(100) DEFAULT NULL,
  `thumbpath` varchar(100) DEFAULT NULL,
  `optid` int(11) DEFAULT NULL,
  `optname` varchar(50) DEFAULT NULL COMMENT '上传者',
  `adddt` datetime DEFAULT NULL,
  `ip` varchar(100) DEFAULT NULL,
  `web` varchar(300) DEFAULT NULL,
  `mtype` varchar(50) DEFAULT NULL COMMENT '对应类型',
  `mid` int(11) DEFAULT '0' COMMENT '管理id',
  `downci` int(11) DEFAULT '0' COMMENT '下载次数',
  `keyoi` varchar(20) DEFAULT NULL COMMENT '对应序号邮件附件中用到',
  `pdfpath` varchar(100) DEFAULT NULL COMMENT '转pdf后路径',
  `oid` int(11) DEFAULT '0' COMMENT '旧ID',
  `mknum` varchar(30) DEFAULT NULL COMMENT '模块编号',
  `comid` smallint(6) DEFAULT '0' COMMENT '所属单位',
  `thumbplat` varchar(100) DEFAULT NULL COMMENT '上传到平台上缩略图',
  `onlynum` varchar(50) DEFAULT NULL,
  `filepathout` varchar(500) DEFAULT NULL COMMENT '远程路径',
  `content` varchar(200) DEFAULT NULL COMMENT '说明',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='上传文件记录表';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_files`
--

CREATE TABLE `xinhu_files` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `optname` varchar(50) DEFAULT NULL COMMENT '操作人',
  `fileid` int(11) DEFAULT '0' COMMENT '关联file.id',
  `optid` int(11) DEFAULT '0',
  `type` tinyint(1) DEFAULT '0' COMMENT '0预览,1下载',
  `ip` varchar(100) DEFAULT NULL,
  `web` varchar(100) DEFAULT NULL,
  `optdt` datetime DEFAULT NULL,
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文件记录下载和预览';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_fininfom`
--

CREATE TABLE `xinhu_fininfom` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `types` tinyint(2) DEFAULT '0' COMMENT '类型@0|报销单,1|出差报销,2|借款单,3|还款单,4|付款申请,5|开票申请',
  `uid` int(11) DEFAULT NULL,
  `money` decimal(10,2) DEFAULT '0.00' COMMENT '金额',
  `moneycn` varchar(100) DEFAULT NULL COMMENT '大写金额',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` int(11) DEFAULT NULL,
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '0',
  `isturn` tinyint(1) DEFAULT '0',
  `bills` smallint(6) DEFAULT NULL COMMENT '附单据(张)',
  `paytype` varchar(20) DEFAULT NULL COMMENT '付款方式',
  `fullname` varchar(100) DEFAULT NULL COMMENT '收款人全称',
  `cardid` varchar(50) DEFAULT NULL COMMENT '收款帐号',
  `openbank` varchar(50) DEFAULT NULL COMMENT '开户行',
  `purpose` varchar(100) DEFAULT NULL COMMENT '用途',
  `purresult` varchar(100) DEFAULT NULL,
  `paydt` date DEFAULT NULL COMMENT '付款日期',
  `num` varchar(30) DEFAULT NULL COMMENT '合同号/订单号',
  `name` varchar(50) DEFAULT NULL COMMENT '开票名称',
  `shibieid` varchar(50) DEFAULT NULL COMMENT '纳税识别号',
  `address` varchar(100) DEFAULT NULL COMMENT '公司地址',
  `tel` varchar(50) DEFAULT NULL COMMENT '电话',
  `custid` int(11) DEFAULT '0' COMMENT '对应客户ID',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='费用报销';

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_fininfos`
--

CREATE TABLE `xinhu_fininfos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` smallint(6) DEFAULT '0' COMMENT '对应主表fininfom.id',
  `sort` smallint(6) DEFAULT '0' COMMENT '排序号',
  `sdt` date DEFAULT NULL COMMENT '发生日期',
  `name` varchar(20) DEFAULT NULL COMMENT '所属项目',
  `money` decimal(10,2) DEFAULT '0.00' COMMENT '金额',
  `sm` varchar(100) DEFAULT NULL COMMENT '说明',
  `didian` varchar(50) DEFAULT NULL COMMENT '发生地点',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='费用报销子表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_finpiao`
--

CREATE TABLE `xinhu_finpiao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `optname` varchar(50) DEFAULT NULL,
  `optdt` datetime DEFAULT NULL,
  `optid` int(11) DEFAULT '0',
  `custid` int(11) DEFAULT '0' COMMENT '对应客户ID',
  `maicustname` varchar(100) DEFAULT NULL COMMENT '购买方',
  `maicustid` int(11) DEFAULT '0' COMMENT '购买方Id',
  `type` tinyint(1) DEFAULT '0' COMMENT '0开,1收到',
  `custname` varchar(100) DEFAULT NULL COMMENT '客户名称',
  `daima` varchar(50) DEFAULT NULL COMMENT '发票代码',
  `haoma` varchar(50) DEFAULT NULL COMMENT '发票号码',
  `money` decimal(10,2) DEFAULT '0.00' COMMENT '金额',
  `opendt` date DEFAULT NULL COMMENT '开票日期',
  `ptype` varchar(50) DEFAULT NULL COMMENT '发票类型',
  `status` tinyint(1) DEFAULT '0' COMMENT '状态',
  `kainame` varchar(50) DEFAULT NULL COMMENT '开票人',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='发票管理表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_flow_bill`
--

CREATE TABLE `xinhu_flow_bill` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sericnum` varchar(50) DEFAULT NULL COMMENT '单号',
  `tables` varchar(50) DEFAULT NULL COMMENT '对应表',
  `mid` int(11) DEFAULT NULL COMMENT '主id',
  `modeid` smallint(6) DEFAULT '0' COMMENT '模块id',
  `modename` varchar(20) DEFAULT NULL COMMENT '模块名称',
  `uname` varchar(20) DEFAULT NULL COMMENT '申请人姓名',
  `uid` smallint(6) DEFAULT NULL COMMENT '用户id',
  `udeptid` int(11) DEFAULT '0' COMMENT '部门0为主部门',
  `udeptname` varchar(30) DEFAULT NULL COMMENT '申请人部门',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` smallint(6) DEFAULT '0' COMMENT '操作人Id',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `allcheckid` varchar(500) DEFAULT NULL COMMENT '@所有审核人',
  `isdel` tinyint(4) DEFAULT '0' COMMENT '是否删除',
  `nstatus` tinyint(1) DEFAULT '0' COMMENT '当前状态值',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `nstatustext` varchar(100) DEFAULT NULL COMMENT '当前状态',
  `status` tinyint(1) DEFAULT '0',
  `nowcourseid` int(11) DEFAULT '0' COMMENT '当前步骤Id',
  `nowcheckid` varchar(500) DEFAULT NULL COMMENT '当前审核人id',
  `nowcheckname` varchar(500) DEFAULT NULL COMMENT '当前审核人',
  `checksm` varchar(200) DEFAULT NULL COMMENT '最后审核说明',
  `updt` datetime DEFAULT NULL COMMENT '最后更新时间',
  `createdt` datetime DEFAULT NULL COMMENT '创建时间',
  `tuiid` int(11) DEFAULT '0' COMMENT '退回flow_log.Id',
  `isturn` tinyint(1) DEFAULT '0' COMMENT '是否已提交了',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='流程单据';

--
-- 表的结构 `xinhu_flow_chao`
--

CREATE TABLE `xinhu_flow_chao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `modeid` int(11) DEFAULT '0',
  `tables` varchar(50) DEFAULT NULL COMMENT '对应表',
  `mid` int(11) DEFAULT '0' COMMENT '对应记录Id',
  `uid` int(11) DEFAULT '0' COMMENT '人员Id',
  `csname` varchar(500) DEFAULT NULL COMMENT '抄送给',
  `csnameid` varchar(50) DEFAULT NULL,
  `types` tinyint(1) DEFAULT '0' COMMENT '0抄送,1关注',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='抄送表';

--
-- 表的结构 `xinhu_flow_checks`
--

CREATE TABLE `xinhu_flow_checks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tables` varchar(30) DEFAULT '0',
  `mid` int(11) DEFAULT NULL,
  `modeid` smallint(6) DEFAULT '0',
  `courseid` smallint(6) DEFAULT '0',
  `checkid` varchar(100) DEFAULT NULL,
  `checkname` varchar(100) DEFAULT NULL,
  `optid` smallint(6) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL,
  `optdt` datetime DEFAULT NULL,
  `status` tinyint(1) DEFAULT '0' COMMENT '状态',
  `addlx` tinyint(1) DEFAULT '0' COMMENT '类型1自定义,2撤回添加,3退回添加,4转移添加',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='单据的审核人';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_flow_cname`
--

CREATE TABLE `xinhu_flow_cname` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `num` varchar(30) DEFAULT NULL COMMENT '编号',
  `name` varchar(50) DEFAULT NULL COMMENT '审核组名',
  `checkid` varchar(50) DEFAULT NULL,
  `checkname` varchar(50) DEFAULT NULL COMMENT '审核人',
  `pid` int(11) DEFAULT '0' COMMENT '上级ID',
  `receid` varchar(300) DEFAULT NULL,
  `recename` varchar(500) DEFAULT NULL COMMENT '适用对象',
  `sort` smallint(6) DEFAULT '0' COMMENT '排序号',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='自定义审核人组';

BEGIN;
COMMIT;

-------------------------------------------------

--
-- 表的结构 `xinhu_flow_course`
--

CREATE TABLE `xinhu_flow_course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` int(11) DEFAULT '0' COMMENT '上级ID',
  `nid` int(11) DEFAULT '0' COMMENT '下级步骤ID',
  `setid` smallint(6) DEFAULT '0' COMMENT '模块ID',
  `name` varchar(20) DEFAULT NULL COMMENT '步骤名称',
  `num` varchar(20) DEFAULT NULL,
  `checktype` varchar(20) DEFAULT NULL COMMENT '审核人类型',
  `checktypeid` varchar(200) DEFAULT NULL,
  `checktypename` varchar(200) DEFAULT NULL COMMENT '审核人',
  `sort` smallint(6) DEFAULT '0',
  `whereid` smallint(6) DEFAULT '0' COMMENT '流程模块条件下的Id',
  `wheres` varchar(500) DEFAULT NULL COMMENT '审核条件',
  `content` varchar(100) DEFAULT NULL COMMENT '说明',
  `optdt` datetime DEFAULT NULL,
  `status` tinyint(1) DEFAULT '1',
  `courseact` varchar(50) DEFAULT NULL COMMENT '审核动作',
  `checkshu` tinyint(2) DEFAULT '1' COMMENT '至少几人审核 ,0全部',
  `checkfields` varchar(500) DEFAULT NULL COMMENT '审核处理表单',
  `pid` smallint(6) DEFAULT '0' COMMENT '上级Id(弃用)',
  `optid` smallint(6) DEFAULT '0' COMMENT '操作人id',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人姓名',
  `receid` varchar(1000) DEFAULT NULL COMMENT '适用对象id',
  `recename` varchar(1000) DEFAULT NULL COMMENT '适用对象',
  `iszf` tinyint(1) DEFAULT '0' COMMENT '是否可以转给他人办理',
  `isqm` tinyint(1) DEFAULT '0' COMMENT '手写签名0不用,1都需要,2只需要通过,3只需要不通过',
  `coursetype` tinyint(1) DEFAULT '0' COMMENT '审批方式0顺序,1前置审批,2后置审批',
  `zshtime` int(11) DEFAULT '0' COMMENT '超时时间(分钟)',
  `zshstate` tinyint(2) DEFAULT '1' COMMENT '自动审核类型',
  `zbrangeame` varchar(200) DEFAULT NULL COMMENT '转办人员可选范围',
  `zbrangeid` varchar(200) DEFAULT NULL COMMENT '转办人员可选范围ID',
  `smlx` tinyint(1) DEFAULT '0' COMMENT '处理说明类型',
  `wjlx` tinyint(1) DEFAULT '0' COMMENT '相关文件类型',
  `isxgfj` tinyint(1) DEFAULT '0' COMMENT '审批时是否可直接编辑附件',
  `cslx` tinyint(1) DEFAULT '0' COMMENT '抄送类型',
  `csfwname` varchar(200) DEFAULT NULL COMMENT '抄送范围',
  `csfwid` varchar(200) DEFAULT NULL,
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='流程步骤表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_flow_element`
--

CREATE TABLE `xinhu_flow_element` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` smallint(6) DEFAULT '0',
  `name` varchar(20) DEFAULT NULL,
  `fields` varchar(50) DEFAULT NULL COMMENT '对应字段',
  `fieldstype` varchar(30) DEFAULT NULL,
  `sort` smallint(6) DEFAULT '0',
  `dev` varchar(100) DEFAULT NULL COMMENT '默认值',
  `isbt` tinyint(1) DEFAULT '0' COMMENT '是否必填',
  `data` varchar(500) DEFAULT NULL COMMENT '数据源',
  `islu` tinyint(1) DEFAULT '1' COMMENT '是否录入元素',
  `iszs` tinyint(1) DEFAULT '1' COMMENT '是否列表展示',
  `attr` varchar(500) DEFAULT NULL COMMENT '属性',
  `iszb` tinyint(1) DEFAULT '0',
  `isss` tinyint(1) DEFAULT '0',
  `lattr` varchar(100) DEFAULT NULL COMMENT '列属性',
  `width` varchar(10) DEFAULT NULL COMMENT '列宽',
  `lens` smallint(6) DEFAULT '0' COMMENT '字段长度',
  `savewhere` varchar(100) DEFAULT NULL COMMENT '保存条件',
  `islb` tinyint(1) DEFAULT '1' COMMENT '是否列表列',
  `ispx` tinyint(1) DEFAULT '0' COMMENT '是否可排序',
  `isalign` tinyint(1) DEFAULT '0' COMMENT '0居中,1居左,2居右',
  `issou` tinyint(1) DEFAULT '0' COMMENT '是否可搜索',
  `istj` tinyint(1) DEFAULT '0' COMMENT '是否可统计',
  `gongsi` varchar(500) DEFAULT NULL COMMENT '计算公式',
  `placeholder` varchar(50) DEFAULT NULL COMMENT '提示内容',
  `isonly` tinyint(1) DEFAULT '0' COMMENT '是否唯一',
  `isdr` tinyint(1) DEFAULT '0' COMMENT '是否导入字段',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='模块元素';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_flow_extent`
--

CREATE TABLE `xinhu_flow_extent` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `recename` varchar(4000) DEFAULT NULL,
  `receid` varchar(4000) DEFAULT NULL,
  `modeid` smallint(6) DEFAULT '0' COMMENT '模块',
  `types` tinyint(1) DEFAULT '0' COMMENT '0查看,1添加,2编辑,3删除',
  `wherestr` varchar(500) DEFAULT NULL COMMENT '条件',
  `content` varchar(500) DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `whereid` smallint(6) DEFAULT '0' COMMENT '条件Id',
  `fieldstr` varchar(500) DEFAULT NULL COMMENT '相关字段',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='模块权限';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_flow_log`
--

CREATE TABLE `xinhu_flow_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tables` varchar(50) DEFAULT NULL,
  `mid` int(11) DEFAULT NULL,
  `status` tinyint(4) DEFAULT '0' COMMENT '1通过',
  `statusname` varchar(20) DEFAULT NULL COMMENT '状态名称',
  `name` varchar(50) DEFAULT NULL COMMENT '进程名称',
  `courseid` int(11) DEFAULT NULL,
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `ip` varchar(100) DEFAULT NULL,
  `web` varchar(100) DEFAULT NULL COMMENT '浏览器',
  `checkname` varchar(20) DEFAULT NULL,
  `checkid` smallint(6) DEFAULT NULL,
  `modeid` smallint(6) DEFAULT NULL COMMENT '@模块Id',
  `color` varchar(10) DEFAULT NULL,
  `valid` tinyint(1) DEFAULT '1',
  `step` smallint(6) DEFAULT '0' COMMENT '步骤号',
  `qmimg` text COMMENT '签名的图片base64',
  `iszb` tinyint(1) DEFAULT '0' COMMENT '是否转办记录',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='单据操作记录';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_flow_menu`
--

CREATE TABLE `xinhu_flow_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '显示名称',
  `num` varchar(20) DEFAULT NULL COMMENT '编号',
  `sort` tinyint(4) DEFAULT '0',
  `statusname` varchar(20) DEFAULT NULL,
  `statuscolor` varchar(20) DEFAULT NULL,
  `statusvalue` tinyint(1) DEFAULT '1' COMMENT '状态值',
  `actname` varchar(20) DEFAULT NULL COMMENT '动作名称',
  `setid` smallint(6) DEFAULT '0' COMMENT '对应模块',
  `wherestr` varchar(300) DEFAULT NULL COMMENT '显示条件',
  `content` varchar(100) DEFAULT NULL,
  `status` tinyint(1) DEFAULT '1',
  `islog` tinyint(1) DEFAULT '1',
  `issm` tinyint(1) DEFAULT '1',
  `type` tinyint(1) DEFAULT '0' COMMENT '类型',
  `changeaction` varchar(20) DEFAULT NULL COMMENT '触发的方法',
  `fields` varchar(50) DEFAULT NULL,
  `upgcont` varchar(500) DEFAULT NULL COMMENT '更新内容',
  `iszs` tinyint(1) DEFAULT '0' COMMENT '是否在详情页面显示',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='单据操作菜单';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_flow_modetpl`
--

CREATE TABLE `xinhu_flow_modetpl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `setid` smallint(6) DEFAULT '0' COMMENT '模块Id',
  `tplname` varchar(200) DEFAULT NULL COMMENT '名称',
  `tplnum` varchar(20) NOT NULL DEFAULT '0' COMMENT '多模版编号',
  `fieldsluru` varchar(2000) DEFAULT NULL COMMENT '录入字段',
  `fieldsbitian` varchar(2000) DEFAULT NULL COMMENT '必填字段',
  `content` varchar(200) DEFAULT NULL COMMENT '说明',
  `recename` varchar(200) DEFAULT NULL COMMENT '适用对象',
  `receid` varchar(200) DEFAULT NULL,
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `sort` int(11) DEFAULT '0' COMMENT '排序号',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='模块多模版设置表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_flow_remind`
--

CREATE TABLE `xinhu_flow_remind` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `startdt` datetime DEFAULT NULL COMMENT '开始时间',
  `enddt` datetime DEFAULT NULL COMMENT '截止时间',
  `uid` smallint(6) DEFAULT NULL COMMENT '用户Id',
  `optdt` datetime DEFAULT NULL,
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `modenum` varchar(30) DEFAULT NULL COMMENT '对应模块编号',
  `tables` varchar(30) DEFAULT NULL,
  `mid` int(11) DEFAULT '0' COMMENT '主Id',
  `ratecont` varchar(500) DEFAULT NULL COMMENT '频率',
  `content` varchar(500) DEFAULT NULL COMMENT '提醒内容',
  `rate` varchar(50) DEFAULT NULL COMMENT '提醒频率o仅一次,d天,w周,m月',
  `rateval` varchar(200) DEFAULT NULL,
  `status` tinyint(1) DEFAULT '1',
  `receid` varchar(500) DEFAULT NULL,
  `recename` varchar(500) DEFAULT NULL COMMENT '提醒给',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='单据提醒设置表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_flow_set`
--

CREATE TABLE `xinhu_flow_set` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '模块名称',
  `num` varchar(30) NOT NULL DEFAULT '' COMMENT '模块编号',
  `sort` smallint(6) DEFAULT '0' COMMENT '排序',
  `ttable` varchar(50) DEFAULT NULL COMMENT '对应的表',
  `wheres` varchar(500) DEFAULT NULL COMMENT '相关条件',
  `summary` varchar(500) DEFAULT NULL COMMENT '摘要',
  `summarx` varchar(500) DEFAULT NULL COMMENT '应用摘要',
  `types` varchar(20) DEFAULT NULL COMMENT '分类',
  `pctx` tinyint(1) DEFAULT '0' COMMENT 'pc端提醒',
  `mctx` tinyint(1) DEFAULT '0' COMMENT 'app提醒',
  `wxtx` tinyint(1) DEFAULT '0' COMMENT '微信提醒',
  `emtx` tinyint(1) DEFAULT '0' COMMENT '是否邮件提醒',
  `sericnum` varchar(50) DEFAULT NULL COMMENT '编号规则',
  `isflow` tinyint(1) DEFAULT '1' COMMENT '是否有流程',
  `receid` varchar(255) DEFAULT NULL,
  `recename` varchar(255) DEFAULT NULL COMMENT '针对对象',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `status` tinyint(1) DEFAULT '1',
  `islu` tinyint(1) DEFAULT '1' COMMENT '是否可录入',
  `tables` varchar(500) DEFAULT NULL COMMENT '多行子表',
  `names` varchar(500) DEFAULT NULL COMMENT '多行子表名称',
  `statusstr` varchar(500) DEFAULT NULL COMMENT '状态值设置',
  `isgbjl` tinyint(1) DEFAULT '0' COMMENT '是否关闭操作记录',
  `isgbcy` tinyint(1) DEFAULT '0' COMMENT '是否不显示查阅记录',
  `isscl` tinyint(1) DEFAULT '0' COMMENT '是否生成列表页',
  `isup` tinyint(1) DEFAULT '1' COMMENT '更新时是否同步',
  `ddtx` tinyint(1) DEFAULT '0' COMMENT '是否钉钉提醒',
  `isbxs` tinyint(1) DEFAULT '0' COMMENT '录入页面是否不显示流程图',
  `lbztxs` tinyint(1) DEFAULT '0' COMMENT '列表页状态搜索显示0默认,1必须显示,2显示',
  `isflowlx` tinyint(1) DEFAULT '0' COMMENT '从新提交时0默认，1从新走流程',
  `iscs` tinyint(1) DEFAULT '0' COMMENT '是否自定义抄送',
  `zfeitime` int(11) DEFAULT '0' COMMENT '超过分钟自动作废',
  `ispl` tinyint(1) DEFAULT '1' COMMENT '是否开启评论',
  `istxset` tinyint(1) DEFAULT '1' COMMENT '是否开启单据提醒设置',
  `ishz` tinyint(1) DEFAULT '0' COMMENT '回执确认0不开启,1必须选择,2可选',
  `istpl` tinyint(1) DEFAULT '0' COMMENT '是否支持多模版',
  `sortdir` varchar(50) DEFAULT NULL COMMENT '默认排序',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='流程模块';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_flow_todo`
--

CREATE TABLE `xinhu_flow_todo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL COMMENT '名称标题',
  `num` varchar(30) DEFAULT NULL COMMENT '编号',
  `setid` smallint(6) DEFAULT '0' COMMENT '对应模块',
  `content` varchar(100) DEFAULT NULL COMMENT '说明',
  `whereid` smallint(6) DEFAULT '0' COMMENT '对应条件id',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `receid` varchar(500) DEFAULT NULL,
  `recename` varchar(500) DEFAULT NULL COMMENT '通知给',
  `changefields` varchar(200) DEFAULT NULL COMMENT '改变字段',
  `changecourse` varchar(30) DEFAULT NULL COMMENT '对应步做id',
  `boturn` tinyint(1) DEFAULT '0' COMMENT '提交时',
  `boedit` tinyint(1) DEFAULT '0' COMMENT '编辑时',
  `bochang` tinyint(1) DEFAULT '0' COMMENT '字段改变时',
  `bodel` tinyint(1) DEFAULT '0' COMMENT '删除时',
  `bozuofei` tinyint(1) DEFAULT '0' COMMENT '作废时',
  `botong` tinyint(1) DEFAULT '0' COMMENT '步骤处理通过时',
  `bobutong` tinyint(1) DEFAULT '0' COMMENT '步骤处理不通过时',
  `bofinish` tinyint(1) DEFAULT '0' COMMENT '处理完成时',
  `bozhui` tinyint(1) DEFAULT '0' COMMENT '追加说明时',
  `bozhuan` tinyint(1) DEFAULT '0' COMMENT '流程转办时',
  `toturn` tinyint(1) DEFAULT '0' COMMENT '是否通知给提交人',
  `tocourse` tinyint(1) DEFAULT '0' COMMENT '是否通知给流程所有参与人',
  `todofields` varchar(500) DEFAULT NULL COMMENT '通知给主表上字段',
  `summary` varchar(500) DEFAULT NULL COMMENT '通知内容摘要',
  `botask` tinyint(1) DEFAULT '0' COMMENT '计划任务',
  `boping` tinyint(1) DEFAULT '0' COMMENT '评论时',
  `bohuiz` tinyint(1) DEFAULT '0' COMMENT '回执时',
  `tosuper` tinyint(1) DEFAULT '0' COMMENT '直属上级',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='单据通知设置表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_flow_todos`
--

CREATE TABLE `xinhu_flow_todos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `modenum` varchar(30) DEFAULT '0' COMMENT '对应模块编号',
  `modename` varchar(30) DEFAULT NULL COMMENT '模块名称',
  `tables` varchar(30) DEFAULT NULL COMMENT '对应主表',
  `mid` int(11) DEFAULT '0' COMMENT '主表Id',
  `uid` int(11) DEFAULT '0' COMMENT '对应人员',
  `adddt` datetime DEFAULT NULL COMMENT '添加时间',
  `readdt` datetime DEFAULT NULL COMMENT '已读时间',
  `isread` tinyint(1) DEFAULT '0' COMMENT '是否已读',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='单据通知给对应人员';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_flow_where`
--

CREATE TABLE `xinhu_flow_where` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT,
  `setid` smallint(6) DEFAULT '0' COMMENT '对应模块',
  `num` varchar(30) DEFAULT NULL COMMENT '编号',
  `pnum` varchar(30) DEFAULT NULL COMMENT '编号分组',
  `name` varchar(50) DEFAULT NULL COMMENT '条件名称',
  `wheresstr` varchar(500) DEFAULT NULL COMMENT '对应表条件',
  `whereustr` varchar(500) DEFAULT NULL COMMENT '用户条件',
  `wheredstr` varchar(500) DEFAULT NULL COMMENT '对应部门条件',
  `sort` smallint(6) DEFAULT NULL,
  `content` varchar(200) DEFAULT NULL,
  `receid` varchar(200) DEFAULT NULL,
  `recename` varchar(200) DEFAULT NULL COMMENT '包含用户',
  `nreceid` varchar(200) DEFAULT NULL,
  `nrecename` varchar(200) DEFAULT NULL COMMENT '不包含用户',
  `islb` tinyint(1) DEFAULT '0' COMMENT '是否在生成列表页面上显示',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `syrid` varchar(200) DEFAULT NULL,
  `syrname` varchar(200) DEFAULT NULL COMMENT '此条件可适用对象',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='单据条件';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_gctodo`
--

CREATE TABLE `xinhu_gctodo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT '0',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` int(11) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `isturn` tinyint(1) DEFAULT '1' COMMENT '是否提交',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  `djtype` smallint(6) DEFAULT '0' COMMENT '类型',
  `djdt` date DEFAULT NULL COMMENT '日期',
  `pgcid` int(11) DEFAULT '0' COMMENT '对应项目',
  `pgcname` varchar(300) DEFAULT NULL COMMENT '工程名称',
  `selren` varchar(50) DEFAULT NULL COMMENT '巡检员',
  `selrenid` varchar(50) DEFAULT NULL COMMENT '巡检员的ID',
  `weizhi` varchar(2000) DEFAULT NULL COMMENT '巡检地方',
  `qingkuan` varchar(2000) DEFAULT NULL COMMENT '检查情况',
  `cuoshi` varchar(2000) DEFAULT NULL COMMENT '预防措施',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_godepot`
--

CREATE TABLE `xinhu_godepot` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `depotname` varchar(50) DEFAULT NULL COMMENT '仓库名称',
  `depotaddress` varchar(100) DEFAULT NULL COMMENT '仓库地址',
  `cgname` varchar(50) DEFAULT NULL COMMENT '仓库管理员',
  `cgid` varchar(50) DEFAULT NULL COMMENT '仓库管理员的ID',
  `depotcontent` varchar(500) DEFAULT NULL COMMENT '说明',
  `sort` smallint(6) DEFAULT '0' COMMENT '排序号',
  `depotnum` varchar(50) DEFAULT NULL COMMENT '仓库编号',
  `wpshu` int(11) DEFAULT '0' COMMENT '物品数',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物品仓库表';

BEGIN;
COMMIT;


--
-- 表的结构 `xinhu_goodm`
--

CREATE TABLE `xinhu_goodm` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `num` varchar(50) DEFAULT NULL COMMENT '编号如销售号',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` int(11) DEFAULT NULL,
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `isturn` tinyint(1) DEFAULT '1' COMMENT '是否提交',
  `types` tinyint(1) DEFAULT '0' COMMENT '0领用,1采购申请',
  `money` decimal(10,2) DEFAULT '0.00' COMMENT '费用',
  `custid` smallint(6) DEFAULT '0',
  `custname` varchar(50) DEFAULT NULL COMMENT '供应商名称',
  `discount` decimal(8,2) DEFAULT '0.00' COMMENT '优惠价格',
  `state` tinyint(1) DEFAULT '0' COMMENT '0待出入库,2部分出入库,1已全部出入库',
  `custractid` int(11) DEFAULT '0' COMMENT '关联客户合同custract.id',
  `ispay` tinyint(1) DEFAULT '0' COMMENT '是否全部创建收款单',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  `leixing` varchar(50) DEFAULT NULL COMMENT '退货类型',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物品领用采购申请主表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_goodn`
--

CREATE TABLE `xinhu_goodn` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` smallint(6) DEFAULT '0' COMMENT '对应主表',
  `aid` smallint(6) DEFAULT '0' COMMENT '物品Id',
  `count` int(11) DEFAULT '0' COMMENT '数量',
  `couns` int(11) DEFAULT '0' COMMENT '已出库入库数跟count相等时就全部了',
  `sort` smallint(6) DEFAULT '0',
  `unit` varchar(5) DEFAULT NULL COMMENT '单位',
  `price` decimal(10,2) DEFAULT '0.00' COMMENT '单价',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  `lygh` tinyint(1) DEFAULT '0' COMMENT '是否需要归还',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物品库存详细表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_goods`
--

CREATE TABLE `xinhu_goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `typeid` smallint(6) DEFAULT '0' COMMENT '对应分类',
  `num` varchar(30) DEFAULT NULL COMMENT '物品编号',
  `name` varchar(30) DEFAULT NULL,
  `guige` varchar(50) DEFAULT NULL COMMENT '规格',
  `xinghao` varchar(50) DEFAULT NULL COMMENT '型号',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `price` decimal(10,2) DEFAULT '0.00' COMMENT '单价',
  `unit` varchar(5) DEFAULT NULL COMMENT '单位',
  `adddt` datetime DEFAULT NULL,
  `optdt` datetime DEFAULT NULL,
  `optid` smallint(6) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL,
  `stock` int(11) DEFAULT '0' COMMENT '库存',
  `stockcs` int(11) DEFAULT '0' COMMENT '初始库存',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物品表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_goodss`
--

CREATE TABLE `xinhu_goodss` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `aid` smallint(6) DEFAULT '0' COMMENT '物品Id',
  `count` int(11) DEFAULT '0' COMMENT '数量',
  `uid` smallint(6) DEFAULT '0',
  `type` tinyint(1) DEFAULT '0' COMMENT '0入库,1出库',
  `kind` tinyint(2) DEFAULT '0' COMMENT '出入库类型',
  `optname` varchar(20) DEFAULT NULL,
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `optdt` datetime DEFAULT NULL,
  `content` varchar(500) DEFAULT NULL,
  `status` tinyint(1) DEFAULT '1',
  `optid` int(11) DEFAULT '0',
  `mid` smallint(6) DEFAULT '0' COMMENT '对应主表',
  `sort` smallint(6) DEFAULT '0',
  `unit` varchar(5) DEFAULT NULL COMMENT '单位',
  `price` decimal(10,2) DEFAULT '0.00' COMMENT '单价',
  `depotid` smallint(6) DEFAULT '1' COMMENT '存放仓库ID',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物品库存详细表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_group`
--

CREATE TABLE `xinhu_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '组名',
  `sort` int(11) DEFAULT '0',
  `ispir` tinyint(4) DEFAULT '1' COMMENT '是否权限验证',
  `indate` datetime DEFAULT NULL,
  `companyid` smallint(6) DEFAULT '0' COMMENT '所属单位Id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统组';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_homeitems`
--

CREATE TABLE `xinhu_homeitems` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `num` varchar(30) NOT NULL COMMENT '编号',
  `receid` varchar(300) DEFAULT NULL,
  `recename` varchar(500) DEFAULT NULL,
  `sorts` smallint(6) DEFAULT NULL COMMENT '排序号',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `row` tinyint(1) DEFAULT '0' COMMENT '所在位置',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='桌面项目表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_hrcheck`
--

CREATE TABLE `xinhu_hrcheck` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` smallint(6) DEFAULT '0',
  `title` varchar(100) DEFAULT NULL COMMENT '考核名称',
  `applyname` varchar(30) DEFAULT NULL COMMENT '申请人姓名',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` smallint(6) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `contents` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `isturn` tinyint(1) DEFAULT '1' COMMENT '是否提交',
  `uname` varchar(20) DEFAULT NULL COMMENT '对应人',
  `month` varchar(50) DEFAULT '{month}' COMMENT '月份',
  `content` varchar(2000) DEFAULT NULL COMMENT '考核内容',
  `fenzp` decimal(6,1) DEFAULT '0.0' COMMENT '自评分数',
  `fensj` decimal(6,1) DEFAULT '0.0' COMMENT '上级评分',
  `fenrs` decimal(6,1) DEFAULT '0.0' COMMENT '人事评分',
  `fen` decimal(6,1) DEFAULT '0.0' COMMENT '最后得分',
  `khid` int(11) DEFAULT '0' COMMENT '关联考核项目hrkaohem.id',
  `createdt` datetime DEFAULT NULL COMMENT '创建时间',
  `startdt` date DEFAULT NULL COMMENT '评分开始时间',
  `enddt` date DEFAULT NULL COMMENT '评分截止时间',
  `pfren` varchar(500) DEFAULT NULL COMMENT '评分人',
  `pfrenid` varchar(500) DEFAULT NULL,
  `pfrenids` varchar(500) DEFAULT NULL COMMENT '未评分人Id',
  `pfrens` varchar(500) DEFAULT NULL COMMENT '未评分人',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考核评分表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_hrcheckn`
--

CREATE TABLE `xinhu_hrcheckn` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `itemname` varchar(100) DEFAULT NULL COMMENT '评分项目',
  `pfname` varchar(100) DEFAULT NULL COMMENT '评分名称',
  `mid` smallint(6) DEFAULT '0' COMMENT '对应主表hrcheck.id',
  `sort` smallint(6) DEFAULT '0' COMMENT '排序号',
  `sid` int(11) DEFAULT '0' COMMENT '对应hrchecks.id',
  `fenshu` smallint(6) DEFAULT '0' COMMENT '评分分数',
  `weight` decimal(6,1) DEFAULT '0.0' COMMENT '权重',
  `optid` int(11) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '评分人',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `defen` decimal(6,1) DEFAULT '0.0' COMMENT '最后得分',
  `pfid` int(11) DEFAULT '0' COMMENT '关联评分hrkaohen.Id',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考核评分记录';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_hrchecks`
--

CREATE TABLE `xinhu_hrchecks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` smallint(6) DEFAULT '0' COMMENT '对应主表hrkaohem.id',
  `sort` smallint(6) DEFAULT '0' COMMENT '排序号',
  `itemname` varchar(200) DEFAULT NULL COMMENT '考评项目',
  `weight` decimal(6,1) DEFAULT '0.0' COMMENT '权重(%)',
  `fenshu` decimal(6,1) DEFAULT '0.0' COMMENT '占用分数',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考评内容';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_hrdemint`
--

CREATE TABLE `xinhu_hrdemint` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` smallint(6) DEFAULT '0',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` smallint(6) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `types` tinyint(1) DEFAULT '0' COMMENT '0需求,1面试',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `contents` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `isturn` tinyint(1) DEFAULT '1' COMMENT '是否提交',
  `zhiwei` varchar(50) DEFAULT NULL COMMENT '需求职位',
  `xinzi` varchar(50) DEFAULT NULL COMMENT '薪资',
  `renshu` smallint(6) DEFAULT '1' COMMENT '需求人数',
  `content` varchar(2000) DEFAULT NULL COMMENT '职位要求/面试者简历',
  `bumen` varchar(50) DEFAULT NULL COMMENT '需求部门',
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `msuser` varchar(50) DEFAULT NULL COMMENT '面试人员',
  `msuserid` varchar(50) DEFAULT NULL COMMENT '面试人员的ID',
  `mscont` varchar(2000) DEFAULT NULL COMMENT '面试记录',
  `state` tinyint(1) DEFAULT '0' COMMENT '面试结果0待面试,1录用,2不适合',
  `msdt` datetime DEFAULT NULL COMMENT '面试时间',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='面试和人员需求表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_hrkaohem`
--

CREATE TABLE `xinhu_hrkaohem` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL COMMENT '考核名称',
  `startdt` date DEFAULT NULL COMMENT '开始日期',
  `enddt` date DEFAULT NULL COMMENT '截止日期',
  `receid` varchar(1000) DEFAULT NULL,
  `recename` varchar(1000) DEFAULT NULL COMMENT '对应考核人',
  `optid` int(11) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `hegfen` smallint(6) DEFAULT '0' COMMENT '合格分数',
  `maxfen` smallint(6) DEFAULT '100' COMMENT '最高分数',
  `pinlv` varchar(50) DEFAULT 'm' COMMENT '考核频率',
  `sctime` varchar(30) DEFAULT NULL COMMENT '生成时间',
  `pfsj` smallint(6) DEFAULT '3' COMMENT '评分时间(天)',
  `status` tinyint(1) DEFAULT '1' COMMENT '是否启用',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考核项目';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_hrkaohen`
--

CREATE TABLE `xinhu_hrkaohen` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` smallint(6) DEFAULT '0' COMMENT '对应主表hrkaohem.id',
  `sort` smallint(6) DEFAULT '0' COMMENT '排序号',
  `pfname` varchar(50) DEFAULT NULL COMMENT '评分名称',
  `pftype` varchar(20) DEFAULT NULL COMMENT '评分人类型',
  `pfren` varchar(20) DEFAULT NULL COMMENT '评分人',
  `pfrenid` varchar(20) DEFAULT NULL,
  `pfweight` decimal(6,1) DEFAULT '0.0' COMMENT '评分权重',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考核项目人员';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_hrkaohes`
--

CREATE TABLE `xinhu_hrkaohes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` smallint(6) DEFAULT '0' COMMENT '对应主表hrkaohem.id',
  `sort` smallint(6) DEFAULT '0' COMMENT '排序号',
  `itemname` varchar(200) DEFAULT NULL COMMENT '考评项目',
  `weight` decimal(6,1) DEFAULT '0.0' COMMENT '权重(%)',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考核项目的内容';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_hrpositive`
--

CREATE TABLE `xinhu_hrpositive` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `applyname` varchar(30) DEFAULT NULL COMMENT '申请人姓名',
  `ranking` varchar(30) DEFAULT NULL COMMENT '职位',
  `entrydt` date DEFAULT NULL COMMENT '入职日期',
  `syenddt` date DEFAULT NULL COMMENT '试用到期日',
  `positivedt` date DEFAULT NULL COMMENT '转正日期',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '0' COMMENT '@0|待审核,1|审核通过,2|审核不通过',
  `isturn` tinyint(1) DEFAULT '0' COMMENT '@0|未提交,1|提交',
  `isover` tinyint(1) DEFAULT '0',
  `optid` int(11) DEFAULT NULL,
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='HR转正';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_hrredund`
--

CREATE TABLE `xinhu_hrredund` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `applyname` varchar(30) DEFAULT NULL COMMENT '申请人姓名',
  `ranking` varchar(30) DEFAULT NULL COMMENT '职位',
  `entrydt` date DEFAULT NULL COMMENT '入职日期',
  `quitdt` date DEFAULT NULL COMMENT '离职日期',
  `redundtype` varchar(20) DEFAULT NULL COMMENT '离职类型',
  `redundreson` varchar(100) DEFAULT NULL COMMENT '离职原因',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '0' COMMENT '@0|待审核,1|审核通过,2|审核不通过',
  `isturn` tinyint(1) DEFAULT '0' COMMENT '@0|未提交,1|提交',
  `isover` tinyint(1) DEFAULT '0',
  `optid` int(11) DEFAULT NULL,
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='离职申请';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_hrsalarm`
--

CREATE TABLE `xinhu_hrsalarm` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL COMMENT '模版名称',
  `receid` varchar(500) DEFAULT NULL,
  `recename` varchar(500) DEFAULT NULL COMMENT '适用对象',
  `content` varchar(500) DEFAULT NULL,
  `optid` int(11) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL,
  `optdt` datetime DEFAULT NULL,
  `atype` varchar(20) DEFAULT NULL COMMENT '模版类型',
  `startdt` varchar(20) DEFAULT NULL COMMENT '开始月份',
  `enddt` varchar(20) DEFAULT NULL COMMENT '截止月份',
  `sort` smallint(6) DEFAULT '0' COMMENT '排序号',
  `status` tinyint(1) DEFAULT '1' COMMENT '是否启用',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='薪资模版';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_hrsalars`
--

CREATE TABLE `xinhu_hrsalars` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` smallint(6) DEFAULT '0' COMMENT '对应主表hrsalarm.id',
  `sort` smallint(6) DEFAULT '0' COMMENT '排序号',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `fields` varchar(50) DEFAULT NULL COMMENT '对应字段',
  `gongsi` varchar(1000) DEFAULT NULL COMMENT '公式',
  `types` tinyint(1) DEFAULT '0' COMMENT '0字段,1增加,2减少',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `devzhi` varchar(20) DEFAULT NULL COMMENT '默认值',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='薪资模版子表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_hrsalary`
--

CREATE TABLE `xinhu_hrsalary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` smallint(6) DEFAULT '0',
  `xuid` smallint(6) DEFAULT '0',
  `uname` varchar(20) DEFAULT NULL COMMENT '对应人',
  `udeptname` varchar(20) DEFAULT NULL COMMENT '对应人员部门',
  `ranking` varchar(20) DEFAULT NULL COMMENT '职位',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` smallint(6) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `isturn` tinyint(1) DEFAULT '1' COMMENT '是否提交',
  `month` varchar(10) DEFAULT NULL COMMENT '月份',
  `base` decimal(10,2) DEFAULT '0.00' COMMENT '基本工资',
  `money` decimal(10,2) DEFAULT '0.00' COMMENT '实发',
  `mones` decimal(10,2) DEFAULT '0.00' COMMENT '应发工资',
  `postjt` decimal(10,2) DEFAULT '0.00' COMMENT '职务津贴',
  `skilljt` decimal(10,2) DEFAULT '0.00' COMMENT '技能津贴',
  `travelbt` decimal(10,2) DEFAULT '0.00' COMMENT '交通补贴',
  `telbt` decimal(10,2) DEFAULT '0.00' COMMENT '通信补贴',
  `reward` decimal(10,2) DEFAULT '0.00' COMMENT '奖励',
  `punish` decimal(10,2) DEFAULT '0.00' COMMENT '处罚',
  `socials` decimal(10,2) DEFAULT '0.00' COMMENT '个人社保',
  `socialsunit` decimal(10,2) DEFAULT '0.00' COMMENT '单位社保缴费',
  `taxes` decimal(10,2) DEFAULT '0.00' COMMENT '个人所得税',
  `taxbase` decimal(10,2) DEFAULT '0.00' COMMENT '个税起征点',
  `ispay` tinyint(1) DEFAULT '0' COMMENT '是否发放',
  `otherzj` decimal(10,2) DEFAULT '0.00' COMMENT '其它增加',
  `otherjs` decimal(10,2) DEFAULT '0.00' COMMENT '其它减少',
  `cidao` smallint(6) DEFAULT '0' COMMENT '迟到(次)',
  `cidaos` decimal(10,2) DEFAULT '0.00' COMMENT '迟到处罚',
  `zaotui` smallint(6) DEFAULT '0' COMMENT '早退(次)',
  `zaotuis` decimal(10,2) DEFAULT '0.00' COMMENT '早退处罚',
  `leavet` smallint(6) DEFAULT '0' COMMENT '请假(小时)',
  `leaves` decimal(10,2) DEFAULT '0.00' COMMENT '请假减少',
  `jiaban` smallint(6) DEFAULT '0' COMMENT '加班(小时)',
  `jiabans` decimal(10,2) DEFAULT '0.00' COMMENT '加班补贴',
  `weidk` smallint(6) DEFAULT '0' COMMENT '未打卡(次)',
  `weidks` decimal(10,2) DEFAULT '0.00' COMMENT '未打卡减少',
  `jxjs` decimal(10,2) DEFAULT '0.00' COMMENT '绩效基数',
  `jxxs` decimal(10,2) DEFAULT '0.00' COMMENT '绩效系数',
  `jxdf` decimal(10,2) DEFAULT '0.00' COMMENT '绩效打分',
  `jtpost` decimal(10,2) DEFAULT '0.00' COMMENT '绩效收入',
  `ysbtime` decimal(10,1) DEFAULT '0.0' COMMENT '应上班天数',
  `zsbtime` decimal(10,1) DEFAULT '0.0' COMMENT '已上班天数',
  `gonggeren` decimal(10,2) DEFAULT '0.00' COMMENT '公积金个人',
  `gongunit` decimal(10,2) DEFAULT '0.00' COMMENT '公积金单位',
  `foodbt` decimal(10,2) DEFAULT '0.00' COMMENT '餐补贴',
  `hotbt` decimal(10,2) DEFAULT '0.00' COMMENT '高温津贴',
  `dnbt` decimal(10,2) DEFAULT '0.00' COMMENT '电脑补贴',
  `jiansr` decimal(10,2) DEFAULT '0.00' COMMENT '计件收入',
  `otherbt` decimal(10,2) DEFAULT '0.00' COMMENT '其他补贴',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='工资表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_hrshebao`
--

CREATE TABLE `xinhu_hrshebao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL COMMENT '名称',
  `recename` varchar(500) DEFAULT NULL COMMENT '适用对象',
  `receid` varchar(500) DEFAULT NULL,
  `status` tinyint(1) DEFAULT '1' COMMENT '是否开启',
  `gongjishu` decimal(10,2) DEFAULT '0.00' COMMENT '公积金基数',
  `yljishu` decimal(10,2) DEFAULT '0.00' COMMENT '养老保险基数',
  `ylgeren` decimal(10,2) DEFAULT '0.00' COMMENT '养老个人比例(%)',
  `ylunit` decimal(10,2) DEFAULT '0.00' COMMENT '养老单位比例(%)',
  `syjishu` decimal(10,2) DEFAULT '0.00' COMMENT '失业报销基数',
  `sygeren` decimal(10,2) DEFAULT '0.00' COMMENT '失业个人比例(%)',
  `syunit` decimal(10,2) DEFAULT '0.00' COMMENT '失业单位比例(%)',
  `gsjishu` decimal(10,2) DEFAULT '0.00' COMMENT '工伤报销基数',
  `gsgeren` decimal(10,2) DEFAULT '0.00' COMMENT '工伤个人比例(%)',
  `gsunit` decimal(10,2) DEFAULT '0.00' COMMENT '工伤单位比例(%)',
  `syujishu` decimal(10,2) DEFAULT '0.00' COMMENT '生育保险基数',
  `syugeren` decimal(10,2) DEFAULT '0.00' COMMENT '生育个人比例(%)',
  `syuunit` decimal(10,2) DEFAULT '0.00' COMMENT '生育单位比例(%)',
  `yijishu` decimal(10,2) DEFAULT '0.00' COMMENT '医疗报销基数',
  `yigeren` decimal(10,2) DEFAULT '0.00' COMMENT '医疗个人比例(%)',
  `yiunit` decimal(10,2) DEFAULT '0.00' COMMENT '医疗单位比例(%)',
  `dbgeren` decimal(10,2) DEFAULT '0.00' COMMENT '大病个人',
  `gjjgeren` decimal(10,2) DEFAULT '0.00' COMMENT '公积金个人比例(%)',
  `gjjunit` decimal(10,2) DEFAULT '0.00' COMMENT '公积金单位比例(%)',
  `shebaogeren` decimal(10,2) DEFAULT '0.00' COMMENT '个人社保缴费',
  `shebaounit` decimal(10,2) DEFAULT '0.00' COMMENT '单位社保缴费',
  `sctime` varchar(20) DEFAULT NULL COMMENT '每月生成时间',
  `optdt` datetime DEFAULT NULL,
  `gonggeren` decimal(10,2) DEFAULT '0.00' COMMENT '公积金个人',
  `gongunit` decimal(10,2) DEFAULT '0.00' COMMENT '公积金单位',
  `explian` varchar(500) DEFAULT NULL COMMENT '说明',
  `startdt` varchar(20) DEFAULT NULL COMMENT '开始月份',
  `enddt` varchar(20) DEFAULT NULL COMMENT '截止月份',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='社保公积金';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_hrtransfer`
--

CREATE TABLE `xinhu_hrtransfer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` smallint(6) DEFAULT '0',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` smallint(6) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `isturn` tinyint(1) DEFAULT '1' COMMENT '是否提交',
  `tranuid` smallint(6) DEFAULT '0',
  `tranname` varchar(20) DEFAULT NULL COMMENT '要调动人',
  `trantype` varchar(20) DEFAULT NULL COMMENT '调动类型',
  `olddeptname` varchar(50) DEFAULT NULL COMMENT '原来部门',
  `oldranking` varchar(20) DEFAULT NULL COMMENT '原来职位',
  `effectivedt` date DEFAULT NULL COMMENT '生效日期',
  `newdeptname` varchar(50) DEFAULT NULL COMMENT '调动后部门',
  `newdeptid` smallint(6) DEFAULT NULL,
  `newranking` varchar(20) DEFAULT NULL COMMENT '调动后职位',
  `isover` tinyint(1) DEFAULT '0' COMMENT '是否已完成',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='职位调动';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_hrtrsalary`
--

CREATE TABLE `xinhu_hrtrsalary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` smallint(6) DEFAULT '0',
  `applyname` varchar(30) DEFAULT NULL COMMENT '申请人姓名',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` smallint(6) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `isturn` tinyint(1) DEFAULT '1' COMMENT '是否提交',
  `effectivedt` date DEFAULT NULL COMMENT '生效日期',
  `floats` smallint(6) DEFAULT '0' COMMENT '调薪幅度',
  `ranking` varchar(20) DEFAULT NULL COMMENT '职位',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='调薪申请';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_im_group`
--

CREATE TABLE `xinhu_im_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '名称',
  `pid` smallint(6) DEFAULT '0' COMMENT '对应上级',
  `types` varchar(10) DEFAULT NULL COMMENT '应用分类',
  `ctype` tinyint(1) DEFAULT '0' COMMENT '类型@0|群,1|讨论组,2|应用',
  `sort` smallint(6) DEFAULT '0' COMMENT '排序号',
  `createid` int(11) DEFAULT NULL,
  `createname` varchar(20) DEFAULT NULL COMMENT '创建人',
  `createdt` datetime DEFAULT NULL COMMENT '创建时间',
  `face` varchar(50) DEFAULT NULL COMMENT '头像',
  `num` varchar(20) DEFAULT NULL,
  `receid` varchar(200) DEFAULT NULL,
  `recename` varchar(200) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  `valid` tinyint(1) DEFAULT '1',
  `content` varchar(200) DEFAULT NULL,
  `iconfont` varchar(30) DEFAULT NULL COMMENT '对应字体图标',
  `iconcolor` varchar(7) DEFAULT NULL COMMENT '字体图标颜色',
  `yylx` tinyint(1) DEFAULT '0' COMMENT '应用类型0全部,1pc,2手机',
  `urlpc` varchar(200) DEFAULT NULL COMMENT '应用上PC地址',
  `urlm` varchar(200) DEFAULT NULL COMMENT '应用上手机端地址',
  `deptid` varchar(100) DEFAULT NULL COMMENT '对应部门id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='IM会话表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_im_groupuser`
--

CREATE TABLE `xinhu_im_groupuser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gid` smallint(6) NOT NULL DEFAULT '0',
  `uid` smallint(6) NOT NULL DEFAULT '0',
  `istx` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='IM会话人员';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_im_history`
--

CREATE TABLE `xinhu_im_history` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `types` varchar(10) DEFAULT NULL,
  `receid` smallint(6) DEFAULT '0',
  `uid` smallint(6) DEFAULT NULL,
  `sendid` smallint(6) DEFAULT '0',
  `optdt` datetime DEFAULT NULL,
  `cont` varchar(200) DEFAULT NULL,
  `stotal` smallint(6) DEFAULT '0',
  `title` varchar(50) DEFAULT NULL COMMENT '推送时标题',
  `xgurl` varchar(200) DEFAULT NULL COMMENT '相关地址',
  `messid` int(11) DEFAULT '0' COMMENT '最后一条消息id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='IM会话记录历史表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_im_menu`
--

CREATE TABLE `xinhu_im_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` smallint(6) NOT NULL DEFAULT '0',
  `pid` smallint(6) NOT NULL DEFAULT '0',
  `name` varchar(10) DEFAULT NULL COMMENT '名称',
  `sort` smallint(6) NOT NULL DEFAULT '0',
  `types` tinyint(4) DEFAULT '0' COMMENT '1url,0事件',
  `url` varchar(300) DEFAULT NULL COMMENT '对应地址',
  `num` varchar(20) DEFAULT NULL,
  `color` varchar(10) DEFAULT NULL COMMENT '颜色',
  `receid` varchar(300) DEFAULT NULL,
  `recename` varchar(300) DEFAULT NULL COMMENT '可使用人员',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='IM下应用菜单';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_im_mess`
--

CREATE TABLE `xinhu_im_mess` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `optdt` datetime DEFAULT NULL,
  `zt` tinyint(1) DEFAULT '0' COMMENT '状态',
  `cont` varchar(4000) DEFAULT NULL COMMENT '内容',
  `sendid` smallint(6) DEFAULT NULL,
  `receid` smallint(6) DEFAULT '0' COMMENT '接收',
  `receuid` varchar(4000) DEFAULT NULL COMMENT '接收用户id',
  `types` varchar(20) DEFAULT NULL COMMENT '信息类型',
  `url` varchar(1000) DEFAULT NULL COMMENT '相关地址',
  `fileid` int(11) NOT NULL DEFAULT '0' COMMENT '对应文件Id',
  `msgid` varchar(50) DEFAULT NULL,
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='IM聊天记录表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_im_messzt`
--

CREATE TABLE `xinhu_im_messzt` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` int(11) DEFAULT NULL COMMENT '信息id',
  `uid` int(11) DEFAULT NULL COMMENT '人员id',
  `gid` smallint(6) DEFAULT '0',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='IM聊天消息状态表';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_infor`
--

CREATE TABLE `xinhu_infor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) DEFAULT NULL COMMENT '标题',
  `optdt` datetime DEFAULT NULL,
  `typename` varchar(20) DEFAULT NULL,
  `content` text,
  `url` varchar(200) DEFAULT NULL,
  `receid` varchar(2000) DEFAULT NULL COMMENT '接收人Id',
  `recename` varchar(4000) DEFAULT NULL,
  `optid` smallint(6) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL,
  `enddt` datetime DEFAULT NULL COMMENT '截止时间',
  `startdt` datetime DEFAULT NULL COMMENT '开始时间',
  `zuozhe` varchar(30) DEFAULT NULL COMMENT '发布者',
  `indate` date DEFAULT NULL COMMENT '日期',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `fengmian` varchar(100) DEFAULT NULL COMMENT '封面图片',
  `mintou` smallint(6) DEFAULT '0' COMMENT '至少投票',
  `maxtou` smallint(6) DEFAULT '0' COMMENT '最多投投票0不限制',
  `issms` tinyint(1) DEFAULT '0' COMMENT '是否发短信',
  `istop` tinyint(1) DEFAULT '0' COMMENT '排序号越大越靠前',
  `zstart` date DEFAULT NULL COMMENT '展示开始日期',
  `zsend` date DEFAULT NULL COMMENT '展示截止日期',
  `comid` smallint(6) DEFAULT '0' COMMENT '所在单位Id',
  `appxs` tinyint(1) DEFAULT '0' COMMENT 'app首页显示',
  `mtplid` int(11) DEFAULT '0' COMMENT '对应多模版flow_modetpl.id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='通知公告';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_infors`
--

CREATE TABLE `xinhu_infors` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` smallint(6) DEFAULT '0' COMMENT '对应主表infor.id',
  `sort` smallint(6) DEFAULT '0' COMMENT '排序号',
  `touitems` varchar(200) DEFAULT NULL COMMENT '投票选项',
  `touci` int(11) DEFAULT '0' COMMENT '得到票数',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='信息子表投票项';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_knowledge`
--

CREATE TABLE `xinhu_knowledge` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL COMMENT '标题',
  `typeid` smallint(6) DEFAULT '0' COMMENT '对应分类',
  `sort` smallint(6) DEFAULT '0' COMMENT '排序',
  `content` text,
  `optdt` datetime DEFAULT NULL,
  `optname` varchar(20) DEFAULT NULL,
  `adddt` datetime DEFAULT NULL,
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='知识信息';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_knowtiku`
--

CREATE TABLE `xinhu_knowtiku` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(500) DEFAULT NULL COMMENT '标题',
  `typeid` smallint(6) DEFAULT '0',
  `types` tinyint(1) DEFAULT '0' COMMENT '0单选,1多选,2判断题',
  `ana` varchar(300) DEFAULT NULL COMMENT '答案A',
  `anb` varchar(300) DEFAULT NULL COMMENT '答案B',
  `anc` varchar(300) DEFAULT NULL COMMENT '答案C',
  `ands` varchar(300) DEFAULT NULL COMMENT '答案D',
  `ane` varchar(300) DEFAULT NULL COMMENT '答案E',
  `answer` varchar(10) DEFAULT NULL,
  `sort` smallint(6) DEFAULT '0',
  `adddt` datetime DEFAULT NULL,
  `optdt` datetime DEFAULT NULL,
  `contents` varchar(500) DEFAULT NULL,
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `content` varchar(1000) DEFAULT NULL,
  `optid` smallint(6) DEFAULT '0',
  `imgurl` varchar(100) DEFAULT NULL COMMENT '相关图片地址',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='知识题库';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_knowtraim`
--

CREATE TABLE `xinhu_knowtraim` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL COMMENT '标题',
  `optid` int(11) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `optdt` datetime DEFAULT NULL,
  `dxshu` smallint(6) DEFAULT '0' COMMENT '多选题目数量',
  `dsshu` smallint(6) DEFAULT '0' COMMENT '单选题目数量',
  `pdshu` smallint(6) DEFAULT '0' COMMENT '判断题数',
  `reshu` smallint(6) DEFAULT '0' COMMENT '培训人数',
  `startdt` datetime DEFAULT NULL COMMENT '开始时间',
  `enddt` datetime DEFAULT NULL COMMENT '截止时间',
  `kstime` smallint(6) DEFAULT '0' COMMENT '考试时间(分钟)',
  `ydshu` smallint(6) DEFAULT '0' COMMENT '已答题人数',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `receid` varchar(200) DEFAULT NULL,
  `recename` varchar(200) DEFAULT NULL COMMENT '发给谁培训',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `state` tinyint(1) DEFAULT '0' COMMENT '0还没开始,1考试中,2已结束',
  `zfenshu` int(11) DEFAULT '0' COMMENT '总分',
  `hgfen` int(11) DEFAULT '0' COMMENT '合格分数',
  `tikuid` varchar(200) DEFAULT NULL,
  `tikuname` varchar(200) DEFAULT NULL COMMENT '对应题库',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='培训表出题考试';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_knowtrais`
--

CREATE TABLE `xinhu_knowtrais` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` int(11) DEFAULT '0',
  `uid` int(11) DEFAULT '0',
  `kssdt` datetime DEFAULT NULL COMMENT '考试时间',
  `ksedt` datetime DEFAULT NULL COMMENT '考试结束时间',
  `fenshu` smallint(6) DEFAULT '0' COMMENT '得分',
  `kstime` int(11) DEFAULT '0' COMMENT '考试时间(秒数)',
  `isks` tinyint(1) DEFAULT '0' COMMENT '是否已考试',
  `tkids` varchar(2000) DEFAULT NULL COMMENT '考试题目id',
  `dyids` varchar(1000) DEFAULT NULL COMMENT '我做题得到答案',
  `dyjgs` varchar(1000) DEFAULT NULL COMMENT '答题结果0未答,1正确,2错误',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考试培训子表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_kqanay`
--

CREATE TABLE `xinhu_kqanay` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dt` date DEFAULT NULL COMMENT '日期',
  `uid` smallint(6) DEFAULT NULL COMMENT '人员id',
  `ztname` varchar(20) DEFAULT NULL COMMENT '状态名称',
  `time` datetime DEFAULT NULL,
  `state` varchar(20) DEFAULT NULL COMMENT '状态名称',
  `states` varchar(20) DEFAULT NULL COMMENT '其他状态,如请假',
  `sort` smallint(6) DEFAULT '0',
  `iswork` tinyint(4) DEFAULT '1' COMMENT '是否工作日',
  `emiao` int(11) DEFAULT '0' COMMENT '秒数',
  `optdt` datetime DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  `timesb` decimal(6,1) DEFAULT '0.0' COMMENT '应上班时间(小时)',
  `timeys` decimal(6,1) DEFAULT '0.0' COMMENT '已上班时间(小时)',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考勤分析';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_kqdist`
--

CREATE TABLE `xinhu_kqdist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `recename` varchar(1000) DEFAULT NULL COMMENT '适用对象',
  `receid` varchar(1000) DEFAULT NULL,
  `mid` smallint(6) DEFAULT '0',
  `types` tinyint(1) DEFAULT '0' COMMENT '0考勤时间,1休息,2定位的',
  `startdt` date DEFAULT NULL,
  `enddt` date DEFAULT NULL,
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `sort` int(11) DEFAULT '0' COMMENT '排序号',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考勤分配表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_kqdisv`
--

CREATE TABLE `xinhu_kqdisv` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `plx` tinyint(1) DEFAULT '1' COMMENT '1组排班,2人员',
  `receid` int(11) DEFAULT '0' COMMENT '组id,人员Id',
  `dt` date DEFAULT NULL COMMENT '日期',
  `types` tinyint(1) DEFAULT '0' COMMENT '0考勤时间,1休息,2工作日',
  `mid` int(11) DEFAULT '0' COMMENT '对应主ID',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考勤排班';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_kqdkjl`
--

CREATE TABLE `xinhu_kqdkjl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL DEFAULT '0',
  `dkdt` datetime DEFAULT NULL,
  `optdt` datetime DEFAULT NULL,
  `types` tinyint(1) DEFAULT '0' COMMENT '0在线打卡,1考勤机,2手机定位,3手动添加,4异常添加,5数据导入,6接口导入',
  `address` varchar(200) DEFAULT NULL COMMENT '定位地址',
  `lat` varchar(20) DEFAULT NULL COMMENT '纬度',
  `lng` varchar(20) DEFAULT NULL COMMENT '经度',
  `accuracy` smallint(6) DEFAULT '0' COMMENT '精确范围',
  `ip` varchar(100) DEFAULT NULL,
  `mac` varchar(100) DEFAULT NULL,
  `content` varchar(200) DEFAULT NULL,
  `imgpath` varchar(100) DEFAULT NULL COMMENT '相关图片',
  `snid` int(11) DEFAULT '0' COMMENT '考勤机设备id',
  `sntype` tinyint(4) DEFAULT '0' COMMENT '考勤机打卡方式0密码,1指纹,2刷卡',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='打卡记录';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_kqdw`
--

CREATE TABLE `xinhu_kqdw` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '名称',
  `location_x` varchar(20) DEFAULT NULL,
  `location_y` varchar(20) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL COMMENT '位置名称',
  `precisions` int(11) DEFAULT '0' COMMENT '允许误差米',
  `scale` smallint(6) DEFAULT '0',
  `wifiname` varchar(100) DEFAULT NULL COMMENT '打卡wifi名',
  `iswgd` tinyint(1) DEFAULT '0' COMMENT '是否为无固定地点',
  `dwids` varchar(50) DEFAULT NULL COMMENT '关联对应ID,实现多点定位',
  `ispz` tinyint(1) DEFAULT '0' COMMENT '是否需要拍照才能打卡',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考勤定位规则';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_kqerr`
--

CREATE TABLE `xinhu_kqerr` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` smallint(6) DEFAULT '0',
  `uname` varchar(30) DEFAULT NULL COMMENT '申请人',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` smallint(6) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `isturn` tinyint(1) DEFAULT '1' COMMENT '是否提交',
  `errtype` varchar(10) DEFAULT NULL COMMENT '异常类型',
  `dt` date DEFAULT NULL COMMENT '异常日期',
  `ytime` varchar(10) DEFAULT NULL COMMENT '应打卡时间',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='打卡异常申请';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_kqinfo`
--

CREATE TABLE `xinhu_kqinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` smallint(6) DEFAULT '0',
  `uname` varchar(20) DEFAULT NULL,
  `stime` datetime DEFAULT NULL,
  `etime` datetime DEFAULT NULL,
  `kind` varchar(10) DEFAULT NULL COMMENT '类型',
  `qjkind` varchar(20) DEFAULT NULL COMMENT '请假类型',
  `content` varchar(200) DEFAULT NULL,
  `status` tinyint(1) DEFAULT '0' COMMENT '状态',
  `totals` decimal(6,1) DEFAULT '0.0' COMMENT '时间',
  `optdt` datetime DEFAULT NULL,
  `isturn` tinyint(1) DEFAULT '0' COMMENT '是否提交',
  `optname` varchar(20) DEFAULT NULL,
  `optid` smallint(6) DEFAULT '0',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `jiafee` decimal(6,2) DEFAULT '0.00' COMMENT '加班费',
  `jiatype` tinyint(1) DEFAULT '0' COMMENT '加班方式0换调休,1给加班费',
  `totday` decimal(8,2) DEFAULT '0.00' COMMENT '请假天数',
  `enddt` datetime DEFAULT NULL COMMENT '截止使用时间',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='请假条加班单';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_kqjcmd`
--

CREATE TABLE `xinhu_kqjcmd` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `snid` int(11) DEFAULT '0' COMMENT '设备ID',
  `cmd` text COMMENT '发送命令内容',
  `status` tinyint(1) DEFAULT '0' COMMENT '运行状态0待运行,1已运行,2请求中',
  `qjtime` datetime DEFAULT NULL COMMENT '请求时间',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `cjtime` datetime DEFAULT NULL COMMENT '处理时间',
  `atype` varchar(30) DEFAULT NULL COMMENT '类型',
  `others` varchar(500) DEFAULT NULL COMMENT '推送主键id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考勤机命令发送表';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_kqjsn`
--

CREATE TABLE `xinhu_kqjsn` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `num` varchar(50) NOT NULL DEFAULT '' COMMENT '设备号',
  `name` varchar(50) DEFAULT NULL COMMENT '设备名称',
  `company` varchar(50) DEFAULT NULL COMMENT '公司名',
  `sort` int(11) DEFAULT '0' COMMENT '排序号',
  `optdt` datetime DEFAULT NULL,
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `deptids` varchar(4000) DEFAULT NULL COMMENT '部门ID聚合',
  `userids` text COMMENT '人员ID聚合',
  `lastdt` datetime DEFAULT NULL COMMENT '最后请求时间',
  `space` int(11) DEFAULT '0' COMMENT 'sd卡剩余空间',
  `memory` int(11) DEFAULT '0' COMMENT '剩余内存',
  `usershu` int(11) DEFAULT '0' COMMENT '人员数',
  `fingerprintshu` int(11) DEFAULT '0' COMMENT '指纹数',
  `headpicshu` int(11) DEFAULT '0' COMMENT '头像数量',
  `clockinshu` int(11) DEFAULT '0' COMMENT '打卡数',
  `picshu` int(11) DEFAULT '0' COMMENT '现场照片数',
  `romver` varchar(30) DEFAULT NULL COMMENT '系统版本',
  `appver` varchar(30) DEFAULT NULL COMMENT '应用版本',
  `model` varchar(30) DEFAULT NULL COMMENT '设备型号',
  `pinpai` tinyint(4) DEFAULT '0' COMMENT '品牌0群英,1中控',
  `snip` varchar(30) DEFAULT NULL COMMENT '分配的ip',
  `snport` varchar(10) DEFAULT NULL COMMENT '分配端口号',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考勤机设备表';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_kqjuser`
--

CREATE TABLE `xinhu_kqjuser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `snid` int(11) DEFAULT '0' COMMENT '设备ID',
  `uid` int(11) DEFAULT '0' COMMENT '用户ID',
  `fingerprint1` text COMMENT '指纹1',
  `fingerprint2` text COMMENT '指纹2',
  `headpic` varchar(100) DEFAULT NULL COMMENT '头像',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考勤机上人员';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_kqout`
--

CREATE TABLE `xinhu_kqout` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` smallint(6) DEFAULT NULL,
  `applyname` varchar(30) DEFAULT NULL COMMENT '申请人姓名',
  `outtime` datetime DEFAULT NULL COMMENT '外出时间',
  `intime` datetime DEFAULT NULL COMMENT '回岗时间',
  `address` varchar(50) DEFAULT NULL COMMENT '外出地址',
  `reason` varchar(500) DEFAULT NULL COMMENT '外出事由',
  `atype` varchar(20) DEFAULT NULL COMMENT '外出类型@外出,出差',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `status` tinyint(1) DEFAULT '0' COMMENT '@0|待审核,1|审核通过,2|审核不通过',
  `isturn` tinyint(1) DEFAULT '0' COMMENT '@0|未提交,1|提交',
  `optid` int(11) DEFAULT NULL,
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `isxj` tinyint(1) DEFAULT '0' COMMENT '是否销假@0|否,1|是',
  `sicksm` varchar(500) DEFAULT NULL COMMENT '销假说明',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='外出出差';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_kqsjgz`
--

CREATE TABLE `xinhu_kqsjgz` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `sort` smallint(6) DEFAULT '0' COMMENT '排序号',
  `pid` smallint(6) DEFAULT '0' COMMENT '主',
  `stime` varchar(20) DEFAULT NULL COMMENT '开始时间',
  `etime` varchar(20) DEFAULT NULL COMMENT '结束时间',
  `qtype` tinyint(1) DEFAULT '0' COMMENT '取值类型@0|最小值,1|最大值',
  `iskt` tinyint(1) DEFAULT '0' COMMENT '是否跨天',
  `iskq` tinyint(1) DEFAULT '1' COMMENT '是否需要考勤',
  `isxx` tinyint(1) DEFAULT '0' COMMENT '是否休息断',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考勤时间规则';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_kqxxsj`
--

CREATE TABLE `xinhu_kqxxsj` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `dt` date DEFAULT NULL,
  `pid` smallint(6) DEFAULT '0',
  `types` tinyint(1) DEFAULT '0' COMMENT '0休息日,1工作日',
  `uid` int(11) DEFAULT '0' COMMENT '对应用户/部门Id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='休息时间规则';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_location`
--

CREATE TABLE `xinhu_location` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user` varchar(30) DEFAULT NULL,
  `uid` int(11) DEFAULT '0',
  `agentid` varchar(20) DEFAULT NULL COMMENT '应用Id',
  `optdt` datetime DEFAULT NULL,
  `location_x` varchar(30) DEFAULT NULL COMMENT '地理位置纬度',
  `location_y` varchar(30) DEFAULT NULL COMMENT '地理位置经度 ',
  `scale` smallint(6) DEFAULT '0' COMMENT '地图缩放大小',
  `label` varchar(200) DEFAULT NULL COMMENT '地理位置',
  `msgid` varchar(50) DEFAULT NULL,
  `precisions` smallint(6) DEFAULT '0' COMMENT '地理位置精度',
  `types` tinyint(4) DEFAULT '0' COMMENT '0普通,1事件,2企业微信定位',
  `content` varchar(50) DEFAULT NULL COMMENT '说明',
  `imgpath` varchar(100) DEFAULT NULL COMMENT '相关图片',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='外勤定位';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_log`
--

CREATE TABLE `xinhu_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `types` varchar(50) DEFAULT NULL COMMENT '类型',
  `optid` int(11) DEFAULT NULL COMMENT '操作人id',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  `optdt` datetime DEFAULT NULL COMMENT '添加时间',
  `ip` varchar(100) DEFAULT NULL COMMENT 'IP地址',
  `web` varchar(100) DEFAULT NULL COMMENT '浏览器',
  `device` varchar(50) DEFAULT NULL,
  `level` tinyint(1) DEFAULT '0' COMMENT '日志级别0普通,1提示,2错误',
  `url` varchar(500) DEFAULT NULL,
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统日志';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_logintoken`
--

CREATE TABLE `xinhu_logintoken` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT '0' COMMENT '用户ID',
  `name` varchar(20) DEFAULT NULL,
  `token` varchar(50) DEFAULT NULL,
  `adddt` datetime DEFAULT NULL,
  `moddt` datetime DEFAULT NULL,
  `cfrom` varchar(10) DEFAULT NULL,
  `device` varchar(50) DEFAULT NULL,
  `ip` varchar(500) DEFAULT NULL,
  `web` varchar(100) DEFAULT NULL,
  `online` tinyint(1) DEFAULT '1',
  `ispush` tinyint(1) DEFAULT '0' COMMENT '是否可推送',
  `pushtoken` varchar(200) DEFAULT NULL COMMENT '推送token',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统登录token';

BEGIN;
COMMIT;

-- 表的结构 `xinhu_meet`
--

CREATE TABLE `xinhu_meet` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hyname` varchar(20) DEFAULT NULL COMMENT '会议室名称',
  `title` varchar(100) DEFAULT NULL COMMENT '主题',
  `startdt` varchar(50) DEFAULT NULL COMMENT '开始时间',
  `enddt` varchar(50) DEFAULT NULL COMMENT '结束时间',
  `state` tinyint(1) DEFAULT '0' COMMENT '会议状态@0|正常,1|会议中,2|结束,3|取消',
  `status` tinyint(1) DEFAULT '0',
  `types` tinyint(1) DEFAULT '0' COMMENT '类型@0|普通,1|固定,2|纪要',
  `joinid` varchar(200) DEFAULT NULL,
  `joinname` varchar(500) DEFAULT NULL COMMENT '参加人员',
  `mid` int(11) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '发起人',
  `rate` varchar(100) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` int(11) DEFAULT '0',
  `contents` varchar(500) DEFAULT NULL COMMENT '说明',
  `cancelreason` varchar(200) DEFAULT NULL,
  `jyid` varchar(100) DEFAULT NULL COMMENT '会议纪要人id',
  `jyname` varchar(100) DEFAULT NULL COMMENT '会议纪要人',
  `content` varchar(4000) DEFAULT NULL COMMENT '会议纪要内容',
  `issms` tinyint(1) DEFAULT '0' COMMENT '是否短信通知',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  `zcrenid` varchar(50) DEFAULT NULL,
  `zcren` varchar(50) DEFAULT NULL COMMENT '主持人',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会议';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_menu`
--

CREATE TABLE `xinhu_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '菜单名',
  `pid` smallint(6) DEFAULT '0' COMMENT '上级id',
  `sorts` smallint(6) DEFAULT '0' COMMENT '排序',
  `url` varchar(500) DEFAULT NULL,
  `icons` varchar(50) DEFAULT NULL,
  `optdt` datetime DEFAULT NULL,
  `num` varchar(50) DEFAULT NULL COMMENT '编号',
  `ispir` tinyint(1) DEFAULT '1' COMMENT '1验证',
  `status` tinyint(1) DEFAULT '1' COMMENT '1启用',
  `color` varchar(10) DEFAULT NULL,
  `ishs` tinyint(1) DEFAULT '0' COMMENT '是否在首页显示',
  `iszm` tinyint(1) DEFAULT '0' COMMENT '是否为桌面版图标',
  `ctype` smallint(6) DEFAULT '0' COMMENT '菜单类型',
  `types` tinyint(1) DEFAULT '0',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统菜单';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_news`
--

CREATE TABLE `xinhu_news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) DEFAULT NULL,
  `optdt` datetime DEFAULT NULL,
  `typename` varchar(20) DEFAULT NULL,
  `content` text,
  `url` varchar(200) DEFAULT NULL,
  `receid` varchar(2000) DEFAULT NULL COMMENT '接收人Id',
  `recename` varchar(4000) DEFAULT NULL,
  `optid` int(11) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL,
  `enddt` date DEFAULT NULL COMMENT '截止时间',
  `startdt` date DEFAULT NULL COMMENT '开始时间',
  `zuozhe` varchar(30) DEFAULT NULL COMMENT '发布者',
  `indate` date DEFAULT NULL COMMENT '日期',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `fengmian` varchar(100) DEFAULT NULL COMMENT '封面图片',
  `mintou` smallint(6) DEFAULT '0' COMMENT '至少投票',
  `maxtou` smallint(6) DEFAULT '0' COMMENT '最多投投票0不限制',
  `issms` tinyint(1) DEFAULT '0' COMMENT '是否发短信',
  `istop` tinyint(1) DEFAULT '0' COMMENT '排序号越大越靠前',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  `appxs` tinyint(1) DEFAULT '0' COMMENT 'app首页显示',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='新闻资讯';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_official`
--

CREATE TABLE `xinhu_official` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` smallint(6) DEFAULT '0',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `titles` varchar(255) DEFAULT NULL COMMENT '副标题',
  `types` varchar(10) DEFAULT NULL COMMENT '类型',
  `type` tinyint(1) DEFAULT '0' COMMENT '1收文单,0发文单',
  `grade` varchar(10) DEFAULT NULL COMMENT '等级',
  `optname` varchar(20) DEFAULT NULL,
  `optdt` datetime DEFAULT NULL,
  `status` tinyint(1) DEFAULT '0' COMMENT '状态',
  `contents` text COMMENT '内容',
  `receid` varchar(200) DEFAULT NULL COMMENT '来源',
  `recename` varchar(200) DEFAULT NULL COMMENT '发给',
  `applydt` date DEFAULT NULL COMMENT '日期',
  `num` varchar(30) DEFAULT NULL COMMENT '编号',
  `optid` smallint(6) DEFAULT '0',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `isturn` tinyint(1) DEFAULT '1' COMMENT '是否提交',
  `filecontid` varchar(30) DEFAULT NULL COMMENT '正文文件Id',
  `zinum` varchar(30) DEFAULT NULL COMMENT '发文字号',
  `unitname` varchar(200) DEFAULT NULL COMMENT '主送单位',
  `unitsame` varchar(200) DEFAULT NULL COMMENT '发文单位',
  `miji` varchar(50) DEFAULT NULL COMMENT '公文密级',
  `laidt` date DEFAULT NULL COMMENT '来文日期',
  `chaoname` varchar(200) DEFAULT NULL COMMENT '抄送单位',
  `zuncheng` varchar(200) DEFAULT NULL COMMENT '正文上称呼',
  `thid` int(11) DEFAULT '0' COMMENT '对应officialhong里id',
  `yzid` int(11) DEFAULT '0' COMMENT '对应印章sealapl里Id',
  `ffid` int(11) DEFAULT '0' COMMENT '对应分发表officialfa的Id',
  `enddt` date DEFAULT NULL COMMENT '截止日期',
  `startdt` date DEFAULT NULL COMMENT '查阅日期',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  `ffdt` date DEFAULT NULL COMMENT '分发日期',
  `pdfid` int(11) DEFAULT '0' COMMENT '生成pdf文件id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='公文';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_option`
--

CREATE TABLE `xinhu_option` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `types` int(11) DEFAULT '0' COMMENT '选项类型',
  `pid` int(11) DEFAULT NULL,
  `num` varchar(50) DEFAULT NULL COMMENT '编号',
  `avalue` varchar(2000) DEFAULT NULL COMMENT '对应值',
  `sort` smallint(6) DEFAULT '0' COMMENT '排序号',
  `valuess` varchar(50) DEFAULT NULL,
  `avalid` tinyint(1) DEFAULT '1',
  `optdt` datetime DEFAULT NULL,
  `optid` smallint(6) DEFAULT '0',
  `receid` varchar(300) DEFAULT NULL,
  `recename` varchar(300) DEFAULT NULL,
  `content` varchar(200) DEFAULT NULL COMMENT '说明',
  `comid` smallint(6) DEFAULT '0' COMMENT '所属单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统选项';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_project`
--

CREATE TABLE `xinhu_project` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` smallint(6) DEFAULT '0',
  `types` varchar(20) DEFAULT NULL COMMENT '项目类型',
  `num` varchar(20) DEFAULT NULL COMMENT '编号',
  `status` tinyint(1) DEFAULT '0',
  `title` varchar(100) DEFAULT NULL COMMENT '项目名称',
  `startdt` datetime DEFAULT NULL COMMENT '开始时间',
  `enddt` datetime DEFAULT NULL COMMENT '预计结束时间',
  `fuze` varchar(20) DEFAULT NULL COMMENT '负责人',
  `fuzeid` varchar(50) DEFAULT NULL,
  `runuser` varchar(100) DEFAULT NULL COMMENT '执行人员',
  `runuserid` varchar(100) DEFAULT NULL,
  `progress` smallint(6) DEFAULT '0' COMMENT '进度',
  `viewuser` varchar(100) DEFAULT NULL COMMENT '授权查看',
  `viewuserid` varchar(100) DEFAULT NULL,
  `content` varchar(500) DEFAULT NULL COMMENT '说明备注',
  `optid` smallint(6) DEFAULT NULL,
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `optdt` datetime DEFAULT NULL,
  `adddt` datetime DEFAULT NULL COMMENT '添加时间',
  `sort` smallint(6) DEFAULT '0' COMMENT '排序',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='项目表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_reads`
--

CREATE TABLE `xinhu_reads` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tables` varchar(30) DEFAULT NULL,
  `mid` int(11) DEFAULT NULL,
  `optid` smallint(6) DEFAULT NULL,
  `optdt` datetime DEFAULT NULL,
  `ip` varchar(100) DEFAULT NULL,
  `web` varchar(100) DEFAULT NULL,
  `adddt` datetime DEFAULT NULL COMMENT '第一次浏览',
  `stotal` smallint(6) DEFAULT '1' COMMENT '流程次数',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='单据浏览记录表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_receipt`
--

CREATE TABLE `xinhu_receipt` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `modenum` varchar(30) DEFAULT '0' COMMENT '对应模块编号',
  `modename` varchar(30) DEFAULT NULL COMMENT '模块名称',
  `tables` varchar(30) DEFAULT NULL COMMENT '对应主表',
  `mid` int(11) DEFAULT '0' COMMENT '主表Id',
  `uid` int(11) DEFAULT '0' COMMENT '对应人员',
  `receid` varchar(4000) DEFAULT NULL COMMENT '发送给',
  `recename` varchar(200) DEFAULT NULL,
  `receids` varchar(4000) DEFAULT NULL COMMENT '已确认人员Id',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `content` varchar(500) DEFAULT NULL COMMENT '内容',
  `ushuz` int(11) DEFAULT '0' COMMENT '总人数',
  `ushuy` int(11) DEFAULT '0' COMMENT '已确认',
  `status` tinyint(1) DEFAULT '1',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='回执确认表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_repair`
--

CREATE TABLE `xinhu_repair` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` smallint(6) DEFAULT '0',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` smallint(6) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `isturn` tinyint(1) DEFAULT '1' COMMENT '是否提交',
  `assetm` varchar(100) DEFAULT NULL COMMENT '报修资产',
  `reason` varchar(500) DEFAULT NULL COMMENT '保修原因',
  `reasons` varchar(500) DEFAULT NULL COMMENT '实际原因',
  `iswx` tinyint(1) DEFAULT '0' COMMENT '需要外修',
  `money` decimal(8,2) DEFAULT '0.00' COMMENT '维修金额',
  `wxname` varchar(50) DEFAULT NULL COMMENT '维修人员',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='维修报修';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_reward`
--

CREATE TABLE `xinhu_reward` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` smallint(6) DEFAULT '0',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` smallint(6) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `isturn` tinyint(1) DEFAULT '1' COMMENT '是否提交',
  `object` varchar(30) DEFAULT NULL COMMENT '奖惩对象',
  `objectid` smallint(6) DEFAULT '0',
  `types` tinyint(1) DEFAULT '0' COMMENT '奖惩类型0奖励,1处罚',
  `result` varchar(50) DEFAULT NULL COMMENT '奖惩结果',
  `money` mediumint(6) DEFAULT NULL COMMENT '奖惩金额',
  `happendt` datetime DEFAULT NULL COMMENT '发生时间',
  `hapaddress` varchar(50) DEFAULT NULL COMMENT '发生地点',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='奖惩';

--
-- 表的结构 `xinhu_scheduld`
--

CREATE TABLE `xinhu_scheduld` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  `uid` int(11) DEFAULT '0',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` int(11) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `isturn` tinyint(1) DEFAULT '1' COMMENT '是否提交',
  `schid` int(11) DEFAULT '0' COMMENT '日程的id',
  `receid` varchar(500) DEFAULT NULL,
  `recename` varchar(500) DEFAULT NULL COMMENT '提醒给',
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `startdt` datetime DEFAULT NULL COMMENT '日程时间',
  `distid` int(11) DEFAULT '0' COMMENT '分配给人',
  `distren` varchar(50) DEFAULT NULL COMMENT '待办人',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='日程待办';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_schedule`
--

CREATE TABLE `xinhu_schedule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL COMMENT '标题',
  `startdt` datetime DEFAULT NULL,
  `enddt` datetime DEFAULT NULL,
  `uid` smallint(6) DEFAULT NULL COMMENT '用户Id',
  `optdt` datetime DEFAULT NULL,
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `mid` int(11) DEFAULT '0' COMMENT '主Id',
  `ratecont` varchar(500) DEFAULT NULL COMMENT '频率',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `rate` varchar(5) DEFAULT NULL,
  `rateval` varchar(50) DEFAULT NULL,
  `txsj` tinyint(1) DEFAULT '0' COMMENT '是否提醒',
  `status` tinyint(1) DEFAULT '1',
  `receid` varchar(100) DEFAULT NULL,
  `recename` varchar(100) DEFAULT NULL COMMENT '提醒给',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  `isdai` tinyint(1) DEFAULT '0' COMMENT '是否创建日程待办',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='日程';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_seal`
--

CREATE TABLE `xinhu_seal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '印章名称',
  `types` varchar(10) DEFAULT NULL COMMENT '印章类型',
  `bgname` varchar(50) DEFAULT NULL COMMENT '保管人',
  `bgid` varchar(50) DEFAULT NULL,
  `optdt` datetime DEFAULT NULL,
  `sort` smallint(6) DEFAULT '0' COMMENT '排序号',
  `sealimg` varchar(100) DEFAULT NULL COMMENT '对应印章图片',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `startdt` date DEFAULT NULL COMMENT '签发日期',
  `enddt` date DEFAULT NULL COMMENT '截止日期',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id'
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='印章表';

BEGIN;
COMMIT;

-- 表的结构 `xinhu_sealapl`
--

CREATE TABLE `xinhu_sealapl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` smallint(6) DEFAULT '0',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` smallint(6) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `isturn` tinyint(1) DEFAULT '1' COMMENT '是否提交',
  `sealid` varchar(100) DEFAULT '' COMMENT '印章id',
  `sealname` varchar(200) DEFAULT NULL COMMENT '印章名称',
  `isout` tinyint(1) DEFAULT '0' COMMENT '使用方式',
  `mknum` varchar(50) DEFAULT NULL COMMENT '关联模块单据',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='印章申请使用表';

--
-- 表的结构 `xinhu_sjoin`
--

CREATE TABLE `xinhu_sjoin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(10) DEFAULT NULL COMMENT '类型',
  `mid` int(11) DEFAULT NULL,
  `sid` int(11) DEFAULT NULL,
  `indate` datetime DEFAULT NULL,
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后台菜单权限';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_subscribe`
--

CREATE TABLE `xinhu_subscribe` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL COMMENT '订阅标题',
  `cont` varchar(200) DEFAULT NULL COMMENT '订阅时提醒内容',
  `content` varchar(100) DEFAULT NULL COMMENT '订阅说明',
  `optid` int(11) DEFAULT '0' COMMENT '操作人ID',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `optdt` datetime DEFAULT NULL,
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `suburl` varchar(1000) DEFAULT NULL COMMENT '订阅地址',
  `suburlpost` varchar(4000) DEFAULT NULL COMMENT '订阅地址post参数',
  `lastdt` datetime DEFAULT NULL COMMENT '最后运行时间',
  `shateid` varchar(300) DEFAULT NULL,
  `shatename` varchar(300) DEFAULT NULL COMMENT '共享给',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订阅管理表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_subscribeinfo`
--

CREATE TABLE `xinhu_subscribeinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` int(11) DEFAULT '0' COMMENT '对应定ID',
  `title` varchar(50) DEFAULT NULL COMMENT '标题',
  `cont` varchar(200) DEFAULT NULL COMMENT '内容',
  `optdt` datetime DEFAULT NULL,
  `filepath` varchar(200) DEFAULT NULL COMMENT '文件路径',
  `receid` varchar(4000) DEFAULT NULL COMMENT '发送给',
  `recename` varchar(200) DEFAULT NULL COMMENT '对应人',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订阅内容信息';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_task`
--

CREATE TABLE `xinhu_task` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `fenlei` varchar(10) DEFAULT NULL COMMENT '类型分类',
  `url` varchar(100) DEFAULT NULL COMMENT '运行地址',
  `type` varchar(100) DEFAULT NULL,
  `time` varchar(200) DEFAULT NULL,
  `ratecont` varchar(500) DEFAULT NULL,
  `status` tinyint(1) DEFAULT '1' COMMENT '是否启用',
  `state` tinyint(1) DEFAULT '0' COMMENT '最后状态',
  `lastdt` datetime DEFAULT NULL,
  `optdt` datetime DEFAULT NULL,
  `sort` smallint(6) DEFAULT '0',
  `startdt` datetime DEFAULT NULL COMMENT '开始时间',
  `lastcont` varchar(500) DEFAULT NULL,
  `content` varchar(200) DEFAULT NULL COMMENT '说明',
  `todoid` varchar(200) DEFAULT NULL,
  `todoname` varchar(200) DEFAULT NULL,
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='计划任务';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_todo`
--

CREATE TABLE `xinhu_todo` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT,
  `uid` smallint(6) DEFAULT NULL,
  `title` varchar(50) DEFAULT NULL COMMENT '类型',
  `mess` varchar(500) DEFAULT NULL COMMENT '信息内容',
  `status` tinyint(1) DEFAULT '0' COMMENT '状态@0|未读,1|已读',
  `optdt` datetime DEFAULT NULL COMMENT '时间',
  `tables` varchar(50) DEFAULT NULL,
  `mid` int(11) DEFAULT NULL,
  `readdt` datetime DEFAULT NULL COMMENT '已读时间',
  `tododt` datetime DEFAULT NULL COMMENT '提醒时间',
  `modenum` varchar(20) DEFAULT NULL COMMENT '对应模块编号',
  `url` varchar(500) DEFAULT NULL COMMENT '相关url',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='提醒消息表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_tovoid`
--

CREATE TABLE `xinhu_tovoid` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT,
  `uid` smallint(6) DEFAULT '0',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` smallint(6) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `isturn` tinyint(1) DEFAULT '1' COMMENT '是否提交',
  `type` tinyint(1) DEFAULT '0' COMMENT '0|作废,1|删除',
  `modename` varchar(20) DEFAULT NULL COMMENT '模块',
  `modeid` smallint(6) DEFAULT '0' COMMENT '对应模块id',
  `tonum` varchar(200) DEFAULT NULL COMMENT '作废单号',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='单据申请作废表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_userinfo`
--

CREATE TABLE `xinhu_userinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `num` varchar(20) DEFAULT NULL COMMENT '编号',
  `deptname` varchar(30) DEFAULT NULL,
  `deptnames` varchar(100) DEFAULT NULL COMMENT '多部门',
  `deptallname` varchar(200) DEFAULT NULL,
  `ranking` varchar(20) DEFAULT NULL,
  `rankings` varchar(100) DEFAULT NULL COMMENT '多职位',
  `dkip` varchar(200) DEFAULT NULL,
  `dkmac` varchar(200) DEFAULT NULL,
  `state` tinyint(1) DEFAULT '0' COMMENT '状态来自userstate',
  `sex` varchar(10) DEFAULT NULL COMMENT '性别',
  `tel` varchar(50) DEFAULT NULL COMMENT '电话',
  `mobile` varchar(100) DEFAULT NULL COMMENT '手机号',
  `workdate` date DEFAULT NULL COMMENT '入职时间',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `quitdt` date DEFAULT NULL COMMENT '离职日期',
  `iskq` tinyint(1) DEFAULT '1' COMMENT '是否考勤',
  `isdwdk` tinyint(1) DEFAULT '0' COMMENT '是否定位打卡',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `xueli` varchar(20) DEFAULT NULL,
  `birtype` tinyint(1) DEFAULT '0' COMMENT '0阳历1农历',
  `minzu` varchar(20) DEFAULT NULL COMMENT '民族',
  `hunyin` varchar(10) DEFAULT NULL COMMENT '婚姻',
  `jiguan` varchar(20) DEFAULT NULL COMMENT '籍贯',
  `nowdizhi` varchar(50) DEFAULT NULL COMMENT '现住址',
  `housedizhi` varchar(50) DEFAULT NULL COMMENT '家庭地址',
  `syenddt` date DEFAULT NULL COMMENT '试用期到',
  `positivedt` date DEFAULT NULL COMMENT '转正日期',
  `bankname` varchar(50) DEFAULT NULL COMMENT '开户行',
  `banknum` varchar(30) DEFAULT NULL COMMENT '工资卡帐号',
  `zhaopian` varchar(100) DEFAULT NULL COMMENT '照片',
  `idnum` varchar(30) DEFAULT NULL COMMENT '身份证号',
  `spareman` varchar(30) DEFAULT NULL COMMENT '备用联系人',
  `sparetel` varchar(50) DEFAULT NULL COMMENT '备用联系人电话',
  `isdaily` tinyint(4) DEFAULT '1' COMMENT '是否需要写日报',
  `companyid` int(11) DEFAULT '0' COMMENT '所在公司单位Id',
  `finger` varchar(20) DEFAULT NULL COMMENT '关联考勤机人员编号',
  `dwid` varchar(50) DEFAULT NULL COMMENT '加入单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户档案表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_userinfos`
--

CREATE TABLE `xinhu_userinfos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` smallint(6) DEFAULT '0' COMMENT '对应主表userinfo.id',
  `sort` smallint(6) DEFAULT '0' COMMENT '排序号',
  `startdt` date DEFAULT NULL COMMENT '开始日期',
  `enddt` date DEFAULT NULL COMMENT '截止日期',
  `rank` varchar(50) DEFAULT NULL COMMENT '职位',
  `unitname` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `sslx` tinyint(1) DEFAULT '0' COMMENT '0工作经历,1教育经历',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人员档案子表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_userract`
--

CREATE TABLE `xinhu_userract` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `startdt` date DEFAULT NULL COMMENT '开始日期',
  `enddt` date DEFAULT NULL COMMENT '截止日期',
  `uid` smallint(6) DEFAULT '0',
  `sort` smallint(6) DEFAULT '0',
  `optdt` datetime DEFAULT NULL,
  `content` varchar(500) DEFAULT NULL,
  `httype` varchar(30) DEFAULT NULL COMMENT '合同类型',
  `state` tinyint(1) DEFAULT '0' COMMENT '0|待执行,1|生效中,2|已终止,3|已过期',
  `tqenddt` date DEFAULT NULL COMMENT '提前终止',
  `company` varchar(50) DEFAULT NULL COMMENT '签署公司',
  `uname` varchar(20) DEFAULT NULL COMMENT '签署人',
  `companyid` smallint(6) DEFAULT '0' COMMENT '签署公司Id',
  `htfid` int(11) DEFAULT '0' COMMENT '合同文件',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户合同表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_userzheng`
--

CREATE TABLE `xinhu_userzheng` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  `uid` int(11) DEFAULT '0',
  `uname` varchar(50) DEFAULT NULL COMMENT '所属人',
  `mingc` varchar(50) DEFAULT NULL COMMENT '证件名称',
  `numc` varchar(50) DEFAULT NULL COMMENT '证书编号',
  `sdt` date DEFAULT NULL COMMENT '取得时间',
  `edt` date DEFAULT NULL COMMENT '到期时间',
  `fengmian` varchar(100) DEFAULT NULL COMMENT '相关图标',
  `optid` int(11) DEFAULT '0',
  `optdt` datetime DEFAULT NULL,
  `optname` varchar(50) DEFAULT NULL,
  `content` varchar(2000) DEFAULT NULL COMMENT '说明',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_vcard`
--

CREATE TABLE `xinhu_vcard` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `mobile` varchar(100) DEFAULT NULL COMMENT '手机号',
  `optdt` datetime DEFAULT NULL,
  `uid` smallint(6) DEFAULT '0',
  `tel` varchar(50) DEFAULT NULL COMMENT '电话',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `gname` varchar(20) DEFAULT NULL COMMENT '所在组名',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `address` varchar(100) DEFAULT NULL COMMENT '地址',
  `sort` smallint(6) DEFAULT '0' COMMENT '排序号',
  `unitname` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `sex` varchar(5) DEFAULT NULL COMMENT '性别',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='个人通讯录';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_wenjuan`
--

CREATE TABLE `xinhu_wenjuan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `recename` varchar(1000) DEFAULT NULL COMMENT '针对对象',
  `receid` varchar(1000) DEFAULT NULL COMMENT '针对对象的ID',
  `startdt` date DEFAULT NULL COMMENT '开始日期',
  `enddt` date DEFAULT NULL COMMENT '截止日期',
  `uid` int(11) DEFAULT '0',
  `optid` int(11) DEFAULT '0' COMMENT '创建人id',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optname` varchar(50) DEFAULT NULL COMMENT '操作人',
  `content` varchar(2000) DEFAULT NULL COMMENT '说明',
  `dauserids` varchar(4000) DEFAULT NULL COMMENT '已提交人id',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='问卷表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_wenjuat`
--

CREATE TABLE `xinhu_wenjuat` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` int(11) DEFAULT '0' COMMENT '对应主表wenjuan.id',
  `sort` int(11) DEFAULT '0' COMMENT '排序号',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  `itemname` varchar(100) DEFAULT NULL,
  `itemcont` varchar(200) DEFAULT NULL COMMENT '项说明',
  `itemtype` smallint(6) DEFAULT '0' COMMENT '项类型',
  `itema` varchar(100) DEFAULT NULL COMMENT '选项A',
  `itemb` varchar(100) DEFAULT NULL COMMENT '选项B',
  `itemc` varchar(100) DEFAULT NULL COMMENT '选项C',
  `itemd` varchar(100) DEFAULT NULL COMMENT '选项D',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='问卷表子表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_wenjuau`
--

CREATE TABLE `xinhu_wenjuau` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` int(11) DEFAULT '0' COMMENT '对应主表wenjuan.id',
  `sid` int(11) DEFAULT '0' COMMENT '子表id',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  `conts` varchar(500) DEFAULT NULL,
  `optid` int(11) DEFAULT '0',
  `optdt` datetime DEFAULT NULL,
  `rand` int(11) DEFAULT '0' COMMENT '批次',
  `optname` varchar(50) DEFAULT NULL,
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='问卷表子表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_worc`
--

CREATE TABLE `xinhu_worc` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL COMMENT '文档分区名称',
  `recename` varchar(500) DEFAULT NULL COMMENT '可查看人员',
  `receid` varchar(500) DEFAULT NULL,
  `sort` smallint(6) DEFAULT '0' COMMENT '排序号',
  `guanname` varchar(500) DEFAULT NULL COMMENT '管理人员',
  `guanid` varchar(500) DEFAULT NULL,
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `uid` int(11) DEFAULT '0' COMMENT '所属用户',
  `optname` varchar(30) DEFAULT NULL COMMENT '创建人',
  `uptype` varchar(100) DEFAULT NULL COMMENT '限制上传类型',
  `upuserid` varchar(500) DEFAULT '' COMMENT '可上传人员ID',
  `upuser` varchar(500) DEFAULT '' COMMENT '可上传人员',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文档分区表';

--
-- 表的结构 `xinhu_word`
--

CREATE TABLE `xinhu_word` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `optid` int(11) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL,
  `fileid` int(11) DEFAULT '0',
  `shateid` varchar(200) DEFAULT NULL,
  `shate` varchar(200) DEFAULT NULL COMMENT '分享给我的',
  `optdt` datetime DEFAULT NULL,
  `typeid` int(11) DEFAULT '0' COMMENT '对应类型',
  `cid` int(11) DEFAULT '0' COMMENT '文档分区ID',
  `types` tinyint(1) DEFAULT '0' COMMENT '0文件,1文件夹',
  `sort` int(11) DEFAULT '0' COMMENT '排序号',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文档表';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_wordeil`
--

CREATE TABLE `xinhu_wordeil` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT '0',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` smallint(6) DEFAULT '0',
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `content` varchar(500) DEFAULT NULL COMMENT '说明',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `isturn` tinyint(1) DEFAULT '1' COMMENT '是否提交',
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `filecontid` varchar(100) DEFAULT NULL COMMENT '相关文件',
  `qianname` varchar(50) DEFAULT NULL COMMENT '签收人',
  `qiannameid` varchar(50) DEFAULT NULL COMMENT '签收人的ID',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文件传送';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_wordxie`
--

CREATE TABLE `xinhu_wordxie` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL COMMENT '文档名称',
  `fenlei` varchar(50) DEFAULT NULL COMMENT '分类',
  `wtype` varchar(20) DEFAULT NULL COMMENT '文档类型',
  `optname` varchar(20) DEFAULT NULL,
  `optid` int(11) DEFAULT '0',
  `optdt` datetime DEFAULT NULL,
  `xiename` varchar(500) DEFAULT NULL COMMENT '协作人',
  `xienameid` varchar(500) DEFAULT NULL,
  `recename` varchar(500) DEFAULT NULL COMMENT '可查看人',
  `receid` varchar(500) DEFAULT NULL,
  `status` tinyint(1) DEFAULT '1',
  `fileid` int(11) DEFAULT '0',
  `content` varchar(2000) DEFAULT NULL COMMENT '说明',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  `isgk` tinyint(4) DEFAULT '0' COMMENT '是否可让他人选择',
  `tplvar` varchar(500) DEFAULT NULL COMMENT '模版中变量',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文档协作';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_work`
--

CREATE TABLE `xinhu_work` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `num` varchar(30) DEFAULT NULL,
  `title` varchar(200) DEFAULT NULL COMMENT '标题',
  `types` varchar(20) DEFAULT NULL COMMENT '任务类型',
  `grade` varchar(10) DEFAULT NULL COMMENT '任务等级',
  `distid` varchar(50) DEFAULT NULL,
  `dist` varchar(50) DEFAULT NULL COMMENT '分配给',
  `content` varchar(4000) DEFAULT NULL COMMENT '说明',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `optid` int(11) DEFAULT NULL,
  `optname` varchar(20) DEFAULT NULL COMMENT '操作人',
  `startdt` datetime DEFAULT NULL COMMENT '开始时间',
  `enddt` datetime DEFAULT NULL COMMENT '结束时间',
  `state` tinyint(1) DEFAULT '0' COMMENT '状态',
  `txdt` datetime DEFAULT NULL,
  `fen` smallint(6) DEFAULT '0' COMMENT '分值',
  `status` tinyint(1) DEFAULT '1',
  `projectid` smallint(6) DEFAULT '0' COMMENT '对应项目Id',
  `ddid` varchar(50) DEFAULT NULL,
  `ddname` varchar(50) DEFAULT NULL COMMENT '督导人员，不填默认上级',
  `score` smallint(6) DEFAULT '0' COMMENT '任务分数',
  `mark` smallint(6) DEFAULT '0' COMMENT '得分',
  `uid` smallint(6) DEFAULT '0',
  `applydt` date DEFAULT NULL COMMENT '申请日期',
  `isturn` tinyint(1) DEFAULT '1' COMMENT '是否提交',
  `comid` smallint(6) DEFAULT '0' COMMENT '对应单位id',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='任务';

BEGIN;
COMMIT;

--
-- 表的结构 `xinhu_wotpl`
--

CREATE TABLE `xinhu_wotpl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `template_id` varchar(100) DEFAULT NULL COMMENT '模版消息id',
  `title` varchar(50) DEFAULT NULL COMMENT '模板标题',
  `primary_industry` varchar(50) DEFAULT NULL COMMENT '模板所属行业的一级行业',
  `deputy_industry` varchar(50) DEFAULT NULL COMMENT '模板所属行业的二级行业',
  `content` varchar(1000) DEFAULT NULL COMMENT '模板内容',
  `example` varchar(500) DEFAULT NULL COMMENT '模板示例',
  `modename` varchar(50) DEFAULT NULL COMMENT '使用名称',
  `modeparams` varchar(500) DEFAULT NULL COMMENT '参数设置',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='微信公众号消息模版';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_wouser`
--

CREATE TABLE `xinhu_wouser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT '0' COMMENT '绑定用户Id',
  `openid` varchar(100) DEFAULT '微信openid',
  `nickname` varchar(30) DEFAULT NULL COMMENT '微信昵称',
  `sex` tinyint(1) DEFAULT '1' COMMENT '性别1男2女0未知',
  `province` varchar(30) DEFAULT NULL COMMENT '省份',
  `city` varchar(30) DEFAULT NULL COMMENT '城市',
  `country` varchar(30) DEFAULT NULL COMMENT '国家',
  `headimgurl` varchar(300) DEFAULT NULL COMMENT '微信头像',
  `adddt` datetime DEFAULT NULL COMMENT '添加时间',
  `optdt` datetime DEFAULT NULL COMMENT '操作时间',
  `ip` varchar(100) DEFAULT NULL COMMENT 'IP',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='微信用户信息表';

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_wxtx_renlian`
--

CREATE TABLE `xinhu_wxtx_renlian` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `personname` varchar(50) DEFAULT NULL,
  `personid` varchar(100) NOT NULL DEFAULT '' COMMENT '人员id',
  `gender` tinyint(1) DEFAULT NULL COMMENT '性别',
  `faceids` varchar(500) DEFAULT NULL COMMENT '包含的人脸照片列表',
  `status` tinyint(1) DEFAULT '1' COMMENT '是否启用',
  `uid` int(11) DEFAULT '0' COMMENT '关联用户ID',
  `imgurl` varchar(500) DEFAULT NULL COMMENT '人脸图片',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

BEGIN;
COMMIT;

-- --------------------------------------------------------

--
-- 表的结构 `xinhu_zreim_user`
--

CREATE TABLE `xinhu_zreim_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user` varchar(50) NOT NULL DEFAULT '',
  `name` varchar(20) DEFAULT NULL,
  `position` varchar(20) DEFAULT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `status` tinyint(1) DEFAULT '0' COMMENT '状态@1|已关注,2|已冻结,0|未关注',
  `deptid` int(11) DEFAULT '0' COMMENT '部门id',
  `face` varchar(200) DEFAULT NULL COMMENT '头像',
  `tel` varchar(50) DEFAULT NULL,
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='REIM即时通讯平台用户';

BEGIN;
COMMIT;