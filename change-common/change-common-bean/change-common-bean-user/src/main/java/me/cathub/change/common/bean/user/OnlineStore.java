package me.cathub.change.common.bean.user;

import java.io.Serializable;
import java.util.Date;

/**
 * 网店
 */
public class OnlineStore implements Serializable {

    /**
     * 网店类型为:ebay
     */
    public static final int TYPE_EBAY = 1;

    /**
     * 网店类型为:amazon
     */
    public static final int TYPE_AMAZON = 2;

    private long id;

    /**
     * 网店地址
     */
    private String url;
    private Date createDate;
    private Date updateDate;
    private int type;
    private int tableIndex;

    private long shopkeeper_id;

    /**
     * 所属店主
     */
    private Shopkeeper shopkeeper;

    public OnlineStore() {
    }

    public OnlineStore(long id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getShopkeeper_id() {
        return shopkeeper_id;
    }

    public void setShopkeeper_id(long shopkeeper_id) {
        this.shopkeeper_id = shopkeeper_id;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OnlineStore{");
        sb.append("id=").append(id);
        sb.append(", url='").append(url).append('\'');
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", type=").append(type);
        sb.append(", tableIndex=").append(tableIndex);
        sb.append(", shopkeeper_id=").append(shopkeeper_id);
        sb.append(", shopkeeper=").append(shopkeeper);
        sb.append('}');
        return sb.toString();
    }
}
