package me.cathub.change.storehouse.dao;

import com.github.pagehelper.PageHelper;
import me.cathub.change.api.dao.storehouse.StorehouseDao;
import me.cathub.change.common.base.BaseCrudMyBatisImpl;
import me.cathub.change.storehouse.bean.Storehouse;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StorehouseDaoImpl extends BaseCrudMyBatisImpl<Storehouse> implements StorehouseDao {

    @Override
    public boolean insert(Storehouse bean) throws Exception {
        return insert(NAME_SPACE, bean);
    }

    @Override
    public boolean deleteL(Storehouse bean) throws Exception {
        return deleteL(NAME_SPACE, bean);
    }

    @Override
    public boolean restore(Storehouse bean) throws Exception {
        return restore(NAME_SPACE, bean);
    }

    @Override
    public boolean deleteP(Storehouse bean) throws Exception {
        return deleteP(NAME_SPACE, bean);
    }

    @Override
    public boolean update(Storehouse bean) throws Exception {
        return update(NAME_SPACE, bean);
    }

    @Override
    public Storehouse select(Storehouse bean) throws Exception {
        return select(NAME_SPACE, bean);
    }

    @Override
    public List<Storehouse> list(int page, int count, int tableIndex) throws Exception {
        return list(NAME_SPACE, page, count, tableIndex);
    }

    @Override
    public long count(int tableIndex) throws Exception {
        return count(NAME_SPACE, tableIndex);
    }

    @Override
    public long clear(int tableIndex) throws Exception {
        return clear(NAME_SPACE, tableIndex);
    }

    @Override
    public List<Storehouse> listByStorehouseCountryId(long storehouseCountry_id, int page, int count, int tableIndex) throws Exception {
        List<Storehouse> results = null;
        try {
            Map<String, ? super Number> map = new HashMap<>();
            map.put("storehouseCountry_id", storehouseCountry_id);
            map.put("tableIndex", tableIndex);

            PageHelper.startPage(page, count);
            results = sqlSessionTemplate.selectList(NAME_SPACE + LIST_BY_STOREHOUSE_COUNTRY_ID, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return results;
    }

    @Override
    public int countByStorehouseCountryId(long storehouseCountry_id, int tableIndex) throws Exception {
        int count = 0;
        try {
            Map<String, ? super Number> map = new HashMap<>();
            map.put("storehouseCountry_id", storehouseCountry_id);
            map.put("tableIndex", tableIndex);
            count = sqlSessionTemplate.selectOne(NAME_SPACE + COUNT_BY_STOREHOUSE_COUNTRY_ID, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
}