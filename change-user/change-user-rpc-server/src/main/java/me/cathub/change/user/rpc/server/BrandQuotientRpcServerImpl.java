package me.cathub.change.user.rpc.server;

import me.cathub.change.api.dao.user.BrandQuotientDao;
import me.cathub.change.api.rpc.server.upms.RoleRpcServer;
import me.cathub.change.api.rpc.server.user.BrandQuotientRpcServer;
import me.cathub.change.api.rpc.server.user.CompanyRpcServer;
import me.cathub.change.common.base.BaseRpcServerImpl;
import me.cathub.change.common.bean.upms.Role;
import me.cathub.change.common.bean.user.BrandQuotient;
import me.cathub.change.common.bean.user.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BrandQuotientRpcServerImpl extends BaseRpcServerImpl<BrandQuotient, BrandQuotientDao> implements BrandQuotientRpcServer {

    @Autowired
    private CompanyRpcServer companyRpcServer;

    @Autowired
    private RoleRpcServer roleRpcServer;

    @Override
    public BrandQuotient selectByName(String name, int tableIndex, boolean flag) throws Exception {
        if (flag)
            return dao.selectByName(name, tableIndex);
        else
            return fill(dao.selectByName(name, tableIndex));
    }

    @Override
    public BrandQuotient selectByCompanyId(long company_id, int tableIndex, boolean flag) {
        if (flag)
            return dao.selectByCompanyId(company_id, tableIndex);
        else
            return fill(dao.selectByCompanyId(company_id, tableIndex));
    }

    @Override
    public BrandQuotient login(BrandQuotient bean) throws Exception {
        return dao.login(bean);
    }

    @Override
    public BrandQuotient fill(BrandQuotient bean) {
        try {
            Company company = companyRpcServer.select(new Company(bean.getCompany_id()), true);
            Role role = roleRpcServer.select(new Role(bean.getRole_id()), true);

            bean.setCompany(company);
            bean.setRole(role);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }
}
