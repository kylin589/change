package me.cathub.change.api.dao.product;

import me.cathub.change.common.base.BaseDao;
import me.cathub.change.common.bean.product.ProductReview;

import java.util.List;

public interface ProductReviewDao extends BaseDao<ProductReview> {
    String NAME_SPACE = "ProductReview";

    String LIST_BY_PRODUCT_ID = ".listByProductId";
    String COUNT_BY_PRODUCT_ID = ".countByProductId";

    /**
     * 根据产品获取产品评论列表
     * @param product_id
     * @param page
     * @param count
     * @return
     * @throws Exception
     */
    List<ProductReview> listByProductId(long product_id, int page, int count, int tableIndex) throws Exception;

    /**
     * 根据产品获取产品评论数量
     * @param product_id
     * @return
     * @throws Exception
     */
    int countByProductId(long product_id, int tableIndex) throws Exception;
}
