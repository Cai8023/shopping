package com.pojo;

import java.sql.Blob;

/**
 * @author CaiKe
 * @create 2020/10/16
 */
public class Goods {
    private int goodsId;
    private Float price;
    private String produceTime;
    private int shelfLife;
    private String name;
    private int stock;
    private int sales;
    private String code;
    private String className;
    private Blob image;
    private String shopName;

    public Goods() {
    }

    public Goods(int goodsId, Float price, String produceTime, int shelfLife, String name, int stock, int sales, String code, String className, Blob image, String shopName) {
        this.goodsId = goodsId;
        this.price = price;
        this.produceTime = produceTime;
        this.shelfLife = shelfLife;
        this.name = name;
        this.stock = stock;
        this.sales = sales;
        this.code = code;
        this.className = className;
        this.image = image;
        this.shopName = shopName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Goods{");
        sb.append("goodsId=").append(goodsId);
        sb.append(", price=").append(price);
        sb.append(", produceTime='").append(produceTime).append('\'');
        sb.append(", shelfLife=").append(shelfLife);
        sb.append(", name='").append(name).append('\'');
        sb.append(", stock=").append(stock);
        sb.append(", sales=").append(sales);
        sb.append(", code='").append(code).append('\'');
        sb.append(", className='").append(className).append('\'');
        sb.append(", image=").append(image);
        sb.append(", shopName='").append(shopName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getProduceTime() {
        return produceTime;
    }

    public void setProduceTime(String produceTime) {
        this.produceTime = produceTime;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}