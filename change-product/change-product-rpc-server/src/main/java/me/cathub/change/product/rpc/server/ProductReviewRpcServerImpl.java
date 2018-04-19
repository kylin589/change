package me.cathub.change.product.rpc.server;

import me.cathub.change.api.dao.product.ProductReviewDao;
import me.cathub.change.api.rpc.server.product.ProductReviewRpcServer;
import me.cathub.change.api.rpc.server.product.ProductRpcServer;
import me.cathub.change.product.bean.Product;
import me.cathub.change.product.bean.ProductReview;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductReviewRpcServerImpl implements ProductReviewRpcServer {

    @Autowired
    private ProductReviewDao productReviewDao;

    @Autowired
    private ProductRpcServer productRpcServer;

    @Override
    public boolean insert(ProductReview bean) throws Exception {
        return productReviewDao.insert(bean);
    }

    @Override
    public boolean deleteL(ProductReview bean) throws Exception {
        return productReviewDao.deleteL(bean);
    }

    @Override
    public boolean restore(ProductReview bean) throws Exception {
        return productReviewDao.restore(bean);
    }

    @Override
    public boolean deleteP(ProductReview bean) throws Exception {
        return productReviewDao.deleteP(bean);
    }

    @Override
    public boolean update(ProductReview bean) throws Exception {
        return productReviewDao.update(bean);
    }

    @Override
    public ProductReview select(ProductReview bean) throws Exception {
        return productReviewDao.select(bean);
    }

    @Override
    public List<ProductReview> list(int page, int count, int tableIndex) throws Exception {
        return productReviewDao.list(page, count, tableIndex);
    }

    @Override
    public long count(int tableIndex) throws Exception {
        return productReviewDao.count(tableIndex);
    }

    @Override
    public long clear(int tableIndex) throws Exception {
        return productReviewDao.clear(tableIndex);
    }

    @Override
    public ProductReview fill(ProductReview bean) {
        try {
            bean.setProduct(productRpcServer.select(new Product(bean.getProduct_id())));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }
}
