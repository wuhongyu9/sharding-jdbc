package com.why.sharding.sub.entity;

public class ProductInfo {
    private Long productInfoId;
    private Long storeInfoId;
    private String productName;
    private String spec;
    private String regionCode;
    private double price;
    private String imgUrl;

    public Long getProductInfoId() {
        return productInfoId;
    }

    public void setProductInfoId(Long productInfoId) {
        this.productInfoId = productInfoId;
    }

    public Long getStoreInfoId() {
        return storeInfoId;
    }

    public void setStoreInfoId(Long storeInfoId) {
        this.storeInfoId = storeInfoId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "productInfoId=" + productInfoId +
                ", storeInfoId=" + storeInfoId +
                ", productName='" + productName + '\'' +
                ", spec='" + spec + '\'' +
                ", regionCode='" + regionCode + '\'' +
                ", price=" + price +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }

    public ProductInfo(Long productInfoId, Long storeInfoId, String productName, String spec, String regionCode, double price, String imgUrl) {
        this.productInfoId = productInfoId;
        this.storeInfoId = storeInfoId;
        this.productName = productName;
        this.spec = spec;
        this.regionCode = regionCode;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductInfo() {}
}
