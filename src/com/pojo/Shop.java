package com.pojo;

import java.sql.Blob;

/**
 * @author CaiKe
 * @create 2020/10/17
 */
public class Shop {
    private int shopId;
    private String name;
    private String userName;
    private Blob image;

    public Shop() {
    }

    public Shop(int shopId, String name, String userName, Blob image) {
        this.shopId = shopId;
        this.name = name;
        this.userName = userName;
        this.image = image;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Shop{");
        sb.append("shopId=").append(shopId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", image=").append(image);
        sb.append('}');
        return sb.toString();
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }
}