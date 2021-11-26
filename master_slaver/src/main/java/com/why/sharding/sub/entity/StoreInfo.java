package com.why.sharding.sub.entity;

public class StoreInfo {
    private Long id;
    private String storeName;
    private int reputation;
    private String regionCode;

    public StoreInfo(Long id, String storeName, int reputation, String regionCode) {
        this.id = id;
        this.storeName = storeName;
        this.reputation = reputation;
        this.regionCode = regionCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    @Override
    public String toString() {
        return "StoreInfo{" +
                "id=" + id +
                ", storeName='" + storeName + '\'' +
                ", reputation=" + reputation +
                ", regionCode='" + regionCode + '\'' +
                '}';
    }

    public StoreInfo() {}
}
