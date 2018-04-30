package me.cathub.change.admin.brandquotient.web.controller.upms;

import me.cathub.change.api.rpc.server.upms.PermissionRpcServer;
import me.cathub.change.common.base.BaseControllerImpl;
import me.cathub.change.upms.bean.Permission;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 权限模块 - 权限操作
 */
@Controller
@RequestMapping("/permission")
public class PermissionController extends BaseControllerImpl<Permission, PermissionRpcServer> {

}