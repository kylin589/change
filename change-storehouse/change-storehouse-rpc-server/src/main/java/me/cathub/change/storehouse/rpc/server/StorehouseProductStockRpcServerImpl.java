package me.cathub.change.storehouse.rpc.server;

import me.cathub.change.api.dao.storehouse.StorehouseProductStockDao;
import me.cathub.change.api.rpc.server.product.ProductRpcServer;
import me.cathub.change.api.rpc.server.storehouse.StorehouseProductStockRpcServer;
import me.cathub.change.api.rpc.server.storehouse.StorehouseRpcServer;
import me.cathub.change.common.tool.Sequence;
import me.cathub.change.product.bean.Product;
import me.cathub.change.storehouse.bean.Storehouse;
import me.cathub.change.storehouse.bean.StorehouseProductStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class StorehouseProductStockRpcServerImpl implements StorehouseProductStockRpcServer {

    @Autowired
    private StorehouseProductStockDao storehouseProductStockDao;

    @Autowired
    private ProductRpcServer productRpcServer;

    @Autowired
    private StorehouseRpcServer storehouseRpcServer;

    @Autowired
    private Sequence sequence;

    @Override
    public boolean insert(StorehouseProductStock bean) throws Exception {
        bean.setId(sequence.nextId());
        return storehouseProductStockDao.insert(bean);
    }

    @Override
    public boolean deleteL(StorehouseProductStock bean) throws Exception {
        return storehouseProductStockDao.deleteL(bean);
    }

    @Override
    public boolean restore(StorehouseProductStock bean) throws Exception {
        return storehouseProductStockDao.restore(bean);
    }

    @Override
    public boolean deleteP(StorehouseProductStock bean) throws Exception {
        return storehouseProductStockDao.deleteP(bean);
    }

    @Override
    public boolean update(StorehouseProductStock bean) throws Exception {
        return storehouseProductStockDao.update(bean);
    }

    @Override
    public StorehouseProductStock select(StorehouseProductStock bean) throws Exception {
        return fill(storehouseProductStockDao.select(bean));
    }

    @Override
    public List<StorehouseProductStock> list(int page, int count, int tableIndex) throws Exception {
        return storehouseProductStockDao.list(page, count, tableIndex).stream()
                .map(bean -> fill(bean))
                .collect(toList());
    }

    @Override
    public long count(int tableIndex) throws Exception {
        return storehouseProductStockDao.count(tableIndex);
    }

    @Override
    public long clear(int tableIndex) throws Exception {
        return storehouseProductStockDao.count(tableIndex);
    }

    @Override
    public StorehouseProductStock fill(StorehouseProductStock bean) {
        try {
            Product product = productRpcServer.select(new Product(bean.getProduct_id()));
            Storehouse storehouse = storehouseRpcServer.select(new Storehouse(bean.getStorehouse_id()));

            bean.setProduct(product);
            bean.setStorehouse(storehouse);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }

    @Override
    public StorehouseProductStock selectByStorehouseIdAndProductId(long storehouse_id, long product_id, int tableIndex) throws Exception {
        return storehouseProductStockDao.selectByStorehouseIdAndProductId(storehouse_id, product_id, tableIndex);
    }

    @Override
    public List<StorehouseProductStock> listByStorehouseId(long storehouse_id, int page, int count, int tableIndex) throws Exception {
        return storehouseProductStockDao.listByStorehouseId(storehouse_id, page, count, tableIndex);
    }

    @Override
    public int countByStorehouseId(long storehouse_id, int tableIndex) throws Exception {
        return storehouseProductStockDao.countByStorehouseId(storehouse_id, tableIndex);
    }
}
