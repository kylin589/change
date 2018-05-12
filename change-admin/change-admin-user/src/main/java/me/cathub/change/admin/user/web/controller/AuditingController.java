package me.cathub.change.admin.user.web.controller;

import me.cathub.change.api.rpc.server.user.*;
import me.cathub.change.common.base.BaseControllerImpl;
import me.cathub.change.common.bean.user.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * 用户模块下的审核crud
 */
@Controller
@RequestMapping("/auditing")
public class AuditingController extends BaseControllerImpl<Auditing, AuditingRpcServer> {

    @Autowired
    private AuditingRpcServer auditingRpcServer;
    @Autowired
    private ShopkeeperRpcServer shopkeeperRpcServer;
    @Autowired
    private BrandQuotientRpcServer brandQuotientRpcServer;
    @Autowired
    private AdminRpcServer adminRpcServer;

    @ModelAttribute
    @Override
    public void update_modelAttribute(Long id, Map<String, Object> map) throws Exception {
        if (id != null) {
            Auditing auditing = new Auditing();
            auditing.setId(id);
            auditing = auditingRpcServer.select(auditing,true);
            //关联品牌商/借卖方实体对象
            User user = null;
            if(auditing.getType() == 1){ //品牌商
                user = brandQuotientRpcServer.select(new BrandQuotient(auditing.getUser_id()),true);
            }else if(auditing.getType() == 2){ //借卖方
                user = shopkeeperRpcServer.select(new Shopkeeper(auditing.getUser_id()),true);
            }
            auditing.setUser(user);
            // 关联经手人实体对象（当前用户）
            auditing.setAdmin(adminRpcServer.select(new Admin(20152507774799872l),true)); //模拟数据
            map.put("auditing", auditing);
        }
    }

    @RequestMapping("/delete")
    @ResponseBody
    @Override
    public int deletes(@RequestParam("ids[]") long[] ids, @RequestParam(value = "del_flag", required = false) boolean del_flag) throws Exception {
        return rpcService.deletes(ids, new Auditing(), !del_flag);
    }

    @Override
    public int restores(long[] ids) throws Exception {
        return rpcService.restores(ids, new Auditing());
    }
}