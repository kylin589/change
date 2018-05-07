package me.cathub.change.api.dao.storehouse;

import me.cathub.change.common.base.BaseDao;
import me.cathub.change.common.base.DaoSelectByName;
import me.cathub.change.common.bean.storehouse.Storehouse;

import java.util.List;

public interface StorehouseDao extends BaseDao<Storehouse>, DaoSelectByName<Storehouse> {
    String NAME_SPACE = "Storehouse";

    String LIST_BY_STOREHOUSE_COUNTRY_ID = ".listByStorehouseCountryId";
    String COUNT_BY_STOREHOUSE_COUNTRY_ID = ".countByStorehouseCountryId";

    /**
     * 根据国家获取仓库列表
     * @param storehouseCountry_id
     * @return
     * @throws Exception
     */
    List<Storehouse> listByStorehouseCountryId(long storehouseCountry_id, int page, int count, int tableIndex) throws Exception;

    /**
     * 根据国家获取仓库数量
     * @param storehouseCountry_id
     * @return
     * @throws Exception
     */
    int countByStorehouseCountryId(long storehouseCountry_id, int tableIndex) throws Exception;
}
