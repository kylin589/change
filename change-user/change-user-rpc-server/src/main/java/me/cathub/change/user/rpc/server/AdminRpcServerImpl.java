package me.cathub.change.user.rpc.server;

import me.cathub.change.api.dao.user.AdminDao;
import me.cathub.change.api.rpc.server.upms.RoleRpcServer;
import me.cathub.change.api.rpc.server.user.AdminRpcServer;
import me.cathub.change.common.base.BaseRpcServerImpl;
import me.cathub.change.common.bean.upms.Role;
import me.cathub.change.common.bean.user.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminRpcServerImpl extends BaseRpcServerImpl<Admin, AdminDao> implements AdminRpcServer {

    @Autowired
    private RoleRpcServer roleRpcServer;

    @Override
    public Admin selectByName(String name, int tableIndex, boolean flag) throws Exception {
        if (flag)
            return dao.selectByName(name, tableIndex);
        else
            return dao.selectByName(name, tableIndex);
    }

    @Override
    public Admin fill(Admin bean) {
        try {
            Role role = roleRpcServer.select(new Role(bean.getRole_id()), true);

            bean.setRole(role);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }
}
