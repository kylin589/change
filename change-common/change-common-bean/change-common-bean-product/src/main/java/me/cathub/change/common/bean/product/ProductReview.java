package me.cathub.change.common.bean.product;

import me.cathub.change.common.bean.user.Shopkeeper;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品评论
 */
public class ProductReview implements Serializable {

    private long id;
    private String content;
    private Date createDate;
    private Date updateDate;
    private int tableIndex;

    private long shopkeeper_id;
    private long product_id;

    /**
     * 谁评论的?
     */
    private Shopkeeper shopkeeper;

    /**
     * 评论的哪个产品?
     */
    private Product product;

    public ProductReview() {
    }

    public ProductReview(long id) {
        this.id = id;
    }

    public long getShopkeeper_id() {
        return shopkeeper_id;
    }

    public void setShopkeeper_id(long shopkeeper_id) {
        this.shopkeeper_id = shopkeeper_id;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public int getTableIndex() {
        return tableIndex;
    }

    public void setTableIndex(int tableIndex) {
        this.tableIndex = tableIndex;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Shopkeeper getShopkeeper() {
        return shopkeeper;
    }

    public void setShopkeeper(Shopkeeper shopkeeper) {
        this.shopkeeper = shopkeeper;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductReview{");
        sb.append("id=").append(id);
        sb.append(", content='").append(content).append('\'');
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", tableIndex=").append(tableIndex);
        sb.append(", shopkeeper_id=").append(shopkeeper_id);
        sb.append(", product_id=").append(product_id);
        sb.append(", shopkeeper=").append(shopkeeper);
        sb.append(", product=").append(product);
        sb.append('}');
        return sb.toString();
    }
}
