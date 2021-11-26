package com.why.sharding.sub.entity;

public class ProductDesc {
    private Long id;
    private Long productInfoId;
    private String desc;
    private Long storeInfoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ProductDesc(Long id, Long productInfoId, String desc, Long storeInfoId) {
        this.id = id;
        this.productInfoId = productInfoId;
        this.desc = desc;
        this.storeInfoId = storeInfoId;
    }

    public ProductDesc() {}
}
